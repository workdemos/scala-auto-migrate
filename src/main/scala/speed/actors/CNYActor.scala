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

class CNYActor() extends Actor {
  def receive = {
    case "cny" => doTransForSTKCNY()
    case _ => print(s"hun? said nothing")
  }

  var plat_balance: BigDecimal = 0.00
  var plat_balance_cash: BigDecimal = 0.00
  var plat_balance_credit: BigDecimal = 0.00

  def doTransForSTKCNY() {
    println("doTransForSTKCNY starting......")
    val cnys = MStkCny

    val db = DbHelp.initdb
    db.withSession {
      implicit session =>
        val plat_id = BalanceConstant.PLAT_USER_ID
        val balance = Balancecny.filter(_.userId === plat_id)
          .filter(_.userType === BalanceConstant.USER_PLAT)
          .sortBy(_.id.desc.nullsLast)
          .map(p => (p.balance)).firstOption
        plat_balance = balance.getOrElse(0.00)
        plat_balance_cash = plat_balance

        cnys foreach { stkcny =>
          val maker_id = stkcny.mStkCnyMMakerId
          //val now_sec = (DateTime.now.getMillis() / 1000).toInt
          val created = (stkcny.mStkCnyCreatedate.getTime() / 1000).toInt
          val fund_class: Byte = BalanceConstant.FC_XIANJING_YU_E
          val fund_from: Byte = BalanceConstant.getFundFromForCNY(stkcny.mStkCnyFlag)
          val remark = stkcny.mStkCnyTitle + " " + stkcny.mStkCnyNote

          var income=0.00
          val amount = Math.abs(stkcny.mStkCnyPrice.toDouble)
          if(fund_from == BalanceConstant.FF_POOL_CHONG_ZHI){
            income = amount
          }else if( fund_from == BalanceConstant.FF_POOL_TI_XIAN){
           income = -1 * amount 
          }
          
          val pool_id = (Fundpool returning Fundpool.map(_.id)) += FundpoolRow(0, income, amount, fund_from.toByte, fund_class.toByte, 0, "done", created, created, 0, remark, false)

          val balance = Balancecny.filter(_.userId === maker_id).filter(_.userType === BalanceConstant.USER_MAKER).sortBy(_.id.desc.nullsLast).map(p => (p.balance)).firstOption
          val last_new_balance: BigDecimal = stkcny.mStkCnyPrice + balance.getOrElse(0.00)
          val last_new_cash_balance: BigDecimal = last_new_balance
          Balancecny += BalancecnyRow(0, stkcny.mStkCnyPrice, last_new_balance, last_new_cash_balance, 0, created, maker_id, BalanceConstant.USER_MAKER, fund_from, pool_id)

          if (fund_from != BalanceConstant.FF_POOL_CHONG_ZHI && fund_from != BalanceConstant.FF_POOL_TI_XIAN) {
            plat_balance = plat_balance + -1 * stkcny.mStkCnyPrice
            plat_balance_cash = plat_balance
            Balancecny += BalancecnyRow(0, -1 * stkcny.mStkCnyPrice, plat_balance, plat_balance_cash, plat_balance_credit, created, BalanceConstant.PLAT_USER_ID, BalanceConstant.USER_PLAT, fund_from, pool_id)
          }

        }

    }
    println("doTransForSTKCNY over!")
  }

}



