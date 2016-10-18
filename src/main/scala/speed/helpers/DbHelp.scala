package speed.helpers

import speed.{ Config => SPC }
import java.sql.{ Connection, DriverManager }

import scala.slick.driver.JdbcDriver.backend.Database
import scala.slick.driver.JdbcDriver.backend.Database.dynamicSession
import scala.slick.jdbc.{ GetResult, StaticQuery => Q }

object DbHelp {
  var db: Database = _
  
  def initdb = {
    if (db == null) {
      val url = SPC.url + "?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=round"
      db = Database.forURL(url, SPC.username, SPC.password, null, SPC.mysql_jdbc_driver)
    }
    db
  }

  def getTables = scala.slick.codegen.SourceCodeGenerator.main(
    Array(SPC.slick_mysql_driver, SPC.mysql_jdbc_driver, SPC.url, "tables", "speed.entities", SPC.username, SPC.password))

  def truncateTable = {
    val t_tables = List("BalanceCny", "BalanceJpy", "FundUser", "FundPool","BalanceRate")

    Database.forURL(SPC.url, SPC.username, SPC.password, null, SPC.mysql_jdbc_driver) withDynSession {
      Q.updateNA("SET FOREIGN_KEY_CHECKS=0").execute
      t_tables.foreach { table =>
        Q.updateNA("TRUNCATE " + table).execute
      }
      Q.updateNA("SET FOREIGN_KEY_CHECKS=1").execute
    }

  }
}