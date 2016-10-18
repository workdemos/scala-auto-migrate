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

class JPYActor(user_id: Int = 0) extends Actor {
  def receive = {
    case "jpy" => doTransForSTKJPY(user_id)
    case _ => print(s"hun? said nothing")
  }

  def doTransForSTKJPY(cid: Int = 0) {
    println("doTransForSTKJPY starting......")
    val jpys = cid match {
      case x if x > 0 => MStkJpy.filter(_.mStkJpyMCustomerId === cid)
      case _ => MStkJpy
    }

    val db = DbHelp.initdb

    var plat_balance: BigDecimal = 0.00
    // var plat_balance_cash: BigDecimal = 0.00
    // var plat_balance_credit: BigDecimal = 0.00   

    db.withSession {
      implicit session =>
        val rate = MRate.sortBy(_.mRateId.desc.nullsLast).map(p => (p.mRateRate)).firstOption.get
        Balancerate += BalancerateRow(0, BalanceConstant.EXCHANGE_CNY_JPY, rate, (DateTime.now.getMillis() / 1000).toInt)

        jpys foreach { stkjpy =>
          var order_id: Int = 0
          var order_rate: BigDecimal = 0.00
          var order_num: String = ""
          val customer_id = stkjpy.mStkJpyMCustomerId

          //val now_sec = (DateTime.now.getMillis() / 1000).toInt
          val created = (stkjpy.mStkJpyCreatedate.getTime() / 1000).toInt

          val fund_class: Byte = BalanceConstant.getFundClass(stkjpy.mStkJpyNyukinType)
          val fund_from: Byte = BalanceConstant.getFundFromForJPY(stkjpy.mStkJpyFlag)

          if (stkjpy.mStkJpyRelationCode != None && stkjpy.mStkJpyRelationCode.forall(_.isDigit)) {
            order_num = stkjpy.mStkJpyRelationCode
          } else if (stkjpy.mStkJpyNote != None && stkjpy.mStkJpyNote.forall(_.isDigit)) {
            order_num = stkjpy.mStkJpyNote
          }

          val order = TJuchu.filter(_.tJuchuNumber === order_num).map(p => (p.tJuchuId, p.tJuchuRate)).firstOption

          if (order != None) {
            order_id = order.get._1
            order_rate = order.get._2
          }

          val remark = stkjpy.mStkJpyTitle + stkjpy.mStkJpyNote
          var income = 0.00
          val amount = Math.abs(stkjpy.mStkJpyPrice/(if(order_rate>0.00) order_rate else rate).toDouble)
          if (fund_from == BalanceConstant.FF_POOL_CHONG_ZHI) {
            income = amount
          } else if (fund_from == BalanceConstant.FF_POOL_TI_XIAN) {
            income = -1 * amount
          }

          val pool_id = (Fundpool returning Fundpool.map(_.id)) += FundpoolRow(0, income, amount, fund_from, fund_class, order_id, "done", created, created, 0, remark, false)

          //val created = new java.text.SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse(stkjpy.mStkJpyCreatedate.toString())

          Balancejpy += BalancejpyRow(0, pool_id, stkjpy.mStkJpyPrice, stkjpy.mStkJpyLatestBalance, created, customer_id, BalanceConstant.USER_BUYER, fund_from)

          if (fund_from != BalanceConstant.FF_POOL_CHONG_ZHI && fund_from != BalanceConstant.FF_POOL_TI_XIAN) {
            plat_balance = plat_balance + -1 * stkjpy.mStkJpyPrice
            Balancejpy += BalancejpyRow(0, pool_id, -1 * stkjpy.mStkJpyPrice, plat_balance, created, BalanceConstant.PLAT_USER_ID, BalanceConstant.USER_PLAT, fund_from)
          }
        }

    }
    println("doTransForSTKJPY over!")
  }

}



