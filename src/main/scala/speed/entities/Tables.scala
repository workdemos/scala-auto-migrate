package speed.entities
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = scala.slick.driver.MySQLDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: scala.slick.driver.JdbcProfile
  import profile.simple._
  import scala.slick.model.ForeignKeyAction
  import scala.slick.collection.heterogenous._
  import scala.slick.collection.heterogenous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import scala.slick.jdbc.{ GetResult => GR }

  /** DDL for all tables. Call .create to execute. */
  lazy val ddl = Balancecny.ddl ++ Balancejpy.ddl ++ Balancerate.ddl ++ Fundpool.ddl ++ Funduser.ddl ++ MStkCny.ddl ++ MStkJpy.ddl ++ MStkUsd.ddl ++ TJuchuPayment.ddl ++ TJuchu.ddl ++ MStkCredit.ddl ++ MRate.ddl

  
  /** Entity class storing rows of table Balancecny
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param income Database column income DBType(DECIMAL)
   *  @param balance Database column balance DBType(DECIMAL)
   *  @param balanceForCash Database column balance_for_cash DBType(DECIMAL)
   *  @param balanceForCredit Database column balance_for_credit DBType(DECIMAL)
   *  @param created Database column created DBType(INT)
   *  @param userId Database column user_id DBType(INT)
   *  @param userType Database column user_type DBType(TINYINT)
   *  @param fundFrom Database column fund_from DBType(TINYINT)
   *  @param fundPoolId Database column fund_pool_id DBType(INT) */
  case class BalancecnyRow(id: Int, income: scala.math.BigDecimal, balance: scala.math.BigDecimal, balanceForCash: scala.math.BigDecimal, balanceForCredit: scala.math.BigDecimal, created: Int, userId: Int, userType: Byte, fundFrom: Byte, fundPoolId: Int)
  /** GetResult implicit for fetching BalancecnyRow objects using plain SQL queries */
  implicit def GetResultBalancecnyRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[Byte]): GR[BalancecnyRow] = GR{
    prs => import prs._
    BalancecnyRow.tupled((<<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[Int], <<[Int], <<[Byte], <<[Byte], <<[Int]))
  }
  /** Table description of table BalanceCny. Objects of this class serve as prototypes for rows in queries. */
  class Balancecny(_tableTag: Tag) extends Table[BalancecnyRow](_tableTag, "BalanceCny") {
    def * = (id, income, balance, balanceForCash, balanceForCredit, created, userId, userType, fundFrom, fundPoolId) <> (BalancecnyRow.tupled, BalancecnyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, income.?, balance.?, balanceForCash.?, balanceForCredit.?, created.?, userId.?, userType.?, fundFrom.?, fundPoolId.?).shaped.<>({r=>import r._; _1.map(_=> BalancecnyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column income DBType(DECIMAL) */
    val income: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("income")
    /** Database column balance DBType(DECIMAL) */
    val balance: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("balance")
    /** Database column balance_for_cash DBType(DECIMAL) */
    val balanceForCash: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("balance_for_cash")
    /** Database column balance_for_credit DBType(DECIMAL) */
    val balanceForCredit: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("balance_for_credit")
    /** Database column created DBType(INT) */
    val created: Column[Int] = column[Int]("created")
    /** Database column user_id DBType(INT) */
    val userId: Column[Int] = column[Int]("user_id")
    /** Database column user_type DBType(TINYINT) */
    val userType: Column[Byte] = column[Byte]("user_type")
    /** Database column fund_from DBType(TINYINT) */
    val fundFrom: Column[Byte] = column[Byte]("fund_from")
    /** Database column fund_pool_id DBType(INT) */
    val fundPoolId: Column[Int] = column[Int]("fund_pool_id")
    
    /** Foreign key referencing Fundpool (database name FK_D8B7000797302D96) */
    lazy val fundpoolFk = foreignKey("FK_D8B7000797302D96", fundPoolId, Fundpool)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    
    /** Index over (balance) (database name balance_com) */
    val index1 = index("balance_com", balance)
  }
  /** Collection-like TableQuery object for table Balancecny */
  lazy val Balancecny = new TableQuery(tag => new Balancecny(tag))
  
  /** Entity class storing rows of table Balancejpy
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param fundPoolId Database column fund_pool_id DBType(INT)
   *  @param income Database column income DBType(DECIMAL)
   *  @param balance Database column balance DBType(DECIMAL)
   *  @param created Database column created DBType(INT)
   *  @param userId Database column user_id DBType(INT)
   *  @param userType Database column user_type DBType(TINYINT)
   *  @param fundFrom Database column fund_from DBType(TINYINT) */
  case class BalancejpyRow(id: Int, fundPoolId: Int, income: scala.math.BigDecimal, balance: scala.math.BigDecimal, created: Int, userId: Int, userType: Byte, fundFrom: Byte)
  /** GetResult implicit for fetching BalancejpyRow objects using plain SQL queries */
  implicit def GetResultBalancejpyRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[Byte]): GR[BalancejpyRow] = GR{
    prs => import prs._
    BalancejpyRow.tupled((<<[Int], <<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[Int], <<[Int], <<[Byte], <<[Byte]))
  }
  /** Table description of table BalanceJpy. Objects of this class serve as prototypes for rows in queries. */
  class Balancejpy(_tableTag: Tag) extends Table[BalancejpyRow](_tableTag, "BalanceJpy") {
    def * = (id, fundPoolId, income, balance, created, userId, userType, fundFrom) <> (BalancejpyRow.tupled, BalancejpyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, fundPoolId.?, income.?, balance.?, created.?, userId.?, userType.?, fundFrom.?).shaped.<>({r=>import r._; _1.map(_=> BalancejpyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column fund_pool_id DBType(INT) */
    val fundPoolId: Column[Int] = column[Int]("fund_pool_id")
    /** Database column income DBType(DECIMAL) */
    val income: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("income")
    /** Database column balance DBType(DECIMAL) */
    val balance: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("balance")
    /** Database column created DBType(INT) */
    val created: Column[Int] = column[Int]("created")
    /** Database column user_id DBType(INT) */
    val userId: Column[Int] = column[Int]("user_id")
    /** Database column user_type DBType(TINYINT) */
    val userType: Column[Byte] = column[Byte]("user_type")
    /** Database column fund_from DBType(TINYINT) */
    val fundFrom: Column[Byte] = column[Byte]("fund_from")
    
    /** Foreign key referencing Fundpool (database name FK_327045797302D96) */
    lazy val fundpoolFk = foreignKey("FK_327045797302D96", fundPoolId, Fundpool)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    
    /** Index over (balance) (database name balance_com) */
    val index1 = index("balance_com", balance)
  }
  /** Collection-like TableQuery object for table Balancejpy */
  lazy val Balancejpy = new TableQuery(tag => new Balancejpy(tag))

  /**
   * Entity class storing rows of table Balancerate
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param exchange Database column type DBType(TINYINT)
   *  @param rate Database column rate DBType(DECIMAL)
   *  @param created Database column created DBType(INT)
   */
  case class BalancerateRow(id: Int, exchange: Byte, rate: scala.math.BigDecimal, created: Int)
  /** GetResult implicit for fetching BalancerateRow objects using plain SQL queries */
  implicit def GetResultBalancerateRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[scala.math.BigDecimal]): GR[BalancerateRow] = GR {
    prs =>
      import prs._
      BalancerateRow.tupled((<<[Int], <<[Byte], <<[scala.math.BigDecimal], <<[Int]))
  }
  /**
   * Table description of table BalanceRate. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type
   */
  class Balancerate(_tableTag: Tag) extends Table[BalancerateRow](_tableTag, "BalanceRate") {
    def * = (id, exchange, rate, created) <> (BalancerateRow.tupled, BalancerateRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, exchange.?, rate.?, created.?).shaped.<>({ r => import r._; _1.map(_ => BalancerateRow.tupled((_1.get, _2.get, _3.get, _4.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /**
     * Database column type DBType(TINYINT)
     *  NOTE: The name was escaped because it collided with a Scala keyword.
     */
    val exchange: Column[Byte] = column[Byte]("exchange")
    /** Database column rate DBType(DECIMAL) */
    val rate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("rate")
    /** Database column created DBType(INT) */
    val created: Column[Int] = column[Int]("created")
  }
  /** Collection-like TableQuery object for table Balancerate */
  lazy val Balancerate = new TableQuery(tag => new Balancerate(tag))

  /** Entity class storing rows of table Fundpool
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param income Database column income DBType(DECIMAL)
   *  @param amount Database column amount DBType(DECIMAL)
   *  @param fundFrom Database column fund_from DBType(TINYINT)
   *  @param fundClass Database column fund_class DBType(TINYINT)
   *  @param orderId Database column order_id DBType(INT)
   *  @param status Database column status DBType(ENUM), Length(7,false)
   *  @param created Database column created DBType(INT)
   *  @param finished Database column finished DBType(INT)
   *  @param freezed Database column freezed DBType(INT)
   *  @param remark Database column remark DBType(VARCHAR), Length(250,true)
   *  @param credit Database column credit DBType(BIT) */
  case class FundpoolRow(id: Int, income: scala.math.BigDecimal, amount: scala.math.BigDecimal, fundFrom: Byte, fundClass: Byte, orderId: Int, status: String, created: Int, finished: Int, freezed: Int, remark: String, credit: Boolean)
  /** GetResult implicit for fetching FundpoolRow objects using plain SQL queries */
  implicit def GetResultFundpoolRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[Byte], e3: GR[String], e4: GR[Boolean]): GR[FundpoolRow] = GR{
    prs => import prs._
    FundpoolRow.tupled((<<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[Byte], <<[Byte], <<[Int], <<[String], <<[Int], <<[Int], <<[Int], <<[String], <<[Boolean]))
  }
  /** Table description of table FundPool. Objects of this class serve as prototypes for rows in queries. */
  class Fundpool(_tableTag: Tag) extends Table[FundpoolRow](_tableTag, "FundPool") {
    def * = (id, income, amount, fundFrom, fundClass, orderId, status, created, finished, freezed, remark, credit) <> (FundpoolRow.tupled, FundpoolRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, income.?, amount.?, fundFrom.?, fundClass.?, orderId.?, status.?, created.?, finished.?, freezed.?, remark.?, credit.?).shaped.<>({r=>import r._; _1.map(_=> FundpoolRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column income DBType(DECIMAL) */
    val income: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("income")
    /** Database column amount DBType(DECIMAL) */
    val amount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("amount")
    /** Database column fund_from DBType(TINYINT) */
    val fundFrom: Column[Byte] = column[Byte]("fund_from")
    /** Database column fund_class DBType(TINYINT) */
    val fundClass: Column[Byte] = column[Byte]("fund_class")
    /** Database column order_id DBType(INT) */
    val orderId: Column[Int] = column[Int]("order_id")
    /** Database column status DBType(ENUM), Length(7,false) */
    val status: Column[String] = column[String]("status", O.Length(7,varying=false))
    /** Database column created DBType(INT) */
    val created: Column[Int] = column[Int]("created")
    /** Database column finished DBType(INT) */
    val finished: Column[Int] = column[Int]("finished")
    /** Database column freezed DBType(INT) */
    val freezed: Column[Int] = column[Int]("freezed")
    /** Database column remark DBType(VARCHAR), Length(250,true) */
    val remark: Column[String] = column[String]("remark", O.Length(250,varying=true))
    /** Database column credit DBType(BIT) */
    val credit: Column[Boolean] = column[Boolean]("credit")
  }
  /** Collection-like TableQuery object for table Fundpool */
  lazy val Fundpool = new TableQuery(tag => new Fundpool(tag))

  /**
   * Entity class storing rows of table Funduser
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param fundPoolId Database column fund_pool_id DBType(INT)
   *  @param income Database column income DBType(DECIMAL)
   *  @param rate Database column rate DBType(DECIMAL)
   *  @param currency Database column currency DBType(TINYINT)
   *  @param uerId Database column uer_id DBType(INT)
   *  @param userType Database column user_type DBType(TINYINT)
   */
  case class FunduserRow(id: Int, fundPoolId: Int, income: scala.math.BigDecimal, rate: scala.math.BigDecimal, currency: Byte, uerId: Int, userType: Byte)
  /** GetResult implicit for fetching FunduserRow objects using plain SQL queries */
  implicit def GetResultFunduserRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[Byte]): GR[FunduserRow] = GR {
    prs =>
      import prs._
      FunduserRow.tupled((<<[Int], <<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[Byte], <<[Int], <<[Byte]))
  }
  /** Table description of table FundUser. Objects of this class serve as prototypes for rows in queries. */
  class Funduser(_tableTag: Tag) extends Table[FunduserRow](_tableTag, "FundUser") {
    def * = (id, fundPoolId, income, rate, currency, uerId, userType) <> (FunduserRow.tupled, FunduserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, fundPoolId.?, income.?, rate.?, currency.?, uerId.?, userType.?).shaped.<>({ r => import r._; _1.map(_ => FunduserRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column fund_pool_id DBType(INT) */
    val fundPoolId: Column[Int] = column[Int]("fund_pool_id")
    /** Database column income DBType(DECIMAL) */
    val income: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("income")
    /** Database column rate DBType(DECIMAL) */
    val rate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("rate")
    /** Database column currency DBType(TINYINT) */
    val currency: Column[Byte] = column[Byte]("currency")
    /** Database column uer_id DBType(INT) */
    val uerId: Column[Int] = column[Int]("uer_id")
    /** Database column user_type DBType(TINYINT) */
    val userType: Column[Byte] = column[Byte]("user_type")

    /** Foreign key referencing Fundpool (database name FK_6629F24397302D96) */
    lazy val fundpoolFk = foreignKey("FK_6629F24397302D96", fundPoolId, Fundpool)(r => r.id, onUpdate = ForeignKeyAction.NoAction, onDelete = ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Funduser */
  lazy val Funduser = new TableQuery(tag => new Funduser(tag))

  /**
   * Entity class storing rows of table MStkCny
   *  @param mStkCnyId Database column m_stk_cny_id DBType(INT), AutoInc, PrimaryKey
   *  @param mStkCnyMMakerId Database column m_stk_cny_m_maker_id DBType(INT)
   *  @param mStkCnyTitle Database column m_stk_cny_title DBType(VARCHAR), Length(100,true)
   *  @param mStkCnyNote Database column m_stk_cny_note DBType(TEXT), Length(65535,true)
   *  @param mStkCnyPrice Database column m_stk_cny_price DBType(DECIMAL)
   *  @param mStkCnyLatestBalance Database column m_stk_cny_latest_balance DBType(DECIMAL)
   *  @param mStkCnyCreatedate Database column m_stk_cny_createdate DBType(DATETIME)
   *  @param mStkCnyFlag Database column m_stk_cny_flag DBType(TINYINT UNSIGNED), Default(0)
   */
  case class MStkCnyRow(mStkCnyId: Int, mStkCnyMMakerId: Int, mStkCnyTitle: String, mStkCnyNote: String, mStkCnyPrice: scala.math.BigDecimal, mStkCnyLatestBalance: scala.math.BigDecimal, mStkCnyCreatedate: java.sql.Timestamp, mStkCnyFlag: Byte = 0)
  /** GetResult implicit for fetching MStkCnyRow objects using plain SQL queries */
  implicit def GetResultMStkCnyRow(implicit e0: GR[Int], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[java.sql.Timestamp], e4: GR[Byte]): GR[MStkCnyRow] = GR {
    prs =>
      import prs._
      MStkCnyRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[Byte]))
  }
  /** Table description of table m_stk_cny. Objects of this class serve as prototypes for rows in queries. */
  class MStkCny(_tableTag: Tag) extends Table[MStkCnyRow](_tableTag, "m_stk_cny") {
    def * = (mStkCnyId, mStkCnyMMakerId, mStkCnyTitle, mStkCnyNote, mStkCnyPrice, mStkCnyLatestBalance, mStkCnyCreatedate, mStkCnyFlag) <> (MStkCnyRow.tupled, MStkCnyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkCnyId.?, mStkCnyMMakerId.?, mStkCnyTitle.?, mStkCnyNote.?, mStkCnyPrice.?, mStkCnyLatestBalance.?, mStkCnyCreatedate.?, mStkCnyFlag.?).shaped.<>({ r => import r._; _1.map(_ => MStkCnyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column m_stk_cny_id DBType(INT), AutoInc, PrimaryKey */
    val mStkCnyId: Column[Int] = column[Int]("m_stk_cny_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_cny_m_maker_id DBType(INT) */
    val mStkCnyMMakerId: Column[Int] = column[Int]("m_stk_cny_m_maker_id")
    /** Database column m_stk_cny_title DBType(VARCHAR), Length(100,true) */
    val mStkCnyTitle: Column[String] = column[String]("m_stk_cny_title", O.Length(100, varying = true))
    /** Database column m_stk_cny_note DBType(TEXT), Length(65535,true) */
    val mStkCnyNote: Column[String] = column[String]("m_stk_cny_note", O.Length(65535, varying = true))
    /** Database column m_stk_cny_price DBType(DECIMAL) */
    val mStkCnyPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_cny_price")
    /** Database column m_stk_cny_latest_balance DBType(DECIMAL) */
    val mStkCnyLatestBalance: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_cny_latest_balance")
    /** Database column m_stk_cny_createdate DBType(DATETIME) */
    val mStkCnyCreatedate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_cny_createdate")
    /** Database column m_stk_cny_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mStkCnyFlag: Column[Byte] = column[Byte]("m_stk_cny_flag", O.Default(0))
  }
  /** Collection-like TableQuery object for table MStkCny */
  lazy val MStkCny = new TableQuery(tag => new MStkCny(tag))

  /**
   * Entity class storing rows of table MStkJpy
   *  @param mStkJpyId Database column m_stk_jpy_id DBType(INT), AutoInc, PrimaryKey
   *  @param mStkJpyMCustomerId Database column m_stk_jpy_m_customer_id DBType(INT)
   *  @param mStkJpyRelationCode Database column m_stk_jpy_relation_code DBType(VARCHAR), Length(100,true)
   *  @param mStkJpyTitle Database column m_stk_jpy_title DBType(VARCHAR), Length(100,true)
   *  @param mStkJpyNote Database column m_stk_jpy_note DBType(TEXT), Length(65535,true)
   *  @param mStkJpyPrice Database column m_stk_jpy_price DBType(INT)
   *  @param mStkJpyLatestBalance Database column m_stk_jpy_latest_balance DBType(INT)
   *  @param mStkJpyNyukinType Database column m_stk_jpy_nyukin_type DBType(Int), Default(0)
   *  @param mStkJpyCreatedate Database column m_stk_jpy_createdate DBType(DATETIME)
   *  @param mStkJpyFlag Database column m_stk_jpy_flag DBType(TINYINT UNSIGNED), Default(0)
   */
  case class MStkJpyRow(mStkJpyId: Int, mStkJpyMCustomerId: Int, mStkJpyRelationCode: String, mStkJpyTitle: String, mStkJpyNote: String, mStkJpyPrice: Int, mStkJpyLatestBalance: Int, mStkJpyNyukinType: Int = 0, mStkJpyCreatedate: java.sql.Timestamp, mStkJpyFlag: Byte = 0)
  /** GetResult implicit for fetching MStkJpyRow objects using plain SQL queries */
  implicit def GetResultMStkJpyRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Boolean], e3: GR[java.sql.Timestamp], e4: GR[Byte]): GR[MStkJpyRow] = GR {
    prs =>
      import prs._
      MStkJpyRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[Byte]))
  }
  /** Table description of table m_stk_jpy. Objects of this class serve as prototypes for rows in queries. */
  class MStkJpy(_tableTag: Tag) extends Table[MStkJpyRow](_tableTag, "m_stk_jpy") {
    def * = (mStkJpyId, mStkJpyMCustomerId, mStkJpyRelationCode, mStkJpyTitle, mStkJpyNote, mStkJpyPrice, mStkJpyLatestBalance, mStkJpyNyukinType, mStkJpyCreatedate, mStkJpyFlag) <> (MStkJpyRow.tupled, MStkJpyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkJpyId.?, mStkJpyMCustomerId.?, mStkJpyRelationCode.?, mStkJpyTitle.?, mStkJpyNote.?, mStkJpyPrice.?, mStkJpyLatestBalance.?, mStkJpyNyukinType.?, mStkJpyCreatedate.?, mStkJpyFlag.?).shaped.<>({ r => import r._; _1.map(_ => MStkJpyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column m_stk_jpy_id DBType(INT), AutoInc, PrimaryKey */
    val mStkJpyId: Column[Int] = column[Int]("m_stk_jpy_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_jpy_m_customer_id DBType(INT) */
    val mStkJpyMCustomerId: Column[Int] = column[Int]("m_stk_jpy_m_customer_id")
    /** Database column m_stk_jpy_relation_code DBType(VARCHAR), Length(100,true) */
    val mStkJpyRelationCode: Column[String] = column[String]("m_stk_jpy_relation_code", O.Length(100, varying = true))
    /** Database column m_stk_jpy_title DBType(VARCHAR), Length(100,true) */
    val mStkJpyTitle: Column[String] = column[String]("m_stk_jpy_title", O.Length(100, varying = true))
    /** Database column m_stk_jpy_note DBType(TEXT), Length(65535,true) */
    val mStkJpyNote: Column[String] = column[String]("m_stk_jpy_note", O.Length(65535, varying = true))
    /** Database column m_stk_jpy_price DBType(INT) */
    val mStkJpyPrice: Column[Int] = column[Int]("m_stk_jpy_price")
    /** Database column m_stk_jpy_latest_balance DBType(INT) */
    val mStkJpyLatestBalance: Column[Int] = column[Int]("m_stk_jpy_latest_balance")
    /** Database column m_stk_jpy_nyukin_type DBType(BIT), Default(false) */
    val mStkJpyNyukinType: Column[Int] = column[Int]("m_stk_jpy_nyukin_type", O.Default(0))
    /** Database column m_stk_jpy_createdate DBType(DATETIME) */
    val mStkJpyCreatedate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_jpy_createdate")
    /** Database column m_stk_jpy_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mStkJpyFlag: Column[Byte] = column[Byte]("m_stk_jpy_flag", O.Default(0))
  }
  /** Collection-like TableQuery object for table MStkJpy */
  lazy val MStkJpy = new TableQuery(tag => new MStkJpy(tag))

  /**
   * Entity class storing rows of table MStkUsd
   *  @param mStkUsdId Database column m_stk_usd_id DBType(INT), AutoInc, PrimaryKey
   *  @param mStkUsdMMakerId Database column m_stk_usd_m_maker_id DBType(INT)
   *  @param mStkUsdTitle Database column m_stk_usd_title DBType(VARCHAR), Length(100,true)
   *  @param mStkUsdNote Database column m_stk_usd_note DBType(TEXT), Length(65535,true)
   *  @param mStkUsdPrice Database column m_stk_usd_price DBType(DECIMAL)
   *  @param mStkUsdCprice Database column m_stk_usd_cprice DBType(DECIMAL), Default(None)
   *  @param mStkUsdLatestBalance Database column m_stk_usd_latest_balance DBType(DECIMAL)
   *  @param mStkUsdCurrency Database column m_stk_usd_currency DBType(BIT)
   *  @param mStkUsdCreatedate Database column m_stk_usd_createdate DBType(DATETIME)
   *  @param mStkUsdFlag Database column m_stk_usd_flag DBType(TINYINT UNSIGNED), Default(0)
   */
  case class MStkUsdRow(mStkUsdId: Int, mStkUsdMMakerId: Int, mStkUsdTitle: String, mStkUsdNote: String, mStkUsdPrice: scala.math.BigDecimal, mStkUsdCprice: Option[scala.math.BigDecimal] = None, mStkUsdLatestBalance: scala.math.BigDecimal, mStkUsdCurrency: Option[Boolean], mStkUsdCreatedate: java.sql.Timestamp, mStkUsdFlag: Byte = 0)
  /** GetResult implicit for fetching MStkUsdRow objects using plain SQL queries */
  implicit def GetResultMStkUsdRow(implicit e0: GR[Int], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[Option[scala.math.BigDecimal]], e4: GR[Option[Boolean]], e5: GR[java.sql.Timestamp], e6: GR[Byte]): GR[MStkUsdRow] = GR {
    prs =>
      import prs._
      MStkUsdRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<?[Boolean], <<[java.sql.Timestamp], <<[Byte]))
  }
  /** Table description of table m_stk_usd. Objects of this class serve as prototypes for rows in queries. */
  class MStkUsd(_tableTag: Tag) extends Table[MStkUsdRow](_tableTag, "m_stk_usd") {
    def * = (mStkUsdId, mStkUsdMMakerId, mStkUsdTitle, mStkUsdNote, mStkUsdPrice, mStkUsdCprice, mStkUsdLatestBalance, mStkUsdCurrency, mStkUsdCreatedate, mStkUsdFlag) <> (MStkUsdRow.tupled, MStkUsdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkUsdId.?, mStkUsdMMakerId.?, mStkUsdTitle.?, mStkUsdNote.?, mStkUsdPrice.?, mStkUsdCprice, mStkUsdLatestBalance.?, mStkUsdCurrency, mStkUsdCreatedate.?, mStkUsdFlag.?).shaped.<>({ r => import r._; _1.map(_ => MStkUsdRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8, _9.get, _10.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column m_stk_usd_id DBType(INT), AutoInc, PrimaryKey */
    val mStkUsdId: Column[Int] = column[Int]("m_stk_usd_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_usd_m_maker_id DBType(INT) */
    val mStkUsdMMakerId: Column[Int] = column[Int]("m_stk_usd_m_maker_id")
    /** Database column m_stk_usd_title DBType(VARCHAR), Length(100,true) */
    val mStkUsdTitle: Column[String] = column[String]("m_stk_usd_title", O.Length(100, varying = true))
    /** Database column m_stk_usd_note DBType(TEXT), Length(65535,true) */
    val mStkUsdNote: Column[String] = column[String]("m_stk_usd_note", O.Length(65535, varying = true))
    /** Database column m_stk_usd_price DBType(DECIMAL) */
    val mStkUsdPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_usd_price")
    /** Database column m_stk_usd_cprice DBType(DECIMAL), Default(None) */
    val mStkUsdCprice: Column[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("m_stk_usd_cprice", O.Default(None))
    /** Database column m_stk_usd_latest_balance DBType(DECIMAL) */
    val mStkUsdLatestBalance: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_usd_latest_balance")
    /** Database column m_stk_usd_currency DBType(BIT) */
    val mStkUsdCurrency: Column[Option[Boolean]] = column[Option[Boolean]]("m_stk_usd_currency")
    /** Database column m_stk_usd_createdate DBType(DATETIME) */
    val mStkUsdCreatedate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_usd_createdate")
    /** Database column m_stk_usd_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mStkUsdFlag: Column[Byte] = column[Byte]("m_stk_usd_flag", O.Default(0))
  }
  /** Collection-like TableQuery object for table MStkUsd */
  lazy val MStkUsd = new TableQuery(tag => new MStkUsd(tag))

  /**
   * Entity class storing rows of table TJuchuPayment
   *  @param tJuchuPaymentId Database column t_juchu_payment_id DBType(INT), AutoInc, PrimaryKey
   *  @param tJuchuPaymentTradingId Database column t_juchu_payment_trading_id DBType(INT), Default(0)
   *  @param tJuchuPaymentPaid Database column t_juchu_payment_paid DBType(INT), Default(0)
   *  @param tJuchuPaymentDeposit Database column t_juchu_payment_deposit DBType(INT), Default(0)
   *  @param tJuchuPaymentNoticeId Database column t_juchu_payment_notice_id DBType(INT)
   *  @param tJuchuPaymentType Database column t_juchu_payment_type DBType(INT)
   *  @param tJuchuPaymentStatus Database column t_juchu_payment_status DBType(INT)
   *  @param tJuchuPaymentResult Database column t_juchu_payment_result DBType(TEXT), Length(65535,true)
   *  @param tJuchuPaymentResult2 Database column t_juchu_payment_result2 DBType(TEXT), Length(65535,true)
   *  @param tJuchuPaymentRdatetime Database column t_juchu_payment_rdatetime DBType(DATETIME)
   *  @param tJuchuPaymentUdatetime Database column t_juchu_payment_udatetime DBType(DATETIME)
   *  @param tJuchuPaymentCode Database column t_juchu_payment_code DBType(VARCHAR), Length(225,true), Default()
   *  @param tJuchuPaymentBankResult Database column t_juchu_payment_bank_result DBType(BIT), Default(None)
   *  @param tJuchuPaymentBankResulttime Database column t_juchu_payment_bank_resulttime DBType(INT), Default(Some(0))
   *  @param tJuchuPaymentFundFreezeTime Database column t_juchu_payment_fund_freeze_time DBType(DATE)
   */
  case class TJuchuPaymentRow(tJuchuPaymentId: Int, tJuchuPaymentTradingId: Int = 0, tJuchuPaymentPaid: Int = 0, tJuchuPaymentDeposit: Int = 0, tJuchuPaymentNoticeId: Int, tJuchuPaymentType: Int, tJuchuPaymentStatus: Int, tJuchuPaymentResult: String, tJuchuPaymentResult2: String, tJuchuPaymentRdatetime: java.sql.Timestamp, tJuchuPaymentUdatetime: java.sql.Timestamp, tJuchuPaymentCode: String = "", tJuchuPaymentBankResult: Option[Boolean] = None, tJuchuPaymentBankResulttime: Option[Int] = Some(0), tJuchuPaymentFundFreezeTime: java.sql.Date)
  /** GetResult implicit for fetching TJuchuPaymentRow objects using plain SQL queries */
  implicit def GetResultTJuchuPaymentRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[Boolean]], e4: GR[Option[Int]], e5: GR[java.sql.Date]): GR[TJuchuPaymentRow] = GR {
    prs =>
      import prs._
      TJuchuPaymentRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<?[Boolean], <<?[Int], <<[java.sql.Date]))
  }
  /** Table description of table t_juchu_payment. Objects of this class serve as prototypes for rows in queries. */
  class TJuchuPayment(_tableTag: Tag) extends Table[TJuchuPaymentRow](_tableTag, "t_juchu_payment") {
    def * = (tJuchuPaymentId, tJuchuPaymentTradingId, tJuchuPaymentPaid, tJuchuPaymentDeposit, tJuchuPaymentNoticeId, tJuchuPaymentType, tJuchuPaymentStatus, tJuchuPaymentResult, tJuchuPaymentResult2, tJuchuPaymentRdatetime, tJuchuPaymentUdatetime, tJuchuPaymentCode, tJuchuPaymentBankResult, tJuchuPaymentBankResulttime, tJuchuPaymentFundFreezeTime) <> (TJuchuPaymentRow.tupled, TJuchuPaymentRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tJuchuPaymentId.?, tJuchuPaymentTradingId.?, tJuchuPaymentPaid.?, tJuchuPaymentDeposit.?, tJuchuPaymentNoticeId.?, tJuchuPaymentType.?, tJuchuPaymentStatus.?, tJuchuPaymentResult.?, tJuchuPaymentResult2.?, tJuchuPaymentRdatetime.?, tJuchuPaymentUdatetime.?, tJuchuPaymentCode.?, tJuchuPaymentBankResult, tJuchuPaymentBankResulttime, tJuchuPaymentFundFreezeTime.?).shaped.<>({ r => import r._; _1.map(_ => TJuchuPaymentRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13, _14, _15.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column t_juchu_payment_id DBType(INT), AutoInc, PrimaryKey */
    val tJuchuPaymentId: Column[Int] = column[Int]("t_juchu_payment_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_juchu_payment_trading_id DBType(INT), Default(0) */
    val tJuchuPaymentTradingId: Column[Int] = column[Int]("t_juchu_payment_trading_id", O.Default(0))
    /** Database column t_juchu_payment_paid DBType(INT), Default(0) */
    val tJuchuPaymentPaid: Column[Int] = column[Int]("t_juchu_payment_paid", O.Default(0))
    /** Database column t_juchu_payment_deposit DBType(INT), Default(0) */
    val tJuchuPaymentDeposit: Column[Int] = column[Int]("t_juchu_payment_deposit", O.Default(0))
    /** Database column t_juchu_payment_notice_id DBType(INT) */
    val tJuchuPaymentNoticeId: Column[Int] = column[Int]("t_juchu_payment_notice_id")
    /** Database column t_juchu_payment_type DBType(INT) */
    val tJuchuPaymentType: Column[Int] = column[Int]("t_juchu_payment_type")
    /** Database column t_juchu_payment_status DBType(INT) */
    val tJuchuPaymentStatus: Column[Int] = column[Int]("t_juchu_payment_status")
    /** Database column t_juchu_payment_result DBType(TEXT), Length(65535,true) */
    val tJuchuPaymentResult: Column[String] = column[String]("t_juchu_payment_result", O.Length(65535, varying = true))
    /** Database column t_juchu_payment_result2 DBType(TEXT), Length(65535,true) */
    val tJuchuPaymentResult2: Column[String] = column[String]("t_juchu_payment_result2", O.Length(65535, varying = true))
    /** Database column t_juchu_payment_rdatetime DBType(DATETIME) */
    val tJuchuPaymentRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchu_payment_rdatetime")
    /** Database column t_juchu_payment_udatetime DBType(DATETIME) */
    val tJuchuPaymentUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchu_payment_udatetime")
    /** Database column t_juchu_payment_code DBType(VARCHAR), Length(225,true), Default() */
    val tJuchuPaymentCode: Column[String] = column[String]("t_juchu_payment_code", O.Length(225, varying = true), O.Default(""))
    /** Database column t_juchu_payment_bank_result DBType(BIT), Default(None) */
    val tJuchuPaymentBankResult: Column[Option[Boolean]] = column[Option[Boolean]]("t_juchu_payment_bank_result", O.Default(None))
    /** Database column t_juchu_payment_bank_resulttime DBType(INT), Default(Some(0)) */
    val tJuchuPaymentBankResulttime: Column[Option[Int]] = column[Option[Int]]("t_juchu_payment_bank_resulttime", O.Default(Some(0)))
    /** Database column t_juchu_payment_fund_freeze_time DBType(DATE) */
    val tJuchuPaymentFundFreezeTime: Column[java.sql.Date] = column[java.sql.Date]("t_juchu_payment_fund_freeze_time")

    /** Index over (tJuchuPaymentTradingId) (database name t_juchu_payment_trading_id) */
    val index1 = index("t_juchu_payment_trading_id", tJuchuPaymentTradingId)

  }
  /** Collection-like TableQuery object for table TJuchuPayment */
  lazy val TJuchuPayment = new TableQuery(tag => new TJuchuPayment(tag))

  /** Row type of table TJuchu */
  type TJuchuRow = HCons[Int, HCons[Byte, HCons[String, HCons[java.sql.Timestamp, HCons[java.sql.Timestamp, HCons[java.sql.Timestamp, HCons[java.sql.Timestamp, HCons[java.sql.Timestamp, HCons[Int, HCons[Int, HCons[scala.math.BigDecimal, HCons[Int, HCons[Int, HCons[scala.math.BigDecimal, HCons[scala.math.BigDecimal, HCons[Option[Boolean], HCons[Int, HCons[Int, HCons[Int, HCons[scala.math.BigDecimal, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[Int, HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[Option[Int], HCons[Option[String], HCons[String, HCons[String, HCons[String, HCons[String, HCons[String, HCons[Int, HCons[Boolean, HCons[Int, HCons[String, HCons[Option[String], HCons[Int, HCons[String, HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for TJuchuRow providing default values if available in the database schema. */
  def TJuchuRow(tJuchuId: Int, tJuchuVoidFlag: Byte, tJuchuNumber: String, tJuchuDatetime: java.sql.Timestamp, tJuchuAskmailDatetime: java.sql.Timestamp, tJuchuNyukinDatetime: java.sql.Timestamp, tJuchuTJuchuitemCollectionLimit: java.sql.Timestamp, tJuchuCloseDatetime: java.sql.Timestamp, tJuchuMCustomerId: Int, tJuchuMPlanId: Int, tJuchuRate: scala.math.BigDecimal, tJuchuPrice: Int, tJuchuLatestPrice: Int, tJuchuPriceDoller: scala.math.BigDecimal, tJuchuLatestPriceDoller: scala.math.BigDecimal, tJuchuSaleCurrency: Option[Boolean], tJuchuTax: Int, tJuchuNebiki: Int, tJuchuSp: Int, tJuchuSpRate: scala.math.BigDecimal, tJuchuPoint: Int, tJuchuDeliveryCharges: Int, tJuchuBasicDeliveryCharges: Int, tJuchuLastBasicDeliveryCharges: Int, tJuchuDeliveryDiscount: Int, tJuchuDeliveryExtra: Int, tJuchuDeliveryPlanId: Int, tJuchuLatestDeliveryCharges: Int, tJuchuTotal: Int, tJuchuLatestTotal: Int, tJuchuWeightTotal: Int, tJuchuLatestWeightTotal: Int, tJuchuDeliveryCompanyName: String, tJuchuDeliveryCompanyNameEn: String = "", tJuchuDeliveryReceivedName: String = "", tJuchuDeliveryReceivedNameEn: String = "", tJuchuDeliveryZip: String = "", tJuchuDeliveryAddress: String = "", tJuchuDeliveryAddressEnPref: Option[Int] = None, tJuchuDeliveryAddressEnCity: Option[String] = None, tJuchuDeliveryAddressEn: String = "", tJuchuDeliveryTel: String = "", tJuchuDeliveryFax: String = "", tJuchuMessage: String, tJuchuNote: String, tJuchuDeliveryDateCount: Int, tJuchuStatu: Boolean = false, tJuchuMOemId: Int, tJuchuAffsrc: String = "", tJuchuShippingDatePreview: Option[String] = None, tJuchuTCouponId: Int = 0, tJuchuTCouponAmount: String = "0"): TJuchuRow = {
    tJuchuId :: tJuchuVoidFlag :: tJuchuNumber :: tJuchuDatetime :: tJuchuAskmailDatetime :: tJuchuNyukinDatetime :: tJuchuTJuchuitemCollectionLimit :: tJuchuCloseDatetime :: tJuchuMCustomerId :: tJuchuMPlanId :: tJuchuRate :: tJuchuPrice :: tJuchuLatestPrice :: tJuchuPriceDoller :: tJuchuLatestPriceDoller :: tJuchuSaleCurrency :: tJuchuTax :: tJuchuNebiki :: tJuchuSp :: tJuchuSpRate :: tJuchuPoint :: tJuchuDeliveryCharges :: tJuchuBasicDeliveryCharges :: tJuchuLastBasicDeliveryCharges :: tJuchuDeliveryDiscount :: tJuchuDeliveryExtra :: tJuchuDeliveryPlanId :: tJuchuLatestDeliveryCharges :: tJuchuTotal :: tJuchuLatestTotal :: tJuchuWeightTotal :: tJuchuLatestWeightTotal :: tJuchuDeliveryCompanyName :: tJuchuDeliveryCompanyNameEn :: tJuchuDeliveryReceivedName :: tJuchuDeliveryReceivedNameEn :: tJuchuDeliveryZip :: tJuchuDeliveryAddress :: tJuchuDeliveryAddressEnPref :: tJuchuDeliveryAddressEnCity :: tJuchuDeliveryAddressEn :: tJuchuDeliveryTel :: tJuchuDeliveryFax :: tJuchuMessage :: tJuchuNote :: tJuchuDeliveryDateCount :: tJuchuStatu :: tJuchuMOemId :: tJuchuAffsrc :: tJuchuShippingDatePreview :: tJuchuTCouponId :: tJuchuTCouponAmount :: HNil
  }
  /** GetResult implicit for fetching TJuchuRow objects using plain SQL queries */
  implicit def GetResultTJuchuRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[java.sql.Timestamp], e4: GR[scala.math.BigDecimal], e5: GR[Option[Boolean]], e6: GR[Option[Int]], e7: GR[Option[String]], e8: GR[Boolean]): GR[TJuchuRow] = GR {
    prs =>
      import prs._
      <<[Int] :: <<[Byte] :: <<[String] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[Int] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[Int] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[scala.math.BigDecimal] :: <<?[Boolean] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<?[Int] :: <<?[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Int] :: <<[Boolean] :: <<[Int] :: <<[String] :: <<?[String] :: <<[Int] :: <<[String] :: HNil
  }
  /** Table description of table t_juchu. Objects of this class serve as prototypes for rows in queries. */
  class TJuchu(_tableTag: Tag) extends Table[TJuchuRow](_tableTag, "t_juchu") {
    def * = tJuchuId :: tJuchuVoidFlag :: tJuchuNumber :: tJuchuDatetime :: tJuchuAskmailDatetime :: tJuchuNyukinDatetime :: tJuchuTJuchuitemCollectionLimit :: tJuchuCloseDatetime :: tJuchuMCustomerId :: tJuchuMPlanId :: tJuchuRate :: tJuchuPrice :: tJuchuLatestPrice :: tJuchuPriceDoller :: tJuchuLatestPriceDoller :: tJuchuSaleCurrency :: tJuchuTax :: tJuchuNebiki :: tJuchuSp :: tJuchuSpRate :: tJuchuPoint :: tJuchuDeliveryCharges :: tJuchuBasicDeliveryCharges :: tJuchuLastBasicDeliveryCharges :: tJuchuDeliveryDiscount :: tJuchuDeliveryExtra :: tJuchuDeliveryPlanId :: tJuchuLatestDeliveryCharges :: tJuchuTotal :: tJuchuLatestTotal :: tJuchuWeightTotal :: tJuchuLatestWeightTotal :: tJuchuDeliveryCompanyName :: tJuchuDeliveryCompanyNameEn :: tJuchuDeliveryReceivedName :: tJuchuDeliveryReceivedNameEn :: tJuchuDeliveryZip :: tJuchuDeliveryAddress :: tJuchuDeliveryAddressEnPref :: tJuchuDeliveryAddressEnCity :: tJuchuDeliveryAddressEn :: tJuchuDeliveryTel :: tJuchuDeliveryFax :: tJuchuMessage :: tJuchuNote :: tJuchuDeliveryDateCount :: tJuchuStatu :: tJuchuMOemId :: tJuchuAffsrc :: tJuchuShippingDatePreview :: tJuchuTCouponId :: tJuchuTCouponAmount :: HNil

    /** Database column t_juchu_id DBType(INT), AutoInc, PrimaryKey */
    val tJuchuId: Column[Int] = column[Int]("t_juchu_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_juchu_void_flag DBType(TINYINT) */
    val tJuchuVoidFlag: Column[Byte] = column[Byte]("t_juchu_void_flag")
    /** Database column t_juchu_number DBType(VARCHAR), Length(15,true) */
    val tJuchuNumber: Column[String] = column[String]("t_juchu_number", O.Length(15, varying = true))
    /** Database column t_juchu_datetime DBType(DATETIME) */
    val tJuchuDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchu_datetime")
    /** Database column t_juchu_askmail_datetime DBType(DATETIME) */
    val tJuchuAskmailDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchu_askmail_datetime")
    /** Database column t_juchu_nyukin_datetime DBType(DATETIME) */
    val tJuchuNyukinDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchu_nyukin_datetime")
    /** Database column t_juchu_t_juchuitem_collection_limit DBType(DATETIME) */
    val tJuchuTJuchuitemCollectionLimit: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchu_t_juchuitem_collection_limit")
    /** Database column t_juchu_close_datetime DBType(DATETIME) */
    val tJuchuCloseDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchu_close_datetime")
    /** Database column t_juchu_m_customer_id DBType(INT) */
    val tJuchuMCustomerId: Column[Int] = column[Int]("t_juchu_m_customer_id")
    /** Database column t_juchu_m_plan_id DBType(INT) */
    val tJuchuMPlanId: Column[Int] = column[Int]("t_juchu_m_plan_id")
    /** Database column t_juchu_rate DBType(DECIMAL) */
    val tJuchuRate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_juchu_rate")
    /** Database column t_juchu_price DBType(INT) */
    val tJuchuPrice: Column[Int] = column[Int]("t_juchu_price")
    /** Database column t_juchu_latest_price DBType(INT) */
    val tJuchuLatestPrice: Column[Int] = column[Int]("t_juchu_latest_price")
    /** Database column t_juchu_price_doller DBType(DECIMAL) */
    val tJuchuPriceDoller: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_juchu_price_doller")
    /** Database column t_juchu_latest_price_doller DBType(DECIMAL) */
    val tJuchuLatestPriceDoller: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_juchu_latest_price_doller")
    /** Database column t_juchu_sale_currency DBType(BIT) */
    val tJuchuSaleCurrency: Column[Option[Boolean]] = column[Option[Boolean]]("t_juchu_sale_currency")
    /** Database column t_juchu_tax DBType(INT) */
    val tJuchuTax: Column[Int] = column[Int]("t_juchu_tax")
    /** Database column t_juchu_nebiki DBType(INT) */
    val tJuchuNebiki: Column[Int] = column[Int]("t_juchu_nebiki")
    /** Database column t_juchu_sp DBType(INT) */
    val tJuchuSp: Column[Int] = column[Int]("t_juchu_sp")
    /** Database column t_juchu_sp_rate DBType(DECIMAL) */
    val tJuchuSpRate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_juchu_sp_rate")
    /** Database column t_juchu_point DBType(INT) */
    val tJuchuPoint: Column[Int] = column[Int]("t_juchu_point")
    /** Database column t_juchu_delivery_charges DBType(INT) */
    val tJuchuDeliveryCharges: Column[Int] = column[Int]("t_juchu_delivery_charges")
    /** Database column t_juchu_basic_delivery_charges DBType(INT) */
    val tJuchuBasicDeliveryCharges: Column[Int] = column[Int]("t_juchu_basic_delivery_charges")
    /** Database column t_juchu_last_basic_delivery_charges DBType(INT) */
    val tJuchuLastBasicDeliveryCharges: Column[Int] = column[Int]("t_juchu_last_basic_delivery_charges")
    /** Database column t_juchu_delivery_discount DBType(INT) */
    val tJuchuDeliveryDiscount: Column[Int] = column[Int]("t_juchu_delivery_discount")
    /** Database column t_juchu_delivery_extra DBType(INT) */
    val tJuchuDeliveryExtra: Column[Int] = column[Int]("t_juchu_delivery_extra")
    /** Database column t_juchu_delivery_plan_id DBType(INT) */
    val tJuchuDeliveryPlanId: Column[Int] = column[Int]("t_juchu_delivery_plan_id")
    /** Database column t_juchu_latest_delivery_charges DBType(INT) */
    val tJuchuLatestDeliveryCharges: Column[Int] = column[Int]("t_juchu_latest_delivery_charges")
    /** Database column t_juchu_total DBType(INT) */
    val tJuchuTotal: Column[Int] = column[Int]("t_juchu_total")
    /** Database column t_juchu_latest_total DBType(INT) */
    val tJuchuLatestTotal: Column[Int] = column[Int]("t_juchu_latest_total")
    /** Database column t_juchu_weight_total DBType(INT) */
    val tJuchuWeightTotal: Column[Int] = column[Int]("t_juchu_weight_total")
    /** Database column t_juchu_latest_weight_total DBType(INT) */
    val tJuchuLatestWeightTotal: Column[Int] = column[Int]("t_juchu_latest_weight_total")
    /** Database column t_juchu_delivery_company_name DBType(VARCHAR), Length(255,true) */
    val tJuchuDeliveryCompanyName: Column[String] = column[String]("t_juchu_delivery_company_name", O.Length(255, varying = true))
    /** Database column t_juchu_delivery_company_name_en DBType(VARCHAR), Length(255,true), Default() */
    val tJuchuDeliveryCompanyNameEn: Column[String] = column[String]("t_juchu_delivery_company_name_en", O.Length(255, varying = true), O.Default(""))
    /** Database column t_juchu_delivery_received_name DBType(VARCHAR), Length(255,true), Default() */
    val tJuchuDeliveryReceivedName: Column[String] = column[String]("t_juchu_delivery_received_name", O.Length(255, varying = true), O.Default(""))
    /** Database column t_juchu_delivery_received_name_en DBType(VARCHAR), Length(255,true), Default() */
    val tJuchuDeliveryReceivedNameEn: Column[String] = column[String]("t_juchu_delivery_received_name_en", O.Length(255, varying = true), O.Default(""))
    /** Database column t_juchu_delivery_zip DBType(VARCHAR), Length(20,true), Default() */
    val tJuchuDeliveryZip: Column[String] = column[String]("t_juchu_delivery_zip", O.Length(20, varying = true), O.Default(""))
    /** Database column t_juchu_delivery_address DBType(VARCHAR), Length(255,true), Default() */
    val tJuchuDeliveryAddress: Column[String] = column[String]("t_juchu_delivery_address", O.Length(255, varying = true), O.Default(""))
    /** Database column t_juchu_delivery_address_en_pref DBType(INT), Default(None) */
    val tJuchuDeliveryAddressEnPref: Column[Option[Int]] = column[Option[Int]]("t_juchu_delivery_address_en_pref", O.Default(None))
    /** Database column t_juchu_delivery_address_en_city DBType(VARCHAR), Length(200,true), Default(None) */
    val tJuchuDeliveryAddressEnCity: Column[Option[String]] = column[Option[String]]("t_juchu_delivery_address_en_city", O.Length(200, varying = true), O.Default(None))
    /** Database column t_juchu_delivery_address_en DBType(VARCHAR), Length(255,true), Default() */
    val tJuchuDeliveryAddressEn: Column[String] = column[String]("t_juchu_delivery_address_en", O.Length(255, varying = true), O.Default(""))
    /** Database column t_juchu_delivery_tel DBType(VARCHAR), Length(20,true), Default() */
    val tJuchuDeliveryTel: Column[String] = column[String]("t_juchu_delivery_tel", O.Length(20, varying = true), O.Default(""))
    /** Database column t_juchu_delivery_fax DBType(VARCHAR), Length(20,true), Default() */
    val tJuchuDeliveryFax: Column[String] = column[String]("t_juchu_delivery_fax", O.Length(20, varying = true), O.Default(""))
    /** Database column t_juchu_message DBType(TEXT), Length(65535,true) */
    val tJuchuMessage: Column[String] = column[String]("t_juchu_message", O.Length(65535, varying = true))
    /** Database column t_juchu_note DBType(TEXT), Length(65535,true) */
    val tJuchuNote: Column[String] = column[String]("t_juchu_note", O.Length(65535, varying = true))
    /** Database column t_juchu_delivery_date_count DBType(INT) */
    val tJuchuDeliveryDateCount: Column[Int] = column[Int]("t_juchu_delivery_date_count")
    /** Database column t_juchu_statu DBType(BIT), Default(false) */
    val tJuchuStatu: Column[Boolean] = column[Boolean]("t_juchu_statu", O.Default(false))
    /** Database column t_juchu_m_oem_id DBType(INT) */
    val tJuchuMOemId: Column[Int] = column[Int]("t_juchu_m_oem_id")
    /** Database column t_juchu_affsrc DBType(VARCHAR), Length(225,true), Default() */
    val tJuchuAffsrc: Column[String] = column[String]("t_juchu_affsrc", O.Length(225, varying = true), O.Default(""))
    /** Database column t_juchu_shipping_date_preview DBType(TEXT), Length(65535,true), Default(None) */
    val tJuchuShippingDatePreview: Column[Option[String]] = column[Option[String]]("t_juchu_shipping_date_preview", O.Length(65535, varying = true), O.Default(None))
    /** Database column t_juchu_t_coupon_id DBType(INT), Default(0) */
    val tJuchuTCouponId: Column[Int] = column[Int]("t_juchu_t_coupon_id", O.Default(0))
    /** Database column t_juchu_t_coupon_amount DBType(VARCHAR), Length(200,true), Default(0) */
    val tJuchuTCouponAmount: Column[String] = column[String]("t_juchu_t_coupon_amount", O.Length(200, varying = true), O.Default("0"))

    /** Index over (tJuchuMCustomerId) (database name t_juchu_m_customer_id) */
    val index1 = index("t_juchu_m_customer_id", tJuchuMCustomerId :: HNil)
    /** Index over (tJuchuStatu) (database name t_juchu_statu) */
    val index2 = index("t_juchu_statu", tJuchuStatu :: HNil)

  }
  implicit class TJuchuRowExtensions[C[_]](q: Query[TJuchu, TJuchuRow, C]) {
    // specify mapping of relationship to address
    def withPayment = q.join(TJuchuPayment).on(_.tJuchuId === _.tJuchuPaymentTradingId )
  }
  /** Collection-like TableQuery object for table TJuchu */
  lazy val TJuchu = new TableQuery(tag => new TJuchu(tag))

  /** Entity class storing rows of table MStkCredit
   *  @param mStkCreditId Database column m_stk_credit_id DBType(INT), AutoInc, PrimaryKey
   *  @param money Database column money DBType(DECIMAL)
   *  @param lastFreezed Database column last_freezed DBType(DATE)
   *  @param freezedStatus Database column freezed_status DBType(BIT), Default(true)
   *  @param makerId Database column maker_id DBType(INT)
   *  @param orderId Database column order_id DBType(INT)
   *  @param title Database column title DBType(VARCHAR), Length(50,true)
   *  @param note Database column note DBType(VARCHAR), Length(125,true)
   *  @param created Database column created DBType(DATETIME)
   *  @param finished Database column finished DBType(DATETIME)
   *  @param paymentType Database column payment_type DBType(BIT), Default(false)
   *  @param fundType Database column fund_type DBType(BIT), Default(false) */
  case class MStkCreditRow(mStkCreditId: Int, money: scala.math.BigDecimal, lastFreezed: java.sql.Date, freezedStatus: Int , makerId: Int, orderId: Int, title: String, note: String, created: java.sql.Timestamp, finished: java.sql.Timestamp, paymentType: Int = 0, fundType: Int = 0)
  /** GetResult implicit for fetching MStkCreditRow objects using plain SQL queries */
  implicit def GetResultMStkCreditRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[java.sql.Date], e3: GR[Boolean], e4: GR[String], e5: GR[java.sql.Timestamp]): GR[MStkCreditRow] = GR{
    prs => import prs._
    MStkCreditRow.tupled((<<[Int], <<[scala.math.BigDecimal], <<[java.sql.Date], <<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table m_stk_credit. Objects of this class serve as prototypes for rows in queries. */
  class MStkCredit(_tableTag: Tag) extends Table[MStkCreditRow](_tableTag, "m_stk_credit") {
    def * = (mStkCreditId, money, lastFreezed, freezedStatus, makerId, orderId, title, note, created, finished, paymentType, fundType) <> (MStkCreditRow.tupled, MStkCreditRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkCreditId.?, money.?, lastFreezed.?, freezedStatus.?, makerId.?, orderId.?, title.?, note.?, created.?, finished.?, paymentType.?, fundType.?).shaped.<>({r=>import r._; _1.map(_=> MStkCreditRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_credit_id DBType(INT), AutoInc, PrimaryKey */
    val mStkCreditId: Column[Int] = column[Int]("m_stk_credit_id", O.AutoInc, O.PrimaryKey)
    /** Database column money DBType(DECIMAL) */
    val money: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("money")
    /** Database column last_freezed DBType(DATE) */
    val lastFreezed: Column[java.sql.Date] = column[java.sql.Date]("last_freezed")
    /** Database column freezed_status DBType(BIT), Default(true) */
    val freezedStatus: Column[Int] = column[Int]("freezed_status", O.Default(0))
    /** Database column maker_id DBType(INT) */
    val makerId: Column[Int] = column[Int]("maker_id")
    /** Database column order_id DBType(INT) */
    val orderId: Column[Int] = column[Int]("order_id")
    /** Database column title DBType(VARCHAR), Length(50,true) */
    val title: Column[String] = column[String]("title", O.Length(50,varying=true))
    /** Database column note DBType(VARCHAR), Length(125,true) */
    val note: Column[String] = column[String]("note", O.Length(125,varying=true))
    /** Database column created DBType(DATETIME) */
    val created: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("created")
    /** Database column finished DBType(DATETIME) */
    val finished: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("finished")
    /** Database column payment_type DBType(BIT), Default(false) */
    val paymentType: Column[Int] = column[Int]("payment_type", O.Default(0))
    /** Database column fund_type DBType(BIT), Default(false) */
    val fundType: Column[Int] = column[Int]("fund_type", O.Default(0))
  }
  /** Collection-like TableQuery object for table MStkCredit */
  lazy val MStkCredit = new TableQuery(tag => new MStkCredit(tag))

  /** Entity class storing rows of table MRate
   *  @param mRateId Database column m_rate_id DBType(INT), AutoInc, PrimaryKey
   *  @param mRateStartdate Database column m_rate_startdate DBType(DATETIME)
   *  @param mRateEnddate Database column m_rate_enddate DBType(DATETIME)
   *  @param mRateRate Database column m_rate_rate DBType(DECIMAL)
   *  @param mRateRuser Database column m_rate_ruser DBType(INT)
   *  @param mRateUuser Database column m_rate_uuser DBType(INT)
   *  @param mRateRdatetime Database column m_rate_rdatetime DBType(DATETIME)
   *  @param mRateUdatetime Database column m_rate_udatetime DBType(DATETIME) */
  case class MRateRow(mRateId: Int, mRateStartdate: java.sql.Timestamp, mRateEnddate: java.sql.Timestamp, mRateRate: scala.math.BigDecimal, mRateRuser: Int, mRateUuser: Int, mRateRdatetime: java.sql.Timestamp, mRateUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MRateRow objects using plain SQL queries */
  implicit def GetResultMRateRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp], e2: GR[scala.math.BigDecimal]): GR[MRateRow] = GR{
    prs => import prs._
    MRateRow.tupled((<<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[scala.math.BigDecimal], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_rate. Objects of this class serve as prototypes for rows in queries. */
  class MRate(_tableTag: Tag) extends Table[MRateRow](_tableTag, "m_rate") {
    def * = (mRateId, mRateStartdate, mRateEnddate, mRateRate, mRateRuser, mRateUuser, mRateRdatetime, mRateUdatetime) <> (MRateRow.tupled, MRateRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRateId.?, mRateStartdate.?, mRateEnddate.?, mRateRate.?, mRateRuser.?, mRateUuser.?, mRateRdatetime.?, mRateUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MRateRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_rate_id DBType(INT), AutoInc, PrimaryKey */
    val mRateId: Column[Int] = column[Int]("m_rate_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_rate_startdate DBType(DATETIME) */
    val mRateStartdate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_rate_startdate")
    /** Database column m_rate_enddate DBType(DATETIME) */
    val mRateEnddate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_rate_enddate")
    /** Database column m_rate_rate DBType(DECIMAL) */
    val mRateRate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_rate_rate")
    /** Database column m_rate_ruser DBType(INT) */
    val mRateRuser: Column[Int] = column[Int]("m_rate_ruser")
    /** Database column m_rate_uuser DBType(INT) */
    val mRateUuser: Column[Int] = column[Int]("m_rate_uuser")
    /** Database column m_rate_rdatetime DBType(DATETIME) */
    val mRateRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_rate_rdatetime")
    /** Database column m_rate_udatetime DBType(DATETIME) */
    val mRateUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_rate_udatetime")
  }
  /** Collection-like TableQuery object for table MRate */
  lazy val MRate = new TableQuery(tag => new MRate(tag))
}
