package speed.trans

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import speed.helpers.BalanceConstant
import speed.helpers.DbHelp
import speed.actors._

object TransFund {
  def transAll() {
    DbHelp.truncateTable
    val system = ActorSystem("TransActor")
    val jpyactor = system.actorOf(Props(new JPYActor()), name = "jpyactor")    
    val cnyactor = system.actorOf(Props(new CNYActor()), name = "cnyactor")
    val usdactor = system.actorOf(Props(new USDAllActor(cnyactor)), name = "usdactor")
    val creditactor = system.actorOf(Props(new CreditActor()), name = "creditactor")
    
    jpyactor ! "jpy"
    usdactor ! "usd"
    creditactor ! "credit"
    //system.shutdown()
  }

  def getDataFromCustomer(cid: Int): Unit = {
    val system = ActorSystem("TransActor")
    val transJPY = system.actorOf(Props(new JPYActor(cid)), name = "TransActor")
    transJPY ! "jpy"
    system.shutdown()
  }

  def getDataFromMaker(mid: Int): Unit = {
    val system = ActorSystem("TransActor")
    val transUSD = system.actorOf(Props(new USDForMakerActor(mid)), name = "TransActor")
    transUSD ! "usd"
    system.shutdown()
  }
  


}