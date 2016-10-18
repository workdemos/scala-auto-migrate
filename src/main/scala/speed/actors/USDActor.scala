package speed.actors

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import java.sql.{ Connection, DriverManager }
import scala.slick.driver.MySQLDriver.simple._
import speed.entities.Tables._
import speed.helpers._
import com.github.nscala_time.time.Imports._
import scala.util.{ Failure, Success, Random }
import akka.actor.ActorRef

abstract class USDActor() extends Actor {

  def doTransForSTKUSD(mid: Int = 0) {
    println("doTransForSTKUSD starting......")

    val usds = mid match {
      case x if x > 0 => MStkUsd.filter(_.mStkUsdMMakerId === mid)
      case _ => MStkUsd
    }

    val db = DbHelp.initdb

    var plat_balance: BigDecimal = 0.00
    var plat_balance_cash: BigDecimal = 0.00
    var plat_balance_credit: BigDecimal = 0.00

    db.withSession {
      implicit session =>
        val num: Int = usds.size.run
        var i: Int = 0
        val s: Int = Math.abs(num / 8)
        //print("%0....")

        usds.sortBy(_.mStkUsdId.asc) foreach { stkusd =>
          var order_id: Int = 0
          var order_num: String = ""
          var is_credit: Boolean = false
          val fund_class: Byte = BalanceConstant.FC_XIANJING_YU_E
          val fund_from: Byte = BalanceConstant.getFundFromForUSD(stkusd.mStkUsdFlag)
          //val now_sec = (DateTime.now.getMillis() / 1000).toInt
          val created = (stkusd.mStkUsdCreatedate.getTime() / 1000).toInt
          var remark = stkusd.mStkUsdTitle

          if (stkusd.mStkUsdNote != None && stkusd.mStkUsdNote.forall(_.isDigit)) {
            order_num = stkusd.mStkUsdNote
          }

          val orderQuery: Query[TJuchu, TJuchuRow, Seq] = TJuchu.filter(_.tJuchuNumber === order_num)
          val paymentQuery: Query[TJuchuPayment, TJuchuPaymentRow, Seq] = orderQuery.withPayment.map(_._2)

          val order = orderQuery.map(p => (p.tJuchuId)).firstOption
          //val payment = paymentQuery.map(p => (p.tJuchuPaymentId, p.tJuchuPaymentType, p.tJuchuPaymentStatus)).firstOption

          if (order != None) {
            order_id = order.get
            // is_credit = MStkCredit.filter(_.orderId === order_id).exists.run
          }

          var income = 0.00
          val amount = Math.abs(stkusd.mStkUsdPrice.toDouble)
          if (fund_from == BalanceConstant.FF_POOL_CHONG_ZHI) {
            income = amount
          } else if (fund_from == BalanceConstant.FF_POOL_TI_XIAN) {
            income = -1 * amount
          }

          val pool_id = (Fundpool returning Fundpool.map(_.id)) += FundpoolRow(0, income, amount, fund_from, fund_class, order_id, "done", created, created, 0, remark, false)

          //last_cash_balance += (if(!is_credit)  stkusd.mStkUsdPrice else 0.00)
          //last_credit_balance += (if(is_credit) stkusd.mStkUsdPrice else 0.00)
          val last_balance: BigDecimal = stkusd.mStkUsdLatestBalance
          val last_cash_balance: BigDecimal = last_balance
          val last_credit_balance: BigDecimal = 0.00

          Balancecny += BalancecnyRow(0, stkusd.mStkUsdPrice, last_balance, last_cash_balance, last_credit_balance, created, stkusd.mStkUsdMMakerId, BalanceConstant.USER_MAKER, fund_from, pool_id)

          if (fund_from != BalanceConstant.FF_POOL_CHONG_ZHI && fund_from != BalanceConstant.FF_POOL_TI_XIAN) {
            plat_balance = plat_balance + -1 * stkusd.mStkUsdPrice
            plat_balance_cash = plat_balance
            Balancecny += BalancecnyRow(0, -1 * stkusd.mStkUsdPrice, plat_balance, plat_balance_cash, plat_balance_credit, created, BalanceConstant.PLAT_USER_ID, BalanceConstant.USER_PLAT, fund_from, pool_id)
          }

          //i += 1
          //if (i % s == 1) {
          //  val p = Math.round(i.toDouble / num.toDouble * 100.00)
          //  if (p != 0 && p != 100) printf("%d%%.....", p)
          //}
        }

    }
    //println("100%")
    println("<doTransForSTKUSD over!>")
  }

}

class USDForMakerActor(user_id: Int = 0) extends USDActor {
  def receive = {
    case "usd" => doTransForSTKUSD(user_id)
    case _ => print(s"hun? said nothing")
  }
}

class USDAllActor(cnyactor: ActorRef) extends USDActor {
  def receive = {
    case "usd" =>
      doTransForSTKUSD()
      cnyactor ! "cny"
    case _ => print(s"hun? said nothing")
  }
}