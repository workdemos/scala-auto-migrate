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

class CreditActor() extends Actor {
  def receive = {
    case "credit" => doTransForCredit()
    case _ => print(s"hun? said nothing")
  }

  def doTransForCredit() {
    println("doTransForCredit starting......")

    val db = DbHelp.initdb
    db.withSession {
      implicit session =>
        val credits = MStkCredit.filter(_.freezedStatus === 1)
        credits foreach { stkcredit =>
          val fund_class: Byte = BalanceConstant.FC_XIN_YONG_KA
          val fund_from: Byte = BalanceConstant.FF_ORDER_ALL_HKUAN
          val remark: String = stkcredit.title
          //val now_sec = (DateTime.now.getMillis() / 1000).toInt
          val created = (stkcredit.created.getTime() / 1000).toInt
          val freezed = (stkcredit.lastFreezed.getTime() /1000).toInt
          var income = 0.00
          val amount = Math.abs(stkcredit.money.toDouble)
          if (fund_from == BalanceConstant.FF_POOL_CHONG_ZHI) {
            income = amount
          } else if (fund_from == BalanceConstant.FF_POOL_TI_XIAN) {
            income = -1 * amount
          }

          val pool_id = (Fundpool returning Fundpool.map(_.id)) += FundpoolRow(0, income, amount, fund_from, fund_class, stkcredit.orderId, "doing", created, 0, freezed, remark, true)

          Funduser += FunduserRow(0, pool_id, stkcredit.money, 1, BalanceConstant.CURRENCY_CNY, stkcredit.makerId, BalanceConstant.USER_MAKER)
          //Funduser += FunduserRow(0, pool_id, -1 * Math.abs(stkcredit.money.toDouble), 1, BalanceConstant.CURRENCY_CNY, BalanceConstant.PLAT_USER_ID, BalanceConstant.USER_PLAT)
        }
    }
    println("doTransForCredit over")
  }
}



