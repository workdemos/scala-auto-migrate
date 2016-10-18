import speed.trans.TransFund
import speed.helpers.DbHelp

object MyApp extends App {
  val act = args(0)

  act match {
    case "GetTables" => DbHelp.getTables
    case "TrunkTables" => DbHelp.truncateTable
    case "TransAll" => TransFund.transAll()
    case "TransJPY" => TransFund.getDataFromCustomer(args(1).toInt)
    case "TransUSD" => TransFund.getDataFromMaker(args(1).toInt)
    case _ => throw new Exception("what are you doing")
  }

}




















