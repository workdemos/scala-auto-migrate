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
  import scala.slick.jdbc.{GetResult => GR}
  
  /** DDL for all tables. Call .create to execute. */
  lazy val ddl = Balancecny.ddl ++ Balancejpy.ddl ++ Balancerate.ddl ++ Cache.ddl ++ Feed.ddl ++ Fundpool.ddl ++ Funduser.ddl ++ MAdminGroup.ddl ++ MAnswer.ddl ++ MAnswerHistory.ddl ++ MArea.ddl ++ MAuthority.ddl ++ MBank.ddl ++ MBankBranch.ddl ++ MBillinginfo.ddl ++ MBox.ddl ++ MBringinEmail.ddl ++ MCashPassword.ddl ++ MCategory.ddl ++ MCategoryItem.ddl ++ MCategoryMakerItem.ddl ++ MColor.ddl ++ MConfig.ddl ++ MCustomer.ddl ++ MCustomerDinfo.ddl ++ MCustomerTemporary.ddl ++ MDocumentRequest.ddl ++ MEccarea.ddl ++ MEcccharge.ddl ++ MEcccompany.ddl ++ MEcccompanymeta.ddl ++ MEccmargin.ddl ++ MEccstaff.ddl ++ MEccstaffmeta.ddl ++ MGroup.ddl ++ MItem.ddl ++ MItemCh.ddl ++ MItemImg.ddl ++ MItemSearch.ddl ++ MItemSearchScore.ddl ++ MJapanRemote.ddl ++ MLdap.ddl ++ MMakeFaq.ddl ++ MMaker.ddl ++ MMakerachievement.ddl ++ MMakerLogin.ddl ++ MMakermeta.ddl ++ MMakerShopArea.ddl ++ MMakertimesale.ddl ++ MMakertimesaleItem.ddl ++ MMallsale.ddl ++ MMallsaleItem.ddl ++ MMaterial.ddl ++ MMeta.ddl ++ MMetaValue.ddl ++ MMobilelog.ddl ++ MMobileorder.ddl ++ MMsgBusiness.ddl ++ MMsgContent.ddl ++ MMsgOrder.ddl ++ MOem.ddl ++ MOpenqueue.ddl ++ MPlan.ddl ++ MPreferred.ddl ++ MPreferredImage.ddl ++ MPreferredSku.ddl ++ MPriceInterval.ddl ++ MProperty.ddl ++ MProvince.ddl ++ MQuestionnaire.ddl ++ MRakutenftp.ddl ++ MRakutenimage.ddl ++ MRakutenitem.ddl ++ MRate.ddl ++ MRefunds.ddl ++ MRefundsConfigure.ddl ++ MRefundsDetail.ddl ++ MRefundsFlow.ddl ++ MRefundsItems.ddl ++ MRefundsLogs.ddl ++ MRefundsPlan.ddl ++ MRefundsProtect.ddl ++ MRefundsReturn.ddl ++ MRegionArea.ddl ++ MRegionCity.ddl ++ MRegionProvince.ddl ++ MReminder.ddl ++ MReminderCash.ddl ++ MReminderMaker.ddl ++ MRequest.ddl ++ MSalesActivity.ddl ++ MService.ddl ++ MServicePrice.ddl ++ MShopMixSetting.ddl ++ MSku.ddl ++ MSpaceFolder.ddl ++ MSpaceImage.ddl ++ MSpActionDetail.ddl ++ MSpActionRules.ddl ++ MSpCoinIncome.ddl ++ MSpCoinPay.ddl ++ MSpec.ddl ++ MSpeedpayPassword.ddl ++ MStkCny.ddl ++ MStkCnyCopy.ddl ++ MStkCnyRefill.ddl ++ MStkCredit.ddl ++ MStkGetCny.ddl ++ MStkGetUsd.ddl ++ MStkJpy.ddl ++ MStkPayCny.ddl ++ MStkPayCnyCopy.ddl ++ MStkPayUsd.ddl ++ MStkPayUsdCopy.ddl ++ MStkUsd.ddl ++ MStkUsdCopy.ddl ++ MSubject.ddl ++ MSubjectItem.ddl ++ MUnit.ddl ++ MUnso.ddl ++ MUser.ddl ++ MVirtualaccount.ddl ++ MYubin.ddl ++ PhpSession.ddl ++ SeqFedexCode.ddl ++ SeqFtpAccount.ddl ++ SeqHurikomiAccount.ddl ++ Speedstatas.ddl ++ TAd.ddl ++ TAdImage.ddl ++ TAnnouncement.ddl ++ TApplication.ddl ++ TApplicationImg.ddl ++ TApplicationTemplate.ddl ++ TAuthority.ddl ++ TCardhistory.ddl ++ TCardpay.ddl ++ TCart.ddl ++ TCartItem.ddl ++ TCategoryCount.ddl ++ TConstant.ddl ++ TCoupon.ddl ++ TCrawlerLog.ddl ++ TCustomerBrand.ddl ++ TCustomerCheck.ddl ++ TCustomerCoupon.ddl ++ TCustomerFirstWeight.ddl ++ TCustomersession.ddl ++ TCustomerSuruzo.ddl ++ TDeliveryChargeDetail.ddl ++ TDeliveryCompany.ddl ++ TDhlXml.ddl ++ TDiscount.ddl ++ TDownload.ddl ++ TFavItem.ddl ++ TFeedbackImage.ddl ++ THolidays.ddl ++ TImage.ddl ++ TInformation.ddl ++ TInquiry.ddl ++ TItem.ddl ++ TItemCategory.ddl ++ TItemColor.ddl ++ TItemGekiyasu.ddl ++ TItemHolidays.ddl ++ TItemHscode.ddl ++ TItemMeta.ddl ++ TItemRanking.ddl ++ TItemRankingMonthly.ddl ++ TItemRecomend.ddl ++ TItemRelation.ddl ++ TItemWadai.ddl ++ TJuchu.ddl ++ TJuchuitem.ddl ++ TJuchumaker.ddl ++ TJuchuPayment.ddl ++ TLoginfail.ddl ++ TMaker.ddl ++ TMakerFeedback.ddl ++ TMakerHoliday.ddl ++ TMakerLoginHistory.ddl ++ TMakermenu.ddl ++ TMakerRecomend.ddl ++ TMediate.ddl ++ TMediateItem.ddl ++ TmpCusPerMons.ddl ++ TmpCusSumPerMoms.ddl ++ TNyukin.ddl ++ TNyukinitem.ddl ++ TOem.ddl ++ TPaygentLog.ddl ++ TPaypal.ddl ++ TPickupItem.ddl ++ TPoint.ddl ++ TPointrate.ddl ++ TPointUse.ddl ++ TrackingSessionMaker.ddl ++ TRanking.ddl ++ TRefund.ddl ++ TRefundResult.ddl ++ TReview.ddl ++ TReviewMaker.ddl ++ TSalesActivity.ddl ++ TSalesActivityItem.ddl ++ TShukka.ddl ++ TShukkaitem.ddl ++ TShukkamaker.ddl ++ TShukkin.ddl ++ TSpRate.ddl ++ TSupportAdmin.ddl ++ TSupportFilter.ddl ++ TSupportMaker.ddl ++ TTemplate.ddl ++ TTradeDetail.ddl ++ TTranslate.ddl ++ TTransportConstant.ddl ++ TTransportRemarks.ddl ++ TVisit.ddl ++ TWebChannel.ddl ++ TZaiko.ddl ++ TZaikoitem.ddl
  
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
  
  /** Entity class storing rows of table Balancerate
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param `type` Database column type DBType(TINYINT)
   *  @param rate Database column rate DBType(DECIMAL)
   *  @param created Database column created DBType(INT) */
  case class BalancerateRow(id: Int, `type`: Byte, rate: scala.math.BigDecimal, created: Int)
  /** GetResult implicit for fetching BalancerateRow objects using plain SQL queries */
  implicit def GetResultBalancerateRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[scala.math.BigDecimal]): GR[BalancerateRow] = GR{
    prs => import prs._
    BalancerateRow.tupled((<<[Int], <<[Byte], <<[scala.math.BigDecimal], <<[Int]))
  }
  /** Table description of table BalanceRate. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class Balancerate(_tableTag: Tag) extends Table[BalancerateRow](_tableTag, "BalanceRate") {
    def * = (id, `type`, rate, created) <> (BalancerateRow.tupled, BalancerateRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, `type`.?, rate.?, created.?).shaped.<>({r=>import r._; _1.map(_=> BalancerateRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column type DBType(TINYINT)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Column[Byte] = column[Byte]("type")
    /** Database column rate DBType(DECIMAL) */
    val rate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("rate")
    /** Database column created DBType(INT) */
    val created: Column[Int] = column[Int]("created")
  }
  /** Collection-like TableQuery object for table Balancerate */
  lazy val Balancerate = new TableQuery(tag => new Balancerate(tag))
  
  /** Entity class storing rows of table Cache
   *  @param cacheId Database column cache_id DBType(VARCHAR), PrimaryKey, Length(128,true)
   *  @param cacheData Database column cache_data DBType(MEDIUMBLOB)
   *  @param cacheRdatetime Database column cache_rdatetime DBType(DATETIME)
   *  @param cacheExdatetime Database column cache_exdatetime DBType(DATETIME) */
  case class CacheRow(cacheId: String, cacheData: java.sql.Blob, cacheRdatetime: java.sql.Timestamp, cacheExdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching CacheRow objects using plain SQL queries */
  implicit def GetResultCacheRow(implicit e0: GR[String], e1: GR[java.sql.Blob], e2: GR[java.sql.Timestamp]): GR[CacheRow] = GR{
    prs => import prs._
    CacheRow.tupled((<<[String], <<[java.sql.Blob], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table cache. Objects of this class serve as prototypes for rows in queries. */
  class Cache(_tableTag: Tag) extends Table[CacheRow](_tableTag, "cache") {
    def * = (cacheId, cacheData, cacheRdatetime, cacheExdatetime) <> (CacheRow.tupled, CacheRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (cacheId.?, cacheData.?, cacheRdatetime.?, cacheExdatetime.?).shaped.<>({r=>import r._; _1.map(_=> CacheRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column cache_id DBType(VARCHAR), PrimaryKey, Length(128,true) */
    val cacheId: Column[String] = column[String]("cache_id", O.PrimaryKey, O.Length(128,varying=true))
    /** Database column cache_data DBType(MEDIUMBLOB) */
    val cacheData: Column[java.sql.Blob] = column[java.sql.Blob]("cache_data")
    /** Database column cache_rdatetime DBType(DATETIME) */
    val cacheRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("cache_rdatetime")
    /** Database column cache_exdatetime DBType(DATETIME) */
    val cacheExdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("cache_exdatetime")
  }
  /** Collection-like TableQuery object for table Cache */
  lazy val Cache = new TableQuery(tag => new Cache(tag))
  
  /** Entity class storing rows of table Feed
   *  @param feedId Database column feed_id DBType(INT), AutoInc, PrimaryKey
   *  @param feedUrl Database column feed_url DBType(VARCHAR), Length(200,true)
   *  @param feedType Database column feed_type DBType(VARCHAR), Length(100,true)
   *  @param feedData Database column feed_data DBType(MEDIUMBLOB)
   *  @param feedRdatetime Database column feed_rdatetime DBType(DATETIME) */
  case class FeedRow(feedId: Int, feedUrl: String, feedType: String, feedData: java.sql.Blob, feedRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching FeedRow objects using plain SQL queries */
  implicit def GetResultFeedRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Blob], e3: GR[java.sql.Timestamp]): GR[FeedRow] = GR{
    prs => import prs._
    FeedRow.tupled((<<[Int], <<[String], <<[String], <<[java.sql.Blob], <<[java.sql.Timestamp]))
  }
  /** Table description of table feed. Objects of this class serve as prototypes for rows in queries. */
  class Feed(_tableTag: Tag) extends Table[FeedRow](_tableTag, "feed") {
    def * = (feedId, feedUrl, feedType, feedData, feedRdatetime) <> (FeedRow.tupled, FeedRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (feedId.?, feedUrl.?, feedType.?, feedData.?, feedRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> FeedRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column feed_id DBType(INT), AutoInc, PrimaryKey */
    val feedId: Column[Int] = column[Int]("feed_id", O.AutoInc, O.PrimaryKey)
    /** Database column feed_url DBType(VARCHAR), Length(200,true) */
    val feedUrl: Column[String] = column[String]("feed_url", O.Length(200,varying=true))
    /** Database column feed_type DBType(VARCHAR), Length(100,true) */
    val feedType: Column[String] = column[String]("feed_type", O.Length(100,varying=true))
    /** Database column feed_data DBType(MEDIUMBLOB) */
    val feedData: Column[java.sql.Blob] = column[java.sql.Blob]("feed_data")
    /** Database column feed_rdatetime DBType(DATETIME) */
    val feedRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("feed_rdatetime")
    
    /** Uniqueness Index over (feedUrl) (database name feed_url) */
    val index1 = index("feed_url", feedUrl, unique=true)
  }
  /** Collection-like TableQuery object for table Feed */
  lazy val Feed = new TableQuery(tag => new Feed(tag))
  
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
  
  /** Entity class storing rows of table Funduser
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param income Database column income DBType(DECIMAL)
   *  @param rate Database column rate DBType(DECIMAL)
   *  @param currency Database column currency DBType(TINYINT)
   *  @param uerId Database column uer_id DBType(INT)
   *  @param userType Database column user_type DBType(TINYINT)
   *  @param fundPoolId Database column fund_pool_id DBType(INT) */
  case class FunduserRow(id: Int, income: scala.math.BigDecimal, rate: scala.math.BigDecimal, currency: Byte, uerId: Int, userType: Byte, fundPoolId: Int)
  /** GetResult implicit for fetching FunduserRow objects using plain SQL queries */
  implicit def GetResultFunduserRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[Byte]): GR[FunduserRow] = GR{
    prs => import prs._
    FunduserRow.tupled((<<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[Byte], <<[Int], <<[Byte], <<[Int]))
  }
  /** Table description of table FundUser. Objects of this class serve as prototypes for rows in queries. */
  class Funduser(_tableTag: Tag) extends Table[FunduserRow](_tableTag, "FundUser") {
    def * = (id, income, rate, currency, uerId, userType, fundPoolId) <> (FunduserRow.tupled, FunduserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, income.?, rate.?, currency.?, uerId.?, userType.?, fundPoolId.?).shaped.<>({r=>import r._; _1.map(_=> FunduserRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
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
    /** Database column fund_pool_id DBType(INT) */
    val fundPoolId: Column[Int] = column[Int]("fund_pool_id")
    
    /** Foreign key referencing Fundpool (database name FK_6629F24397302D96) */
    lazy val fundpoolFk = foreignKey("FK_6629F24397302D96", fundPoolId, Fundpool)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Funduser */
  lazy val Funduser = new TableQuery(tag => new Funduser(tag))
  
  /** Entity class storing rows of table MAdminGroup
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param grpName Database column grp_name DBType(CHAR), Length(50,false)
   *  @param grpPriv Database column grp_priv DBType(TEXT), Length(65535,true)
   *  @param grpMod Database column grp_mod DBType(CHAR), Length(50,false)
   *  @param state Database column state DBType(INT), Default(1) */
  case class MAdminGroupRow(id: Int, grpName: String, grpPriv: String, grpMod: String, state: Int = 1)
  /** GetResult implicit for fetching MAdminGroupRow objects using plain SQL queries */
  implicit def GetResultMAdminGroupRow(implicit e0: GR[Int], e1: GR[String]): GR[MAdminGroupRow] = GR{
    prs => import prs._
    MAdminGroupRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table m_admin_group. Objects of this class serve as prototypes for rows in queries. */
  class MAdminGroup(_tableTag: Tag) extends Table[MAdminGroupRow](_tableTag, "m_admin_group") {
    def * = (id, grpName, grpPriv, grpMod, state) <> (MAdminGroupRow.tupled, MAdminGroupRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, grpName.?, grpPriv.?, grpMod.?, state.?).shaped.<>({r=>import r._; _1.map(_=> MAdminGroupRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column grp_name DBType(CHAR), Length(50,false) */
    val grpName: Column[String] = column[String]("grp_name", O.Length(50,varying=false))
    /** Database column grp_priv DBType(TEXT), Length(65535,true) */
    val grpPriv: Column[String] = column[String]("grp_priv", O.Length(65535,varying=true))
    /** Database column grp_mod DBType(CHAR), Length(50,false) */
    val grpMod: Column[String] = column[String]("grp_mod", O.Length(50,varying=false))
    /** Database column state DBType(INT), Default(1) */
    val state: Column[Int] = column[Int]("state", O.Default(1))
  }
  /** Collection-like TableQuery object for table MAdminGroup */
  lazy val MAdminGroup = new TableQuery(tag => new MAdminGroup(tag))
  
  /** Entity class storing rows of table MAnswer
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param itemId Database column item_id DBType(INT)
   *  @param selectItem Database column select_item DBType(VARCHAR), Length(2,true)
   *  @param itemInput Database column item_input DBType(VARCHAR), Length(255,true)
   *  @param userId Database column user_id DBType(INT)
   *  @param userName Database column user_name DBType(VARCHAR), Length(255,true)
   *  @param userType Database column user_type DBType(BIT)
   *  @param createTime Database column create_time DBType(INT) */
  case class MAnswerRow(id: Int, itemId: Int, selectItem: String, itemInput: String, userId: Int, userName: String, userType: Boolean, createTime: Int)
  /** GetResult implicit for fetching MAnswerRow objects using plain SQL queries */
  implicit def GetResultMAnswerRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Boolean]): GR[MAnswerRow] = GR{
    prs => import prs._
    MAnswerRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[Int], <<[String], <<[Boolean], <<[Int]))
  }
  /** Table description of table m_answer. Objects of this class serve as prototypes for rows in queries. */
  class MAnswer(_tableTag: Tag) extends Table[MAnswerRow](_tableTag, "m_answer") {
    def * = (id, itemId, selectItem, itemInput, userId, userName, userType, createTime) <> (MAnswerRow.tupled, MAnswerRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, itemId.?, selectItem.?, itemInput.?, userId.?, userName.?, userType.?, createTime.?).shaped.<>({r=>import r._; _1.map(_=> MAnswerRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column item_id DBType(INT) */
    val itemId: Column[Int] = column[Int]("item_id")
    /** Database column select_item DBType(VARCHAR), Length(2,true) */
    val selectItem: Column[String] = column[String]("select_item", O.Length(2,varying=true))
    /** Database column item_input DBType(VARCHAR), Length(255,true) */
    val itemInput: Column[String] = column[String]("item_input", O.Length(255,varying=true))
    /** Database column user_id DBType(INT) */
    val userId: Column[Int] = column[Int]("user_id")
    /** Database column user_name DBType(VARCHAR), Length(255,true) */
    val userName: Column[String] = column[String]("user_name", O.Length(255,varying=true))
    /** Database column user_type DBType(BIT) */
    val userType: Column[Boolean] = column[Boolean]("user_type")
    /** Database column create_time DBType(INT) */
    val createTime: Column[Int] = column[Int]("create_time")
  }
  /** Collection-like TableQuery object for table MAnswer */
  lazy val MAnswer = new TableQuery(tag => new MAnswer(tag))
  
  /** Entity class storing rows of table MAnswerHistory
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param questId Database column quest_id DBType(INT)
   *  @param userId Database column user_id DBType(INT)
   *  @param userName Database column user_name DBType(VARCHAR), Length(255,true)
   *  @param userType Database column user_type DBType(BIT)
   *  @param remindType Database column remind_type DBType(BIT)
   *  @param createTime Database column create_time DBType(INT) */
  case class MAnswerHistoryRow(id: Int, questId: Int, userId: Int, userName: String, userType: Boolean, remindType: Boolean, createTime: Int)
  /** GetResult implicit for fetching MAnswerHistoryRow objects using plain SQL queries */
  implicit def GetResultMAnswerHistoryRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Boolean]): GR[MAnswerHistoryRow] = GR{
    prs => import prs._
    MAnswerHistoryRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<[Boolean], <<[Boolean], <<[Int]))
  }
  /** Table description of table m_answer_history. Objects of this class serve as prototypes for rows in queries. */
  class MAnswerHistory(_tableTag: Tag) extends Table[MAnswerHistoryRow](_tableTag, "m_answer_history") {
    def * = (id, questId, userId, userName, userType, remindType, createTime) <> (MAnswerHistoryRow.tupled, MAnswerHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, questId.?, userId.?, userName.?, userType.?, remindType.?, createTime.?).shaped.<>({r=>import r._; _1.map(_=> MAnswerHistoryRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column quest_id DBType(INT) */
    val questId: Column[Int] = column[Int]("quest_id")
    /** Database column user_id DBType(INT) */
    val userId: Column[Int] = column[Int]("user_id")
    /** Database column user_name DBType(VARCHAR), Length(255,true) */
    val userName: Column[String] = column[String]("user_name", O.Length(255,varying=true))
    /** Database column user_type DBType(BIT) */
    val userType: Column[Boolean] = column[Boolean]("user_type")
    /** Database column remind_type DBType(BIT) */
    val remindType: Column[Boolean] = column[Boolean]("remind_type")
    /** Database column create_time DBType(INT) */
    val createTime: Column[Int] = column[Int]("create_time")
  }
  /** Collection-like TableQuery object for table MAnswerHistory */
  lazy val MAnswerHistory = new TableQuery(tag => new MAnswerHistory(tag))
  
  /** Entity class storing rows of table MArea
   *  @param mAreaId Database column m_area_id DBType(INT), AutoInc, PrimaryKey
   *  @param mAreaName Database column m_area_name DBType(VARCHAR), Length(20,true)
   *  @param mAreaShi Database column m_area_shi DBType(VARCHAR), Length(20,true) */
  case class MAreaRow(mAreaId: Int, mAreaName: String, mAreaShi: String)
  /** GetResult implicit for fetching MAreaRow objects using plain SQL queries */
  implicit def GetResultMAreaRow(implicit e0: GR[Int], e1: GR[String]): GR[MAreaRow] = GR{
    prs => import prs._
    MAreaRow.tupled((<<[Int], <<[String], <<[String]))
  }
  /** Table description of table m_area. Objects of this class serve as prototypes for rows in queries. */
  class MArea(_tableTag: Tag) extends Table[MAreaRow](_tableTag, "m_area") {
    def * = (mAreaId, mAreaName, mAreaShi) <> (MAreaRow.tupled, MAreaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mAreaId.?, mAreaName.?, mAreaShi.?).shaped.<>({r=>import r._; _1.map(_=> MAreaRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_area_id DBType(INT), AutoInc, PrimaryKey */
    val mAreaId: Column[Int] = column[Int]("m_area_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_area_name DBType(VARCHAR), Length(20,true) */
    val mAreaName: Column[String] = column[String]("m_area_name", O.Length(20,varying=true))
    /** Database column m_area_shi DBType(VARCHAR), Length(20,true) */
    val mAreaShi: Column[String] = column[String]("m_area_shi", O.Length(20,varying=true))
  }
  /** Collection-like TableQuery object for table MArea */
  lazy val MArea = new TableQuery(tag => new MArea(tag))
  
  /** Entity class storing rows of table MAuthority
   *  @param mAuthorityId Database column m_authority_id DBType(VARCHAR), PrimaryKey, Length(200,true)
   *  @param mAuthorityPath Database column m_authority_path DBType(VARCHAR), Length(200,true)
   *  @param mAuthorityName Database column m_authority_name DBType(VARCHAR), Length(100,true)
   *  @param mAuthorityIsDir Database column m_authority_is_dir DBType(TINYINT)
   *  @param mAuthorityIsVoid Database column m_authority_is_void DBType(TINYINT)
   *  @param mAuthorityFlagAccess Database column m_authority_flag_access DBType(TINYINT)
   *  @param mAuthorityFlagHide Database column m_authority_flag_hide DBType(TINYINT)
   *  @param mAuthorityOrder Database column m_authority_order DBType(INT)
   *  @param mAuthorityRdtime Database column m_authority_rdtime DBType(DATETIME) */
  case class MAuthorityRow(mAuthorityId: String, mAuthorityPath: String, mAuthorityName: String, mAuthorityIsDir: Byte, mAuthorityIsVoid: Byte, mAuthorityFlagAccess: Byte, mAuthorityFlagHide: Byte, mAuthorityOrder: Int, mAuthorityRdtime: java.sql.Timestamp)
  /** GetResult implicit for fetching MAuthorityRow objects using plain SQL queries */
  implicit def GetResultMAuthorityRow(implicit e0: GR[String], e1: GR[Byte], e2: GR[Int], e3: GR[java.sql.Timestamp]): GR[MAuthorityRow] = GR{
    prs => import prs._
    MAuthorityRow.tupled((<<[String], <<[String], <<[String], <<[Byte], <<[Byte], <<[Byte], <<[Byte], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_authority. Objects of this class serve as prototypes for rows in queries. */
  class MAuthority(_tableTag: Tag) extends Table[MAuthorityRow](_tableTag, "m_authority") {
    def * = (mAuthorityId, mAuthorityPath, mAuthorityName, mAuthorityIsDir, mAuthorityIsVoid, mAuthorityFlagAccess, mAuthorityFlagHide, mAuthorityOrder, mAuthorityRdtime) <> (MAuthorityRow.tupled, MAuthorityRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mAuthorityId.?, mAuthorityPath.?, mAuthorityName.?, mAuthorityIsDir.?, mAuthorityIsVoid.?, mAuthorityFlagAccess.?, mAuthorityFlagHide.?, mAuthorityOrder.?, mAuthorityRdtime.?).shaped.<>({r=>import r._; _1.map(_=> MAuthorityRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_authority_id DBType(VARCHAR), PrimaryKey, Length(200,true) */
    val mAuthorityId: Column[String] = column[String]("m_authority_id", O.PrimaryKey, O.Length(200,varying=true))
    /** Database column m_authority_path DBType(VARCHAR), Length(200,true) */
    val mAuthorityPath: Column[String] = column[String]("m_authority_path", O.Length(200,varying=true))
    /** Database column m_authority_name DBType(VARCHAR), Length(100,true) */
    val mAuthorityName: Column[String] = column[String]("m_authority_name", O.Length(100,varying=true))
    /** Database column m_authority_is_dir DBType(TINYINT) */
    val mAuthorityIsDir: Column[Byte] = column[Byte]("m_authority_is_dir")
    /** Database column m_authority_is_void DBType(TINYINT) */
    val mAuthorityIsVoid: Column[Byte] = column[Byte]("m_authority_is_void")
    /** Database column m_authority_flag_access DBType(TINYINT) */
    val mAuthorityFlagAccess: Column[Byte] = column[Byte]("m_authority_flag_access")
    /** Database column m_authority_flag_hide DBType(TINYINT) */
    val mAuthorityFlagHide: Column[Byte] = column[Byte]("m_authority_flag_hide")
    /** Database column m_authority_order DBType(INT) */
    val mAuthorityOrder: Column[Int] = column[Int]("m_authority_order")
    /** Database column m_authority_rdtime DBType(DATETIME) */
    val mAuthorityRdtime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_authority_rdtime")
  }
  /** Collection-like TableQuery object for table MAuthority */
  lazy val MAuthority = new TableQuery(tag => new MAuthority(tag))
  
  /** Entity class storing rows of table MBank
   *  @param mBankId Database column m_bank_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mBankVoidFlag Database column m_bank_void_flag DBType(TINYINT)
   *  @param mBankCode Database column m_bank_code DBType(VARCHAR), Length(4,true)
   *  @param mBankName Database column m_bank_name DBType(VARCHAR), Length(45,true)
   *  @param mBankNameKana Database column m_bank_name_kana DBType(VARCHAR), Length(45,true) */
  case class MBankRow(mBankId: Int, mBankVoidFlag: Byte, mBankCode: String, mBankName: String, mBankNameKana: String)
  /** GetResult implicit for fetching MBankRow objects using plain SQL queries */
  implicit def GetResultMBankRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String]): GR[MBankRow] = GR{
    prs => import prs._
    MBankRow.tupled((<<[Int], <<[Byte], <<[String], <<[String], <<[String]))
  }
  /** Table description of table m_bank. Objects of this class serve as prototypes for rows in queries. */
  class MBank(_tableTag: Tag) extends Table[MBankRow](_tableTag, "m_bank") {
    def * = (mBankId, mBankVoidFlag, mBankCode, mBankName, mBankNameKana) <> (MBankRow.tupled, MBankRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mBankId.?, mBankVoidFlag.?, mBankCode.?, mBankName.?, mBankNameKana.?).shaped.<>({r=>import r._; _1.map(_=> MBankRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_bank_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mBankId: Column[Int] = column[Int]("m_bank_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_bank_void_flag DBType(TINYINT) */
    val mBankVoidFlag: Column[Byte] = column[Byte]("m_bank_void_flag")
    /** Database column m_bank_code DBType(VARCHAR), Length(4,true) */
    val mBankCode: Column[String] = column[String]("m_bank_code", O.Length(4,varying=true))
    /** Database column m_bank_name DBType(VARCHAR), Length(45,true) */
    val mBankName: Column[String] = column[String]("m_bank_name", O.Length(45,varying=true))
    /** Database column m_bank_name_kana DBType(VARCHAR), Length(45,true) */
    val mBankNameKana: Column[String] = column[String]("m_bank_name_kana", O.Length(45,varying=true))
    
    /** Uniqueness Index over (mBankCode) (database name m_bank_code) */
    val index1 = index("m_bank_code", mBankCode, unique=true)
  }
  /** Collection-like TableQuery object for table MBank */
  lazy val MBank = new TableQuery(tag => new MBank(tag))
  
  /** Entity class storing rows of table MBankBranch
   *  @param mBankBranchId Database column m_bank_branch_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mBankBranchVoidFlag Database column m_bank_branch_void_flag DBType(TINYINT)
   *  @param mBankBranchMBankCode Database column m_bank_branch_m_bank_code DBType(VARCHAR), Length(4,true)
   *  @param mBankBranchCode Database column m_bank_branch_code DBType(VARCHAR), Length(3,true)
   *  @param mBankBranchName Database column m_bank_branch_name DBType(VARCHAR), Length(45,true)
   *  @param mBankBranchNameKana Database column m_bank_branch_name_kana DBType(VARCHAR), Length(45,true) */
  case class MBankBranchRow(mBankBranchId: Int, mBankBranchVoidFlag: Byte, mBankBranchMBankCode: String, mBankBranchCode: String, mBankBranchName: String, mBankBranchNameKana: String)
  /** GetResult implicit for fetching MBankBranchRow objects using plain SQL queries */
  implicit def GetResultMBankBranchRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String]): GR[MBankBranchRow] = GR{
    prs => import prs._
    MBankBranchRow.tupled((<<[Int], <<[Byte], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table m_bank_branch. Objects of this class serve as prototypes for rows in queries. */
  class MBankBranch(_tableTag: Tag) extends Table[MBankBranchRow](_tableTag, "m_bank_branch") {
    def * = (mBankBranchId, mBankBranchVoidFlag, mBankBranchMBankCode, mBankBranchCode, mBankBranchName, mBankBranchNameKana) <> (MBankBranchRow.tupled, MBankBranchRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mBankBranchId.?, mBankBranchVoidFlag.?, mBankBranchMBankCode.?, mBankBranchCode.?, mBankBranchName.?, mBankBranchNameKana.?).shaped.<>({r=>import r._; _1.map(_=> MBankBranchRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_bank_branch_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mBankBranchId: Column[Int] = column[Int]("m_bank_branch_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_bank_branch_void_flag DBType(TINYINT) */
    val mBankBranchVoidFlag: Column[Byte] = column[Byte]("m_bank_branch_void_flag")
    /** Database column m_bank_branch_m_bank_code DBType(VARCHAR), Length(4,true) */
    val mBankBranchMBankCode: Column[String] = column[String]("m_bank_branch_m_bank_code", O.Length(4,varying=true))
    /** Database column m_bank_branch_code DBType(VARCHAR), Length(3,true) */
    val mBankBranchCode: Column[String] = column[String]("m_bank_branch_code", O.Length(3,varying=true))
    /** Database column m_bank_branch_name DBType(VARCHAR), Length(45,true) */
    val mBankBranchName: Column[String] = column[String]("m_bank_branch_name", O.Length(45,varying=true))
    /** Database column m_bank_branch_name_kana DBType(VARCHAR), Length(45,true) */
    val mBankBranchNameKana: Column[String] = column[String]("m_bank_branch_name_kana", O.Length(45,varying=true))
    
    /** Uniqueness Index over (mBankBranchMBankCode,mBankBranchCode) (database name m_bank_branch_m_bank_code) */
    val index1 = index("m_bank_branch_m_bank_code", (mBankBranchMBankCode, mBankBranchCode), unique=true)
  }
  /** Collection-like TableQuery object for table MBankBranch */
  lazy val MBankBranch = new TableQuery(tag => new MBankBranch(tag))
  
  /** Entity class storing rows of table MBillinginfo
   *  @param mBillinginfoId Database column m_billinginfo_id DBType(INT), AutoInc, PrimaryKey
   *  @param mBillinginfoCny Database column m_billinginfo_cny DBType(DECIMAL)
   *  @param mBillinginfoUsd Database column m_billinginfo_usd DBType(DECIMAL)
   *  @param mBillinginfoTarget Database column m_billinginfo_target DBType(VARCHAR), Length(100,true)
   *  @param mBillinginfoType Database column m_billinginfo_type DBType(INT)
   *  @param mBillinginfoRdatetime Database column m_billinginfo_rdatetime DBType(DATETIME) */
  case class MBillinginfoRow(mBillinginfoId: Int, mBillinginfoCny: scala.math.BigDecimal, mBillinginfoUsd: scala.math.BigDecimal, mBillinginfoTarget: String, mBillinginfoType: Int, mBillinginfoRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MBillinginfoRow objects using plain SQL queries */
  implicit def GetResultMBillinginfoRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[String], e3: GR[java.sql.Timestamp]): GR[MBillinginfoRow] = GR{
    prs => import prs._
    MBillinginfoRow.tupled((<<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[String], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_billinginfo. Objects of this class serve as prototypes for rows in queries. */
  class MBillinginfo(_tableTag: Tag) extends Table[MBillinginfoRow](_tableTag, "m_billinginfo") {
    def * = (mBillinginfoId, mBillinginfoCny, mBillinginfoUsd, mBillinginfoTarget, mBillinginfoType, mBillinginfoRdatetime) <> (MBillinginfoRow.tupled, MBillinginfoRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mBillinginfoId.?, mBillinginfoCny.?, mBillinginfoUsd.?, mBillinginfoTarget.?, mBillinginfoType.?, mBillinginfoRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MBillinginfoRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_billinginfo_id DBType(INT), AutoInc, PrimaryKey */
    val mBillinginfoId: Column[Int] = column[Int]("m_billinginfo_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_billinginfo_cny DBType(DECIMAL) */
    val mBillinginfoCny: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_billinginfo_cny")
    /** Database column m_billinginfo_usd DBType(DECIMAL) */
    val mBillinginfoUsd: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_billinginfo_usd")
    /** Database column m_billinginfo_target DBType(VARCHAR), Length(100,true) */
    val mBillinginfoTarget: Column[String] = column[String]("m_billinginfo_target", O.Length(100,varying=true))
    /** Database column m_billinginfo_type DBType(INT) */
    val mBillinginfoType: Column[Int] = column[Int]("m_billinginfo_type")
    /** Database column m_billinginfo_rdatetime DBType(DATETIME) */
    val mBillinginfoRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_billinginfo_rdatetime")
  }
  /** Collection-like TableQuery object for table MBillinginfo */
  lazy val MBillinginfo = new TableQuery(tag => new MBillinginfo(tag))
  
  /** Entity class storing rows of table MBox
   *  @param mBoxId Database column m_box_id DBType(INT), AutoInc, PrimaryKey
   *  @param mBoxType Database column m_box_type DBType(VARCHAR), Length(20,true)
   *  @param mBoxDescription Database column m_box_description DBType(VARCHAR), Length(100,true)
   *  @param width Database column width DBType(INT)
   *  @param height Database column height DBType(INT)
   *  @param depth Database column depth DBType(INT)
   *  @param weight Database column weight DBType(FLOAT)
   *  @param mBoxRdatetime Database column m_box_rdatetime DBType(DATETIME)
   *  @param mBoxUdatetime Database column m_box_udatetime DBType(DATETIME)
   *  @param mBoxRuser Database column m_box_ruser DBType(INT)
   *  @param mBoxUuser Database column m_box_uuser DBType(INT) */
  case class MBoxRow(mBoxId: Int, mBoxType: String, mBoxDescription: String, width: Int, height: Int, depth: Int, weight: Float, mBoxRdatetime: java.sql.Timestamp, mBoxUdatetime: java.sql.Timestamp, mBoxRuser: Int, mBoxUuser: Int)
  /** GetResult implicit for fetching MBoxRow objects using plain SQL queries */
  implicit def GetResultMBoxRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Float], e3: GR[java.sql.Timestamp]): GR[MBoxRow] = GR{
    prs => import prs._
    MBoxRow.tupled((<<[Int], <<[String], <<[String], <<[Int], <<[Int], <<[Int], <<[Float], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table m_box. Objects of this class serve as prototypes for rows in queries. */
  class MBox(_tableTag: Tag) extends Table[MBoxRow](_tableTag, "m_box") {
    def * = (mBoxId, mBoxType, mBoxDescription, width, height, depth, weight, mBoxRdatetime, mBoxUdatetime, mBoxRuser, mBoxUuser) <> (MBoxRow.tupled, MBoxRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mBoxId.?, mBoxType.?, mBoxDescription.?, width.?, height.?, depth.?, weight.?, mBoxRdatetime.?, mBoxUdatetime.?, mBoxRuser.?, mBoxUuser.?).shaped.<>({r=>import r._; _1.map(_=> MBoxRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_box_id DBType(INT), AutoInc, PrimaryKey */
    val mBoxId: Column[Int] = column[Int]("m_box_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_box_type DBType(VARCHAR), Length(20,true) */
    val mBoxType: Column[String] = column[String]("m_box_type", O.Length(20,varying=true))
    /** Database column m_box_description DBType(VARCHAR), Length(100,true) */
    val mBoxDescription: Column[String] = column[String]("m_box_description", O.Length(100,varying=true))
    /** Database column width DBType(INT) */
    val width: Column[Int] = column[Int]("width")
    /** Database column height DBType(INT) */
    val height: Column[Int] = column[Int]("height")
    /** Database column depth DBType(INT) */
    val depth: Column[Int] = column[Int]("depth")
    /** Database column weight DBType(FLOAT) */
    val weight: Column[Float] = column[Float]("weight")
    /** Database column m_box_rdatetime DBType(DATETIME) */
    val mBoxRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_box_rdatetime")
    /** Database column m_box_udatetime DBType(DATETIME) */
    val mBoxUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_box_udatetime")
    /** Database column m_box_ruser DBType(INT) */
    val mBoxRuser: Column[Int] = column[Int]("m_box_ruser")
    /** Database column m_box_uuser DBType(INT) */
    val mBoxUuser: Column[Int] = column[Int]("m_box_uuser")
  }
  /** Collection-like TableQuery object for table MBox */
  lazy val MBox = new TableQuery(tag => new MBox(tag))
  
  /** Entity class storing rows of table MBringinEmail
   *  @param mBringinEmailId Database column m_bringin_email_id DBType(INT), AutoInc, PrimaryKey
   *  @param mBringinEmailAddress Database column m_bringin_email_address DBType(VARCHAR), Length(200,true)
   *  @param mBringinEmailMItemId Database column m_bringin_email_m_item_id DBType(INT)
   *  @param mBringinEmailRdatetime Database column m_bringin_email_rdatetime DBType(DATETIME)
   *  @param mBringinEmailRuser Database column m_bringin_email_ruser DBType(INT) */
  case class MBringinEmailRow(mBringinEmailId: Int, mBringinEmailAddress: String, mBringinEmailMItemId: Int, mBringinEmailRdatetime: java.sql.Timestamp, mBringinEmailRuser: Int)
  /** GetResult implicit for fetching MBringinEmailRow objects using plain SQL queries */
  implicit def GetResultMBringinEmailRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MBringinEmailRow] = GR{
    prs => import prs._
    MBringinEmailRow.tupled((<<[Int], <<[String], <<[Int], <<[java.sql.Timestamp], <<[Int]))
  }
  /** Table description of table m_bringin_email. Objects of this class serve as prototypes for rows in queries. */
  class MBringinEmail(_tableTag: Tag) extends Table[MBringinEmailRow](_tableTag, "m_bringin_email") {
    def * = (mBringinEmailId, mBringinEmailAddress, mBringinEmailMItemId, mBringinEmailRdatetime, mBringinEmailRuser) <> (MBringinEmailRow.tupled, MBringinEmailRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mBringinEmailId.?, mBringinEmailAddress.?, mBringinEmailMItemId.?, mBringinEmailRdatetime.?, mBringinEmailRuser.?).shaped.<>({r=>import r._; _1.map(_=> MBringinEmailRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_bringin_email_id DBType(INT), AutoInc, PrimaryKey */
    val mBringinEmailId: Column[Int] = column[Int]("m_bringin_email_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_bringin_email_address DBType(VARCHAR), Length(200,true) */
    val mBringinEmailAddress: Column[String] = column[String]("m_bringin_email_address", O.Length(200,varying=true))
    /** Database column m_bringin_email_m_item_id DBType(INT) */
    val mBringinEmailMItemId: Column[Int] = column[Int]("m_bringin_email_m_item_id")
    /** Database column m_bringin_email_rdatetime DBType(DATETIME) */
    val mBringinEmailRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_bringin_email_rdatetime")
    /** Database column m_bringin_email_ruser DBType(INT) */
    val mBringinEmailRuser: Column[Int] = column[Int]("m_bringin_email_ruser")
  }
  /** Collection-like TableQuery object for table MBringinEmail */
  lazy val MBringinEmail = new TableQuery(tag => new MBringinEmail(tag))
  
  /** Entity class storing rows of table MCashPassword
   *  @param mCashPasswordId Database column m_cash_password_id DBType(INT), AutoInc, PrimaryKey
   *  @param mCashPasswordMMakerId Database column m_cash_password_m_maker_id DBType(INT)
   *  @param mCashPassword Database column m_cash_password DBType(VARCHAR), Length(100,true)
   *  @param mCashPasswordSalt Database column m_cash_password_salt DBType(CHAR), Length(15,false), Default()
   *  @param mCashPasswordDatetime Database column m_cash_password_datetime DBType(DATETIME) */
  case class MCashPasswordRow(mCashPasswordId: Int, mCashPasswordMMakerId: Int, mCashPassword: String, mCashPasswordSalt: String = "", mCashPasswordDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MCashPasswordRow objects using plain SQL queries */
  implicit def GetResultMCashPasswordRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MCashPasswordRow] = GR{
    prs => import prs._
    MCashPasswordRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_cash_password. Objects of this class serve as prototypes for rows in queries. */
  class MCashPassword(_tableTag: Tag) extends Table[MCashPasswordRow](_tableTag, "m_cash_password") {
    def * = (mCashPasswordId, mCashPasswordMMakerId, mCashPassword, mCashPasswordSalt, mCashPasswordDatetime) <> (MCashPasswordRow.tupled, MCashPasswordRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mCashPasswordId.?, mCashPasswordMMakerId.?, mCashPassword.?, mCashPasswordSalt.?, mCashPasswordDatetime.?).shaped.<>({r=>import r._; _1.map(_=> MCashPasswordRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_cash_password_id DBType(INT), AutoInc, PrimaryKey */
    val mCashPasswordId: Column[Int] = column[Int]("m_cash_password_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_cash_password_m_maker_id DBType(INT) */
    val mCashPasswordMMakerId: Column[Int] = column[Int]("m_cash_password_m_maker_id")
    /** Database column m_cash_password DBType(VARCHAR), Length(100,true) */
    val mCashPassword: Column[String] = column[String]("m_cash_password", O.Length(100,varying=true))
    /** Database column m_cash_password_salt DBType(CHAR), Length(15,false), Default() */
    val mCashPasswordSalt: Column[String] = column[String]("m_cash_password_salt", O.Length(15,varying=false), O.Default(""))
    /** Database column m_cash_password_datetime DBType(DATETIME) */
    val mCashPasswordDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_cash_password_datetime")
  }
  /** Collection-like TableQuery object for table MCashPassword */
  lazy val MCashPassword = new TableQuery(tag => new MCashPassword(tag))
  
  /** Entity class storing rows of table MCategory
   *  @param mCategoryId Database column m_category_id DBType(INT), AutoInc, PrimaryKey
   *  @param mCategoryVoidFlag Database column m_category_void_flag DBType(INT)
   *  @param mCategoryPath Database column m_category_path DBType(VARCHAR), Length(100,true)
   *  @param mCategoryName Database column m_category_name DBType(VARCHAR), Length(50,true)
   *  @param mCategoryNameCh Database column m_category_name_ch DBType(VARCHAR), Length(50,true)
   *  @param mCategoryNameEn Database column m_category_name_en DBType(VARCHAR), Length(50,true)
   *  @param mCategoryMItemTypeId Database column m_category_m_item_type_id DBType(INT)
   *  @param mCategoryOrder Database column m_category_order DBType(INT)
   *  @param mCategoryRuser Database column m_category_ruser DBType(INT)
   *  @param mCategoryRdatetime Database column m_category_rdatetime DBType(DATETIME)
   *  @param mCategoryUuser Database column m_category_uuser DBType(INT)
   *  @param mCategoryUdatetime Database column m_category_udatetime DBType(DATETIME) */
  case class MCategoryRow(mCategoryId: Int, mCategoryVoidFlag: Int, mCategoryPath: String, mCategoryName: String, mCategoryNameCh: String, mCategoryNameEn: String, mCategoryMItemTypeId: Int, mCategoryOrder: Int, mCategoryRuser: Int, mCategoryRdatetime: java.sql.Timestamp, mCategoryUuser: Int, mCategoryUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MCategoryRow objects using plain SQL queries */
  implicit def GetResultMCategoryRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MCategoryRow] = GR{
    prs => import prs._
    MCategoryRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_category. Objects of this class serve as prototypes for rows in queries. */
  class MCategory(_tableTag: Tag) extends Table[MCategoryRow](_tableTag, "m_category") {
    def * = (mCategoryId, mCategoryVoidFlag, mCategoryPath, mCategoryName, mCategoryNameCh, mCategoryNameEn, mCategoryMItemTypeId, mCategoryOrder, mCategoryRuser, mCategoryRdatetime, mCategoryUuser, mCategoryUdatetime) <> (MCategoryRow.tupled, MCategoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mCategoryId.?, mCategoryVoidFlag.?, mCategoryPath.?, mCategoryName.?, mCategoryNameCh.?, mCategoryNameEn.?, mCategoryMItemTypeId.?, mCategoryOrder.?, mCategoryRuser.?, mCategoryRdatetime.?, mCategoryUuser.?, mCategoryUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MCategoryRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_category_id DBType(INT), AutoInc, PrimaryKey */
    val mCategoryId: Column[Int] = column[Int]("m_category_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_category_void_flag DBType(INT) */
    val mCategoryVoidFlag: Column[Int] = column[Int]("m_category_void_flag")
    /** Database column m_category_path DBType(VARCHAR), Length(100,true) */
    val mCategoryPath: Column[String] = column[String]("m_category_path", O.Length(100,varying=true))
    /** Database column m_category_name DBType(VARCHAR), Length(50,true) */
    val mCategoryName: Column[String] = column[String]("m_category_name", O.Length(50,varying=true))
    /** Database column m_category_name_ch DBType(VARCHAR), Length(50,true) */
    val mCategoryNameCh: Column[String] = column[String]("m_category_name_ch", O.Length(50,varying=true))
    /** Database column m_category_name_en DBType(VARCHAR), Length(50,true) */
    val mCategoryNameEn: Column[String] = column[String]("m_category_name_en", O.Length(50,varying=true))
    /** Database column m_category_m_item_type_id DBType(INT) */
    val mCategoryMItemTypeId: Column[Int] = column[Int]("m_category_m_item_type_id")
    /** Database column m_category_order DBType(INT) */
    val mCategoryOrder: Column[Int] = column[Int]("m_category_order")
    /** Database column m_category_ruser DBType(INT) */
    val mCategoryRuser: Column[Int] = column[Int]("m_category_ruser")
    /** Database column m_category_rdatetime DBType(DATETIME) */
    val mCategoryRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_category_rdatetime")
    /** Database column m_category_uuser DBType(INT) */
    val mCategoryUuser: Column[Int] = column[Int]("m_category_uuser")
    /** Database column m_category_udatetime DBType(DATETIME) */
    val mCategoryUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_category_udatetime")
  }
  /** Collection-like TableQuery object for table MCategory */
  lazy val MCategory = new TableQuery(tag => new MCategory(tag))
  
  /** Entity class storing rows of table MCategoryItem
   *  @param mCategoryItemId Database column m_category_item_id DBType(INT), AutoInc, PrimaryKey
   *  @param mCategoryItemVoidFlag Database column m_category_item_void_flag DBType(INT), Default(0)
   *  @param mCategoryItemPath Database column m_category_item_path DBType(VARCHAR), Length(20,true)
   *  @param mCategoryItemPathSeed Database column m_category_item_path_seed DBType(VARCHAR), Length(255,true)
   *  @param mCategoryItemName Database column m_category_item_name DBType(VARCHAR), Length(50,true)
   *  @param mCategoryItemNameJp Database column m_category_item_name_jp DBType(VARCHAR), Length(50,true) */
  case class MCategoryItemRow(mCategoryItemId: Int, mCategoryItemVoidFlag: Int = 0, mCategoryItemPath: String, mCategoryItemPathSeed: String, mCategoryItemName: String, mCategoryItemNameJp: String)
  /** GetResult implicit for fetching MCategoryItemRow objects using plain SQL queries */
  implicit def GetResultMCategoryItemRow(implicit e0: GR[Int], e1: GR[String]): GR[MCategoryItemRow] = GR{
    prs => import prs._
    MCategoryItemRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table m_category_item. Objects of this class serve as prototypes for rows in queries. */
  class MCategoryItem(_tableTag: Tag) extends Table[MCategoryItemRow](_tableTag, "m_category_item") {
    def * = (mCategoryItemId, mCategoryItemVoidFlag, mCategoryItemPath, mCategoryItemPathSeed, mCategoryItemName, mCategoryItemNameJp) <> (MCategoryItemRow.tupled, MCategoryItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mCategoryItemId.?, mCategoryItemVoidFlag.?, mCategoryItemPath.?, mCategoryItemPathSeed.?, mCategoryItemName.?, mCategoryItemNameJp.?).shaped.<>({r=>import r._; _1.map(_=> MCategoryItemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_category_item_id DBType(INT), AutoInc, PrimaryKey */
    val mCategoryItemId: Column[Int] = column[Int]("m_category_item_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_category_item_void_flag DBType(INT), Default(0) */
    val mCategoryItemVoidFlag: Column[Int] = column[Int]("m_category_item_void_flag", O.Default(0))
    /** Database column m_category_item_path DBType(VARCHAR), Length(20,true) */
    val mCategoryItemPath: Column[String] = column[String]("m_category_item_path", O.Length(20,varying=true))
    /** Database column m_category_item_path_seed DBType(VARCHAR), Length(255,true) */
    val mCategoryItemPathSeed: Column[String] = column[String]("m_category_item_path_seed", O.Length(255,varying=true))
    /** Database column m_category_item_name DBType(VARCHAR), Length(50,true) */
    val mCategoryItemName: Column[String] = column[String]("m_category_item_name", O.Length(50,varying=true))
    /** Database column m_category_item_name_jp DBType(VARCHAR), Length(50,true) */
    val mCategoryItemNameJp: Column[String] = column[String]("m_category_item_name_jp", O.Length(50,varying=true))
  }
  /** Collection-like TableQuery object for table MCategoryItem */
  lazy val MCategoryItem = new TableQuery(tag => new MCategoryItem(tag))
  
  /** Entity class storing rows of table MCategoryMakerItem
   *  @param mCategoryMakerItemId Database column m_category_maker_item_id DBType(INT), AutoInc, PrimaryKey
   *  @param mCategoryMakerItemVoidFlag Database column m_category_maker_item_void_flag DBType(INT), Default(0)
   *  @param mCategoryMakerItemMakerId Database column m_category_maker_item_maker_id DBType(INT)
   *  @param mCategoryMakerItemPath Database column m_category_maker_item_path DBType(TEXT), Length(65535,true) */
  case class MCategoryMakerItemRow(mCategoryMakerItemId: Int, mCategoryMakerItemVoidFlag: Int = 0, mCategoryMakerItemMakerId: Int, mCategoryMakerItemPath: String)
  /** GetResult implicit for fetching MCategoryMakerItemRow objects using plain SQL queries */
  implicit def GetResultMCategoryMakerItemRow(implicit e0: GR[Int], e1: GR[String]): GR[MCategoryMakerItemRow] = GR{
    prs => import prs._
    MCategoryMakerItemRow.tupled((<<[Int], <<[Int], <<[Int], <<[String]))
  }
  /** Table description of table m_category_maker_item. Objects of this class serve as prototypes for rows in queries. */
  class MCategoryMakerItem(_tableTag: Tag) extends Table[MCategoryMakerItemRow](_tableTag, "m_category_maker_item") {
    def * = (mCategoryMakerItemId, mCategoryMakerItemVoidFlag, mCategoryMakerItemMakerId, mCategoryMakerItemPath) <> (MCategoryMakerItemRow.tupled, MCategoryMakerItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mCategoryMakerItemId.?, mCategoryMakerItemVoidFlag.?, mCategoryMakerItemMakerId.?, mCategoryMakerItemPath.?).shaped.<>({r=>import r._; _1.map(_=> MCategoryMakerItemRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_category_maker_item_id DBType(INT), AutoInc, PrimaryKey */
    val mCategoryMakerItemId: Column[Int] = column[Int]("m_category_maker_item_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_category_maker_item_void_flag DBType(INT), Default(0) */
    val mCategoryMakerItemVoidFlag: Column[Int] = column[Int]("m_category_maker_item_void_flag", O.Default(0))
    /** Database column m_category_maker_item_maker_id DBType(INT) */
    val mCategoryMakerItemMakerId: Column[Int] = column[Int]("m_category_maker_item_maker_id")
    /** Database column m_category_maker_item_path DBType(TEXT), Length(65535,true) */
    val mCategoryMakerItemPath: Column[String] = column[String]("m_category_maker_item_path", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table MCategoryMakerItem */
  lazy val MCategoryMakerItem = new TableQuery(tag => new MCategoryMakerItem(tag))
  
  /** Entity class storing rows of table MColor
   *  @param mColorId Database column m_color_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mColorMItemId Database column m_color_m_item_id DBType(INT UNSIGNED), Default(0)
   *  @param mColorName Database column m_color_name DBType(VARCHAR), Length(20,true)
   *  @param mColorPicture Database column m_color_picture DBType(VARCHAR), Length(200,true)
   *  @param mColorImageId Database column m_color_image_id DBType(INT) */
  case class MColorRow(mColorId: Int, mColorMItemId: Int = 0, mColorName: String, mColorPicture: String, mColorImageId: Int)
  /** GetResult implicit for fetching MColorRow objects using plain SQL queries */
  implicit def GetResultMColorRow(implicit e0: GR[Int], e1: GR[String]): GR[MColorRow] = GR{
    prs => import prs._
    MColorRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table m_color. Objects of this class serve as prototypes for rows in queries. */
  class MColor(_tableTag: Tag) extends Table[MColorRow](_tableTag, "m_color") {
    def * = (mColorId, mColorMItemId, mColorName, mColorPicture, mColorImageId) <> (MColorRow.tupled, MColorRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mColorId.?, mColorMItemId.?, mColorName.?, mColorPicture.?, mColorImageId.?).shaped.<>({r=>import r._; _1.map(_=> MColorRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_color_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mColorId: Column[Int] = column[Int]("m_color_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_color_m_item_id DBType(INT UNSIGNED), Default(0) */
    val mColorMItemId: Column[Int] = column[Int]("m_color_m_item_id", O.Default(0))
    /** Database column m_color_name DBType(VARCHAR), Length(20,true) */
    val mColorName: Column[String] = column[String]("m_color_name", O.Length(20,varying=true))
    /** Database column m_color_picture DBType(VARCHAR), Length(200,true) */
    val mColorPicture: Column[String] = column[String]("m_color_picture", O.Length(200,varying=true))
    /** Database column m_color_image_id DBType(INT) */
    val mColorImageId: Column[Int] = column[Int]("m_color_image_id")
  }
  /** Collection-like TableQuery object for table MColor */
  lazy val MColor = new TableQuery(tag => new MColor(tag))
  
  /** Entity class storing rows of table MConfig
   *  @param mConfigId Database column m_config_id DBType(VARCHAR), PrimaryKey, Length(50,true)
   *  @param mConfigValue Database column m_config_value DBType(VARCHAR), Length(200,true)
   *  @param mConfigRdatetime Database column m_config_rdatetime DBType(DATETIME)
   *  @param mConfigUdatetime Database column m_config_udatetime DBType(DATETIME)
   *  @param mConfigRuser Database column m_config_ruser DBType(INT)
   *  @param mConfigUuser Database column m_config_uuser DBType(INT) */
  case class MConfigRow(mConfigId: String, mConfigValue: String, mConfigRdatetime: java.sql.Timestamp, mConfigUdatetime: java.sql.Timestamp, mConfigRuser: Int, mConfigUuser: Int)
  /** GetResult implicit for fetching MConfigRow objects using plain SQL queries */
  implicit def GetResultMConfigRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp], e2: GR[Int]): GR[MConfigRow] = GR{
    prs => import prs._
    MConfigRow.tupled((<<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table m_config. Objects of this class serve as prototypes for rows in queries. */
  class MConfig(_tableTag: Tag) extends Table[MConfigRow](_tableTag, "m_config") {
    def * = (mConfigId, mConfigValue, mConfigRdatetime, mConfigUdatetime, mConfigRuser, mConfigUuser) <> (MConfigRow.tupled, MConfigRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mConfigId.?, mConfigValue.?, mConfigRdatetime.?, mConfigUdatetime.?, mConfigRuser.?, mConfigUuser.?).shaped.<>({r=>import r._; _1.map(_=> MConfigRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_config_id DBType(VARCHAR), PrimaryKey, Length(50,true) */
    val mConfigId: Column[String] = column[String]("m_config_id", O.PrimaryKey, O.Length(50,varying=true))
    /** Database column m_config_value DBType(VARCHAR), Length(200,true) */
    val mConfigValue: Column[String] = column[String]("m_config_value", O.Length(200,varying=true))
    /** Database column m_config_rdatetime DBType(DATETIME) */
    val mConfigRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_config_rdatetime")
    /** Database column m_config_udatetime DBType(DATETIME) */
    val mConfigUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_config_udatetime")
    /** Database column m_config_ruser DBType(INT) */
    val mConfigRuser: Column[Int] = column[Int]("m_config_ruser")
    /** Database column m_config_uuser DBType(INT) */
    val mConfigUuser: Column[Int] = column[Int]("m_config_uuser")
  }
  /** Collection-like TableQuery object for table MConfig */
  lazy val MConfig = new TableQuery(tag => new MConfig(tag))
  
  /** Row type of table MCustomer */
  type MCustomerRow = HCons[Int,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[java.sql.Date,HCons[String,HCons[String,HCons[String,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[Byte,HCons[Byte,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Int,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Int,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[String,HCons[Byte,HCons[String,HCons[Int,HCons[Int,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for MCustomerRow providing default values if available in the database schema. */
  def MCustomerRow(mCustomerId: Int, mCustomerVoidFlag: Byte, mCustomerType: Byte, mCustomerNomailFlag: Byte, mCustomerStatus: Byte, mCustomerAccount: String, mCustomerPassword: String, mCustomerSalt: String = "", mCustomerFurikomiAccount: String, mCustomerCompanyName: String, mCustomerDivision: String, mCustomerCode: String, mCustomerName: String, mCustomerNameKana: String, mCustomerPresident: String, mCustomerBirthday: java.sql.Date, mCustomerCapital: String, mCustomerEmployees: String, mCustomerUrl: String, mCustomerAuth: Byte, mCustomerMail: String, mCustomerMailMobi: String, mCustomerTel: String, mCustomerTel2: String, mCustomerFax: String, mCustomerTelMobi: String, mCustomerZip: String, mCustomerPref: Byte, mCustomerAddress: String, mCustomerAddress2: String, mCustomerAddress3: String, mCustomerSex: Byte, mCustomerMailmagazineFlag: Byte, mCustomerMakermailNotify: Byte, mCustomerNote: String, mCustomerDinfoCompanyName: String, mCustomerDinfoCompanyNameEn: String, mCustomerDinfoReceivedName: String, mCustomerDinfoReceivedNameEn: String, mCustomerDinfoZip: String, mCustomerDinfoAddress: String, mCustomerDinfoAddressEn: String, mCustomerDinfoAddressEnCity: String, mCustomerDinfoAddressEnPref: Int, mCustomerDinfoTel: String, mCustomerDinfoFax: String, mCustomerFinfoCompanyName: String, mCustomerFinfoTantoName: String, mCustomerFinfoFinanceName: String, mCustomerFinfoFinanceCode: String, mCustomerFinfoBranchName: String, mCustomerFinfoBranchCode: String, mCustomerFinfoKouzaType: String, mCustomerFinfoKouzaNumber: String, mCustomerFinfoKouzaMeigi: String, mCustomerSp: Int, mCustomerSpLimit: java.sql.Timestamp, mCustomerRdatetime: java.sql.Timestamp, mCustomerUdatetime: java.sql.Timestamp, mCustomerLastlogin: java.sql.Timestamp, mCustomerRegistIp: String, mCustomerCancleCause: Byte = 0, mCustomerFromChannel: String, mCustomerRuser: Int, mCustomerUuser: Int): MCustomerRow = {
    mCustomerId :: mCustomerVoidFlag :: mCustomerType :: mCustomerNomailFlag :: mCustomerStatus :: mCustomerAccount :: mCustomerPassword :: mCustomerSalt :: mCustomerFurikomiAccount :: mCustomerCompanyName :: mCustomerDivision :: mCustomerCode :: mCustomerName :: mCustomerNameKana :: mCustomerPresident :: mCustomerBirthday :: mCustomerCapital :: mCustomerEmployees :: mCustomerUrl :: mCustomerAuth :: mCustomerMail :: mCustomerMailMobi :: mCustomerTel :: mCustomerTel2 :: mCustomerFax :: mCustomerTelMobi :: mCustomerZip :: mCustomerPref :: mCustomerAddress :: mCustomerAddress2 :: mCustomerAddress3 :: mCustomerSex :: mCustomerMailmagazineFlag :: mCustomerMakermailNotify :: mCustomerNote :: mCustomerDinfoCompanyName :: mCustomerDinfoCompanyNameEn :: mCustomerDinfoReceivedName :: mCustomerDinfoReceivedNameEn :: mCustomerDinfoZip :: mCustomerDinfoAddress :: mCustomerDinfoAddressEn :: mCustomerDinfoAddressEnCity :: mCustomerDinfoAddressEnPref :: mCustomerDinfoTel :: mCustomerDinfoFax :: mCustomerFinfoCompanyName :: mCustomerFinfoTantoName :: mCustomerFinfoFinanceName :: mCustomerFinfoFinanceCode :: mCustomerFinfoBranchName :: mCustomerFinfoBranchCode :: mCustomerFinfoKouzaType :: mCustomerFinfoKouzaNumber :: mCustomerFinfoKouzaMeigi :: mCustomerSp :: mCustomerSpLimit :: mCustomerRdatetime :: mCustomerUdatetime :: mCustomerLastlogin :: mCustomerRegistIp :: mCustomerCancleCause :: mCustomerFromChannel :: mCustomerRuser :: mCustomerUuser :: HNil
  }
  /** GetResult implicit for fetching MCustomerRow objects using plain SQL queries */
  implicit def GetResultMCustomerRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[java.sql.Date], e4: GR[java.sql.Timestamp]): GR[MCustomerRow] = GR{
    prs => import prs._
    <<[Int] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[java.sql.Date] :: <<[String] :: <<[String] :: <<[String] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Int] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Int] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[String] :: <<[Byte] :: <<[String] :: <<[Int] :: <<[Int] :: HNil
  }
  /** Table description of table m_customer. Objects of this class serve as prototypes for rows in queries. */
  class MCustomer(_tableTag: Tag) extends Table[MCustomerRow](_tableTag, "m_customer") {
    def * = mCustomerId :: mCustomerVoidFlag :: mCustomerType :: mCustomerNomailFlag :: mCustomerStatus :: mCustomerAccount :: mCustomerPassword :: mCustomerSalt :: mCustomerFurikomiAccount :: mCustomerCompanyName :: mCustomerDivision :: mCustomerCode :: mCustomerName :: mCustomerNameKana :: mCustomerPresident :: mCustomerBirthday :: mCustomerCapital :: mCustomerEmployees :: mCustomerUrl :: mCustomerAuth :: mCustomerMail :: mCustomerMailMobi :: mCustomerTel :: mCustomerTel2 :: mCustomerFax :: mCustomerTelMobi :: mCustomerZip :: mCustomerPref :: mCustomerAddress :: mCustomerAddress2 :: mCustomerAddress3 :: mCustomerSex :: mCustomerMailmagazineFlag :: mCustomerMakermailNotify :: mCustomerNote :: mCustomerDinfoCompanyName :: mCustomerDinfoCompanyNameEn :: mCustomerDinfoReceivedName :: mCustomerDinfoReceivedNameEn :: mCustomerDinfoZip :: mCustomerDinfoAddress :: mCustomerDinfoAddressEn :: mCustomerDinfoAddressEnCity :: mCustomerDinfoAddressEnPref :: mCustomerDinfoTel :: mCustomerDinfoFax :: mCustomerFinfoCompanyName :: mCustomerFinfoTantoName :: mCustomerFinfoFinanceName :: mCustomerFinfoFinanceCode :: mCustomerFinfoBranchName :: mCustomerFinfoBranchCode :: mCustomerFinfoKouzaType :: mCustomerFinfoKouzaNumber :: mCustomerFinfoKouzaMeigi :: mCustomerSp :: mCustomerSpLimit :: mCustomerRdatetime :: mCustomerUdatetime :: mCustomerLastlogin :: mCustomerRegistIp :: mCustomerCancleCause :: mCustomerFromChannel :: mCustomerRuser :: mCustomerUuser :: HNil
    
    /** Database column m_customer_id DBType(INT), AutoInc, PrimaryKey */
    val mCustomerId: Column[Int] = column[Int]("m_customer_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_customer_void_flag DBType(TINYINT) */
    val mCustomerVoidFlag: Column[Byte] = column[Byte]("m_customer_void_flag")
    /** Database column m_customer_type DBType(TINYINT) */
    val mCustomerType: Column[Byte] = column[Byte]("m_customer_type")
    /** Database column m_customer_nomail_flag DBType(TINYINT) */
    val mCustomerNomailFlag: Column[Byte] = column[Byte]("m_customer_nomail_flag")
    /** Database column m_customer_status DBType(TINYINT) */
    val mCustomerStatus: Column[Byte] = column[Byte]("m_customer_status")
    /** Database column m_customer_account DBType(VARCHAR), Length(50,true) */
    val mCustomerAccount: Column[String] = column[String]("m_customer_account", O.Length(50,varying=true))
    /** Database column m_customer_password DBType(VARCHAR), Length(200,true) */
    val mCustomerPassword: Column[String] = column[String]("m_customer_password", O.Length(200,varying=true))
    /** Database column m_customer_salt DBType(CHAR), Length(15,false), Default() */
    val mCustomerSalt: Column[String] = column[String]("m_customer_salt", O.Length(15,varying=false), O.Default(""))
    /** Database column m_customer_furikomi_account DBType(VARCHAR), Length(10,true) */
    val mCustomerFurikomiAccount: Column[String] = column[String]("m_customer_furikomi_account", O.Length(10,varying=true))
    /** Database column m_customer_company_name DBType(VARCHAR), Length(100,true) */
    val mCustomerCompanyName: Column[String] = column[String]("m_customer_company_name", O.Length(100,varying=true))
    /** Database column m_customer_division DBType(VARCHAR), Length(100,true) */
    val mCustomerDivision: Column[String] = column[String]("m_customer_division", O.Length(100,varying=true))
    /** Database column m_customer_code DBType(VARCHAR), Length(20,true) */
    val mCustomerCode: Column[String] = column[String]("m_customer_code", O.Length(20,varying=true))
    /** Database column m_customer_name DBType(VARCHAR), Length(100,true) */
    val mCustomerName: Column[String] = column[String]("m_customer_name", O.Length(100,varying=true))
    /** Database column m_customer_name_kana DBType(VARCHAR), Length(100,true) */
    val mCustomerNameKana: Column[String] = column[String]("m_customer_name_kana", O.Length(100,varying=true))
    /** Database column m_customer_president DBType(VARCHAR), Length(20,true) */
    val mCustomerPresident: Column[String] = column[String]("m_customer_president", O.Length(20,varying=true))
    /** Database column m_customer_birthday DBType(DATE) */
    val mCustomerBirthday: Column[java.sql.Date] = column[java.sql.Date]("m_customer_birthday")
    /** Database column m_customer_capital DBType(VARCHAR), Length(100,true) */
    val mCustomerCapital: Column[String] = column[String]("m_customer_capital", O.Length(100,varying=true))
    /** Database column m_customer_employees DBType(VARCHAR), Length(100,true) */
    val mCustomerEmployees: Column[String] = column[String]("m_customer_employees", O.Length(100,varying=true))
    /** Database column m_customer_url DBType(VARCHAR), Length(100,true) */
    val mCustomerUrl: Column[String] = column[String]("m_customer_url", O.Length(100,varying=true))
    /** Database column m_customer_auth DBType(TINYINT) */
    val mCustomerAuth: Column[Byte] = column[Byte]("m_customer_auth")
    /** Database column m_customer_mail DBType(VARCHAR), Length(255,true) */
    val mCustomerMail: Column[String] = column[String]("m_customer_mail", O.Length(255,varying=true))
    /** Database column m_customer_mail_mobi DBType(VARCHAR), Length(255,true) */
    val mCustomerMailMobi: Column[String] = column[String]("m_customer_mail_mobi", O.Length(255,varying=true))
    /** Database column m_customer_tel DBType(VARCHAR), Length(20,true) */
    val mCustomerTel: Column[String] = column[String]("m_customer_tel", O.Length(20,varying=true))
    /** Database column m_customer_tel2 DBType(VARCHAR), Length(255,true) */
    val mCustomerTel2: Column[String] = column[String]("m_customer_tel2", O.Length(255,varying=true))
    /** Database column m_customer_fax DBType(VARCHAR), Length(20,true) */
    val mCustomerFax: Column[String] = column[String]("m_customer_fax", O.Length(20,varying=true))
    /** Database column m_customer_tel_mobi DBType(VARCHAR), Length(20,true) */
    val mCustomerTelMobi: Column[String] = column[String]("m_customer_tel_mobi", O.Length(20,varying=true))
    /** Database column m_customer_zip DBType(VARCHAR), Length(10,true) */
    val mCustomerZip: Column[String] = column[String]("m_customer_zip", O.Length(10,varying=true))
    /** Database column m_customer_pref DBType(TINYINT) */
    val mCustomerPref: Column[Byte] = column[Byte]("m_customer_pref")
    /** Database column m_customer_address DBType(VARCHAR), Length(255,true) */
    val mCustomerAddress: Column[String] = column[String]("m_customer_address", O.Length(255,varying=true))
    /** Database column m_customer_address2 DBType(VARCHAR), Length(255,true) */
    val mCustomerAddress2: Column[String] = column[String]("m_customer_address2", O.Length(255,varying=true))
    /** Database column m_customer_address3 DBType(VARCHAR), Length(255,true) */
    val mCustomerAddress3: Column[String] = column[String]("m_customer_address3", O.Length(255,varying=true))
    /** Database column m_customer_sex DBType(TINYINT) */
    val mCustomerSex: Column[Byte] = column[Byte]("m_customer_sex")
    /** Database column m_customer_mailmagazine_flag DBType(TINYINT) */
    val mCustomerMailmagazineFlag: Column[Byte] = column[Byte]("m_customer_mailmagazine_flag")
    /** Database column m_customer_makermail_notify DBType(TINYINT) */
    val mCustomerMakermailNotify: Column[Byte] = column[Byte]("m_customer_makermail_notify")
    /** Database column m_customer_note DBType(TEXT), Length(65535,true) */
    val mCustomerNote: Column[String] = column[String]("m_customer_note", O.Length(65535,varying=true))
    /** Database column m_customer_dinfo_company_name DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoCompanyName: Column[String] = column[String]("m_customer_dinfo_company_name", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_company_name_en DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoCompanyNameEn: Column[String] = column[String]("m_customer_dinfo_company_name_en", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_received_name DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoReceivedName: Column[String] = column[String]("m_customer_dinfo_received_name", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_received_name_en DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoReceivedNameEn: Column[String] = column[String]("m_customer_dinfo_received_name_en", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_zip DBType(VARCHAR), Length(20,true) */
    val mCustomerDinfoZip: Column[String] = column[String]("m_customer_dinfo_zip", O.Length(20,varying=true))
    /** Database column m_customer_dinfo_address DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoAddress: Column[String] = column[String]("m_customer_dinfo_address", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_address_en DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoAddressEn: Column[String] = column[String]("m_customer_dinfo_address_en", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_address_en_city DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoAddressEnCity: Column[String] = column[String]("m_customer_dinfo_address_en_city", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_address_en_pref DBType(INT) */
    val mCustomerDinfoAddressEnPref: Column[Int] = column[Int]("m_customer_dinfo_address_en_pref")
    /** Database column m_customer_dinfo_tel DBType(VARCHAR), Length(20,true) */
    val mCustomerDinfoTel: Column[String] = column[String]("m_customer_dinfo_tel", O.Length(20,varying=true))
    /** Database column m_customer_dinfo_fax DBType(VARCHAR), Length(20,true) */
    val mCustomerDinfoFax: Column[String] = column[String]("m_customer_dinfo_fax", O.Length(20,varying=true))
    /** Database column m_customer_finfo_company_name DBType(VARCHAR), Length(200,true) */
    val mCustomerFinfoCompanyName: Column[String] = column[String]("m_customer_finfo_company_name", O.Length(200,varying=true))
    /** Database column m_customer_finfo_tanto_name DBType(VARCHAR), Length(200,true) */
    val mCustomerFinfoTantoName: Column[String] = column[String]("m_customer_finfo_tanto_name", O.Length(200,varying=true))
    /** Database column m_customer_finfo_finance_name DBType(VARCHAR), Length(200,true) */
    val mCustomerFinfoFinanceName: Column[String] = column[String]("m_customer_finfo_finance_name", O.Length(200,varying=true))
    /** Database column m_customer_finfo_finance_code DBType(VARCHAR), Length(20,true) */
    val mCustomerFinfoFinanceCode: Column[String] = column[String]("m_customer_finfo_finance_code", O.Length(20,varying=true))
    /** Database column m_customer_finfo_branch_name DBType(VARCHAR), Length(200,true) */
    val mCustomerFinfoBranchName: Column[String] = column[String]("m_customer_finfo_branch_name", O.Length(200,varying=true))
    /** Database column m_customer_finfo_branch_code DBType(VARCHAR), Length(20,true) */
    val mCustomerFinfoBranchCode: Column[String] = column[String]("m_customer_finfo_branch_code", O.Length(20,varying=true))
    /** Database column m_customer_finfo_kouza_type DBType(VARCHAR), Length(20,true) */
    val mCustomerFinfoKouzaType: Column[String] = column[String]("m_customer_finfo_kouza_type", O.Length(20,varying=true))
    /** Database column m_customer_finfo_kouza_number DBType(VARCHAR), Length(20,true) */
    val mCustomerFinfoKouzaNumber: Column[String] = column[String]("m_customer_finfo_kouza_number", O.Length(20,varying=true))
    /** Database column m_customer_finfo_kouza_meigi DBType(VARCHAR), Length(100,true) */
    val mCustomerFinfoKouzaMeigi: Column[String] = column[String]("m_customer_finfo_kouza_meigi", O.Length(100,varying=true))
    /** Database column m_customer_sp DBType(INT) */
    val mCustomerSp: Column[Int] = column[Int]("m_customer_sp")
    /** Database column m_customer_sp_limit DBType(DATETIME) */
    val mCustomerSpLimit: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_customer_sp_limit")
    /** Database column m_customer_rdatetime DBType(DATETIME) */
    val mCustomerRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_customer_rdatetime")
    /** Database column m_customer_udatetime DBType(DATETIME) */
    val mCustomerUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_customer_udatetime")
    /** Database column m_customer_lastlogin DBType(DATETIME) */
    val mCustomerLastlogin: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_customer_lastlogin")
    /** Database column m_customer_regist_ip DBType(VARCHAR), Length(200,true) */
    val mCustomerRegistIp: Column[String] = column[String]("m_customer_regist_ip", O.Length(200,varying=true))
    /** Database column m_customer_cancle_cause DBType(TINYINT), Default(0) */
    val mCustomerCancleCause: Column[Byte] = column[Byte]("m_customer_cancle_cause", O.Default(0))
    /** Database column m_customer_from_channel DBType(VARCHAR), Length(100,true) */
    val mCustomerFromChannel: Column[String] = column[String]("m_customer_from_channel", O.Length(100,varying=true))
    /** Database column m_customer_ruser DBType(INT) */
    val mCustomerRuser: Column[Int] = column[Int]("m_customer_ruser")
    /** Database column m_customer_uuser DBType(INT) */
    val mCustomerUuser: Column[Int] = column[Int]("m_customer_uuser")
    
    /** Uniqueness Index over (mCustomerAccount) (database name m_customer_account) */
    val index1 = index("m_customer_account", mCustomerAccount :: HNil, unique=true)
  }
  /** Collection-like TableQuery object for table MCustomer */
  lazy val MCustomer = new TableQuery(tag => new MCustomer(tag))
  
  /** Entity class storing rows of table MCustomerDinfo
   *  @param mCustomerDinfoId Database column m_customer_dinfo_id DBType(INT), AutoInc, PrimaryKey
   *  @param mCustomerDinfoMCustomerId Database column m_customer_dinfo_m_customer_id DBType(INT), Default(0)
   *  @param mCustomerDinfoCompanyNameEn Database column m_customer_dinfo_company_name_en DBType(VARCHAR), Length(225,true), Default()
   *  @param mCustomerDinfoReceivedNameEn Database column m_customer_dinfo_received_name_en DBType(VARCHAR), Length(225,true), Default()
   *  @param mCustomerDinfoZip Database column m_customer_dinfo_zip DBType(VARCHAR), Length(20,true), Default()
   *  @param mCustomerDinfoAddressEn Database column m_customer_dinfo_address_en DBType(VARCHAR), Length(225,true), Default()
   *  @param mCustomerDinfoAddressEnCity Database column m_customer_dinfo_address_en_city DBType(VARCHAR), Length(225,true), Default()
   *  @param mCustomerDinfoAddressEnPref Database column m_customer_dinfo_address_en_pref DBType(INT)
   *  @param mCustomerDinfoTel Database column m_customer_dinfo_tel DBType(VARCHAR), Length(20,true), Default()
   *  @param mCustomerDinfoFax Database column m_customer_dinfo_fax DBType(VARCHAR), Length(20,true), Default()
   *  @param mCustomerDinfoDatetime Database column m_customer_dinfo_datetime DBType(DATETIME) */
  case class MCustomerDinfoRow(mCustomerDinfoId: Int, mCustomerDinfoMCustomerId: Int = 0, mCustomerDinfoCompanyNameEn: String = "", mCustomerDinfoReceivedNameEn: String = "", mCustomerDinfoZip: String = "", mCustomerDinfoAddressEn: String = "", mCustomerDinfoAddressEnCity: String = "", mCustomerDinfoAddressEnPref: Int, mCustomerDinfoTel: String = "", mCustomerDinfoFax: String = "", mCustomerDinfoDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MCustomerDinfoRow objects using plain SQL queries */
  implicit def GetResultMCustomerDinfoRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MCustomerDinfoRow] = GR{
    prs => import prs._
    MCustomerDinfoRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_customer_dinfo. Objects of this class serve as prototypes for rows in queries. */
  class MCustomerDinfo(_tableTag: Tag) extends Table[MCustomerDinfoRow](_tableTag, "m_customer_dinfo") {
    def * = (mCustomerDinfoId, mCustomerDinfoMCustomerId, mCustomerDinfoCompanyNameEn, mCustomerDinfoReceivedNameEn, mCustomerDinfoZip, mCustomerDinfoAddressEn, mCustomerDinfoAddressEnCity, mCustomerDinfoAddressEnPref, mCustomerDinfoTel, mCustomerDinfoFax, mCustomerDinfoDatetime) <> (MCustomerDinfoRow.tupled, MCustomerDinfoRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mCustomerDinfoId.?, mCustomerDinfoMCustomerId.?, mCustomerDinfoCompanyNameEn.?, mCustomerDinfoReceivedNameEn.?, mCustomerDinfoZip.?, mCustomerDinfoAddressEn.?, mCustomerDinfoAddressEnCity.?, mCustomerDinfoAddressEnPref.?, mCustomerDinfoTel.?, mCustomerDinfoFax.?, mCustomerDinfoDatetime.?).shaped.<>({r=>import r._; _1.map(_=> MCustomerDinfoRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_customer_dinfo_id DBType(INT), AutoInc, PrimaryKey */
    val mCustomerDinfoId: Column[Int] = column[Int]("m_customer_dinfo_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_customer_dinfo_m_customer_id DBType(INT), Default(0) */
    val mCustomerDinfoMCustomerId: Column[Int] = column[Int]("m_customer_dinfo_m_customer_id", O.Default(0))
    /** Database column m_customer_dinfo_company_name_en DBType(VARCHAR), Length(225,true), Default() */
    val mCustomerDinfoCompanyNameEn: Column[String] = column[String]("m_customer_dinfo_company_name_en", O.Length(225,varying=true), O.Default(""))
    /** Database column m_customer_dinfo_received_name_en DBType(VARCHAR), Length(225,true), Default() */
    val mCustomerDinfoReceivedNameEn: Column[String] = column[String]("m_customer_dinfo_received_name_en", O.Length(225,varying=true), O.Default(""))
    /** Database column m_customer_dinfo_zip DBType(VARCHAR), Length(20,true), Default() */
    val mCustomerDinfoZip: Column[String] = column[String]("m_customer_dinfo_zip", O.Length(20,varying=true), O.Default(""))
    /** Database column m_customer_dinfo_address_en DBType(VARCHAR), Length(225,true), Default() */
    val mCustomerDinfoAddressEn: Column[String] = column[String]("m_customer_dinfo_address_en", O.Length(225,varying=true), O.Default(""))
    /** Database column m_customer_dinfo_address_en_city DBType(VARCHAR), Length(225,true), Default() */
    val mCustomerDinfoAddressEnCity: Column[String] = column[String]("m_customer_dinfo_address_en_city", O.Length(225,varying=true), O.Default(""))
    /** Database column m_customer_dinfo_address_en_pref DBType(INT) */
    val mCustomerDinfoAddressEnPref: Column[Int] = column[Int]("m_customer_dinfo_address_en_pref")
    /** Database column m_customer_dinfo_tel DBType(VARCHAR), Length(20,true), Default() */
    val mCustomerDinfoTel: Column[String] = column[String]("m_customer_dinfo_tel", O.Length(20,varying=true), O.Default(""))
    /** Database column m_customer_dinfo_fax DBType(VARCHAR), Length(20,true), Default() */
    val mCustomerDinfoFax: Column[String] = column[String]("m_customer_dinfo_fax", O.Length(20,varying=true), O.Default(""))
    /** Database column m_customer_dinfo_datetime DBType(DATETIME) */
    val mCustomerDinfoDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_customer_dinfo_datetime")
    
    /** Index over (mCustomerDinfoMCustomerId) (database name m_customer_dinfo_m_customer_id) */
    val index1 = index("m_customer_dinfo_m_customer_id", mCustomerDinfoMCustomerId)
  }
  /** Collection-like TableQuery object for table MCustomerDinfo */
  lazy val MCustomerDinfo = new TableQuery(tag => new MCustomerDinfo(tag))
  
  /** Row type of table MCustomerTemporary */
  type MCustomerTemporaryRow = HCons[Int,HCons[String,HCons[Int,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[java.sql.Date,HCons[String,HCons[String,HCons[String,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[Byte,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[Int,HCons[Int,HCons[String,HCons[String,HCons[String,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for MCustomerTemporaryRow providing default values if available in the database schema. */
  def MCustomerTemporaryRow(mCustomerTemporaryId: Int, k: String, mCustomerId: Int, mCustomerVoidFlag: Byte, mCustomerType: Byte, mCustomerNomailFlag: Byte, mCustomerStatus: Byte, mCustomerAccount: String, mCustomerPassword: String, mCustomerSalt: String = "", mCustomerCompanyName: String, mCustomerDivision: String, mCustomerCode: String, mCustomerName: String, mCustomerNameKana: String, mCustomerPresident: String, mCustomerBirthday: java.sql.Date, mCustomerCapital: String, mCustomerEmployees: String, mCustomerUrl: String, mCustomerAuth: Byte, mCustomerMail: String, mCustomerMailMobi: String, mCustomerTel: String, mCustomerTel2: String, mCustomerFax: String, mCustomerTelMobi: String, mCustomerZip: String, mCustomerPref: Byte, mCustomerAddress: String, mCustomerAddress2: String, mCustomerAddress3: String, mCustomerSex: Byte, mCustomerMailmagazineFlag: Byte, mCustomerNote: String, mCustomerDinfoCompanyName: String, mCustomerDinfoCompanyNameEn: String, mCustomerDinfoReceivedName: String, mCustomerDinfoReceivedNameEn: String, mCustomerDinfoZip: String, mCustomerDinfoAddress: String, mCustomerDinfoAddressEn: String, mCustomerDinfoTel: String, mCustomerDinfoFax: String, mCustomerFinfoCompanyName: String, mCustomerFinfoTantoName: String, mCustomerFinfoFinanceName: String, mCustomerFinfoFinanceCode: String, mCustomerFinfoBranchName: String, mCustomerFinfoBranchCode: String, mCustomerFinfoKouzaType: String, mCustomerFinfoKouzaNumber: String, mCustomerRdatetime: java.sql.Timestamp, mCustomerUdatetime: java.sql.Timestamp, mCustomerRuser: Int, mCustomerUuser: Int, mCustomerFinfoKouzaMeigi: String, mCustomerFromChannel: String, mCustomerRegistIp: String): MCustomerTemporaryRow = {
    mCustomerTemporaryId :: k :: mCustomerId :: mCustomerVoidFlag :: mCustomerType :: mCustomerNomailFlag :: mCustomerStatus :: mCustomerAccount :: mCustomerPassword :: mCustomerSalt :: mCustomerCompanyName :: mCustomerDivision :: mCustomerCode :: mCustomerName :: mCustomerNameKana :: mCustomerPresident :: mCustomerBirthday :: mCustomerCapital :: mCustomerEmployees :: mCustomerUrl :: mCustomerAuth :: mCustomerMail :: mCustomerMailMobi :: mCustomerTel :: mCustomerTel2 :: mCustomerFax :: mCustomerTelMobi :: mCustomerZip :: mCustomerPref :: mCustomerAddress :: mCustomerAddress2 :: mCustomerAddress3 :: mCustomerSex :: mCustomerMailmagazineFlag :: mCustomerNote :: mCustomerDinfoCompanyName :: mCustomerDinfoCompanyNameEn :: mCustomerDinfoReceivedName :: mCustomerDinfoReceivedNameEn :: mCustomerDinfoZip :: mCustomerDinfoAddress :: mCustomerDinfoAddressEn :: mCustomerDinfoTel :: mCustomerDinfoFax :: mCustomerFinfoCompanyName :: mCustomerFinfoTantoName :: mCustomerFinfoFinanceName :: mCustomerFinfoFinanceCode :: mCustomerFinfoBranchName :: mCustomerFinfoBranchCode :: mCustomerFinfoKouzaType :: mCustomerFinfoKouzaNumber :: mCustomerRdatetime :: mCustomerUdatetime :: mCustomerRuser :: mCustomerUuser :: mCustomerFinfoKouzaMeigi :: mCustomerFromChannel :: mCustomerRegistIp :: HNil
  }
  /** GetResult implicit for fetching MCustomerTemporaryRow objects using plain SQL queries */
  implicit def GetResultMCustomerTemporaryRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Byte], e3: GR[java.sql.Date], e4: GR[java.sql.Timestamp]): GR[MCustomerTemporaryRow] = GR{
    prs => import prs._
    <<[Int] :: <<[String] :: <<[Int] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[java.sql.Date] :: <<[String] :: <<[String] :: <<[String] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[Byte] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[Int] :: <<[Int] :: <<[String] :: <<[String] :: <<[String] :: HNil
  }
  /** Table description of table m_customer_temporary. Objects of this class serve as prototypes for rows in queries. */
  class MCustomerTemporary(_tableTag: Tag) extends Table[MCustomerTemporaryRow](_tableTag, "m_customer_temporary") {
    def * = mCustomerTemporaryId :: k :: mCustomerId :: mCustomerVoidFlag :: mCustomerType :: mCustomerNomailFlag :: mCustomerStatus :: mCustomerAccount :: mCustomerPassword :: mCustomerSalt :: mCustomerCompanyName :: mCustomerDivision :: mCustomerCode :: mCustomerName :: mCustomerNameKana :: mCustomerPresident :: mCustomerBirthday :: mCustomerCapital :: mCustomerEmployees :: mCustomerUrl :: mCustomerAuth :: mCustomerMail :: mCustomerMailMobi :: mCustomerTel :: mCustomerTel2 :: mCustomerFax :: mCustomerTelMobi :: mCustomerZip :: mCustomerPref :: mCustomerAddress :: mCustomerAddress2 :: mCustomerAddress3 :: mCustomerSex :: mCustomerMailmagazineFlag :: mCustomerNote :: mCustomerDinfoCompanyName :: mCustomerDinfoCompanyNameEn :: mCustomerDinfoReceivedName :: mCustomerDinfoReceivedNameEn :: mCustomerDinfoZip :: mCustomerDinfoAddress :: mCustomerDinfoAddressEn :: mCustomerDinfoTel :: mCustomerDinfoFax :: mCustomerFinfoCompanyName :: mCustomerFinfoTantoName :: mCustomerFinfoFinanceName :: mCustomerFinfoFinanceCode :: mCustomerFinfoBranchName :: mCustomerFinfoBranchCode :: mCustomerFinfoKouzaType :: mCustomerFinfoKouzaNumber :: mCustomerRdatetime :: mCustomerUdatetime :: mCustomerRuser :: mCustomerUuser :: mCustomerFinfoKouzaMeigi :: mCustomerFromChannel :: mCustomerRegistIp :: HNil
    
    /** Database column m_customer_temporary_id DBType(INT), AutoInc, PrimaryKey */
    val mCustomerTemporaryId: Column[Int] = column[Int]("m_customer_temporary_id", O.AutoInc, O.PrimaryKey)
    /** Database column k DBType(VARCHAR), Length(100,true) */
    val k: Column[String] = column[String]("k", O.Length(100,varying=true))
    /** Database column m_customer_id DBType(INT) */
    val mCustomerId: Column[Int] = column[Int]("m_customer_id")
    /** Database column m_customer_void_flag DBType(TINYINT) */
    val mCustomerVoidFlag: Column[Byte] = column[Byte]("m_customer_void_flag")
    /** Database column m_customer_type DBType(TINYINT) */
    val mCustomerType: Column[Byte] = column[Byte]("m_customer_type")
    /** Database column m_customer_nomail_flag DBType(TINYINT) */
    val mCustomerNomailFlag: Column[Byte] = column[Byte]("m_customer_nomail_flag")
    /** Database column m_customer_status DBType(TINYINT) */
    val mCustomerStatus: Column[Byte] = column[Byte]("m_customer_status")
    /** Database column m_customer_account DBType(VARCHAR), Length(50,true) */
    val mCustomerAccount: Column[String] = column[String]("m_customer_account", O.Length(50,varying=true))
    /** Database column m_customer_password DBType(VARCHAR), Length(200,true) */
    val mCustomerPassword: Column[String] = column[String]("m_customer_password", O.Length(200,varying=true))
    /** Database column m_customer_salt DBType(CHAR), Length(15,false), Default() */
    val mCustomerSalt: Column[String] = column[String]("m_customer_salt", O.Length(15,varying=false), O.Default(""))
    /** Database column m_customer_company_name DBType(VARCHAR), Length(100,true) */
    val mCustomerCompanyName: Column[String] = column[String]("m_customer_company_name", O.Length(100,varying=true))
    /** Database column m_customer_division DBType(VARCHAR), Length(100,true) */
    val mCustomerDivision: Column[String] = column[String]("m_customer_division", O.Length(100,varying=true))
    /** Database column m_customer_code DBType(VARCHAR), Length(20,true) */
    val mCustomerCode: Column[String] = column[String]("m_customer_code", O.Length(20,varying=true))
    /** Database column m_customer_name DBType(VARCHAR), Length(100,true) */
    val mCustomerName: Column[String] = column[String]("m_customer_name", O.Length(100,varying=true))
    /** Database column m_customer_name_kana DBType(VARCHAR), Length(100,true) */
    val mCustomerNameKana: Column[String] = column[String]("m_customer_name_kana", O.Length(100,varying=true))
    /** Database column m_customer_president DBType(VARCHAR), Length(20,true) */
    val mCustomerPresident: Column[String] = column[String]("m_customer_president", O.Length(20,varying=true))
    /** Database column m_customer_birthday DBType(DATE) */
    val mCustomerBirthday: Column[java.sql.Date] = column[java.sql.Date]("m_customer_birthday")
    /** Database column m_customer_capital DBType(VARCHAR), Length(100,true) */
    val mCustomerCapital: Column[String] = column[String]("m_customer_capital", O.Length(100,varying=true))
    /** Database column m_customer_employees DBType(VARCHAR), Length(100,true) */
    val mCustomerEmployees: Column[String] = column[String]("m_customer_employees", O.Length(100,varying=true))
    /** Database column m_customer_url DBType(VARCHAR), Length(100,true) */
    val mCustomerUrl: Column[String] = column[String]("m_customer_url", O.Length(100,varying=true))
    /** Database column m_customer_auth DBType(TINYINT) */
    val mCustomerAuth: Column[Byte] = column[Byte]("m_customer_auth")
    /** Database column m_customer_mail DBType(VARCHAR), Length(255,true) */
    val mCustomerMail: Column[String] = column[String]("m_customer_mail", O.Length(255,varying=true))
    /** Database column m_customer_mail_mobi DBType(VARCHAR), Length(255,true) */
    val mCustomerMailMobi: Column[String] = column[String]("m_customer_mail_mobi", O.Length(255,varying=true))
    /** Database column m_customer_tel DBType(VARCHAR), Length(20,true) */
    val mCustomerTel: Column[String] = column[String]("m_customer_tel", O.Length(20,varying=true))
    /** Database column m_customer_tel2 DBType(VARCHAR), Length(255,true) */
    val mCustomerTel2: Column[String] = column[String]("m_customer_tel2", O.Length(255,varying=true))
    /** Database column m_customer_fax DBType(VARCHAR), Length(20,true) */
    val mCustomerFax: Column[String] = column[String]("m_customer_fax", O.Length(20,varying=true))
    /** Database column m_customer_tel_mobi DBType(VARCHAR), Length(20,true) */
    val mCustomerTelMobi: Column[String] = column[String]("m_customer_tel_mobi", O.Length(20,varying=true))
    /** Database column m_customer_zip DBType(VARCHAR), Length(10,true) */
    val mCustomerZip: Column[String] = column[String]("m_customer_zip", O.Length(10,varying=true))
    /** Database column m_customer_pref DBType(TINYINT) */
    val mCustomerPref: Column[Byte] = column[Byte]("m_customer_pref")
    /** Database column m_customer_address DBType(VARCHAR), Length(255,true) */
    val mCustomerAddress: Column[String] = column[String]("m_customer_address", O.Length(255,varying=true))
    /** Database column m_customer_address2 DBType(VARCHAR), Length(255,true) */
    val mCustomerAddress2: Column[String] = column[String]("m_customer_address2", O.Length(255,varying=true))
    /** Database column m_customer_address3 DBType(VARCHAR), Length(255,true) */
    val mCustomerAddress3: Column[String] = column[String]("m_customer_address3", O.Length(255,varying=true))
    /** Database column m_customer_sex DBType(TINYINT) */
    val mCustomerSex: Column[Byte] = column[Byte]("m_customer_sex")
    /** Database column m_customer_mailmagazine_flag DBType(TINYINT) */
    val mCustomerMailmagazineFlag: Column[Byte] = column[Byte]("m_customer_mailmagazine_flag")
    /** Database column m_customer_note DBType(TEXT), Length(65535,true) */
    val mCustomerNote: Column[String] = column[String]("m_customer_note", O.Length(65535,varying=true))
    /** Database column m_customer_dinfo_company_name DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoCompanyName: Column[String] = column[String]("m_customer_dinfo_company_name", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_company_name_en DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoCompanyNameEn: Column[String] = column[String]("m_customer_dinfo_company_name_en", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_received_name DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoReceivedName: Column[String] = column[String]("m_customer_dinfo_received_name", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_received_name_en DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoReceivedNameEn: Column[String] = column[String]("m_customer_dinfo_received_name_en", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_zip DBType(VARCHAR), Length(20,true) */
    val mCustomerDinfoZip: Column[String] = column[String]("m_customer_dinfo_zip", O.Length(20,varying=true))
    /** Database column m_customer_dinfo_address DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoAddress: Column[String] = column[String]("m_customer_dinfo_address", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_address_en DBType(VARCHAR), Length(200,true) */
    val mCustomerDinfoAddressEn: Column[String] = column[String]("m_customer_dinfo_address_en", O.Length(200,varying=true))
    /** Database column m_customer_dinfo_tel DBType(VARCHAR), Length(20,true) */
    val mCustomerDinfoTel: Column[String] = column[String]("m_customer_dinfo_tel", O.Length(20,varying=true))
    /** Database column m_customer_dinfo_fax DBType(VARCHAR), Length(20,true) */
    val mCustomerDinfoFax: Column[String] = column[String]("m_customer_dinfo_fax", O.Length(20,varying=true))
    /** Database column m_customer_finfo_company_name DBType(VARCHAR), Length(200,true) */
    val mCustomerFinfoCompanyName: Column[String] = column[String]("m_customer_finfo_company_name", O.Length(200,varying=true))
    /** Database column m_customer_finfo_tanto_name DBType(VARCHAR), Length(200,true) */
    val mCustomerFinfoTantoName: Column[String] = column[String]("m_customer_finfo_tanto_name", O.Length(200,varying=true))
    /** Database column m_customer_finfo_finance_name DBType(VARCHAR), Length(200,true) */
    val mCustomerFinfoFinanceName: Column[String] = column[String]("m_customer_finfo_finance_name", O.Length(200,varying=true))
    /** Database column m_customer_finfo_finance_code DBType(VARCHAR), Length(20,true) */
    val mCustomerFinfoFinanceCode: Column[String] = column[String]("m_customer_finfo_finance_code", O.Length(20,varying=true))
    /** Database column m_customer_finfo_branch_name DBType(VARCHAR), Length(200,true) */
    val mCustomerFinfoBranchName: Column[String] = column[String]("m_customer_finfo_branch_name", O.Length(200,varying=true))
    /** Database column m_customer_finfo_branch_code DBType(VARCHAR), Length(20,true) */
    val mCustomerFinfoBranchCode: Column[String] = column[String]("m_customer_finfo_branch_code", O.Length(20,varying=true))
    /** Database column m_customer_finfo_kouza_type DBType(VARCHAR), Length(20,true) */
    val mCustomerFinfoKouzaType: Column[String] = column[String]("m_customer_finfo_kouza_type", O.Length(20,varying=true))
    /** Database column m_customer_finfo_kouza_number DBType(VARCHAR), Length(20,true) */
    val mCustomerFinfoKouzaNumber: Column[String] = column[String]("m_customer_finfo_kouza_number", O.Length(20,varying=true))
    /** Database column m_customer_rdatetime DBType(DATETIME) */
    val mCustomerRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_customer_rdatetime")
    /** Database column m_customer_udatetime DBType(DATETIME) */
    val mCustomerUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_customer_udatetime")
    /** Database column m_customer_ruser DBType(INT) */
    val mCustomerRuser: Column[Int] = column[Int]("m_customer_ruser")
    /** Database column m_customer_uuser DBType(INT) */
    val mCustomerUuser: Column[Int] = column[Int]("m_customer_uuser")
    /** Database column m_customer_finfo_kouza_meigi DBType(VARCHAR), Length(100,true) */
    val mCustomerFinfoKouzaMeigi: Column[String] = column[String]("m_customer_finfo_kouza_meigi", O.Length(100,varying=true))
    /** Database column m_customer_from_channel DBType(VARCHAR), Length(100,true) */
    val mCustomerFromChannel: Column[String] = column[String]("m_customer_from_channel", O.Length(100,varying=true))
    /** Database column m_customer_regist_ip DBType(VARCHAR), Length(200,true) */
    val mCustomerRegistIp: Column[String] = column[String]("m_customer_regist_ip", O.Length(200,varying=true))
    
    /** Uniqueness Index over (mCustomerAccount) (database name m_customer_account) */
    val index1 = index("m_customer_account", mCustomerAccount :: HNil, unique=true)
  }
  /** Collection-like TableQuery object for table MCustomerTemporary */
  lazy val MCustomerTemporary = new TableQuery(tag => new MCustomerTemporary(tag))
  
  /** Entity class storing rows of table MDocumentRequest
   *  @param mDocumentRequestId Database column m_document_request_id DBType(INT), AutoInc, PrimaryKey
   *  @param uDatetime Database column u_datetime DBType(DATETIME) */
  case class MDocumentRequestRow(mDocumentRequestId: Int, uDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MDocumentRequestRow objects using plain SQL queries */
  implicit def GetResultMDocumentRequestRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[MDocumentRequestRow] = GR{
    prs => import prs._
    MDocumentRequestRow.tupled((<<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_document_request. Objects of this class serve as prototypes for rows in queries. */
  class MDocumentRequest(_tableTag: Tag) extends Table[MDocumentRequestRow](_tableTag, "m_document_request") {
    def * = (mDocumentRequestId, uDatetime) <> (MDocumentRequestRow.tupled, MDocumentRequestRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mDocumentRequestId.?, uDatetime.?).shaped.<>({r=>import r._; _1.map(_=> MDocumentRequestRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_document_request_id DBType(INT), AutoInc, PrimaryKey */
    val mDocumentRequestId: Column[Int] = column[Int]("m_document_request_id", O.AutoInc, O.PrimaryKey)
    /** Database column u_datetime DBType(DATETIME) */
    val uDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("u_datetime")
  }
  /** Collection-like TableQuery object for table MDocumentRequest */
  lazy val MDocumentRequest = new TableQuery(tag => new MDocumentRequest(tag))
  
  /** Entity class storing rows of table MEccarea
   *  @param mEccareaId Database column m_eccarea_id DBType(INT), AutoInc, PrimaryKey
   *  @param mEccareaMEcccompanyId Database column m_eccarea_m_ecccompany_id DBType(INT)
   *  @param mEccareaMAreaId Database column m_eccarea_m_area_id DBType(INT) */
  case class MEccareaRow(mEccareaId: Int, mEccareaMEcccompanyId: Int, mEccareaMAreaId: Int)
  /** GetResult implicit for fetching MEccareaRow objects using plain SQL queries */
  implicit def GetResultMEccareaRow(implicit e0: GR[Int]): GR[MEccareaRow] = GR{
    prs => import prs._
    MEccareaRow.tupled((<<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table m_eccarea. Objects of this class serve as prototypes for rows in queries. */
  class MEccarea(_tableTag: Tag) extends Table[MEccareaRow](_tableTag, "m_eccarea") {
    def * = (mEccareaId, mEccareaMEcccompanyId, mEccareaMAreaId) <> (MEccareaRow.tupled, MEccareaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mEccareaId.?, mEccareaMEcccompanyId.?, mEccareaMAreaId.?).shaped.<>({r=>import r._; _1.map(_=> MEccareaRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_eccarea_id DBType(INT), AutoInc, PrimaryKey */
    val mEccareaId: Column[Int] = column[Int]("m_eccarea_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_eccarea_m_ecccompany_id DBType(INT) */
    val mEccareaMEcccompanyId: Column[Int] = column[Int]("m_eccarea_m_ecccompany_id")
    /** Database column m_eccarea_m_area_id DBType(INT) */
    val mEccareaMAreaId: Column[Int] = column[Int]("m_eccarea_m_area_id")
  }
  /** Collection-like TableQuery object for table MEccarea */
  lazy val MEccarea = new TableQuery(tag => new MEccarea(tag))
  
  /** Entity class storing rows of table MEcccharge
   *  @param mEccchargeId Database column m_ecccharge_id DBType(INT), AutoInc, PrimaryKey
   *  @param mEccchargeVoidFlag Database column m_ecccharge_void_flag DBType(INT)
   *  @param mEccchargeMEcccompanyId Database column m_ecccharge_m_ecccompany_id DBType(INT)
   *  @param mEccchargeSalesMEccstaffId Database column m_ecccharge_sales_m_eccstaff_id DBType(INT)
   *  @param mEccchargeEccMEccstaffId Database column m_ecccharge_ecc_m_eccstaff_id DBType(INT)
   *  @param mEccchargeCustMEccstaffId Database column m_ecccharge_cust_m_eccstaff_id DBType(INT UNSIGNED), Default(0)
   *  @param mEccchargeMMakerId Database column m_ecccharge_m_maker_id DBType(INT)
   *  @param mEccchargeRdatetime Database column m_ecccharge_rdatetime DBType(DATETIME)
   *  @param mEccchargeUdatetime Database column m_ecccharge_udatetime DBType(DATETIME) */
  case class MEccchargeRow(mEccchargeId: Int, mEccchargeVoidFlag: Int, mEccchargeMEcccompanyId: Int, mEccchargeSalesMEccstaffId: Int, mEccchargeEccMEccstaffId: Int, mEccchargeCustMEccstaffId: Int = 0, mEccchargeMMakerId: Int, mEccchargeRdatetime: java.sql.Timestamp, mEccchargeUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MEccchargeRow objects using plain SQL queries */
  implicit def GetResultMEccchargeRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[MEccchargeRow] = GR{
    prs => import prs._
    MEccchargeRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_ecccharge. Objects of this class serve as prototypes for rows in queries. */
  class MEcccharge(_tableTag: Tag) extends Table[MEccchargeRow](_tableTag, "m_ecccharge") {
    def * = (mEccchargeId, mEccchargeVoidFlag, mEccchargeMEcccompanyId, mEccchargeSalesMEccstaffId, mEccchargeEccMEccstaffId, mEccchargeCustMEccstaffId, mEccchargeMMakerId, mEccchargeRdatetime, mEccchargeUdatetime) <> (MEccchargeRow.tupled, MEccchargeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mEccchargeId.?, mEccchargeVoidFlag.?, mEccchargeMEcccompanyId.?, mEccchargeSalesMEccstaffId.?, mEccchargeEccMEccstaffId.?, mEccchargeCustMEccstaffId.?, mEccchargeMMakerId.?, mEccchargeRdatetime.?, mEccchargeUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MEccchargeRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_ecccharge_id DBType(INT), AutoInc, PrimaryKey */
    val mEccchargeId: Column[Int] = column[Int]("m_ecccharge_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_ecccharge_void_flag DBType(INT) */
    val mEccchargeVoidFlag: Column[Int] = column[Int]("m_ecccharge_void_flag")
    /** Database column m_ecccharge_m_ecccompany_id DBType(INT) */
    val mEccchargeMEcccompanyId: Column[Int] = column[Int]("m_ecccharge_m_ecccompany_id")
    /** Database column m_ecccharge_sales_m_eccstaff_id DBType(INT) */
    val mEccchargeSalesMEccstaffId: Column[Int] = column[Int]("m_ecccharge_sales_m_eccstaff_id")
    /** Database column m_ecccharge_ecc_m_eccstaff_id DBType(INT) */
    val mEccchargeEccMEccstaffId: Column[Int] = column[Int]("m_ecccharge_ecc_m_eccstaff_id")
    /** Database column m_ecccharge_cust_m_eccstaff_id DBType(INT UNSIGNED), Default(0) */
    val mEccchargeCustMEccstaffId: Column[Int] = column[Int]("m_ecccharge_cust_m_eccstaff_id", O.Default(0))
    /** Database column m_ecccharge_m_maker_id DBType(INT) */
    val mEccchargeMMakerId: Column[Int] = column[Int]("m_ecccharge_m_maker_id")
    /** Database column m_ecccharge_rdatetime DBType(DATETIME) */
    val mEccchargeRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_ecccharge_rdatetime")
    /** Database column m_ecccharge_udatetime DBType(DATETIME) */
    val mEccchargeUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_ecccharge_udatetime")
  }
  /** Collection-like TableQuery object for table MEcccharge */
  lazy val MEcccharge = new TableQuery(tag => new MEcccharge(tag))
  
  /** Row type of table MEcccompany */
  type MEcccompanyRow = HCons[Int,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Int,HCons[Int,HCons[Int,HCons[String,HCons[String,HCons[Int,HCons[String,HCons[String,HCons[String,HCons[java.sql.Blob,HCons[java.sql.Blob,HCons[scala.math.BigDecimal,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[String,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[Int,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for MEcccompanyRow providing default values if available in the database schema. */
  def MEcccompanyRow(mEcccompanyId: Int, mEcccompanyEmail: String, mEcccompanyName: String, mEcccompanyDaihyo: String, mEcccompanyZip: String, mEcccompanyCountry: String, mEcccompanyAddressSho: String, mEcccompanyMRegionProvinceProvinceid: Int = 0, mEcccompanyMRegionCityCityid: Int = 0, mEcccompanyMRegionAreaAreaid: Int = 0, mEcccompanyAddressShi: String, mEcccompanyAddressDetail: String, mEcccompanyChargearea: Int, mEcccompanyTel: String, mEcccompanyFax: String, mEcccompanyTel2: String, mEcccompanyPic1: java.sql.Blob, mEcccompanyPic2: java.sql.Blob, mEcccompanyMarginQuota1: scala.math.BigDecimal, mEcccompanyMarginQuota2: Int, mEcccompanyMarginQuota3: Int, mEcccompanyMarginQuota4: Int, mEcccompanyMarginQuota5: Int, mEcccompanyRegistToken: String, mEcccompanyRdatetime: java.sql.Timestamp, mEcccompanyUdatetime: java.sql.Timestamp, mEcccompanyVoidFlag: Int): MEcccompanyRow = {
    mEcccompanyId :: mEcccompanyEmail :: mEcccompanyName :: mEcccompanyDaihyo :: mEcccompanyZip :: mEcccompanyCountry :: mEcccompanyAddressSho :: mEcccompanyMRegionProvinceProvinceid :: mEcccompanyMRegionCityCityid :: mEcccompanyMRegionAreaAreaid :: mEcccompanyAddressShi :: mEcccompanyAddressDetail :: mEcccompanyChargearea :: mEcccompanyTel :: mEcccompanyFax :: mEcccompanyTel2 :: mEcccompanyPic1 :: mEcccompanyPic2 :: mEcccompanyMarginQuota1 :: mEcccompanyMarginQuota2 :: mEcccompanyMarginQuota3 :: mEcccompanyMarginQuota4 :: mEcccompanyMarginQuota5 :: mEcccompanyRegistToken :: mEcccompanyRdatetime :: mEcccompanyUdatetime :: mEcccompanyVoidFlag :: HNil
  }
  /** GetResult implicit for fetching MEcccompanyRow objects using plain SQL queries */
  implicit def GetResultMEcccompanyRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Blob], e3: GR[scala.math.BigDecimal], e4: GR[java.sql.Timestamp]): GR[MEcccompanyRow] = GR{
    prs => import prs._
    <<[Int] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[String] :: <<[String] :: <<[Int] :: <<[String] :: <<[String] :: <<[String] :: <<[java.sql.Blob] :: <<[java.sql.Blob] :: <<[scala.math.BigDecimal] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[String] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[Int] :: HNil
  }
  /** Table description of table m_ecccompany. Objects of this class serve as prototypes for rows in queries. */
  class MEcccompany(_tableTag: Tag) extends Table[MEcccompanyRow](_tableTag, "m_ecccompany") {
    def * = mEcccompanyId :: mEcccompanyEmail :: mEcccompanyName :: mEcccompanyDaihyo :: mEcccompanyZip :: mEcccompanyCountry :: mEcccompanyAddressSho :: mEcccompanyMRegionProvinceProvinceid :: mEcccompanyMRegionCityCityid :: mEcccompanyMRegionAreaAreaid :: mEcccompanyAddressShi :: mEcccompanyAddressDetail :: mEcccompanyChargearea :: mEcccompanyTel :: mEcccompanyFax :: mEcccompanyTel2 :: mEcccompanyPic1 :: mEcccompanyPic2 :: mEcccompanyMarginQuota1 :: mEcccompanyMarginQuota2 :: mEcccompanyMarginQuota3 :: mEcccompanyMarginQuota4 :: mEcccompanyMarginQuota5 :: mEcccompanyRegistToken :: mEcccompanyRdatetime :: mEcccompanyUdatetime :: mEcccompanyVoidFlag :: HNil
    
    /** Database column m_ecccompany_id DBType(INT), AutoInc, PrimaryKey */
    val mEcccompanyId: Column[Int] = column[Int]("m_ecccompany_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_ecccompany_email DBType(VARCHAR), Length(100,true) */
    val mEcccompanyEmail: Column[String] = column[String]("m_ecccompany_email", O.Length(100,varying=true))
    /** Database column m_ecccompany_name DBType(VARCHAR), Length(100,true) */
    val mEcccompanyName: Column[String] = column[String]("m_ecccompany_name", O.Length(100,varying=true))
    /** Database column m_ecccompany_daihyo DBType(VARCHAR), Length(100,true) */
    val mEcccompanyDaihyo: Column[String] = column[String]("m_ecccompany_daihyo", O.Length(100,varying=true))
    /** Database column m_ecccompany_zip DBType(VARCHAR), Length(10,true) */
    val mEcccompanyZip: Column[String] = column[String]("m_ecccompany_zip", O.Length(10,varying=true))
    /** Database column m_ecccompany_country DBType(VARCHAR), Length(10,true) */
    val mEcccompanyCountry: Column[String] = column[String]("m_ecccompany_country", O.Length(10,varying=true))
    /** Database column m_ecccompany_address_sho DBType(VARCHAR), Length(10,true) */
    val mEcccompanyAddressSho: Column[String] = column[String]("m_ecccompany_address_sho", O.Length(10,varying=true))
    /** Database column m_ecccompany_m_region_province_provinceid DBType(INT UNSIGNED), Default(0) */
    val mEcccompanyMRegionProvinceProvinceid: Column[Int] = column[Int]("m_ecccompany_m_region_province_provinceid", O.Default(0))
    /** Database column m_ecccompany_m_region_city_cityid DBType(INT UNSIGNED), Default(0) */
    val mEcccompanyMRegionCityCityid: Column[Int] = column[Int]("m_ecccompany_m_region_city_cityid", O.Default(0))
    /** Database column m_ecccompany_m_region_area_areaid DBType(INT UNSIGNED), Default(0) */
    val mEcccompanyMRegionAreaAreaid: Column[Int] = column[Int]("m_ecccompany_m_region_area_areaid", O.Default(0))
    /** Database column m_ecccompany_address_shi DBType(VARCHAR), Length(10,true) */
    val mEcccompanyAddressShi: Column[String] = column[String]("m_ecccompany_address_shi", O.Length(10,varying=true))
    /** Database column m_ecccompany_address_detail DBType(VARCHAR), Length(100,true) */
    val mEcccompanyAddressDetail: Column[String] = column[String]("m_ecccompany_address_detail", O.Length(100,varying=true))
    /** Database column m_ecccompany_chargearea DBType(INT) */
    val mEcccompanyChargearea: Column[Int] = column[Int]("m_ecccompany_chargearea")
    /** Database column m_ecccompany_tel DBType(VARCHAR), Length(100,true) */
    val mEcccompanyTel: Column[String] = column[String]("m_ecccompany_tel", O.Length(100,varying=true))
    /** Database column m_ecccompany_fax DBType(VARCHAR), Length(100,true) */
    val mEcccompanyFax: Column[String] = column[String]("m_ecccompany_fax", O.Length(100,varying=true))
    /** Database column m_ecccompany_tel2 DBType(VARCHAR), Length(20,true) */
    val mEcccompanyTel2: Column[String] = column[String]("m_ecccompany_tel2", O.Length(20,varying=true))
    /** Database column m_ecccompany_pic1 DBType(MEDIUMBLOB) */
    val mEcccompanyPic1: Column[java.sql.Blob] = column[java.sql.Blob]("m_ecccompany_pic1")
    /** Database column m_ecccompany_pic2 DBType(MEDIUMBLOB) */
    val mEcccompanyPic2: Column[java.sql.Blob] = column[java.sql.Blob]("m_ecccompany_pic2")
    /** Database column m_ecccompany_margin_quota1 DBType(DECIMAL) */
    val mEcccompanyMarginQuota1: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_ecccompany_margin_quota1")
    /** Database column m_ecccompany_margin_quota2 DBType(INT) */
    val mEcccompanyMarginQuota2: Column[Int] = column[Int]("m_ecccompany_margin_quota2")
    /** Database column m_ecccompany_margin_quota3 DBType(INT) */
    val mEcccompanyMarginQuota3: Column[Int] = column[Int]("m_ecccompany_margin_quota3")
    /** Database column m_ecccompany_margin_quota4 DBType(INT) */
    val mEcccompanyMarginQuota4: Column[Int] = column[Int]("m_ecccompany_margin_quota4")
    /** Database column m_ecccompany_margin_quota5 DBType(INT) */
    val mEcccompanyMarginQuota5: Column[Int] = column[Int]("m_ecccompany_margin_quota5")
    /** Database column m_ecccompany_regist_token DBType(VARCHAR), Length(32,true) */
    val mEcccompanyRegistToken: Column[String] = column[String]("m_ecccompany_regist_token", O.Length(32,varying=true))
    /** Database column m_ecccompany_rdatetime DBType(DATETIME) */
    val mEcccompanyRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_ecccompany_rdatetime")
    /** Database column m_ecccompany_udatetime DBType(DATETIME) */
    val mEcccompanyUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_ecccompany_udatetime")
    /** Database column m_ecccompany_void_flag DBType(INT) */
    val mEcccompanyVoidFlag: Column[Int] = column[Int]("m_ecccompany_void_flag")
  }
  /** Collection-like TableQuery object for table MEcccompany */
  lazy val MEcccompany = new TableQuery(tag => new MEcccompany(tag))
  
  /** Entity class storing rows of table MEcccompanymeta
   *  @param mEcccompanymetaId Database column m_ecccompanymeta_id DBType(INT), AutoInc, PrimaryKey
   *  @param mEcccompanymetaMEcccompanyId Database column m_ecccompanymeta_m_ecccompany_id DBType(INT)
   *  @param mEcccompanymetaKey Database column m_ecccompanymeta_key DBType(VARCHAR), Length(20,true)
   *  @param mEcccompanymetaData Database column m_ecccompanymeta_data DBType(MEDIUMBLOB)
   *  @param mEcccompanymetaMime Database column m_ecccompanymeta_mime DBType(VARCHAR), Length(100,true)
   *  @param mEcccompanymetaRdatetime Database column m_ecccompanymeta_rdatetime DBType(DATETIME) */
  case class MEcccompanymetaRow(mEcccompanymetaId: Int, mEcccompanymetaMEcccompanyId: Int, mEcccompanymetaKey: String, mEcccompanymetaData: java.sql.Blob, mEcccompanymetaMime: String, mEcccompanymetaRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MEcccompanymetaRow objects using plain SQL queries */
  implicit def GetResultMEcccompanymetaRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Blob], e3: GR[java.sql.Timestamp]): GR[MEcccompanymetaRow] = GR{
    prs => import prs._
    MEcccompanymetaRow.tupled((<<[Int], <<[Int], <<[String], <<[java.sql.Blob], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_ecccompanymeta. Objects of this class serve as prototypes for rows in queries. */
  class MEcccompanymeta(_tableTag: Tag) extends Table[MEcccompanymetaRow](_tableTag, "m_ecccompanymeta") {
    def * = (mEcccompanymetaId, mEcccompanymetaMEcccompanyId, mEcccompanymetaKey, mEcccompanymetaData, mEcccompanymetaMime, mEcccompanymetaRdatetime) <> (MEcccompanymetaRow.tupled, MEcccompanymetaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mEcccompanymetaId.?, mEcccompanymetaMEcccompanyId.?, mEcccompanymetaKey.?, mEcccompanymetaData.?, mEcccompanymetaMime.?, mEcccompanymetaRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MEcccompanymetaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_ecccompanymeta_id DBType(INT), AutoInc, PrimaryKey */
    val mEcccompanymetaId: Column[Int] = column[Int]("m_ecccompanymeta_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_ecccompanymeta_m_ecccompany_id DBType(INT) */
    val mEcccompanymetaMEcccompanyId: Column[Int] = column[Int]("m_ecccompanymeta_m_ecccompany_id")
    /** Database column m_ecccompanymeta_key DBType(VARCHAR), Length(20,true) */
    val mEcccompanymetaKey: Column[String] = column[String]("m_ecccompanymeta_key", O.Length(20,varying=true))
    /** Database column m_ecccompanymeta_data DBType(MEDIUMBLOB) */
    val mEcccompanymetaData: Column[java.sql.Blob] = column[java.sql.Blob]("m_ecccompanymeta_data")
    /** Database column m_ecccompanymeta_mime DBType(VARCHAR), Length(100,true) */
    val mEcccompanymetaMime: Column[String] = column[String]("m_ecccompanymeta_mime", O.Length(100,varying=true))
    /** Database column m_ecccompanymeta_rdatetime DBType(DATETIME) */
    val mEcccompanymetaRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_ecccompanymeta_rdatetime")
    
    /** Uniqueness Index over (mEcccompanymetaMEcccompanyId,mEcccompanymetaKey) (database name m_ecccompanymeta_m_maker_id) */
    val index1 = index("m_ecccompanymeta_m_maker_id", (mEcccompanymetaMEcccompanyId, mEcccompanymetaKey), unique=true)
  }
  /** Collection-like TableQuery object for table MEcccompanymeta */
  lazy val MEcccompanymeta = new TableQuery(tag => new MEcccompanymeta(tag))
  
  /** Entity class storing rows of table MEccmargin
   *  @param mEccmarginId Database column m_eccmargin_id DBType(INT), AutoInc, PrimaryKey
   *  @param mEccmarginMMakerId Database column m_eccmargin_m_maker_id DBType(INT)
   *  @param mEccmarginMEcccompanyId Database column m_eccmargin_m_ecccompany_id DBType(INT)
   *  @param mEccmarginSalesMEccstaffId Database column m_eccmargin_sales_m_eccstaff_id DBType(INT)
   *  @param mEccmarginEccMEccstaffId Database column m_eccmargin_ecc_m_eccstaff_id DBType(INT)
   *  @param mEccmarginCalcdate Database column m_eccmargin_calcdate DBType(DATE)
   *  @param mEccmarginSumtotal Database column m_eccmargin_sumtotal DBType(DECIMAL)
   *  @param mEccmarginStMarginPercent Database column m_eccmargin_st_margin_percent DBType(DECIMAL)
   *  @param mEccmarginDatecount Database column m_eccmargin_datecount DBType(INT)
   *  @param mEccmarginMarginPercent Database column m_eccmargin_margin_percent DBType(DECIMAL)
   *  @param mEccmarginMarginPrice Database column m_eccmargin_margin_price DBType(DECIMAL)
   *  @param mEccmarginRdatetime Database column m_eccmargin_rdatetime DBType(DATETIME) */
  case class MEccmarginRow(mEccmarginId: Int, mEccmarginMMakerId: Int, mEccmarginMEcccompanyId: Int, mEccmarginSalesMEccstaffId: Int, mEccmarginEccMEccstaffId: Int, mEccmarginCalcdate: java.sql.Date, mEccmarginSumtotal: scala.math.BigDecimal, mEccmarginStMarginPercent: scala.math.BigDecimal, mEccmarginDatecount: Int, mEccmarginMarginPercent: scala.math.BigDecimal, mEccmarginMarginPrice: scala.math.BigDecimal, mEccmarginRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MEccmarginRow objects using plain SQL queries */
  implicit def GetResultMEccmarginRow(implicit e0: GR[Int], e1: GR[java.sql.Date], e2: GR[scala.math.BigDecimal], e3: GR[java.sql.Timestamp]): GR[MEccmarginRow] = GR{
    prs => import prs._
    MEccmarginRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[java.sql.Date], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_eccmargin. Objects of this class serve as prototypes for rows in queries. */
  class MEccmargin(_tableTag: Tag) extends Table[MEccmarginRow](_tableTag, "m_eccmargin") {
    def * = (mEccmarginId, mEccmarginMMakerId, mEccmarginMEcccompanyId, mEccmarginSalesMEccstaffId, mEccmarginEccMEccstaffId, mEccmarginCalcdate, mEccmarginSumtotal, mEccmarginStMarginPercent, mEccmarginDatecount, mEccmarginMarginPercent, mEccmarginMarginPrice, mEccmarginRdatetime) <> (MEccmarginRow.tupled, MEccmarginRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mEccmarginId.?, mEccmarginMMakerId.?, mEccmarginMEcccompanyId.?, mEccmarginSalesMEccstaffId.?, mEccmarginEccMEccstaffId.?, mEccmarginCalcdate.?, mEccmarginSumtotal.?, mEccmarginStMarginPercent.?, mEccmarginDatecount.?, mEccmarginMarginPercent.?, mEccmarginMarginPrice.?, mEccmarginRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MEccmarginRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_eccmargin_id DBType(INT), AutoInc, PrimaryKey */
    val mEccmarginId: Column[Int] = column[Int]("m_eccmargin_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_eccmargin_m_maker_id DBType(INT) */
    val mEccmarginMMakerId: Column[Int] = column[Int]("m_eccmargin_m_maker_id")
    /** Database column m_eccmargin_m_ecccompany_id DBType(INT) */
    val mEccmarginMEcccompanyId: Column[Int] = column[Int]("m_eccmargin_m_ecccompany_id")
    /** Database column m_eccmargin_sales_m_eccstaff_id DBType(INT) */
    val mEccmarginSalesMEccstaffId: Column[Int] = column[Int]("m_eccmargin_sales_m_eccstaff_id")
    /** Database column m_eccmargin_ecc_m_eccstaff_id DBType(INT) */
    val mEccmarginEccMEccstaffId: Column[Int] = column[Int]("m_eccmargin_ecc_m_eccstaff_id")
    /** Database column m_eccmargin_calcdate DBType(DATE) */
    val mEccmarginCalcdate: Column[java.sql.Date] = column[java.sql.Date]("m_eccmargin_calcdate")
    /** Database column m_eccmargin_sumtotal DBType(DECIMAL) */
    val mEccmarginSumtotal: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_eccmargin_sumtotal")
    /** Database column m_eccmargin_st_margin_percent DBType(DECIMAL) */
    val mEccmarginStMarginPercent: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_eccmargin_st_margin_percent")
    /** Database column m_eccmargin_datecount DBType(INT) */
    val mEccmarginDatecount: Column[Int] = column[Int]("m_eccmargin_datecount")
    /** Database column m_eccmargin_margin_percent DBType(DECIMAL) */
    val mEccmarginMarginPercent: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_eccmargin_margin_percent")
    /** Database column m_eccmargin_margin_price DBType(DECIMAL) */
    val mEccmarginMarginPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_eccmargin_margin_price")
    /** Database column m_eccmargin_rdatetime DBType(DATETIME) */
    val mEccmarginRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_eccmargin_rdatetime")
  }
  /** Collection-like TableQuery object for table MEccmargin */
  lazy val MEccmargin = new TableQuery(tag => new MEccmargin(tag))
  
  /** Entity class storing rows of table MEccstaff
   *  @param mEccstaffId Database column m_eccstaff_id DBType(INT), AutoInc, PrimaryKey
   *  @param mEccstaffMEcccompanyId Database column m_eccstaff_m_ecccompany_id DBType(INT)
   *  @param mEccstaffAccount Database column m_eccstaff_account DBType(VARCHAR), Length(64,true)
   *  @param mEccstaffPassword Database column m_eccstaff_password DBType(VARCHAR), Length(64,true)
   *  @param mEccstaffSalt Database column m_eccstaff_salt DBType(CHAR), Length(15,false), Default()
   *  @param mEccstaffName Database column m_eccstaff_name DBType(VARCHAR), Length(20,true)
   *  @param mEccstaffAuthority Database column m_eccstaff_authority DBType(INT)
   *  @param mEccstaffNumber Database column m_eccstaff_number DBType(INT)
   *  @param mEccstaffEmail Database column m_eccstaff_email DBType(VARCHAR), Length(100,true)
   *  @param mEccstaffQq Database column m_eccstaff_qq DBType(VARCHAR), Length(100,true)
   *  @param mEccstaffTel Database column m_eccstaff_tel DBType(VARCHAR), Length(20,true)
   *  @param mEccstaffPic Database column m_eccstaff_pic DBType(MEDIUMBLOB)
   *  @param mEccstaffRdatetime Database column m_eccstaff_rdatetime DBType(DATETIME)
   *  @param mEccstaffUdatetime Database column m_eccstaff_udatetime DBType(DATETIME)
   *  @param mEccstaffVoidFlag Database column m_eccstaff_void_flag DBType(INT) */
  case class MEccstaffRow(mEccstaffId: Int, mEccstaffMEcccompanyId: Int, mEccstaffAccount: String, mEccstaffPassword: String, mEccstaffSalt: String = "", mEccstaffName: String, mEccstaffAuthority: Int, mEccstaffNumber: Int, mEccstaffEmail: String, mEccstaffQq: String, mEccstaffTel: String, mEccstaffPic: java.sql.Blob, mEccstaffRdatetime: java.sql.Timestamp, mEccstaffUdatetime: java.sql.Timestamp, mEccstaffVoidFlag: Int)
  /** GetResult implicit for fetching MEccstaffRow objects using plain SQL queries */
  implicit def GetResultMEccstaffRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Blob], e3: GR[java.sql.Timestamp]): GR[MEccstaffRow] = GR{
    prs => import prs._
    MEccstaffRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[java.sql.Blob], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int]))
  }
  /** Table description of table m_eccstaff. Objects of this class serve as prototypes for rows in queries. */
  class MEccstaff(_tableTag: Tag) extends Table[MEccstaffRow](_tableTag, "m_eccstaff") {
    def * = (mEccstaffId, mEccstaffMEcccompanyId, mEccstaffAccount, mEccstaffPassword, mEccstaffSalt, mEccstaffName, mEccstaffAuthority, mEccstaffNumber, mEccstaffEmail, mEccstaffQq, mEccstaffTel, mEccstaffPic, mEccstaffRdatetime, mEccstaffUdatetime, mEccstaffVoidFlag) <> (MEccstaffRow.tupled, MEccstaffRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mEccstaffId.?, mEccstaffMEcccompanyId.?, mEccstaffAccount.?, mEccstaffPassword.?, mEccstaffSalt.?, mEccstaffName.?, mEccstaffAuthority.?, mEccstaffNumber.?, mEccstaffEmail.?, mEccstaffQq.?, mEccstaffTel.?, mEccstaffPic.?, mEccstaffRdatetime.?, mEccstaffUdatetime.?, mEccstaffVoidFlag.?).shaped.<>({r=>import r._; _1.map(_=> MEccstaffRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_eccstaff_id DBType(INT), AutoInc, PrimaryKey */
    val mEccstaffId: Column[Int] = column[Int]("m_eccstaff_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_eccstaff_m_ecccompany_id DBType(INT) */
    val mEccstaffMEcccompanyId: Column[Int] = column[Int]("m_eccstaff_m_ecccompany_id")
    /** Database column m_eccstaff_account DBType(VARCHAR), Length(64,true) */
    val mEccstaffAccount: Column[String] = column[String]("m_eccstaff_account", O.Length(64,varying=true))
    /** Database column m_eccstaff_password DBType(VARCHAR), Length(64,true) */
    val mEccstaffPassword: Column[String] = column[String]("m_eccstaff_password", O.Length(64,varying=true))
    /** Database column m_eccstaff_salt DBType(CHAR), Length(15,false), Default() */
    val mEccstaffSalt: Column[String] = column[String]("m_eccstaff_salt", O.Length(15,varying=false), O.Default(""))
    /** Database column m_eccstaff_name DBType(VARCHAR), Length(20,true) */
    val mEccstaffName: Column[String] = column[String]("m_eccstaff_name", O.Length(20,varying=true))
    /** Database column m_eccstaff_authority DBType(INT) */
    val mEccstaffAuthority: Column[Int] = column[Int]("m_eccstaff_authority")
    /** Database column m_eccstaff_number DBType(INT) */
    val mEccstaffNumber: Column[Int] = column[Int]("m_eccstaff_number")
    /** Database column m_eccstaff_email DBType(VARCHAR), Length(100,true) */
    val mEccstaffEmail: Column[String] = column[String]("m_eccstaff_email", O.Length(100,varying=true))
    /** Database column m_eccstaff_qq DBType(VARCHAR), Length(100,true) */
    val mEccstaffQq: Column[String] = column[String]("m_eccstaff_qq", O.Length(100,varying=true))
    /** Database column m_eccstaff_tel DBType(VARCHAR), Length(20,true) */
    val mEccstaffTel: Column[String] = column[String]("m_eccstaff_tel", O.Length(20,varying=true))
    /** Database column m_eccstaff_pic DBType(MEDIUMBLOB) */
    val mEccstaffPic: Column[java.sql.Blob] = column[java.sql.Blob]("m_eccstaff_pic")
    /** Database column m_eccstaff_rdatetime DBType(DATETIME) */
    val mEccstaffRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_eccstaff_rdatetime")
    /** Database column m_eccstaff_udatetime DBType(DATETIME) */
    val mEccstaffUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_eccstaff_udatetime")
    /** Database column m_eccstaff_void_flag DBType(INT) */
    val mEccstaffVoidFlag: Column[Int] = column[Int]("m_eccstaff_void_flag")
  }
  /** Collection-like TableQuery object for table MEccstaff */
  lazy val MEccstaff = new TableQuery(tag => new MEccstaff(tag))
  
  /** Entity class storing rows of table MEccstaffmeta
   *  @param mEccstaffmetaId Database column m_eccstaffmeta_id DBType(INT), AutoInc, PrimaryKey
   *  @param mEccstaffmetaMEccstaffId Database column m_eccstaffmeta_m_eccstaff_id DBType(INT)
   *  @param mEccstaffmetaKey Database column m_eccstaffmeta_key DBType(VARCHAR), Length(20,true)
   *  @param mEccstaffmetaData Database column m_eccstaffmeta_data DBType(MEDIUMBLOB)
   *  @param mEccstaffmetaMime Database column m_eccstaffmeta_mime DBType(VARCHAR), Length(100,true)
   *  @param mEccstaffmetaRdatetime Database column m_eccstaffmeta_rdatetime DBType(DATETIME) */
  case class MEccstaffmetaRow(mEccstaffmetaId: Int, mEccstaffmetaMEccstaffId: Int, mEccstaffmetaKey: String, mEccstaffmetaData: java.sql.Blob, mEccstaffmetaMime: String, mEccstaffmetaRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MEccstaffmetaRow objects using plain SQL queries */
  implicit def GetResultMEccstaffmetaRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Blob], e3: GR[java.sql.Timestamp]): GR[MEccstaffmetaRow] = GR{
    prs => import prs._
    MEccstaffmetaRow.tupled((<<[Int], <<[Int], <<[String], <<[java.sql.Blob], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_eccstaffmeta. Objects of this class serve as prototypes for rows in queries. */
  class MEccstaffmeta(_tableTag: Tag) extends Table[MEccstaffmetaRow](_tableTag, "m_eccstaffmeta") {
    def * = (mEccstaffmetaId, mEccstaffmetaMEccstaffId, mEccstaffmetaKey, mEccstaffmetaData, mEccstaffmetaMime, mEccstaffmetaRdatetime) <> (MEccstaffmetaRow.tupled, MEccstaffmetaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mEccstaffmetaId.?, mEccstaffmetaMEccstaffId.?, mEccstaffmetaKey.?, mEccstaffmetaData.?, mEccstaffmetaMime.?, mEccstaffmetaRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MEccstaffmetaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_eccstaffmeta_id DBType(INT), AutoInc, PrimaryKey */
    val mEccstaffmetaId: Column[Int] = column[Int]("m_eccstaffmeta_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_eccstaffmeta_m_eccstaff_id DBType(INT) */
    val mEccstaffmetaMEccstaffId: Column[Int] = column[Int]("m_eccstaffmeta_m_eccstaff_id")
    /** Database column m_eccstaffmeta_key DBType(VARCHAR), Length(20,true) */
    val mEccstaffmetaKey: Column[String] = column[String]("m_eccstaffmeta_key", O.Length(20,varying=true))
    /** Database column m_eccstaffmeta_data DBType(MEDIUMBLOB) */
    val mEccstaffmetaData: Column[java.sql.Blob] = column[java.sql.Blob]("m_eccstaffmeta_data")
    /** Database column m_eccstaffmeta_mime DBType(VARCHAR), Length(100,true) */
    val mEccstaffmetaMime: Column[String] = column[String]("m_eccstaffmeta_mime", O.Length(100,varying=true))
    /** Database column m_eccstaffmeta_rdatetime DBType(DATETIME) */
    val mEccstaffmetaRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_eccstaffmeta_rdatetime")
    
    /** Uniqueness Index over (mEccstaffmetaMEccstaffId,mEccstaffmetaKey) (database name m_eccstaffmeta_m_maker_id) */
    val index1 = index("m_eccstaffmeta_m_maker_id", (mEccstaffmetaMEccstaffId, mEccstaffmetaKey), unique=true)
  }
  /** Collection-like TableQuery object for table MEccstaffmeta */
  lazy val MEccstaffmeta = new TableQuery(tag => new MEccstaffmeta(tag))
  
  /** Entity class storing rows of table MGroup
   *  @param mGroupId Database column m_group_id DBType(INT), AutoInc, PrimaryKey
   *  @param mGroupVoidFlag Database column m_group_void_flag DBType(BIT), Default(false)
   *  @param mGroupName Database column m_group_name DBType(VARCHAR), Length(50,true), Default()
   *  @param mGroupNote Database column m_group_note DBType(TEXT), Length(65535,true)
   *  @param mGroupRuser Database column m_group_ruser DBType(INT), Default(0)
   *  @param mGroupUuser Database column m_group_uuser DBType(INT), Default(0)
   *  @param mGroupRdatetime Database column m_group_rdatetime DBType(DATETIME)
   *  @param mGroupUdatetime Database column m_group_udatetime DBType(DATETIME) */
  case class MGroupRow(mGroupId: Int, mGroupVoidFlag: Boolean = false, mGroupName: String = "", mGroupNote: String, mGroupRuser: Int = 0, mGroupUuser: Int = 0, mGroupRdatetime: java.sql.Timestamp, mGroupUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MGroupRow objects using plain SQL queries */
  implicit def GetResultMGroupRow(implicit e0: GR[Int], e1: GR[Boolean], e2: GR[String], e3: GR[java.sql.Timestamp]): GR[MGroupRow] = GR{
    prs => import prs._
    MGroupRow.tupled((<<[Int], <<[Boolean], <<[String], <<[String], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_group. Objects of this class serve as prototypes for rows in queries. */
  class MGroup(_tableTag: Tag) extends Table[MGroupRow](_tableTag, "m_group") {
    def * = (mGroupId, mGroupVoidFlag, mGroupName, mGroupNote, mGroupRuser, mGroupUuser, mGroupRdatetime, mGroupUdatetime) <> (MGroupRow.tupled, MGroupRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mGroupId.?, mGroupVoidFlag.?, mGroupName.?, mGroupNote.?, mGroupRuser.?, mGroupUuser.?, mGroupRdatetime.?, mGroupUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MGroupRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_group_id DBType(INT), AutoInc, PrimaryKey */
    val mGroupId: Column[Int] = column[Int]("m_group_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_group_void_flag DBType(BIT), Default(false) */
    val mGroupVoidFlag: Column[Boolean] = column[Boolean]("m_group_void_flag", O.Default(false))
    /** Database column m_group_name DBType(VARCHAR), Length(50,true), Default() */
    val mGroupName: Column[String] = column[String]("m_group_name", O.Length(50,varying=true), O.Default(""))
    /** Database column m_group_note DBType(TEXT), Length(65535,true) */
    val mGroupNote: Column[String] = column[String]("m_group_note", O.Length(65535,varying=true))
    /** Database column m_group_ruser DBType(INT), Default(0) */
    val mGroupRuser: Column[Int] = column[Int]("m_group_ruser", O.Default(0))
    /** Database column m_group_uuser DBType(INT), Default(0) */
    val mGroupUuser: Column[Int] = column[Int]("m_group_uuser", O.Default(0))
    /** Database column m_group_rdatetime DBType(DATETIME) */
    val mGroupRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_group_rdatetime")
    /** Database column m_group_udatetime DBType(DATETIME) */
    val mGroupUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_group_udatetime")
  }
  /** Collection-like TableQuery object for table MGroup */
  lazy val MGroup = new TableQuery(tag => new MGroup(tag))
  
  /** Row type of table MItem */
  type MItemRow = HCons[Int,HCons[Int,HCons[Byte,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Int,HCons[Int,HCons[scala.math.BigDecimal,HCons[scala.math.BigDecimal,HCons[Int,HCons[scala.math.BigDecimal,HCons[Byte,HCons[Int,HCons[java.sql.Timestamp,HCons[Int,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[Option[Short],HCons[String,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for MItemRow providing default values if available in the database schema. */
  def MItemRow(mItemId: Int, mItemVoidFlag: Int = 0, mItemActionFlag: Byte = 0, mItemDeleteFlag: Int, mItemExceptSaleFlag: Int, mItemTApplicationId: Int, mItemMMakerId: Int, mItemMCategoryId: Int, mItemType: Int, mItemCode: String, mItemName: String, mItemNameKana: String, mItemDescription: String, mItemSpec: String, mItemIngredient: String, mItemProperty: String, mItemMImageIdOld: Int, mItemMImageId: Int, mItemMinPrice: scala.math.BigDecimal, mItemMaxPrice: scala.math.BigDecimal, mItemOrder: Int, mItemSaleDoller: scala.math.BigDecimal = "0.00", mItemSaleFlag: Byte = 0, mItemRuser: Int, mItemRdatetime: java.sql.Timestamp, mItemUuser: Int, mItemAutoFlag: Byte = 0, mItemRunFlag: Byte = 0, mItemGoodsFlag: Byte = 0, mItemDifferPrice: Byte = 0, mItemAutotimeFlag: Byte = 0, mItemActivityChangeExceptSaleFlag: Byte = 0, mItemTApplicationTimedate: java.sql.Timestamp, mItemUdatetime: java.sql.Timestamp, mItemDownDatetime: java.sql.Timestamp, mItemMinBulk: Option[Short] = Some(1), mItemTransRevision: String = "n"): MItemRow = {
    mItemId :: mItemVoidFlag :: mItemActionFlag :: mItemDeleteFlag :: mItemExceptSaleFlag :: mItemTApplicationId :: mItemMMakerId :: mItemMCategoryId :: mItemType :: mItemCode :: mItemName :: mItemNameKana :: mItemDescription :: mItemSpec :: mItemIngredient :: mItemProperty :: mItemMImageIdOld :: mItemMImageId :: mItemMinPrice :: mItemMaxPrice :: mItemOrder :: mItemSaleDoller :: mItemSaleFlag :: mItemRuser :: mItemRdatetime :: mItemUuser :: mItemAutoFlag :: mItemRunFlag :: mItemGoodsFlag :: mItemDifferPrice :: mItemAutotimeFlag :: mItemActivityChangeExceptSaleFlag :: mItemTApplicationTimedate :: mItemUdatetime :: mItemDownDatetime :: mItemMinBulk :: mItemTransRevision :: HNil
  }
  /** GetResult implicit for fetching MItemRow objects using plain SQL queries */
  implicit def GetResultMItemRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[scala.math.BigDecimal], e4: GR[java.sql.Timestamp], e5: GR[Option[Short]]): GR[MItemRow] = GR{
    prs => import prs._
    <<[Int] :: <<[Int] :: <<[Byte] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Int] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[scala.math.BigDecimal] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[Byte] :: <<[Int] :: <<[java.sql.Timestamp] :: <<[Int] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<?[Short] :: <<[String] :: HNil
  }
  /** Table description of table m_item. Objects of this class serve as prototypes for rows in queries. */
  class MItem(_tableTag: Tag) extends Table[MItemRow](_tableTag, "m_item") {
    def * = mItemId :: mItemVoidFlag :: mItemActionFlag :: mItemDeleteFlag :: mItemExceptSaleFlag :: mItemTApplicationId :: mItemMMakerId :: mItemMCategoryId :: mItemType :: mItemCode :: mItemName :: mItemNameKana :: mItemDescription :: mItemSpec :: mItemIngredient :: mItemProperty :: mItemMImageIdOld :: mItemMImageId :: mItemMinPrice :: mItemMaxPrice :: mItemOrder :: mItemSaleDoller :: mItemSaleFlag :: mItemRuser :: mItemRdatetime :: mItemUuser :: mItemAutoFlag :: mItemRunFlag :: mItemGoodsFlag :: mItemDifferPrice :: mItemAutotimeFlag :: mItemActivityChangeExceptSaleFlag :: mItemTApplicationTimedate :: mItemUdatetime :: mItemDownDatetime :: mItemMinBulk :: mItemTransRevision :: HNil
    
    /** Database column m_item_id DBType(INT), AutoInc, PrimaryKey */
    val mItemId: Column[Int] = column[Int]("m_item_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_item_void_flag DBType(INT), Default(0) */
    val mItemVoidFlag: Column[Int] = column[Int]("m_item_void_flag", O.Default(0))
    /** Database column m_item_action_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mItemActionFlag: Column[Byte] = column[Byte]("m_item_action_flag", O.Default(0))
    /** Database column m_item_delete_flag DBType(INT) */
    val mItemDeleteFlag: Column[Int] = column[Int]("m_item_delete_flag")
    /** Database column m_item_except_sale_flag DBType(INT) */
    val mItemExceptSaleFlag: Column[Int] = column[Int]("m_item_except_sale_flag")
    /** Database column m_item_t_application_id DBType(INT) */
    val mItemTApplicationId: Column[Int] = column[Int]("m_item_t_application_id")
    /** Database column m_item_m_maker_id DBType(INT) */
    val mItemMMakerId: Column[Int] = column[Int]("m_item_m_maker_id")
    /** Database column m_item_m_category_id DBType(INT) */
    val mItemMCategoryId: Column[Int] = column[Int]("m_item_m_category_id")
    /** Database column m_item_type DBType(INT) */
    val mItemType: Column[Int] = column[Int]("m_item_type")
    /** Database column m_item_code DBType(VARCHAR), Length(50,true) */
    val mItemCode: Column[String] = column[String]("m_item_code", O.Length(50,varying=true))
    /** Database column m_item_name DBType(VARCHAR), Length(100,true) */
    val mItemName: Column[String] = column[String]("m_item_name", O.Length(100,varying=true))
    /** Database column m_item_name_kana DBType(VARCHAR), Length(100,true) */
    val mItemNameKana: Column[String] = column[String]("m_item_name_kana", O.Length(100,varying=true))
    /** Database column m_item_description DBType(TEXT), Length(65535,true) */
    val mItemDescription: Column[String] = column[String]("m_item_description", O.Length(65535,varying=true))
    /** Database column m_item_spec DBType(TEXT), Length(65535,true) */
    val mItemSpec: Column[String] = column[String]("m_item_spec", O.Length(65535,varying=true))
    /** Database column m_item_ingredient DBType(VARCHAR), Length(200,true) */
    val mItemIngredient: Column[String] = column[String]("m_item_ingredient", O.Length(200,varying=true))
    /** Database column m_item_property DBType(VARCHAR), Length(200,true) */
    val mItemProperty: Column[String] = column[String]("m_item_property", O.Length(200,varying=true))
    /** Database column m_item_m_image_id_old DBType(INT) */
    val mItemMImageIdOld: Column[Int] = column[Int]("m_item_m_image_id_old")
    /** Database column m_item_m_image_id DBType(INT) */
    val mItemMImageId: Column[Int] = column[Int]("m_item_m_image_id")
    /** Database column m_item_min_price DBType(DECIMAL) */
    val mItemMinPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_min_price")
    /** Database column m_item_max_price DBType(DECIMAL) */
    val mItemMaxPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_max_price")
    /** Database column m_item_order DBType(INT) */
    val mItemOrder: Column[Int] = column[Int]("m_item_order")
    /** Database column m_item_sale_doller DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mItemSaleDoller: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_sale_doller", O.Default("0.00"))
    /** Database column m_item_sale_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mItemSaleFlag: Column[Byte] = column[Byte]("m_item_sale_flag", O.Default(0))
    /** Database column m_item_ruser DBType(INT) */
    val mItemRuser: Column[Int] = column[Int]("m_item_ruser")
    /** Database column m_item_rdatetime DBType(DATETIME) */
    val mItemRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_item_rdatetime")
    /** Database column m_item_uuser DBType(INT) */
    val mItemUuser: Column[Int] = column[Int]("m_item_uuser")
    /** Database column m_item_auto_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mItemAutoFlag: Column[Byte] = column[Byte]("m_item_auto_flag", O.Default(0))
    /** Database column m_item_run_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mItemRunFlag: Column[Byte] = column[Byte]("m_item_run_flag", O.Default(0))
    /** Database column m_item_goods_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mItemGoodsFlag: Column[Byte] = column[Byte]("m_item_goods_flag", O.Default(0))
    /** Database column m_item_differ_price DBType(TINYINT UNSIGNED), Default(0) */
    val mItemDifferPrice: Column[Byte] = column[Byte]("m_item_differ_price", O.Default(0))
    /** Database column m_item_autotime_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mItemAutotimeFlag: Column[Byte] = column[Byte]("m_item_autotime_flag", O.Default(0))
    /** Database column m_item_activity_change_except_sale_flag DBType(TINYINT), Default(0) */
    val mItemActivityChangeExceptSaleFlag: Column[Byte] = column[Byte]("m_item_activity_change_except_sale_flag", O.Default(0))
    /** Database column m_item_t_application_timedate DBType(DATETIME) */
    val mItemTApplicationTimedate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_item_t_application_timedate")
    /** Database column m_item_udatetime DBType(DATETIME) */
    val mItemUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_item_udatetime")
    /** Database column m_item_down_datetime DBType(DATETIME) */
    val mItemDownDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_item_down_datetime")
    /** Database column m_item_min_bulk DBType(SMALLINT), Default(Some(1)) */
    val mItemMinBulk: Column[Option[Short]] = column[Option[Short]]("m_item_min_bulk", O.Default(Some(1)))
    /** Database column m_item_trans_revision DBType(ENUM), Length(2,false), Default(n) */
    val mItemTransRevision: Column[String] = column[String]("m_item_trans_revision", O.Length(2,varying=false), O.Default("n"))
    
    /** Index over (mItemMMakerId) (database name m_item_m_maker_id) */
    val index1 = index("m_item_m_maker_id", mItemMMakerId :: HNil)
  }
  /** Collection-like TableQuery object for table MItem */
  lazy val MItem = new TableQuery(tag => new MItem(tag))
  
  /** Entity class storing rows of table MItemCh
   *  @param mItemChId Database column m_item_ch_id DBType(INT), AutoInc, PrimaryKey
   *  @param mItemChVoidFlag Database column m_item_ch_void_flag DBType(INT), Default(0)
   *  @param mItemChTApplicationId Database column m_item_ch_t_application_id DBType(INT)
   *  @param mItemChMMakerId Database column m_item_ch_m_maker_id DBType(INT)
   *  @param mItemChMCategoryId Database column m_item_ch_m_category_id DBType(INT)
   *  @param mItemChType Database column m_item_ch_type DBType(INT)
   *  @param mItemChCode Database column m_item_ch_code DBType(VARCHAR), Length(50,true)
   *  @param mItemChName Database column m_item_ch_name DBType(VARCHAR), Length(100,true)
   *  @param mItemChNameKana Database column m_item_ch_name_kana DBType(VARCHAR), Length(100,true)
   *  @param mItemChDescription Database column m_item_ch_description DBType(TEXT), Length(65535,true)
   *  @param mItemChSpec Database column m_item_ch_spec DBType(TEXT), Length(65535,true)
   *  @param mItemChIngredient Database column m_item_ch_ingredient DBType(VARCHAR), Length(200,true)
   *  @param mItemChProperty Database column m_item_ch_property DBType(VARCHAR), Length(200,true)
   *  @param mItemChOrder Database column m_item_ch_order DBType(INT)
   *  @param mItemChRuser Database column m_item_ch_ruser DBType(INT)
   *  @param mItemChRdatetime Database column m_item_ch_rdatetime DBType(DATETIME)
   *  @param mItemChUuser Database column m_item_ch_uuser DBType(INT)
   *  @param mItemChUdatetime Database column m_item_ch_udatetime DBType(DATETIME) */
  case class MItemChRow(mItemChId: Int, mItemChVoidFlag: Int = 0, mItemChTApplicationId: Int, mItemChMMakerId: Int, mItemChMCategoryId: Int, mItemChType: Int, mItemChCode: String, mItemChName: String, mItemChNameKana: String, mItemChDescription: String, mItemChSpec: String, mItemChIngredient: String, mItemChProperty: String, mItemChOrder: Int, mItemChRuser: Int, mItemChRdatetime: java.sql.Timestamp, mItemChUuser: Int, mItemChUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MItemChRow objects using plain SQL queries */
  implicit def GetResultMItemChRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MItemChRow] = GR{
    prs => import prs._
    MItemChRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_item_ch. Objects of this class serve as prototypes for rows in queries. */
  class MItemCh(_tableTag: Tag) extends Table[MItemChRow](_tableTag, "m_item_ch") {
    def * = (mItemChId, mItemChVoidFlag, mItemChTApplicationId, mItemChMMakerId, mItemChMCategoryId, mItemChType, mItemChCode, mItemChName, mItemChNameKana, mItemChDescription, mItemChSpec, mItemChIngredient, mItemChProperty, mItemChOrder, mItemChRuser, mItemChRdatetime, mItemChUuser, mItemChUdatetime) <> (MItemChRow.tupled, MItemChRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mItemChId.?, mItemChVoidFlag.?, mItemChTApplicationId.?, mItemChMMakerId.?, mItemChMCategoryId.?, mItemChType.?, mItemChCode.?, mItemChName.?, mItemChNameKana.?, mItemChDescription.?, mItemChSpec.?, mItemChIngredient.?, mItemChProperty.?, mItemChOrder.?, mItemChRuser.?, mItemChRdatetime.?, mItemChUuser.?, mItemChUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MItemChRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get, _18.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_item_ch_id DBType(INT), AutoInc, PrimaryKey */
    val mItemChId: Column[Int] = column[Int]("m_item_ch_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_item_ch_void_flag DBType(INT), Default(0) */
    val mItemChVoidFlag: Column[Int] = column[Int]("m_item_ch_void_flag", O.Default(0))
    /** Database column m_item_ch_t_application_id DBType(INT) */
    val mItemChTApplicationId: Column[Int] = column[Int]("m_item_ch_t_application_id")
    /** Database column m_item_ch_m_maker_id DBType(INT) */
    val mItemChMMakerId: Column[Int] = column[Int]("m_item_ch_m_maker_id")
    /** Database column m_item_ch_m_category_id DBType(INT) */
    val mItemChMCategoryId: Column[Int] = column[Int]("m_item_ch_m_category_id")
    /** Database column m_item_ch_type DBType(INT) */
    val mItemChType: Column[Int] = column[Int]("m_item_ch_type")
    /** Database column m_item_ch_code DBType(VARCHAR), Length(50,true) */
    val mItemChCode: Column[String] = column[String]("m_item_ch_code", O.Length(50,varying=true))
    /** Database column m_item_ch_name DBType(VARCHAR), Length(100,true) */
    val mItemChName: Column[String] = column[String]("m_item_ch_name", O.Length(100,varying=true))
    /** Database column m_item_ch_name_kana DBType(VARCHAR), Length(100,true) */
    val mItemChNameKana: Column[String] = column[String]("m_item_ch_name_kana", O.Length(100,varying=true))
    /** Database column m_item_ch_description DBType(TEXT), Length(65535,true) */
    val mItemChDescription: Column[String] = column[String]("m_item_ch_description", O.Length(65535,varying=true))
    /** Database column m_item_ch_spec DBType(TEXT), Length(65535,true) */
    val mItemChSpec: Column[String] = column[String]("m_item_ch_spec", O.Length(65535,varying=true))
    /** Database column m_item_ch_ingredient DBType(VARCHAR), Length(200,true) */
    val mItemChIngredient: Column[String] = column[String]("m_item_ch_ingredient", O.Length(200,varying=true))
    /** Database column m_item_ch_property DBType(VARCHAR), Length(200,true) */
    val mItemChProperty: Column[String] = column[String]("m_item_ch_property", O.Length(200,varying=true))
    /** Database column m_item_ch_order DBType(INT) */
    val mItemChOrder: Column[Int] = column[Int]("m_item_ch_order")
    /** Database column m_item_ch_ruser DBType(INT) */
    val mItemChRuser: Column[Int] = column[Int]("m_item_ch_ruser")
    /** Database column m_item_ch_rdatetime DBType(DATETIME) */
    val mItemChRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_item_ch_rdatetime")
    /** Database column m_item_ch_uuser DBType(INT) */
    val mItemChUuser: Column[Int] = column[Int]("m_item_ch_uuser")
    /** Database column m_item_ch_udatetime DBType(DATETIME) */
    val mItemChUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_item_ch_udatetime")
  }
  /** Collection-like TableQuery object for table MItemCh */
  lazy val MItemCh = new TableQuery(tag => new MItemCh(tag))
  
  /** Entity class storing rows of table MItemImg
   *  @param mItemImgId Database column m_item_img_id DBType(INT), AutoInc, PrimaryKey
   *  @param mItemImgMItemId Database column m_item_img_m_item_id DBType(INT)
   *  @param mItemImgMSpaceImageId Database column m_item_img_m_space_image_id DBType(INT)
   *  @param mItemImgOrder Database column m_item_img_order DBType(SMALLINT), Default(0)
   *  @param mItemImgRdatetime Database column m_item_img_rdatetime DBType(DATETIME)
   *  @param mItemImgUdatetime Database column m_item_img_udatetime DBType(DATETIME)
   *  @param mItemImgRuser Database column m_item_img_ruser DBType(INT)
   *  @param mItemImgUuser Database column m_item_img_uuser DBType(INT) */
  case class MItemImgRow(mItemImgId: Int, mItemImgMItemId: Int, mItemImgMSpaceImageId: Int, mItemImgOrder: Short = 0, mItemImgRdatetime: java.sql.Timestamp, mItemImgUdatetime: java.sql.Timestamp, mItemImgRuser: Int, mItemImgUuser: Int)
  /** GetResult implicit for fetching MItemImgRow objects using plain SQL queries */
  implicit def GetResultMItemImgRow(implicit e0: GR[Int], e1: GR[Short], e2: GR[java.sql.Timestamp]): GR[MItemImgRow] = GR{
    prs => import prs._
    MItemImgRow.tupled((<<[Int], <<[Int], <<[Int], <<[Short], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table m_item_img. Objects of this class serve as prototypes for rows in queries. */
  class MItemImg(_tableTag: Tag) extends Table[MItemImgRow](_tableTag, "m_item_img") {
    def * = (mItemImgId, mItemImgMItemId, mItemImgMSpaceImageId, mItemImgOrder, mItemImgRdatetime, mItemImgUdatetime, mItemImgRuser, mItemImgUuser) <> (MItemImgRow.tupled, MItemImgRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mItemImgId.?, mItemImgMItemId.?, mItemImgMSpaceImageId.?, mItemImgOrder.?, mItemImgRdatetime.?, mItemImgUdatetime.?, mItemImgRuser.?, mItemImgUuser.?).shaped.<>({r=>import r._; _1.map(_=> MItemImgRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_item_img_id DBType(INT), AutoInc, PrimaryKey */
    val mItemImgId: Column[Int] = column[Int]("m_item_img_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_item_img_m_item_id DBType(INT) */
    val mItemImgMItemId: Column[Int] = column[Int]("m_item_img_m_item_id")
    /** Database column m_item_img_m_space_image_id DBType(INT) */
    val mItemImgMSpaceImageId: Column[Int] = column[Int]("m_item_img_m_space_image_id")
    /** Database column m_item_img_order DBType(SMALLINT), Default(0) */
    val mItemImgOrder: Column[Short] = column[Short]("m_item_img_order", O.Default(0))
    /** Database column m_item_img_rdatetime DBType(DATETIME) */
    val mItemImgRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_item_img_rdatetime")
    /** Database column m_item_img_udatetime DBType(DATETIME) */
    val mItemImgUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_item_img_udatetime")
    /** Database column m_item_img_ruser DBType(INT) */
    val mItemImgRuser: Column[Int] = column[Int]("m_item_img_ruser")
    /** Database column m_item_img_uuser DBType(INT) */
    val mItemImgUuser: Column[Int] = column[Int]("m_item_img_uuser")
    
    /** Index over (mItemImgMItemId) (database name m_item_img_m_item_id) */
    val index1 = index("m_item_img_m_item_id", mItemImgMItemId)
    /** Index over (mItemImgMSpaceImageId) (database name m_item_img_m_space_image_id_index) */
    val index2 = index("m_item_img_m_space_image_id_index", mItemImgMSpaceImageId)
  }
  /** Collection-like TableQuery object for table MItemImg */
  lazy val MItemImg = new TableQuery(tag => new MItemImg(tag))
  
  /** Entity class storing rows of table MItemSearch
   *  @param mItemSearchId Database column m_item_search_id DBType(INT), AutoInc
   *  @param mItemSearchItemId Database column m_item_search_item_id DBType(INT UNSIGNED)
   *  @param mItemSearchIntegralGjz Database column m_item_search_integral_gjz DBType(DECIMAL)
   *  @param mItemSearchIntegralSpdj Database column m_item_search_integral_spdj DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralSpxl Database column m_item_search_integral_spxl DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralXjcp Database column m_item_search_integral_xjcp DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralXinsj Database column m_item_search_integral_xinsj DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralCpwz Database column m_item_search_integral_cpwz DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralDppf Database column m_item_search_integral_dppf DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralJfpf Database column m_item_search_integral_jfpf DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralChpf Database column m_item_search_integral_chpf DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralCpsjl Database column m_item_search_integral_cpsjl DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralDpscl Database column m_item_search_integral_dpscl DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralZhl Database column m_item_search_integral_zhl DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralDljl Database column m_item_search_integral_dljl DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralNewitem Database column m_item_search_integral_newitem DBType(DECIMAL)
   *  @param mItemSearchIntegral Database column m_item_search_integral DBType(DECIMAL), Default(0.000000)
   *  @param mItemSearchIntegralTmp Database column m_item_search_integral_tmp DBType(DECIMAL), Default(0.000000) */
  case class MItemSearchRow(mItemSearchId: Int, mItemSearchItemId: Int, mItemSearchIntegralGjz: scala.math.BigDecimal, mItemSearchIntegralSpdj: scala.math.BigDecimal = "0.000000", mItemSearchIntegralSpxl: scala.math.BigDecimal = "0.000000", mItemSearchIntegralXjcp: scala.math.BigDecimal = "0.000000", mItemSearchIntegralXinsj: scala.math.BigDecimal = "0.000000", mItemSearchIntegralCpwz: scala.math.BigDecimal = "0.000000", mItemSearchIntegralDppf: scala.math.BigDecimal = "0.000000", mItemSearchIntegralJfpf: scala.math.BigDecimal = "0.000000", mItemSearchIntegralChpf: scala.math.BigDecimal = "0.000000", mItemSearchIntegralCpsjl: scala.math.BigDecimal = "0.000000", mItemSearchIntegralDpscl: scala.math.BigDecimal = "0.000000", mItemSearchIntegralZhl: scala.math.BigDecimal = "0.000000", mItemSearchIntegralDljl: scala.math.BigDecimal = "0.000000", mItemSearchIntegralNewitem: scala.math.BigDecimal, mItemSearchIntegral: scala.math.BigDecimal = "0.000000", mItemSearchIntegralTmp: scala.math.BigDecimal = "0.000000")
  /** GetResult implicit for fetching MItemSearchRow objects using plain SQL queries */
  implicit def GetResultMItemSearchRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal]): GR[MItemSearchRow] = GR{
    prs => import prs._
    MItemSearchRow.tupled((<<[Int], <<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal]))
  }
  /** Table description of table m_item_search. Objects of this class serve as prototypes for rows in queries. */
  class MItemSearch(_tableTag: Tag) extends Table[MItemSearchRow](_tableTag, "m_item_search") {
    def * = (mItemSearchId, mItemSearchItemId, mItemSearchIntegralGjz, mItemSearchIntegralSpdj, mItemSearchIntegralSpxl, mItemSearchIntegralXjcp, mItemSearchIntegralXinsj, mItemSearchIntegralCpwz, mItemSearchIntegralDppf, mItemSearchIntegralJfpf, mItemSearchIntegralChpf, mItemSearchIntegralCpsjl, mItemSearchIntegralDpscl, mItemSearchIntegralZhl, mItemSearchIntegralDljl, mItemSearchIntegralNewitem, mItemSearchIntegral, mItemSearchIntegralTmp) <> (MItemSearchRow.tupled, MItemSearchRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mItemSearchId.?, mItemSearchItemId.?, mItemSearchIntegralGjz.?, mItemSearchIntegralSpdj.?, mItemSearchIntegralSpxl.?, mItemSearchIntegralXjcp.?, mItemSearchIntegralXinsj.?, mItemSearchIntegralCpwz.?, mItemSearchIntegralDppf.?, mItemSearchIntegralJfpf.?, mItemSearchIntegralChpf.?, mItemSearchIntegralCpsjl.?, mItemSearchIntegralDpscl.?, mItemSearchIntegralZhl.?, mItemSearchIntegralDljl.?, mItemSearchIntegralNewitem.?, mItemSearchIntegral.?, mItemSearchIntegralTmp.?).shaped.<>({r=>import r._; _1.map(_=> MItemSearchRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get, _18.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_item_search_id DBType(INT), AutoInc */
    val mItemSearchId: Column[Int] = column[Int]("m_item_search_id", O.AutoInc)
    /** Database column m_item_search_item_id DBType(INT UNSIGNED) */
    val mItemSearchItemId: Column[Int] = column[Int]("m_item_search_item_id")
    /** Database column m_item_search_integral_gjz DBType(DECIMAL) */
    val mItemSearchIntegralGjz: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_gjz")
    /** Database column m_item_search_integral_spdj DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralSpdj: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_spdj", O.Default("0.000000"))
    /** Database column m_item_search_integral_spxl DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralSpxl: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_spxl", O.Default("0.000000"))
    /** Database column m_item_search_integral_xjcp DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralXjcp: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_xjcp", O.Default("0.000000"))
    /** Database column m_item_search_integral_xinsj DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralXinsj: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_xinsj", O.Default("0.000000"))
    /** Database column m_item_search_integral_cpwz DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralCpwz: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_cpwz", O.Default("0.000000"))
    /** Database column m_item_search_integral_dppf DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralDppf: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_dppf", O.Default("0.000000"))
    /** Database column m_item_search_integral_jfpf DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralJfpf: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_jfpf", O.Default("0.000000"))
    /** Database column m_item_search_integral_chpf DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralChpf: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_chpf", O.Default("0.000000"))
    /** Database column m_item_search_integral_cpsjl DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralCpsjl: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_cpsjl", O.Default("0.000000"))
    /** Database column m_item_search_integral_dpscl DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralDpscl: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_dpscl", O.Default("0.000000"))
    /** Database column m_item_search_integral_zhl DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralZhl: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_zhl", O.Default("0.000000"))
    /** Database column m_item_search_integral_dljl DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralDljl: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_dljl", O.Default("0.000000"))
    /** Database column m_item_search_integral_newitem DBType(DECIMAL) */
    val mItemSearchIntegralNewitem: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_newitem")
    /** Database column m_item_search_integral DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegral: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral", O.Default("0.000000"))
    /** Database column m_item_search_integral_tmp DBType(DECIMAL), Default(0.000000) */
    val mItemSearchIntegralTmp: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_item_search_integral_tmp", O.Default("0.000000"))
    
    /** Primary key of MItemSearch (database name m_item_search_PK) */
    val pk = primaryKey("m_item_search_PK", (mItemSearchId, mItemSearchItemId))
    
    /** Index over (mItemSearchIntegralTmp) (database name m_item_search_integral_tmp) */
    val index1 = index("m_item_search_integral_tmp", mItemSearchIntegralTmp)
    /** Uniqueness Index over (mItemSearchItemId) (database name m_item_search_item_id) */
    val index2 = index("m_item_search_item_id", mItemSearchItemId, unique=true)
  }
  /** Collection-like TableQuery object for table MItemSearch */
  lazy val MItemSearch = new TableQuery(tag => new MItemSearch(tag))
  
  /** Entity class storing rows of table MItemSearchScore
   *  @param mItemSearchScoreId Database column m_item_search_score_id DBType(INT), AutoInc, PrimaryKey
   *  @param mItemSearchScoreIntegral Database column m_item_search_score_integral DBType(INT), Default(0)
   *  @param mItemSearchScoreName Database column m_item_search_score_name DBType(CHAR), Length(10,false)
   *  @param mItemSearchScoreComm Database column m_item_search_score_comm DBType(CHAR), Length(20,false) */
  case class MItemSearchScoreRow(mItemSearchScoreId: Int, mItemSearchScoreIntegral: Int = 0, mItemSearchScoreName: String, mItemSearchScoreComm: String)
  /** GetResult implicit for fetching MItemSearchScoreRow objects using plain SQL queries */
  implicit def GetResultMItemSearchScoreRow(implicit e0: GR[Int], e1: GR[String]): GR[MItemSearchScoreRow] = GR{
    prs => import prs._
    MItemSearchScoreRow.tupled((<<[Int], <<[Int], <<[String], <<[String]))
  }
  /** Table description of table m_item_search_score. Objects of this class serve as prototypes for rows in queries. */
  class MItemSearchScore(_tableTag: Tag) extends Table[MItemSearchScoreRow](_tableTag, "m_item_search_score") {
    def * = (mItemSearchScoreId, mItemSearchScoreIntegral, mItemSearchScoreName, mItemSearchScoreComm) <> (MItemSearchScoreRow.tupled, MItemSearchScoreRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mItemSearchScoreId.?, mItemSearchScoreIntegral.?, mItemSearchScoreName.?, mItemSearchScoreComm.?).shaped.<>({r=>import r._; _1.map(_=> MItemSearchScoreRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_item_search_score_id DBType(INT), AutoInc, PrimaryKey */
    val mItemSearchScoreId: Column[Int] = column[Int]("m_item_search_score_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_item_search_score_integral DBType(INT), Default(0) */
    val mItemSearchScoreIntegral: Column[Int] = column[Int]("m_item_search_score_integral", O.Default(0))
    /** Database column m_item_search_score_name DBType(CHAR), Length(10,false) */
    val mItemSearchScoreName: Column[String] = column[String]("m_item_search_score_name", O.Length(10,varying=false))
    /** Database column m_item_search_score_comm DBType(CHAR), Length(20,false) */
    val mItemSearchScoreComm: Column[String] = column[String]("m_item_search_score_comm", O.Length(20,varying=false))
    
    /** Uniqueness Index over (mItemSearchScoreName) (database name m_item_search_score_name) */
    val index1 = index("m_item_search_score_name", mItemSearchScoreName, unique=true)
  }
  /** Collection-like TableQuery object for table MItemSearchScore */
  lazy val MItemSearchScore = new TableQuery(tag => new MItemSearchScore(tag))
  
  /** Entity class storing rows of table MJapanRemote
   *  @param mJapanRemoteId Database column m_japan_remote_id DBType(INT), AutoInc, PrimaryKey
   *  @param mJapanRemoteZip Database column m_japan_remote_zip DBType(VARCHAR), Length(7,true) */
  case class MJapanRemoteRow(mJapanRemoteId: Int, mJapanRemoteZip: String)
  /** GetResult implicit for fetching MJapanRemoteRow objects using plain SQL queries */
  implicit def GetResultMJapanRemoteRow(implicit e0: GR[Int], e1: GR[String]): GR[MJapanRemoteRow] = GR{
    prs => import prs._
    MJapanRemoteRow.tupled((<<[Int], <<[String]))
  }
  /** Table description of table m_japan_remote. Objects of this class serve as prototypes for rows in queries. */
  class MJapanRemote(_tableTag: Tag) extends Table[MJapanRemoteRow](_tableTag, "m_japan_remote") {
    def * = (mJapanRemoteId, mJapanRemoteZip) <> (MJapanRemoteRow.tupled, MJapanRemoteRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mJapanRemoteId.?, mJapanRemoteZip.?).shaped.<>({r=>import r._; _1.map(_=> MJapanRemoteRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_japan_remote_id DBType(INT), AutoInc, PrimaryKey */
    val mJapanRemoteId: Column[Int] = column[Int]("m_japan_remote_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_japan_remote_zip DBType(VARCHAR), Length(7,true) */
    val mJapanRemoteZip: Column[String] = column[String]("m_japan_remote_zip", O.Length(7,varying=true))
    
    /** Uniqueness Index over (mJapanRemoteZip) (database name m_japan_remote_zip) */
    val index1 = index("m_japan_remote_zip", mJapanRemoteZip, unique=true)
  }
  /** Collection-like TableQuery object for table MJapanRemote */
  lazy val MJapanRemote = new TableQuery(tag => new MJapanRemote(tag))
  
  /** Entity class storing rows of table MLdap
   *  @param mLdapAccount Database column m_ldap_account DBType(VARCHAR), PrimaryKey, Length(16,true)
   *  @param mLdapPassword Database column m_ldap_password DBType(VARCHAR), Length(255,true)
   *  @param mLdapRdatetime Database column m_ldap_rdatetime DBType(DATETIME)
   *  @param mLdapUdatetime Database column m_ldap_udatetime DBType(DATETIME) */
  case class MLdapRow(mLdapAccount: String, mLdapPassword: String, mLdapRdatetime: java.sql.Timestamp, mLdapUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MLdapRow objects using plain SQL queries */
  implicit def GetResultMLdapRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp]): GR[MLdapRow] = GR{
    prs => import prs._
    MLdapRow.tupled((<<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_ldap. Objects of this class serve as prototypes for rows in queries. */
  class MLdap(_tableTag: Tag) extends Table[MLdapRow](_tableTag, "m_ldap") {
    def * = (mLdapAccount, mLdapPassword, mLdapRdatetime, mLdapUdatetime) <> (MLdapRow.tupled, MLdapRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mLdapAccount.?, mLdapPassword.?, mLdapRdatetime.?, mLdapUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MLdapRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_ldap_account DBType(VARCHAR), PrimaryKey, Length(16,true) */
    val mLdapAccount: Column[String] = column[String]("m_ldap_account", O.PrimaryKey, O.Length(16,varying=true))
    /** Database column m_ldap_password DBType(VARCHAR), Length(255,true) */
    val mLdapPassword: Column[String] = column[String]("m_ldap_password", O.Length(255,varying=true))
    /** Database column m_ldap_rdatetime DBType(DATETIME) */
    val mLdapRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_ldap_rdatetime")
    /** Database column m_ldap_udatetime DBType(DATETIME) */
    val mLdapUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_ldap_udatetime")
  }
  /** Collection-like TableQuery object for table MLdap */
  lazy val MLdap = new TableQuery(tag => new MLdap(tag))
  
  /** Entity class storing rows of table MMakeFaq
   *  @param id Database column id DBType(INT), PrimaryKey
   *  @param storeId Database column store_id DBType(INT)
   *  @param askContent Database column ask_content DBType(VARCHAR), Length(255,true)
   *  @param answerContent Database column answer_content DBType(VARCHAR), Length(255,true)
   *  @param orderNum Database column order_num DBType(INT)
   *  @param createTime Database column create_time DBType(INT) */
  case class MMakeFaqRow(id: Int, storeId: Int, askContent: String, answerContent: String, orderNum: Int, createTime: Int)
  /** GetResult implicit for fetching MMakeFaqRow objects using plain SQL queries */
  implicit def GetResultMMakeFaqRow(implicit e0: GR[Int], e1: GR[String]): GR[MMakeFaqRow] = GR{
    prs => import prs._
    MMakeFaqRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[Int], <<[Int]))
  }
  /** Table description of table m_make_faq. Objects of this class serve as prototypes for rows in queries. */
  class MMakeFaq(_tableTag: Tag) extends Table[MMakeFaqRow](_tableTag, "m_make_faq") {
    def * = (id, storeId, askContent, answerContent, orderNum, createTime) <> (MMakeFaqRow.tupled, MMakeFaqRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, storeId.?, askContent.?, answerContent.?, orderNum.?, createTime.?).shaped.<>({r=>import r._; _1.map(_=> MMakeFaqRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column store_id DBType(INT) */
    val storeId: Column[Int] = column[Int]("store_id")
    /** Database column ask_content DBType(VARCHAR), Length(255,true) */
    val askContent: Column[String] = column[String]("ask_content", O.Length(255,varying=true))
    /** Database column answer_content DBType(VARCHAR), Length(255,true) */
    val answerContent: Column[String] = column[String]("answer_content", O.Length(255,varying=true))
    /** Database column order_num DBType(INT) */
    val orderNum: Column[Int] = column[Int]("order_num")
    /** Database column create_time DBType(INT) */
    val createTime: Column[Int] = column[Int]("create_time")
  }
  /** Collection-like TableQuery object for table MMakeFaq */
  lazy val MMakeFaq = new TableQuery(tag => new MMakeFaq(tag))
  
  /** Row type of table MMaker */
  type MMakerRow = HCons[Int,HCons[Byte,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Int,HCons[String,HCons[Int,HCons[Int,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[java.sql.Date,HCons[java.sql.Timestamp,HCons[String,HCons[String,HCons[String,HCons[Int,HCons[scala.math.BigDecimal,HCons[scala.math.BigDecimal,HCons[scala.math.BigDecimal,HCons[scala.math.BigDecimal,HCons[java.sql.Timestamp,HCons[String,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[String,HCons[Int,HCons[Int,HCons[Int,HCons[Option[String],HCons[Option[Boolean],HCons[Option[Short],HCons[Option[Boolean],HCons[Option[Short],HCons[Option[scala.math.BigDecimal],HCons[Boolean,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for MMakerRow providing default values if available in the database schema. */
  def MMakerRow(mMakerId: Int, mMakerVoidFlag: Byte, mMakerCloseFlag: Byte, mMakerAccount: String, mMakerLogin: String = "", mMakerPassword: String, mMakerSalt: String = "", mMakerType: Byte, mMakerOroshiFlag: Byte, mMakerAuctionFlag: Byte, mMakerJointFlag: Byte, mMakerOnDutyFlag: Byte = 0, mMakerName: String, mMakerNameCh: String, mMakerNameChHope: String, mMakerNameJa: String, mMakerNameUrl: String, mMakerCompanyName: String, mMakerCompanyNameCh: String, mMakerCompanyNumber: String, mMakerCountry: String, mMakerSho: String, mMakerMRegionProvinceProvinceid: Int = 0, mMakerShi: String, mMakerMRegionCityCityid: Int = 0, mMakerMRegionAreaAreaid: Int = 0, mMakerZip: String, mMakerAddress: String, mMakerAddressCh: String, mMakerTel: String, mMakerFax: String, mMakerMobile: String, mMakerSetsuritsu: String, mMakerShihonkin: String, mMakerJugyoin: String, mMakerJigyonaiyo: String, mMakerUriage: String, mMakerUriage2: String, mMakerRieki: String, mMakerUrl: String, mMakerDeliveryDate: Byte, mMakerServiceType: String, mMakerServiceOrbit: String, mMakerServiceAmenity: String, mMakerDaihyo: String, mMakerDaihyoCh: String, mMakerDaihyoIdentity: String, mMakerDaihyoBirthday: String, mMakerDaihyoSeibetsu: Byte, mMakerSekininsha: String, mMakerSekininshaCh: String, mMakerSekininshaDivision: String, mMakerSekininshaSho: String, mMakerSekininshaCountry: String, mMakerSekininshaAddress: String, mMakerSekininshaAddressCh: String, mMakerSekininshaAddress2Ch: String, mMakerSekininshaTel: String, mMakerSekininshaFax: String, mMakerSekininshaHtel: String, mMakerSekininshaEmail: String, mMakerQq: String, mMakerSekininshaEmailSupport: String, mMakerSekininshaEmailShopping: String, mMakerBankCode: String, mMakerBankBranchCode: String, mMakerBankMeigi: String, mMakerBankNumber: String, mMakerBankMyCode: String, mMakerBankBranchMyCode: String, mMakerBankMyNumber: String, mMakerBankMyMeigi: String, mMakerRegistDate: java.sql.Date, mMakerOpenDate: java.sql.Timestamp, mMakerNote: String, mMakerFtpAccount: String, mMakerFtpPassword: String, mMakerFtpMaxvolume: Int, mMakerRate: scala.math.BigDecimal, mMakerSpeedCoin: scala.math.BigDecimal = "0.00", mMakerBuySpCoin: scala.math.BigDecimal = "0.00", mMakerFrozenSpCoin: scala.math.BigDecimal = "0.00", mMakerUpdateSpTime: java.sql.Timestamp, mMakerTradesafeCode: String, mMakerRdatetime: java.sql.Timestamp, mMakerUdatetime: java.sql.Timestamp, mMakerOperateCate: String, mMakerLoginCount: Int = 0, mMakerRuser: Int, mMakerUuser: Int, mMakerTheme: Option[String] = Some("default"), mMakerBulkType: Option[Boolean] = Some(true), mMakerMinGoodsBulk: Option[Short] = Some(1), mMakerMinMixType: Option[Boolean] = Some(true), mMakerMinShopBulk: Option[Short] = Some(1), mMakerMinShopAmount: Option[scala.math.BigDecimal] = Some("0.00"), mMakerShowStockTips: Boolean = true): MMakerRow = {
    mMakerId :: mMakerVoidFlag :: mMakerCloseFlag :: mMakerAccount :: mMakerLogin :: mMakerPassword :: mMakerSalt :: mMakerType :: mMakerOroshiFlag :: mMakerAuctionFlag :: mMakerJointFlag :: mMakerOnDutyFlag :: mMakerName :: mMakerNameCh :: mMakerNameChHope :: mMakerNameJa :: mMakerNameUrl :: mMakerCompanyName :: mMakerCompanyNameCh :: mMakerCompanyNumber :: mMakerCountry :: mMakerSho :: mMakerMRegionProvinceProvinceid :: mMakerShi :: mMakerMRegionCityCityid :: mMakerMRegionAreaAreaid :: mMakerZip :: mMakerAddress :: mMakerAddressCh :: mMakerTel :: mMakerFax :: mMakerMobile :: mMakerSetsuritsu :: mMakerShihonkin :: mMakerJugyoin :: mMakerJigyonaiyo :: mMakerUriage :: mMakerUriage2 :: mMakerRieki :: mMakerUrl :: mMakerDeliveryDate :: mMakerServiceType :: mMakerServiceOrbit :: mMakerServiceAmenity :: mMakerDaihyo :: mMakerDaihyoCh :: mMakerDaihyoIdentity :: mMakerDaihyoBirthday :: mMakerDaihyoSeibetsu :: mMakerSekininsha :: mMakerSekininshaCh :: mMakerSekininshaDivision :: mMakerSekininshaSho :: mMakerSekininshaCountry :: mMakerSekininshaAddress :: mMakerSekininshaAddressCh :: mMakerSekininshaAddress2Ch :: mMakerSekininshaTel :: mMakerSekininshaFax :: mMakerSekininshaHtel :: mMakerSekininshaEmail :: mMakerQq :: mMakerSekininshaEmailSupport :: mMakerSekininshaEmailShopping :: mMakerBankCode :: mMakerBankBranchCode :: mMakerBankMeigi :: mMakerBankNumber :: mMakerBankMyCode :: mMakerBankBranchMyCode :: mMakerBankMyNumber :: mMakerBankMyMeigi :: mMakerRegistDate :: mMakerOpenDate :: mMakerNote :: mMakerFtpAccount :: mMakerFtpPassword :: mMakerFtpMaxvolume :: mMakerRate :: mMakerSpeedCoin :: mMakerBuySpCoin :: mMakerFrozenSpCoin :: mMakerUpdateSpTime :: mMakerTradesafeCode :: mMakerRdatetime :: mMakerUdatetime :: mMakerOperateCate :: mMakerLoginCount :: mMakerRuser :: mMakerUuser :: mMakerTheme :: mMakerBulkType :: mMakerMinGoodsBulk :: mMakerMinMixType :: mMakerMinShopBulk :: mMakerMinShopAmount :: mMakerShowStockTips :: HNil
  }
  /** GetResult implicit for fetching MMakerRow objects using plain SQL queries */
  implicit def GetResultMMakerRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[java.sql.Date], e4: GR[java.sql.Timestamp], e5: GR[scala.math.BigDecimal], e6: GR[Option[String]], e7: GR[Option[Boolean]], e8: GR[Option[Short]], e9: GR[Option[scala.math.BigDecimal]], e10: GR[Boolean]): GR[MMakerRow] = GR{
    prs => import prs._
    <<[Int] :: <<[Byte] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Int] :: <<[String] :: <<[Int] :: <<[Int] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[java.sql.Date] :: <<[java.sql.Timestamp] :: <<[String] :: <<[String] :: <<[String] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[scala.math.BigDecimal] :: <<[scala.math.BigDecimal] :: <<[scala.math.BigDecimal] :: <<[java.sql.Timestamp] :: <<[String] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[String] :: <<[Int] :: <<[Int] :: <<[Int] :: <<?[String] :: <<?[Boolean] :: <<?[Short] :: <<?[Boolean] :: <<?[Short] :: <<?[scala.math.BigDecimal] :: <<[Boolean] :: HNil
  }
  /** Table description of table m_maker. Objects of this class serve as prototypes for rows in queries. */
  class MMaker(_tableTag: Tag) extends Table[MMakerRow](_tableTag, "m_maker") {
    def * = mMakerId :: mMakerVoidFlag :: mMakerCloseFlag :: mMakerAccount :: mMakerLogin :: mMakerPassword :: mMakerSalt :: mMakerType :: mMakerOroshiFlag :: mMakerAuctionFlag :: mMakerJointFlag :: mMakerOnDutyFlag :: mMakerName :: mMakerNameCh :: mMakerNameChHope :: mMakerNameJa :: mMakerNameUrl :: mMakerCompanyName :: mMakerCompanyNameCh :: mMakerCompanyNumber :: mMakerCountry :: mMakerSho :: mMakerMRegionProvinceProvinceid :: mMakerShi :: mMakerMRegionCityCityid :: mMakerMRegionAreaAreaid :: mMakerZip :: mMakerAddress :: mMakerAddressCh :: mMakerTel :: mMakerFax :: mMakerMobile :: mMakerSetsuritsu :: mMakerShihonkin :: mMakerJugyoin :: mMakerJigyonaiyo :: mMakerUriage :: mMakerUriage2 :: mMakerRieki :: mMakerUrl :: mMakerDeliveryDate :: mMakerServiceType :: mMakerServiceOrbit :: mMakerServiceAmenity :: mMakerDaihyo :: mMakerDaihyoCh :: mMakerDaihyoIdentity :: mMakerDaihyoBirthday :: mMakerDaihyoSeibetsu :: mMakerSekininsha :: mMakerSekininshaCh :: mMakerSekininshaDivision :: mMakerSekininshaSho :: mMakerSekininshaCountry :: mMakerSekininshaAddress :: mMakerSekininshaAddressCh :: mMakerSekininshaAddress2Ch :: mMakerSekininshaTel :: mMakerSekininshaFax :: mMakerSekininshaHtel :: mMakerSekininshaEmail :: mMakerQq :: mMakerSekininshaEmailSupport :: mMakerSekininshaEmailShopping :: mMakerBankCode :: mMakerBankBranchCode :: mMakerBankMeigi :: mMakerBankNumber :: mMakerBankMyCode :: mMakerBankBranchMyCode :: mMakerBankMyNumber :: mMakerBankMyMeigi :: mMakerRegistDate :: mMakerOpenDate :: mMakerNote :: mMakerFtpAccount :: mMakerFtpPassword :: mMakerFtpMaxvolume :: mMakerRate :: mMakerSpeedCoin :: mMakerBuySpCoin :: mMakerFrozenSpCoin :: mMakerUpdateSpTime :: mMakerTradesafeCode :: mMakerRdatetime :: mMakerUdatetime :: mMakerOperateCate :: mMakerLoginCount :: mMakerRuser :: mMakerUuser :: mMakerTheme :: mMakerBulkType :: mMakerMinGoodsBulk :: mMakerMinMixType :: mMakerMinShopBulk :: mMakerMinShopAmount :: mMakerShowStockTips :: HNil
    
    /** Database column m_maker_id DBType(INT), AutoInc, PrimaryKey */
    val mMakerId: Column[Int] = column[Int]("m_maker_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_maker_void_flag DBType(TINYINT) */
    val mMakerVoidFlag: Column[Byte] = column[Byte]("m_maker_void_flag")
    /** Database column m_maker_close_flag DBType(TINYINT) */
    val mMakerCloseFlag: Column[Byte] = column[Byte]("m_maker_close_flag")
    /** Database column m_maker_account DBType(CHAR), Length(36,false) */
    val mMakerAccount: Column[String] = column[String]("m_maker_account", O.Length(36,varying=false))
    /** Database column m_maker_login DBType(VARCHAR), Length(36,true), Default() */
    val mMakerLogin: Column[String] = column[String]("m_maker_login", O.Length(36,varying=true), O.Default(""))
    /** Database column m_maker_password DBType(VARCHAR), Length(100,true) */
    val mMakerPassword: Column[String] = column[String]("m_maker_password", O.Length(100,varying=true))
    /** Database column m_maker_salt DBType(CHAR), Length(15,false), Default() */
    val mMakerSalt: Column[String] = column[String]("m_maker_salt", O.Length(15,varying=false), O.Default(""))
    /** Database column m_maker_type DBType(TINYINT) */
    val mMakerType: Column[Byte] = column[Byte]("m_maker_type")
    /** Database column m_maker_oroshi_flag DBType(TINYINT) */
    val mMakerOroshiFlag: Column[Byte] = column[Byte]("m_maker_oroshi_flag")
    /** Database column m_maker_auction_flag DBType(TINYINT) */
    val mMakerAuctionFlag: Column[Byte] = column[Byte]("m_maker_auction_flag")
    /** Database column m_maker_joint_flag DBType(TINYINT) */
    val mMakerJointFlag: Column[Byte] = column[Byte]("m_maker_joint_flag")
    /** Database column m_maker_on_duty_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mMakerOnDutyFlag: Column[Byte] = column[Byte]("m_maker_on_duty_flag", O.Default(0))
    /** Database column m_maker_name DBType(VARCHAR), Length(200,true) */
    val mMakerName: Column[String] = column[String]("m_maker_name", O.Length(200,varying=true))
    /** Database column m_maker_name_ch DBType(VARCHAR), Length(200,true) */
    val mMakerNameCh: Column[String] = column[String]("m_maker_name_ch", O.Length(200,varying=true))
    /** Database column m_maker_name_ch_hope DBType(TEXT), Length(65535,true) */
    val mMakerNameChHope: Column[String] = column[String]("m_maker_name_ch_hope", O.Length(65535,varying=true))
    /** Database column m_maker_name_ja DBType(VARCHAR), Length(200,true) */
    val mMakerNameJa: Column[String] = column[String]("m_maker_name_ja", O.Length(200,varying=true))
    /** Database column m_maker_name_url DBType(VARCHAR), Length(50,true) */
    val mMakerNameUrl: Column[String] = column[String]("m_maker_name_url", O.Length(50,varying=true))
    /** Database column m_maker_company_name DBType(VARCHAR), Length(200,true) */
    val mMakerCompanyName: Column[String] = column[String]("m_maker_company_name", O.Length(200,varying=true))
    /** Database column m_maker_company_name_ch DBType(VARCHAR), Length(200,true) */
    val mMakerCompanyNameCh: Column[String] = column[String]("m_maker_company_name_ch", O.Length(200,varying=true))
    /** Database column m_maker_company_number DBType(VARCHAR), Length(100,true) */
    val mMakerCompanyNumber: Column[String] = column[String]("m_maker_company_number", O.Length(100,varying=true))
    /** Database column m_maker_country DBType(VARCHAR), Length(100,true) */
    val mMakerCountry: Column[String] = column[String]("m_maker_country", O.Length(100,varying=true))
    /** Database column m_maker_sho DBType(VARCHAR), Length(100,true) */
    val mMakerSho: Column[String] = column[String]("m_maker_sho", O.Length(100,varying=true))
    /** Database column m_maker_m_region_province_provinceid DBType(INT UNSIGNED), Default(0) */
    val mMakerMRegionProvinceProvinceid: Column[Int] = column[Int]("m_maker_m_region_province_provinceid", O.Default(0))
    /** Database column m_maker_shi DBType(VARCHAR), Length(100,true) */
    val mMakerShi: Column[String] = column[String]("m_maker_shi", O.Length(100,varying=true))
    /** Database column m_maker_m_region_city_cityid DBType(INT UNSIGNED), Default(0) */
    val mMakerMRegionCityCityid: Column[Int] = column[Int]("m_maker_m_region_city_cityid", O.Default(0))
    /** Database column m_maker_m_region_area_areaid DBType(INT UNSIGNED), Default(0) */
    val mMakerMRegionAreaAreaid: Column[Int] = column[Int]("m_maker_m_region_area_areaid", O.Default(0))
    /** Database column m_maker_zip DBType(VARCHAR), Length(10,true) */
    val mMakerZip: Column[String] = column[String]("m_maker_zip", O.Length(10,varying=true))
    /** Database column m_maker_address DBType(TEXT), Length(65535,true) */
    val mMakerAddress: Column[String] = column[String]("m_maker_address", O.Length(65535,varying=true))
    /** Database column m_maker_address_ch DBType(TEXT), Length(65535,true) */
    val mMakerAddressCh: Column[String] = column[String]("m_maker_address_ch", O.Length(65535,varying=true))
    /** Database column m_maker_tel DBType(VARCHAR), Length(100,true) */
    val mMakerTel: Column[String] = column[String]("m_maker_tel", O.Length(100,varying=true))
    /** Database column m_maker_fax DBType(VARCHAR), Length(100,true) */
    val mMakerFax: Column[String] = column[String]("m_maker_fax", O.Length(100,varying=true))
    /** Database column m_maker_mobile DBType(VARCHAR), Length(20,true) */
    val mMakerMobile: Column[String] = column[String]("m_maker_mobile", O.Length(20,varying=true))
    /** Database column m_maker_setsuritsu DBType(VARCHAR), Length(200,true) */
    val mMakerSetsuritsu: Column[String] = column[String]("m_maker_setsuritsu", O.Length(200,varying=true))
    /** Database column m_maker_shihonkin DBType(VARCHAR), Length(200,true) */
    val mMakerShihonkin: Column[String] = column[String]("m_maker_shihonkin", O.Length(200,varying=true))
    /** Database column m_maker_jugyoin DBType(VARCHAR), Length(200,true) */
    val mMakerJugyoin: Column[String] = column[String]("m_maker_jugyoin", O.Length(200,varying=true))
    /** Database column m_maker_jigyonaiyo DBType(VARCHAR), Length(200,true) */
    val mMakerJigyonaiyo: Column[String] = column[String]("m_maker_jigyonaiyo", O.Length(200,varying=true))
    /** Database column m_maker_uriage DBType(VARCHAR), Length(200,true) */
    val mMakerUriage: Column[String] = column[String]("m_maker_uriage", O.Length(200,varying=true))
    /** Database column m_maker_uriage2 DBType(VARCHAR), Length(200,true) */
    val mMakerUriage2: Column[String] = column[String]("m_maker_uriage2", O.Length(200,varying=true))
    /** Database column m_maker_rieki DBType(VARCHAR), Length(200,true) */
    val mMakerRieki: Column[String] = column[String]("m_maker_rieki", O.Length(200,varying=true))
    /** Database column m_maker_url DBType(VARCHAR), Length(200,true) */
    val mMakerUrl: Column[String] = column[String]("m_maker_url", O.Length(200,varying=true))
    /** Database column m_maker_delivery_date DBType(TINYINT) */
    val mMakerDeliveryDate: Column[Byte] = column[Byte]("m_maker_delivery_date")
    /** Database column m_maker_service_type DBType(VARCHAR), Length(100,true) */
    val mMakerServiceType: Column[String] = column[String]("m_maker_service_type", O.Length(100,varying=true))
    /** Database column m_maker_service_orbit DBType(VARCHAR), Length(100,true) */
    val mMakerServiceOrbit: Column[String] = column[String]("m_maker_service_orbit", O.Length(100,varying=true))
    /** Database column m_maker_service_amenity DBType(VARCHAR), Length(100,true) */
    val mMakerServiceAmenity: Column[String] = column[String]("m_maker_service_amenity", O.Length(100,varying=true))
    /** Database column m_maker_daihyo DBType(VARCHAR), Length(200,true) */
    val mMakerDaihyo: Column[String] = column[String]("m_maker_daihyo", O.Length(200,varying=true))
    /** Database column m_maker_daihyo_ch DBType(VARCHAR), Length(200,true) */
    val mMakerDaihyoCh: Column[String] = column[String]("m_maker_daihyo_ch", O.Length(200,varying=true))
    /** Database column m_maker_daihyo_identity DBType(VARCHAR), Length(200,true) */
    val mMakerDaihyoIdentity: Column[String] = column[String]("m_maker_daihyo_identity", O.Length(200,varying=true))
    /** Database column m_maker_daihyo_birthday DBType(VARCHAR), Length(200,true) */
    val mMakerDaihyoBirthday: Column[String] = column[String]("m_maker_daihyo_birthday", O.Length(200,varying=true))
    /** Database column m_maker_daihyo_seibetsu DBType(TINYINT) */
    val mMakerDaihyoSeibetsu: Column[Byte] = column[Byte]("m_maker_daihyo_seibetsu")
    /** Database column m_maker_sekininsha DBType(VARCHAR), Length(200,true) */
    val mMakerSekininsha: Column[String] = column[String]("m_maker_sekininsha", O.Length(200,varying=true))
    /** Database column m_maker_sekininsha_ch DBType(VARCHAR), Length(200,true) */
    val mMakerSekininshaCh: Column[String] = column[String]("m_maker_sekininsha_ch", O.Length(200,varying=true))
    /** Database column m_maker_sekininsha_division DBType(VARCHAR), Length(200,true) */
    val mMakerSekininshaDivision: Column[String] = column[String]("m_maker_sekininsha_division", O.Length(200,varying=true))
    /** Database column m_maker_sekininsha_sho DBType(VARCHAR), Length(200,true) */
    val mMakerSekininshaSho: Column[String] = column[String]("m_maker_sekininsha_sho", O.Length(200,varying=true))
    /** Database column m_maker_sekininsha_country DBType(VARCHAR), Length(100,true) */
    val mMakerSekininshaCountry: Column[String] = column[String]("m_maker_sekininsha_country", O.Length(100,varying=true))
    /** Database column m_maker_sekininsha_address DBType(TEXT), Length(65535,true) */
    val mMakerSekininshaAddress: Column[String] = column[String]("m_maker_sekininsha_address", O.Length(65535,varying=true))
    /** Database column m_maker_sekininsha_address_ch DBType(TEXT), Length(65535,true) */
    val mMakerSekininshaAddressCh: Column[String] = column[String]("m_maker_sekininsha_address_ch", O.Length(65535,varying=true))
    /** Database column m_maker_sekininsha_address2_ch DBType(TEXT), Length(65535,true) */
    val mMakerSekininshaAddress2Ch: Column[String] = column[String]("m_maker_sekininsha_address2_ch", O.Length(65535,varying=true))
    /** Database column m_maker_sekininsha_tel DBType(VARCHAR), Length(200,true) */
    val mMakerSekininshaTel: Column[String] = column[String]("m_maker_sekininsha_tel", O.Length(200,varying=true))
    /** Database column m_maker_sekininsha_fax DBType(VARCHAR), Length(200,true) */
    val mMakerSekininshaFax: Column[String] = column[String]("m_maker_sekininsha_fax", O.Length(200,varying=true))
    /** Database column m_maker_sekininsha_htel DBType(VARCHAR), Length(200,true) */
    val mMakerSekininshaHtel: Column[String] = column[String]("m_maker_sekininsha_htel", O.Length(200,varying=true))
    /** Database column m_maker_sekininsha_email DBType(VARCHAR), Length(200,true) */
    val mMakerSekininshaEmail: Column[String] = column[String]("m_maker_sekininsha_email", O.Length(200,varying=true))
    /** Database column m_maker_qq DBType(VARCHAR), Length(10,true) */
    val mMakerQq: Column[String] = column[String]("m_maker_qq", O.Length(10,varying=true))
    /** Database column m_maker_sekininsha_email_support DBType(VARCHAR), Length(200,true) */
    val mMakerSekininshaEmailSupport: Column[String] = column[String]("m_maker_sekininsha_email_support", O.Length(200,varying=true))
    /** Database column m_maker_sekininsha_email_shopping DBType(VARCHAR), Length(200,true) */
    val mMakerSekininshaEmailShopping: Column[String] = column[String]("m_maker_sekininsha_email_shopping", O.Length(200,varying=true))
    /** Database column m_maker_bank_code DBType(VARCHAR), Length(200,true) */
    val mMakerBankCode: Column[String] = column[String]("m_maker_bank_code", O.Length(200,varying=true))
    /** Database column m_maker_bank_branch_code DBType(VARCHAR), Length(200,true) */
    val mMakerBankBranchCode: Column[String] = column[String]("m_maker_bank_branch_code", O.Length(200,varying=true))
    /** Database column m_maker_bank_meigi DBType(VARCHAR), Length(200,true) */
    val mMakerBankMeigi: Column[String] = column[String]("m_maker_bank_meigi", O.Length(200,varying=true))
    /** Database column m_maker_bank_number DBType(VARCHAR), Length(200,true) */
    val mMakerBankNumber: Column[String] = column[String]("m_maker_bank_number", O.Length(200,varying=true))
    /** Database column m_maker_bank_my_code DBType(VARCHAR), Length(200,true) */
    val mMakerBankMyCode: Column[String] = column[String]("m_maker_bank_my_code", O.Length(200,varying=true))
    /** Database column m_maker_bank_branch_my_code DBType(VARCHAR), Length(200,true) */
    val mMakerBankBranchMyCode: Column[String] = column[String]("m_maker_bank_branch_my_code", O.Length(200,varying=true))
    /** Database column m_maker_bank_my_number DBType(VARCHAR), Length(200,true) */
    val mMakerBankMyNumber: Column[String] = column[String]("m_maker_bank_my_number", O.Length(200,varying=true))
    /** Database column m_maker_bank_my_meigi DBType(VARCHAR), Length(200,true) */
    val mMakerBankMyMeigi: Column[String] = column[String]("m_maker_bank_my_meigi", O.Length(200,varying=true))
    /** Database column m_maker_regist_date DBType(DATE) */
    val mMakerRegistDate: Column[java.sql.Date] = column[java.sql.Date]("m_maker_regist_date")
    /** Database column m_maker_open_date DBType(DATETIME) */
    val mMakerOpenDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_maker_open_date")
    /** Database column m_maker_note DBType(TEXT), Length(65535,true) */
    val mMakerNote: Column[String] = column[String]("m_maker_note", O.Length(65535,varying=true))
    /** Database column m_maker_ftp_account DBType(VARCHAR), Length(100,true) */
    val mMakerFtpAccount: Column[String] = column[String]("m_maker_ftp_account", O.Length(100,varying=true))
    /** Database column m_maker_ftp_password DBType(VARCHAR), Length(100,true) */
    val mMakerFtpPassword: Column[String] = column[String]("m_maker_ftp_password", O.Length(100,varying=true))
    /** Database column m_maker_ftp_maxvolume DBType(INT) */
    val mMakerFtpMaxvolume: Column[Int] = column[Int]("m_maker_ftp_maxvolume")
    /** Database column m_maker_rate DBType(DECIMAL) */
    val mMakerRate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_maker_rate")
    /** Database column m_maker_speed_coin DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mMakerSpeedCoin: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_maker_speed_coin", O.Default("0.00"))
    /** Database column m_maker_buy_sp_coin DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mMakerBuySpCoin: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_maker_buy_sp_coin", O.Default("0.00"))
    /** Database column m_maker_frozen_sp_coin DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mMakerFrozenSpCoin: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_maker_frozen_sp_coin", O.Default("0.00"))
    /** Database column m_maker_update_sp_time DBType(DATETIME) */
    val mMakerUpdateSpTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_maker_update_sp_time")
    /** Database column m_maker_tradesafe_code DBType(VARCHAR), Length(20,true) */
    val mMakerTradesafeCode: Column[String] = column[String]("m_maker_tradesafe_code", O.Length(20,varying=true))
    /** Database column m_maker_rdatetime DBType(DATETIME) */
    val mMakerRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_maker_rdatetime")
    /** Database column m_maker_udatetime DBType(DATETIME) */
    val mMakerUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_maker_udatetime")
    /** Database column m_maker_operate_cate DBType(VARCHAR), Length(100,true) */
    val mMakerOperateCate: Column[String] = column[String]("m_maker_operate_cate", O.Length(100,varying=true))
    /** Database column m_maker_login_count DBType(INT UNSIGNED), Default(0) */
    val mMakerLoginCount: Column[Int] = column[Int]("m_maker_login_count", O.Default(0))
    /** Database column m_maker_ruser DBType(INT) */
    val mMakerRuser: Column[Int] = column[Int]("m_maker_ruser")
    /** Database column m_maker_uuser DBType(INT) */
    val mMakerUuser: Column[Int] = column[Int]("m_maker_uuser")
    /** Database column m_maker_theme DBType(VARCHAR), Length(125,true), Default(Some(default)) */
    val mMakerTheme: Column[Option[String]] = column[Option[String]]("m_maker_theme", O.Length(125,varying=true), O.Default(Some("default")))
    /** Database column m_maker_bulk_type DBType(BIT), Default(Some(true)) */
    val mMakerBulkType: Column[Option[Boolean]] = column[Option[Boolean]]("m_maker_bulk_type", O.Default(Some(true)))
    /** Database column m_maker_min_goods_bulk DBType(SMALLINT), Default(Some(1)) */
    val mMakerMinGoodsBulk: Column[Option[Short]] = column[Option[Short]]("m_maker_min_goods_bulk", O.Default(Some(1)))
    /** Database column m_maker_min_mix_type DBType(BIT), Default(Some(true)) */
    val mMakerMinMixType: Column[Option[Boolean]] = column[Option[Boolean]]("m_maker_min_mix_type", O.Default(Some(true)))
    /** Database column m_maker_min_shop_bulk DBType(SMALLINT), Default(Some(1)) */
    val mMakerMinShopBulk: Column[Option[Short]] = column[Option[Short]]("m_maker_min_shop_bulk", O.Default(Some(1)))
    /** Database column m_maker_min_shop_amount DBType(DECIMAL), Default(Some(0.00)) */
    val mMakerMinShopAmount: Column[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("m_maker_min_shop_amount", O.Default(Some("0.00")))
    /** Database column m_maker_show_stock_tips DBType(BIT), Default(true) */
    val mMakerShowStockTips: Column[Boolean] = column[Boolean]("m_maker_show_stock_tips", O.Default(true))
    
    /** Index over (mMakerAccount) (database name m_maker_account) */
    val index1 = index("m_maker_account", mMakerAccount :: HNil)
    /** Index over (mMakerLogin) (database name m_maker_login) */
    val index2 = index("m_maker_login", mMakerLogin :: HNil)
  }
  /** Collection-like TableQuery object for table MMaker */
  lazy val MMaker = new TableQuery(tag => new MMaker(tag))
  
  /** Entity class storing rows of table MMakerachievement
   *  @param mMakerachievementId Database column m_makerachievement_id DBType(INT), AutoInc, PrimaryKey
   *  @param mMakerachievementMMakerId Database column m_makerachievement_m_maker_id DBType(INT)
   *  @param mMakerachievementKey Database column m_makerachievement_key DBType(VARCHAR), Length(20,true)
   *  @param mMakerachievementValue Database column m_makerachievement_value DBType(INT)
   *  @param mMakerachievementRdatetime Database column m_makerachievement_rdatetime DBType(DATETIME)
   *  @param mMakerachievementUdatetime Database column m_makerachievement_udatetime DBType(DATETIME) */
  case class MMakerachievementRow(mMakerachievementId: Int, mMakerachievementMMakerId: Int, mMakerachievementKey: String, mMakerachievementValue: Int, mMakerachievementRdatetime: java.sql.Timestamp, mMakerachievementUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MMakerachievementRow objects using plain SQL queries */
  implicit def GetResultMMakerachievementRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MMakerachievementRow] = GR{
    prs => import prs._
    MMakerachievementRow.tupled((<<[Int], <<[Int], <<[String], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_makerachievement. Objects of this class serve as prototypes for rows in queries. */
  class MMakerachievement(_tableTag: Tag) extends Table[MMakerachievementRow](_tableTag, "m_makerachievement") {
    def * = (mMakerachievementId, mMakerachievementMMakerId, mMakerachievementKey, mMakerachievementValue, mMakerachievementRdatetime, mMakerachievementUdatetime) <> (MMakerachievementRow.tupled, MMakerachievementRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMakerachievementId.?, mMakerachievementMMakerId.?, mMakerachievementKey.?, mMakerachievementValue.?, mMakerachievementRdatetime.?, mMakerachievementUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MMakerachievementRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_makerachievement_id DBType(INT), AutoInc, PrimaryKey */
    val mMakerachievementId: Column[Int] = column[Int]("m_makerachievement_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_makerachievement_m_maker_id DBType(INT) */
    val mMakerachievementMMakerId: Column[Int] = column[Int]("m_makerachievement_m_maker_id")
    /** Database column m_makerachievement_key DBType(VARCHAR), Length(20,true) */
    val mMakerachievementKey: Column[String] = column[String]("m_makerachievement_key", O.Length(20,varying=true))
    /** Database column m_makerachievement_value DBType(INT) */
    val mMakerachievementValue: Column[Int] = column[Int]("m_makerachievement_value")
    /** Database column m_makerachievement_rdatetime DBType(DATETIME) */
    val mMakerachievementRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_makerachievement_rdatetime")
    /** Database column m_makerachievement_udatetime DBType(DATETIME) */
    val mMakerachievementUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_makerachievement_udatetime")
  }
  /** Collection-like TableQuery object for table MMakerachievement */
  lazy val MMakerachievement = new TableQuery(tag => new MMakerachievement(tag))
  
  /** Entity class storing rows of table MMakerLogin
   *  @param mMakerLoginId Database column m_maker_login_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mMakerLoginMMakerId Database column m_maker_login_m_maker_id DBType(INT UNSIGNED), Default(0)
   *  @param mMakerLoginAccount Database column m_maker_login_account DBType(CHAR), Length(36,false)
   *  @param mMakerLoginTime Database column m_maker_login_time DBType(DATETIME)
   *  @param mMakerLoginIp Database column m_maker_login_ip DBType(VARCHAR), Length(20,true)
   *  @param mMakerLoginStatus Database column m_maker_login_status DBType(TINYINT UNSIGNED), Default(1)
   *  @param mMakerLoginCountStatus Database column m_maker_login_count_status DBType(TINYINT UNSIGNED), Default(0)
   *  @param mMakerLoginAlertFlag Database column m_maker_login_alert_flag DBType(TINYINT UNSIGNED), Default(0) */
  case class MMakerLoginRow(mMakerLoginId: Int, mMakerLoginMMakerId: Int = 0, mMakerLoginAccount: String, mMakerLoginTime: java.sql.Timestamp, mMakerLoginIp: String, mMakerLoginStatus: Byte = 1, mMakerLoginCountStatus: Byte = 0, mMakerLoginAlertFlag: Byte = 0)
  /** GetResult implicit for fetching MMakerLoginRow objects using plain SQL queries */
  implicit def GetResultMMakerLoginRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Byte]): GR[MMakerLoginRow] = GR{
    prs => import prs._
    MMakerLoginRow.tupled((<<[Int], <<[Int], <<[String], <<[java.sql.Timestamp], <<[String], <<[Byte], <<[Byte], <<[Byte]))
  }
  /** Table description of table m_maker_login. Objects of this class serve as prototypes for rows in queries. */
  class MMakerLogin(_tableTag: Tag) extends Table[MMakerLoginRow](_tableTag, "m_maker_login") {
    def * = (mMakerLoginId, mMakerLoginMMakerId, mMakerLoginAccount, mMakerLoginTime, mMakerLoginIp, mMakerLoginStatus, mMakerLoginCountStatus, mMakerLoginAlertFlag) <> (MMakerLoginRow.tupled, MMakerLoginRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMakerLoginId.?, mMakerLoginMMakerId.?, mMakerLoginAccount.?, mMakerLoginTime.?, mMakerLoginIp.?, mMakerLoginStatus.?, mMakerLoginCountStatus.?, mMakerLoginAlertFlag.?).shaped.<>({r=>import r._; _1.map(_=> MMakerLoginRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_maker_login_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mMakerLoginId: Column[Int] = column[Int]("m_maker_login_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_maker_login_m_maker_id DBType(INT UNSIGNED), Default(0) */
    val mMakerLoginMMakerId: Column[Int] = column[Int]("m_maker_login_m_maker_id", O.Default(0))
    /** Database column m_maker_login_account DBType(CHAR), Length(36,false) */
    val mMakerLoginAccount: Column[String] = column[String]("m_maker_login_account", O.Length(36,varying=false))
    /** Database column m_maker_login_time DBType(DATETIME) */
    val mMakerLoginTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_maker_login_time")
    /** Database column m_maker_login_ip DBType(VARCHAR), Length(20,true) */
    val mMakerLoginIp: Column[String] = column[String]("m_maker_login_ip", O.Length(20,varying=true))
    /** Database column m_maker_login_status DBType(TINYINT UNSIGNED), Default(1) */
    val mMakerLoginStatus: Column[Byte] = column[Byte]("m_maker_login_status", O.Default(1))
    /** Database column m_maker_login_count_status DBType(TINYINT UNSIGNED), Default(0) */
    val mMakerLoginCountStatus: Column[Byte] = column[Byte]("m_maker_login_count_status", O.Default(0))
    /** Database column m_maker_login_alert_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mMakerLoginAlertFlag: Column[Byte] = column[Byte]("m_maker_login_alert_flag", O.Default(0))
  }
  /** Collection-like TableQuery object for table MMakerLogin */
  lazy val MMakerLogin = new TableQuery(tag => new MMakerLogin(tag))
  
  /** Entity class storing rows of table MMakermeta
   *  @param mMakermetaId Database column m_makermeta_id DBType(INT), AutoInc, PrimaryKey
   *  @param mMakermetaMMakerId Database column m_makermeta_m_maker_id DBType(INT)
   *  @param mMakermetaKey Database column m_makermeta_key DBType(VARCHAR), Length(20,true)
   *  @param mMakermetaMime Database column m_makermeta_mime DBType(VARCHAR), Length(100,true)
   *  @param mMakermetaRdatetime Database column m_makermeta_rdatetime DBType(DATETIME)
   *  @param mMakermetaImg Database column m_makermeta_img DBType(VARCHAR), Length(255,true) */
  case class MMakermetaRow(mMakermetaId: Int, mMakermetaMMakerId: Int, mMakermetaKey: String, mMakermetaMime: String, mMakermetaRdatetime: java.sql.Timestamp, mMakermetaImg: String)
  /** GetResult implicit for fetching MMakermetaRow objects using plain SQL queries */
  implicit def GetResultMMakermetaRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MMakermetaRow] = GR{
    prs => import prs._
    MMakermetaRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[java.sql.Timestamp], <<[String]))
  }
  /** Table description of table m_makermeta. Objects of this class serve as prototypes for rows in queries. */
  class MMakermeta(_tableTag: Tag) extends Table[MMakermetaRow](_tableTag, "m_makermeta") {
    def * = (mMakermetaId, mMakermetaMMakerId, mMakermetaKey, mMakermetaMime, mMakermetaRdatetime, mMakermetaImg) <> (MMakermetaRow.tupled, MMakermetaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMakermetaId.?, mMakermetaMMakerId.?, mMakermetaKey.?, mMakermetaMime.?, mMakermetaRdatetime.?, mMakermetaImg.?).shaped.<>({r=>import r._; _1.map(_=> MMakermetaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_makermeta_id DBType(INT), AutoInc, PrimaryKey */
    val mMakermetaId: Column[Int] = column[Int]("m_makermeta_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_makermeta_m_maker_id DBType(INT) */
    val mMakermetaMMakerId: Column[Int] = column[Int]("m_makermeta_m_maker_id")
    /** Database column m_makermeta_key DBType(VARCHAR), Length(20,true) */
    val mMakermetaKey: Column[String] = column[String]("m_makermeta_key", O.Length(20,varying=true))
    /** Database column m_makermeta_mime DBType(VARCHAR), Length(100,true) */
    val mMakermetaMime: Column[String] = column[String]("m_makermeta_mime", O.Length(100,varying=true))
    /** Database column m_makermeta_rdatetime DBType(DATETIME) */
    val mMakermetaRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_makermeta_rdatetime")
    /** Database column m_makermeta_img DBType(VARCHAR), Length(255,true) */
    val mMakermetaImg: Column[String] = column[String]("m_makermeta_img", O.Length(255,varying=true))
    
    /** Uniqueness Index over (mMakermetaMMakerId,mMakermetaKey) (database name idx_m_makermeta_2) */
    val index1 = index("idx_m_makermeta_2", (mMakermetaMMakerId, mMakermetaKey), unique=true)
    /** Index over (mMakermetaMMakerId) (database name m_makermeta_m_maker_id) */
    val index2 = index("m_makermeta_m_maker_id", mMakermetaMMakerId)
  }
  /** Collection-like TableQuery object for table MMakermeta */
  lazy val MMakermeta = new TableQuery(tag => new MMakermeta(tag))
  
  /** Entity class storing rows of table MMakerShopArea
   *  @param mMakerShopAreaId Database column m_maker_shop_area_id DBType(INT), AutoInc, PrimaryKey
   *  @param mMakerShopAreaName Database column m_maker_shop_area_name DBType(VARCHAR), Length(10,true)
   *  @param mMakerShopAreaNameJp Database column m_maker_shop_area_name_jp DBType(VARCHAR), Length(30,true)
   *  @param mMakerShopAreaCategoryId Database column m_maker_shop_area_category_id DBType(VARCHAR), Length(30,true)
   *  @param mMakerShopAreaMakerId Database column m_maker_shop_area_maker_id DBType(INT)
   *  @param mMakerShopAreaQuantity Database column m_maker_shop_area_quantity DBType(INT), Default(4)
   *  @param mMakerShopAreaItemIds Database column m_maker_shop_area_item_ids DBType(VARCHAR), Length(250,true)
   *  @param mMakerShopAreaType Database column m_maker_shop_area_type DBType(VARCHAR), Length(5,true), Default(0)
   *  @param mMakerShopAreaOrder Database column m_maker_shop_area_order DBType(VARCHAR), Length(3,true), Default(0)
   *  @param mMakerShopAreaFlag Database column m_maker_shop_area_flag DBType(VARCHAR), Length(3,true), Default(0)
   *  @param mMakerShopAreaNumber Database column m_maker_shop_area_number DBType(INT) */
  case class MMakerShopAreaRow(mMakerShopAreaId: Int, mMakerShopAreaName: String, mMakerShopAreaNameJp: String, mMakerShopAreaCategoryId: String, mMakerShopAreaMakerId: Int, mMakerShopAreaQuantity: Int = 4, mMakerShopAreaItemIds: String, mMakerShopAreaType: String = "0", mMakerShopAreaOrder: String = "0", mMakerShopAreaFlag: String = "0", mMakerShopAreaNumber: Int)
  /** GetResult implicit for fetching MMakerShopAreaRow objects using plain SQL queries */
  implicit def GetResultMMakerShopAreaRow(implicit e0: GR[Int], e1: GR[String]): GR[MMakerShopAreaRow] = GR{
    prs => import prs._
    MMakerShopAreaRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table m_maker_shop_area. Objects of this class serve as prototypes for rows in queries. */
  class MMakerShopArea(_tableTag: Tag) extends Table[MMakerShopAreaRow](_tableTag, "m_maker_shop_area") {
    def * = (mMakerShopAreaId, mMakerShopAreaName, mMakerShopAreaNameJp, mMakerShopAreaCategoryId, mMakerShopAreaMakerId, mMakerShopAreaQuantity, mMakerShopAreaItemIds, mMakerShopAreaType, mMakerShopAreaOrder, mMakerShopAreaFlag, mMakerShopAreaNumber) <> (MMakerShopAreaRow.tupled, MMakerShopAreaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMakerShopAreaId.?, mMakerShopAreaName.?, mMakerShopAreaNameJp.?, mMakerShopAreaCategoryId.?, mMakerShopAreaMakerId.?, mMakerShopAreaQuantity.?, mMakerShopAreaItemIds.?, mMakerShopAreaType.?, mMakerShopAreaOrder.?, mMakerShopAreaFlag.?, mMakerShopAreaNumber.?).shaped.<>({r=>import r._; _1.map(_=> MMakerShopAreaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_maker_shop_area_id DBType(INT), AutoInc, PrimaryKey */
    val mMakerShopAreaId: Column[Int] = column[Int]("m_maker_shop_area_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_maker_shop_area_name DBType(VARCHAR), Length(10,true) */
    val mMakerShopAreaName: Column[String] = column[String]("m_maker_shop_area_name", O.Length(10,varying=true))
    /** Database column m_maker_shop_area_name_jp DBType(VARCHAR), Length(30,true) */
    val mMakerShopAreaNameJp: Column[String] = column[String]("m_maker_shop_area_name_jp", O.Length(30,varying=true))
    /** Database column m_maker_shop_area_category_id DBType(VARCHAR), Length(30,true) */
    val mMakerShopAreaCategoryId: Column[String] = column[String]("m_maker_shop_area_category_id", O.Length(30,varying=true))
    /** Database column m_maker_shop_area_maker_id DBType(INT) */
    val mMakerShopAreaMakerId: Column[Int] = column[Int]("m_maker_shop_area_maker_id")
    /** Database column m_maker_shop_area_quantity DBType(INT), Default(4) */
    val mMakerShopAreaQuantity: Column[Int] = column[Int]("m_maker_shop_area_quantity", O.Default(4))
    /** Database column m_maker_shop_area_item_ids DBType(VARCHAR), Length(250,true) */
    val mMakerShopAreaItemIds: Column[String] = column[String]("m_maker_shop_area_item_ids", O.Length(250,varying=true))
    /** Database column m_maker_shop_area_type DBType(VARCHAR), Length(5,true), Default(0) */
    val mMakerShopAreaType: Column[String] = column[String]("m_maker_shop_area_type", O.Length(5,varying=true), O.Default("0"))
    /** Database column m_maker_shop_area_order DBType(VARCHAR), Length(3,true), Default(0) */
    val mMakerShopAreaOrder: Column[String] = column[String]("m_maker_shop_area_order", O.Length(3,varying=true), O.Default("0"))
    /** Database column m_maker_shop_area_flag DBType(VARCHAR), Length(3,true), Default(0) */
    val mMakerShopAreaFlag: Column[String] = column[String]("m_maker_shop_area_flag", O.Length(3,varying=true), O.Default("0"))
    /** Database column m_maker_shop_area_number DBType(INT) */
    val mMakerShopAreaNumber: Column[Int] = column[Int]("m_maker_shop_area_number")
  }
  /** Collection-like TableQuery object for table MMakerShopArea */
  lazy val MMakerShopArea = new TableQuery(tag => new MMakerShopArea(tag))
  
  /** Entity class storing rows of table MMakertimesale
   *  @param mMakertimesaleId Database column m_makertimesale_id DBType(INT), AutoInc, PrimaryKey
   *  @param mMakertimesaleDeleteFlag Database column m_makertimesale_delete_flag DBType(INT)
   *  @param mMakertimesaleMMakerId Database column m_makertimesale_m_maker_id DBType(INT)
   *  @param mMakertimesaleTitle Database column m_makertimesale_title DBType(VARCHAR), Length(100,true)
   *  @param mMakertimesaleStartDatetime Database column m_makertimesale_start_datetime DBType(DATETIME)
   *  @param mMakertimesaleEndDatetime Database column m_makertimesale_end_datetime DBType(DATETIME)
   *  @param mMakertimesaleRdatetime Database column m_makertimesale_rdatetime DBType(DATETIME)
   *  @param mMakertimesaleUdatetime Database column m_makertimesale_udatetime DBType(DATETIME)
   *  @param mMakertimesaleRuser Database column m_makertimesale_ruser DBType(INT)
   *  @param mMakertimesaleUuser Database column m_makertimesale_uuser DBType(INT) */
  case class MMakertimesaleRow(mMakertimesaleId: Int, mMakertimesaleDeleteFlag: Int, mMakertimesaleMMakerId: Int, mMakertimesaleTitle: String, mMakertimesaleStartDatetime: java.sql.Timestamp, mMakertimesaleEndDatetime: java.sql.Timestamp, mMakertimesaleRdatetime: java.sql.Timestamp, mMakertimesaleUdatetime: java.sql.Timestamp, mMakertimesaleRuser: Int, mMakertimesaleUuser: Int)
  /** GetResult implicit for fetching MMakertimesaleRow objects using plain SQL queries */
  implicit def GetResultMMakertimesaleRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MMakertimesaleRow] = GR{
    prs => import prs._
    MMakertimesaleRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table m_makertimesale. Objects of this class serve as prototypes for rows in queries. */
  class MMakertimesale(_tableTag: Tag) extends Table[MMakertimesaleRow](_tableTag, "m_makertimesale") {
    def * = (mMakertimesaleId, mMakertimesaleDeleteFlag, mMakertimesaleMMakerId, mMakertimesaleTitle, mMakertimesaleStartDatetime, mMakertimesaleEndDatetime, mMakertimesaleRdatetime, mMakertimesaleUdatetime, mMakertimesaleRuser, mMakertimesaleUuser) <> (MMakertimesaleRow.tupled, MMakertimesaleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMakertimesaleId.?, mMakertimesaleDeleteFlag.?, mMakertimesaleMMakerId.?, mMakertimesaleTitle.?, mMakertimesaleStartDatetime.?, mMakertimesaleEndDatetime.?, mMakertimesaleRdatetime.?, mMakertimesaleUdatetime.?, mMakertimesaleRuser.?, mMakertimesaleUuser.?).shaped.<>({r=>import r._; _1.map(_=> MMakertimesaleRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_makertimesale_id DBType(INT), AutoInc, PrimaryKey */
    val mMakertimesaleId: Column[Int] = column[Int]("m_makertimesale_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_makertimesale_delete_flag DBType(INT) */
    val mMakertimesaleDeleteFlag: Column[Int] = column[Int]("m_makertimesale_delete_flag")
    /** Database column m_makertimesale_m_maker_id DBType(INT) */
    val mMakertimesaleMMakerId: Column[Int] = column[Int]("m_makertimesale_m_maker_id")
    /** Database column m_makertimesale_title DBType(VARCHAR), Length(100,true) */
    val mMakertimesaleTitle: Column[String] = column[String]("m_makertimesale_title", O.Length(100,varying=true))
    /** Database column m_makertimesale_start_datetime DBType(DATETIME) */
    val mMakertimesaleStartDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_makertimesale_start_datetime")
    /** Database column m_makertimesale_end_datetime DBType(DATETIME) */
    val mMakertimesaleEndDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_makertimesale_end_datetime")
    /** Database column m_makertimesale_rdatetime DBType(DATETIME) */
    val mMakertimesaleRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_makertimesale_rdatetime")
    /** Database column m_makertimesale_udatetime DBType(DATETIME) */
    val mMakertimesaleUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_makertimesale_udatetime")
    /** Database column m_makertimesale_ruser DBType(INT) */
    val mMakertimesaleRuser: Column[Int] = column[Int]("m_makertimesale_ruser")
    /** Database column m_makertimesale_uuser DBType(INT) */
    val mMakertimesaleUuser: Column[Int] = column[Int]("m_makertimesale_uuser")
  }
  /** Collection-like TableQuery object for table MMakertimesale */
  lazy val MMakertimesale = new TableQuery(tag => new MMakertimesale(tag))
  
  /** Entity class storing rows of table MMakertimesaleItem
   *  @param mMakertimesaleItemId Database column m_makertimesale_item_id DBType(INT), AutoInc, PrimaryKey
   *  @param mMakertimesaleItemMMakertimesaleId Database column m_makertimesale_item_m_makertimesale_id DBType(INT)
   *  @param mMakertimesaleItemMItemId Database column m_makertimesale_item_m_item_id DBType(INT)
   *  @param mMakertimesaleItemPercent Database column m_makertimesale_item_percent DBType(DECIMAL) */
  case class MMakertimesaleItemRow(mMakertimesaleItemId: Int, mMakertimesaleItemMMakertimesaleId: Int, mMakertimesaleItemMItemId: Int, mMakertimesaleItemPercent: scala.math.BigDecimal)
  /** GetResult implicit for fetching MMakertimesaleItemRow objects using plain SQL queries */
  implicit def GetResultMMakertimesaleItemRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal]): GR[MMakertimesaleItemRow] = GR{
    prs => import prs._
    MMakertimesaleItemRow.tupled((<<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal]))
  }
  /** Table description of table m_makertimesale_item. Objects of this class serve as prototypes for rows in queries. */
  class MMakertimesaleItem(_tableTag: Tag) extends Table[MMakertimesaleItemRow](_tableTag, "m_makertimesale_item") {
    def * = (mMakertimesaleItemId, mMakertimesaleItemMMakertimesaleId, mMakertimesaleItemMItemId, mMakertimesaleItemPercent) <> (MMakertimesaleItemRow.tupled, MMakertimesaleItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMakertimesaleItemId.?, mMakertimesaleItemMMakertimesaleId.?, mMakertimesaleItemMItemId.?, mMakertimesaleItemPercent.?).shaped.<>({r=>import r._; _1.map(_=> MMakertimesaleItemRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_makertimesale_item_id DBType(INT), AutoInc, PrimaryKey */
    val mMakertimesaleItemId: Column[Int] = column[Int]("m_makertimesale_item_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_makertimesale_item_m_makertimesale_id DBType(INT) */
    val mMakertimesaleItemMMakertimesaleId: Column[Int] = column[Int]("m_makertimesale_item_m_makertimesale_id")
    /** Database column m_makertimesale_item_m_item_id DBType(INT) */
    val mMakertimesaleItemMItemId: Column[Int] = column[Int]("m_makertimesale_item_m_item_id")
    /** Database column m_makertimesale_item_percent DBType(DECIMAL) */
    val mMakertimesaleItemPercent: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_makertimesale_item_percent")
  }
  /** Collection-like TableQuery object for table MMakertimesaleItem */
  lazy val MMakertimesaleItem = new TableQuery(tag => new MMakertimesaleItem(tag))
  
  /** Entity class storing rows of table MMallsale
   *  @param mMallsaleId Database column m_mallsale_id DBType(INT), AutoInc, PrimaryKey
   *  @param mMallsaleTitle Database column m_mallsale_title DBType(VARCHAR), Length(100,true)
   *  @param mMallsaleApplystartDatetime Database column m_mallsale_applystart_datetime DBType(DATETIME)
   *  @param mMallsaleApplyendDatetime Database column m_mallsale_applyend_datetime DBType(DATETIME)
   *  @param mMallsaleStartDatetime Database column m_mallsale_start_datetime DBType(DATETIME)
   *  @param mMallsaleEndDatetime Database column m_mallsale_end_datetime DBType(DATETIME)
   *  @param mMallsaleRdatetime Database column m_mallsale_rdatetime DBType(DATETIME)
   *  @param mMallsaleUdatetime Database column m_mallsale_udatetime DBType(DATETIME)
   *  @param mMallsaleRuser Database column m_mallsale_ruser DBType(INT)
   *  @param mMallsaleUuser Database column m_mallsale_uuser DBType(INT) */
  case class MMallsaleRow(mMallsaleId: Int, mMallsaleTitle: String, mMallsaleApplystartDatetime: java.sql.Timestamp, mMallsaleApplyendDatetime: java.sql.Timestamp, mMallsaleStartDatetime: java.sql.Timestamp, mMallsaleEndDatetime: java.sql.Timestamp, mMallsaleRdatetime: java.sql.Timestamp, mMallsaleUdatetime: java.sql.Timestamp, mMallsaleRuser: Int, mMallsaleUuser: Int)
  /** GetResult implicit for fetching MMallsaleRow objects using plain SQL queries */
  implicit def GetResultMMallsaleRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MMallsaleRow] = GR{
    prs => import prs._
    MMallsaleRow.tupled((<<[Int], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table m_mallsale. Objects of this class serve as prototypes for rows in queries. */
  class MMallsale(_tableTag: Tag) extends Table[MMallsaleRow](_tableTag, "m_mallsale") {
    def * = (mMallsaleId, mMallsaleTitle, mMallsaleApplystartDatetime, mMallsaleApplyendDatetime, mMallsaleStartDatetime, mMallsaleEndDatetime, mMallsaleRdatetime, mMallsaleUdatetime, mMallsaleRuser, mMallsaleUuser) <> (MMallsaleRow.tupled, MMallsaleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMallsaleId.?, mMallsaleTitle.?, mMallsaleApplystartDatetime.?, mMallsaleApplyendDatetime.?, mMallsaleStartDatetime.?, mMallsaleEndDatetime.?, mMallsaleRdatetime.?, mMallsaleUdatetime.?, mMallsaleRuser.?, mMallsaleUuser.?).shaped.<>({r=>import r._; _1.map(_=> MMallsaleRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_mallsale_id DBType(INT), AutoInc, PrimaryKey */
    val mMallsaleId: Column[Int] = column[Int]("m_mallsale_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_mallsale_title DBType(VARCHAR), Length(100,true) */
    val mMallsaleTitle: Column[String] = column[String]("m_mallsale_title", O.Length(100,varying=true))
    /** Database column m_mallsale_applystart_datetime DBType(DATETIME) */
    val mMallsaleApplystartDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_mallsale_applystart_datetime")
    /** Database column m_mallsale_applyend_datetime DBType(DATETIME) */
    val mMallsaleApplyendDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_mallsale_applyend_datetime")
    /** Database column m_mallsale_start_datetime DBType(DATETIME) */
    val mMallsaleStartDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_mallsale_start_datetime")
    /** Database column m_mallsale_end_datetime DBType(DATETIME) */
    val mMallsaleEndDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_mallsale_end_datetime")
    /** Database column m_mallsale_rdatetime DBType(DATETIME) */
    val mMallsaleRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_mallsale_rdatetime")
    /** Database column m_mallsale_udatetime DBType(DATETIME) */
    val mMallsaleUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_mallsale_udatetime")
    /** Database column m_mallsale_ruser DBType(INT) */
    val mMallsaleRuser: Column[Int] = column[Int]("m_mallsale_ruser")
    /** Database column m_mallsale_uuser DBType(INT) */
    val mMallsaleUuser: Column[Int] = column[Int]("m_mallsale_uuser")
  }
  /** Collection-like TableQuery object for table MMallsale */
  lazy val MMallsale = new TableQuery(tag => new MMallsale(tag))
  
  /** Entity class storing rows of table MMallsaleItem
   *  @param mMallsaleItemId Database column m_mallsale_item_id DBType(INT), AutoInc, PrimaryKey
   *  @param mMallsaleItemMMallsaleId Database column m_mallsale_item_m_mallsale_id DBType(INT)
   *  @param mMallsaleItemStatus Database column m_mallsale_item_status DBType(INT)
   *  @param mMallsaleItemApplydatetime Database column m_mallsale_item_applydatetime DBType(DATETIME)
   *  @param mMallsaleItemFixdatetime Database column m_mallsale_item_fixdatetime DBType(DATETIME)
   *  @param mMallsaleItemPaiddatetime Database column m_mallsale_item_paiddatetime DBType(DATETIME)
   *  @param mMallsaleItemMMakerId Database column m_mallsale_item_m_maker_id DBType(INT)
   *  @param mMallsaleItemMItemId Database column m_mallsale_item_m_item_id DBType(INT)
   *  @param mMallsaleItemPercent Database column m_mallsale_item_percent DBType(DECIMAL) */
  case class MMallsaleItemRow(mMallsaleItemId: Int, mMallsaleItemMMallsaleId: Int, mMallsaleItemStatus: Int, mMallsaleItemApplydatetime: java.sql.Timestamp, mMallsaleItemFixdatetime: java.sql.Timestamp, mMallsaleItemPaiddatetime: java.sql.Timestamp, mMallsaleItemMMakerId: Int, mMallsaleItemMItemId: Int, mMallsaleItemPercent: scala.math.BigDecimal)
  /** GetResult implicit for fetching MMallsaleItemRow objects using plain SQL queries */
  implicit def GetResultMMallsaleItemRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp], e2: GR[scala.math.BigDecimal]): GR[MMallsaleItemRow] = GR{
    prs => import prs._
    MMallsaleItemRow.tupled((<<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int], <<[scala.math.BigDecimal]))
  }
  /** Table description of table m_mallsale_item. Objects of this class serve as prototypes for rows in queries. */
  class MMallsaleItem(_tableTag: Tag) extends Table[MMallsaleItemRow](_tableTag, "m_mallsale_item") {
    def * = (mMallsaleItemId, mMallsaleItemMMallsaleId, mMallsaleItemStatus, mMallsaleItemApplydatetime, mMallsaleItemFixdatetime, mMallsaleItemPaiddatetime, mMallsaleItemMMakerId, mMallsaleItemMItemId, mMallsaleItemPercent) <> (MMallsaleItemRow.tupled, MMallsaleItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMallsaleItemId.?, mMallsaleItemMMallsaleId.?, mMallsaleItemStatus.?, mMallsaleItemApplydatetime.?, mMallsaleItemFixdatetime.?, mMallsaleItemPaiddatetime.?, mMallsaleItemMMakerId.?, mMallsaleItemMItemId.?, mMallsaleItemPercent.?).shaped.<>({r=>import r._; _1.map(_=> MMallsaleItemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_mallsale_item_id DBType(INT), AutoInc, PrimaryKey */
    val mMallsaleItemId: Column[Int] = column[Int]("m_mallsale_item_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_mallsale_item_m_mallsale_id DBType(INT) */
    val mMallsaleItemMMallsaleId: Column[Int] = column[Int]("m_mallsale_item_m_mallsale_id")
    /** Database column m_mallsale_item_status DBType(INT) */
    val mMallsaleItemStatus: Column[Int] = column[Int]("m_mallsale_item_status")
    /** Database column m_mallsale_item_applydatetime DBType(DATETIME) */
    val mMallsaleItemApplydatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_mallsale_item_applydatetime")
    /** Database column m_mallsale_item_fixdatetime DBType(DATETIME) */
    val mMallsaleItemFixdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_mallsale_item_fixdatetime")
    /** Database column m_mallsale_item_paiddatetime DBType(DATETIME) */
    val mMallsaleItemPaiddatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_mallsale_item_paiddatetime")
    /** Database column m_mallsale_item_m_maker_id DBType(INT) */
    val mMallsaleItemMMakerId: Column[Int] = column[Int]("m_mallsale_item_m_maker_id")
    /** Database column m_mallsale_item_m_item_id DBType(INT) */
    val mMallsaleItemMItemId: Column[Int] = column[Int]("m_mallsale_item_m_item_id")
    /** Database column m_mallsale_item_percent DBType(DECIMAL) */
    val mMallsaleItemPercent: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_mallsale_item_percent")
  }
  /** Collection-like TableQuery object for table MMallsaleItem */
  lazy val MMallsaleItem = new TableQuery(tag => new MMallsaleItem(tag))
  
  /** Entity class storing rows of table MMaterial
   *  @param mMaterialId Database column m_material_id DBType(INT), AutoInc, PrimaryKey
   *  @param mMaterialVoidFlag Database column m_material_void_flag DBType(TINYINT)
   *  @param mMaterialOrder Database column m_material_order DBType(INT)
   *  @param mMaterialCategory Database column m_material_category DBType(INT)
   *  @param mMaterialName Database column m_material_name DBType(VARCHAR), Length(100,true)
   *  @param mMaterialNameCh Database column m_material_name_ch DBType(VARCHAR), Length(100,true)
   *  @param mMaterialNameEn Database column m_material_name_en DBType(VARCHAR), Length(100,true)
   *  @param mMaterialRdatetime Database column m_material_rdatetime DBType(DATETIME)
   *  @param mMaterialUdatetime Database column m_material_udatetime DBType(DATETIME)
   *  @param mMaterialRuser Database column m_material_ruser DBType(INT)
   *  @param mMaterialUuser Database column m_material_uuser DBType(INT) */
  case class MMaterialRow(mMaterialId: Int, mMaterialVoidFlag: Byte, mMaterialOrder: Int, mMaterialCategory: Int, mMaterialName: String, mMaterialNameCh: String, mMaterialNameEn: String, mMaterialRdatetime: java.sql.Timestamp, mMaterialUdatetime: java.sql.Timestamp, mMaterialRuser: Int, mMaterialUuser: Int)
  /** GetResult implicit for fetching MMaterialRow objects using plain SQL queries */
  implicit def GetResultMMaterialRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[java.sql.Timestamp]): GR[MMaterialRow] = GR{
    prs => import prs._
    MMaterialRow.tupled((<<[Int], <<[Byte], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table m_material. Objects of this class serve as prototypes for rows in queries. */
  class MMaterial(_tableTag: Tag) extends Table[MMaterialRow](_tableTag, "m_material") {
    def * = (mMaterialId, mMaterialVoidFlag, mMaterialOrder, mMaterialCategory, mMaterialName, mMaterialNameCh, mMaterialNameEn, mMaterialRdatetime, mMaterialUdatetime, mMaterialRuser, mMaterialUuser) <> (MMaterialRow.tupled, MMaterialRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMaterialId.?, mMaterialVoidFlag.?, mMaterialOrder.?, mMaterialCategory.?, mMaterialName.?, mMaterialNameCh.?, mMaterialNameEn.?, mMaterialRdatetime.?, mMaterialUdatetime.?, mMaterialRuser.?, mMaterialUuser.?).shaped.<>({r=>import r._; _1.map(_=> MMaterialRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_material_id DBType(INT), AutoInc, PrimaryKey */
    val mMaterialId: Column[Int] = column[Int]("m_material_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_material_void_flag DBType(TINYINT) */
    val mMaterialVoidFlag: Column[Byte] = column[Byte]("m_material_void_flag")
    /** Database column m_material_order DBType(INT) */
    val mMaterialOrder: Column[Int] = column[Int]("m_material_order")
    /** Database column m_material_category DBType(INT) */
    val mMaterialCategory: Column[Int] = column[Int]("m_material_category")
    /** Database column m_material_name DBType(VARCHAR), Length(100,true) */
    val mMaterialName: Column[String] = column[String]("m_material_name", O.Length(100,varying=true))
    /** Database column m_material_name_ch DBType(VARCHAR), Length(100,true) */
    val mMaterialNameCh: Column[String] = column[String]("m_material_name_ch", O.Length(100,varying=true))
    /** Database column m_material_name_en DBType(VARCHAR), Length(100,true) */
    val mMaterialNameEn: Column[String] = column[String]("m_material_name_en", O.Length(100,varying=true))
    /** Database column m_material_rdatetime DBType(DATETIME) */
    val mMaterialRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_material_rdatetime")
    /** Database column m_material_udatetime DBType(DATETIME) */
    val mMaterialUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_material_udatetime")
    /** Database column m_material_ruser DBType(INT) */
    val mMaterialRuser: Column[Int] = column[Int]("m_material_ruser")
    /** Database column m_material_uuser DBType(INT) */
    val mMaterialUuser: Column[Int] = column[Int]("m_material_uuser")
  }
  /** Collection-like TableQuery object for table MMaterial */
  lazy val MMaterial = new TableQuery(tag => new MMaterial(tag))
  
  /** Entity class storing rows of table MMeta
   *  @param mMetaId Database column m_meta_id DBType(INT), AutoInc, PrimaryKey
   *  @param mMetaNameCh Database column m_meta_name_ch DBType(VARCHAR), Length(100,true)
   *  @param mMetaNameJp Database column m_meta_name_jp DBType(VARCHAR), Length(100,true)
   *  @param mMetaType Database column m_meta_type DBType(VARCHAR), Length(20,true)
   *  @param mMetaTApplicationTemplateId Database column m_meta_t_application_template_id DBType(INT) */
  case class MMetaRow(mMetaId: Int, mMetaNameCh: String, mMetaNameJp: String, mMetaType: String, mMetaTApplicationTemplateId: Int)
  /** GetResult implicit for fetching MMetaRow objects using plain SQL queries */
  implicit def GetResultMMetaRow(implicit e0: GR[Int], e1: GR[String]): GR[MMetaRow] = GR{
    prs => import prs._
    MMetaRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table m_meta. Objects of this class serve as prototypes for rows in queries. */
  class MMeta(_tableTag: Tag) extends Table[MMetaRow](_tableTag, "m_meta") {
    def * = (mMetaId, mMetaNameCh, mMetaNameJp, mMetaType, mMetaTApplicationTemplateId) <> (MMetaRow.tupled, MMetaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMetaId.?, mMetaNameCh.?, mMetaNameJp.?, mMetaType.?, mMetaTApplicationTemplateId.?).shaped.<>({r=>import r._; _1.map(_=> MMetaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_meta_id DBType(INT), AutoInc, PrimaryKey */
    val mMetaId: Column[Int] = column[Int]("m_meta_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_meta_name_ch DBType(VARCHAR), Length(100,true) */
    val mMetaNameCh: Column[String] = column[String]("m_meta_name_ch", O.Length(100,varying=true))
    /** Database column m_meta_name_jp DBType(VARCHAR), Length(100,true) */
    val mMetaNameJp: Column[String] = column[String]("m_meta_name_jp", O.Length(100,varying=true))
    /** Database column m_meta_type DBType(VARCHAR), Length(20,true) */
    val mMetaType: Column[String] = column[String]("m_meta_type", O.Length(20,varying=true))
    /** Database column m_meta_t_application_template_id DBType(INT) */
    val mMetaTApplicationTemplateId: Column[Int] = column[Int]("m_meta_t_application_template_id")
  }
  /** Collection-like TableQuery object for table MMeta */
  lazy val MMeta = new TableQuery(tag => new MMeta(tag))
  
  /** Entity class storing rows of table MMetaValue
   *  @param mMetaValueId Database column m_meta_value_id DBType(INT), AutoInc, PrimaryKey
   *  @param mMetaValueMMetaId Database column m_meta_value_m_meta_id DBType(INT)
   *  @param mMetaValueCh Database column m_meta_value_ch DBType(VARCHAR), Length(100,true)
   *  @param mMetaValueJp Database column m_meta_value_jp DBType(VARCHAR), Length(100,true)
   *  @param mMetaValueOrder Database column m_meta_value_order DBType(INT) */
  case class MMetaValueRow(mMetaValueId: Int, mMetaValueMMetaId: Int, mMetaValueCh: String, mMetaValueJp: String, mMetaValueOrder: Int)
  /** GetResult implicit for fetching MMetaValueRow objects using plain SQL queries */
  implicit def GetResultMMetaValueRow(implicit e0: GR[Int], e1: GR[String]): GR[MMetaValueRow] = GR{
    prs => import prs._
    MMetaValueRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table m_meta_value. Objects of this class serve as prototypes for rows in queries. */
  class MMetaValue(_tableTag: Tag) extends Table[MMetaValueRow](_tableTag, "m_meta_value") {
    def * = (mMetaValueId, mMetaValueMMetaId, mMetaValueCh, mMetaValueJp, mMetaValueOrder) <> (MMetaValueRow.tupled, MMetaValueRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMetaValueId.?, mMetaValueMMetaId.?, mMetaValueCh.?, mMetaValueJp.?, mMetaValueOrder.?).shaped.<>({r=>import r._; _1.map(_=> MMetaValueRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_meta_value_id DBType(INT), AutoInc, PrimaryKey */
    val mMetaValueId: Column[Int] = column[Int]("m_meta_value_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_meta_value_m_meta_id DBType(INT) */
    val mMetaValueMMetaId: Column[Int] = column[Int]("m_meta_value_m_meta_id")
    /** Database column m_meta_value_ch DBType(VARCHAR), Length(100,true) */
    val mMetaValueCh: Column[String] = column[String]("m_meta_value_ch", O.Length(100,varying=true))
    /** Database column m_meta_value_jp DBType(VARCHAR), Length(100,true) */
    val mMetaValueJp: Column[String] = column[String]("m_meta_value_jp", O.Length(100,varying=true))
    /** Database column m_meta_value_order DBType(INT) */
    val mMetaValueOrder: Column[Int] = column[Int]("m_meta_value_order")
  }
  /** Collection-like TableQuery object for table MMetaValue */
  lazy val MMetaValue = new TableQuery(tag => new MMetaValue(tag))
  
  /** Entity class storing rows of table MMobilelog
   *  @param mMobilelogId Database column m_mobilelog_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mMobilelogMobile Database column m_mobilelog_mobile DBType(VARCHAR), Length(20,true), Default(None)
   *  @param mMobilelogAuthcode Database column m_mobilelog_authcode DBType(VARCHAR), Length(20,true), Default(None)
   *  @param mMobilelogSendDatetime Database column m_mobilelog_send_datetime DBType(DATETIME), Default(None)
   *  @param mMobilelogSendStatus Database column m_mobilelog_send_status DBType(VARCHAR), Length(5,true), Default(None)
   *  @param mMobilelogSendPage Database column m_mobilelog_send_page DBType(CHAR), Length(2,false), Default(None)
   *  @param mMobilelogStatus Database column m_mobilelog_status DBType(CHAR), Length(1,false), Default(Some(0))
   *  @param mMobilelogMemo Database column m_mobilelog_memo DBType(TEXT), Length(65535,true), Default(None) */
  case class MMobilelogRow(mMobilelogId: Int, mMobilelogMobile: Option[String] = None, mMobilelogAuthcode: Option[String] = None, mMobilelogSendDatetime: Option[java.sql.Timestamp] = None, mMobilelogSendStatus: Option[String] = None, mMobilelogSendPage: Option[String] = None, mMobilelogStatus: Option[String] = Some("0"), mMobilelogMemo: Option[String] = None)
  /** GetResult implicit for fetching MMobilelogRow objects using plain SQL queries */
  implicit def GetResultMMobilelogRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]]): GR[MMobilelogRow] = GR{
    prs => import prs._
    MMobilelogRow.tupled((<<[Int], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table m_mobilelog. Objects of this class serve as prototypes for rows in queries. */
  class MMobilelog(_tableTag: Tag) extends Table[MMobilelogRow](_tableTag, "m_mobilelog") {
    def * = (mMobilelogId, mMobilelogMobile, mMobilelogAuthcode, mMobilelogSendDatetime, mMobilelogSendStatus, mMobilelogSendPage, mMobilelogStatus, mMobilelogMemo) <> (MMobilelogRow.tupled, MMobilelogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMobilelogId.?, mMobilelogMobile, mMobilelogAuthcode, mMobilelogSendDatetime, mMobilelogSendStatus, mMobilelogSendPage, mMobilelogStatus, mMobilelogMemo).shaped.<>({r=>import r._; _1.map(_=> MMobilelogRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_mobilelog_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mMobilelogId: Column[Int] = column[Int]("m_mobilelog_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_mobilelog_mobile DBType(VARCHAR), Length(20,true), Default(None) */
    val mMobilelogMobile: Column[Option[String]] = column[Option[String]]("m_mobilelog_mobile", O.Length(20,varying=true), O.Default(None))
    /** Database column m_mobilelog_authcode DBType(VARCHAR), Length(20,true), Default(None) */
    val mMobilelogAuthcode: Column[Option[String]] = column[Option[String]]("m_mobilelog_authcode", O.Length(20,varying=true), O.Default(None))
    /** Database column m_mobilelog_send_datetime DBType(DATETIME), Default(None) */
    val mMobilelogSendDatetime: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("m_mobilelog_send_datetime", O.Default(None))
    /** Database column m_mobilelog_send_status DBType(VARCHAR), Length(5,true), Default(None) */
    val mMobilelogSendStatus: Column[Option[String]] = column[Option[String]]("m_mobilelog_send_status", O.Length(5,varying=true), O.Default(None))
    /** Database column m_mobilelog_send_page DBType(CHAR), Length(2,false), Default(None) */
    val mMobilelogSendPage: Column[Option[String]] = column[Option[String]]("m_mobilelog_send_page", O.Length(2,varying=false), O.Default(None))
    /** Database column m_mobilelog_status DBType(CHAR), Length(1,false), Default(Some(0)) */
    val mMobilelogStatus: Column[Option[String]] = column[Option[String]]("m_mobilelog_status", O.Length(1,varying=false), O.Default(Some("0")))
    /** Database column m_mobilelog_memo DBType(TEXT), Length(65535,true), Default(None) */
    val mMobilelogMemo: Column[Option[String]] = column[Option[String]]("m_mobilelog_memo", O.Length(65535,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table MMobilelog */
  lazy val MMobilelog = new TableQuery(tag => new MMobilelog(tag))
  
  /** Entity class storing rows of table MMobileorder
   *  @param mMobileorderId Database column m_mobileorder_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mMobileorderMMakerId Database column m_mobileorder_m_maker_id DBType(INT), Default(None)
   *  @param mMobileorderTJuchuId Database column m_mobileorder_t_juchu_id DBType(INT), Default(None)
   *  @param mMobileorderMobile Database column m_mobileorder_mobile DBType(VARCHAR), Length(20,true), Default(None)
   *  @param mMobileorderSendDatetime Database column m_mobileorder_send_datetime DBType(DATETIME), Default(None)
   *  @param mMobileorderSendStatus Database column m_mobileorder_send_status DBType(VARCHAR), Length(5,true), Default(None)
   *  @param mMobileorderSendPage Database column m_mobileorder_send_page DBType(CHAR), Length(2,false), Default(None)
   *  @param mMobileorderContent Database column m_mobileorder_content DBType(TEXT), Length(65535,true), Default(None) */
  case class MMobileorderRow(mMobileorderId: Int, mMobileorderMMakerId: Option[Int] = None, mMobileorderTJuchuId: Option[Int] = None, mMobileorderMobile: Option[String] = None, mMobileorderSendDatetime: Option[java.sql.Timestamp] = None, mMobileorderSendStatus: Option[String] = None, mMobileorderSendPage: Option[String] = None, mMobileorderContent: Option[String] = None)
  /** GetResult implicit for fetching MMobileorderRow objects using plain SQL queries */
  implicit def GetResultMMobileorderRow(implicit e0: GR[Int], e1: GR[Option[Int]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[MMobileorderRow] = GR{
    prs => import prs._
    MMobileorderRow.tupled((<<[Int], <<?[Int], <<?[Int], <<?[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table m_mobileorder. Objects of this class serve as prototypes for rows in queries. */
  class MMobileorder(_tableTag: Tag) extends Table[MMobileorderRow](_tableTag, "m_mobileorder") {
    def * = (mMobileorderId, mMobileorderMMakerId, mMobileorderTJuchuId, mMobileorderMobile, mMobileorderSendDatetime, mMobileorderSendStatus, mMobileorderSendPage, mMobileorderContent) <> (MMobileorderRow.tupled, MMobileorderRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mMobileorderId.?, mMobileorderMMakerId, mMobileorderTJuchuId, mMobileorderMobile, mMobileorderSendDatetime, mMobileorderSendStatus, mMobileorderSendPage, mMobileorderContent).shaped.<>({r=>import r._; _1.map(_=> MMobileorderRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_mobileorder_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mMobileorderId: Column[Int] = column[Int]("m_mobileorder_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_mobileorder_m_maker_id DBType(INT), Default(None) */
    val mMobileorderMMakerId: Column[Option[Int]] = column[Option[Int]]("m_mobileorder_m_maker_id", O.Default(None))
    /** Database column m_mobileorder_t_juchu_id DBType(INT), Default(None) */
    val mMobileorderTJuchuId: Column[Option[Int]] = column[Option[Int]]("m_mobileorder_t_juchu_id", O.Default(None))
    /** Database column m_mobileorder_mobile DBType(VARCHAR), Length(20,true), Default(None) */
    val mMobileorderMobile: Column[Option[String]] = column[Option[String]]("m_mobileorder_mobile", O.Length(20,varying=true), O.Default(None))
    /** Database column m_mobileorder_send_datetime DBType(DATETIME), Default(None) */
    val mMobileorderSendDatetime: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("m_mobileorder_send_datetime", O.Default(None))
    /** Database column m_mobileorder_send_status DBType(VARCHAR), Length(5,true), Default(None) */
    val mMobileorderSendStatus: Column[Option[String]] = column[Option[String]]("m_mobileorder_send_status", O.Length(5,varying=true), O.Default(None))
    /** Database column m_mobileorder_send_page DBType(CHAR), Length(2,false), Default(None) */
    val mMobileorderSendPage: Column[Option[String]] = column[Option[String]]("m_mobileorder_send_page", O.Length(2,varying=false), O.Default(None))
    /** Database column m_mobileorder_content DBType(TEXT), Length(65535,true), Default(None) */
    val mMobileorderContent: Column[Option[String]] = column[Option[String]]("m_mobileorder_content", O.Length(65535,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table MMobileorder */
  lazy val MMobileorder = new TableQuery(tag => new MMobileorder(tag))
  
  /** Entity class storing rows of table MMsgBusiness
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param makeId Database column make_id DBType(INT)
   *  @param createTime Database column create_time DBType(INT)
   *  @param startDate Database column start_date DBType(DATE)
   *  @param endDate Database column end_date DBType(DATE)
   *  @param serviceId Database column service_id DBType(INT)
   *  @param serviceState Database column service_state DBType(BIT)
   *  @param isTry Database column is_try DBType(BIT)
   *  @param storeName Database column store_name DBType(VARCHAR), Length(255,true)
   *  @param makeName Database column make_name DBType(VARCHAR), Length(255,true)
   *  @param operateCate Database column operate_cate DBType(VARCHAR), Length(100,true)
   *  @param tel Database column tel DBType(VARCHAR), Length(20,true)
   *  @param linkman Database column linkman DBType(VARCHAR), Length(50,true)
   *  @param qq Database column qq DBType(VARCHAR), Length(12,true)
   *  @param tel1 Database column tel1 DBType(VARCHAR), Length(20,true)
   *  @param linkman1 Database column linkman1 DBType(VARCHAR), Length(50,true) */
  case class MMsgBusinessRow(id: Int, makeId: Int, createTime: Int, startDate: java.sql.Date, endDate: java.sql.Date, serviceId: Int, serviceState: Boolean, isTry: Boolean, storeName: String, makeName: String, operateCate: String, tel: String, linkman: String, qq: String, tel1: String, linkman1: String)
  /** GetResult implicit for fetching MMsgBusinessRow objects using plain SQL queries */
  implicit def GetResultMMsgBusinessRow(implicit e0: GR[Int], e1: GR[java.sql.Date], e2: GR[Boolean], e3: GR[String]): GR[MMsgBusinessRow] = GR{
    prs => import prs._
    MMsgBusinessRow.tupled((<<[Int], <<[Int], <<[Int], <<[java.sql.Date], <<[java.sql.Date], <<[Int], <<[Boolean], <<[Boolean], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table m_msg_business. Objects of this class serve as prototypes for rows in queries. */
  class MMsgBusiness(_tableTag: Tag) extends Table[MMsgBusinessRow](_tableTag, "m_msg_business") {
    def * = (id, makeId, createTime, startDate, endDate, serviceId, serviceState, isTry, storeName, makeName, operateCate, tel, linkman, qq, tel1, linkman1) <> (MMsgBusinessRow.tupled, MMsgBusinessRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, makeId.?, createTime.?, startDate.?, endDate.?, serviceId.?, serviceState.?, isTry.?, storeName.?, makeName.?, operateCate.?, tel.?, linkman.?, qq.?, tel1.?, linkman1.?).shaped.<>({r=>import r._; _1.map(_=> MMsgBusinessRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column make_id DBType(INT) */
    val makeId: Column[Int] = column[Int]("make_id")
    /** Database column create_time DBType(INT) */
    val createTime: Column[Int] = column[Int]("create_time")
    /** Database column start_date DBType(DATE) */
    val startDate: Column[java.sql.Date] = column[java.sql.Date]("start_date")
    /** Database column end_date DBType(DATE) */
    val endDate: Column[java.sql.Date] = column[java.sql.Date]("end_date")
    /** Database column service_id DBType(INT) */
    val serviceId: Column[Int] = column[Int]("service_id")
    /** Database column service_state DBType(BIT) */
    val serviceState: Column[Boolean] = column[Boolean]("service_state")
    /** Database column is_try DBType(BIT) */
    val isTry: Column[Boolean] = column[Boolean]("is_try")
    /** Database column store_name DBType(VARCHAR), Length(255,true) */
    val storeName: Column[String] = column[String]("store_name", O.Length(255,varying=true))
    /** Database column make_name DBType(VARCHAR), Length(255,true) */
    val makeName: Column[String] = column[String]("make_name", O.Length(255,varying=true))
    /** Database column operate_cate DBType(VARCHAR), Length(100,true) */
    val operateCate: Column[String] = column[String]("operate_cate", O.Length(100,varying=true))
    /** Database column tel DBType(VARCHAR), Length(20,true) */
    val tel: Column[String] = column[String]("tel", O.Length(20,varying=true))
    /** Database column linkman DBType(VARCHAR), Length(50,true) */
    val linkman: Column[String] = column[String]("linkman", O.Length(50,varying=true))
    /** Database column qq DBType(VARCHAR), Length(12,true) */
    val qq: Column[String] = column[String]("qq", O.Length(12,varying=true))
    /** Database column tel1 DBType(VARCHAR), Length(20,true) */
    val tel1: Column[String] = column[String]("tel1", O.Length(20,varying=true))
    /** Database column linkman1 DBType(VARCHAR), Length(50,true) */
    val linkman1: Column[String] = column[String]("linkman1", O.Length(50,varying=true))
  }
  /** Collection-like TableQuery object for table MMsgBusiness */
  lazy val MMsgBusiness = new TableQuery(tag => new MMsgBusiness(tag))
  
  /** Entity class storing rows of table MMsgContent
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param senderId Database column sender_id DBType(INT)
   *  @param senderType Database column sender_type DBType(BIT)
   *  @param readerId Database column reader_id DBType(INT)
   *  @param readerType Database column reader_type DBType(BIT)
   *  @param msgContent Database column msg_content DBType(TEXT), Length(65535,true)
   *  @param pid Database column pid DBType(INT)
   *  @param rid Database column rid DBType(INT)
   *  @param createTime Database column create_time DBType(INT) */
  case class MMsgContentRow(id: Int, senderId: Int, senderType: Boolean, readerId: Int, readerType: Boolean, msgContent: String, pid: Int, rid: Int, createTime: Int)
  /** GetResult implicit for fetching MMsgContentRow objects using plain SQL queries */
  implicit def GetResultMMsgContentRow(implicit e0: GR[Int], e1: GR[Boolean], e2: GR[String]): GR[MMsgContentRow] = GR{
    prs => import prs._
    MMsgContentRow.tupled((<<[Int], <<[Int], <<[Boolean], <<[Int], <<[Boolean], <<[String], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table m_msg_content. Objects of this class serve as prototypes for rows in queries. */
  class MMsgContent(_tableTag: Tag) extends Table[MMsgContentRow](_tableTag, "m_msg_content") {
    def * = (id, senderId, senderType, readerId, readerType, msgContent, pid, rid, createTime) <> (MMsgContentRow.tupled, MMsgContentRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, senderId.?, senderType.?, readerId.?, readerType.?, msgContent.?, pid.?, rid.?, createTime.?).shaped.<>({r=>import r._; _1.map(_=> MMsgContentRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column sender_id DBType(INT) */
    val senderId: Column[Int] = column[Int]("sender_id")
    /** Database column sender_type DBType(BIT) */
    val senderType: Column[Boolean] = column[Boolean]("sender_type")
    /** Database column reader_id DBType(INT) */
    val readerId: Column[Int] = column[Int]("reader_id")
    /** Database column reader_type DBType(BIT) */
    val readerType: Column[Boolean] = column[Boolean]("reader_type")
    /** Database column msg_content DBType(TEXT), Length(65535,true) */
    val msgContent: Column[String] = column[String]("msg_content", O.Length(65535,varying=true))
    /** Database column pid DBType(INT) */
    val pid: Column[Int] = column[Int]("pid")
    /** Database column rid DBType(INT) */
    val rid: Column[Int] = column[Int]("rid")
    /** Database column create_time DBType(INT) */
    val createTime: Column[Int] = column[Int]("create_time")
  }
  /** Collection-like TableQuery object for table MMsgContent */
  lazy val MMsgContent = new TableQuery(tag => new MMsgContent(tag))
  
  /** Entity class storing rows of table MMsgOrder
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param makeId Database column make_id DBType(INT)
   *  @param serviceType Database column service_type DBType(INT)
   *  @param createTime Database column create_time DBType(INT)
   *  @param isPay Database column is_pay DBType(BIT)
   *  @param payTime Database column pay_time DBType(INT)
   *  @param payTotal Database column pay_total DBType(FLOAT)
   *  @param pointTotal Database column point_total DBType(FLOAT) */
  case class MMsgOrderRow(id: Int, makeId: Int, serviceType: Int, createTime: Int, isPay: Boolean, payTime: Int, payTotal: Float, pointTotal: Float)
  /** GetResult implicit for fetching MMsgOrderRow objects using plain SQL queries */
  implicit def GetResultMMsgOrderRow(implicit e0: GR[Int], e1: GR[Boolean], e2: GR[Float]): GR[MMsgOrderRow] = GR{
    prs => import prs._
    MMsgOrderRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Boolean], <<[Int], <<[Float], <<[Float]))
  }
  /** Table description of table m_msg_order. Objects of this class serve as prototypes for rows in queries. */
  class MMsgOrder(_tableTag: Tag) extends Table[MMsgOrderRow](_tableTag, "m_msg_order") {
    def * = (id, makeId, serviceType, createTime, isPay, payTime, payTotal, pointTotal) <> (MMsgOrderRow.tupled, MMsgOrderRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, makeId.?, serviceType.?, createTime.?, isPay.?, payTime.?, payTotal.?, pointTotal.?).shaped.<>({r=>import r._; _1.map(_=> MMsgOrderRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column make_id DBType(INT) */
    val makeId: Column[Int] = column[Int]("make_id")
    /** Database column service_type DBType(INT) */
    val serviceType: Column[Int] = column[Int]("service_type")
    /** Database column create_time DBType(INT) */
    val createTime: Column[Int] = column[Int]("create_time")
    /** Database column is_pay DBType(BIT) */
    val isPay: Column[Boolean] = column[Boolean]("is_pay")
    /** Database column pay_time DBType(INT) */
    val payTime: Column[Int] = column[Int]("pay_time")
    /** Database column pay_total DBType(FLOAT) */
    val payTotal: Column[Float] = column[Float]("pay_total")
    /** Database column point_total DBType(FLOAT) */
    val pointTotal: Column[Float] = column[Float]("point_total")
  }
  /** Collection-like TableQuery object for table MMsgOrder */
  lazy val MMsgOrder = new TableQuery(tag => new MMsgOrder(tag))
  
  /** Entity class storing rows of table MOem
   *  @param mOemId Database column m_oem_id DBType(INT), AutoInc, PrimaryKey
   *  @param mOemStatusFlag Database column m_oem_status_flag DBType(TINYINT)
   *  @param mOemCode Database column m_oem_code DBType(VARCHAR), Length(20,true)
   *  @param mOemMItemId Database column m_oem_m_item_id DBType(INT)
   *  @param mOemMCustomerId Database column m_oem_m_customer_id DBType(INT)
   *  @param mOemMMakerId Database column m_oem_m_maker_id DBType(INT)
   *  @param mOemLatestViewCustomer Database column m_oem_latest_view_customer DBType(DATETIME)
   *  @param mOemLatestViewMaker Database column m_oem_latest_view_maker DBType(DATETIME)
   *  @param mOemRdatetime Database column m_oem_rdatetime DBType(DATETIME)
   *  @param mOemUdatetime Database column m_oem_udatetime DBType(DATETIME) */
  case class MOemRow(mOemId: Int, mOemStatusFlag: Byte, mOemCode: String, mOemMItemId: Int, mOemMCustomerId: Int, mOemMMakerId: Int, mOemLatestViewCustomer: java.sql.Timestamp, mOemLatestViewMaker: java.sql.Timestamp, mOemRdatetime: java.sql.Timestamp, mOemUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MOemRow objects using plain SQL queries */
  implicit def GetResultMOemRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[java.sql.Timestamp]): GR[MOemRow] = GR{
    prs => import prs._
    MOemRow.tupled((<<[Int], <<[Byte], <<[String], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_oem. Objects of this class serve as prototypes for rows in queries. */
  class MOem(_tableTag: Tag) extends Table[MOemRow](_tableTag, "m_oem") {
    def * = (mOemId, mOemStatusFlag, mOemCode, mOemMItemId, mOemMCustomerId, mOemMMakerId, mOemLatestViewCustomer, mOemLatestViewMaker, mOemRdatetime, mOemUdatetime) <> (MOemRow.tupled, MOemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mOemId.?, mOemStatusFlag.?, mOemCode.?, mOemMItemId.?, mOemMCustomerId.?, mOemMMakerId.?, mOemLatestViewCustomer.?, mOemLatestViewMaker.?, mOemRdatetime.?, mOemUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MOemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_oem_id DBType(INT), AutoInc, PrimaryKey */
    val mOemId: Column[Int] = column[Int]("m_oem_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_oem_status_flag DBType(TINYINT) */
    val mOemStatusFlag: Column[Byte] = column[Byte]("m_oem_status_flag")
    /** Database column m_oem_code DBType(VARCHAR), Length(20,true) */
    val mOemCode: Column[String] = column[String]("m_oem_code", O.Length(20,varying=true))
    /** Database column m_oem_m_item_id DBType(INT) */
    val mOemMItemId: Column[Int] = column[Int]("m_oem_m_item_id")
    /** Database column m_oem_m_customer_id DBType(INT) */
    val mOemMCustomerId: Column[Int] = column[Int]("m_oem_m_customer_id")
    /** Database column m_oem_m_maker_id DBType(INT) */
    val mOemMMakerId: Column[Int] = column[Int]("m_oem_m_maker_id")
    /** Database column m_oem_latest_view_customer DBType(DATETIME) */
    val mOemLatestViewCustomer: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_oem_latest_view_customer")
    /** Database column m_oem_latest_view_maker DBType(DATETIME) */
    val mOemLatestViewMaker: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_oem_latest_view_maker")
    /** Database column m_oem_rdatetime DBType(DATETIME) */
    val mOemRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_oem_rdatetime")
    /** Database column m_oem_udatetime DBType(DATETIME) */
    val mOemUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_oem_udatetime")
  }
  /** Collection-like TableQuery object for table MOem */
  lazy val MOem = new TableQuery(tag => new MOem(tag))
  
  /** Entity class storing rows of table MOpenqueue
   *  @param mOpenqueueId Database column m_openqueue_id DBType(INT), AutoInc, PrimaryKey
   *  @param mOpenqueueMMakerId Database column m_openqueue_m_maker_id DBType(INT)
   *  @param mOpenqueueNote Database column m_openqueue_note DBType(TEXT), Length(65535,true)
   *  @param mOpenqueueStatus Database column m_openqueue_status DBType(INT)
   *  @param mOpenqueueRdatetime Database column m_openqueue_rdatetime DBType(DATETIME)
   *  @param mOpenqueueUdatetime Database column m_openqueue_udatetime DBType(DATETIME) */
  case class MOpenqueueRow(mOpenqueueId: Int, mOpenqueueMMakerId: Int, mOpenqueueNote: String, mOpenqueueStatus: Int, mOpenqueueRdatetime: java.sql.Timestamp, mOpenqueueUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MOpenqueueRow objects using plain SQL queries */
  implicit def GetResultMOpenqueueRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MOpenqueueRow] = GR{
    prs => import prs._
    MOpenqueueRow.tupled((<<[Int], <<[Int], <<[String], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_openqueue. Objects of this class serve as prototypes for rows in queries. */
  class MOpenqueue(_tableTag: Tag) extends Table[MOpenqueueRow](_tableTag, "m_openqueue") {
    def * = (mOpenqueueId, mOpenqueueMMakerId, mOpenqueueNote, mOpenqueueStatus, mOpenqueueRdatetime, mOpenqueueUdatetime) <> (MOpenqueueRow.tupled, MOpenqueueRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mOpenqueueId.?, mOpenqueueMMakerId.?, mOpenqueueNote.?, mOpenqueueStatus.?, mOpenqueueRdatetime.?, mOpenqueueUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MOpenqueueRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_openqueue_id DBType(INT), AutoInc, PrimaryKey */
    val mOpenqueueId: Column[Int] = column[Int]("m_openqueue_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_openqueue_m_maker_id DBType(INT) */
    val mOpenqueueMMakerId: Column[Int] = column[Int]("m_openqueue_m_maker_id")
    /** Database column m_openqueue_note DBType(TEXT), Length(65535,true) */
    val mOpenqueueNote: Column[String] = column[String]("m_openqueue_note", O.Length(65535,varying=true))
    /** Database column m_openqueue_status DBType(INT) */
    val mOpenqueueStatus: Column[Int] = column[Int]("m_openqueue_status")
    /** Database column m_openqueue_rdatetime DBType(DATETIME) */
    val mOpenqueueRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_openqueue_rdatetime")
    /** Database column m_openqueue_udatetime DBType(DATETIME) */
    val mOpenqueueUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_openqueue_udatetime")
  }
  /** Collection-like TableQuery object for table MOpenqueue */
  lazy val MOpenqueue = new TableQuery(tag => new MOpenqueue(tag))
  
  /** Entity class storing rows of table MPlan
   *  @param mPlanId Database column m_plan_id DBType(INT), AutoInc, PrimaryKey
   *  @param mPlanCompanyName Database column m_plan_company_name DBType(VARCHAR), Length(50,true)
   *  @param mPlanDate Database column m_plan_date DBType(VARCHAR), Length(45,true)
   *  @param mPlanMUnsoId Database column m_plan_m_unso_id DBType(INT)
   *  @param mPlanName Database column m_plan_name DBType(VARCHAR), Length(100,true)
   *  @param mPlanNameCh Database column m_plan_name_ch DBType(VARCHAR), Length(100,true)
   *  @param mPlanPhp Database column m_plan_php DBType(TEXT), Length(65535,true)
   *  @param mPlanMinWeightRange Database column m_plan_min_weight_range DBType(INT)
   *  @param mPlanMaxWeightRange Database column m_plan_max_weight_range DBType(INT)
   *  @param mPlanBaseCost Database column m_plan_base_cost DBType(INT)
   *  @param mPlanWeightCost Database column m_plan_weight_cost DBType(INT)
   *  @param mPlanWeightFactor Database column m_plan_weight_factor DBType(DECIMAL)
   *  @param mPlanSearchUrl Database column m_plan_search_url DBType(VARCHAR), Length(200,true)
   *  @param mPlanRdatetime Database column m_plan_rdatetime DBType(DATETIME)
   *  @param mPlanUdatetime Database column m_plan_udatetime DBType(DATETIME)
   *  @param mPlanRuser Database column m_plan_ruser DBType(INT)
   *  @param mPlanUuser Database column m_plan_uuser DBType(INT) */
  case class MPlanRow(mPlanId: Int, mPlanCompanyName: String, mPlanDate: String, mPlanMUnsoId: Int, mPlanName: String, mPlanNameCh: String, mPlanPhp: String, mPlanMinWeightRange: Int, mPlanMaxWeightRange: Int, mPlanBaseCost: Int, mPlanWeightCost: Int, mPlanWeightFactor: scala.math.BigDecimal, mPlanSearchUrl: String, mPlanRdatetime: java.sql.Timestamp, mPlanUdatetime: java.sql.Timestamp, mPlanRuser: Int, mPlanUuser: Int)
  /** GetResult implicit for fetching MPlanRow objects using plain SQL queries */
  implicit def GetResultMPlanRow(implicit e0: GR[Int], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[java.sql.Timestamp]): GR[MPlanRow] = GR{
    prs => import prs._
    MPlanRow.tupled((<<[Int], <<[String], <<[String], <<[Int], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table m_plan. Objects of this class serve as prototypes for rows in queries. */
  class MPlan(_tableTag: Tag) extends Table[MPlanRow](_tableTag, "m_plan") {
    def * = (mPlanId, mPlanCompanyName, mPlanDate, mPlanMUnsoId, mPlanName, mPlanNameCh, mPlanPhp, mPlanMinWeightRange, mPlanMaxWeightRange, mPlanBaseCost, mPlanWeightCost, mPlanWeightFactor, mPlanSearchUrl, mPlanRdatetime, mPlanUdatetime, mPlanRuser, mPlanUuser) <> (MPlanRow.tupled, MPlanRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mPlanId.?, mPlanCompanyName.?, mPlanDate.?, mPlanMUnsoId.?, mPlanName.?, mPlanNameCh.?, mPlanPhp.?, mPlanMinWeightRange.?, mPlanMaxWeightRange.?, mPlanBaseCost.?, mPlanWeightCost.?, mPlanWeightFactor.?, mPlanSearchUrl.?, mPlanRdatetime.?, mPlanUdatetime.?, mPlanRuser.?, mPlanUuser.?).shaped.<>({r=>import r._; _1.map(_=> MPlanRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_plan_id DBType(INT), AutoInc, PrimaryKey */
    val mPlanId: Column[Int] = column[Int]("m_plan_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_plan_company_name DBType(VARCHAR), Length(50,true) */
    val mPlanCompanyName: Column[String] = column[String]("m_plan_company_name", O.Length(50,varying=true))
    /** Database column m_plan_date DBType(VARCHAR), Length(45,true) */
    val mPlanDate: Column[String] = column[String]("m_plan_date", O.Length(45,varying=true))
    /** Database column m_plan_m_unso_id DBType(INT) */
    val mPlanMUnsoId: Column[Int] = column[Int]("m_plan_m_unso_id")
    /** Database column m_plan_name DBType(VARCHAR), Length(100,true) */
    val mPlanName: Column[String] = column[String]("m_plan_name", O.Length(100,varying=true))
    /** Database column m_plan_name_ch DBType(VARCHAR), Length(100,true) */
    val mPlanNameCh: Column[String] = column[String]("m_plan_name_ch", O.Length(100,varying=true))
    /** Database column m_plan_php DBType(TEXT), Length(65535,true) */
    val mPlanPhp: Column[String] = column[String]("m_plan_php", O.Length(65535,varying=true))
    /** Database column m_plan_min_weight_range DBType(INT) */
    val mPlanMinWeightRange: Column[Int] = column[Int]("m_plan_min_weight_range")
    /** Database column m_plan_max_weight_range DBType(INT) */
    val mPlanMaxWeightRange: Column[Int] = column[Int]("m_plan_max_weight_range")
    /** Database column m_plan_base_cost DBType(INT) */
    val mPlanBaseCost: Column[Int] = column[Int]("m_plan_base_cost")
    /** Database column m_plan_weight_cost DBType(INT) */
    val mPlanWeightCost: Column[Int] = column[Int]("m_plan_weight_cost")
    /** Database column m_plan_weight_factor DBType(DECIMAL) */
    val mPlanWeightFactor: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_plan_weight_factor")
    /** Database column m_plan_search_url DBType(VARCHAR), Length(200,true) */
    val mPlanSearchUrl: Column[String] = column[String]("m_plan_search_url", O.Length(200,varying=true))
    /** Database column m_plan_rdatetime DBType(DATETIME) */
    val mPlanRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_plan_rdatetime")
    /** Database column m_plan_udatetime DBType(DATETIME) */
    val mPlanUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_plan_udatetime")
    /** Database column m_plan_ruser DBType(INT) */
    val mPlanRuser: Column[Int] = column[Int]("m_plan_ruser")
    /** Database column m_plan_uuser DBType(INT) */
    val mPlanUuser: Column[Int] = column[Int]("m_plan_uuser")
  }
  /** Collection-like TableQuery object for table MPlan */
  lazy val MPlan = new TableQuery(tag => new MPlan(tag))
  
  /** Entity class storing rows of table MPreferred
   *  @param mPreferredId Database column m_preferred_id DBType(INT), AutoInc, PrimaryKey
   *  @param mPreferredMItemId Database column m_preferred_m_item_id DBType(INT)
   *  @param mPreferredVoidFlag Database column m_preferred_void_flag DBType(INT), Default(0)
   *  @param mPreferredMMakerId Database column m_preferred_m_maker_id DBType(INT)
   *  @param mPreferredMCategoryId Database column m_preferred_m_category_id DBType(INT)
   *  @param mPreferredCode Database column m_preferred_code DBType(VARCHAR), Length(50,true)
   *  @param mPreferredName Database column m_preferred_name DBType(VARCHAR), Length(100,true)
   *  @param mPreferredNameKana Database column m_preferred_name_kana DBType(VARCHAR), Length(100,true)
   *  @param mPreferredDescription Database column m_preferred_description DBType(TEXT), Length(65535,true)
   *  @param mPreferredSpec Database column m_preferred_spec DBType(TEXT), Length(65535,true)
   *  @param mPreferredIngredient Database column m_preferred_ingredient DBType(VARCHAR), Length(100,true)
   *  @param mPreferredProperty Database column m_preferred_property DBType(VARCHAR), Length(100,true)
   *  @param mPreferredOrder Database column m_preferred_order DBType(INT)
   *  @param mPreferredRuser Database column m_preferred_ruser DBType(INT)
   *  @param mPreferredRdatetime Database column m_preferred_rdatetime DBType(DATETIME)
   *  @param mPreferredUuser Database column m_preferred_uuser DBType(INT)
   *  @param mPreferredUdatetime Database column m_preferred_udatetime DBType(DATETIME) */
  case class MPreferredRow(mPreferredId: Int, mPreferredMItemId: Int, mPreferredVoidFlag: Int = 0, mPreferredMMakerId: Int, mPreferredMCategoryId: Int, mPreferredCode: String, mPreferredName: String, mPreferredNameKana: String, mPreferredDescription: String, mPreferredSpec: String, mPreferredIngredient: String, mPreferredProperty: String, mPreferredOrder: Int, mPreferredRuser: Int, mPreferredRdatetime: java.sql.Timestamp, mPreferredUuser: Int, mPreferredUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MPreferredRow objects using plain SQL queries */
  implicit def GetResultMPreferredRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MPreferredRow] = GR{
    prs => import prs._
    MPreferredRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_preferred. Objects of this class serve as prototypes for rows in queries. */
  class MPreferred(_tableTag: Tag) extends Table[MPreferredRow](_tableTag, "m_preferred") {
    def * = (mPreferredId, mPreferredMItemId, mPreferredVoidFlag, mPreferredMMakerId, mPreferredMCategoryId, mPreferredCode, mPreferredName, mPreferredNameKana, mPreferredDescription, mPreferredSpec, mPreferredIngredient, mPreferredProperty, mPreferredOrder, mPreferredRuser, mPreferredRdatetime, mPreferredUuser, mPreferredUdatetime) <> (MPreferredRow.tupled, MPreferredRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mPreferredId.?, mPreferredMItemId.?, mPreferredVoidFlag.?, mPreferredMMakerId.?, mPreferredMCategoryId.?, mPreferredCode.?, mPreferredName.?, mPreferredNameKana.?, mPreferredDescription.?, mPreferredSpec.?, mPreferredIngredient.?, mPreferredProperty.?, mPreferredOrder.?, mPreferredRuser.?, mPreferredRdatetime.?, mPreferredUuser.?, mPreferredUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MPreferredRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_preferred_id DBType(INT), AutoInc, PrimaryKey */
    val mPreferredId: Column[Int] = column[Int]("m_preferred_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_preferred_m_item_id DBType(INT) */
    val mPreferredMItemId: Column[Int] = column[Int]("m_preferred_m_item_id")
    /** Database column m_preferred_void_flag DBType(INT), Default(0) */
    val mPreferredVoidFlag: Column[Int] = column[Int]("m_preferred_void_flag", O.Default(0))
    /** Database column m_preferred_m_maker_id DBType(INT) */
    val mPreferredMMakerId: Column[Int] = column[Int]("m_preferred_m_maker_id")
    /** Database column m_preferred_m_category_id DBType(INT) */
    val mPreferredMCategoryId: Column[Int] = column[Int]("m_preferred_m_category_id")
    /** Database column m_preferred_code DBType(VARCHAR), Length(50,true) */
    val mPreferredCode: Column[String] = column[String]("m_preferred_code", O.Length(50,varying=true))
    /** Database column m_preferred_name DBType(VARCHAR), Length(100,true) */
    val mPreferredName: Column[String] = column[String]("m_preferred_name", O.Length(100,varying=true))
    /** Database column m_preferred_name_kana DBType(VARCHAR), Length(100,true) */
    val mPreferredNameKana: Column[String] = column[String]("m_preferred_name_kana", O.Length(100,varying=true))
    /** Database column m_preferred_description DBType(TEXT), Length(65535,true) */
    val mPreferredDescription: Column[String] = column[String]("m_preferred_description", O.Length(65535,varying=true))
    /** Database column m_preferred_spec DBType(TEXT), Length(65535,true) */
    val mPreferredSpec: Column[String] = column[String]("m_preferred_spec", O.Length(65535,varying=true))
    /** Database column m_preferred_ingredient DBType(VARCHAR), Length(100,true) */
    val mPreferredIngredient: Column[String] = column[String]("m_preferred_ingredient", O.Length(100,varying=true))
    /** Database column m_preferred_property DBType(VARCHAR), Length(100,true) */
    val mPreferredProperty: Column[String] = column[String]("m_preferred_property", O.Length(100,varying=true))
    /** Database column m_preferred_order DBType(INT) */
    val mPreferredOrder: Column[Int] = column[Int]("m_preferred_order")
    /** Database column m_preferred_ruser DBType(INT) */
    val mPreferredRuser: Column[Int] = column[Int]("m_preferred_ruser")
    /** Database column m_preferred_rdatetime DBType(DATETIME) */
    val mPreferredRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_preferred_rdatetime")
    /** Database column m_preferred_uuser DBType(INT) */
    val mPreferredUuser: Column[Int] = column[Int]("m_preferred_uuser")
    /** Database column m_preferred_udatetime DBType(DATETIME) */
    val mPreferredUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_preferred_udatetime")
  }
  /** Collection-like TableQuery object for table MPreferred */
  lazy val MPreferred = new TableQuery(tag => new MPreferred(tag))
  
  /** Entity class storing rows of table MPreferredImage
   *  @param mPreferredImageId Database column m_preferred_image_id DBType(INT), AutoInc, PrimaryKey
   *  @param mPreferredImageMItemImageId Database column m_preferred_image_m_item_image_id DBType(TINYINT)
   *  @param mPreferredImageVoidFlag Database column m_preferred_image_void_flag DBType(INT)
   *  @param mPreferredImageMPreferredId Database column m_preferred_image_m_preferred_id DBType(INT)
   *  @param mPreferredImageMime Database column m_preferred_image_mime DBType(VARCHAR), Length(50,true)
   *  @param mPreferredImageData Database column m_preferred_image_data DBType(MEDIUMBLOB)
   *  @param mPreferredImageOrder Database column m_preferred_image_order DBType(INT)
   *  @param mPreferredImageRuser Database column m_preferred_image_ruser DBType(INT)
   *  @param mPreferredImageRdatetime Database column m_preferred_image_rdatetime DBType(DATETIME)
   *  @param mPreferredImageUuser Database column m_preferred_image_uuser DBType(INT)
   *  @param mPreferredImageUdatetime Database column m_preferred_image_udatetime DBType(DATETIME) */
  case class MPreferredImageRow(mPreferredImageId: Int, mPreferredImageMItemImageId: Byte, mPreferredImageVoidFlag: Int, mPreferredImageMPreferredId: Int, mPreferredImageMime: String, mPreferredImageData: java.sql.Blob, mPreferredImageOrder: Int, mPreferredImageRuser: Int, mPreferredImageRdatetime: java.sql.Timestamp, mPreferredImageUuser: Int, mPreferredImageUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MPreferredImageRow objects using plain SQL queries */
  implicit def GetResultMPreferredImageRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[java.sql.Blob], e4: GR[java.sql.Timestamp]): GR[MPreferredImageRow] = GR{
    prs => import prs._
    MPreferredImageRow.tupled((<<[Int], <<[Byte], <<[Int], <<[Int], <<[String], <<[java.sql.Blob], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_preferred_image. Objects of this class serve as prototypes for rows in queries. */
  class MPreferredImage(_tableTag: Tag) extends Table[MPreferredImageRow](_tableTag, "m_preferred_image") {
    def * = (mPreferredImageId, mPreferredImageMItemImageId, mPreferredImageVoidFlag, mPreferredImageMPreferredId, mPreferredImageMime, mPreferredImageData, mPreferredImageOrder, mPreferredImageRuser, mPreferredImageRdatetime, mPreferredImageUuser, mPreferredImageUdatetime) <> (MPreferredImageRow.tupled, MPreferredImageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mPreferredImageId.?, mPreferredImageMItemImageId.?, mPreferredImageVoidFlag.?, mPreferredImageMPreferredId.?, mPreferredImageMime.?, mPreferredImageData.?, mPreferredImageOrder.?, mPreferredImageRuser.?, mPreferredImageRdatetime.?, mPreferredImageUuser.?, mPreferredImageUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MPreferredImageRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_preferred_image_id DBType(INT), AutoInc, PrimaryKey */
    val mPreferredImageId: Column[Int] = column[Int]("m_preferred_image_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_preferred_image_m_item_image_id DBType(TINYINT) */
    val mPreferredImageMItemImageId: Column[Byte] = column[Byte]("m_preferred_image_m_item_image_id")
    /** Database column m_preferred_image_void_flag DBType(INT) */
    val mPreferredImageVoidFlag: Column[Int] = column[Int]("m_preferred_image_void_flag")
    /** Database column m_preferred_image_m_preferred_id DBType(INT) */
    val mPreferredImageMPreferredId: Column[Int] = column[Int]("m_preferred_image_m_preferred_id")
    /** Database column m_preferred_image_mime DBType(VARCHAR), Length(50,true) */
    val mPreferredImageMime: Column[String] = column[String]("m_preferred_image_mime", O.Length(50,varying=true))
    /** Database column m_preferred_image_data DBType(MEDIUMBLOB) */
    val mPreferredImageData: Column[java.sql.Blob] = column[java.sql.Blob]("m_preferred_image_data")
    /** Database column m_preferred_image_order DBType(INT) */
    val mPreferredImageOrder: Column[Int] = column[Int]("m_preferred_image_order")
    /** Database column m_preferred_image_ruser DBType(INT) */
    val mPreferredImageRuser: Column[Int] = column[Int]("m_preferred_image_ruser")
    /** Database column m_preferred_image_rdatetime DBType(DATETIME) */
    val mPreferredImageRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_preferred_image_rdatetime")
    /** Database column m_preferred_image_uuser DBType(INT) */
    val mPreferredImageUuser: Column[Int] = column[Int]("m_preferred_image_uuser")
    /** Database column m_preferred_image_udatetime DBType(DATETIME) */
    val mPreferredImageUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_preferred_image_udatetime")
  }
  /** Collection-like TableQuery object for table MPreferredImage */
  lazy val MPreferredImage = new TableQuery(tag => new MPreferredImage(tag))
  
  /** Entity class storing rows of table MPreferredSku
   *  @param mPreferredSkuId Database column m_preferred_sku_id DBType(INT), AutoInc, PrimaryKey
   *  @param mPreferredSkuMSkuId Database column m_preferred_sku_m_sku_id DBType(INT)
   *  @param mPreferredSkuVoidFlag Database column m_preferred_sku_void_flag DBType(INT)
   *  @param mPreferredSkuMPreferredId Database column m_preferred_sku_m_preferred_id DBType(INT)
   *  @param mPreferredSkuCode Database column m_preferred_sku_code DBType(VARCHAR), Length(50,true)
   *  @param mPreferredSkuColor Database column m_preferred_sku_color DBType(VARCHAR), Length(20,true)
   *  @param mPreferredSkuSize Database column m_preferred_sku_size DBType(VARCHAR), Length(20,true)
   *  @param mPreferredSkuWeight Database column m_preferred_sku_weight DBType(INT)
   *  @param mPreferredSkuPrice Database column m_preferred_sku_price DBType(DECIMAL)
   *  @param mPreferredSkuCost Database column m_preferred_sku_cost DBType(DECIMAL)
   *  @param mPreferredSkuOrder Database column m_preferred_sku_order DBType(INT)
   *  @param mPreferredSkuRuser Database column m_preferred_sku_ruser DBType(INT)
   *  @param mPreferredSkuRdatetime Database column m_preferred_sku_rdatetime DBType(DATETIME)
   *  @param mPreferredSkuUuser Database column m_preferred_sku_uuser DBType(INT)
   *  @param mPreferredSkuUdatetime Database column m_preferred_sku_udatetime DBType(DATETIME) */
  case class MPreferredSkuRow(mPreferredSkuId: Int, mPreferredSkuMSkuId: Int, mPreferredSkuVoidFlag: Int, mPreferredSkuMPreferredId: Int, mPreferredSkuCode: String, mPreferredSkuColor: String, mPreferredSkuSize: String, mPreferredSkuWeight: Int, mPreferredSkuPrice: scala.math.BigDecimal, mPreferredSkuCost: scala.math.BigDecimal, mPreferredSkuOrder: Int, mPreferredSkuRuser: Int, mPreferredSkuRdatetime: java.sql.Timestamp, mPreferredSkuUuser: Int, mPreferredSkuUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MPreferredSkuRow objects using plain SQL queries */
  implicit def GetResultMPreferredSkuRow(implicit e0: GR[Int], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[java.sql.Timestamp]): GR[MPreferredSkuRow] = GR{
    prs => import prs._
    MPreferredSkuRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_preferred_sku. Objects of this class serve as prototypes for rows in queries. */
  class MPreferredSku(_tableTag: Tag) extends Table[MPreferredSkuRow](_tableTag, "m_preferred_sku") {
    def * = (mPreferredSkuId, mPreferredSkuMSkuId, mPreferredSkuVoidFlag, mPreferredSkuMPreferredId, mPreferredSkuCode, mPreferredSkuColor, mPreferredSkuSize, mPreferredSkuWeight, mPreferredSkuPrice, mPreferredSkuCost, mPreferredSkuOrder, mPreferredSkuRuser, mPreferredSkuRdatetime, mPreferredSkuUuser, mPreferredSkuUdatetime) <> (MPreferredSkuRow.tupled, MPreferredSkuRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mPreferredSkuId.?, mPreferredSkuMSkuId.?, mPreferredSkuVoidFlag.?, mPreferredSkuMPreferredId.?, mPreferredSkuCode.?, mPreferredSkuColor.?, mPreferredSkuSize.?, mPreferredSkuWeight.?, mPreferredSkuPrice.?, mPreferredSkuCost.?, mPreferredSkuOrder.?, mPreferredSkuRuser.?, mPreferredSkuRdatetime.?, mPreferredSkuUuser.?, mPreferredSkuUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MPreferredSkuRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_preferred_sku_id DBType(INT), AutoInc, PrimaryKey */
    val mPreferredSkuId: Column[Int] = column[Int]("m_preferred_sku_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_preferred_sku_m_sku_id DBType(INT) */
    val mPreferredSkuMSkuId: Column[Int] = column[Int]("m_preferred_sku_m_sku_id")
    /** Database column m_preferred_sku_void_flag DBType(INT) */
    val mPreferredSkuVoidFlag: Column[Int] = column[Int]("m_preferred_sku_void_flag")
    /** Database column m_preferred_sku_m_preferred_id DBType(INT) */
    val mPreferredSkuMPreferredId: Column[Int] = column[Int]("m_preferred_sku_m_preferred_id")
    /** Database column m_preferred_sku_code DBType(VARCHAR), Length(50,true) */
    val mPreferredSkuCode: Column[String] = column[String]("m_preferred_sku_code", O.Length(50,varying=true))
    /** Database column m_preferred_sku_color DBType(VARCHAR), Length(20,true) */
    val mPreferredSkuColor: Column[String] = column[String]("m_preferred_sku_color", O.Length(20,varying=true))
    /** Database column m_preferred_sku_size DBType(VARCHAR), Length(20,true) */
    val mPreferredSkuSize: Column[String] = column[String]("m_preferred_sku_size", O.Length(20,varying=true))
    /** Database column m_preferred_sku_weight DBType(INT) */
    val mPreferredSkuWeight: Column[Int] = column[Int]("m_preferred_sku_weight")
    /** Database column m_preferred_sku_price DBType(DECIMAL) */
    val mPreferredSkuPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_preferred_sku_price")
    /** Database column m_preferred_sku_cost DBType(DECIMAL) */
    val mPreferredSkuCost: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_preferred_sku_cost")
    /** Database column m_preferred_sku_order DBType(INT) */
    val mPreferredSkuOrder: Column[Int] = column[Int]("m_preferred_sku_order")
    /** Database column m_preferred_sku_ruser DBType(INT) */
    val mPreferredSkuRuser: Column[Int] = column[Int]("m_preferred_sku_ruser")
    /** Database column m_preferred_sku_rdatetime DBType(DATETIME) */
    val mPreferredSkuRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_preferred_sku_rdatetime")
    /** Database column m_preferred_sku_uuser DBType(INT) */
    val mPreferredSkuUuser: Column[Int] = column[Int]("m_preferred_sku_uuser")
    /** Database column m_preferred_sku_udatetime DBType(DATETIME) */
    val mPreferredSkuUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_preferred_sku_udatetime")
  }
  /** Collection-like TableQuery object for table MPreferredSku */
  lazy val MPreferredSku = new TableQuery(tag => new MPreferredSku(tag))
  
  /** Entity class storing rows of table MPriceInterval
   *  @param mPriceIntervalId Database column m_price_interval_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mPriceIntervalMItemId Database column m_price_interval_m_item_id DBType(INT UNSIGNED), Default(0)
   *  @param mPriceIntervalMSkuId Database column m_price_interval_m_sku_id DBType(INT UNSIGNED), Default(0)
   *  @param mPriceIntervalQty Database column m_price_interval_qty DBType(INT UNSIGNED), Default(0)
   *  @param mPriceIntervalRate Database column m_price_interval_rate DBType(DECIMAL UNSIGNED), Default(0.00) */
  case class MPriceIntervalRow(mPriceIntervalId: Int, mPriceIntervalMItemId: Int = 0, mPriceIntervalMSkuId: Int = 0, mPriceIntervalQty: Int = 0, mPriceIntervalRate: scala.math.BigDecimal = "0.00")
  /** GetResult implicit for fetching MPriceIntervalRow objects using plain SQL queries */
  implicit def GetResultMPriceIntervalRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal]): GR[MPriceIntervalRow] = GR{
    prs => import prs._
    MPriceIntervalRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal]))
  }
  /** Table description of table m_price_interval. Objects of this class serve as prototypes for rows in queries. */
  class MPriceInterval(_tableTag: Tag) extends Table[MPriceIntervalRow](_tableTag, "m_price_interval") {
    def * = (mPriceIntervalId, mPriceIntervalMItemId, mPriceIntervalMSkuId, mPriceIntervalQty, mPriceIntervalRate) <> (MPriceIntervalRow.tupled, MPriceIntervalRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mPriceIntervalId.?, mPriceIntervalMItemId.?, mPriceIntervalMSkuId.?, mPriceIntervalQty.?, mPriceIntervalRate.?).shaped.<>({r=>import r._; _1.map(_=> MPriceIntervalRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_price_interval_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mPriceIntervalId: Column[Int] = column[Int]("m_price_interval_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_price_interval_m_item_id DBType(INT UNSIGNED), Default(0) */
    val mPriceIntervalMItemId: Column[Int] = column[Int]("m_price_interval_m_item_id", O.Default(0))
    /** Database column m_price_interval_m_sku_id DBType(INT UNSIGNED), Default(0) */
    val mPriceIntervalMSkuId: Column[Int] = column[Int]("m_price_interval_m_sku_id", O.Default(0))
    /** Database column m_price_interval_qty DBType(INT UNSIGNED), Default(0) */
    val mPriceIntervalQty: Column[Int] = column[Int]("m_price_interval_qty", O.Default(0))
    /** Database column m_price_interval_rate DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mPriceIntervalRate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_price_interval_rate", O.Default("0.00"))
    
    /** Index over (mPriceIntervalMItemId) (database name m_price_interval_m_item_id) */
    val index1 = index("m_price_interval_m_item_id", mPriceIntervalMItemId)
  }
  /** Collection-like TableQuery object for table MPriceInterval */
  lazy val MPriceInterval = new TableQuery(tag => new MPriceInterval(tag))
  
  /** Entity class storing rows of table MProperty
   *  @param mPropertyId Database column m_property_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mPropertyCategory Database column m_property_category DBType(INT UNSIGNED)
   *  @param mPropertyName Database column m_property_name DBType(VARCHAR), Length(100,true)
   *  @param mPropertyNameEn Database column m_property_name_en DBType(VARCHAR), Length(100,true)
   *  @param mPropertyNameCh Database column m_property_name_ch DBType(VARCHAR), Length(100,true) */
  case class MPropertyRow(mPropertyId: Int, mPropertyCategory: Int, mPropertyName: String, mPropertyNameEn: String, mPropertyNameCh: String)
  /** GetResult implicit for fetching MPropertyRow objects using plain SQL queries */
  implicit def GetResultMPropertyRow(implicit e0: GR[Int], e1: GR[String]): GR[MPropertyRow] = GR{
    prs => import prs._
    MPropertyRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[String]))
  }
  /** Table description of table m_property. Objects of this class serve as prototypes for rows in queries. */
  class MProperty(_tableTag: Tag) extends Table[MPropertyRow](_tableTag, "m_property") {
    def * = (mPropertyId, mPropertyCategory, mPropertyName, mPropertyNameEn, mPropertyNameCh) <> (MPropertyRow.tupled, MPropertyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mPropertyId.?, mPropertyCategory.?, mPropertyName.?, mPropertyNameEn.?, mPropertyNameCh.?).shaped.<>({r=>import r._; _1.map(_=> MPropertyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_property_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mPropertyId: Column[Int] = column[Int]("m_property_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_property_category DBType(INT UNSIGNED) */
    val mPropertyCategory: Column[Int] = column[Int]("m_property_category")
    /** Database column m_property_name DBType(VARCHAR), Length(100,true) */
    val mPropertyName: Column[String] = column[String]("m_property_name", O.Length(100,varying=true))
    /** Database column m_property_name_en DBType(VARCHAR), Length(100,true) */
    val mPropertyNameEn: Column[String] = column[String]("m_property_name_en", O.Length(100,varying=true))
    /** Database column m_property_name_ch DBType(VARCHAR), Length(100,true) */
    val mPropertyNameCh: Column[String] = column[String]("m_property_name_ch", O.Length(100,varying=true))
  }
  /** Collection-like TableQuery object for table MProperty */
  lazy val MProperty = new TableQuery(tag => new MProperty(tag))
  
  /** Entity class storing rows of table MProvince
   *  @param mProvinceId Database column m_province_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mProvinceName Database column m_province_name DBType(VARCHAR), Length(50,true) */
  case class MProvinceRow(mProvinceId: Int, mProvinceName: String)
  /** GetResult implicit for fetching MProvinceRow objects using plain SQL queries */
  implicit def GetResultMProvinceRow(implicit e0: GR[Int], e1: GR[String]): GR[MProvinceRow] = GR{
    prs => import prs._
    MProvinceRow.tupled((<<[Int], <<[String]))
  }
  /** Table description of table m_province. Objects of this class serve as prototypes for rows in queries. */
  class MProvince(_tableTag: Tag) extends Table[MProvinceRow](_tableTag, "m_province") {
    def * = (mProvinceId, mProvinceName) <> (MProvinceRow.tupled, MProvinceRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mProvinceId.?, mProvinceName.?).shaped.<>({r=>import r._; _1.map(_=> MProvinceRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_province_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mProvinceId: Column[Int] = column[Int]("m_province_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_province_name DBType(VARCHAR), Length(50,true) */
    val mProvinceName: Column[String] = column[String]("m_province_name", O.Length(50,varying=true))
  }
  /** Collection-like TableQuery object for table MProvince */
  lazy val MProvince = new TableQuery(tag => new MProvince(tag))
  
  /** Entity class storing rows of table MQuestionnaire
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param title Database column title DBType(VARCHAR), Length(255,true)
   *  @param descript Database column descript DBType(VARCHAR), Length(255,true)
   *  @param startDate Database column start_date DBType(DATE)
   *  @param endDate Database column end_date DBType(DATE)
   *  @param `type` Database column type DBType(BIT)
   *  @param createTime Database column create_time DBType(DATETIME)
   *  @param updateTime Database column update_time DBType(DATETIME)
   *  @param createUser Database column create_user DBType(INT)
   *  @param updateUser Database column update_user DBType(INT)
   *  @param subjectCount Database column subject_count DBType(INT)
   *  @param viewCount Database column view_count DBType(INT)
   *  @param answerCount Database column answer_count DBType(INT)
   *  @param status Database column status DBType(BIT) */
  case class MQuestionnaireRow(id: Int, title: String, descript: String, startDate: java.sql.Date, endDate: java.sql.Date, `type`: Boolean, createTime: java.sql.Timestamp, updateTime: java.sql.Timestamp, createUser: Int, updateUser: Int, subjectCount: Int, viewCount: Int, answerCount: Int, status: Boolean)
  /** GetResult implicit for fetching MQuestionnaireRow objects using plain SQL queries */
  implicit def GetResultMQuestionnaireRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Date], e3: GR[Boolean], e4: GR[java.sql.Timestamp]): GR[MQuestionnaireRow] = GR{
    prs => import prs._
    MQuestionnaireRow.tupled((<<[Int], <<[String], <<[String], <<[java.sql.Date], <<[java.sql.Date], <<[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Boolean]))
  }
  /** Table description of table m_questionnaire. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class MQuestionnaire(_tableTag: Tag) extends Table[MQuestionnaireRow](_tableTag, "m_questionnaire") {
    def * = (id, title, descript, startDate, endDate, `type`, createTime, updateTime, createUser, updateUser, subjectCount, viewCount, answerCount, status) <> (MQuestionnaireRow.tupled, MQuestionnaireRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, title.?, descript.?, startDate.?, endDate.?, `type`.?, createTime.?, updateTime.?, createUser.?, updateUser.?, subjectCount.?, viewCount.?, answerCount.?, status.?).shaped.<>({r=>import r._; _1.map(_=> MQuestionnaireRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column title DBType(VARCHAR), Length(255,true) */
    val title: Column[String] = column[String]("title", O.Length(255,varying=true))
    /** Database column descript DBType(VARCHAR), Length(255,true) */
    val descript: Column[String] = column[String]("descript", O.Length(255,varying=true))
    /** Database column start_date DBType(DATE) */
    val startDate: Column[java.sql.Date] = column[java.sql.Date]("start_date")
    /** Database column end_date DBType(DATE) */
    val endDate: Column[java.sql.Date] = column[java.sql.Date]("end_date")
    /** Database column type DBType(BIT)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Column[Boolean] = column[Boolean]("type")
    /** Database column create_time DBType(DATETIME) */
    val createTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column update_time DBType(DATETIME) */
    val updateTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("update_time")
    /** Database column create_user DBType(INT) */
    val createUser: Column[Int] = column[Int]("create_user")
    /** Database column update_user DBType(INT) */
    val updateUser: Column[Int] = column[Int]("update_user")
    /** Database column subject_count DBType(INT) */
    val subjectCount: Column[Int] = column[Int]("subject_count")
    /** Database column view_count DBType(INT) */
    val viewCount: Column[Int] = column[Int]("view_count")
    /** Database column answer_count DBType(INT) */
    val answerCount: Column[Int] = column[Int]("answer_count")
    /** Database column status DBType(BIT) */
    val status: Column[Boolean] = column[Boolean]("status")
  }
  /** Collection-like TableQuery object for table MQuestionnaire */
  lazy val MQuestionnaire = new TableQuery(tag => new MQuestionnaire(tag))
  
  /** Entity class storing rows of table MRakutenftp
   *  @param mRakutenftpId Database column m_rakutenftp_id DBType(INT), AutoInc, PrimaryKey
   *  @param mRakutenftpResultItemcsv Database column m_rakutenftp_result_itemcsv DBType(INT)
   *  @param mRakutenftpResultSelectcsv Database column m_rakutenftp_result_selectcsv DBType(INT)
   *  @param mRakutenftpResultCatcsv Database column m_rakutenftp_result_catcsv DBType(INT)
   *  @param mRakutenftpFailedcount Database column m_rakutenftp_failedcount DBType(INT)
   *  @param mRakutenftpMCustomerId Database column m_rakutenftp_m_customer_id DBType(INT)
   *  @param mRakutenftpAccount Database column m_rakutenftp_account DBType(VARCHAR), Length(100,true)
   *  @param mRakutenftpPassword Database column m_rakutenftp_password DBType(VARCHAR), Length(100,true)
   *  @param mRakutenftpItemcsv Database column m_rakutenftp_itemcsv DBType(MEDIUMBLOB)
   *  @param mRakutenftpSelectcsv Database column m_rakutenftp_selectcsv DBType(MEDIUMBLOB)
   *  @param mRakutenftpCatcsv Database column m_rakutenftp_catcsv DBType(MEDIUMBLOB)
   *  @param mRakutenftpMode Database column m_rakutenftp_mode DBType(INT)
   *  @param mRakutenftpRdatetime Database column m_rakutenftp_rdatetime DBType(DATETIME)
   *  @param mRakutenftpUdatetime Database column m_rakutenftp_udatetime DBType(DATETIME) */
  case class MRakutenftpRow(mRakutenftpId: Int, mRakutenftpResultItemcsv: Int, mRakutenftpResultSelectcsv: Int, mRakutenftpResultCatcsv: Int, mRakutenftpFailedcount: Int, mRakutenftpMCustomerId: Int, mRakutenftpAccount: String, mRakutenftpPassword: String, mRakutenftpItemcsv: java.sql.Blob, mRakutenftpSelectcsv: java.sql.Blob, mRakutenftpCatcsv: java.sql.Blob, mRakutenftpMode: Int, mRakutenftpRdatetime: java.sql.Timestamp, mRakutenftpUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MRakutenftpRow objects using plain SQL queries */
  implicit def GetResultMRakutenftpRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Blob], e3: GR[java.sql.Timestamp]): GR[MRakutenftpRow] = GR{
    prs => import prs._
    MRakutenftpRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[java.sql.Blob], <<[java.sql.Blob], <<[java.sql.Blob], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_rakutenftp. Objects of this class serve as prototypes for rows in queries. */
  class MRakutenftp(_tableTag: Tag) extends Table[MRakutenftpRow](_tableTag, "m_rakutenftp") {
    def * = (mRakutenftpId, mRakutenftpResultItemcsv, mRakutenftpResultSelectcsv, mRakutenftpResultCatcsv, mRakutenftpFailedcount, mRakutenftpMCustomerId, mRakutenftpAccount, mRakutenftpPassword, mRakutenftpItemcsv, mRakutenftpSelectcsv, mRakutenftpCatcsv, mRakutenftpMode, mRakutenftpRdatetime, mRakutenftpUdatetime) <> (MRakutenftpRow.tupled, MRakutenftpRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRakutenftpId.?, mRakutenftpResultItemcsv.?, mRakutenftpResultSelectcsv.?, mRakutenftpResultCatcsv.?, mRakutenftpFailedcount.?, mRakutenftpMCustomerId.?, mRakutenftpAccount.?, mRakutenftpPassword.?, mRakutenftpItemcsv.?, mRakutenftpSelectcsv.?, mRakutenftpCatcsv.?, mRakutenftpMode.?, mRakutenftpRdatetime.?, mRakutenftpUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MRakutenftpRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_rakutenftp_id DBType(INT), AutoInc, PrimaryKey */
    val mRakutenftpId: Column[Int] = column[Int]("m_rakutenftp_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_rakutenftp_result_itemcsv DBType(INT) */
    val mRakutenftpResultItemcsv: Column[Int] = column[Int]("m_rakutenftp_result_itemcsv")
    /** Database column m_rakutenftp_result_selectcsv DBType(INT) */
    val mRakutenftpResultSelectcsv: Column[Int] = column[Int]("m_rakutenftp_result_selectcsv")
    /** Database column m_rakutenftp_result_catcsv DBType(INT) */
    val mRakutenftpResultCatcsv: Column[Int] = column[Int]("m_rakutenftp_result_catcsv")
    /** Database column m_rakutenftp_failedcount DBType(INT) */
    val mRakutenftpFailedcount: Column[Int] = column[Int]("m_rakutenftp_failedcount")
    /** Database column m_rakutenftp_m_customer_id DBType(INT) */
    val mRakutenftpMCustomerId: Column[Int] = column[Int]("m_rakutenftp_m_customer_id")
    /** Database column m_rakutenftp_account DBType(VARCHAR), Length(100,true) */
    val mRakutenftpAccount: Column[String] = column[String]("m_rakutenftp_account", O.Length(100,varying=true))
    /** Database column m_rakutenftp_password DBType(VARCHAR), Length(100,true) */
    val mRakutenftpPassword: Column[String] = column[String]("m_rakutenftp_password", O.Length(100,varying=true))
    /** Database column m_rakutenftp_itemcsv DBType(MEDIUMBLOB) */
    val mRakutenftpItemcsv: Column[java.sql.Blob] = column[java.sql.Blob]("m_rakutenftp_itemcsv")
    /** Database column m_rakutenftp_selectcsv DBType(MEDIUMBLOB) */
    val mRakutenftpSelectcsv: Column[java.sql.Blob] = column[java.sql.Blob]("m_rakutenftp_selectcsv")
    /** Database column m_rakutenftp_catcsv DBType(MEDIUMBLOB) */
    val mRakutenftpCatcsv: Column[java.sql.Blob] = column[java.sql.Blob]("m_rakutenftp_catcsv")
    /** Database column m_rakutenftp_mode DBType(INT) */
    val mRakutenftpMode: Column[Int] = column[Int]("m_rakutenftp_mode")
    /** Database column m_rakutenftp_rdatetime DBType(DATETIME) */
    val mRakutenftpRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_rakutenftp_rdatetime")
    /** Database column m_rakutenftp_udatetime DBType(DATETIME) */
    val mRakutenftpUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_rakutenftp_udatetime")
  }
  /** Collection-like TableQuery object for table MRakutenftp */
  lazy val MRakutenftp = new TableQuery(tag => new MRakutenftp(tag))
  
  /** Entity class storing rows of table MRakutenimage
   *  @param mRakutenimageId Database column m_rakutenimage_id DBType(INT), AutoInc, PrimaryKey
   *  @param mRakutenimageResult Database column m_rakutenimage_result DBType(INT)
   *  @param mRakutenimageMRakutenftpId Database column m_rakutenimage_m_rakutenftp_id DBType(INT)
   *  @param mRakutenimageMItemImageId Database column m_rakutenimage_m_item_image_id DBType(INT)
   *  @param mRakutenimageDir Database column m_rakutenimage_dir DBType(VARCHAR), Length(100,true)
   *  @param mRakutenimageFilename Database column m_rakutenimage_filename DBType(VARCHAR), Length(100,true)
   *  @param mRakutenimageRdatetime Database column m_rakutenimage_rdatetime DBType(DATETIME)
   *  @param mRakutenimageUdatetime Database column m_rakutenimage_udatetime DBType(DATETIME) */
  case class MRakutenimageRow(mRakutenimageId: Int, mRakutenimageResult: Int, mRakutenimageMRakutenftpId: Int, mRakutenimageMItemImageId: Int, mRakutenimageDir: String, mRakutenimageFilename: String, mRakutenimageRdatetime: java.sql.Timestamp, mRakutenimageUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MRakutenimageRow objects using plain SQL queries */
  implicit def GetResultMRakutenimageRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MRakutenimageRow] = GR{
    prs => import prs._
    MRakutenimageRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_rakutenimage. Objects of this class serve as prototypes for rows in queries. */
  class MRakutenimage(_tableTag: Tag) extends Table[MRakutenimageRow](_tableTag, "m_rakutenimage") {
    def * = (mRakutenimageId, mRakutenimageResult, mRakutenimageMRakutenftpId, mRakutenimageMItemImageId, mRakutenimageDir, mRakutenimageFilename, mRakutenimageRdatetime, mRakutenimageUdatetime) <> (MRakutenimageRow.tupled, MRakutenimageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRakutenimageId.?, mRakutenimageResult.?, mRakutenimageMRakutenftpId.?, mRakutenimageMItemImageId.?, mRakutenimageDir.?, mRakutenimageFilename.?, mRakutenimageRdatetime.?, mRakutenimageUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MRakutenimageRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_rakutenimage_id DBType(INT), AutoInc, PrimaryKey */
    val mRakutenimageId: Column[Int] = column[Int]("m_rakutenimage_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_rakutenimage_result DBType(INT) */
    val mRakutenimageResult: Column[Int] = column[Int]("m_rakutenimage_result")
    /** Database column m_rakutenimage_m_rakutenftp_id DBType(INT) */
    val mRakutenimageMRakutenftpId: Column[Int] = column[Int]("m_rakutenimage_m_rakutenftp_id")
    /** Database column m_rakutenimage_m_item_image_id DBType(INT) */
    val mRakutenimageMItemImageId: Column[Int] = column[Int]("m_rakutenimage_m_item_image_id")
    /** Database column m_rakutenimage_dir DBType(VARCHAR), Length(100,true) */
    val mRakutenimageDir: Column[String] = column[String]("m_rakutenimage_dir", O.Length(100,varying=true))
    /** Database column m_rakutenimage_filename DBType(VARCHAR), Length(100,true) */
    val mRakutenimageFilename: Column[String] = column[String]("m_rakutenimage_filename", O.Length(100,varying=true))
    /** Database column m_rakutenimage_rdatetime DBType(DATETIME) */
    val mRakutenimageRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_rakutenimage_rdatetime")
    /** Database column m_rakutenimage_udatetime DBType(DATETIME) */
    val mRakutenimageUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_rakutenimage_udatetime")
  }
  /** Collection-like TableQuery object for table MRakutenimage */
  lazy val MRakutenimage = new TableQuery(tag => new MRakutenimage(tag))
  
  /** Entity class storing rows of table MRakutenitem
   *  @param mRakutenitemId Database column m_rakutenitem_id DBType(INT), AutoInc, PrimaryKey
   *  @param mRakutenitemMCustomerId Database column m_rakutenitem_m_customer_id DBType(INT)
   *  @param mRakutenitemMRakutenftpId Database column m_rakutenitem_m_rakutenftp_id DBType(INT)
   *  @param mRakutenitemMItemId Database column m_rakutenitem_m_item_id DBType(INT)
   *  @param mRakutenitemRdatetime Database column m_rakutenitem_rdatetime DBType(DATETIME)
   *  @param mRakutenitemUdatetime Database column m_rakutenitem_udatetime DBType(DATETIME) */
  case class MRakutenitemRow(mRakutenitemId: Int, mRakutenitemMCustomerId: Int, mRakutenitemMRakutenftpId: Int, mRakutenitemMItemId: Int, mRakutenitemRdatetime: java.sql.Timestamp, mRakutenitemUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MRakutenitemRow objects using plain SQL queries */
  implicit def GetResultMRakutenitemRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[MRakutenitemRow] = GR{
    prs => import prs._
    MRakutenitemRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_rakutenitem. Objects of this class serve as prototypes for rows in queries. */
  class MRakutenitem(_tableTag: Tag) extends Table[MRakutenitemRow](_tableTag, "m_rakutenitem") {
    def * = (mRakutenitemId, mRakutenitemMCustomerId, mRakutenitemMRakutenftpId, mRakutenitemMItemId, mRakutenitemRdatetime, mRakutenitemUdatetime) <> (MRakutenitemRow.tupled, MRakutenitemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRakutenitemId.?, mRakutenitemMCustomerId.?, mRakutenitemMRakutenftpId.?, mRakutenitemMItemId.?, mRakutenitemRdatetime.?, mRakutenitemUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MRakutenitemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_rakutenitem_id DBType(INT), AutoInc, PrimaryKey */
    val mRakutenitemId: Column[Int] = column[Int]("m_rakutenitem_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_rakutenitem_m_customer_id DBType(INT) */
    val mRakutenitemMCustomerId: Column[Int] = column[Int]("m_rakutenitem_m_customer_id")
    /** Database column m_rakutenitem_m_rakutenftp_id DBType(INT) */
    val mRakutenitemMRakutenftpId: Column[Int] = column[Int]("m_rakutenitem_m_rakutenftp_id")
    /** Database column m_rakutenitem_m_item_id DBType(INT) */
    val mRakutenitemMItemId: Column[Int] = column[Int]("m_rakutenitem_m_item_id")
    /** Database column m_rakutenitem_rdatetime DBType(DATETIME) */
    val mRakutenitemRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_rakutenitem_rdatetime")
    /** Database column m_rakutenitem_udatetime DBType(DATETIME) */
    val mRakutenitemUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_rakutenitem_udatetime")
  }
  /** Collection-like TableQuery object for table MRakutenitem */
  lazy val MRakutenitem = new TableQuery(tag => new MRakutenitem(tag))
  
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
  
  /** Entity class storing rows of table MRefunds
   *  @param mRefundsId Database column m_refunds_ID DBType(INT), AutoInc, PrimaryKey
   *  @param mRefundsOrderid Database column m_refunds_OrderId DBType(INT)
   *  @param mRefundsRate Database column m_refunds_rate DBType(DECIMAL)
   *  @param mRefundsRefundnum Database column m_refunds_RefundNum DBType(VARCHAR), Length(15,true)
   *  @param mRefundsCustomerid Database column m_refunds_CustomerId DBType(INT)
   *  @param mRefundsAddtime Database column m_refunds_AddTime DBType(DATETIME)
   *  @param mRefundsModifytime Database column m_refunds_ModifyTime DBType(DATETIME)
   *  @param mRefundsGoodsnum Database column m_refunds_GoodsNum DBType(INT)
   *  @param mRefundsRefundamount Database column m_refunds_RefundAmount DBType(DECIMAL)
   *  @param mRefundsRefundamountJp Database column m_refunds_RefundAmount_jp DBType(INT)
   *  @param mRefundsLastrefundamount Database column m_refunds_LastRefundAmount DBType(DECIMAL)
   *  @param mRefundsLastrefundamountJp Database column m_refunds_LastRefundAmount_jp DBType(INT)
   *  @param mRefundsDeliveryfate Database column m_refunds_DeliveryFate DBType(DECIMAL)
   *  @param mRefundsDeliveryfateJp Database column m_refunds_DeliveryFate_jp DBType(INT)
   *  @param mRefundsTotalrefundamount Database column m_refunds_TotalRefundAmount DBType(DECIMAL)
   *  @param mRefundsTotalrefundamountJp Database column m_refunds_TotalRefundAmount_jp DBType(INT)
   *  @param mRefundsStatu Database column m_refunds_Statu DBType(SMALLINT), Default(1) */
  case class MRefundsRow(mRefundsId: Int, mRefundsOrderid: Int, mRefundsRate: scala.math.BigDecimal, mRefundsRefundnum: String, mRefundsCustomerid: Int, mRefundsAddtime: java.sql.Timestamp, mRefundsModifytime: java.sql.Timestamp, mRefundsGoodsnum: Int, mRefundsRefundamount: scala.math.BigDecimal, mRefundsRefundamountJp: Int, mRefundsLastrefundamount: scala.math.BigDecimal, mRefundsLastrefundamountJp: Int, mRefundsDeliveryfate: scala.math.BigDecimal, mRefundsDeliveryfateJp: Int, mRefundsTotalrefundamount: scala.math.BigDecimal, mRefundsTotalrefundamountJp: Int, mRefundsStatu: Short = 1)
  /** GetResult implicit for fetching MRefundsRow objects using plain SQL queries */
  implicit def GetResultMRefundsRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[String], e3: GR[java.sql.Timestamp], e4: GR[Short]): GR[MRefundsRow] = GR{
    prs => import prs._
    MRefundsRow.tupled((<<[Int], <<[Int], <<[scala.math.BigDecimal], <<[String], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[scala.math.BigDecimal], <<[Int], <<[scala.math.BigDecimal], <<[Int], <<[scala.math.BigDecimal], <<[Int], <<[scala.math.BigDecimal], <<[Int], <<[Short]))
  }
  /** Table description of table m_refunds. Objects of this class serve as prototypes for rows in queries. */
  class MRefunds(_tableTag: Tag) extends Table[MRefundsRow](_tableTag, "m_refunds") {
    def * = (mRefundsId, mRefundsOrderid, mRefundsRate, mRefundsRefundnum, mRefundsCustomerid, mRefundsAddtime, mRefundsModifytime, mRefundsGoodsnum, mRefundsRefundamount, mRefundsRefundamountJp, mRefundsLastrefundamount, mRefundsLastrefundamountJp, mRefundsDeliveryfate, mRefundsDeliveryfateJp, mRefundsTotalrefundamount, mRefundsTotalrefundamountJp, mRefundsStatu) <> (MRefundsRow.tupled, MRefundsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRefundsId.?, mRefundsOrderid.?, mRefundsRate.?, mRefundsRefundnum.?, mRefundsCustomerid.?, mRefundsAddtime.?, mRefundsModifytime.?, mRefundsGoodsnum.?, mRefundsRefundamount.?, mRefundsRefundamountJp.?, mRefundsLastrefundamount.?, mRefundsLastrefundamountJp.?, mRefundsDeliveryfate.?, mRefundsDeliveryfateJp.?, mRefundsTotalrefundamount.?, mRefundsTotalrefundamountJp.?, mRefundsStatu.?).shaped.<>({r=>import r._; _1.map(_=> MRefundsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_refunds_ID DBType(INT), AutoInc, PrimaryKey */
    val mRefundsId: Column[Int] = column[Int]("m_refunds_ID", O.AutoInc, O.PrimaryKey)
    /** Database column m_refunds_OrderId DBType(INT) */
    val mRefundsOrderid: Column[Int] = column[Int]("m_refunds_OrderId")
    /** Database column m_refunds_rate DBType(DECIMAL) */
    val mRefundsRate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_rate")
    /** Database column m_refunds_RefundNum DBType(VARCHAR), Length(15,true) */
    val mRefundsRefundnum: Column[String] = column[String]("m_refunds_RefundNum", O.Length(15,varying=true))
    /** Database column m_refunds_CustomerId DBType(INT) */
    val mRefundsCustomerid: Column[Int] = column[Int]("m_refunds_CustomerId")
    /** Database column m_refunds_AddTime DBType(DATETIME) */
    val mRefundsAddtime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_refunds_AddTime")
    /** Database column m_refunds_ModifyTime DBType(DATETIME) */
    val mRefundsModifytime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_refunds_ModifyTime")
    /** Database column m_refunds_GoodsNum DBType(INT) */
    val mRefundsGoodsnum: Column[Int] = column[Int]("m_refunds_GoodsNum")
    /** Database column m_refunds_RefundAmount DBType(DECIMAL) */
    val mRefundsRefundamount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_RefundAmount")
    /** Database column m_refunds_RefundAmount_jp DBType(INT) */
    val mRefundsRefundamountJp: Column[Int] = column[Int]("m_refunds_RefundAmount_jp")
    /** Database column m_refunds_LastRefundAmount DBType(DECIMAL) */
    val mRefundsLastrefundamount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_LastRefundAmount")
    /** Database column m_refunds_LastRefundAmount_jp DBType(INT) */
    val mRefundsLastrefundamountJp: Column[Int] = column[Int]("m_refunds_LastRefundAmount_jp")
    /** Database column m_refunds_DeliveryFate DBType(DECIMAL) */
    val mRefundsDeliveryfate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_DeliveryFate")
    /** Database column m_refunds_DeliveryFate_jp DBType(INT) */
    val mRefundsDeliveryfateJp: Column[Int] = column[Int]("m_refunds_DeliveryFate_jp")
    /** Database column m_refunds_TotalRefundAmount DBType(DECIMAL) */
    val mRefundsTotalrefundamount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_TotalRefundAmount")
    /** Database column m_refunds_TotalRefundAmount_jp DBType(INT) */
    val mRefundsTotalrefundamountJp: Column[Int] = column[Int]("m_refunds_TotalRefundAmount_jp")
    /** Database column m_refunds_Statu DBType(SMALLINT), Default(1) */
    val mRefundsStatu: Column[Short] = column[Short]("m_refunds_Statu", O.Default(1))
    
    /** Uniqueness Index over (mRefundsOrderid) (database name m_refunds_OrderId) */
    val index1 = index("m_refunds_OrderId", mRefundsOrderid, unique=true)
  }
  /** Collection-like TableQuery object for table MRefunds */
  lazy val MRefunds = new TableQuery(tag => new MRefunds(tag))
  
  /** Entity class storing rows of table MRefundsConfigure
   *  @param mRefundsConfigureId Database column m_refunds_configure_ID DBType(INT), AutoInc, PrimaryKey
   *  @param mRefundsConfigureGroupid Database column m_refunds_configure_GroupID DBType(INT)
   *  @param mRefundsConfigureKey Database column m_refunds_configure_Key DBType(VARCHAR), Length(55,true)
   *  @param mRefundsConfigureValue Database column m_refunds_configure_Value DBType(VARCHAR), Length(255,true)
   *  @param mRefundsConfigureValueJp Database column m_refunds_configure_Value_jp DBType(VARCHAR), Length(255,true)
   *  @param mRefundsConfigureDescription Database column m_refunds_configure_Description DBType(VARCHAR), Length(255,true)
   *  @param mRefundsConfigureOrder Database column m_refunds_configure_Order DBType(INT) */
  case class MRefundsConfigureRow(mRefundsConfigureId: Int, mRefundsConfigureGroupid: Int, mRefundsConfigureKey: String, mRefundsConfigureValue: String, mRefundsConfigureValueJp: String, mRefundsConfigureDescription: String, mRefundsConfigureOrder: Int)
  /** GetResult implicit for fetching MRefundsConfigureRow objects using plain SQL queries */
  implicit def GetResultMRefundsConfigureRow(implicit e0: GR[Int], e1: GR[String]): GR[MRefundsConfigureRow] = GR{
    prs => import prs._
    MRefundsConfigureRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table m_refunds_configure. Objects of this class serve as prototypes for rows in queries. */
  class MRefundsConfigure(_tableTag: Tag) extends Table[MRefundsConfigureRow](_tableTag, "m_refunds_configure") {
    def * = (mRefundsConfigureId, mRefundsConfigureGroupid, mRefundsConfigureKey, mRefundsConfigureValue, mRefundsConfigureValueJp, mRefundsConfigureDescription, mRefundsConfigureOrder) <> (MRefundsConfigureRow.tupled, MRefundsConfigureRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRefundsConfigureId.?, mRefundsConfigureGroupid.?, mRefundsConfigureKey.?, mRefundsConfigureValue.?, mRefundsConfigureValueJp.?, mRefundsConfigureDescription.?, mRefundsConfigureOrder.?).shaped.<>({r=>import r._; _1.map(_=> MRefundsConfigureRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_refunds_configure_ID DBType(INT), AutoInc, PrimaryKey */
    val mRefundsConfigureId: Column[Int] = column[Int]("m_refunds_configure_ID", O.AutoInc, O.PrimaryKey)
    /** Database column m_refunds_configure_GroupID DBType(INT) */
    val mRefundsConfigureGroupid: Column[Int] = column[Int]("m_refunds_configure_GroupID")
    /** Database column m_refunds_configure_Key DBType(VARCHAR), Length(55,true) */
    val mRefundsConfigureKey: Column[String] = column[String]("m_refunds_configure_Key", O.Length(55,varying=true))
    /** Database column m_refunds_configure_Value DBType(VARCHAR), Length(255,true) */
    val mRefundsConfigureValue: Column[String] = column[String]("m_refunds_configure_Value", O.Length(255,varying=true))
    /** Database column m_refunds_configure_Value_jp DBType(VARCHAR), Length(255,true) */
    val mRefundsConfigureValueJp: Column[String] = column[String]("m_refunds_configure_Value_jp", O.Length(255,varying=true))
    /** Database column m_refunds_configure_Description DBType(VARCHAR), Length(255,true) */
    val mRefundsConfigureDescription: Column[String] = column[String]("m_refunds_configure_Description", O.Length(255,varying=true))
    /** Database column m_refunds_configure_Order DBType(INT) */
    val mRefundsConfigureOrder: Column[Int] = column[Int]("m_refunds_configure_Order")
  }
  /** Collection-like TableQuery object for table MRefundsConfigure */
  lazy val MRefundsConfigure = new TableQuery(tag => new MRefundsConfigure(tag))
  
  /** Entity class storing rows of table MRefundsDetail
   *  @param mRefundsDetailId Database column m_refunds_detail_ID DBType(INT), AutoInc, PrimaryKey
   *  @param mRefundsDetailRefundsid Database column m_refunds_detail_RefundsId DBType(INT)
   *  @param mRefundsDetailMakerid Database column m_refunds_detail_MakerId DBType(INT)
   *  @param mRefundsDetailGoodsnum Database column m_refunds_detail_GoodsNum DBType(INT)
   *  @param mRefundsDetailRefundamount Database column m_refunds_detail_RefundAmount DBType(DECIMAL)
   *  @param mRefundsDetailRefundamountJp Database column m_refunds_detail_RefundAmount_jp DBType(INT)
   *  @param mRefundsDetailAddtime Database column m_refunds_detail_AddTime DBType(DATETIME)
   *  @param mRefundsDetailModifytime Database column m_refunds_detail_ModifyTime DBType(DATETIME)
   *  @param mRefundsDetailPaket Database column m_refunds_detail_Paket DBType(BLOB)
   *  @param mRefundsDetailReplytype Database column m_refunds_detail_ReplyType DBType(SMALLINT), Default(0)
   *  @param mRefundsDetailCmd Database column m_refunds_detail_CMD DBType(VARCHAR), Length(125,true)
   *  @param mRefundsDetailLastrefundamount Database column m_refunds_detail_LastRefundAmount DBType(DECIMAL)
   *  @param mRefundsDetailLastrefundamountJp Database column m_refunds_detail_LastRefundAmount_jp DBType(INT)
   *  @param mRefundsDetailTotalweight Database column m_refunds_detail_TotalWeight DBType(INT)
   *  @param mRefundsDetailHasreturn Database column m_refunds_detail_HasReturn DBType(SMALLINT)
   *  @param mRefundsDetailDeliveryfate Database column m_refunds_detail_DeliveryFate DBType(DECIMAL)
   *  @param mRefundsDetailDeliveryfateJp Database column m_refunds_detail_DeliveryFate_jp DBType(INT)
   *  @param mRefundsDetailCancelreason Database column m_refunds_detail_CancelReason DBType(TEXT), Length(65535,true) */
  case class MRefundsDetailRow(mRefundsDetailId: Int, mRefundsDetailRefundsid: Int, mRefundsDetailMakerid: Int, mRefundsDetailGoodsnum: Int, mRefundsDetailRefundamount: scala.math.BigDecimal, mRefundsDetailRefundamountJp: Int, mRefundsDetailAddtime: java.sql.Timestamp, mRefundsDetailModifytime: java.sql.Timestamp, mRefundsDetailPaket: java.sql.Blob, mRefundsDetailReplytype: Short = 0, mRefundsDetailCmd: String, mRefundsDetailLastrefundamount: scala.math.BigDecimal, mRefundsDetailLastrefundamountJp: Int, mRefundsDetailTotalweight: Int, mRefundsDetailHasreturn: Short, mRefundsDetailDeliveryfate: scala.math.BigDecimal, mRefundsDetailDeliveryfateJp: Int, mRefundsDetailCancelreason: String)
  /** GetResult implicit for fetching MRefundsDetailRow objects using plain SQL queries */
  implicit def GetResultMRefundsDetailRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[java.sql.Timestamp], e3: GR[java.sql.Blob], e4: GR[Short], e5: GR[String]): GR[MRefundsDetailRow] = GR{
    prs => import prs._
    MRefundsDetailRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Blob], <<[Short], <<[String], <<[scala.math.BigDecimal], <<[Int], <<[Int], <<[Short], <<[scala.math.BigDecimal], <<[Int], <<[String]))
  }
  /** Table description of table m_refunds_detail. Objects of this class serve as prototypes for rows in queries. */
  class MRefundsDetail(_tableTag: Tag) extends Table[MRefundsDetailRow](_tableTag, "m_refunds_detail") {
    def * = (mRefundsDetailId, mRefundsDetailRefundsid, mRefundsDetailMakerid, mRefundsDetailGoodsnum, mRefundsDetailRefundamount, mRefundsDetailRefundamountJp, mRefundsDetailAddtime, mRefundsDetailModifytime, mRefundsDetailPaket, mRefundsDetailReplytype, mRefundsDetailCmd, mRefundsDetailLastrefundamount, mRefundsDetailLastrefundamountJp, mRefundsDetailTotalweight, mRefundsDetailHasreturn, mRefundsDetailDeliveryfate, mRefundsDetailDeliveryfateJp, mRefundsDetailCancelreason) <> (MRefundsDetailRow.tupled, MRefundsDetailRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRefundsDetailId.?, mRefundsDetailRefundsid.?, mRefundsDetailMakerid.?, mRefundsDetailGoodsnum.?, mRefundsDetailRefundamount.?, mRefundsDetailRefundamountJp.?, mRefundsDetailAddtime.?, mRefundsDetailModifytime.?, mRefundsDetailPaket.?, mRefundsDetailReplytype.?, mRefundsDetailCmd.?, mRefundsDetailLastrefundamount.?, mRefundsDetailLastrefundamountJp.?, mRefundsDetailTotalweight.?, mRefundsDetailHasreturn.?, mRefundsDetailDeliveryfate.?, mRefundsDetailDeliveryfateJp.?, mRefundsDetailCancelreason.?).shaped.<>({r=>import r._; _1.map(_=> MRefundsDetailRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get, _18.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_refunds_detail_ID DBType(INT), AutoInc, PrimaryKey */
    val mRefundsDetailId: Column[Int] = column[Int]("m_refunds_detail_ID", O.AutoInc, O.PrimaryKey)
    /** Database column m_refunds_detail_RefundsId DBType(INT) */
    val mRefundsDetailRefundsid: Column[Int] = column[Int]("m_refunds_detail_RefundsId")
    /** Database column m_refunds_detail_MakerId DBType(INT) */
    val mRefundsDetailMakerid: Column[Int] = column[Int]("m_refunds_detail_MakerId")
    /** Database column m_refunds_detail_GoodsNum DBType(INT) */
    val mRefundsDetailGoodsnum: Column[Int] = column[Int]("m_refunds_detail_GoodsNum")
    /** Database column m_refunds_detail_RefundAmount DBType(DECIMAL) */
    val mRefundsDetailRefundamount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_detail_RefundAmount")
    /** Database column m_refunds_detail_RefundAmount_jp DBType(INT) */
    val mRefundsDetailRefundamountJp: Column[Int] = column[Int]("m_refunds_detail_RefundAmount_jp")
    /** Database column m_refunds_detail_AddTime DBType(DATETIME) */
    val mRefundsDetailAddtime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_refunds_detail_AddTime")
    /** Database column m_refunds_detail_ModifyTime DBType(DATETIME) */
    val mRefundsDetailModifytime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_refunds_detail_ModifyTime")
    /** Database column m_refunds_detail_Paket DBType(BLOB) */
    val mRefundsDetailPaket: Column[java.sql.Blob] = column[java.sql.Blob]("m_refunds_detail_Paket")
    /** Database column m_refunds_detail_ReplyType DBType(SMALLINT), Default(0) */
    val mRefundsDetailReplytype: Column[Short] = column[Short]("m_refunds_detail_ReplyType", O.Default(0))
    /** Database column m_refunds_detail_CMD DBType(VARCHAR), Length(125,true) */
    val mRefundsDetailCmd: Column[String] = column[String]("m_refunds_detail_CMD", O.Length(125,varying=true))
    /** Database column m_refunds_detail_LastRefundAmount DBType(DECIMAL) */
    val mRefundsDetailLastrefundamount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_detail_LastRefundAmount")
    /** Database column m_refunds_detail_LastRefundAmount_jp DBType(INT) */
    val mRefundsDetailLastrefundamountJp: Column[Int] = column[Int]("m_refunds_detail_LastRefundAmount_jp")
    /** Database column m_refunds_detail_TotalWeight DBType(INT) */
    val mRefundsDetailTotalweight: Column[Int] = column[Int]("m_refunds_detail_TotalWeight")
    /** Database column m_refunds_detail_HasReturn DBType(SMALLINT) */
    val mRefundsDetailHasreturn: Column[Short] = column[Short]("m_refunds_detail_HasReturn")
    /** Database column m_refunds_detail_DeliveryFate DBType(DECIMAL) */
    val mRefundsDetailDeliveryfate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_detail_DeliveryFate")
    /** Database column m_refunds_detail_DeliveryFate_jp DBType(INT) */
    val mRefundsDetailDeliveryfateJp: Column[Int] = column[Int]("m_refunds_detail_DeliveryFate_jp")
    /** Database column m_refunds_detail_CancelReason DBType(TEXT), Length(65535,true) */
    val mRefundsDetailCancelreason: Column[String] = column[String]("m_refunds_detail_CancelReason", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table MRefundsDetail */
  lazy val MRefundsDetail = new TableQuery(tag => new MRefundsDetail(tag))
  
  /** Entity class storing rows of table MRefundsFlow
   *  @param mRefundsFlowsId Database column m_refunds_flows_ID DBType(INT), AutoInc, PrimaryKey
   *  @param mRefundsFlowsGroupid Database column m_refunds_flows_GroupID DBType(INT)
   *  @param mRefundsFlowsCmdid Database column m_refunds_flows_CMDID DBType(SMALLINT)
   *  @param mRefundsFlowsTips1 Database column m_refunds_flows_Tips1 DBType(TEXT), Length(65535,true)
   *  @param mRefundsFlowsTips2 Database column m_refunds_flows_Tips2 DBType(TEXT), Length(65535,true)
   *  @param mRefundsFlowsTips3 Database column m_refunds_flows_Tips3 DBType(TEXT), Length(65535,true)
   *  @param mRefundsFlowsTips4 Database column m_refunds_flows_Tips4 DBType(TEXT), Length(65535,true)
   *  @param mRefundsFlowsTips5 Database column m_refunds_flows_Tips5 DBType(TEXT), Length(65535,true)
   *  @param mRefundsFlowsCom Database column m_refunds_flows_COM DBType(INT)
   *  @param mRefundsFlowsDays Database column m_refunds_flows_Days DBType(INT)
   *  @param mRefundsFlowsFun Database column m_refunds_flows_FUN DBType(VARCHAR), Length(50,true)
   *  @param mRefundsFlowsStatu Database column m_refunds_flows_Statu DBType(VARCHAR), Length(50,true)
   *  @param mRefundsFlowsLogzh Database column m_refunds_flows_LogZh DBType(BLOB), Default(None)
   *  @param mRefundsFlowsLogjp Database column m_refunds_flows_LogJp DBType(BLOB), Default(None)
   *  @param mRefundsFlowsSendsitemsg Database column m_refunds_flows_SendSiteMsg DBType(SMALLINT), Default(Some(0))
   *  @param mRefundsFlowsSitemsgcontent Database column m_refunds_flows_SiteMsgContent DBType(TEXT), Length(65535,true), Default(None)
   *  @param mRefundsFlowsSendemail Database column m_refunds_flows_SendEmail DBType(SMALLINT), Default(Some(0))
   *  @param mRefundsFlowsEmailcontent Database column m_refunds_flows_EmailContent DBType(TEXT), Length(65535,true), Default(None)
   *  @param mRefundsFlowsEmailtitle Database column m_refunds_flows_EmailTitle DBType(VARCHAR), Length(125,true), Default(None)
   *  @param mRefundsFlowsMsgtitle Database column m_refunds_flows_MsgTitle DBType(VARCHAR), Length(125,true), Default(None)
   *  @param mRefundsFlowsLogtpl Database column m_refunds_flows_LogTpl DBType(VARCHAR), Length(225,true), Default(None)
   *  @param mRefundsFlowsSendlog Database column m_refunds_flows_SendLog DBType(SMALLINT), Default(Some(1)) */
  case class MRefundsFlowRow(mRefundsFlowsId: Int, mRefundsFlowsGroupid: Int, mRefundsFlowsCmdid: Short, mRefundsFlowsTips1: String, mRefundsFlowsTips2: String, mRefundsFlowsTips3: String, mRefundsFlowsTips4: String, mRefundsFlowsTips5: String, mRefundsFlowsCom: Int, mRefundsFlowsDays: Int, mRefundsFlowsFun: String, mRefundsFlowsStatu: String, mRefundsFlowsLogzh: Option[java.sql.Blob] = None, mRefundsFlowsLogjp: Option[java.sql.Blob] = None, mRefundsFlowsSendsitemsg: Option[Short] = Some(0), mRefundsFlowsSitemsgcontent: Option[String] = None, mRefundsFlowsSendemail: Option[Short] = Some(0), mRefundsFlowsEmailcontent: Option[String] = None, mRefundsFlowsEmailtitle: Option[String] = None, mRefundsFlowsMsgtitle: Option[String] = None, mRefundsFlowsLogtpl: Option[String] = None, mRefundsFlowsSendlog: Option[Short] = Some(1))
  /** GetResult implicit for fetching MRefundsFlowRow objects using plain SQL queries */
  implicit def GetResultMRefundsFlowRow(implicit e0: GR[Int], e1: GR[Short], e2: GR[String], e3: GR[Option[java.sql.Blob]], e4: GR[Option[Short]], e5: GR[Option[String]]): GR[MRefundsFlowRow] = GR{
    prs => import prs._
    MRefundsFlowRow.tupled((<<[Int], <<[Int], <<[Short], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[String], <<[String], <<?[java.sql.Blob], <<?[java.sql.Blob], <<?[Short], <<?[String], <<?[Short], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Short]))
  }
  /** Table description of table m_refunds_flow. Objects of this class serve as prototypes for rows in queries. */
  class MRefundsFlow(_tableTag: Tag) extends Table[MRefundsFlowRow](_tableTag, "m_refunds_flow") {
    def * = (mRefundsFlowsId, mRefundsFlowsGroupid, mRefundsFlowsCmdid, mRefundsFlowsTips1, mRefundsFlowsTips2, mRefundsFlowsTips3, mRefundsFlowsTips4, mRefundsFlowsTips5, mRefundsFlowsCom, mRefundsFlowsDays, mRefundsFlowsFun, mRefundsFlowsStatu, mRefundsFlowsLogzh, mRefundsFlowsLogjp, mRefundsFlowsSendsitemsg, mRefundsFlowsSitemsgcontent, mRefundsFlowsSendemail, mRefundsFlowsEmailcontent, mRefundsFlowsEmailtitle, mRefundsFlowsMsgtitle, mRefundsFlowsLogtpl, mRefundsFlowsSendlog) <> (MRefundsFlowRow.tupled, MRefundsFlowRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRefundsFlowsId.?, mRefundsFlowsGroupid.?, mRefundsFlowsCmdid.?, mRefundsFlowsTips1.?, mRefundsFlowsTips2.?, mRefundsFlowsTips3.?, mRefundsFlowsTips4.?, mRefundsFlowsTips5.?, mRefundsFlowsCom.?, mRefundsFlowsDays.?, mRefundsFlowsFun.?, mRefundsFlowsStatu.?, mRefundsFlowsLogzh, mRefundsFlowsLogjp, mRefundsFlowsSendsitemsg, mRefundsFlowsSitemsgcontent, mRefundsFlowsSendemail, mRefundsFlowsEmailcontent, mRefundsFlowsEmailtitle, mRefundsFlowsMsgtitle, mRefundsFlowsLogtpl, mRefundsFlowsSendlog).shaped.<>({r=>import r._; _1.map(_=> MRefundsFlowRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_refunds_flows_ID DBType(INT), AutoInc, PrimaryKey */
    val mRefundsFlowsId: Column[Int] = column[Int]("m_refunds_flows_ID", O.AutoInc, O.PrimaryKey)
    /** Database column m_refunds_flows_GroupID DBType(INT) */
    val mRefundsFlowsGroupid: Column[Int] = column[Int]("m_refunds_flows_GroupID")
    /** Database column m_refunds_flows_CMDID DBType(SMALLINT) */
    val mRefundsFlowsCmdid: Column[Short] = column[Short]("m_refunds_flows_CMDID")
    /** Database column m_refunds_flows_Tips1 DBType(TEXT), Length(65535,true) */
    val mRefundsFlowsTips1: Column[String] = column[String]("m_refunds_flows_Tips1", O.Length(65535,varying=true))
    /** Database column m_refunds_flows_Tips2 DBType(TEXT), Length(65535,true) */
    val mRefundsFlowsTips2: Column[String] = column[String]("m_refunds_flows_Tips2", O.Length(65535,varying=true))
    /** Database column m_refunds_flows_Tips3 DBType(TEXT), Length(65535,true) */
    val mRefundsFlowsTips3: Column[String] = column[String]("m_refunds_flows_Tips3", O.Length(65535,varying=true))
    /** Database column m_refunds_flows_Tips4 DBType(TEXT), Length(65535,true) */
    val mRefundsFlowsTips4: Column[String] = column[String]("m_refunds_flows_Tips4", O.Length(65535,varying=true))
    /** Database column m_refunds_flows_Tips5 DBType(TEXT), Length(65535,true) */
    val mRefundsFlowsTips5: Column[String] = column[String]("m_refunds_flows_Tips5", O.Length(65535,varying=true))
    /** Database column m_refunds_flows_COM DBType(INT) */
    val mRefundsFlowsCom: Column[Int] = column[Int]("m_refunds_flows_COM")
    /** Database column m_refunds_flows_Days DBType(INT) */
    val mRefundsFlowsDays: Column[Int] = column[Int]("m_refunds_flows_Days")
    /** Database column m_refunds_flows_FUN DBType(VARCHAR), Length(50,true) */
    val mRefundsFlowsFun: Column[String] = column[String]("m_refunds_flows_FUN", O.Length(50,varying=true))
    /** Database column m_refunds_flows_Statu DBType(VARCHAR), Length(50,true) */
    val mRefundsFlowsStatu: Column[String] = column[String]("m_refunds_flows_Statu", O.Length(50,varying=true))
    /** Database column m_refunds_flows_LogZh DBType(BLOB), Default(None) */
    val mRefundsFlowsLogzh: Column[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("m_refunds_flows_LogZh", O.Default(None))
    /** Database column m_refunds_flows_LogJp DBType(BLOB), Default(None) */
    val mRefundsFlowsLogjp: Column[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("m_refunds_flows_LogJp", O.Default(None))
    /** Database column m_refunds_flows_SendSiteMsg DBType(SMALLINT), Default(Some(0)) */
    val mRefundsFlowsSendsitemsg: Column[Option[Short]] = column[Option[Short]]("m_refunds_flows_SendSiteMsg", O.Default(Some(0)))
    /** Database column m_refunds_flows_SiteMsgContent DBType(TEXT), Length(65535,true), Default(None) */
    val mRefundsFlowsSitemsgcontent: Column[Option[String]] = column[Option[String]]("m_refunds_flows_SiteMsgContent", O.Length(65535,varying=true), O.Default(None))
    /** Database column m_refunds_flows_SendEmail DBType(SMALLINT), Default(Some(0)) */
    val mRefundsFlowsSendemail: Column[Option[Short]] = column[Option[Short]]("m_refunds_flows_SendEmail", O.Default(Some(0)))
    /** Database column m_refunds_flows_EmailContent DBType(TEXT), Length(65535,true), Default(None) */
    val mRefundsFlowsEmailcontent: Column[Option[String]] = column[Option[String]]("m_refunds_flows_EmailContent", O.Length(65535,varying=true), O.Default(None))
    /** Database column m_refunds_flows_EmailTitle DBType(VARCHAR), Length(125,true), Default(None) */
    val mRefundsFlowsEmailtitle: Column[Option[String]] = column[Option[String]]("m_refunds_flows_EmailTitle", O.Length(125,varying=true), O.Default(None))
    /** Database column m_refunds_flows_MsgTitle DBType(VARCHAR), Length(125,true), Default(None) */
    val mRefundsFlowsMsgtitle: Column[Option[String]] = column[Option[String]]("m_refunds_flows_MsgTitle", O.Length(125,varying=true), O.Default(None))
    /** Database column m_refunds_flows_LogTpl DBType(VARCHAR), Length(225,true), Default(None) */
    val mRefundsFlowsLogtpl: Column[Option[String]] = column[Option[String]]("m_refunds_flows_LogTpl", O.Length(225,varying=true), O.Default(None))
    /** Database column m_refunds_flows_SendLog DBType(SMALLINT), Default(Some(1)) */
    val mRefundsFlowsSendlog: Column[Option[Short]] = column[Option[Short]]("m_refunds_flows_SendLog", O.Default(Some(1)))
  }
  /** Collection-like TableQuery object for table MRefundsFlow */
  lazy val MRefundsFlow = new TableQuery(tag => new MRefundsFlow(tag))
  
  /** Entity class storing rows of table MRefundsItems
   *  @param mRefundsItemsOrderitemid Database column m_refunds_items_OrderItemId DBType(INT)
   *  @param mRefundsItemsOrderid Database column m_refunds_items_OrderId DBType(INT)
   *  @param mRefundsItemsDetailid Database column m_refunds_items_DetailId DBType(INT)
   *  @param mRefundsItemsItemid Database column m_refunds_items_ItemId DBType(INT)
   *  @param mRefundsItemsRefundnum Database column m_refunds_items_RefundNum DBType(INT)
   *  @param mRefundsItemsRefundamount Database column m_refunds_items_RefundAmount DBType(DECIMAL)
   *  @param mRefundsItemsRefundamountJp Database column m_refunds_items_RefundAmount_jp DBType(DECIMAL)
   *  @param mRefundsItemsWeight Database column m_refunds_items_Weight DBType(INT)
   *  @param mRefundsItemsReasonconfigid Database column m_refunds_items_ReasonConfigID DBType(INT)
   *  @param mRefundsItemsDescription Database column m_refunds_items_Description DBType(TEXT), Length(65535,true)
   *  @param mRefundsItemsProfileimgs Database column m_refunds_items_ProfileImgs DBType(TEXT), Length(65535,true) */
  case class MRefundsItemsRow(mRefundsItemsOrderitemid: Int, mRefundsItemsOrderid: Int, mRefundsItemsDetailid: Int, mRefundsItemsItemid: Int, mRefundsItemsRefundnum: Int, mRefundsItemsRefundamount: scala.math.BigDecimal, mRefundsItemsRefundamountJp: scala.math.BigDecimal, mRefundsItemsWeight: Int, mRefundsItemsReasonconfigid: Int, mRefundsItemsDescription: String, mRefundsItemsProfileimgs: String)
  /** GetResult implicit for fetching MRefundsItemsRow objects using plain SQL queries */
  implicit def GetResultMRefundsItemsRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[String]): GR[MRefundsItemsRow] = GR{
    prs => import prs._
    MRefundsItemsRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[Int], <<[Int], <<[String], <<[String]))
  }
  /** Table description of table m_refunds_items. Objects of this class serve as prototypes for rows in queries. */
  class MRefundsItems(_tableTag: Tag) extends Table[MRefundsItemsRow](_tableTag, "m_refunds_items") {
    def * = (mRefundsItemsOrderitemid, mRefundsItemsOrderid, mRefundsItemsDetailid, mRefundsItemsItemid, mRefundsItemsRefundnum, mRefundsItemsRefundamount, mRefundsItemsRefundamountJp, mRefundsItemsWeight, mRefundsItemsReasonconfigid, mRefundsItemsDescription, mRefundsItemsProfileimgs) <> (MRefundsItemsRow.tupled, MRefundsItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRefundsItemsOrderitemid.?, mRefundsItemsOrderid.?, mRefundsItemsDetailid.?, mRefundsItemsItemid.?, mRefundsItemsRefundnum.?, mRefundsItemsRefundamount.?, mRefundsItemsRefundamountJp.?, mRefundsItemsWeight.?, mRefundsItemsReasonconfigid.?, mRefundsItemsDescription.?, mRefundsItemsProfileimgs.?).shaped.<>({r=>import r._; _1.map(_=> MRefundsItemsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_refunds_items_OrderItemId DBType(INT) */
    val mRefundsItemsOrderitemid: Column[Int] = column[Int]("m_refunds_items_OrderItemId")
    /** Database column m_refunds_items_OrderId DBType(INT) */
    val mRefundsItemsOrderid: Column[Int] = column[Int]("m_refunds_items_OrderId")
    /** Database column m_refunds_items_DetailId DBType(INT) */
    val mRefundsItemsDetailid: Column[Int] = column[Int]("m_refunds_items_DetailId")
    /** Database column m_refunds_items_ItemId DBType(INT) */
    val mRefundsItemsItemid: Column[Int] = column[Int]("m_refunds_items_ItemId")
    /** Database column m_refunds_items_RefundNum DBType(INT) */
    val mRefundsItemsRefundnum: Column[Int] = column[Int]("m_refunds_items_RefundNum")
    /** Database column m_refunds_items_RefundAmount DBType(DECIMAL) */
    val mRefundsItemsRefundamount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_items_RefundAmount")
    /** Database column m_refunds_items_RefundAmount_jp DBType(DECIMAL) */
    val mRefundsItemsRefundamountJp: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_items_RefundAmount_jp")
    /** Database column m_refunds_items_Weight DBType(INT) */
    val mRefundsItemsWeight: Column[Int] = column[Int]("m_refunds_items_Weight")
    /** Database column m_refunds_items_ReasonConfigID DBType(INT) */
    val mRefundsItemsReasonconfigid: Column[Int] = column[Int]("m_refunds_items_ReasonConfigID")
    /** Database column m_refunds_items_Description DBType(TEXT), Length(65535,true) */
    val mRefundsItemsDescription: Column[String] = column[String]("m_refunds_items_Description", O.Length(65535,varying=true))
    /** Database column m_refunds_items_ProfileImgs DBType(TEXT), Length(65535,true) */
    val mRefundsItemsProfileimgs: Column[String] = column[String]("m_refunds_items_ProfileImgs", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table MRefundsItems */
  lazy val MRefundsItems = new TableQuery(tag => new MRefundsItems(tag))
  
  /** Entity class storing rows of table MRefundsLogs
   *  @param mRefundsLogsId Database column m_refunds_logs_ID DBType(INT), AutoInc, PrimaryKey
   *  @param mRefundsLogsLang Database column m_refunds_logs_lang DBType(VARCHAR), Length(5,true)
   *  @param mRefundsLogsCmd Database column m_refunds_logs_CMD DBType(VARCHAR), Length(55,true)
   *  @param mRefundsLogsDetailid Database column m_refunds_logs_DetailId DBType(INT)
   *  @param mRefundsLogsUserid Database column m_refunds_logs_UserId DBType(INT)
   *  @param mRefundsLogsUsertype Database column m_refunds_logs_UserType DBType(SMALLINT)
   *  @param mRefundsLogsOperation Database column m_refunds_logs_Operation DBType(VARCHAR), Length(50,true)
   *  @param mRefundsLogsContent Database column m_refunds_logs_Content DBType(BLOB)
   *  @param mRefundsLogsRemark Database column m_refunds_logs_Remark DBType(TEXT), Length(65535,true)
   *  @param mRefundsLogsProfileimgs Database column m_refunds_logs_ProfileImgs DBType(TEXT), Length(65535,true)
   *  @param mRefundsLogsPaket Database column m_refunds_logs_Paket DBType(BLOB)
   *  @param mRefundsLogsSendto Database column m_refunds_logs_SendTo DBType(SMALLINT), Default(7)
   *  @param mRefundsLogsCheckview Database column m_refunds_logs_CheckView DBType(SMALLINT), Default(0)
   *  @param mRefundsLogsAddtime Database column m_refunds_logs_AddTime DBType(DATETIME) */
  case class MRefundsLogsRow(mRefundsLogsId: Int, mRefundsLogsLang: String, mRefundsLogsCmd: String, mRefundsLogsDetailid: Int, mRefundsLogsUserid: Int, mRefundsLogsUsertype: Short, mRefundsLogsOperation: String, mRefundsLogsContent: java.sql.Blob, mRefundsLogsRemark: String, mRefundsLogsProfileimgs: String, mRefundsLogsPaket: java.sql.Blob, mRefundsLogsSendto: Short = 7, mRefundsLogsCheckview: Short = 0, mRefundsLogsAddtime: java.sql.Timestamp)
  /** GetResult implicit for fetching MRefundsLogsRow objects using plain SQL queries */
  implicit def GetResultMRefundsLogsRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Short], e3: GR[java.sql.Blob], e4: GR[java.sql.Timestamp]): GR[MRefundsLogsRow] = GR{
    prs => import prs._
    MRefundsLogsRow.tupled((<<[Int], <<[String], <<[String], <<[Int], <<[Int], <<[Short], <<[String], <<[java.sql.Blob], <<[String], <<[String], <<[java.sql.Blob], <<[Short], <<[Short], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_refunds_logs. Objects of this class serve as prototypes for rows in queries. */
  class MRefundsLogs(_tableTag: Tag) extends Table[MRefundsLogsRow](_tableTag, "m_refunds_logs") {
    def * = (mRefundsLogsId, mRefundsLogsLang, mRefundsLogsCmd, mRefundsLogsDetailid, mRefundsLogsUserid, mRefundsLogsUsertype, mRefundsLogsOperation, mRefundsLogsContent, mRefundsLogsRemark, mRefundsLogsProfileimgs, mRefundsLogsPaket, mRefundsLogsSendto, mRefundsLogsCheckview, mRefundsLogsAddtime) <> (MRefundsLogsRow.tupled, MRefundsLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRefundsLogsId.?, mRefundsLogsLang.?, mRefundsLogsCmd.?, mRefundsLogsDetailid.?, mRefundsLogsUserid.?, mRefundsLogsUsertype.?, mRefundsLogsOperation.?, mRefundsLogsContent.?, mRefundsLogsRemark.?, mRefundsLogsProfileimgs.?, mRefundsLogsPaket.?, mRefundsLogsSendto.?, mRefundsLogsCheckview.?, mRefundsLogsAddtime.?).shaped.<>({r=>import r._; _1.map(_=> MRefundsLogsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_refunds_logs_ID DBType(INT), AutoInc, PrimaryKey */
    val mRefundsLogsId: Column[Int] = column[Int]("m_refunds_logs_ID", O.AutoInc, O.PrimaryKey)
    /** Database column m_refunds_logs_lang DBType(VARCHAR), Length(5,true) */
    val mRefundsLogsLang: Column[String] = column[String]("m_refunds_logs_lang", O.Length(5,varying=true))
    /** Database column m_refunds_logs_CMD DBType(VARCHAR), Length(55,true) */
    val mRefundsLogsCmd: Column[String] = column[String]("m_refunds_logs_CMD", O.Length(55,varying=true))
    /** Database column m_refunds_logs_DetailId DBType(INT) */
    val mRefundsLogsDetailid: Column[Int] = column[Int]("m_refunds_logs_DetailId")
    /** Database column m_refunds_logs_UserId DBType(INT) */
    val mRefundsLogsUserid: Column[Int] = column[Int]("m_refunds_logs_UserId")
    /** Database column m_refunds_logs_UserType DBType(SMALLINT) */
    val mRefundsLogsUsertype: Column[Short] = column[Short]("m_refunds_logs_UserType")
    /** Database column m_refunds_logs_Operation DBType(VARCHAR), Length(50,true) */
    val mRefundsLogsOperation: Column[String] = column[String]("m_refunds_logs_Operation", O.Length(50,varying=true))
    /** Database column m_refunds_logs_Content DBType(BLOB) */
    val mRefundsLogsContent: Column[java.sql.Blob] = column[java.sql.Blob]("m_refunds_logs_Content")
    /** Database column m_refunds_logs_Remark DBType(TEXT), Length(65535,true) */
    val mRefundsLogsRemark: Column[String] = column[String]("m_refunds_logs_Remark", O.Length(65535,varying=true))
    /** Database column m_refunds_logs_ProfileImgs DBType(TEXT), Length(65535,true) */
    val mRefundsLogsProfileimgs: Column[String] = column[String]("m_refunds_logs_ProfileImgs", O.Length(65535,varying=true))
    /** Database column m_refunds_logs_Paket DBType(BLOB) */
    val mRefundsLogsPaket: Column[java.sql.Blob] = column[java.sql.Blob]("m_refunds_logs_Paket")
    /** Database column m_refunds_logs_SendTo DBType(SMALLINT), Default(7) */
    val mRefundsLogsSendto: Column[Short] = column[Short]("m_refunds_logs_SendTo", O.Default(7))
    /** Database column m_refunds_logs_CheckView DBType(SMALLINT), Default(0) */
    val mRefundsLogsCheckview: Column[Short] = column[Short]("m_refunds_logs_CheckView", O.Default(0))
    /** Database column m_refunds_logs_AddTime DBType(DATETIME) */
    val mRefundsLogsAddtime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_refunds_logs_AddTime")
  }
  /** Collection-like TableQuery object for table MRefundsLogs */
  lazy val MRefundsLogs = new TableQuery(tag => new MRefundsLogs(tag))
  
  /** Entity class storing rows of table MRefundsPlan
   *  @param mRefundsPlanId Database column m_refunds_plan_id DBType(INT), AutoInc, PrimaryKey
   *  @param mRefundsPlanCompanyName Database column m_refunds_plan_company_name DBType(VARCHAR), Length(50,true)
   *  @param mRefundsPlanDate Database column m_refunds_plan_date DBType(VARCHAR), Length(45,true)
   *  @param mRefundsPlanMUnsoId Database column m_refunds_plan_m_unso_id DBType(INT)
   *  @param mRefundsPlanName Database column m_refunds_plan_name DBType(VARCHAR), Length(100,true)
   *  @param mRefundsPlanNameCh Database column m_refunds_plan_name_ch DBType(VARCHAR), Length(100,true)
   *  @param mRefundsPlanPhp Database column m_refunds_plan_php DBType(TEXT), Length(65535,true)
   *  @param mRefundsPlanMinWeightRange Database column m_refunds_plan_min_weight_range DBType(INT)
   *  @param mRefundsPlanMaxWeightRange Database column m_refunds_plan_max_weight_range DBType(INT)
   *  @param mRefundsPlanBaseCost Database column m_refunds_plan_base_cost DBType(INT)
   *  @param mRefundsPlanWeightCost Database column m_refunds_plan_weight_cost DBType(INT)
   *  @param mRefundsPlanWeightFactor Database column m_refunds_plan_weight_factor DBType(DECIMAL)
   *  @param mRefundsPlanSearchUrl Database column m_refunds_plan_search_url DBType(VARCHAR), Length(200,true)
   *  @param mRefundsPlanRdatetime Database column m_refunds_plan_rdatetime DBType(DATETIME)
   *  @param mRefundsPlanUdatetime Database column m_refunds_plan_udatetime DBType(DATETIME)
   *  @param mRefundsPlanRuser Database column m_refunds_plan_ruser DBType(INT)
   *  @param mRefundsPlanUuser Database column m_refunds_plan_uuser DBType(INT) */
  case class MRefundsPlanRow(mRefundsPlanId: Int, mRefundsPlanCompanyName: String, mRefundsPlanDate: String, mRefundsPlanMUnsoId: Int, mRefundsPlanName: String, mRefundsPlanNameCh: String, mRefundsPlanPhp: String, mRefundsPlanMinWeightRange: Int, mRefundsPlanMaxWeightRange: Int, mRefundsPlanBaseCost: Int, mRefundsPlanWeightCost: Int, mRefundsPlanWeightFactor: scala.math.BigDecimal, mRefundsPlanSearchUrl: String, mRefundsPlanRdatetime: java.sql.Timestamp, mRefundsPlanUdatetime: java.sql.Timestamp, mRefundsPlanRuser: Int, mRefundsPlanUuser: Int)
  /** GetResult implicit for fetching MRefundsPlanRow objects using plain SQL queries */
  implicit def GetResultMRefundsPlanRow(implicit e0: GR[Int], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[java.sql.Timestamp]): GR[MRefundsPlanRow] = GR{
    prs => import prs._
    MRefundsPlanRow.tupled((<<[Int], <<[String], <<[String], <<[Int], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table m_refunds_plan. Objects of this class serve as prototypes for rows in queries. */
  class MRefundsPlan(_tableTag: Tag) extends Table[MRefundsPlanRow](_tableTag, "m_refunds_plan") {
    def * = (mRefundsPlanId, mRefundsPlanCompanyName, mRefundsPlanDate, mRefundsPlanMUnsoId, mRefundsPlanName, mRefundsPlanNameCh, mRefundsPlanPhp, mRefundsPlanMinWeightRange, mRefundsPlanMaxWeightRange, mRefundsPlanBaseCost, mRefundsPlanWeightCost, mRefundsPlanWeightFactor, mRefundsPlanSearchUrl, mRefundsPlanRdatetime, mRefundsPlanUdatetime, mRefundsPlanRuser, mRefundsPlanUuser) <> (MRefundsPlanRow.tupled, MRefundsPlanRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRefundsPlanId.?, mRefundsPlanCompanyName.?, mRefundsPlanDate.?, mRefundsPlanMUnsoId.?, mRefundsPlanName.?, mRefundsPlanNameCh.?, mRefundsPlanPhp.?, mRefundsPlanMinWeightRange.?, mRefundsPlanMaxWeightRange.?, mRefundsPlanBaseCost.?, mRefundsPlanWeightCost.?, mRefundsPlanWeightFactor.?, mRefundsPlanSearchUrl.?, mRefundsPlanRdatetime.?, mRefundsPlanUdatetime.?, mRefundsPlanRuser.?, mRefundsPlanUuser.?).shaped.<>({r=>import r._; _1.map(_=> MRefundsPlanRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_refunds_plan_id DBType(INT), AutoInc, PrimaryKey */
    val mRefundsPlanId: Column[Int] = column[Int]("m_refunds_plan_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_refunds_plan_company_name DBType(VARCHAR), Length(50,true) */
    val mRefundsPlanCompanyName: Column[String] = column[String]("m_refunds_plan_company_name", O.Length(50,varying=true))
    /** Database column m_refunds_plan_date DBType(VARCHAR), Length(45,true) */
    val mRefundsPlanDate: Column[String] = column[String]("m_refunds_plan_date", O.Length(45,varying=true))
    /** Database column m_refunds_plan_m_unso_id DBType(INT) */
    val mRefundsPlanMUnsoId: Column[Int] = column[Int]("m_refunds_plan_m_unso_id")
    /** Database column m_refunds_plan_name DBType(VARCHAR), Length(100,true) */
    val mRefundsPlanName: Column[String] = column[String]("m_refunds_plan_name", O.Length(100,varying=true))
    /** Database column m_refunds_plan_name_ch DBType(VARCHAR), Length(100,true) */
    val mRefundsPlanNameCh: Column[String] = column[String]("m_refunds_plan_name_ch", O.Length(100,varying=true))
    /** Database column m_refunds_plan_php DBType(TEXT), Length(65535,true) */
    val mRefundsPlanPhp: Column[String] = column[String]("m_refunds_plan_php", O.Length(65535,varying=true))
    /** Database column m_refunds_plan_min_weight_range DBType(INT) */
    val mRefundsPlanMinWeightRange: Column[Int] = column[Int]("m_refunds_plan_min_weight_range")
    /** Database column m_refunds_plan_max_weight_range DBType(INT) */
    val mRefundsPlanMaxWeightRange: Column[Int] = column[Int]("m_refunds_plan_max_weight_range")
    /** Database column m_refunds_plan_base_cost DBType(INT) */
    val mRefundsPlanBaseCost: Column[Int] = column[Int]("m_refunds_plan_base_cost")
    /** Database column m_refunds_plan_weight_cost DBType(INT) */
    val mRefundsPlanWeightCost: Column[Int] = column[Int]("m_refunds_plan_weight_cost")
    /** Database column m_refunds_plan_weight_factor DBType(DECIMAL) */
    val mRefundsPlanWeightFactor: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_plan_weight_factor")
    /** Database column m_refunds_plan_search_url DBType(VARCHAR), Length(200,true) */
    val mRefundsPlanSearchUrl: Column[String] = column[String]("m_refunds_plan_search_url", O.Length(200,varying=true))
    /** Database column m_refunds_plan_rdatetime DBType(DATETIME) */
    val mRefundsPlanRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_refunds_plan_rdatetime")
    /** Database column m_refunds_plan_udatetime DBType(DATETIME) */
    val mRefundsPlanUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_refunds_plan_udatetime")
    /** Database column m_refunds_plan_ruser DBType(INT) */
    val mRefundsPlanRuser: Column[Int] = column[Int]("m_refunds_plan_ruser")
    /** Database column m_refunds_plan_uuser DBType(INT) */
    val mRefundsPlanUuser: Column[Int] = column[Int]("m_refunds_plan_uuser")
  }
  /** Collection-like TableQuery object for table MRefundsPlan */
  lazy val MRefundsPlan = new TableQuery(tag => new MRefundsPlan(tag))
  
  /** Entity class storing rows of table MRefundsProtect
   *  @param mRefundsProtectId Database column m_refunds_protect_ID DBType(INT), AutoInc, PrimaryKey
   *  @param mRefundsProtectNumber Database column m_refunds_protect_Number DBType(VARCHAR), Length(50,true)
   *  @param mRefundsProtectDetailid Database column m_refunds_protect_DetailId DBType(INT)
   *  @param mRefundsProtectUserid Database column m_refunds_protect_UserId DBType(INT)
   *  @param mRefundsProtectUsertype Database column m_refunds_protect_UserType DBType(SMALLINT)
   *  @param mRefundsProtectReason Database column m_refunds_protect_Reason DBType(TEXT), Length(65535,true)
   *  @param mRefundsProtectResdesczh Database column m_refunds_protect_ResDescZh DBType(TEXT), Length(65535,true)
   *  @param mRefundsProtectResdescjp Database column m_refunds_protect_ResDescJp DBType(TEXT), Length(65535,true)
   *  @param mRefundsProtectProfileimgs Database column m_refunds_protect_ProfileImgs DBType(TEXT), Length(65535,true)
   *  @param mRefundsProtectAddtime Database column m_refunds_protect_AddTime DBType(DATETIME)
   *  @param mRefundsProtectModifytime Database column m_refunds_protect_ModifyTime DBType(DATETIME)
   *  @param mRefundsProtectResult Database column m_refunds_protect_Result DBType(VARCHAR), Length(125,true)
   *  @param mRefundsProtectLastreturnamount Database column m_refunds_protect_LastReturnAmount DBType(DECIMAL)
   *  @param mRefundsProtectLastreturnamountjp Database column m_refunds_protect_LastReturnAmountJp DBType(DECIMAL)
   *  @param mRefundsProtectRemark Database column m_refunds_protect_Remark DBType(TEXT), Length(65535,true) */
  case class MRefundsProtectRow(mRefundsProtectId: Int, mRefundsProtectNumber: String, mRefundsProtectDetailid: Int, mRefundsProtectUserid: Int, mRefundsProtectUsertype: Short, mRefundsProtectReason: String, mRefundsProtectResdesczh: String, mRefundsProtectResdescjp: String, mRefundsProtectProfileimgs: String, mRefundsProtectAddtime: java.sql.Timestamp, mRefundsProtectModifytime: java.sql.Timestamp, mRefundsProtectResult: String, mRefundsProtectLastreturnamount: scala.math.BigDecimal, mRefundsProtectLastreturnamountjp: scala.math.BigDecimal, mRefundsProtectRemark: String)
  /** GetResult implicit for fetching MRefundsProtectRow objects using plain SQL queries */
  implicit def GetResultMRefundsProtectRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Short], e3: GR[java.sql.Timestamp], e4: GR[scala.math.BigDecimal]): GR[MRefundsProtectRow] = GR{
    prs => import prs._
    MRefundsProtectRow.tupled((<<[Int], <<[String], <<[Int], <<[Int], <<[Short], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[String]))
  }
  /** Table description of table m_refunds_protect. Objects of this class serve as prototypes for rows in queries. */
  class MRefundsProtect(_tableTag: Tag) extends Table[MRefundsProtectRow](_tableTag, "m_refunds_protect") {
    def * = (mRefundsProtectId, mRefundsProtectNumber, mRefundsProtectDetailid, mRefundsProtectUserid, mRefundsProtectUsertype, mRefundsProtectReason, mRefundsProtectResdesczh, mRefundsProtectResdescjp, mRefundsProtectProfileimgs, mRefundsProtectAddtime, mRefundsProtectModifytime, mRefundsProtectResult, mRefundsProtectLastreturnamount, mRefundsProtectLastreturnamountjp, mRefundsProtectRemark) <> (MRefundsProtectRow.tupled, MRefundsProtectRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRefundsProtectId.?, mRefundsProtectNumber.?, mRefundsProtectDetailid.?, mRefundsProtectUserid.?, mRefundsProtectUsertype.?, mRefundsProtectReason.?, mRefundsProtectResdesczh.?, mRefundsProtectResdescjp.?, mRefundsProtectProfileimgs.?, mRefundsProtectAddtime.?, mRefundsProtectModifytime.?, mRefundsProtectResult.?, mRefundsProtectLastreturnamount.?, mRefundsProtectLastreturnamountjp.?, mRefundsProtectRemark.?).shaped.<>({r=>import r._; _1.map(_=> MRefundsProtectRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_refunds_protect_ID DBType(INT), AutoInc, PrimaryKey */
    val mRefundsProtectId: Column[Int] = column[Int]("m_refunds_protect_ID", O.AutoInc, O.PrimaryKey)
    /** Database column m_refunds_protect_Number DBType(VARCHAR), Length(50,true) */
    val mRefundsProtectNumber: Column[String] = column[String]("m_refunds_protect_Number", O.Length(50,varying=true))
    /** Database column m_refunds_protect_DetailId DBType(INT) */
    val mRefundsProtectDetailid: Column[Int] = column[Int]("m_refunds_protect_DetailId")
    /** Database column m_refunds_protect_UserId DBType(INT) */
    val mRefundsProtectUserid: Column[Int] = column[Int]("m_refunds_protect_UserId")
    /** Database column m_refunds_protect_UserType DBType(SMALLINT) */
    val mRefundsProtectUsertype: Column[Short] = column[Short]("m_refunds_protect_UserType")
    /** Database column m_refunds_protect_Reason DBType(TEXT), Length(65535,true) */
    val mRefundsProtectReason: Column[String] = column[String]("m_refunds_protect_Reason", O.Length(65535,varying=true))
    /** Database column m_refunds_protect_ResDescZh DBType(TEXT), Length(65535,true) */
    val mRefundsProtectResdesczh: Column[String] = column[String]("m_refunds_protect_ResDescZh", O.Length(65535,varying=true))
    /** Database column m_refunds_protect_ResDescJp DBType(TEXT), Length(65535,true) */
    val mRefundsProtectResdescjp: Column[String] = column[String]("m_refunds_protect_ResDescJp", O.Length(65535,varying=true))
    /** Database column m_refunds_protect_ProfileImgs DBType(TEXT), Length(65535,true) */
    val mRefundsProtectProfileimgs: Column[String] = column[String]("m_refunds_protect_ProfileImgs", O.Length(65535,varying=true))
    /** Database column m_refunds_protect_AddTime DBType(DATETIME) */
    val mRefundsProtectAddtime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_refunds_protect_AddTime")
    /** Database column m_refunds_protect_ModifyTime DBType(DATETIME) */
    val mRefundsProtectModifytime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_refunds_protect_ModifyTime")
    /** Database column m_refunds_protect_Result DBType(VARCHAR), Length(125,true) */
    val mRefundsProtectResult: Column[String] = column[String]("m_refunds_protect_Result", O.Length(125,varying=true))
    /** Database column m_refunds_protect_LastReturnAmount DBType(DECIMAL) */
    val mRefundsProtectLastreturnamount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_protect_LastReturnAmount")
    /** Database column m_refunds_protect_LastReturnAmountJp DBType(DECIMAL) */
    val mRefundsProtectLastreturnamountjp: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_refunds_protect_LastReturnAmountJp")
    /** Database column m_refunds_protect_Remark DBType(TEXT), Length(65535,true) */
    val mRefundsProtectRemark: Column[String] = column[String]("m_refunds_protect_Remark", O.Length(65535,varying=true))
    
    /** Uniqueness Index over (mRefundsProtectDetailid) (database name m_refunds_protect_DetailId) */
    val index1 = index("m_refunds_protect_DetailId", mRefundsProtectDetailid, unique=true)
  }
  /** Collection-like TableQuery object for table MRefundsProtect */
  lazy val MRefundsProtect = new TableQuery(tag => new MRefundsProtect(tag))
  
  /** Entity class storing rows of table MRefundsReturn
   *  @param mRefundsReturnId Database column m_refunds_return_ID DBType(INT), AutoInc, PrimaryKey
   *  @param mRefundsReturnNo Database column m_refunds_return_NO DBType(VARCHAR), Length(25,true)
   *  @param mRefundsReturnLogisno Database column m_refunds_return_LogisNO DBType(VARCHAR), Length(25,true)
   *  @param mRefundsReturnCustomerid Database column m_refunds_return_CustomerId DBType(INT)
   *  @param mRefundsReturnDetailid Database column m_refunds_return_DetailId DBType(INT)
   *  @param mRefundsReturnReturnaddr Database column m_refunds_return_ReturnAddr DBType(BLOB)
   *  @param mRefundsReturnValidate Database column m_refunds_return_Validate DBType(SMALLINT), Default(1)
   *  @param mRefundsReturnHasprintinvoice Database column m_refunds_return_HasPrintInvoice DBType(SMALLINT), Default(0)
   *  @param mRefundsReturnHaslogistics Database column m_refunds_return_HasLogistics DBType(SMALLINT), Default(0)
   *  @param mRefundsReturnAddtime Database column m_refunds_return_AddTime DBType(DATETIME)
   *  @param mRefundsReturnOperatetime Database column m_refunds_return_OperateTime DBType(DATETIME) */
  case class MRefundsReturnRow(mRefundsReturnId: Int, mRefundsReturnNo: String, mRefundsReturnLogisno: String, mRefundsReturnCustomerid: Int, mRefundsReturnDetailid: Int, mRefundsReturnReturnaddr: java.sql.Blob, mRefundsReturnValidate: Short = 1, mRefundsReturnHasprintinvoice: Short = 0, mRefundsReturnHaslogistics: Short = 0, mRefundsReturnAddtime: java.sql.Timestamp, mRefundsReturnOperatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MRefundsReturnRow objects using plain SQL queries */
  implicit def GetResultMRefundsReturnRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Blob], e3: GR[Short], e4: GR[java.sql.Timestamp]): GR[MRefundsReturnRow] = GR{
    prs => import prs._
    MRefundsReturnRow.tupled((<<[Int], <<[String], <<[String], <<[Int], <<[Int], <<[java.sql.Blob], <<[Short], <<[Short], <<[Short], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_refunds_return. Objects of this class serve as prototypes for rows in queries. */
  class MRefundsReturn(_tableTag: Tag) extends Table[MRefundsReturnRow](_tableTag, "m_refunds_return") {
    def * = (mRefundsReturnId, mRefundsReturnNo, mRefundsReturnLogisno, mRefundsReturnCustomerid, mRefundsReturnDetailid, mRefundsReturnReturnaddr, mRefundsReturnValidate, mRefundsReturnHasprintinvoice, mRefundsReturnHaslogistics, mRefundsReturnAddtime, mRefundsReturnOperatetime) <> (MRefundsReturnRow.tupled, MRefundsReturnRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRefundsReturnId.?, mRefundsReturnNo.?, mRefundsReturnLogisno.?, mRefundsReturnCustomerid.?, mRefundsReturnDetailid.?, mRefundsReturnReturnaddr.?, mRefundsReturnValidate.?, mRefundsReturnHasprintinvoice.?, mRefundsReturnHaslogistics.?, mRefundsReturnAddtime.?, mRefundsReturnOperatetime.?).shaped.<>({r=>import r._; _1.map(_=> MRefundsReturnRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_refunds_return_ID DBType(INT), AutoInc, PrimaryKey */
    val mRefundsReturnId: Column[Int] = column[Int]("m_refunds_return_ID", O.AutoInc, O.PrimaryKey)
    /** Database column m_refunds_return_NO DBType(VARCHAR), Length(25,true) */
    val mRefundsReturnNo: Column[String] = column[String]("m_refunds_return_NO", O.Length(25,varying=true))
    /** Database column m_refunds_return_LogisNO DBType(VARCHAR), Length(25,true) */
    val mRefundsReturnLogisno: Column[String] = column[String]("m_refunds_return_LogisNO", O.Length(25,varying=true))
    /** Database column m_refunds_return_CustomerId DBType(INT) */
    val mRefundsReturnCustomerid: Column[Int] = column[Int]("m_refunds_return_CustomerId")
    /** Database column m_refunds_return_DetailId DBType(INT) */
    val mRefundsReturnDetailid: Column[Int] = column[Int]("m_refunds_return_DetailId")
    /** Database column m_refunds_return_ReturnAddr DBType(BLOB) */
    val mRefundsReturnReturnaddr: Column[java.sql.Blob] = column[java.sql.Blob]("m_refunds_return_ReturnAddr")
    /** Database column m_refunds_return_Validate DBType(SMALLINT), Default(1) */
    val mRefundsReturnValidate: Column[Short] = column[Short]("m_refunds_return_Validate", O.Default(1))
    /** Database column m_refunds_return_HasPrintInvoice DBType(SMALLINT), Default(0) */
    val mRefundsReturnHasprintinvoice: Column[Short] = column[Short]("m_refunds_return_HasPrintInvoice", O.Default(0))
    /** Database column m_refunds_return_HasLogistics DBType(SMALLINT), Default(0) */
    val mRefundsReturnHaslogistics: Column[Short] = column[Short]("m_refunds_return_HasLogistics", O.Default(0))
    /** Database column m_refunds_return_AddTime DBType(DATETIME) */
    val mRefundsReturnAddtime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_refunds_return_AddTime")
    /** Database column m_refunds_return_OperateTime DBType(DATETIME) */
    val mRefundsReturnOperatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_refunds_return_OperateTime")
    
    /** Uniqueness Index over (mRefundsReturnNo,mRefundsReturnLogisno,mRefundsReturnDetailid) (database name m_refunds_return_NO) */
    val index1 = index("m_refunds_return_NO", (mRefundsReturnNo, mRefundsReturnLogisno, mRefundsReturnDetailid), unique=true)
  }
  /** Collection-like TableQuery object for table MRefundsReturn */
  lazy val MRefundsReturn = new TableQuery(tag => new MRefundsReturn(tag))
  
  /** Entity class storing rows of table MRegionArea
   *  @param mRegionAreaId Database column m_region_area_id DBType(INT), AutoInc, PrimaryKey
   *  @param mRegionAreaAreaid Database column m_region_area_areaid DBType(INT)
   *  @param mRegionAreaName Database column m_region_area_name DBType(VARCHAR), Length(20,true)
   *  @param mRegionAreaFatherid Database column m_region_area_fatherid DBType(INT) */
  case class MRegionAreaRow(mRegionAreaId: Int, mRegionAreaAreaid: Int, mRegionAreaName: String, mRegionAreaFatherid: Int)
  /** GetResult implicit for fetching MRegionAreaRow objects using plain SQL queries */
  implicit def GetResultMRegionAreaRow(implicit e0: GR[Int], e1: GR[String]): GR[MRegionAreaRow] = GR{
    prs => import prs._
    MRegionAreaRow.tupled((<<[Int], <<[Int], <<[String], <<[Int]))
  }
  /** Table description of table m_region_area. Objects of this class serve as prototypes for rows in queries. */
  class MRegionArea(_tableTag: Tag) extends Table[MRegionAreaRow](_tableTag, "m_region_area") {
    def * = (mRegionAreaId, mRegionAreaAreaid, mRegionAreaName, mRegionAreaFatherid) <> (MRegionAreaRow.tupled, MRegionAreaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRegionAreaId.?, mRegionAreaAreaid.?, mRegionAreaName.?, mRegionAreaFatherid.?).shaped.<>({r=>import r._; _1.map(_=> MRegionAreaRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_region_area_id DBType(INT), AutoInc, PrimaryKey */
    val mRegionAreaId: Column[Int] = column[Int]("m_region_area_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_region_area_areaid DBType(INT) */
    val mRegionAreaAreaid: Column[Int] = column[Int]("m_region_area_areaid")
    /** Database column m_region_area_name DBType(VARCHAR), Length(20,true) */
    val mRegionAreaName: Column[String] = column[String]("m_region_area_name", O.Length(20,varying=true))
    /** Database column m_region_area_fatherid DBType(INT) */
    val mRegionAreaFatherid: Column[Int] = column[Int]("m_region_area_fatherid")
  }
  /** Collection-like TableQuery object for table MRegionArea */
  lazy val MRegionArea = new TableQuery(tag => new MRegionArea(tag))
  
  /** Entity class storing rows of table MRegionCity
   *  @param mRegionCityId Database column m_region_city_id DBType(INT), AutoInc, PrimaryKey
   *  @param mRegionCityCityid Database column m_region_city_cityid DBType(INT)
   *  @param mRegionCityName Database column m_region_city_name DBType(VARCHAR), Length(20,true)
   *  @param mRegionCityFatherid Database column m_region_city_fatherid DBType(INT) */
  case class MRegionCityRow(mRegionCityId: Int, mRegionCityCityid: Int, mRegionCityName: String, mRegionCityFatherid: Int)
  /** GetResult implicit for fetching MRegionCityRow objects using plain SQL queries */
  implicit def GetResultMRegionCityRow(implicit e0: GR[Int], e1: GR[String]): GR[MRegionCityRow] = GR{
    prs => import prs._
    MRegionCityRow.tupled((<<[Int], <<[Int], <<[String], <<[Int]))
  }
  /** Table description of table m_region_city. Objects of this class serve as prototypes for rows in queries. */
  class MRegionCity(_tableTag: Tag) extends Table[MRegionCityRow](_tableTag, "m_region_city") {
    def * = (mRegionCityId, mRegionCityCityid, mRegionCityName, mRegionCityFatherid) <> (MRegionCityRow.tupled, MRegionCityRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRegionCityId.?, mRegionCityCityid.?, mRegionCityName.?, mRegionCityFatherid.?).shaped.<>({r=>import r._; _1.map(_=> MRegionCityRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_region_city_id DBType(INT), AutoInc, PrimaryKey */
    val mRegionCityId: Column[Int] = column[Int]("m_region_city_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_region_city_cityid DBType(INT) */
    val mRegionCityCityid: Column[Int] = column[Int]("m_region_city_cityid")
    /** Database column m_region_city_name DBType(VARCHAR), Length(20,true) */
    val mRegionCityName: Column[String] = column[String]("m_region_city_name", O.Length(20,varying=true))
    /** Database column m_region_city_fatherid DBType(INT) */
    val mRegionCityFatherid: Column[Int] = column[Int]("m_region_city_fatherid")
  }
  /** Collection-like TableQuery object for table MRegionCity */
  lazy val MRegionCity = new TableQuery(tag => new MRegionCity(tag))
  
  /** Entity class storing rows of table MRegionProvince
   *  @param mRegionProvinceId Database column m_region_province_id DBType(INT), AutoInc, PrimaryKey
   *  @param mRegionProvinceProvinceid Database column m_region_province_provinceid DBType(INT)
   *  @param mRegionProvinceName Database column m_region_province_name DBType(VARCHAR), Length(20,true) */
  case class MRegionProvinceRow(mRegionProvinceId: Int, mRegionProvinceProvinceid: Int, mRegionProvinceName: String)
  /** GetResult implicit for fetching MRegionProvinceRow objects using plain SQL queries */
  implicit def GetResultMRegionProvinceRow(implicit e0: GR[Int], e1: GR[String]): GR[MRegionProvinceRow] = GR{
    prs => import prs._
    MRegionProvinceRow.tupled((<<[Int], <<[Int], <<[String]))
  }
  /** Table description of table m_region_province. Objects of this class serve as prototypes for rows in queries. */
  class MRegionProvince(_tableTag: Tag) extends Table[MRegionProvinceRow](_tableTag, "m_region_province") {
    def * = (mRegionProvinceId, mRegionProvinceProvinceid, mRegionProvinceName) <> (MRegionProvinceRow.tupled, MRegionProvinceRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRegionProvinceId.?, mRegionProvinceProvinceid.?, mRegionProvinceName.?).shaped.<>({r=>import r._; _1.map(_=> MRegionProvinceRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_region_province_id DBType(INT), AutoInc, PrimaryKey */
    val mRegionProvinceId: Column[Int] = column[Int]("m_region_province_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_region_province_provinceid DBType(INT) */
    val mRegionProvinceProvinceid: Column[Int] = column[Int]("m_region_province_provinceid")
    /** Database column m_region_province_name DBType(VARCHAR), Length(20,true) */
    val mRegionProvinceName: Column[String] = column[String]("m_region_province_name", O.Length(20,varying=true))
  }
  /** Collection-like TableQuery object for table MRegionProvince */
  lazy val MRegionProvince = new TableQuery(tag => new MRegionProvince(tag))
  
  /** Entity class storing rows of table MReminder
   *  @param mReminderId Database column m_reminder_id DBType(INT), AutoInc, PrimaryKey
   *  @param mReminderMCustomerId Database column m_reminder_m_customer_id DBType(INT)
   *  @param mReminderMd5 Database column m_reminder_md5 DBType(VARCHAR), Length(64,true)
   *  @param mReminderLimitDatetime Database column m_reminder_limit_datetime DBType(DATETIME)
   *  @param mReminderFlag Database column m_reminder_flag DBType(TINYINT)
   *  @param mReminderResult Database column m_reminder_result DBType(VARCHAR), Length(50,true)
   *  @param mReminderResultDatetime Database column m_reminder_result_datetime DBType(DATETIME) */
  case class MReminderRow(mReminderId: Int, mReminderMCustomerId: Int, mReminderMd5: String, mReminderLimitDatetime: java.sql.Timestamp, mReminderFlag: Byte, mReminderResult: String, mReminderResultDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MReminderRow objects using plain SQL queries */
  implicit def GetResultMReminderRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Byte]): GR[MReminderRow] = GR{
    prs => import prs._
    MReminderRow.tupled((<<[Int], <<[Int], <<[String], <<[java.sql.Timestamp], <<[Byte], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_reminder. Objects of this class serve as prototypes for rows in queries. */
  class MReminder(_tableTag: Tag) extends Table[MReminderRow](_tableTag, "m_reminder") {
    def * = (mReminderId, mReminderMCustomerId, mReminderMd5, mReminderLimitDatetime, mReminderFlag, mReminderResult, mReminderResultDatetime) <> (MReminderRow.tupled, MReminderRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mReminderId.?, mReminderMCustomerId.?, mReminderMd5.?, mReminderLimitDatetime.?, mReminderFlag.?, mReminderResult.?, mReminderResultDatetime.?).shaped.<>({r=>import r._; _1.map(_=> MReminderRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_reminder_id DBType(INT), AutoInc, PrimaryKey */
    val mReminderId: Column[Int] = column[Int]("m_reminder_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_reminder_m_customer_id DBType(INT) */
    val mReminderMCustomerId: Column[Int] = column[Int]("m_reminder_m_customer_id")
    /** Database column m_reminder_md5 DBType(VARCHAR), Length(64,true) */
    val mReminderMd5: Column[String] = column[String]("m_reminder_md5", O.Length(64,varying=true))
    /** Database column m_reminder_limit_datetime DBType(DATETIME) */
    val mReminderLimitDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_reminder_limit_datetime")
    /** Database column m_reminder_flag DBType(TINYINT) */
    val mReminderFlag: Column[Byte] = column[Byte]("m_reminder_flag")
    /** Database column m_reminder_result DBType(VARCHAR), Length(50,true) */
    val mReminderResult: Column[String] = column[String]("m_reminder_result", O.Length(50,varying=true))
    /** Database column m_reminder_result_datetime DBType(DATETIME) */
    val mReminderResultDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_reminder_result_datetime")
  }
  /** Collection-like TableQuery object for table MReminder */
  lazy val MReminder = new TableQuery(tag => new MReminder(tag))
  
  /** Entity class storing rows of table MReminderCash
   *  @param mReminderCashId Database column m_reminder_cash_id DBType(INT), AutoInc, PrimaryKey
   *  @param mReminderCashMMakerId Database column m_reminder_cash_m_maker_id DBType(INT)
   *  @param mReminderCashMd5 Database column m_reminder_cash_md5 DBType(VARCHAR), Length(64,true)
   *  @param mReminderCashLimitDatetime Database column m_reminder_cash_limit_datetime DBType(DATETIME)
   *  @param mReminderCashFlag Database column m_reminder_cash_flag DBType(TINYINT)
   *  @param mReminderCashResult Database column m_reminder_cash_result DBType(VARCHAR), Length(50,true)
   *  @param mReminderCashResultDatetime Database column m_reminder_cash_result_datetime DBType(DATETIME) */
  case class MReminderCashRow(mReminderCashId: Int, mReminderCashMMakerId: Int, mReminderCashMd5: String, mReminderCashLimitDatetime: java.sql.Timestamp, mReminderCashFlag: Byte, mReminderCashResult: String, mReminderCashResultDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MReminderCashRow objects using plain SQL queries */
  implicit def GetResultMReminderCashRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Byte]): GR[MReminderCashRow] = GR{
    prs => import prs._
    MReminderCashRow.tupled((<<[Int], <<[Int], <<[String], <<[java.sql.Timestamp], <<[Byte], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_reminder_cash. Objects of this class serve as prototypes for rows in queries. */
  class MReminderCash(_tableTag: Tag) extends Table[MReminderCashRow](_tableTag, "m_reminder_cash") {
    def * = (mReminderCashId, mReminderCashMMakerId, mReminderCashMd5, mReminderCashLimitDatetime, mReminderCashFlag, mReminderCashResult, mReminderCashResultDatetime) <> (MReminderCashRow.tupled, MReminderCashRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mReminderCashId.?, mReminderCashMMakerId.?, mReminderCashMd5.?, mReminderCashLimitDatetime.?, mReminderCashFlag.?, mReminderCashResult.?, mReminderCashResultDatetime.?).shaped.<>({r=>import r._; _1.map(_=> MReminderCashRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_reminder_cash_id DBType(INT), AutoInc, PrimaryKey */
    val mReminderCashId: Column[Int] = column[Int]("m_reminder_cash_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_reminder_cash_m_maker_id DBType(INT) */
    val mReminderCashMMakerId: Column[Int] = column[Int]("m_reminder_cash_m_maker_id")
    /** Database column m_reminder_cash_md5 DBType(VARCHAR), Length(64,true) */
    val mReminderCashMd5: Column[String] = column[String]("m_reminder_cash_md5", O.Length(64,varying=true))
    /** Database column m_reminder_cash_limit_datetime DBType(DATETIME) */
    val mReminderCashLimitDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_reminder_cash_limit_datetime")
    /** Database column m_reminder_cash_flag DBType(TINYINT) */
    val mReminderCashFlag: Column[Byte] = column[Byte]("m_reminder_cash_flag")
    /** Database column m_reminder_cash_result DBType(VARCHAR), Length(50,true) */
    val mReminderCashResult: Column[String] = column[String]("m_reminder_cash_result", O.Length(50,varying=true))
    /** Database column m_reminder_cash_result_datetime DBType(DATETIME) */
    val mReminderCashResultDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_reminder_cash_result_datetime")
  }
  /** Collection-like TableQuery object for table MReminderCash */
  lazy val MReminderCash = new TableQuery(tag => new MReminderCash(tag))
  
  /** Entity class storing rows of table MReminderMaker
   *  @param mReminderMakerId Database column m_reminder_maker_id DBType(INT), AutoInc, PrimaryKey
   *  @param mReminderMakerMMakerId Database column m_reminder_maker_m_maker_id DBType(INT)
   *  @param mReminderMakerMd5 Database column m_reminder_maker_md5 DBType(VARCHAR), Length(64,true)
   *  @param mReminderMakerLimitDatetime Database column m_reminder_maker_limit_datetime DBType(DATETIME)
   *  @param mReminderMakerFlag Database column m_reminder_maker_flag DBType(TINYINT)
   *  @param mReminderMakerResult Database column m_reminder_maker_result DBType(VARCHAR), Length(50,true)
   *  @param mReminderMakerResultDatetime Database column m_reminder_maker_result_datetime DBType(DATETIME) */
  case class MReminderMakerRow(mReminderMakerId: Int, mReminderMakerMMakerId: Int, mReminderMakerMd5: String, mReminderMakerLimitDatetime: java.sql.Timestamp, mReminderMakerFlag: Byte, mReminderMakerResult: String, mReminderMakerResultDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MReminderMakerRow objects using plain SQL queries */
  implicit def GetResultMReminderMakerRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Byte]): GR[MReminderMakerRow] = GR{
    prs => import prs._
    MReminderMakerRow.tupled((<<[Int], <<[Int], <<[String], <<[java.sql.Timestamp], <<[Byte], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_reminder_maker. Objects of this class serve as prototypes for rows in queries. */
  class MReminderMaker(_tableTag: Tag) extends Table[MReminderMakerRow](_tableTag, "m_reminder_maker") {
    def * = (mReminderMakerId, mReminderMakerMMakerId, mReminderMakerMd5, mReminderMakerLimitDatetime, mReminderMakerFlag, mReminderMakerResult, mReminderMakerResultDatetime) <> (MReminderMakerRow.tupled, MReminderMakerRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mReminderMakerId.?, mReminderMakerMMakerId.?, mReminderMakerMd5.?, mReminderMakerLimitDatetime.?, mReminderMakerFlag.?, mReminderMakerResult.?, mReminderMakerResultDatetime.?).shaped.<>({r=>import r._; _1.map(_=> MReminderMakerRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_reminder_maker_id DBType(INT), AutoInc, PrimaryKey */
    val mReminderMakerId: Column[Int] = column[Int]("m_reminder_maker_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_reminder_maker_m_maker_id DBType(INT) */
    val mReminderMakerMMakerId: Column[Int] = column[Int]("m_reminder_maker_m_maker_id")
    /** Database column m_reminder_maker_md5 DBType(VARCHAR), Length(64,true) */
    val mReminderMakerMd5: Column[String] = column[String]("m_reminder_maker_md5", O.Length(64,varying=true))
    /** Database column m_reminder_maker_limit_datetime DBType(DATETIME) */
    val mReminderMakerLimitDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_reminder_maker_limit_datetime")
    /** Database column m_reminder_maker_flag DBType(TINYINT) */
    val mReminderMakerFlag: Column[Byte] = column[Byte]("m_reminder_maker_flag")
    /** Database column m_reminder_maker_result DBType(VARCHAR), Length(50,true) */
    val mReminderMakerResult: Column[String] = column[String]("m_reminder_maker_result", O.Length(50,varying=true))
    /** Database column m_reminder_maker_result_datetime DBType(DATETIME) */
    val mReminderMakerResultDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_reminder_maker_result_datetime")
  }
  /** Collection-like TableQuery object for table MReminderMaker */
  lazy val MReminderMaker = new TableQuery(tag => new MReminderMaker(tag))
  
  /** Entity class storing rows of table MRequest
   *  @param mRequestId Database column m_request_id DBType(INT), AutoInc, PrimaryKey
   *  @param mRequestBody Database column m_request_body DBType(TEXT), Length(65535,true)
   *  @param mRequestDatetime Database column m_request_datetime DBType(DATETIME) */
  case class MRequestRow(mRequestId: Int, mRequestBody: String, mRequestDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MRequestRow objects using plain SQL queries */
  implicit def GetResultMRequestRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MRequestRow] = GR{
    prs => import prs._
    MRequestRow.tupled((<<[Int], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_request. Objects of this class serve as prototypes for rows in queries. */
  class MRequest(_tableTag: Tag) extends Table[MRequestRow](_tableTag, "m_request") {
    def * = (mRequestId, mRequestBody, mRequestDatetime) <> (MRequestRow.tupled, MRequestRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mRequestId.?, mRequestBody.?, mRequestDatetime.?).shaped.<>({r=>import r._; _1.map(_=> MRequestRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_request_id DBType(INT), AutoInc, PrimaryKey */
    val mRequestId: Column[Int] = column[Int]("m_request_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_request_body DBType(TEXT), Length(65535,true) */
    val mRequestBody: Column[String] = column[String]("m_request_body", O.Length(65535,varying=true))
    /** Database column m_request_datetime DBType(DATETIME) */
    val mRequestDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_request_datetime")
  }
  /** Collection-like TableQuery object for table MRequest */
  lazy val MRequest = new TableQuery(tag => new MRequest(tag))
  
  /** Entity class storing rows of table MSalesActivity
   *  @param mSalesActivityId Database column m_sales_activity_id DBType(INT), AutoInc, PrimaryKey
   *  @param mSalesActivityGroupid Database column m_sales_activity_groupId DBType(INT)
   *  @param mSalesActivityKey Database column m_sales_activity_key DBType(VARCHAR), Length(45,true)
   *  @param mSalesActivityValue Database column m_sales_activity_value DBType(VARCHAR), Length(45,true)
   *  @param mSalesActivityDescription Database column m_sales_activity_description DBType(VARCHAR), Length(225,true)
   *  @param mSalesActivityConditions Database column m_sales_activity_conditions DBType(BLOB)
   *  @param mSalesActivityOrder Database column m_sales_activity_order DBType(INT), Default(0)
   *  @param mSalesActivityEnabled Database column m_sales_activity_enabled DBType(INT), Default(Some(1))
   *  @param mSalesActivityStarttime Database column m_sales_activity_startTime DBType(DATE), Default(None)
   *  @param mSalesActivityEndtime Database column m_sales_activity_endTime DBType(DATE), Default(None) */
  case class MSalesActivityRow(mSalesActivityId: Int, mSalesActivityGroupid: Int, mSalesActivityKey: String, mSalesActivityValue: String, mSalesActivityDescription: String, mSalesActivityConditions: java.sql.Blob, mSalesActivityOrder: Int = 0, mSalesActivityEnabled: Option[Int] = Some(1), mSalesActivityStarttime: Option[java.sql.Date] = None, mSalesActivityEndtime: Option[java.sql.Date] = None)
  /** GetResult implicit for fetching MSalesActivityRow objects using plain SQL queries */
  implicit def GetResultMSalesActivityRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Blob], e3: GR[Option[Int]], e4: GR[Option[java.sql.Date]]): GR[MSalesActivityRow] = GR{
    prs => import prs._
    MSalesActivityRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[String], <<[java.sql.Blob], <<[Int], <<?[Int], <<?[java.sql.Date], <<?[java.sql.Date]))
  }
  /** Table description of table m_sales_activity. Objects of this class serve as prototypes for rows in queries. */
  class MSalesActivity(_tableTag: Tag) extends Table[MSalesActivityRow](_tableTag, "m_sales_activity") {
    def * = (mSalesActivityId, mSalesActivityGroupid, mSalesActivityKey, mSalesActivityValue, mSalesActivityDescription, mSalesActivityConditions, mSalesActivityOrder, mSalesActivityEnabled, mSalesActivityStarttime, mSalesActivityEndtime) <> (MSalesActivityRow.tupled, MSalesActivityRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mSalesActivityId.?, mSalesActivityGroupid.?, mSalesActivityKey.?, mSalesActivityValue.?, mSalesActivityDescription.?, mSalesActivityConditions.?, mSalesActivityOrder.?, mSalesActivityEnabled, mSalesActivityStarttime, mSalesActivityEndtime).shaped.<>({r=>import r._; _1.map(_=> MSalesActivityRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_sales_activity_id DBType(INT), AutoInc, PrimaryKey */
    val mSalesActivityId: Column[Int] = column[Int]("m_sales_activity_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_sales_activity_groupId DBType(INT) */
    val mSalesActivityGroupid: Column[Int] = column[Int]("m_sales_activity_groupId")
    /** Database column m_sales_activity_key DBType(VARCHAR), Length(45,true) */
    val mSalesActivityKey: Column[String] = column[String]("m_sales_activity_key", O.Length(45,varying=true))
    /** Database column m_sales_activity_value DBType(VARCHAR), Length(45,true) */
    val mSalesActivityValue: Column[String] = column[String]("m_sales_activity_value", O.Length(45,varying=true))
    /** Database column m_sales_activity_description DBType(VARCHAR), Length(225,true) */
    val mSalesActivityDescription: Column[String] = column[String]("m_sales_activity_description", O.Length(225,varying=true))
    /** Database column m_sales_activity_conditions DBType(BLOB) */
    val mSalesActivityConditions: Column[java.sql.Blob] = column[java.sql.Blob]("m_sales_activity_conditions")
    /** Database column m_sales_activity_order DBType(INT), Default(0) */
    val mSalesActivityOrder: Column[Int] = column[Int]("m_sales_activity_order", O.Default(0))
    /** Database column m_sales_activity_enabled DBType(INT), Default(Some(1)) */
    val mSalesActivityEnabled: Column[Option[Int]] = column[Option[Int]]("m_sales_activity_enabled", O.Default(Some(1)))
    /** Database column m_sales_activity_startTime DBType(DATE), Default(None) */
    val mSalesActivityStarttime: Column[Option[java.sql.Date]] = column[Option[java.sql.Date]]("m_sales_activity_startTime", O.Default(None))
    /** Database column m_sales_activity_endTime DBType(DATE), Default(None) */
    val mSalesActivityEndtime: Column[Option[java.sql.Date]] = column[Option[java.sql.Date]]("m_sales_activity_endTime", O.Default(None))
  }
  /** Collection-like TableQuery object for table MSalesActivity */
  lazy val MSalesActivity = new TableQuery(tag => new MSalesActivity(tag))
  
  /** Entity class storing rows of table MService
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param serviceName Database column service_name DBType(VARCHAR), Length(50,true)
   *  @param serviceDescript Database column service_descript DBType(VARCHAR), Length(255,true)
   *  @param pid Database column pid DBType(INT)
   *  @param hasTry Database column has_try DBType(BIT)
   *  @param tryDate Database column try_date DBType(INT)
   *  @param `type` Database column type DBType(BIT) */
  case class MServiceRow(id: Int, serviceName: String, serviceDescript: String, pid: Int, hasTry: Boolean, tryDate: Int, `type`: Boolean)
  /** GetResult implicit for fetching MServiceRow objects using plain SQL queries */
  implicit def GetResultMServiceRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Boolean]): GR[MServiceRow] = GR{
    prs => import prs._
    MServiceRow.tupled((<<[Int], <<[String], <<[String], <<[Int], <<[Boolean], <<[Int], <<[Boolean]))
  }
  /** Table description of table m_service. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class MService(_tableTag: Tag) extends Table[MServiceRow](_tableTag, "m_service") {
    def * = (id, serviceName, serviceDescript, pid, hasTry, tryDate, `type`) <> (MServiceRow.tupled, MServiceRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, serviceName.?, serviceDescript.?, pid.?, hasTry.?, tryDate.?, `type`.?).shaped.<>({r=>import r._; _1.map(_=> MServiceRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column service_name DBType(VARCHAR), Length(50,true) */
    val serviceName: Column[String] = column[String]("service_name", O.Length(50,varying=true))
    /** Database column service_descript DBType(VARCHAR), Length(255,true) */
    val serviceDescript: Column[String] = column[String]("service_descript", O.Length(255,varying=true))
    /** Database column pid DBType(INT) */
    val pid: Column[Int] = column[Int]("pid")
    /** Database column has_try DBType(BIT) */
    val hasTry: Column[Boolean] = column[Boolean]("has_try")
    /** Database column try_date DBType(INT) */
    val tryDate: Column[Int] = column[Int]("try_date")
    /** Database column type DBType(BIT)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Column[Boolean] = column[Boolean]("type")
  }
  /** Collection-like TableQuery object for table MService */
  lazy val MService = new TableQuery(tag => new MService(tag))
  
  /** Entity class storing rows of table MServicePrice
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param serviceId Database column service_id DBType(INT)
   *  @param priceName Database column price_name DBType(VARCHAR), Length(255,true)
   *  @param price Database column price DBType(FLOAT)
   *  @param limitDate Database column limit_date DBType(INT)
   *  @param limitType Database column limit_type DBType(BIT)
   *  @param itemIndex Database column item_index DBType(INT) */
  case class MServicePriceRow(id: Int, serviceId: Int, priceName: String, price: Float, limitDate: Int, limitType: Boolean, itemIndex: Int)
  /** GetResult implicit for fetching MServicePriceRow objects using plain SQL queries */
  implicit def GetResultMServicePriceRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Float], e3: GR[Boolean]): GR[MServicePriceRow] = GR{
    prs => import prs._
    MServicePriceRow.tupled((<<[Int], <<[Int], <<[String], <<[Float], <<[Int], <<[Boolean], <<[Int]))
  }
  /** Table description of table m_service_price. Objects of this class serve as prototypes for rows in queries. */
  class MServicePrice(_tableTag: Tag) extends Table[MServicePriceRow](_tableTag, "m_service_price") {
    def * = (id, serviceId, priceName, price, limitDate, limitType, itemIndex) <> (MServicePriceRow.tupled, MServicePriceRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, serviceId.?, priceName.?, price.?, limitDate.?, limitType.?, itemIndex.?).shaped.<>({r=>import r._; _1.map(_=> MServicePriceRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column service_id DBType(INT) */
    val serviceId: Column[Int] = column[Int]("service_id")
    /** Database column price_name DBType(VARCHAR), Length(255,true) */
    val priceName: Column[String] = column[String]("price_name", O.Length(255,varying=true))
    /** Database column price DBType(FLOAT) */
    val price: Column[Float] = column[Float]("price")
    /** Database column limit_date DBType(INT) */
    val limitDate: Column[Int] = column[Int]("limit_date")
    /** Database column limit_type DBType(BIT) */
    val limitType: Column[Boolean] = column[Boolean]("limit_type")
    /** Database column item_index DBType(INT) */
    val itemIndex: Column[Int] = column[Int]("item_index")
  }
  /** Collection-like TableQuery object for table MServicePrice */
  lazy val MServicePrice = new TableQuery(tag => new MServicePrice(tag))
  
  /** Entity class storing rows of table MShopMixSetting
   *  @param mShopMixSettingId Database column m_shop_mix_setting_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mShopMixSettingMMakerId Database column m_shop_mix_setting_m_maker_id DBType(INT UNSIGNED), Default(0)
   *  @param mShopMixSettingQty Database column m_shop_mix_setting_qty DBType(INT UNSIGNED), Default(0)
   *  @param mShopMixSettingRate Database column m_shop_mix_setting_rate DBType(TINYINT UNSIGNED), Default(0)
   *  @param mShopMixSettingType Database column m_shop_mix_setting_type DBType(TINYINT UNSIGNED), Default(0)
   *  @param mShopMixSettingState Database column m_shop_mix_setting_state DBType(TINYINT UNSIGNED), Default(1) */
  case class MShopMixSettingRow(mShopMixSettingId: Int, mShopMixSettingMMakerId: Int = 0, mShopMixSettingQty: Int = 0, mShopMixSettingRate: Byte = 0, mShopMixSettingType: Byte = 0, mShopMixSettingState: Byte = 1)
  /** GetResult implicit for fetching MShopMixSettingRow objects using plain SQL queries */
  implicit def GetResultMShopMixSettingRow(implicit e0: GR[Int], e1: GR[Byte]): GR[MShopMixSettingRow] = GR{
    prs => import prs._
    MShopMixSettingRow.tupled((<<[Int], <<[Int], <<[Int], <<[Byte], <<[Byte], <<[Byte]))
  }
  /** Table description of table m_shop_mix_setting. Objects of this class serve as prototypes for rows in queries. */
  class MShopMixSetting(_tableTag: Tag) extends Table[MShopMixSettingRow](_tableTag, "m_shop_mix_setting") {
    def * = (mShopMixSettingId, mShopMixSettingMMakerId, mShopMixSettingQty, mShopMixSettingRate, mShopMixSettingType, mShopMixSettingState) <> (MShopMixSettingRow.tupled, MShopMixSettingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mShopMixSettingId.?, mShopMixSettingMMakerId.?, mShopMixSettingQty.?, mShopMixSettingRate.?, mShopMixSettingType.?, mShopMixSettingState.?).shaped.<>({r=>import r._; _1.map(_=> MShopMixSettingRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_shop_mix_setting_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mShopMixSettingId: Column[Int] = column[Int]("m_shop_mix_setting_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_shop_mix_setting_m_maker_id DBType(INT UNSIGNED), Default(0) */
    val mShopMixSettingMMakerId: Column[Int] = column[Int]("m_shop_mix_setting_m_maker_id", O.Default(0))
    /** Database column m_shop_mix_setting_qty DBType(INT UNSIGNED), Default(0) */
    val mShopMixSettingQty: Column[Int] = column[Int]("m_shop_mix_setting_qty", O.Default(0))
    /** Database column m_shop_mix_setting_rate DBType(TINYINT UNSIGNED), Default(0) */
    val mShopMixSettingRate: Column[Byte] = column[Byte]("m_shop_mix_setting_rate", O.Default(0))
    /** Database column m_shop_mix_setting_type DBType(TINYINT UNSIGNED), Default(0) */
    val mShopMixSettingType: Column[Byte] = column[Byte]("m_shop_mix_setting_type", O.Default(0))
    /** Database column m_shop_mix_setting_state DBType(TINYINT UNSIGNED), Default(1) */
    val mShopMixSettingState: Column[Byte] = column[Byte]("m_shop_mix_setting_state", O.Default(1))
    
    /** Index over (mShopMixSettingMMakerId) (database name idx_m_shop_mix_setting_2) */
    val index1 = index("idx_m_shop_mix_setting_2", mShopMixSettingMMakerId)
  }
  /** Collection-like TableQuery object for table MShopMixSetting */
  lazy val MShopMixSetting = new TableQuery(tag => new MShopMixSetting(tag))
  
  /** Row type of table MSku */
  type MSkuRow = HCons[Int,HCons[Int,HCons[Byte,HCons[Byte,HCons[java.sql.Date,HCons[Int,HCons[String,HCons[Int,HCons[String,HCons[String,HCons[Int,HCons[scala.math.BigDecimal,HCons[scala.math.BigDecimal,HCons[scala.math.BigDecimal,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[java.sql.Timestamp,HCons[Int,HCons[Int,HCons[java.sql.Timestamp,HNil]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for MSkuRow providing default values if available in the database schema. */
  def MSkuRow(mSkuId: Int, mSkuVoidFlag: Int, mSkuSoldoutFlg: Byte, mSkuDiscontinuedFlg: Byte, mSkuArrivalDate: java.sql.Date, mSkuMItemId: Int, mSkuCode: String, mSkuStock: Int, mSkuColor: String, mSkuSize: String, mSkuWeight: Int, mSkuPriceUsd: scala.math.BigDecimal, mSkuPrice: scala.math.BigDecimal, mSkuCost: scala.math.BigDecimal, mSkuBoxwidth: Int, mSkuBoxheight: Int, mSkuBoxdepth: Int, mSkuTmpweight: Int, mSkuOrder: Int, mSkuRuser: Int, mSkuRdatetime: java.sql.Timestamp, mSkuUuser: Int, mSkuNum: Int = 0, mSkuUdatetime: java.sql.Timestamp): MSkuRow = {
    mSkuId :: mSkuVoidFlag :: mSkuSoldoutFlg :: mSkuDiscontinuedFlg :: mSkuArrivalDate :: mSkuMItemId :: mSkuCode :: mSkuStock :: mSkuColor :: mSkuSize :: mSkuWeight :: mSkuPriceUsd :: mSkuPrice :: mSkuCost :: mSkuBoxwidth :: mSkuBoxheight :: mSkuBoxdepth :: mSkuTmpweight :: mSkuOrder :: mSkuRuser :: mSkuRdatetime :: mSkuUuser :: mSkuNum :: mSkuUdatetime :: HNil
  }
  /** GetResult implicit for fetching MSkuRow objects using plain SQL queries */
  implicit def GetResultMSkuRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[java.sql.Date], e3: GR[String], e4: GR[scala.math.BigDecimal], e5: GR[java.sql.Timestamp]): GR[MSkuRow] = GR{
    prs => import prs._
    <<[Int] :: <<[Int] :: <<[Byte] :: <<[Byte] :: <<[java.sql.Date] :: <<[Int] :: <<[String] :: <<[Int] :: <<[String] :: <<[String] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[scala.math.BigDecimal] :: <<[scala.math.BigDecimal] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[java.sql.Timestamp] :: <<[Int] :: <<[Int] :: <<[java.sql.Timestamp] :: HNil
  }
  /** Table description of table m_sku. Objects of this class serve as prototypes for rows in queries. */
  class MSku(_tableTag: Tag) extends Table[MSkuRow](_tableTag, "m_sku") {
    def * = mSkuId :: mSkuVoidFlag :: mSkuSoldoutFlg :: mSkuDiscontinuedFlg :: mSkuArrivalDate :: mSkuMItemId :: mSkuCode :: mSkuStock :: mSkuColor :: mSkuSize :: mSkuWeight :: mSkuPriceUsd :: mSkuPrice :: mSkuCost :: mSkuBoxwidth :: mSkuBoxheight :: mSkuBoxdepth :: mSkuTmpweight :: mSkuOrder :: mSkuRuser :: mSkuRdatetime :: mSkuUuser :: mSkuNum :: mSkuUdatetime :: HNil
    
    /** Database column m_sku_id DBType(INT), AutoInc, PrimaryKey */
    val mSkuId: Column[Int] = column[Int]("m_sku_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_sku_void_flag DBType(INT) */
    val mSkuVoidFlag: Column[Int] = column[Int]("m_sku_void_flag")
    /** Database column m_sku_soldout_flg DBType(TINYINT) */
    val mSkuSoldoutFlg: Column[Byte] = column[Byte]("m_sku_soldout_flg")
    /** Database column m_sku_discontinued_flg DBType(TINYINT) */
    val mSkuDiscontinuedFlg: Column[Byte] = column[Byte]("m_sku_discontinued_flg")
    /** Database column m_sku_arrival_date DBType(DATE) */
    val mSkuArrivalDate: Column[java.sql.Date] = column[java.sql.Date]("m_sku_arrival_date")
    /** Database column m_sku_m_item_id DBType(INT) */
    val mSkuMItemId: Column[Int] = column[Int]("m_sku_m_item_id")
    /** Database column m_sku_code DBType(VARCHAR), Length(50,true) */
    val mSkuCode: Column[String] = column[String]("m_sku_code", O.Length(50,varying=true))
    /** Database column m_sku_stock DBType(INT) */
    val mSkuStock: Column[Int] = column[Int]("m_sku_stock")
    /** Database column m_sku_color DBType(VARCHAR), Length(20,true) */
    val mSkuColor: Column[String] = column[String]("m_sku_color", O.Length(20,varying=true))
    /** Database column m_sku_size DBType(VARCHAR), Length(20,true) */
    val mSkuSize: Column[String] = column[String]("m_sku_size", O.Length(20,varying=true))
    /** Database column m_sku_weight DBType(INT) */
    val mSkuWeight: Column[Int] = column[Int]("m_sku_weight")
    /** Database column m_sku_price_usd DBType(DECIMAL) */
    val mSkuPriceUsd: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_sku_price_usd")
    /** Database column m_sku_price DBType(DECIMAL) */
    val mSkuPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_sku_price")
    /** Database column m_sku_cost DBType(DECIMAL) */
    val mSkuCost: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_sku_cost")
    /** Database column m_sku_boxwidth DBType(INT) */
    val mSkuBoxwidth: Column[Int] = column[Int]("m_sku_boxwidth")
    /** Database column m_sku_boxheight DBType(INT) */
    val mSkuBoxheight: Column[Int] = column[Int]("m_sku_boxheight")
    /** Database column m_sku_boxdepth DBType(INT) */
    val mSkuBoxdepth: Column[Int] = column[Int]("m_sku_boxdepth")
    /** Database column m_sku_tmpweight DBType(INT) */
    val mSkuTmpweight: Column[Int] = column[Int]("m_sku_tmpweight")
    /** Database column m_sku_order DBType(INT) */
    val mSkuOrder: Column[Int] = column[Int]("m_sku_order")
    /** Database column m_sku_ruser DBType(INT) */
    val mSkuRuser: Column[Int] = column[Int]("m_sku_ruser")
    /** Database column m_sku_rdatetime DBType(DATETIME) */
    val mSkuRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_sku_rdatetime")
    /** Database column m_sku_uuser DBType(INT) */
    val mSkuUuser: Column[Int] = column[Int]("m_sku_uuser")
    /** Database column m_sku_num DBType(INT), Default(0) */
    val mSkuNum: Column[Int] = column[Int]("m_sku_num", O.Default(0))
    /** Database column m_sku_udatetime DBType(DATETIME) */
    val mSkuUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_sku_udatetime")
    
    /** Index over (mSkuMItemId) (database name m_sku_m_item_id) */
    val index1 = index("m_sku_m_item_id", mSkuMItemId :: HNil)
  }
  /** Collection-like TableQuery object for table MSku */
  lazy val MSku = new TableQuery(tag => new MSku(tag))
  
  /** Entity class storing rows of table MSpaceFolder
   *  @param mSpaceFolderId Database column m_space_folder_id DBType(INT), AutoInc, PrimaryKey
   *  @param mSpaceFolderName Database column m_space_folder_name DBType(VARCHAR), Length(20,true)
   *  @param mSpaceFolderMMakerId Database column m_space_folder_m_maker_id DBType(INT)
   *  @param mSpaceFolderRdatetime Database column m_space_folder_rdatetime DBType(DATETIME)
   *  @param mSpaceFolderUdatetime Database column m_space_folder_udatetime DBType(DATETIME) */
  case class MSpaceFolderRow(mSpaceFolderId: Int, mSpaceFolderName: String, mSpaceFolderMMakerId: Int, mSpaceFolderRdatetime: java.sql.Timestamp, mSpaceFolderUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MSpaceFolderRow objects using plain SQL queries */
  implicit def GetResultMSpaceFolderRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MSpaceFolderRow] = GR{
    prs => import prs._
    MSpaceFolderRow.tupled((<<[Int], <<[String], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_space_folder. Objects of this class serve as prototypes for rows in queries. */
  class MSpaceFolder(_tableTag: Tag) extends Table[MSpaceFolderRow](_tableTag, "m_space_folder") {
    def * = (mSpaceFolderId, mSpaceFolderName, mSpaceFolderMMakerId, mSpaceFolderRdatetime, mSpaceFolderUdatetime) <> (MSpaceFolderRow.tupled, MSpaceFolderRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mSpaceFolderId.?, mSpaceFolderName.?, mSpaceFolderMMakerId.?, mSpaceFolderRdatetime.?, mSpaceFolderUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MSpaceFolderRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_space_folder_id DBType(INT), AutoInc, PrimaryKey */
    val mSpaceFolderId: Column[Int] = column[Int]("m_space_folder_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_space_folder_name DBType(VARCHAR), Length(20,true) */
    val mSpaceFolderName: Column[String] = column[String]("m_space_folder_name", O.Length(20,varying=true))
    /** Database column m_space_folder_m_maker_id DBType(INT) */
    val mSpaceFolderMMakerId: Column[Int] = column[Int]("m_space_folder_m_maker_id")
    /** Database column m_space_folder_rdatetime DBType(DATETIME) */
    val mSpaceFolderRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_space_folder_rdatetime")
    /** Database column m_space_folder_udatetime DBType(DATETIME) */
    val mSpaceFolderUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_space_folder_udatetime")
    
    /** Index over (mSpaceFolderMMakerId) (database name m_space_folder_m_maker_id) */
    val index1 = index("m_space_folder_m_maker_id", mSpaceFolderMMakerId)
  }
  /** Collection-like TableQuery object for table MSpaceFolder */
  lazy val MSpaceFolder = new TableQuery(tag => new MSpaceFolder(tag))
  
  /** Entity class storing rows of table MSpaceImage
   *  @param mSpaceImageId Database column m_space_image_id DBType(INT), AutoInc, PrimaryKey
   *  @param mSpaceImageMSpaceFolderId Database column m_space_image_m_space_folder_id DBType(INT)
   *  @param mSpaceImageMMakerId Database column m_space_image_m_maker_id DBType(INT)
   *  @param mSpaceImageName Database column m_space_image_name DBType(VARCHAR), Length(220,true)
   *  @param mSpaceImageHost Database column m_space_image_host DBType(VARCHAR), Length(220,true), Default()
   *  @param mSpaceImageUri Database column m_space_image_uri DBType(VARCHAR), Length(220,true)
   *  @param mSpaceImageSize Database column m_space_image_size DBType(INT)
   *  @param mSpaceImageStatus Database column m_space_image_status DBType(BIT), Default(true)
   *  @param mSpaceImageRdatetime Database column m_space_image_rdatetime DBType(DATETIME)
   *  @param mSpaceImageUdatetime Database column m_space_image_udatetime DBType(DATETIME) */
  case class MSpaceImageRow(mSpaceImageId: Int, mSpaceImageMSpaceFolderId: Int, mSpaceImageMMakerId: Int, mSpaceImageName: String, mSpaceImageHost: String = "", mSpaceImageUri: String, mSpaceImageSize: Int, mSpaceImageStatus: Boolean = true, mSpaceImageRdatetime: java.sql.Timestamp, mSpaceImageUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MSpaceImageRow objects using plain SQL queries */
  implicit def GetResultMSpaceImageRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Boolean], e3: GR[java.sql.Timestamp]): GR[MSpaceImageRow] = GR{
    prs => import prs._
    MSpaceImageRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[Int], <<[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_space_image. Objects of this class serve as prototypes for rows in queries. */
  class MSpaceImage(_tableTag: Tag) extends Table[MSpaceImageRow](_tableTag, "m_space_image") {
    def * = (mSpaceImageId, mSpaceImageMSpaceFolderId, mSpaceImageMMakerId, mSpaceImageName, mSpaceImageHost, mSpaceImageUri, mSpaceImageSize, mSpaceImageStatus, mSpaceImageRdatetime, mSpaceImageUdatetime) <> (MSpaceImageRow.tupled, MSpaceImageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mSpaceImageId.?, mSpaceImageMSpaceFolderId.?, mSpaceImageMMakerId.?, mSpaceImageName.?, mSpaceImageHost.?, mSpaceImageUri.?, mSpaceImageSize.?, mSpaceImageStatus.?, mSpaceImageRdatetime.?, mSpaceImageUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MSpaceImageRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_space_image_id DBType(INT), AutoInc, PrimaryKey */
    val mSpaceImageId: Column[Int] = column[Int]("m_space_image_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_space_image_m_space_folder_id DBType(INT) */
    val mSpaceImageMSpaceFolderId: Column[Int] = column[Int]("m_space_image_m_space_folder_id")
    /** Database column m_space_image_m_maker_id DBType(INT) */
    val mSpaceImageMMakerId: Column[Int] = column[Int]("m_space_image_m_maker_id")
    /** Database column m_space_image_name DBType(VARCHAR), Length(220,true) */
    val mSpaceImageName: Column[String] = column[String]("m_space_image_name", O.Length(220,varying=true))
    /** Database column m_space_image_host DBType(VARCHAR), Length(220,true), Default() */
    val mSpaceImageHost: Column[String] = column[String]("m_space_image_host", O.Length(220,varying=true), O.Default(""))
    /** Database column m_space_image_uri DBType(VARCHAR), Length(220,true) */
    val mSpaceImageUri: Column[String] = column[String]("m_space_image_uri", O.Length(220,varying=true))
    /** Database column m_space_image_size DBType(INT) */
    val mSpaceImageSize: Column[Int] = column[Int]("m_space_image_size")
    /** Database column m_space_image_status DBType(BIT), Default(true) */
    val mSpaceImageStatus: Column[Boolean] = column[Boolean]("m_space_image_status", O.Default(true))
    /** Database column m_space_image_rdatetime DBType(DATETIME) */
    val mSpaceImageRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_space_image_rdatetime")
    /** Database column m_space_image_udatetime DBType(DATETIME) */
    val mSpaceImageUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_space_image_udatetime")
    
    /** Index over (mSpaceImageMSpaceFolderId) (database name m_space_image_m_space_folder_id) */
    val index1 = index("m_space_image_m_space_folder_id", mSpaceImageMSpaceFolderId)
    /** Index over (mSpaceImageStatus) (database name m_space_image_status) */
    val index2 = index("m_space_image_status", mSpaceImageStatus)
  }
  /** Collection-like TableQuery object for table MSpaceImage */
  lazy val MSpaceImage = new TableQuery(tag => new MSpaceImage(tag))
  
  /** Entity class storing rows of table MSpActionDetail
   *  @param mSpActionDetailId Database column m_sp_action_detail_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mSpActionDetailRulesId Database column m_sp_action_detail_rules_id DBType(INT UNSIGNED), Default(0)
   *  @param mSpActionDetailStartTime Database column m_sp_action_detail_start_time DBType(DATETIME)
   *  @param mSpActionDetailQty Database column m_sp_action_detail_qty DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param mSpActionDetailLimited Database column m_sp_action_detail_limited DBType(TINYINT UNSIGNED), Default(0) */
  case class MSpActionDetailRow(mSpActionDetailId: Int, mSpActionDetailRulesId: Int = 0, mSpActionDetailStartTime: java.sql.Timestamp, mSpActionDetailQty: scala.math.BigDecimal = "0.00", mSpActionDetailLimited: Byte = 0)
  /** GetResult implicit for fetching MSpActionDetailRow objects using plain SQL queries */
  implicit def GetResultMSpActionDetailRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp], e2: GR[scala.math.BigDecimal], e3: GR[Byte]): GR[MSpActionDetailRow] = GR{
    prs => import prs._
    MSpActionDetailRow.tupled((<<[Int], <<[Int], <<[java.sql.Timestamp], <<[scala.math.BigDecimal], <<[Byte]))
  }
  /** Table description of table m_sp_action_detail. Objects of this class serve as prototypes for rows in queries. */
  class MSpActionDetail(_tableTag: Tag) extends Table[MSpActionDetailRow](_tableTag, "m_sp_action_detail") {
    def * = (mSpActionDetailId, mSpActionDetailRulesId, mSpActionDetailStartTime, mSpActionDetailQty, mSpActionDetailLimited) <> (MSpActionDetailRow.tupled, MSpActionDetailRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mSpActionDetailId.?, mSpActionDetailRulesId.?, mSpActionDetailStartTime.?, mSpActionDetailQty.?, mSpActionDetailLimited.?).shaped.<>({r=>import r._; _1.map(_=> MSpActionDetailRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_sp_action_detail_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mSpActionDetailId: Column[Int] = column[Int]("m_sp_action_detail_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_sp_action_detail_rules_id DBType(INT UNSIGNED), Default(0) */
    val mSpActionDetailRulesId: Column[Int] = column[Int]("m_sp_action_detail_rules_id", O.Default(0))
    /** Database column m_sp_action_detail_start_time DBType(DATETIME) */
    val mSpActionDetailStartTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_sp_action_detail_start_time")
    /** Database column m_sp_action_detail_qty DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mSpActionDetailQty: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_sp_action_detail_qty", O.Default("0.00"))
    /** Database column m_sp_action_detail_limited DBType(TINYINT UNSIGNED), Default(0) */
    val mSpActionDetailLimited: Column[Byte] = column[Byte]("m_sp_action_detail_limited", O.Default(0))
  }
  /** Collection-like TableQuery object for table MSpActionDetail */
  lazy val MSpActionDetail = new TableQuery(tag => new MSpActionDetail(tag))
  
  /** Entity class storing rows of table MSpActionRules
   *  @param mSpActionRulesId Database column m_sp_action_rules_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mSpActionRulesName Database column m_sp_action_rules_name DBType(VARCHAR), Length(250,true)
   *  @param mSpActionRulesCreateTime Database column m_sp_action_rules_create_time DBType(DATETIME)
   *  @param mSpActionRulesStartTime Database column m_sp_action_rules_start_time DBType(DATETIME)
   *  @param mSpActionRulesEndTime Database column m_sp_action_rules_end_time DBType(DATETIME)
   *  @param mSpActionRulesBuySp Database column m_sp_action_rules_buy_sp DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param mSpActionRulesSpCoin Database column m_sp_action_rules_sp_coin DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param mSpActionRulesRate Database column m_sp_action_rules_rate DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param mSpActionRulesType Database column m_sp_action_rules_type DBType(TINYINT UNSIGNED), Default(0)
   *  @param mSpActionRulesUpdateTime Database column m_sp_action_rules_update_time DBType(DATETIME)
   *  @param mSpActionRulesMethod Database column m_sp_action_rules_method DBType(TINYINT UNSIGNED), Default(1)
   *  @param mSpActionRulesRunOnce Database column m_sp_action_rules_run_once DBType(TINYINT UNSIGNED), Default(1)
   *  @param mSpActionRulesPresentFlag Database column m_sp_action_rules_present_flag DBType(TINYINT UNSIGNED), Default(0)
   *  @param mSpActionRulesMemo Database column m_sp_action_rules_memo DBType(TEXT), Length(65535,true) */
  case class MSpActionRulesRow(mSpActionRulesId: Int, mSpActionRulesName: String, mSpActionRulesCreateTime: java.sql.Timestamp, mSpActionRulesStartTime: java.sql.Timestamp, mSpActionRulesEndTime: java.sql.Timestamp, mSpActionRulesBuySp: scala.math.BigDecimal = "0.00", mSpActionRulesSpCoin: scala.math.BigDecimal = "0.00", mSpActionRulesRate: scala.math.BigDecimal = "0.00", mSpActionRulesType: Byte = 0, mSpActionRulesUpdateTime: java.sql.Timestamp, mSpActionRulesMethod: Byte = 1, mSpActionRulesRunOnce: Byte = 1, mSpActionRulesPresentFlag: Byte = 0, mSpActionRulesMemo: String)
  /** GetResult implicit for fetching MSpActionRulesRow objects using plain SQL queries */
  implicit def GetResultMSpActionRulesRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[scala.math.BigDecimal], e4: GR[Byte]): GR[MSpActionRulesRow] = GR{
    prs => import prs._
    MSpActionRulesRow.tupled((<<[Int], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[Byte], <<[java.sql.Timestamp], <<[Byte], <<[Byte], <<[Byte], <<[String]))
  }
  /** Table description of table m_sp_action_rules. Objects of this class serve as prototypes for rows in queries. */
  class MSpActionRules(_tableTag: Tag) extends Table[MSpActionRulesRow](_tableTag, "m_sp_action_rules") {
    def * = (mSpActionRulesId, mSpActionRulesName, mSpActionRulesCreateTime, mSpActionRulesStartTime, mSpActionRulesEndTime, mSpActionRulesBuySp, mSpActionRulesSpCoin, mSpActionRulesRate, mSpActionRulesType, mSpActionRulesUpdateTime, mSpActionRulesMethod, mSpActionRulesRunOnce, mSpActionRulesPresentFlag, mSpActionRulesMemo) <> (MSpActionRulesRow.tupled, MSpActionRulesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mSpActionRulesId.?, mSpActionRulesName.?, mSpActionRulesCreateTime.?, mSpActionRulesStartTime.?, mSpActionRulesEndTime.?, mSpActionRulesBuySp.?, mSpActionRulesSpCoin.?, mSpActionRulesRate.?, mSpActionRulesType.?, mSpActionRulesUpdateTime.?, mSpActionRulesMethod.?, mSpActionRulesRunOnce.?, mSpActionRulesPresentFlag.?, mSpActionRulesMemo.?).shaped.<>({r=>import r._; _1.map(_=> MSpActionRulesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_sp_action_rules_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mSpActionRulesId: Column[Int] = column[Int]("m_sp_action_rules_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_sp_action_rules_name DBType(VARCHAR), Length(250,true) */
    val mSpActionRulesName: Column[String] = column[String]("m_sp_action_rules_name", O.Length(250,varying=true))
    /** Database column m_sp_action_rules_create_time DBType(DATETIME) */
    val mSpActionRulesCreateTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_sp_action_rules_create_time")
    /** Database column m_sp_action_rules_start_time DBType(DATETIME) */
    val mSpActionRulesStartTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_sp_action_rules_start_time")
    /** Database column m_sp_action_rules_end_time DBType(DATETIME) */
    val mSpActionRulesEndTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_sp_action_rules_end_time")
    /** Database column m_sp_action_rules_buy_sp DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mSpActionRulesBuySp: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_sp_action_rules_buy_sp", O.Default("0.00"))
    /** Database column m_sp_action_rules_sp_coin DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mSpActionRulesSpCoin: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_sp_action_rules_sp_coin", O.Default("0.00"))
    /** Database column m_sp_action_rules_rate DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mSpActionRulesRate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_sp_action_rules_rate", O.Default("0.00"))
    /** Database column m_sp_action_rules_type DBType(TINYINT UNSIGNED), Default(0) */
    val mSpActionRulesType: Column[Byte] = column[Byte]("m_sp_action_rules_type", O.Default(0))
    /** Database column m_sp_action_rules_update_time DBType(DATETIME) */
    val mSpActionRulesUpdateTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_sp_action_rules_update_time")
    /** Database column m_sp_action_rules_method DBType(TINYINT UNSIGNED), Default(1) */
    val mSpActionRulesMethod: Column[Byte] = column[Byte]("m_sp_action_rules_method", O.Default(1))
    /** Database column m_sp_action_rules_run_once DBType(TINYINT UNSIGNED), Default(1) */
    val mSpActionRulesRunOnce: Column[Byte] = column[Byte]("m_sp_action_rules_run_once", O.Default(1))
    /** Database column m_sp_action_rules_present_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mSpActionRulesPresentFlag: Column[Byte] = column[Byte]("m_sp_action_rules_present_flag", O.Default(0))
    /** Database column m_sp_action_rules_memo DBType(TEXT), Length(65535,true) */
    val mSpActionRulesMemo: Column[String] = column[String]("m_sp_action_rules_memo", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table MSpActionRules */
  lazy val MSpActionRules = new TableQuery(tag => new MSpActionRules(tag))
  
  /** Entity class storing rows of table MSpCoinIncome
   *  @param mSpCoinIncomeId Database column m_sp_coin_income_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mSpCoinIncomeMMakerId Database column m_sp_coin_income_m_maker_id DBType(INT UNSIGNED), Default(0)
   *  @param mSpCoinIncomeTime Database column m_sp_coin_income_time DBType(DATETIME)
   *  @param mSpCoinIncomeStartTime Database column m_sp_coin_income_start_time DBType(DATETIME)
   *  @param mSpCoinIncomeExpireTime Database column m_sp_coin_income_expire_time DBType(DATETIME)
   *  @param mSpCoinIncomeUpdateTime Database column m_sp_coin_income_update_time DBType(DATETIME)
   *  @param mSpCoinIncomeAmount Database column m_sp_coin_income_amount DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param mSpCoinIncomeBalance Database column m_sp_coin_income_balance DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param mSpCoinIncomeRuleId Database column m_sp_coin_income_rule_id DBType(VARCHAR), Length(50,true)
   *  @param mSpCoinIncomeMSpActionRulesId Database column m_sp_coin_income_m_sp_action_rules_id DBType(INT UNSIGNED), Default(0)
   *  @param mSpCoinIncomeTotalBalance Database column m_sp_coin_income_total_balance DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param mSpCoinIncomeType Database column m_sp_coin_income_type DBType(TINYINT), Default(0)
   *  @param mSpCoinIncomeStatus Database column m_sp_coin_income_status DBType(TINYINT UNSIGNED), Default(1)
   *  @param mSpCoinIncomeMemo Database column m_sp_coin_income_memo DBType(TEXT), Length(65535,true) */
  case class MSpCoinIncomeRow(mSpCoinIncomeId: Int, mSpCoinIncomeMMakerId: Int = 0, mSpCoinIncomeTime: java.sql.Timestamp, mSpCoinIncomeStartTime: java.sql.Timestamp, mSpCoinIncomeExpireTime: java.sql.Timestamp, mSpCoinIncomeUpdateTime: java.sql.Timestamp, mSpCoinIncomeAmount: scala.math.BigDecimal = "0.00", mSpCoinIncomeBalance: scala.math.BigDecimal = "0.00", mSpCoinIncomeRuleId: String, mSpCoinIncomeMSpActionRulesId: Int = 0, mSpCoinIncomeTotalBalance: scala.math.BigDecimal = "0.00", mSpCoinIncomeType: Byte = 0, mSpCoinIncomeStatus: Byte = 1, mSpCoinIncomeMemo: String)
  /** GetResult implicit for fetching MSpCoinIncomeRow objects using plain SQL queries */
  implicit def GetResultMSpCoinIncomeRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp], e2: GR[scala.math.BigDecimal], e3: GR[String], e4: GR[Byte]): GR[MSpCoinIncomeRow] = GR{
    prs => import prs._
    MSpCoinIncomeRow.tupled((<<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[String], <<[Int], <<[scala.math.BigDecimal], <<[Byte], <<[Byte], <<[String]))
  }
  /** Table description of table m_sp_coin_income. Objects of this class serve as prototypes for rows in queries. */
  class MSpCoinIncome(_tableTag: Tag) extends Table[MSpCoinIncomeRow](_tableTag, "m_sp_coin_income") {
    def * = (mSpCoinIncomeId, mSpCoinIncomeMMakerId, mSpCoinIncomeTime, mSpCoinIncomeStartTime, mSpCoinIncomeExpireTime, mSpCoinIncomeUpdateTime, mSpCoinIncomeAmount, mSpCoinIncomeBalance, mSpCoinIncomeRuleId, mSpCoinIncomeMSpActionRulesId, mSpCoinIncomeTotalBalance, mSpCoinIncomeType, mSpCoinIncomeStatus, mSpCoinIncomeMemo) <> (MSpCoinIncomeRow.tupled, MSpCoinIncomeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mSpCoinIncomeId.?, mSpCoinIncomeMMakerId.?, mSpCoinIncomeTime.?, mSpCoinIncomeStartTime.?, mSpCoinIncomeExpireTime.?, mSpCoinIncomeUpdateTime.?, mSpCoinIncomeAmount.?, mSpCoinIncomeBalance.?, mSpCoinIncomeRuleId.?, mSpCoinIncomeMSpActionRulesId.?, mSpCoinIncomeTotalBalance.?, mSpCoinIncomeType.?, mSpCoinIncomeStatus.?, mSpCoinIncomeMemo.?).shaped.<>({r=>import r._; _1.map(_=> MSpCoinIncomeRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_sp_coin_income_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mSpCoinIncomeId: Column[Int] = column[Int]("m_sp_coin_income_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_sp_coin_income_m_maker_id DBType(INT UNSIGNED), Default(0) */
    val mSpCoinIncomeMMakerId: Column[Int] = column[Int]("m_sp_coin_income_m_maker_id", O.Default(0))
    /** Database column m_sp_coin_income_time DBType(DATETIME) */
    val mSpCoinIncomeTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_sp_coin_income_time")
    /** Database column m_sp_coin_income_start_time DBType(DATETIME) */
    val mSpCoinIncomeStartTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_sp_coin_income_start_time")
    /** Database column m_sp_coin_income_expire_time DBType(DATETIME) */
    val mSpCoinIncomeExpireTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_sp_coin_income_expire_time")
    /** Database column m_sp_coin_income_update_time DBType(DATETIME) */
    val mSpCoinIncomeUpdateTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_sp_coin_income_update_time")
    /** Database column m_sp_coin_income_amount DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mSpCoinIncomeAmount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_sp_coin_income_amount", O.Default("0.00"))
    /** Database column m_sp_coin_income_balance DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mSpCoinIncomeBalance: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_sp_coin_income_balance", O.Default("0.00"))
    /** Database column m_sp_coin_income_rule_id DBType(VARCHAR), Length(50,true) */
    val mSpCoinIncomeRuleId: Column[String] = column[String]("m_sp_coin_income_rule_id", O.Length(50,varying=true))
    /** Database column m_sp_coin_income_m_sp_action_rules_id DBType(INT UNSIGNED), Default(0) */
    val mSpCoinIncomeMSpActionRulesId: Column[Int] = column[Int]("m_sp_coin_income_m_sp_action_rules_id", O.Default(0))
    /** Database column m_sp_coin_income_total_balance DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mSpCoinIncomeTotalBalance: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_sp_coin_income_total_balance", O.Default("0.00"))
    /** Database column m_sp_coin_income_type DBType(TINYINT), Default(0) */
    val mSpCoinIncomeType: Column[Byte] = column[Byte]("m_sp_coin_income_type", O.Default(0))
    /** Database column m_sp_coin_income_status DBType(TINYINT UNSIGNED), Default(1) */
    val mSpCoinIncomeStatus: Column[Byte] = column[Byte]("m_sp_coin_income_status", O.Default(1))
    /** Database column m_sp_coin_income_memo DBType(TEXT), Length(65535,true) */
    val mSpCoinIncomeMemo: Column[String] = column[String]("m_sp_coin_income_memo", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table MSpCoinIncome */
  lazy val MSpCoinIncome = new TableQuery(tag => new MSpCoinIncome(tag))
  
  /** Entity class storing rows of table MSpCoinPay
   *  @param mSpCoinPayId Database column m_sp_coin_pay_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mSpCoinPayIncomeId Database column m_sp_coin_pay_income_id DBType(INT UNSIGNED), Default(0)
   *  @param mSpCoinPayPayTime Database column m_sp_coin_pay_pay_time DBType(DATETIME)
   *  @param mSpCoinPayAmount Database column m_sp_coin_pay_amount DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param mSpCoinPayTotalBalance Database column m_sp_coin_pay_total_balance DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param mSpCoinPayMItemCode Database column m_sp_coin_pay_m_item_code DBType(VARCHAR), Length(50,true)
   *  @param mSpCoinPayType Database column m_sp_coin_pay_type DBType(TINYINT UNSIGNED), Default(0)
   *  @param mSpeedCoinStatus Database column m_speed_coin_status DBType(TINYINT UNSIGNED), Default(1)
   *  @param mSpeedCoinMemo Database column m_speed_coin_memo DBType(TEXT), Length(65535,true) */
  case class MSpCoinPayRow(mSpCoinPayId: Int, mSpCoinPayIncomeId: Int = 0, mSpCoinPayPayTime: java.sql.Timestamp, mSpCoinPayAmount: scala.math.BigDecimal = "0.00", mSpCoinPayTotalBalance: scala.math.BigDecimal = "0.00", mSpCoinPayMItemCode: String, mSpCoinPayType: Byte = 0, mSpeedCoinStatus: Byte = 1, mSpeedCoinMemo: String)
  /** GetResult implicit for fetching MSpCoinPayRow objects using plain SQL queries */
  implicit def GetResultMSpCoinPayRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp], e2: GR[scala.math.BigDecimal], e3: GR[String], e4: GR[Byte]): GR[MSpCoinPayRow] = GR{
    prs => import prs._
    MSpCoinPayRow.tupled((<<[Int], <<[Int], <<[java.sql.Timestamp], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[String], <<[Byte], <<[Byte], <<[String]))
  }
  /** Table description of table m_sp_coin_pay. Objects of this class serve as prototypes for rows in queries. */
  class MSpCoinPay(_tableTag: Tag) extends Table[MSpCoinPayRow](_tableTag, "m_sp_coin_pay") {
    def * = (mSpCoinPayId, mSpCoinPayIncomeId, mSpCoinPayPayTime, mSpCoinPayAmount, mSpCoinPayTotalBalance, mSpCoinPayMItemCode, mSpCoinPayType, mSpeedCoinStatus, mSpeedCoinMemo) <> (MSpCoinPayRow.tupled, MSpCoinPayRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mSpCoinPayId.?, mSpCoinPayIncomeId.?, mSpCoinPayPayTime.?, mSpCoinPayAmount.?, mSpCoinPayTotalBalance.?, mSpCoinPayMItemCode.?, mSpCoinPayType.?, mSpeedCoinStatus.?, mSpeedCoinMemo.?).shaped.<>({r=>import r._; _1.map(_=> MSpCoinPayRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_sp_coin_pay_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mSpCoinPayId: Column[Int] = column[Int]("m_sp_coin_pay_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_sp_coin_pay_income_id DBType(INT UNSIGNED), Default(0) */
    val mSpCoinPayIncomeId: Column[Int] = column[Int]("m_sp_coin_pay_income_id", O.Default(0))
    /** Database column m_sp_coin_pay_pay_time DBType(DATETIME) */
    val mSpCoinPayPayTime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_sp_coin_pay_pay_time")
    /** Database column m_sp_coin_pay_amount DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mSpCoinPayAmount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_sp_coin_pay_amount", O.Default("0.00"))
    /** Database column m_sp_coin_pay_total_balance DBType(DECIMAL UNSIGNED), Default(0.00) */
    val mSpCoinPayTotalBalance: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_sp_coin_pay_total_balance", O.Default("0.00"))
    /** Database column m_sp_coin_pay_m_item_code DBType(VARCHAR), Length(50,true) */
    val mSpCoinPayMItemCode: Column[String] = column[String]("m_sp_coin_pay_m_item_code", O.Length(50,varying=true))
    /** Database column m_sp_coin_pay_type DBType(TINYINT UNSIGNED), Default(0) */
    val mSpCoinPayType: Column[Byte] = column[Byte]("m_sp_coin_pay_type", O.Default(0))
    /** Database column m_speed_coin_status DBType(TINYINT UNSIGNED), Default(1) */
    val mSpeedCoinStatus: Column[Byte] = column[Byte]("m_speed_coin_status", O.Default(1))
    /** Database column m_speed_coin_memo DBType(TEXT), Length(65535,true) */
    val mSpeedCoinMemo: Column[String] = column[String]("m_speed_coin_memo", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table MSpCoinPay */
  lazy val MSpCoinPay = new TableQuery(tag => new MSpCoinPay(tag))
  
  /** Entity class storing rows of table MSpec
   *  @param mSpecId Database column m_spec_id DBType(INT), AutoInc, PrimaryKey
   *  @param mSpecVoidFlag Database column m_spec_void_flag DBType(INT)
   *  @param mSpecMItemTypeId Database column m_spec_m_item_type_id DBType(INT)
   *  @param mSpecNameCh Database column m_spec_name_ch DBType(VARCHAR), Length(100,true)
   *  @param mSpecNameJp Database column m_spec_name_jp DBType(VARCHAR), Length(100,true)
   *  @param mSpecOrder Database column m_spec_order DBType(INT) */
  case class MSpecRow(mSpecId: Int, mSpecVoidFlag: Int, mSpecMItemTypeId: Int, mSpecNameCh: String, mSpecNameJp: String, mSpecOrder: Int)
  /** GetResult implicit for fetching MSpecRow objects using plain SQL queries */
  implicit def GetResultMSpecRow(implicit e0: GR[Int], e1: GR[String]): GR[MSpecRow] = GR{
    prs => import prs._
    MSpecRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table m_spec. Objects of this class serve as prototypes for rows in queries. */
  class MSpec(_tableTag: Tag) extends Table[MSpecRow](_tableTag, "m_spec") {
    def * = (mSpecId, mSpecVoidFlag, mSpecMItemTypeId, mSpecNameCh, mSpecNameJp, mSpecOrder) <> (MSpecRow.tupled, MSpecRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mSpecId.?, mSpecVoidFlag.?, mSpecMItemTypeId.?, mSpecNameCh.?, mSpecNameJp.?, mSpecOrder.?).shaped.<>({r=>import r._; _1.map(_=> MSpecRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_spec_id DBType(INT), AutoInc, PrimaryKey */
    val mSpecId: Column[Int] = column[Int]("m_spec_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_spec_void_flag DBType(INT) */
    val mSpecVoidFlag: Column[Int] = column[Int]("m_spec_void_flag")
    /** Database column m_spec_m_item_type_id DBType(INT) */
    val mSpecMItemTypeId: Column[Int] = column[Int]("m_spec_m_item_type_id")
    /** Database column m_spec_name_ch DBType(VARCHAR), Length(100,true) */
    val mSpecNameCh: Column[String] = column[String]("m_spec_name_ch", O.Length(100,varying=true))
    /** Database column m_spec_name_jp DBType(VARCHAR), Length(100,true) */
    val mSpecNameJp: Column[String] = column[String]("m_spec_name_jp", O.Length(100,varying=true))
    /** Database column m_spec_order DBType(INT) */
    val mSpecOrder: Column[Int] = column[Int]("m_spec_order")
  }
  /** Collection-like TableQuery object for table MSpec */
  lazy val MSpec = new TableQuery(tag => new MSpec(tag))
  
  /** Entity class storing rows of table MSpeedpayPassword
   *  @param mSpeedpayPasswordMCustomerId Database column m_speedpay_password_m_customer_id DBType(INT), PrimaryKey, Default(0)
   *  @param mSpeedpayPassword Database column m_speedpay_password DBType(VARCHAR), Length(100,true), Default()
   *  @param mSpeedpayPasswordSalt Database column m_speedpay_password_salt DBType(VARCHAR), Length(15,true), Default()
   *  @param mSpeedpayPasswordRemindkey Database column m_speedpay_password_remindkey DBType(VARCHAR), Length(100,true), Default()
   *  @param mSpeedpayPasswordReminddatetime Database column m_speedpay_password_reminddatetime DBType(DATETIME)
   *  @param mSpeedpayPasswordUdatetime Database column m_speedpay_password_udatetime DBType(DATETIME) */
  case class MSpeedpayPasswordRow(mSpeedpayPasswordMCustomerId: Int = 0, mSpeedpayPassword: String = "", mSpeedpayPasswordSalt: String = "", mSpeedpayPasswordRemindkey: String = "", mSpeedpayPasswordReminddatetime: java.sql.Timestamp, mSpeedpayPasswordUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MSpeedpayPasswordRow objects using plain SQL queries */
  implicit def GetResultMSpeedpayPasswordRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[MSpeedpayPasswordRow] = GR{
    prs => import prs._
    MSpeedpayPasswordRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_speedpay_password. Objects of this class serve as prototypes for rows in queries. */
  class MSpeedpayPassword(_tableTag: Tag) extends Table[MSpeedpayPasswordRow](_tableTag, "m_speedpay_password") {
    def * = (mSpeedpayPasswordMCustomerId, mSpeedpayPassword, mSpeedpayPasswordSalt, mSpeedpayPasswordRemindkey, mSpeedpayPasswordReminddatetime, mSpeedpayPasswordUdatetime) <> (MSpeedpayPasswordRow.tupled, MSpeedpayPasswordRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mSpeedpayPasswordMCustomerId.?, mSpeedpayPassword.?, mSpeedpayPasswordSalt.?, mSpeedpayPasswordRemindkey.?, mSpeedpayPasswordReminddatetime.?, mSpeedpayPasswordUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MSpeedpayPasswordRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_speedpay_password_m_customer_id DBType(INT), PrimaryKey, Default(0) */
    val mSpeedpayPasswordMCustomerId: Column[Int] = column[Int]("m_speedpay_password_m_customer_id", O.PrimaryKey, O.Default(0))
    /** Database column m_speedpay_password DBType(VARCHAR), Length(100,true), Default() */
    val mSpeedpayPassword: Column[String] = column[String]("m_speedpay_password", O.Length(100,varying=true), O.Default(""))
    /** Database column m_speedpay_password_salt DBType(VARCHAR), Length(15,true), Default() */
    val mSpeedpayPasswordSalt: Column[String] = column[String]("m_speedpay_password_salt", O.Length(15,varying=true), O.Default(""))
    /** Database column m_speedpay_password_remindkey DBType(VARCHAR), Length(100,true), Default() */
    val mSpeedpayPasswordRemindkey: Column[String] = column[String]("m_speedpay_password_remindkey", O.Length(100,varying=true), O.Default(""))
    /** Database column m_speedpay_password_reminddatetime DBType(DATETIME) */
    val mSpeedpayPasswordReminddatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_speedpay_password_reminddatetime")
    /** Database column m_speedpay_password_udatetime DBType(DATETIME) */
    val mSpeedpayPasswordUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_speedpay_password_udatetime")
  }
  /** Collection-like TableQuery object for table MSpeedpayPassword */
  lazy val MSpeedpayPassword = new TableQuery(tag => new MSpeedpayPassword(tag))
  
  /** Entity class storing rows of table MStkCny
   *  @param mStkCnyId Database column m_stk_cny_id DBType(INT), AutoInc, PrimaryKey
   *  @param mStkCnyMMakerId Database column m_stk_cny_m_maker_id DBType(INT)
   *  @param mStkCnyTitle Database column m_stk_cny_title DBType(VARCHAR), Length(100,true)
   *  @param mStkCnyNote Database column m_stk_cny_note DBType(TEXT), Length(65535,true)
   *  @param mStkCnyPrice Database column m_stk_cny_price DBType(DECIMAL)
   *  @param mStkCnyLatestBalance Database column m_stk_cny_latest_balance DBType(DECIMAL)
   *  @param mStkCnyCreatedate Database column m_stk_cny_createdate DBType(DATETIME)
   *  @param mStkCnyFlag Database column m_stk_cny_flag DBType(TINYINT UNSIGNED), Default(0) */
  case class MStkCnyRow(mStkCnyId: Int, mStkCnyMMakerId: Int, mStkCnyTitle: String, mStkCnyNote: String, mStkCnyPrice: scala.math.BigDecimal, mStkCnyLatestBalance: scala.math.BigDecimal, mStkCnyCreatedate: java.sql.Timestamp, mStkCnyFlag: Byte = 0)
  /** GetResult implicit for fetching MStkCnyRow objects using plain SQL queries */
  implicit def GetResultMStkCnyRow(implicit e0: GR[Int], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[java.sql.Timestamp], e4: GR[Byte]): GR[MStkCnyRow] = GR{
    prs => import prs._
    MStkCnyRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[Byte]))
  }
  /** Table description of table m_stk_cny. Objects of this class serve as prototypes for rows in queries. */
  class MStkCny(_tableTag: Tag) extends Table[MStkCnyRow](_tableTag, "m_stk_cny") {
    def * = (mStkCnyId, mStkCnyMMakerId, mStkCnyTitle, mStkCnyNote, mStkCnyPrice, mStkCnyLatestBalance, mStkCnyCreatedate, mStkCnyFlag) <> (MStkCnyRow.tupled, MStkCnyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkCnyId.?, mStkCnyMMakerId.?, mStkCnyTitle.?, mStkCnyNote.?, mStkCnyPrice.?, mStkCnyLatestBalance.?, mStkCnyCreatedate.?, mStkCnyFlag.?).shaped.<>({r=>import r._; _1.map(_=> MStkCnyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_cny_id DBType(INT), AutoInc, PrimaryKey */
    val mStkCnyId: Column[Int] = column[Int]("m_stk_cny_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_cny_m_maker_id DBType(INT) */
    val mStkCnyMMakerId: Column[Int] = column[Int]("m_stk_cny_m_maker_id")
    /** Database column m_stk_cny_title DBType(VARCHAR), Length(100,true) */
    val mStkCnyTitle: Column[String] = column[String]("m_stk_cny_title", O.Length(100,varying=true))
    /** Database column m_stk_cny_note DBType(TEXT), Length(65535,true) */
    val mStkCnyNote: Column[String] = column[String]("m_stk_cny_note", O.Length(65535,varying=true))
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
  
  /** Entity class storing rows of table MStkCnyCopy
   *  @param mStkCnyCopyId Database column m_stk_cny_copy_id DBType(INT), AutoInc, PrimaryKey
   *  @param mStkCnyCopyMMakerId Database column m_stk_cny_copy_m_maker_id DBType(INT)
   *  @param mStkCnyCopyTitle Database column m_stk_cny_copy_title DBType(VARCHAR), Length(100,true)
   *  @param mStkCnyCopyNote Database column m_stk_cny_copy_note DBType(TEXT), Length(65535,true)
   *  @param mStkCnyCopyPrice Database column m_stk_cny_copy_price DBType(DECIMAL)
   *  @param mStkCnyCopyLatestBalance Database column m_stk_cny_copy_latest_balance DBType(DECIMAL)
   *  @param mStkCnyCopyCreatedate Database column m_stk_cny_copy_createdate DBType(DATETIME)
   *  @param mStkCnyCopyMUserId Database column m_stk_cny_copy_m_user_id DBType(INT UNSIGNED), Default(0)
   *  @param mStkCnyCopyCancelDatetime Database column m_stk_cny_copy_cancel_datetime DBType(DATETIME) */
  case class MStkCnyCopyRow(mStkCnyCopyId: Int, mStkCnyCopyMMakerId: Int, mStkCnyCopyTitle: String, mStkCnyCopyNote: String, mStkCnyCopyPrice: scala.math.BigDecimal, mStkCnyCopyLatestBalance: scala.math.BigDecimal, mStkCnyCopyCreatedate: java.sql.Timestamp, mStkCnyCopyMUserId: Int = 0, mStkCnyCopyCancelDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MStkCnyCopyRow objects using plain SQL queries */
  implicit def GetResultMStkCnyCopyRow(implicit e0: GR[Int], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[java.sql.Timestamp]): GR[MStkCnyCopyRow] = GR{
    prs => import prs._
    MStkCnyCopyRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_stk_cny_copy. Objects of this class serve as prototypes for rows in queries. */
  class MStkCnyCopy(_tableTag: Tag) extends Table[MStkCnyCopyRow](_tableTag, "m_stk_cny_copy") {
    def * = (mStkCnyCopyId, mStkCnyCopyMMakerId, mStkCnyCopyTitle, mStkCnyCopyNote, mStkCnyCopyPrice, mStkCnyCopyLatestBalance, mStkCnyCopyCreatedate, mStkCnyCopyMUserId, mStkCnyCopyCancelDatetime) <> (MStkCnyCopyRow.tupled, MStkCnyCopyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkCnyCopyId.?, mStkCnyCopyMMakerId.?, mStkCnyCopyTitle.?, mStkCnyCopyNote.?, mStkCnyCopyPrice.?, mStkCnyCopyLatestBalance.?, mStkCnyCopyCreatedate.?, mStkCnyCopyMUserId.?, mStkCnyCopyCancelDatetime.?).shaped.<>({r=>import r._; _1.map(_=> MStkCnyCopyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_cny_copy_id DBType(INT), AutoInc, PrimaryKey */
    val mStkCnyCopyId: Column[Int] = column[Int]("m_stk_cny_copy_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_cny_copy_m_maker_id DBType(INT) */
    val mStkCnyCopyMMakerId: Column[Int] = column[Int]("m_stk_cny_copy_m_maker_id")
    /** Database column m_stk_cny_copy_title DBType(VARCHAR), Length(100,true) */
    val mStkCnyCopyTitle: Column[String] = column[String]("m_stk_cny_copy_title", O.Length(100,varying=true))
    /** Database column m_stk_cny_copy_note DBType(TEXT), Length(65535,true) */
    val mStkCnyCopyNote: Column[String] = column[String]("m_stk_cny_copy_note", O.Length(65535,varying=true))
    /** Database column m_stk_cny_copy_price DBType(DECIMAL) */
    val mStkCnyCopyPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_cny_copy_price")
    /** Database column m_stk_cny_copy_latest_balance DBType(DECIMAL) */
    val mStkCnyCopyLatestBalance: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_cny_copy_latest_balance")
    /** Database column m_stk_cny_copy_createdate DBType(DATETIME) */
    val mStkCnyCopyCreatedate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_cny_copy_createdate")
    /** Database column m_stk_cny_copy_m_user_id DBType(INT UNSIGNED), Default(0) */
    val mStkCnyCopyMUserId: Column[Int] = column[Int]("m_stk_cny_copy_m_user_id", O.Default(0))
    /** Database column m_stk_cny_copy_cancel_datetime DBType(DATETIME) */
    val mStkCnyCopyCancelDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_cny_copy_cancel_datetime")
  }
  /** Collection-like TableQuery object for table MStkCnyCopy */
  lazy val MStkCnyCopy = new TableQuery(tag => new MStkCnyCopy(tag))
  
  /** Entity class storing rows of table MStkCnyRefill
   *  @param mStkCnyRefillId Database column m_stk_cny_refill_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mStkCnyRefillMMakerId Database column m_stk_cny_refill_m_maker_id DBType(INT UNSIGNED)
   *  @param mStkCnyRefillOrderId Database column m_stk_cny_refill_order_id DBType(CHAR), Length(30,false)
   *  @param mStkCnyRefillOrderAmount Database column m_stk_cny_refill_order_amount DBType(INT)
   *  @param mStkCnyRefillOrderTime Database column m_stk_cny_refill_order_time DBType(CHAR), Length(14,false)
   *  @param mStkCnyRefillPayType Database column m_stk_cny_refill_pay_type DBType(CHAR), Length(2,false)
   *  @param mStkCnyRefillBankId Database column m_stk_cny_refill_bank_id DBType(CHAR), Length(10,false), Default(None)
   *  @param mStkCnyRefillPayResult Database column m_stk_cny_refill_pay_result DBType(CHAR), Length(2,false), Default(n)
   *  @param mStkCnyRefillResultDate Database column m_stk_cny_refill_result_date DBType(DATETIME), Default(None)
   *  @param mStkCnyRefillDealId Database column m_stk_cny_refill_deal_id DBType(CHAR), Length(30,false), Default(None)
   *  @param mStkCnyRefillBankDealId Database column m_stk_cny_refill_bank_deal_id DBType(CHAR), Length(30,false), Default(None)
   *  @param mStkCnyRefillDealTime Database column m_stk_cny_refill_deal_time DBType(CHAR), Length(14,false), Default(None)
   *  @param mStkCnyRefillFee Database column m_stk_cny_refill_fee DBType(INT), Default(None)
   *  @param mStkCnyRefillErrCode Database column m_stk_cny_refill_err_code DBType(CHAR), Length(10,false), Default(None)
   *  @param mStkCnyRefillSignmsg Database column m_stk_cny_refill_signmsg DBType(VARCHAR), Length(256,true)
   *  @param mStkCnyRefillCreateDate Database column m_stk_cny_refill_create_date DBType(DATETIME)
   *  @param mStkCnyRefillResultSignmsg Database column m_stk_cny_refill_result_signmsg DBType(VARCHAR), Length(256,true), Default(None) */
  case class MStkCnyRefillRow(mStkCnyRefillId: Int, mStkCnyRefillMMakerId: Int, mStkCnyRefillOrderId: String, mStkCnyRefillOrderAmount: Int, mStkCnyRefillOrderTime: String, mStkCnyRefillPayType: String, mStkCnyRefillBankId: Option[String] = None, mStkCnyRefillPayResult: String = "n", mStkCnyRefillResultDate: Option[java.sql.Timestamp] = None, mStkCnyRefillDealId: Option[String] = None, mStkCnyRefillBankDealId: Option[String] = None, mStkCnyRefillDealTime: Option[String] = None, mStkCnyRefillFee: Option[Int] = None, mStkCnyRefillErrCode: Option[String] = None, mStkCnyRefillSignmsg: String, mStkCnyRefillCreateDate: java.sql.Timestamp, mStkCnyRefillResultSignmsg: Option[String] = None)
  /** GetResult implicit for fetching MStkCnyRefillRow objects using plain SQL queries */
  implicit def GetResultMStkCnyRefillRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]], e4: GR[Option[Int]], e5: GR[java.sql.Timestamp]): GR[MStkCnyRefillRow] = GR{
    prs => import prs._
    MStkCnyRefillRow.tupled((<<[Int], <<[Int], <<[String], <<[Int], <<[String], <<[String], <<?[String], <<[String], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[Int], <<?[String], <<[String], <<[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table m_stk_cny_refill. Objects of this class serve as prototypes for rows in queries. */
  class MStkCnyRefill(_tableTag: Tag) extends Table[MStkCnyRefillRow](_tableTag, "m_stk_cny_refill") {
    def * = (mStkCnyRefillId, mStkCnyRefillMMakerId, mStkCnyRefillOrderId, mStkCnyRefillOrderAmount, mStkCnyRefillOrderTime, mStkCnyRefillPayType, mStkCnyRefillBankId, mStkCnyRefillPayResult, mStkCnyRefillResultDate, mStkCnyRefillDealId, mStkCnyRefillBankDealId, mStkCnyRefillDealTime, mStkCnyRefillFee, mStkCnyRefillErrCode, mStkCnyRefillSignmsg, mStkCnyRefillCreateDate, mStkCnyRefillResultSignmsg) <> (MStkCnyRefillRow.tupled, MStkCnyRefillRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkCnyRefillId.?, mStkCnyRefillMMakerId.?, mStkCnyRefillOrderId.?, mStkCnyRefillOrderAmount.?, mStkCnyRefillOrderTime.?, mStkCnyRefillPayType.?, mStkCnyRefillBankId, mStkCnyRefillPayResult.?, mStkCnyRefillResultDate, mStkCnyRefillDealId, mStkCnyRefillBankDealId, mStkCnyRefillDealTime, mStkCnyRefillFee, mStkCnyRefillErrCode, mStkCnyRefillSignmsg.?, mStkCnyRefillCreateDate.?, mStkCnyRefillResultSignmsg).shaped.<>({r=>import r._; _1.map(_=> MStkCnyRefillRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8.get, _9, _10, _11, _12, _13, _14, _15.get, _16.get, _17)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_cny_refill_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mStkCnyRefillId: Column[Int] = column[Int]("m_stk_cny_refill_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_cny_refill_m_maker_id DBType(INT UNSIGNED) */
    val mStkCnyRefillMMakerId: Column[Int] = column[Int]("m_stk_cny_refill_m_maker_id")
    /** Database column m_stk_cny_refill_order_id DBType(CHAR), Length(30,false) */
    val mStkCnyRefillOrderId: Column[String] = column[String]("m_stk_cny_refill_order_id", O.Length(30,varying=false))
    /** Database column m_stk_cny_refill_order_amount DBType(INT) */
    val mStkCnyRefillOrderAmount: Column[Int] = column[Int]("m_stk_cny_refill_order_amount")
    /** Database column m_stk_cny_refill_order_time DBType(CHAR), Length(14,false) */
    val mStkCnyRefillOrderTime: Column[String] = column[String]("m_stk_cny_refill_order_time", O.Length(14,varying=false))
    /** Database column m_stk_cny_refill_pay_type DBType(CHAR), Length(2,false) */
    val mStkCnyRefillPayType: Column[String] = column[String]("m_stk_cny_refill_pay_type", O.Length(2,varying=false))
    /** Database column m_stk_cny_refill_bank_id DBType(CHAR), Length(10,false), Default(None) */
    val mStkCnyRefillBankId: Column[Option[String]] = column[Option[String]]("m_stk_cny_refill_bank_id", O.Length(10,varying=false), O.Default(None))
    /** Database column m_stk_cny_refill_pay_result DBType(CHAR), Length(2,false), Default(n) */
    val mStkCnyRefillPayResult: Column[String] = column[String]("m_stk_cny_refill_pay_result", O.Length(2,varying=false), O.Default("n"))
    /** Database column m_stk_cny_refill_result_date DBType(DATETIME), Default(None) */
    val mStkCnyRefillResultDate: Column[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("m_stk_cny_refill_result_date", O.Default(None))
    /** Database column m_stk_cny_refill_deal_id DBType(CHAR), Length(30,false), Default(None) */
    val mStkCnyRefillDealId: Column[Option[String]] = column[Option[String]]("m_stk_cny_refill_deal_id", O.Length(30,varying=false), O.Default(None))
    /** Database column m_stk_cny_refill_bank_deal_id DBType(CHAR), Length(30,false), Default(None) */
    val mStkCnyRefillBankDealId: Column[Option[String]] = column[Option[String]]("m_stk_cny_refill_bank_deal_id", O.Length(30,varying=false), O.Default(None))
    /** Database column m_stk_cny_refill_deal_time DBType(CHAR), Length(14,false), Default(None) */
    val mStkCnyRefillDealTime: Column[Option[String]] = column[Option[String]]("m_stk_cny_refill_deal_time", O.Length(14,varying=false), O.Default(None))
    /** Database column m_stk_cny_refill_fee DBType(INT), Default(None) */
    val mStkCnyRefillFee: Column[Option[Int]] = column[Option[Int]]("m_stk_cny_refill_fee", O.Default(None))
    /** Database column m_stk_cny_refill_err_code DBType(CHAR), Length(10,false), Default(None) */
    val mStkCnyRefillErrCode: Column[Option[String]] = column[Option[String]]("m_stk_cny_refill_err_code", O.Length(10,varying=false), O.Default(None))
    /** Database column m_stk_cny_refill_signmsg DBType(VARCHAR), Length(256,true) */
    val mStkCnyRefillSignmsg: Column[String] = column[String]("m_stk_cny_refill_signmsg", O.Length(256,varying=true))
    /** Database column m_stk_cny_refill_create_date DBType(DATETIME) */
    val mStkCnyRefillCreateDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_cny_refill_create_date")
    /** Database column m_stk_cny_refill_result_signmsg DBType(VARCHAR), Length(256,true), Default(None) */
    val mStkCnyRefillResultSignmsg: Column[Option[String]] = column[Option[String]]("m_stk_cny_refill_result_signmsg", O.Length(256,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table MStkCnyRefill */
  lazy val MStkCnyRefill = new TableQuery(tag => new MStkCnyRefill(tag))
  
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
  case class MStkCreditRow(mStkCreditId: Int, money: scala.math.BigDecimal, lastFreezed: java.sql.Date, freezedStatus: Boolean = true, makerId: Int, orderId: Int, title: String, note: String, created: java.sql.Timestamp, finished: java.sql.Timestamp, paymentType: Boolean = false, fundType: Boolean = false)
  /** GetResult implicit for fetching MStkCreditRow objects using plain SQL queries */
  implicit def GetResultMStkCreditRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[java.sql.Date], e3: GR[Boolean], e4: GR[String], e5: GR[java.sql.Timestamp]): GR[MStkCreditRow] = GR{
    prs => import prs._
    MStkCreditRow.tupled((<<[Int], <<[scala.math.BigDecimal], <<[java.sql.Date], <<[Boolean], <<[Int], <<[Int], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Boolean], <<[Boolean]))
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
    val freezedStatus: Column[Boolean] = column[Boolean]("freezed_status", O.Default(true))
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
    val paymentType: Column[Boolean] = column[Boolean]("payment_type", O.Default(false))
    /** Database column fund_type DBType(BIT), Default(false) */
    val fundType: Column[Boolean] = column[Boolean]("fund_type", O.Default(false))
  }
  /** Collection-like TableQuery object for table MStkCredit */
  lazy val MStkCredit = new TableQuery(tag => new MStkCredit(tag))
  
  /** Entity class storing rows of table MStkGetCny
   *  @param mStkGetCnyId Database column m_stk_get_cny_id DBType(INT), AutoInc, PrimaryKey
   *  @param mStkGetCnyMRegionCityName Database column m_stk_get_cny_m_region_city_name DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyMMakerBankCode Database column m_stk_get_cny_m_maker_bank_code DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyMMakerBankBranchCode Database column m_stk_get_cny_m_maker_bank_branch_code DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyMMakerCompanyNameCh Database column m_stk_get_cny_m_maker_company_name_ch DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyMMakerBankNumber Database column m_stk_get_cny_m_maker_bank_number DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyMStkPayCnyPrice Database column m_stk_get_cny_m_stk_pay_cny_price DBType(DECIMAL)
   *  @param mStkGetCnyCost Database column m_stk_get_cny_cost DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyOutOfPocket Database column m_stk_get_cny_out_of_pocket DBType(DECIMAL)
   *  @param mStkGetCnyActualMoney Database column m_stk_get_cny_actual_money DBType(DECIMAL)
   *  @param mStkGetCnyCostPayment Database column m_stk_get_cny_cost_payment DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyRefundment Database column m_stk_get_cny_refundment DBType(VARCHAR), Length(50,true)
   *  @param mStkGetCnyWithdrawCash Database column m_stk_get_cny_withdraw_cash DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyOrderId Database column m_stk_get_cny_order_id DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyTransactionNumber Database column m_stk_get_cny_transaction_number DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyState Database column m_stk_get_cny_state DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyBegintime Database column m_stk_get_cny_begintime DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyUpdatetime Database column m_stk_get_cny_updatetime DBType(VARCHAR), Length(100,true)
   *  @param mStkGetCnyFailureCause Database column m_stk_get_cny_failure_cause DBType(VARCHAR), Length(250,true)
   *  @param mStkGetCnyFlag Database column m_stk_get_cny_flag DBType(INT), Default(0)
   *  @param mStkGetCnyUploadtime Database column m_stk_get_cny_uploadtime DBType(DATETIME) */
  case class MStkGetCnyRow(mStkGetCnyId: Int, mStkGetCnyMRegionCityName: String, mStkGetCnyMMakerBankCode: String, mStkGetCnyMMakerBankBranchCode: String, mStkGetCnyMMakerCompanyNameCh: String, mStkGetCnyMMakerBankNumber: String, mStkGetCnyMStkPayCnyPrice: scala.math.BigDecimal, mStkGetCnyCost: String, mStkGetCnyOutOfPocket: scala.math.BigDecimal, mStkGetCnyActualMoney: scala.math.BigDecimal, mStkGetCnyCostPayment: String, mStkGetCnyRefundment: String, mStkGetCnyWithdrawCash: String, mStkGetCnyOrderId: String, mStkGetCnyTransactionNumber: String, mStkGetCnyState: String, mStkGetCnyBegintime: String, mStkGetCnyUpdatetime: String, mStkGetCnyFailureCause: String, mStkGetCnyFlag: Int = 0, mStkGetCnyUploadtime: java.sql.Timestamp)
  /** GetResult implicit for fetching MStkGetCnyRow objects using plain SQL queries */
  implicit def GetResultMStkGetCnyRow(implicit e0: GR[Int], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[java.sql.Timestamp]): GR[MStkGetCnyRow] = GR{
    prs => import prs._
    MStkGetCnyRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[String], <<[String], <<[scala.math.BigDecimal], <<[String], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_stk_get_cny. Objects of this class serve as prototypes for rows in queries. */
  class MStkGetCny(_tableTag: Tag) extends Table[MStkGetCnyRow](_tableTag, "m_stk_get_cny") {
    def * = (mStkGetCnyId, mStkGetCnyMRegionCityName, mStkGetCnyMMakerBankCode, mStkGetCnyMMakerBankBranchCode, mStkGetCnyMMakerCompanyNameCh, mStkGetCnyMMakerBankNumber, mStkGetCnyMStkPayCnyPrice, mStkGetCnyCost, mStkGetCnyOutOfPocket, mStkGetCnyActualMoney, mStkGetCnyCostPayment, mStkGetCnyRefundment, mStkGetCnyWithdrawCash, mStkGetCnyOrderId, mStkGetCnyTransactionNumber, mStkGetCnyState, mStkGetCnyBegintime, mStkGetCnyUpdatetime, mStkGetCnyFailureCause, mStkGetCnyFlag, mStkGetCnyUploadtime) <> (MStkGetCnyRow.tupled, MStkGetCnyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkGetCnyId.?, mStkGetCnyMRegionCityName.?, mStkGetCnyMMakerBankCode.?, mStkGetCnyMMakerBankBranchCode.?, mStkGetCnyMMakerCompanyNameCh.?, mStkGetCnyMMakerBankNumber.?, mStkGetCnyMStkPayCnyPrice.?, mStkGetCnyCost.?, mStkGetCnyOutOfPocket.?, mStkGetCnyActualMoney.?, mStkGetCnyCostPayment.?, mStkGetCnyRefundment.?, mStkGetCnyWithdrawCash.?, mStkGetCnyOrderId.?, mStkGetCnyTransactionNumber.?, mStkGetCnyState.?, mStkGetCnyBegintime.?, mStkGetCnyUpdatetime.?, mStkGetCnyFailureCause.?, mStkGetCnyFlag.?, mStkGetCnyUploadtime.?).shaped.<>({r=>import r._; _1.map(_=> MStkGetCnyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get, _18.get, _19.get, _20.get, _21.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_get_cny_id DBType(INT), AutoInc, PrimaryKey */
    val mStkGetCnyId: Column[Int] = column[Int]("m_stk_get_cny_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_get_cny_m_region_city_name DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyMRegionCityName: Column[String] = column[String]("m_stk_get_cny_m_region_city_name", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_m_maker_bank_code DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyMMakerBankCode: Column[String] = column[String]("m_stk_get_cny_m_maker_bank_code", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_m_maker_bank_branch_code DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyMMakerBankBranchCode: Column[String] = column[String]("m_stk_get_cny_m_maker_bank_branch_code", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_m_maker_company_name_ch DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyMMakerCompanyNameCh: Column[String] = column[String]("m_stk_get_cny_m_maker_company_name_ch", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_m_maker_bank_number DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyMMakerBankNumber: Column[String] = column[String]("m_stk_get_cny_m_maker_bank_number", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_m_stk_pay_cny_price DBType(DECIMAL) */
    val mStkGetCnyMStkPayCnyPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_get_cny_m_stk_pay_cny_price")
    /** Database column m_stk_get_cny_cost DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyCost: Column[String] = column[String]("m_stk_get_cny_cost", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_out_of_pocket DBType(DECIMAL) */
    val mStkGetCnyOutOfPocket: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_get_cny_out_of_pocket")
    /** Database column m_stk_get_cny_actual_money DBType(DECIMAL) */
    val mStkGetCnyActualMoney: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_get_cny_actual_money")
    /** Database column m_stk_get_cny_cost_payment DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyCostPayment: Column[String] = column[String]("m_stk_get_cny_cost_payment", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_refundment DBType(VARCHAR), Length(50,true) */
    val mStkGetCnyRefundment: Column[String] = column[String]("m_stk_get_cny_refundment", O.Length(50,varying=true))
    /** Database column m_stk_get_cny_withdraw_cash DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyWithdrawCash: Column[String] = column[String]("m_stk_get_cny_withdraw_cash", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_order_id DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyOrderId: Column[String] = column[String]("m_stk_get_cny_order_id", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_transaction_number DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyTransactionNumber: Column[String] = column[String]("m_stk_get_cny_transaction_number", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_state DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyState: Column[String] = column[String]("m_stk_get_cny_state", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_begintime DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyBegintime: Column[String] = column[String]("m_stk_get_cny_begintime", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_updatetime DBType(VARCHAR), Length(100,true) */
    val mStkGetCnyUpdatetime: Column[String] = column[String]("m_stk_get_cny_updatetime", O.Length(100,varying=true))
    /** Database column m_stk_get_cny_failure_cause DBType(VARCHAR), Length(250,true) */
    val mStkGetCnyFailureCause: Column[String] = column[String]("m_stk_get_cny_failure_cause", O.Length(250,varying=true))
    /** Database column m_stk_get_cny_flag DBType(INT), Default(0) */
    val mStkGetCnyFlag: Column[Int] = column[Int]("m_stk_get_cny_flag", O.Default(0))
    /** Database column m_stk_get_cny_uploadtime DBType(DATETIME) */
    val mStkGetCnyUploadtime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_get_cny_uploadtime")
  }
  /** Collection-like TableQuery object for table MStkGetCny */
  lazy val MStkGetCny = new TableQuery(tag => new MStkGetCny(tag))
  
  /** Entity class storing rows of table MStkGetUsd
   *  @param mStkGetUsdId Database column m_stk_get_usd_id DBType(INT), AutoInc, PrimaryKey
   *  @param mStkGetUsdMRegionCityName Database column m_stk_get_usd_m_region_city_name DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdMMakerBankCode Database column m_stk_get_usd_m_maker_bank_code DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdMMakerBankBranchCode Database column m_stk_get_usd_m_maker_bank_branch_code DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdMMakerCompanyNameCh Database column m_stk_get_usd_m_maker_company_name_ch DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdMMakerBankNumber Database column m_stk_get_usd_m_maker_bank_number DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdMStkPayUsdPrice Database column m_stk_get_usd_m_stk_pay_usd_price DBType(DECIMAL)
   *  @param mStkGetUsdCost Database column m_stk_get_usd_cost DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdOutOfPocket Database column m_stk_get_usd_out_of_pocket DBType(DECIMAL)
   *  @param mStkGetUsdActualMoney Database column m_stk_get_usd_actual_money DBType(DECIMAL)
   *  @param mStkGetUsdCostPayment Database column m_stk_get_usd_cost_payment DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdRefundment Database column m_stk_get_usd_refundment DBType(VARCHAR), Length(50,true)
   *  @param mStkGetUsdWithdrawCash Database column m_stk_get_usd_withdraw_cash DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdOrderId Database column m_stk_get_usd_order_id DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdTransactionNumber Database column m_stk_get_usd_transaction_number DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdState Database column m_stk_get_usd_state DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdBegintime Database column m_stk_get_usd_begintime DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdUpdatetime Database column m_stk_get_usd_updatetime DBType(VARCHAR), Length(100,true)
   *  @param mStkGetUsdFailureCause Database column m_stk_get_usd_failure_cause DBType(VARCHAR), Length(250,true)
   *  @param mStkGetUsdFlag Database column m_stk_get_usd_flag DBType(INT), Default(0)
   *  @param mStkGetUsdUploadtime Database column m_stk_get_usd_uploadtime DBType(DATETIME) */
  case class MStkGetUsdRow(mStkGetUsdId: Int, mStkGetUsdMRegionCityName: String, mStkGetUsdMMakerBankCode: String, mStkGetUsdMMakerBankBranchCode: String, mStkGetUsdMMakerCompanyNameCh: String, mStkGetUsdMMakerBankNumber: String, mStkGetUsdMStkPayUsdPrice: scala.math.BigDecimal, mStkGetUsdCost: String, mStkGetUsdOutOfPocket: scala.math.BigDecimal, mStkGetUsdActualMoney: scala.math.BigDecimal, mStkGetUsdCostPayment: String, mStkGetUsdRefundment: String, mStkGetUsdWithdrawCash: String, mStkGetUsdOrderId: String, mStkGetUsdTransactionNumber: String, mStkGetUsdState: String, mStkGetUsdBegintime: String, mStkGetUsdUpdatetime: String, mStkGetUsdFailureCause: String, mStkGetUsdFlag: Int = 0, mStkGetUsdUploadtime: java.sql.Timestamp)
  /** GetResult implicit for fetching MStkGetUsdRow objects using plain SQL queries */
  implicit def GetResultMStkGetUsdRow(implicit e0: GR[Int], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[java.sql.Timestamp]): GR[MStkGetUsdRow] = GR{
    prs => import prs._
    MStkGetUsdRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[String], <<[String], <<[scala.math.BigDecimal], <<[String], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_stk_get_usd. Objects of this class serve as prototypes for rows in queries. */
  class MStkGetUsd(_tableTag: Tag) extends Table[MStkGetUsdRow](_tableTag, "m_stk_get_usd") {
    def * = (mStkGetUsdId, mStkGetUsdMRegionCityName, mStkGetUsdMMakerBankCode, mStkGetUsdMMakerBankBranchCode, mStkGetUsdMMakerCompanyNameCh, mStkGetUsdMMakerBankNumber, mStkGetUsdMStkPayUsdPrice, mStkGetUsdCost, mStkGetUsdOutOfPocket, mStkGetUsdActualMoney, mStkGetUsdCostPayment, mStkGetUsdRefundment, mStkGetUsdWithdrawCash, mStkGetUsdOrderId, mStkGetUsdTransactionNumber, mStkGetUsdState, mStkGetUsdBegintime, mStkGetUsdUpdatetime, mStkGetUsdFailureCause, mStkGetUsdFlag, mStkGetUsdUploadtime) <> (MStkGetUsdRow.tupled, MStkGetUsdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkGetUsdId.?, mStkGetUsdMRegionCityName.?, mStkGetUsdMMakerBankCode.?, mStkGetUsdMMakerBankBranchCode.?, mStkGetUsdMMakerCompanyNameCh.?, mStkGetUsdMMakerBankNumber.?, mStkGetUsdMStkPayUsdPrice.?, mStkGetUsdCost.?, mStkGetUsdOutOfPocket.?, mStkGetUsdActualMoney.?, mStkGetUsdCostPayment.?, mStkGetUsdRefundment.?, mStkGetUsdWithdrawCash.?, mStkGetUsdOrderId.?, mStkGetUsdTransactionNumber.?, mStkGetUsdState.?, mStkGetUsdBegintime.?, mStkGetUsdUpdatetime.?, mStkGetUsdFailureCause.?, mStkGetUsdFlag.?, mStkGetUsdUploadtime.?).shaped.<>({r=>import r._; _1.map(_=> MStkGetUsdRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get, _18.get, _19.get, _20.get, _21.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_get_usd_id DBType(INT), AutoInc, PrimaryKey */
    val mStkGetUsdId: Column[Int] = column[Int]("m_stk_get_usd_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_get_usd_m_region_city_name DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdMRegionCityName: Column[String] = column[String]("m_stk_get_usd_m_region_city_name", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_m_maker_bank_code DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdMMakerBankCode: Column[String] = column[String]("m_stk_get_usd_m_maker_bank_code", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_m_maker_bank_branch_code DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdMMakerBankBranchCode: Column[String] = column[String]("m_stk_get_usd_m_maker_bank_branch_code", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_m_maker_company_name_ch DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdMMakerCompanyNameCh: Column[String] = column[String]("m_stk_get_usd_m_maker_company_name_ch", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_m_maker_bank_number DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdMMakerBankNumber: Column[String] = column[String]("m_stk_get_usd_m_maker_bank_number", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_m_stk_pay_usd_price DBType(DECIMAL) */
    val mStkGetUsdMStkPayUsdPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_get_usd_m_stk_pay_usd_price")
    /** Database column m_stk_get_usd_cost DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdCost: Column[String] = column[String]("m_stk_get_usd_cost", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_out_of_pocket DBType(DECIMAL) */
    val mStkGetUsdOutOfPocket: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_get_usd_out_of_pocket")
    /** Database column m_stk_get_usd_actual_money DBType(DECIMAL) */
    val mStkGetUsdActualMoney: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_get_usd_actual_money")
    /** Database column m_stk_get_usd_cost_payment DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdCostPayment: Column[String] = column[String]("m_stk_get_usd_cost_payment", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_refundment DBType(VARCHAR), Length(50,true) */
    val mStkGetUsdRefundment: Column[String] = column[String]("m_stk_get_usd_refundment", O.Length(50,varying=true))
    /** Database column m_stk_get_usd_withdraw_cash DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdWithdrawCash: Column[String] = column[String]("m_stk_get_usd_withdraw_cash", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_order_id DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdOrderId: Column[String] = column[String]("m_stk_get_usd_order_id", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_transaction_number DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdTransactionNumber: Column[String] = column[String]("m_stk_get_usd_transaction_number", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_state DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdState: Column[String] = column[String]("m_stk_get_usd_state", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_begintime DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdBegintime: Column[String] = column[String]("m_stk_get_usd_begintime", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_updatetime DBType(VARCHAR), Length(100,true) */
    val mStkGetUsdUpdatetime: Column[String] = column[String]("m_stk_get_usd_updatetime", O.Length(100,varying=true))
    /** Database column m_stk_get_usd_failure_cause DBType(VARCHAR), Length(250,true) */
    val mStkGetUsdFailureCause: Column[String] = column[String]("m_stk_get_usd_failure_cause", O.Length(250,varying=true))
    /** Database column m_stk_get_usd_flag DBType(INT), Default(0) */
    val mStkGetUsdFlag: Column[Int] = column[Int]("m_stk_get_usd_flag", O.Default(0))
    /** Database column m_stk_get_usd_uploadtime DBType(DATETIME) */
    val mStkGetUsdUploadtime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_get_usd_uploadtime")
  }
  /** Collection-like TableQuery object for table MStkGetUsd */
  lazy val MStkGetUsd = new TableQuery(tag => new MStkGetUsd(tag))
  
  /** Entity class storing rows of table MStkJpy
   *  @param mStkJpyId Database column m_stk_jpy_id DBType(INT), AutoInc, PrimaryKey
   *  @param mStkJpyMCustomerId Database column m_stk_jpy_m_customer_id DBType(INT)
   *  @param mStkJpyRelationCode Database column m_stk_jpy_relation_code DBType(VARCHAR), Length(100,true)
   *  @param mStkJpyTitle Database column m_stk_jpy_title DBType(VARCHAR), Length(100,true)
   *  @param mStkJpyNote Database column m_stk_jpy_note DBType(TEXT), Length(65535,true)
   *  @param mStkJpyPrice Database column m_stk_jpy_price DBType(INT)
   *  @param mStkJpyLatestBalance Database column m_stk_jpy_latest_balance DBType(INT)
   *  @param mStkJpyNyukinType Database column m_stk_jpy_nyukin_type DBType(BIT), Default(false)
   *  @param mStkJpyCreatedate Database column m_stk_jpy_createdate DBType(DATETIME)
   *  @param mStkJpyFlag Database column m_stk_jpy_flag DBType(TINYINT UNSIGNED), Default(0) */
  case class MStkJpyRow(mStkJpyId: Int, mStkJpyMCustomerId: Int, mStkJpyRelationCode: String, mStkJpyTitle: String, mStkJpyNote: String, mStkJpyPrice: Int, mStkJpyLatestBalance: Int, mStkJpyNyukinType: Boolean = false, mStkJpyCreatedate: java.sql.Timestamp, mStkJpyFlag: Byte = 0)
  /** GetResult implicit for fetching MStkJpyRow objects using plain SQL queries */
  implicit def GetResultMStkJpyRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Boolean], e3: GR[java.sql.Timestamp], e4: GR[Byte]): GR[MStkJpyRow] = GR{
    prs => import prs._
    MStkJpyRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[Boolean], <<[java.sql.Timestamp], <<[Byte]))
  }
  /** Table description of table m_stk_jpy. Objects of this class serve as prototypes for rows in queries. */
  class MStkJpy(_tableTag: Tag) extends Table[MStkJpyRow](_tableTag, "m_stk_jpy") {
    def * = (mStkJpyId, mStkJpyMCustomerId, mStkJpyRelationCode, mStkJpyTitle, mStkJpyNote, mStkJpyPrice, mStkJpyLatestBalance, mStkJpyNyukinType, mStkJpyCreatedate, mStkJpyFlag) <> (MStkJpyRow.tupled, MStkJpyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkJpyId.?, mStkJpyMCustomerId.?, mStkJpyRelationCode.?, mStkJpyTitle.?, mStkJpyNote.?, mStkJpyPrice.?, mStkJpyLatestBalance.?, mStkJpyNyukinType.?, mStkJpyCreatedate.?, mStkJpyFlag.?).shaped.<>({r=>import r._; _1.map(_=> MStkJpyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_jpy_id DBType(INT), AutoInc, PrimaryKey */
    val mStkJpyId: Column[Int] = column[Int]("m_stk_jpy_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_jpy_m_customer_id DBType(INT) */
    val mStkJpyMCustomerId: Column[Int] = column[Int]("m_stk_jpy_m_customer_id")
    /** Database column m_stk_jpy_relation_code DBType(VARCHAR), Length(100,true) */
    val mStkJpyRelationCode: Column[String] = column[String]("m_stk_jpy_relation_code", O.Length(100,varying=true))
    /** Database column m_stk_jpy_title DBType(VARCHAR), Length(100,true) */
    val mStkJpyTitle: Column[String] = column[String]("m_stk_jpy_title", O.Length(100,varying=true))
    /** Database column m_stk_jpy_note DBType(TEXT), Length(65535,true) */
    val mStkJpyNote: Column[String] = column[String]("m_stk_jpy_note", O.Length(65535,varying=true))
    /** Database column m_stk_jpy_price DBType(INT) */
    val mStkJpyPrice: Column[Int] = column[Int]("m_stk_jpy_price")
    /** Database column m_stk_jpy_latest_balance DBType(INT) */
    val mStkJpyLatestBalance: Column[Int] = column[Int]("m_stk_jpy_latest_balance")
    /** Database column m_stk_jpy_nyukin_type DBType(BIT), Default(false) */
    val mStkJpyNyukinType: Column[Boolean] = column[Boolean]("m_stk_jpy_nyukin_type", O.Default(false))
    /** Database column m_stk_jpy_createdate DBType(DATETIME) */
    val mStkJpyCreatedate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_jpy_createdate")
    /** Database column m_stk_jpy_flag DBType(TINYINT UNSIGNED), Default(0) */
    val mStkJpyFlag: Column[Byte] = column[Byte]("m_stk_jpy_flag", O.Default(0))
  }
  /** Collection-like TableQuery object for table MStkJpy */
  lazy val MStkJpy = new TableQuery(tag => new MStkJpy(tag))
  
  /** Entity class storing rows of table MStkPayCny
   *  @param mStkPayCnyId Database column m_stk_pay_cny_id DBType(INT), AutoInc, PrimaryKey
   *  @param mStkPayCnyMStkCnyId Database column m_stk_pay_cny_m_stk_cny_id DBType(INT)
   *  @param mStkPayCnyMMakerId Database column m_stk_pay_cny_m_maker_id DBType(INT)
   *  @param mStkPayCnyPrice Database column m_stk_pay_cny_price DBType(DECIMAL)
   *  @param mStkPayCnyOutputDatetime Database column m_stk_pay_cny_output_datetime DBType(DATETIME)
   *  @param mStkPayCnyCreateDatetime Database column m_stk_pay_cny_create_datetime DBType(DATETIME)
   *  @param mStkPayCnyChange Database column m_stk_pay_cny_change DBType(INT), Default(0)
   *  @param mStkPayCnyMemo Database column m_stk_pay_cny_memo DBType(TEXT), Length(65535,true) */
  case class MStkPayCnyRow(mStkPayCnyId: Int, mStkPayCnyMStkCnyId: Int, mStkPayCnyMMakerId: Int, mStkPayCnyPrice: scala.math.BigDecimal, mStkPayCnyOutputDatetime: java.sql.Timestamp, mStkPayCnyCreateDatetime: java.sql.Timestamp, mStkPayCnyChange: Int = 0, mStkPayCnyMemo: String)
  /** GetResult implicit for fetching MStkPayCnyRow objects using plain SQL queries */
  implicit def GetResultMStkPayCnyRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[java.sql.Timestamp], e3: GR[String]): GR[MStkPayCnyRow] = GR{
    prs => import prs._
    MStkPayCnyRow.tupled((<<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[String]))
  }
  /** Table description of table m_stk_pay_cny. Objects of this class serve as prototypes for rows in queries. */
  class MStkPayCny(_tableTag: Tag) extends Table[MStkPayCnyRow](_tableTag, "m_stk_pay_cny") {
    def * = (mStkPayCnyId, mStkPayCnyMStkCnyId, mStkPayCnyMMakerId, mStkPayCnyPrice, mStkPayCnyOutputDatetime, mStkPayCnyCreateDatetime, mStkPayCnyChange, mStkPayCnyMemo) <> (MStkPayCnyRow.tupled, MStkPayCnyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkPayCnyId.?, mStkPayCnyMStkCnyId.?, mStkPayCnyMMakerId.?, mStkPayCnyPrice.?, mStkPayCnyOutputDatetime.?, mStkPayCnyCreateDatetime.?, mStkPayCnyChange.?, mStkPayCnyMemo.?).shaped.<>({r=>import r._; _1.map(_=> MStkPayCnyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_pay_cny_id DBType(INT), AutoInc, PrimaryKey */
    val mStkPayCnyId: Column[Int] = column[Int]("m_stk_pay_cny_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_pay_cny_m_stk_cny_id DBType(INT) */
    val mStkPayCnyMStkCnyId: Column[Int] = column[Int]("m_stk_pay_cny_m_stk_cny_id")
    /** Database column m_stk_pay_cny_m_maker_id DBType(INT) */
    val mStkPayCnyMMakerId: Column[Int] = column[Int]("m_stk_pay_cny_m_maker_id")
    /** Database column m_stk_pay_cny_price DBType(DECIMAL) */
    val mStkPayCnyPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_pay_cny_price")
    /** Database column m_stk_pay_cny_output_datetime DBType(DATETIME) */
    val mStkPayCnyOutputDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_pay_cny_output_datetime")
    /** Database column m_stk_pay_cny_create_datetime DBType(DATETIME) */
    val mStkPayCnyCreateDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_pay_cny_create_datetime")
    /** Database column m_stk_pay_cny_change DBType(INT), Default(0) */
    val mStkPayCnyChange: Column[Int] = column[Int]("m_stk_pay_cny_change", O.Default(0))
    /** Database column m_stk_pay_cny_memo DBType(TEXT), Length(65535,true) */
    val mStkPayCnyMemo: Column[String] = column[String]("m_stk_pay_cny_memo", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table MStkPayCny */
  lazy val MStkPayCny = new TableQuery(tag => new MStkPayCny(tag))
  
  /** Entity class storing rows of table MStkPayCnyCopy
   *  @param mStkPayCnyCopyId Database column m_stk_pay_cny_copy_id DBType(INT), AutoInc, PrimaryKey
   *  @param mStkPayCnyCopyMStkCnyId Database column m_stk_pay_cny_copy_m_stk_cny_id DBType(INT)
   *  @param mStkPayCnyCopyMMakerId Database column m_stk_pay_cny_copy_m_maker_id DBType(INT)
   *  @param mStkPayCnyCopyPrice Database column m_stk_pay_cny_copy_price DBType(DECIMAL)
   *  @param mStkPayCnyCopyOutputDatetime Database column m_stk_pay_cny_copy_output_datetime DBType(DATETIME)
   *  @param mStkPayCnyCopyCreateDatetime Database column m_stk_pay_cny_copy_create_datetime DBType(DATETIME)
   *  @param mStkPayCnyCopyMUserId Database column m_stk_pay_cny_copy_m_user_id DBType(INT), Default(0)
   *  @param mStkPayCnyCopyCancelDatetime Database column m_stk_pay_cny_copy_cancel_datetime DBType(DATETIME)
   *  @param mStkPayCnyCopyMemo Database column m_stk_pay_cny_copy_memo DBType(TEXT), Length(65535,true)
   *  @param mStkPayCnyCopyChange Database column m_stk_pay_cny_copy_change DBType(INT), Default(0) */
  case class MStkPayCnyCopyRow(mStkPayCnyCopyId: Int, mStkPayCnyCopyMStkCnyId: Int, mStkPayCnyCopyMMakerId: Int, mStkPayCnyCopyPrice: scala.math.BigDecimal, mStkPayCnyCopyOutputDatetime: java.sql.Timestamp, mStkPayCnyCopyCreateDatetime: java.sql.Timestamp, mStkPayCnyCopyMUserId: Int = 0, mStkPayCnyCopyCancelDatetime: java.sql.Timestamp, mStkPayCnyCopyMemo: String, mStkPayCnyCopyChange: Int = 0)
  /** GetResult implicit for fetching MStkPayCnyCopyRow objects using plain SQL queries */
  implicit def GetResultMStkPayCnyCopyRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[java.sql.Timestamp], e3: GR[String]): GR[MStkPayCnyCopyRow] = GR{
    prs => import prs._
    MStkPayCnyCopyRow.tupled((<<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[java.sql.Timestamp], <<[String], <<[Int]))
  }
  /** Table description of table m_stk_pay_cny_copy. Objects of this class serve as prototypes for rows in queries. */
  class MStkPayCnyCopy(_tableTag: Tag) extends Table[MStkPayCnyCopyRow](_tableTag, "m_stk_pay_cny_copy") {
    def * = (mStkPayCnyCopyId, mStkPayCnyCopyMStkCnyId, mStkPayCnyCopyMMakerId, mStkPayCnyCopyPrice, mStkPayCnyCopyOutputDatetime, mStkPayCnyCopyCreateDatetime, mStkPayCnyCopyMUserId, mStkPayCnyCopyCancelDatetime, mStkPayCnyCopyMemo, mStkPayCnyCopyChange) <> (MStkPayCnyCopyRow.tupled, MStkPayCnyCopyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkPayCnyCopyId.?, mStkPayCnyCopyMStkCnyId.?, mStkPayCnyCopyMMakerId.?, mStkPayCnyCopyPrice.?, mStkPayCnyCopyOutputDatetime.?, mStkPayCnyCopyCreateDatetime.?, mStkPayCnyCopyMUserId.?, mStkPayCnyCopyCancelDatetime.?, mStkPayCnyCopyMemo.?, mStkPayCnyCopyChange.?).shaped.<>({r=>import r._; _1.map(_=> MStkPayCnyCopyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_pay_cny_copy_id DBType(INT), AutoInc, PrimaryKey */
    val mStkPayCnyCopyId: Column[Int] = column[Int]("m_stk_pay_cny_copy_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_pay_cny_copy_m_stk_cny_id DBType(INT) */
    val mStkPayCnyCopyMStkCnyId: Column[Int] = column[Int]("m_stk_pay_cny_copy_m_stk_cny_id")
    /** Database column m_stk_pay_cny_copy_m_maker_id DBType(INT) */
    val mStkPayCnyCopyMMakerId: Column[Int] = column[Int]("m_stk_pay_cny_copy_m_maker_id")
    /** Database column m_stk_pay_cny_copy_price DBType(DECIMAL) */
    val mStkPayCnyCopyPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_pay_cny_copy_price")
    /** Database column m_stk_pay_cny_copy_output_datetime DBType(DATETIME) */
    val mStkPayCnyCopyOutputDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_pay_cny_copy_output_datetime")
    /** Database column m_stk_pay_cny_copy_create_datetime DBType(DATETIME) */
    val mStkPayCnyCopyCreateDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_pay_cny_copy_create_datetime")
    /** Database column m_stk_pay_cny_copy_m_user_id DBType(INT), Default(0) */
    val mStkPayCnyCopyMUserId: Column[Int] = column[Int]("m_stk_pay_cny_copy_m_user_id", O.Default(0))
    /** Database column m_stk_pay_cny_copy_cancel_datetime DBType(DATETIME) */
    val mStkPayCnyCopyCancelDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_pay_cny_copy_cancel_datetime")
    /** Database column m_stk_pay_cny_copy_memo DBType(TEXT), Length(65535,true) */
    val mStkPayCnyCopyMemo: Column[String] = column[String]("m_stk_pay_cny_copy_memo", O.Length(65535,varying=true))
    /** Database column m_stk_pay_cny_copy_change DBType(INT), Default(0) */
    val mStkPayCnyCopyChange: Column[Int] = column[Int]("m_stk_pay_cny_copy_change", O.Default(0))
  }
  /** Collection-like TableQuery object for table MStkPayCnyCopy */
  lazy val MStkPayCnyCopy = new TableQuery(tag => new MStkPayCnyCopy(tag))
  
  /** Entity class storing rows of table MStkPayUsd
   *  @param mStkPayUsdId Database column m_stk_pay_usd_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mStkPayUsdMStkUsdId Database column m_stk_pay_usd_m_stk_usd_id DBType(INT)
   *  @param mStkPayUsdMMakerId Database column m_stk_pay_usd_m_maker_id DBType(INT)
   *  @param mStkPayUsdPrice Database column m_stk_pay_usd_price DBType(DECIMAL)
   *  @param mStkPayUsdCurrency Database column m_stk_pay_usd_currency DBType(INT), Default(1)
   *  @param mStkPayUsdMoneyCurrency Database column m_stk_pay_usd_money_currency DBType(BIT)
   *  @param mStkPayUsdOutputDatetime Database column m_stk_pay_usd_output_datetime DBType(DATETIME)
   *  @param mStkPayUsdCreateDatetime Database column m_stk_pay_usd_create_datetime DBType(DATETIME)
   *  @param mStkPayUsdChange Database column m_stk_pay_usd_change DBType(INT), Default(0)
   *  @param mStkPayUsdMemo Database column m_stk_pay_usd_memo DBType(TEXT), Length(65535,true) */
  case class MStkPayUsdRow(mStkPayUsdId: Int, mStkPayUsdMStkUsdId: Int, mStkPayUsdMMakerId: Int, mStkPayUsdPrice: scala.math.BigDecimal, mStkPayUsdCurrency: Int = 1, mStkPayUsdMoneyCurrency: Option[Boolean], mStkPayUsdOutputDatetime: java.sql.Timestamp, mStkPayUsdCreateDatetime: java.sql.Timestamp, mStkPayUsdChange: Int = 0, mStkPayUsdMemo: String)
  /** GetResult implicit for fetching MStkPayUsdRow objects using plain SQL queries */
  implicit def GetResultMStkPayUsdRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[Option[Boolean]], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[MStkPayUsdRow] = GR{
    prs => import prs._
    MStkPayUsdRow.tupled((<<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[Int], <<?[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[String]))
  }
  /** Table description of table m_stk_pay_usd. Objects of this class serve as prototypes for rows in queries. */
  class MStkPayUsd(_tableTag: Tag) extends Table[MStkPayUsdRow](_tableTag, "m_stk_pay_usd") {
    def * = (mStkPayUsdId, mStkPayUsdMStkUsdId, mStkPayUsdMMakerId, mStkPayUsdPrice, mStkPayUsdCurrency, mStkPayUsdMoneyCurrency, mStkPayUsdOutputDatetime, mStkPayUsdCreateDatetime, mStkPayUsdChange, mStkPayUsdMemo) <> (MStkPayUsdRow.tupled, MStkPayUsdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkPayUsdId.?, mStkPayUsdMStkUsdId.?, mStkPayUsdMMakerId.?, mStkPayUsdPrice.?, mStkPayUsdCurrency.?, mStkPayUsdMoneyCurrency, mStkPayUsdOutputDatetime.?, mStkPayUsdCreateDatetime.?, mStkPayUsdChange.?, mStkPayUsdMemo.?).shaped.<>({r=>import r._; _1.map(_=> MStkPayUsdRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_pay_usd_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mStkPayUsdId: Column[Int] = column[Int]("m_stk_pay_usd_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_pay_usd_m_stk_usd_id DBType(INT) */
    val mStkPayUsdMStkUsdId: Column[Int] = column[Int]("m_stk_pay_usd_m_stk_usd_id")
    /** Database column m_stk_pay_usd_m_maker_id DBType(INT) */
    val mStkPayUsdMMakerId: Column[Int] = column[Int]("m_stk_pay_usd_m_maker_id")
    /** Database column m_stk_pay_usd_price DBType(DECIMAL) */
    val mStkPayUsdPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_pay_usd_price")
    /** Database column m_stk_pay_usd_currency DBType(INT), Default(1) */
    val mStkPayUsdCurrency: Column[Int] = column[Int]("m_stk_pay_usd_currency", O.Default(1))
    /** Database column m_stk_pay_usd_money_currency DBType(BIT) */
    val mStkPayUsdMoneyCurrency: Column[Option[Boolean]] = column[Option[Boolean]]("m_stk_pay_usd_money_currency")
    /** Database column m_stk_pay_usd_output_datetime DBType(DATETIME) */
    val mStkPayUsdOutputDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_pay_usd_output_datetime")
    /** Database column m_stk_pay_usd_create_datetime DBType(DATETIME) */
    val mStkPayUsdCreateDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_pay_usd_create_datetime")
    /** Database column m_stk_pay_usd_change DBType(INT), Default(0) */
    val mStkPayUsdChange: Column[Int] = column[Int]("m_stk_pay_usd_change", O.Default(0))
    /** Database column m_stk_pay_usd_memo DBType(TEXT), Length(65535,true) */
    val mStkPayUsdMemo: Column[String] = column[String]("m_stk_pay_usd_memo", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table MStkPayUsd */
  lazy val MStkPayUsd = new TableQuery(tag => new MStkPayUsd(tag))
  
  /** Entity class storing rows of table MStkPayUsdCopy
   *  @param mStkPayUsdCopyId Database column m_stk_pay_usd_copy_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param mStkPayUsdCopyMStkUsdId Database column m_stk_pay_usd_copy_m_stk_usd_id DBType(INT)
   *  @param mStkPayUsdCopyMMakerId Database column m_stk_pay_usd_copy_m_maker_id DBType(INT)
   *  @param mStkPayUsdCopyPrice Database column m_stk_pay_usd_copy_price DBType(DECIMAL)
   *  @param mStkPayUsdCopyCurrency Database column m_stk_pay_usd_copy_currency DBType(INT), Default(1)
   *  @param mStkPayUsdCopyOutputDatetime Database column m_stk_pay_usd_copy_output_datetime DBType(DATETIME)
   *  @param mStkPayUsdCopyCreateDatetime Database column m_stk_pay_usd_copy_create_datetime DBType(DATETIME)
   *  @param mStkPayUsdCopyMUserId Database column m_stk_pay_usd_copy_m_user_id DBType(INT), Default(0)
   *  @param mStkPayUsdCopyCancelDatetime Database column m_stk_pay_usd_copy_cancel_datetime DBType(DATETIME)
   *  @param mStkPayUsdMemo Database column m_stk_pay_usd_memo DBType(TEXT), Length(65535,true)
   *  @param mStkPayUsdChange Database column m_stk_pay_usd_change DBType(INT), Default(0) */
  case class MStkPayUsdCopyRow(mStkPayUsdCopyId: Int, mStkPayUsdCopyMStkUsdId: Int, mStkPayUsdCopyMMakerId: Int, mStkPayUsdCopyPrice: scala.math.BigDecimal, mStkPayUsdCopyCurrency: Int = 1, mStkPayUsdCopyOutputDatetime: java.sql.Timestamp, mStkPayUsdCopyCreateDatetime: java.sql.Timestamp, mStkPayUsdCopyMUserId: Int = 0, mStkPayUsdCopyCancelDatetime: java.sql.Timestamp, mStkPayUsdMemo: String, mStkPayUsdChange: Int = 0)
  /** GetResult implicit for fetching MStkPayUsdCopyRow objects using plain SQL queries */
  implicit def GetResultMStkPayUsdCopyRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[java.sql.Timestamp], e3: GR[String]): GR[MStkPayUsdCopyRow] = GR{
    prs => import prs._
    MStkPayUsdCopyRow.tupled((<<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[java.sql.Timestamp], <<[String], <<[Int]))
  }
  /** Table description of table m_stk_pay_usd_copy. Objects of this class serve as prototypes for rows in queries. */
  class MStkPayUsdCopy(_tableTag: Tag) extends Table[MStkPayUsdCopyRow](_tableTag, "m_stk_pay_usd_copy") {
    def * = (mStkPayUsdCopyId, mStkPayUsdCopyMStkUsdId, mStkPayUsdCopyMMakerId, mStkPayUsdCopyPrice, mStkPayUsdCopyCurrency, mStkPayUsdCopyOutputDatetime, mStkPayUsdCopyCreateDatetime, mStkPayUsdCopyMUserId, mStkPayUsdCopyCancelDatetime, mStkPayUsdMemo, mStkPayUsdChange) <> (MStkPayUsdCopyRow.tupled, MStkPayUsdCopyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkPayUsdCopyId.?, mStkPayUsdCopyMStkUsdId.?, mStkPayUsdCopyMMakerId.?, mStkPayUsdCopyPrice.?, mStkPayUsdCopyCurrency.?, mStkPayUsdCopyOutputDatetime.?, mStkPayUsdCopyCreateDatetime.?, mStkPayUsdCopyMUserId.?, mStkPayUsdCopyCancelDatetime.?, mStkPayUsdMemo.?, mStkPayUsdChange.?).shaped.<>({r=>import r._; _1.map(_=> MStkPayUsdCopyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_pay_usd_copy_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val mStkPayUsdCopyId: Column[Int] = column[Int]("m_stk_pay_usd_copy_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_pay_usd_copy_m_stk_usd_id DBType(INT) */
    val mStkPayUsdCopyMStkUsdId: Column[Int] = column[Int]("m_stk_pay_usd_copy_m_stk_usd_id")
    /** Database column m_stk_pay_usd_copy_m_maker_id DBType(INT) */
    val mStkPayUsdCopyMMakerId: Column[Int] = column[Int]("m_stk_pay_usd_copy_m_maker_id")
    /** Database column m_stk_pay_usd_copy_price DBType(DECIMAL) */
    val mStkPayUsdCopyPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_pay_usd_copy_price")
    /** Database column m_stk_pay_usd_copy_currency DBType(INT), Default(1) */
    val mStkPayUsdCopyCurrency: Column[Int] = column[Int]("m_stk_pay_usd_copy_currency", O.Default(1))
    /** Database column m_stk_pay_usd_copy_output_datetime DBType(DATETIME) */
    val mStkPayUsdCopyOutputDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_pay_usd_copy_output_datetime")
    /** Database column m_stk_pay_usd_copy_create_datetime DBType(DATETIME) */
    val mStkPayUsdCopyCreateDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_pay_usd_copy_create_datetime")
    /** Database column m_stk_pay_usd_copy_m_user_id DBType(INT), Default(0) */
    val mStkPayUsdCopyMUserId: Column[Int] = column[Int]("m_stk_pay_usd_copy_m_user_id", O.Default(0))
    /** Database column m_stk_pay_usd_copy_cancel_datetime DBType(DATETIME) */
    val mStkPayUsdCopyCancelDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_pay_usd_copy_cancel_datetime")
    /** Database column m_stk_pay_usd_memo DBType(TEXT), Length(65535,true) */
    val mStkPayUsdMemo: Column[String] = column[String]("m_stk_pay_usd_memo", O.Length(65535,varying=true))
    /** Database column m_stk_pay_usd_change DBType(INT), Default(0) */
    val mStkPayUsdChange: Column[Int] = column[Int]("m_stk_pay_usd_change", O.Default(0))
  }
  /** Collection-like TableQuery object for table MStkPayUsdCopy */
  lazy val MStkPayUsdCopy = new TableQuery(tag => new MStkPayUsdCopy(tag))
  
  /** Entity class storing rows of table MStkUsd
   *  @param mStkUsdId Database column m_stk_usd_id DBType(INT), AutoInc, PrimaryKey
   *  @param mStkUsdMMakerId Database column m_stk_usd_m_maker_id DBType(INT)
   *  @param mStkUsdTitle Database column m_stk_usd_title DBType(VARCHAR), Length(100,true)
   *  @param mStkUsdNote Database column m_stk_usd_note DBType(TEXT), Length(65535,true)
   *  @param mStkUsdPrice Database column m_stk_usd_price DBType(DECIMAL)
   *  @param mStkUsdCprice Database column m_stk_usd_cprice DBType(DECIMAL), Default(None)
   *  @param mStkUsdLatestBalance Database column m_stk_usd_latest_balance DBType(DECIMAL)
   *  @param mStkUsdCurrency Database column m_stk_usd_currency DBType(BIT)
   *  @param mStkUsdCreatedate Database column m_stk_usd_createdate DBType(DATETIME)
   *  @param mStkUsdFlag Database column m_stk_usd_flag DBType(TINYINT UNSIGNED), Default(0) */
  case class MStkUsdRow(mStkUsdId: Int, mStkUsdMMakerId: Int, mStkUsdTitle: String, mStkUsdNote: String, mStkUsdPrice: scala.math.BigDecimal, mStkUsdCprice: Option[scala.math.BigDecimal] = None, mStkUsdLatestBalance: scala.math.BigDecimal, mStkUsdCurrency: Option[Boolean], mStkUsdCreatedate: java.sql.Timestamp, mStkUsdFlag: Byte = 0)
  /** GetResult implicit for fetching MStkUsdRow objects using plain SQL queries */
  implicit def GetResultMStkUsdRow(implicit e0: GR[Int], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[Option[scala.math.BigDecimal]], e4: GR[Option[Boolean]], e5: GR[java.sql.Timestamp], e6: GR[Byte]): GR[MStkUsdRow] = GR{
    prs => import prs._
    MStkUsdRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<?[Boolean], <<[java.sql.Timestamp], <<[Byte]))
  }
  /** Table description of table m_stk_usd. Objects of this class serve as prototypes for rows in queries. */
  class MStkUsd(_tableTag: Tag) extends Table[MStkUsdRow](_tableTag, "m_stk_usd") {
    def * = (mStkUsdId, mStkUsdMMakerId, mStkUsdTitle, mStkUsdNote, mStkUsdPrice, mStkUsdCprice, mStkUsdLatestBalance, mStkUsdCurrency, mStkUsdCreatedate, mStkUsdFlag) <> (MStkUsdRow.tupled, MStkUsdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkUsdId.?, mStkUsdMMakerId.?, mStkUsdTitle.?, mStkUsdNote.?, mStkUsdPrice.?, mStkUsdCprice, mStkUsdLatestBalance.?, mStkUsdCurrency, mStkUsdCreatedate.?, mStkUsdFlag.?).shaped.<>({r=>import r._; _1.map(_=> MStkUsdRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_usd_id DBType(INT), AutoInc, PrimaryKey */
    val mStkUsdId: Column[Int] = column[Int]("m_stk_usd_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_usd_m_maker_id DBType(INT) */
    val mStkUsdMMakerId: Column[Int] = column[Int]("m_stk_usd_m_maker_id")
    /** Database column m_stk_usd_title DBType(VARCHAR), Length(100,true) */
    val mStkUsdTitle: Column[String] = column[String]("m_stk_usd_title", O.Length(100,varying=true))
    /** Database column m_stk_usd_note DBType(TEXT), Length(65535,true) */
    val mStkUsdNote: Column[String] = column[String]("m_stk_usd_note", O.Length(65535,varying=true))
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
  
  /** Entity class storing rows of table MStkUsdCopy
   *  @param mStkUsdCopyId Database column m_stk_usd_copy_id DBType(INT), AutoInc, PrimaryKey
   *  @param mStkUsdCopyMMakerId Database column m_stk_usd_copy_m_maker_id DBType(INT)
   *  @param mStkUsdCopyTitle Database column m_stk_usd_copy_title DBType(VARCHAR), Length(100,true)
   *  @param mStkUsdCopyNote Database column m_stk_usd_copy_note DBType(TEXT), Length(65535,true)
   *  @param mStkUsdCopyPrice Database column m_stk_usd_copy_price DBType(DECIMAL)
   *  @param mStkUsdCopyCprice Database column m_stk_usd_copy_cprice DBType(DECIMAL), Default(None)
   *  @param mStkUsdCopyLatestBalance Database column m_stk_usd_copy_latest_balance DBType(DECIMAL)
   *  @param mStkUsdCopyCreatedate Database column m_stk_usd_copy_createdate DBType(DATETIME)
   *  @param mStkUsdCopyMUserId Database column m_stk_usd_copy_m_user_id DBType(INT), Default(0)
   *  @param mStkUsdCopyCancelDatetime Database column m_stk_usd_copy_cancel_datetime DBType(DATETIME) */
  case class MStkUsdCopyRow(mStkUsdCopyId: Int, mStkUsdCopyMMakerId: Int, mStkUsdCopyTitle: String, mStkUsdCopyNote: String, mStkUsdCopyPrice: scala.math.BigDecimal, mStkUsdCopyCprice: Option[scala.math.BigDecimal] = None, mStkUsdCopyLatestBalance: scala.math.BigDecimal, mStkUsdCopyCreatedate: java.sql.Timestamp, mStkUsdCopyMUserId: Int = 0, mStkUsdCopyCancelDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MStkUsdCopyRow objects using plain SQL queries */
  implicit def GetResultMStkUsdCopyRow(implicit e0: GR[Int], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[Option[scala.math.BigDecimal]], e4: GR[java.sql.Timestamp]): GR[MStkUsdCopyRow] = GR{
    prs => import prs._
    MStkUsdCopyRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_stk_usd_copy. Objects of this class serve as prototypes for rows in queries. */
  class MStkUsdCopy(_tableTag: Tag) extends Table[MStkUsdCopyRow](_tableTag, "m_stk_usd_copy") {
    def * = (mStkUsdCopyId, mStkUsdCopyMMakerId, mStkUsdCopyTitle, mStkUsdCopyNote, mStkUsdCopyPrice, mStkUsdCopyCprice, mStkUsdCopyLatestBalance, mStkUsdCopyCreatedate, mStkUsdCopyMUserId, mStkUsdCopyCancelDatetime) <> (MStkUsdCopyRow.tupled, MStkUsdCopyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkUsdCopyId.?, mStkUsdCopyMMakerId.?, mStkUsdCopyTitle.?, mStkUsdCopyNote.?, mStkUsdCopyPrice.?, mStkUsdCopyCprice, mStkUsdCopyLatestBalance.?, mStkUsdCopyCreatedate.?, mStkUsdCopyMUserId.?, mStkUsdCopyCancelDatetime.?).shaped.<>({r=>import r._; _1.map(_=> MStkUsdCopyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_usd_copy_id DBType(INT), AutoInc, PrimaryKey */
    val mStkUsdCopyId: Column[Int] = column[Int]("m_stk_usd_copy_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_stk_usd_copy_m_maker_id DBType(INT) */
    val mStkUsdCopyMMakerId: Column[Int] = column[Int]("m_stk_usd_copy_m_maker_id")
    /** Database column m_stk_usd_copy_title DBType(VARCHAR), Length(100,true) */
    val mStkUsdCopyTitle: Column[String] = column[String]("m_stk_usd_copy_title", O.Length(100,varying=true))
    /** Database column m_stk_usd_copy_note DBType(TEXT), Length(65535,true) */
    val mStkUsdCopyNote: Column[String] = column[String]("m_stk_usd_copy_note", O.Length(65535,varying=true))
    /** Database column m_stk_usd_copy_price DBType(DECIMAL) */
    val mStkUsdCopyPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_usd_copy_price")
    /** Database column m_stk_usd_copy_cprice DBType(DECIMAL), Default(None) */
    val mStkUsdCopyCprice: Column[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("m_stk_usd_copy_cprice", O.Default(None))
    /** Database column m_stk_usd_copy_latest_balance DBType(DECIMAL) */
    val mStkUsdCopyLatestBalance: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("m_stk_usd_copy_latest_balance")
    /** Database column m_stk_usd_copy_createdate DBType(DATETIME) */
    val mStkUsdCopyCreatedate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_usd_copy_createdate")
    /** Database column m_stk_usd_copy_m_user_id DBType(INT), Default(0) */
    val mStkUsdCopyMUserId: Column[Int] = column[Int]("m_stk_usd_copy_m_user_id", O.Default(0))
    /** Database column m_stk_usd_copy_cancel_datetime DBType(DATETIME) */
    val mStkUsdCopyCancelDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_stk_usd_copy_cancel_datetime")
  }
  /** Collection-like TableQuery object for table MStkUsdCopy */
  lazy val MStkUsdCopy = new TableQuery(tag => new MStkUsdCopy(tag))
  
  /** Entity class storing rows of table MSubject
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param pid Database column pid DBType(INT)
   *  @param askContent Database column ask_content DBType(TEXT), Length(65535,true)
   *  @param answerPostion Database column answer_postion DBType(VARCHAR), Length(255,true)
   *  @param questId Database column quest_id DBType(INT)
   *  @param subjectType Database column subject_type DBType(BIT)
   *  @param orderNum Database column order_num DBType(INT) */
  case class MSubjectRow(id: Int, pid: Int, askContent: String, answerPostion: String, questId: Int, subjectType: Boolean, orderNum: Int)
  /** GetResult implicit for fetching MSubjectRow objects using plain SQL queries */
  implicit def GetResultMSubjectRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Boolean]): GR[MSubjectRow] = GR{
    prs => import prs._
    MSubjectRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[Int], <<[Boolean], <<[Int]))
  }
  /** Table description of table m_subject. Objects of this class serve as prototypes for rows in queries. */
  class MSubject(_tableTag: Tag) extends Table[MSubjectRow](_tableTag, "m_subject") {
    def * = (id, pid, askContent, answerPostion, questId, subjectType, orderNum) <> (MSubjectRow.tupled, MSubjectRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, pid.?, askContent.?, answerPostion.?, questId.?, subjectType.?, orderNum.?).shaped.<>({r=>import r._; _1.map(_=> MSubjectRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column pid DBType(INT) */
    val pid: Column[Int] = column[Int]("pid")
    /** Database column ask_content DBType(TEXT), Length(65535,true) */
    val askContent: Column[String] = column[String]("ask_content", O.Length(65535,varying=true))
    /** Database column answer_postion DBType(VARCHAR), Length(255,true) */
    val answerPostion: Column[String] = column[String]("answer_postion", O.Length(255,varying=true))
    /** Database column quest_id DBType(INT) */
    val questId: Column[Int] = column[Int]("quest_id")
    /** Database column subject_type DBType(BIT) */
    val subjectType: Column[Boolean] = column[Boolean]("subject_type")
    /** Database column order_num DBType(INT) */
    val orderNum: Column[Int] = column[Int]("order_num")
  }
  /** Collection-like TableQuery object for table MSubject */
  lazy val MSubject = new TableQuery(tag => new MSubject(tag))
  
  /** Entity class storing rows of table MSubjectItem
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey
   *  @param itemIndex Database column item_index DBType(VARCHAR), Length(2,true)
   *  @param itemContent Database column item_content DBType(VARCHAR), Length(255,true)
   *  @param subjectId Database column subject_id DBType(INT)
   *  @param itemType Database column item_type DBType(BIT)
   *  @param selectCount Database column select_count DBType(INT) */
  case class MSubjectItemRow(id: Int, itemIndex: String, itemContent: String, subjectId: Int, itemType: Boolean, selectCount: Int)
  /** GetResult implicit for fetching MSubjectItemRow objects using plain SQL queries */
  implicit def GetResultMSubjectItemRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Boolean]): GR[MSubjectItemRow] = GR{
    prs => import prs._
    MSubjectItemRow.tupled((<<[Int], <<[String], <<[String], <<[Int], <<[Boolean], <<[Int]))
  }
  /** Table description of table m_subject_item. Objects of this class serve as prototypes for rows in queries. */
  class MSubjectItem(_tableTag: Tag) extends Table[MSubjectItemRow](_tableTag, "m_subject_item") {
    def * = (id, itemIndex, itemContent, subjectId, itemType, selectCount) <> (MSubjectItemRow.tupled, MSubjectItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, itemIndex.?, itemContent.?, subjectId.?, itemType.?, selectCount.?).shaped.<>({r=>import r._; _1.map(_=> MSubjectItemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column item_index DBType(VARCHAR), Length(2,true) */
    val itemIndex: Column[String] = column[String]("item_index", O.Length(2,varying=true))
    /** Database column item_content DBType(VARCHAR), Length(255,true) */
    val itemContent: Column[String] = column[String]("item_content", O.Length(255,varying=true))
    /** Database column subject_id DBType(INT) */
    val subjectId: Column[Int] = column[Int]("subject_id")
    /** Database column item_type DBType(BIT) */
    val itemType: Column[Boolean] = column[Boolean]("item_type")
    /** Database column select_count DBType(INT) */
    val selectCount: Column[Int] = column[Int]("select_count")
  }
  /** Collection-like TableQuery object for table MSubjectItem */
  lazy val MSubjectItem = new TableQuery(tag => new MSubjectItem(tag))
  
  /** Entity class storing rows of table MUnit
   *  @param mUnitId Database column m_unit_id DBType(INT), AutoInc
   *  @param mUnitName Database column m_unit_name DBType(VARCHAR), Length(10,true)
   *  @param mUnitNameCh Database column m_unit_name_ch DBType(VARCHAR), Length(10,true)
   *  @param mUnitType Database column m_unit_type DBType(VARCHAR), Length(10,true)
   *  @param mUnitOrder Database column m_unit_order DBType(INT) */
  case class MUnitRow(mUnitId: Int, mUnitName: String, mUnitNameCh: String, mUnitType: String, mUnitOrder: Int)
  /** GetResult implicit for fetching MUnitRow objects using plain SQL queries */
  implicit def GetResultMUnitRow(implicit e0: GR[Int], e1: GR[String]): GR[MUnitRow] = GR{
    prs => import prs._
    MUnitRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table m_unit. Objects of this class serve as prototypes for rows in queries. */
  class MUnit(_tableTag: Tag) extends Table[MUnitRow](_tableTag, "m_unit") {
    def * = (mUnitId, mUnitName, mUnitNameCh, mUnitType, mUnitOrder) <> (MUnitRow.tupled, MUnitRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mUnitId.?, mUnitName.?, mUnitNameCh.?, mUnitType.?, mUnitOrder.?).shaped.<>({r=>import r._; _1.map(_=> MUnitRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_unit_id DBType(INT), AutoInc */
    val mUnitId: Column[Int] = column[Int]("m_unit_id", O.AutoInc)
    /** Database column m_unit_name DBType(VARCHAR), Length(10,true) */
    val mUnitName: Column[String] = column[String]("m_unit_name", O.Length(10,varying=true))
    /** Database column m_unit_name_ch DBType(VARCHAR), Length(10,true) */
    val mUnitNameCh: Column[String] = column[String]("m_unit_name_ch", O.Length(10,varying=true))
    /** Database column m_unit_type DBType(VARCHAR), Length(10,true) */
    val mUnitType: Column[String] = column[String]("m_unit_type", O.Length(10,varying=true))
    /** Database column m_unit_order DBType(INT) */
    val mUnitOrder: Column[Int] = column[Int]("m_unit_order")
    
    /** Index over (mUnitId) (database name m_unit_id) */
    val index1 = index("m_unit_id", mUnitId)
  }
  /** Collection-like TableQuery object for table MUnit */
  lazy val MUnit = new TableQuery(tag => new MUnit(tag))
  
  /** Row type of table MUnso */
  type MUnsoRow = HCons[Int,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Int,HCons[String,HCons[String,HCons[String,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[Int,HCons[Int,HCons[Int,HCons[String,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for MUnsoRow providing default values if available in the database schema. */
  def MUnsoRow(mUnsoId: Int, mUnsoVoidFlag: Byte, mUnsoAccount: String, mUnsoPassword: String, mUnsoSalt: String = "", mUnsoName: String, mUnsoNameKana: String, mUnsoBusho: String, mUnsoTantosha: String, mUnsoTax: Byte, mUnsoShiharaiMonth: Byte, mUnsoShiharaiDate: Byte, mUnsoShime: Byte, mUnsoMail: String, mUnsoTel1: String, mUnsoTel2: String, mUnsoMobi: String, mUnsoFax1: String, mUnsoFax2: String, mUnsoZip: String, mUnsoPref: Int, mUnsoAddress: String, mUnsoAddress2: String, mUnsoNote: String, mUnsoRdatetime: java.sql.Timestamp, mUnsoUdatetime: java.sql.Timestamp, mUnsoRuser: Int, mUnsoUuser: Int, mUnsoGid: Int, mUnsoPriv: String): MUnsoRow = {
    mUnsoId :: mUnsoVoidFlag :: mUnsoAccount :: mUnsoPassword :: mUnsoSalt :: mUnsoName :: mUnsoNameKana :: mUnsoBusho :: mUnsoTantosha :: mUnsoTax :: mUnsoShiharaiMonth :: mUnsoShiharaiDate :: mUnsoShime :: mUnsoMail :: mUnsoTel1 :: mUnsoTel2 :: mUnsoMobi :: mUnsoFax1 :: mUnsoFax2 :: mUnsoZip :: mUnsoPref :: mUnsoAddress :: mUnsoAddress2 :: mUnsoNote :: mUnsoRdatetime :: mUnsoUdatetime :: mUnsoRuser :: mUnsoUuser :: mUnsoGid :: mUnsoPriv :: HNil
  }
  /** GetResult implicit for fetching MUnsoRow objects using plain SQL queries */
  implicit def GetResultMUnsoRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[java.sql.Timestamp]): GR[MUnsoRow] = GR{
    prs => import prs._
    <<[Int] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Int] :: <<[String] :: <<[String] :: <<[String] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[String] :: HNil
  }
  /** Table description of table m_unso. Objects of this class serve as prototypes for rows in queries. */
  class MUnso(_tableTag: Tag) extends Table[MUnsoRow](_tableTag, "m_unso") {
    def * = mUnsoId :: mUnsoVoidFlag :: mUnsoAccount :: mUnsoPassword :: mUnsoSalt :: mUnsoName :: mUnsoNameKana :: mUnsoBusho :: mUnsoTantosha :: mUnsoTax :: mUnsoShiharaiMonth :: mUnsoShiharaiDate :: mUnsoShime :: mUnsoMail :: mUnsoTel1 :: mUnsoTel2 :: mUnsoMobi :: mUnsoFax1 :: mUnsoFax2 :: mUnsoZip :: mUnsoPref :: mUnsoAddress :: mUnsoAddress2 :: mUnsoNote :: mUnsoRdatetime :: mUnsoUdatetime :: mUnsoRuser :: mUnsoUuser :: mUnsoGid :: mUnsoPriv :: HNil
    
    /** Database column m_unso_id DBType(INT), AutoInc, PrimaryKey */
    val mUnsoId: Column[Int] = column[Int]("m_unso_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_unso_void_flag DBType(TINYINT) */
    val mUnsoVoidFlag: Column[Byte] = column[Byte]("m_unso_void_flag")
    /** Database column m_unso_account DBType(CHAR), Length(36,false) */
    val mUnsoAccount: Column[String] = column[String]("m_unso_account", O.Length(36,varying=false))
    /** Database column m_unso_password DBType(VARCHAR), Length(100,true) */
    val mUnsoPassword: Column[String] = column[String]("m_unso_password", O.Length(100,varying=true))
    /** Database column m_unso_salt DBType(CHAR), Length(15,false), Default() */
    val mUnsoSalt: Column[String] = column[String]("m_unso_salt", O.Length(15,varying=false), O.Default(""))
    /** Database column m_unso_name DBType(VARCHAR), Length(200,true) */
    val mUnsoName: Column[String] = column[String]("m_unso_name", O.Length(200,varying=true))
    /** Database column m_unso_name_kana DBType(VARCHAR), Length(200,true) */
    val mUnsoNameKana: Column[String] = column[String]("m_unso_name_kana", O.Length(200,varying=true))
    /** Database column m_unso_busho DBType(VARCHAR), Length(100,true) */
    val mUnsoBusho: Column[String] = column[String]("m_unso_busho", O.Length(100,varying=true))
    /** Database column m_unso_tantosha DBType(VARCHAR), Length(100,true) */
    val mUnsoTantosha: Column[String] = column[String]("m_unso_tantosha", O.Length(100,varying=true))
    /** Database column m_unso_tax DBType(TINYINT) */
    val mUnsoTax: Column[Byte] = column[Byte]("m_unso_tax")
    /** Database column m_unso_shiharai_month DBType(TINYINT) */
    val mUnsoShiharaiMonth: Column[Byte] = column[Byte]("m_unso_shiharai_month")
    /** Database column m_unso_shiharai_date DBType(TINYINT) */
    val mUnsoShiharaiDate: Column[Byte] = column[Byte]("m_unso_shiharai_date")
    /** Database column m_unso_shime DBType(TINYINT) */
    val mUnsoShime: Column[Byte] = column[Byte]("m_unso_shime")
    /** Database column m_unso_mail DBType(VARCHAR), Length(100,true) */
    val mUnsoMail: Column[String] = column[String]("m_unso_mail", O.Length(100,varying=true))
    /** Database column m_unso_tel1 DBType(VARCHAR), Length(50,true) */
    val mUnsoTel1: Column[String] = column[String]("m_unso_tel1", O.Length(50,varying=true))
    /** Database column m_unso_tel2 DBType(VARCHAR), Length(50,true) */
    val mUnsoTel2: Column[String] = column[String]("m_unso_tel2", O.Length(50,varying=true))
    /** Database column m_unso_mobi DBType(VARCHAR), Length(50,true) */
    val mUnsoMobi: Column[String] = column[String]("m_unso_mobi", O.Length(50,varying=true))
    /** Database column m_unso_fax1 DBType(VARCHAR), Length(50,true) */
    val mUnsoFax1: Column[String] = column[String]("m_unso_fax1", O.Length(50,varying=true))
    /** Database column m_unso_fax2 DBType(VARCHAR), Length(50,true) */
    val mUnsoFax2: Column[String] = column[String]("m_unso_fax2", O.Length(50,varying=true))
    /** Database column m_unso_zip DBType(VARCHAR), Length(10,true) */
    val mUnsoZip: Column[String] = column[String]("m_unso_zip", O.Length(10,varying=true))
    /** Database column m_unso_pref DBType(INT) */
    val mUnsoPref: Column[Int] = column[Int]("m_unso_pref")
    /** Database column m_unso_address DBType(VARCHAR), Length(250,true) */
    val mUnsoAddress: Column[String] = column[String]("m_unso_address", O.Length(250,varying=true))
    /** Database column m_unso_address2 DBType(VARCHAR), Length(200,true) */
    val mUnsoAddress2: Column[String] = column[String]("m_unso_address2", O.Length(200,varying=true))
    /** Database column m_unso_note DBType(TEXT), Length(65535,true) */
    val mUnsoNote: Column[String] = column[String]("m_unso_note", O.Length(65535,varying=true))
    /** Database column m_unso_rdatetime DBType(DATETIME) */
    val mUnsoRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_unso_rdatetime")
    /** Database column m_unso_udatetime DBType(DATETIME) */
    val mUnsoUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_unso_udatetime")
    /** Database column m_unso_ruser DBType(INT) */
    val mUnsoRuser: Column[Int] = column[Int]("m_unso_ruser")
    /** Database column m_unso_uuser DBType(INT) */
    val mUnsoUuser: Column[Int] = column[Int]("m_unso_uuser")
    /** Database column m_unso_gid DBType(INT UNSIGNED) */
    val mUnsoGid: Column[Int] = column[Int]("m_unso_gid")
    /** Database column m_unso_priv DBType(TEXT), Length(65535,true) */
    val mUnsoPriv: Column[String] = column[String]("m_unso_priv", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table MUnso */
  lazy val MUnso = new TableQuery(tag => new MUnso(tag))
  
  /** Entity class storing rows of table MUser
   *  @param mUserId Database column m_user_id DBType(INT), AutoInc, PrimaryKey
   *  @param mUserMGroupId Database column m_user_m_group_id DBType(INT), Default(0)
   *  @param mUserVoidFlag Database column m_user_void_flag DBType(TINYINT)
   *  @param mUserAccount Database column m_user_account DBType(VARCHAR), Length(50,true)
   *  @param mUserPassword Database column m_user_password DBType(VARCHAR), Length(100,true)
   *  @param mUserSalt Database column m_user_salt DBType(CHAR), Length(15,false), Default()
   *  @param mUserName Database column m_user_name DBType(VARCHAR), Length(100,true)
   *  @param mUserNameKana Database column m_user_name_kana DBType(VARCHAR), Length(100,true)
   *  @param mUserMail Database column m_user_mail DBType(VARCHAR), Length(200,true)
   *  @param mUserTel Database column m_user_tel DBType(VARCHAR), Length(20,true)
   *  @param mUserFax Database column m_user_fax DBType(VARCHAR), Length(20,true)
   *  @param mUserCountry Database column m_user_country DBType(INT)
   *  @param mUserZip Database column m_user_zip DBType(VARCHAR), Length(10,true)
   *  @param mUserPref Database column m_user_pref DBType(INT)
   *  @param mUserAddress Database column m_user_address DBType(VARCHAR), Length(255,true)
   *  @param mUserSex Database column m_user_sex DBType(TINYINT)
   *  @param mUserNote Database column m_user_note DBType(TEXT), Length(65535,true)
   *  @param mUserTranslatorFlag Database column m_user_translator_flag DBType(BIT), Default(false)
   *  @param mUserRdatetime Database column m_user_rdatetime DBType(DATETIME)
   *  @param mUserUdatetime Database column m_user_udatetime DBType(DATETIME)
   *  @param mUserRuser Database column m_user_ruser DBType(INT)
   *  @param mUserUuser Database column m_user_uuser DBType(INT) */
  case class MUserRow(mUserId: Int, mUserMGroupId: Int = 0, mUserVoidFlag: Byte, mUserAccount: String, mUserPassword: String, mUserSalt: String = "", mUserName: String, mUserNameKana: String, mUserMail: String, mUserTel: String, mUserFax: String, mUserCountry: Int, mUserZip: String, mUserPref: Int, mUserAddress: String, mUserSex: Byte, mUserNote: String, mUserTranslatorFlag: Boolean = false, mUserRdatetime: java.sql.Timestamp, mUserUdatetime: java.sql.Timestamp, mUserRuser: Int, mUserUuser: Int)
  /** GetResult implicit for fetching MUserRow objects using plain SQL queries */
  implicit def GetResultMUserRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[Boolean], e4: GR[java.sql.Timestamp]): GR[MUserRow] = GR{
    prs => import prs._
    MUserRow.tupled((<<[Int], <<[Int], <<[Byte], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[String], <<[Int], <<[String], <<[Byte], <<[String], <<[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table m_user. Objects of this class serve as prototypes for rows in queries. */
  class MUser(_tableTag: Tag) extends Table[MUserRow](_tableTag, "m_user") {
    def * = (mUserId, mUserMGroupId, mUserVoidFlag, mUserAccount, mUserPassword, mUserSalt, mUserName, mUserNameKana, mUserMail, mUserTel, mUserFax, mUserCountry, mUserZip, mUserPref, mUserAddress, mUserSex, mUserNote, mUserTranslatorFlag, mUserRdatetime, mUserUdatetime, mUserRuser, mUserUuser) <> (MUserRow.tupled, MUserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mUserId.?, mUserMGroupId.?, mUserVoidFlag.?, mUserAccount.?, mUserPassword.?, mUserSalt.?, mUserName.?, mUserNameKana.?, mUserMail.?, mUserTel.?, mUserFax.?, mUserCountry.?, mUserZip.?, mUserPref.?, mUserAddress.?, mUserSex.?, mUserNote.?, mUserTranslatorFlag.?, mUserRdatetime.?, mUserUdatetime.?, mUserRuser.?, mUserUuser.?).shaped.<>({r=>import r._; _1.map(_=> MUserRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get, _18.get, _19.get, _20.get, _21.get, _22.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_user_id DBType(INT), AutoInc, PrimaryKey */
    val mUserId: Column[Int] = column[Int]("m_user_id", O.AutoInc, O.PrimaryKey)
    /** Database column m_user_m_group_id DBType(INT), Default(0) */
    val mUserMGroupId: Column[Int] = column[Int]("m_user_m_group_id", O.Default(0))
    /** Database column m_user_void_flag DBType(TINYINT) */
    val mUserVoidFlag: Column[Byte] = column[Byte]("m_user_void_flag")
    /** Database column m_user_account DBType(VARCHAR), Length(50,true) */
    val mUserAccount: Column[String] = column[String]("m_user_account", O.Length(50,varying=true))
    /** Database column m_user_password DBType(VARCHAR), Length(100,true) */
    val mUserPassword: Column[String] = column[String]("m_user_password", O.Length(100,varying=true))
    /** Database column m_user_salt DBType(CHAR), Length(15,false), Default() */
    val mUserSalt: Column[String] = column[String]("m_user_salt", O.Length(15,varying=false), O.Default(""))
    /** Database column m_user_name DBType(VARCHAR), Length(100,true) */
    val mUserName: Column[String] = column[String]("m_user_name", O.Length(100,varying=true))
    /** Database column m_user_name_kana DBType(VARCHAR), Length(100,true) */
    val mUserNameKana: Column[String] = column[String]("m_user_name_kana", O.Length(100,varying=true))
    /** Database column m_user_mail DBType(VARCHAR), Length(200,true) */
    val mUserMail: Column[String] = column[String]("m_user_mail", O.Length(200,varying=true))
    /** Database column m_user_tel DBType(VARCHAR), Length(20,true) */
    val mUserTel: Column[String] = column[String]("m_user_tel", O.Length(20,varying=true))
    /** Database column m_user_fax DBType(VARCHAR), Length(20,true) */
    val mUserFax: Column[String] = column[String]("m_user_fax", O.Length(20,varying=true))
    /** Database column m_user_country DBType(INT) */
    val mUserCountry: Column[Int] = column[Int]("m_user_country")
    /** Database column m_user_zip DBType(VARCHAR), Length(10,true) */
    val mUserZip: Column[String] = column[String]("m_user_zip", O.Length(10,varying=true))
    /** Database column m_user_pref DBType(INT) */
    val mUserPref: Column[Int] = column[Int]("m_user_pref")
    /** Database column m_user_address DBType(VARCHAR), Length(255,true) */
    val mUserAddress: Column[String] = column[String]("m_user_address", O.Length(255,varying=true))
    /** Database column m_user_sex DBType(TINYINT) */
    val mUserSex: Column[Byte] = column[Byte]("m_user_sex")
    /** Database column m_user_note DBType(TEXT), Length(65535,true) */
    val mUserNote: Column[String] = column[String]("m_user_note", O.Length(65535,varying=true))
    /** Database column m_user_translator_flag DBType(BIT), Default(false) */
    val mUserTranslatorFlag: Column[Boolean] = column[Boolean]("m_user_translator_flag", O.Default(false))
    /** Database column m_user_rdatetime DBType(DATETIME) */
    val mUserRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_user_rdatetime")
    /** Database column m_user_udatetime DBType(DATETIME) */
    val mUserUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_user_udatetime")
    /** Database column m_user_ruser DBType(INT) */
    val mUserRuser: Column[Int] = column[Int]("m_user_ruser")
    /** Database column m_user_uuser DBType(INT) */
    val mUserUuser: Column[Int] = column[Int]("m_user_uuser")
    
    /** Uniqueness Index over (mUserAccount) (database name m_user_account) */
    val index1 = index("m_user_account", mUserAccount, unique=true)
  }
  /** Collection-like TableQuery object for table MUser */
  lazy val MUser = new TableQuery(tag => new MUser(tag))
  
  /** Entity class storing rows of table MVirtualaccount
   *  @param mVirtualaccountId Database column m_virtualaccount_id DBType(INT), PrimaryKey
   *  @param mVirtualaccountMCustomerId Database column m_virtualaccount_m_customer_id DBType(INT)
   *  @param mVirtualaccountRdatetime Database column m_virtualaccount_rdatetime DBType(DATETIME)
   *  @param mVirtualaccountUdatetime Database column m_virtualaccount_udatetime DBType(DATETIME) */
  case class MVirtualaccountRow(mVirtualaccountId: Int, mVirtualaccountMCustomerId: Int, mVirtualaccountRdatetime: java.sql.Timestamp, mVirtualaccountUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching MVirtualaccountRow objects using plain SQL queries */
  implicit def GetResultMVirtualaccountRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[MVirtualaccountRow] = GR{
    prs => import prs._
    MVirtualaccountRow.tupled((<<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table m_virtualaccount. Objects of this class serve as prototypes for rows in queries. */
  class MVirtualaccount(_tableTag: Tag) extends Table[MVirtualaccountRow](_tableTag, "m_virtualaccount") {
    def * = (mVirtualaccountId, mVirtualaccountMCustomerId, mVirtualaccountRdatetime, mVirtualaccountUdatetime) <> (MVirtualaccountRow.tupled, MVirtualaccountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mVirtualaccountId.?, mVirtualaccountMCustomerId.?, mVirtualaccountRdatetime.?, mVirtualaccountUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> MVirtualaccountRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_virtualaccount_id DBType(INT), PrimaryKey */
    val mVirtualaccountId: Column[Int] = column[Int]("m_virtualaccount_id", O.PrimaryKey)
    /** Database column m_virtualaccount_m_customer_id DBType(INT) */
    val mVirtualaccountMCustomerId: Column[Int] = column[Int]("m_virtualaccount_m_customer_id")
    /** Database column m_virtualaccount_rdatetime DBType(DATETIME) */
    val mVirtualaccountRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_virtualaccount_rdatetime")
    /** Database column m_virtualaccount_udatetime DBType(DATETIME) */
    val mVirtualaccountUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("m_virtualaccount_udatetime")
  }
  /** Collection-like TableQuery object for table MVirtualaccount */
  lazy val MVirtualaccount = new TableQuery(tag => new MVirtualaccount(tag))
  
  /** Row type of table MYubin */
  type MYubinRow = HCons[Int,HCons[String,HCons[Byte,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HCons[Byte,HNil]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for MYubinRow providing default values if available in the database schema. */
  def MYubinRow(id: Int = 0, code: String, kenCode: Byte, no5: String, no: String, kenK: String, shiK: String, choK: String, ken: String, shi: String, cho: String, banchi: String, shiten: String, jigyoshoK: String, jigyosho: String, f10: Byte, f11: Byte, f12: Byte, f13: Byte, f14: Byte, f15: Byte, fj11: Byte, fj12: Byte, fj13: Byte): MYubinRow = {
    id :: code :: kenCode :: no5 :: no :: kenK :: shiK :: choK :: ken :: shi :: cho :: banchi :: shiten :: jigyoshoK :: jigyosho :: f10 :: f11 :: f12 :: f13 :: f14 :: f15 :: fj11 :: fj12 :: fj13 :: HNil
  }
  /** GetResult implicit for fetching MYubinRow objects using plain SQL queries */
  implicit def GetResultMYubinRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Byte]): GR[MYubinRow] = GR{
    prs => import prs._
    <<[Int] :: <<[String] :: <<[Byte] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: HNil
  }
  /** Table description of table m_yubin. Objects of this class serve as prototypes for rows in queries. */
  class MYubin(_tableTag: Tag) extends Table[MYubinRow](_tableTag, "m_yubin") {
    def * = id :: code :: kenCode :: no5 :: no :: kenK :: shiK :: choK :: ken :: shi :: cho :: banchi :: shiten :: jigyoshoK :: jigyosho :: f10 :: f11 :: f12 :: f13 :: f14 :: f15 :: fj11 :: fj12 :: fj13 :: HNil
    
    /** Database column id DBType(INT), PrimaryKey, Default(0) */
    val id: Column[Int] = column[Int]("id", O.PrimaryKey, O.Default(0))
    /** Database column code DBType(VARCHAR), Length(5,true) */
    val code: Column[String] = column[String]("code", O.Length(5,varying=true))
    /** Database column ken_code DBType(TINYINT) */
    val kenCode: Column[Byte] = column[Byte]("ken_code")
    /** Database column no5 DBType(VARCHAR), Length(5,true) */
    val no5: Column[String] = column[String]("no5", O.Length(5,varying=true))
    /** Database column no DBType(VARCHAR), Length(7,true) */
    val no: Column[String] = column[String]("no", O.Length(7,varying=true))
    /** Database column ken_k DBType(VARCHAR), Length(20,true) */
    val kenK: Column[String] = column[String]("ken_k", O.Length(20,varying=true))
    /** Database column shi_k DBType(VARCHAR), Length(50,true) */
    val shiK: Column[String] = column[String]("shi_k", O.Length(50,varying=true))
    /** Database column cho_k DBType(VARCHAR), Length(100,true) */
    val choK: Column[String] = column[String]("cho_k", O.Length(100,varying=true))
    /** Database column ken DBType(VARCHAR), Length(20,true) */
    val ken: Column[String] = column[String]("ken", O.Length(20,varying=true))
    /** Database column shi DBType(VARCHAR), Length(50,true) */
    val shi: Column[String] = column[String]("shi", O.Length(50,varying=true))
    /** Database column cho DBType(VARCHAR), Length(100,true) */
    val cho: Column[String] = column[String]("cho", O.Length(100,varying=true))
    /** Database column banchi DBType(VARCHAR), Length(100,true) */
    val banchi: Column[String] = column[String]("banchi", O.Length(100,varying=true))
    /** Database column shiten DBType(VARCHAR), Length(50,true) */
    val shiten: Column[String] = column[String]("shiten", O.Length(50,varying=true))
    /** Database column jigyosho_k DBType(VARCHAR), Length(100,true) */
    val jigyoshoK: Column[String] = column[String]("jigyosho_k", O.Length(100,varying=true))
    /** Database column jigyosho DBType(VARCHAR), Length(100,true) */
    val jigyosho: Column[String] = column[String]("jigyosho", O.Length(100,varying=true))
    /** Database column f10 DBType(TINYINT) */
    val f10: Column[Byte] = column[Byte]("f10")
    /** Database column f11 DBType(TINYINT) */
    val f11: Column[Byte] = column[Byte]("f11")
    /** Database column f12 DBType(TINYINT) */
    val f12: Column[Byte] = column[Byte]("f12")
    /** Database column f13 DBType(TINYINT) */
    val f13: Column[Byte] = column[Byte]("f13")
    /** Database column f14 DBType(TINYINT) */
    val f14: Column[Byte] = column[Byte]("f14")
    /** Database column f15 DBType(TINYINT) */
    val f15: Column[Byte] = column[Byte]("f15")
    /** Database column fj11 DBType(TINYINT) */
    val fj11: Column[Byte] = column[Byte]("fj11")
    /** Database column fj12 DBType(TINYINT) */
    val fj12: Column[Byte] = column[Byte]("fj12")
    /** Database column fj13 DBType(TINYINT) */
    val fj13: Column[Byte] = column[Byte]("fj13")
    
    /** Index over (ken) (database name ken) */
    val index1 = index("ken", ken :: HNil)
    /** Index over (no) (database name no) */
    val index2 = index("no", no :: HNil)
  }
  /** Collection-like TableQuery object for table MYubin */
  lazy val MYubin = new TableQuery(tag => new MYubin(tag))
  
  /** Entity class storing rows of table PhpSession
   *  @param sessionId Database column session_id DBType(CHAR), PrimaryKey, Length(35,false)
   *  @param userId Database column user_id DBType(INT), Default(None)
   *  @param dateCreated Database column date_created DBType(DATETIME)
   *  @param lastUpdated Database column last_updated DBType(DATETIME)
   *  @param sessionData Database column session_data DBType(LONGTEXT), Length(2147483647,true), Default(None)
   *  @param sessionToken Database column session_token DBType(CHAR), Length(40,false)
   *  @param nodes Database column nodes DBType(TINYINT), Default(1) */
  case class PhpSessionRow(sessionId: String, userId: Option[Int] = None, dateCreated: java.sql.Timestamp, lastUpdated: java.sql.Timestamp, sessionData: Option[String] = None, sessionToken: String, nodes: Byte = 1)
  /** GetResult implicit for fetching PhpSessionRow objects using plain SQL queries */
  implicit def GetResultPhpSessionRow(implicit e0: GR[String], e1: GR[Option[Int]], e2: GR[java.sql.Timestamp], e3: GR[Option[String]], e4: GR[Byte]): GR[PhpSessionRow] = GR{
    prs => import prs._
    PhpSessionRow.tupled((<<[String], <<?[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[String], <<[String], <<[Byte]))
  }
  /** Table description of table php_session. Objects of this class serve as prototypes for rows in queries. */
  class PhpSession(_tableTag: Tag) extends Table[PhpSessionRow](_tableTag, "php_session") {
    def * = (sessionId, userId, dateCreated, lastUpdated, sessionData, sessionToken, nodes) <> (PhpSessionRow.tupled, PhpSessionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (sessionId.?, userId, dateCreated.?, lastUpdated.?, sessionData, sessionToken.?, nodes.?).shaped.<>({r=>import r._; _1.map(_=> PhpSessionRow.tupled((_1.get, _2, _3.get, _4.get, _5, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column session_id DBType(CHAR), PrimaryKey, Length(35,false) */
    val sessionId: Column[String] = column[String]("session_id", O.PrimaryKey, O.Length(35,varying=false))
    /** Database column user_id DBType(INT), Default(None) */
    val userId: Column[Option[Int]] = column[Option[Int]]("user_id", O.Default(None))
    /** Database column date_created DBType(DATETIME) */
    val dateCreated: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("date_created")
    /** Database column last_updated DBType(DATETIME) */
    val lastUpdated: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("last_updated")
    /** Database column session_data DBType(LONGTEXT), Length(2147483647,true), Default(None) */
    val sessionData: Column[Option[String]] = column[Option[String]]("session_data", O.Length(2147483647,varying=true), O.Default(None))
    /** Database column session_token DBType(CHAR), Length(40,false) */
    val sessionToken: Column[String] = column[String]("session_token", O.Length(40,varying=false))
    /** Database column nodes DBType(TINYINT), Default(1) */
    val nodes: Column[Byte] = column[Byte]("nodes", O.Default(1))
    
    /** Index over (lastUpdated) (database name last_updated) */
    val index1 = index("last_updated", lastUpdated)
  }
  /** Collection-like TableQuery object for table PhpSession */
  lazy val PhpSession = new TableQuery(tag => new PhpSession(tag))
  
  /** Entity class storing rows of table SeqFedexCode
   *  @param id Database column id DBType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param firstId Database column first_id DBType(BIGINT)
   *  @param maxLimitId Database column max_limit_id DBType(BIGINT) */
  case class SeqFedexCodeRow(id: Long, firstId: Long, maxLimitId: Long)
  /** GetResult implicit for fetching SeqFedexCodeRow objects using plain SQL queries */
  implicit def GetResultSeqFedexCodeRow(implicit e0: GR[Long]): GR[SeqFedexCodeRow] = GR{
    prs => import prs._
    SeqFedexCodeRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table seq_fedex_code. Objects of this class serve as prototypes for rows in queries. */
  class SeqFedexCode(_tableTag: Tag) extends Table[SeqFedexCodeRow](_tableTag, "seq_fedex_code") {
    def * = (id, firstId, maxLimitId) <> (SeqFedexCodeRow.tupled, SeqFedexCodeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (id.?, firstId.?, maxLimitId.?).shaped.<>({r=>import r._; _1.map(_=> SeqFedexCodeRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val id: Column[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column first_id DBType(BIGINT) */
    val firstId: Column[Long] = column[Long]("first_id")
    /** Database column max_limit_id DBType(BIGINT) */
    val maxLimitId: Column[Long] = column[Long]("max_limit_id")
  }
  /** Collection-like TableQuery object for table SeqFedexCode */
  lazy val SeqFedexCode = new TableQuery(tag => new SeqFedexCode(tag))
  
  /** Entity class storing rows of table SeqFtpAccount
   *  @param id Database column id DBType(INT) */
  case class SeqFtpAccountRow(id: Int)
  /** GetResult implicit for fetching SeqFtpAccountRow objects using plain SQL queries */
  implicit def GetResultSeqFtpAccountRow(implicit e0: GR[Int]): GR[SeqFtpAccountRow] = GR{
    prs => import prs._
    SeqFtpAccountRow(<<[Int])
  }
  /** Table description of table seq_ftp_account. Objects of this class serve as prototypes for rows in queries. */
  class SeqFtpAccount(_tableTag: Tag) extends Table[SeqFtpAccountRow](_tableTag, "seq_ftp_account") {
    def * = id <> (SeqFtpAccountRow, SeqFtpAccountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = id.?.shaped.<>(r => r.map(_=> SeqFtpAccountRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT) */
    val id: Column[Int] = column[Int]("id")
  }
  /** Collection-like TableQuery object for table SeqFtpAccount */
  lazy val SeqFtpAccount = new TableQuery(tag => new SeqFtpAccount(tag))
  
  /** Entity class storing rows of table SeqHurikomiAccount
   *  @param id Database column id DBType(INT), AutoInc, PrimaryKey */
  case class SeqHurikomiAccountRow(id: Int)
  /** GetResult implicit for fetching SeqHurikomiAccountRow objects using plain SQL queries */
  implicit def GetResultSeqHurikomiAccountRow(implicit e0: GR[Int]): GR[SeqHurikomiAccountRow] = GR{
    prs => import prs._
    SeqHurikomiAccountRow(<<[Int])
  }
  /** Table description of table seq_hurikomi_account. Objects of this class serve as prototypes for rows in queries. */
  class SeqHurikomiAccount(_tableTag: Tag) extends Table[SeqHurikomiAccountRow](_tableTag, "seq_hurikomi_account") {
    def * = id <> (SeqHurikomiAccountRow, SeqHurikomiAccountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = id.?.shaped.<>(r => r.map(_=> SeqHurikomiAccountRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column id DBType(INT), AutoInc, PrimaryKey */
    val id: Column[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table SeqHurikomiAccount */
  lazy val SeqHurikomiAccount = new TableQuery(tag => new SeqHurikomiAccount(tag))
  
  /** Entity class storing rows of table Speedstatas
   *  @param 商家id Database column 商家ID DBType(INT)
   *  @param 剩余金额 Database column 剩余金额 DBType(INT) */
  case class SpeedstatasRow(商家id: Int, 剩余金额: Int)
  /** GetResult implicit for fetching SpeedstatasRow objects using plain SQL queries */
  implicit def GetResultSpeedstatasRow(implicit e0: GR[Int]): GR[SpeedstatasRow] = GR{
    prs => import prs._
    SpeedstatasRow.tupled((<<[Int], <<[Int]))
  }
  /** Table description of table speedSTATAS. Objects of this class serve as prototypes for rows in queries. */
  class Speedstatas(_tableTag: Tag) extends Table[SpeedstatasRow](_tableTag, "speedSTATAS") {
    def * = (商家id, 剩余金额) <> (SpeedstatasRow.tupled, SpeedstatasRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (商家id.?, 剩余金额.?).shaped.<>({r=>import r._; _1.map(_=> SpeedstatasRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column 商家ID DBType(INT) */
    val 商家id: Column[Int] = column[Int]("商家ID")
    /** Database column 剩余金额 DBType(INT) */
    val 剩余金额: Column[Int] = column[Int]("剩余金额")
  }
  /** Collection-like TableQuery object for table Speedstatas */
  lazy val Speedstatas = new TableQuery(tag => new Speedstatas(tag))
  
  /** Entity class storing rows of table TAd
   *  @param tAdId Database column t_ad_id DBType(INT), AutoInc, PrimaryKey
   *  @param tAdDate Database column t_ad_date DBType(DATE)
   *  @param tAdKey Database column t_ad_key DBType(VARCHAR), Length(50,true)
   *  @param tAdMMakerId Database column t_ad_m_maker_id DBType(INT)
   *  @param tAdTAdImageId Database column t_ad_t_ad_image_id DBType(INT)
   *  @param tAdUrl Database column t_ad_url DBType(TEXT), Length(65535,true)
   *  @param tAdText Database column t_ad_text DBType(TEXT), Length(65535,true) */
  case class TAdRow(tAdId: Int, tAdDate: java.sql.Date, tAdKey: String, tAdMMakerId: Int, tAdTAdImageId: Int, tAdUrl: String, tAdText: String)
  /** GetResult implicit for fetching TAdRow objects using plain SQL queries */
  implicit def GetResultTAdRow(implicit e0: GR[Int], e1: GR[java.sql.Date], e2: GR[String]): GR[TAdRow] = GR{
    prs => import prs._
    TAdRow.tupled((<<[Int], <<[java.sql.Date], <<[String], <<[Int], <<[Int], <<[String], <<[String]))
  }
  /** Table description of table t_ad. Objects of this class serve as prototypes for rows in queries. */
  class TAd(_tableTag: Tag) extends Table[TAdRow](_tableTag, "t_ad") {
    def * = (tAdId, tAdDate, tAdKey, tAdMMakerId, tAdTAdImageId, tAdUrl, tAdText) <> (TAdRow.tupled, TAdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tAdId.?, tAdDate.?, tAdKey.?, tAdMMakerId.?, tAdTAdImageId.?, tAdUrl.?, tAdText.?).shaped.<>({r=>import r._; _1.map(_=> TAdRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_ad_id DBType(INT), AutoInc, PrimaryKey */
    val tAdId: Column[Int] = column[Int]("t_ad_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_ad_date DBType(DATE) */
    val tAdDate: Column[java.sql.Date] = column[java.sql.Date]("t_ad_date")
    /** Database column t_ad_key DBType(VARCHAR), Length(50,true) */
    val tAdKey: Column[String] = column[String]("t_ad_key", O.Length(50,varying=true))
    /** Database column t_ad_m_maker_id DBType(INT) */
    val tAdMMakerId: Column[Int] = column[Int]("t_ad_m_maker_id")
    /** Database column t_ad_t_ad_image_id DBType(INT) */
    val tAdTAdImageId: Column[Int] = column[Int]("t_ad_t_ad_image_id")
    /** Database column t_ad_url DBType(TEXT), Length(65535,true) */
    val tAdUrl: Column[String] = column[String]("t_ad_url", O.Length(65535,varying=true))
    /** Database column t_ad_text DBType(TEXT), Length(65535,true) */
    val tAdText: Column[String] = column[String]("t_ad_text", O.Length(65535,varying=true))
    
    /** Index over (tAdDate) (database name t_ad_date) */
    val index1 = index("t_ad_date", tAdDate)
    /** Uniqueness Index over (tAdDate,tAdKey) (database name t_ad_date_2) */
    val index2 = index("t_ad_date_2", (tAdDate, tAdKey), unique=true)
  }
  /** Collection-like TableQuery object for table TAd */
  lazy val TAd = new TableQuery(tag => new TAd(tag))
  
  /** Entity class storing rows of table TAdImage
   *  @param tAdImageId Database column t_ad_image_id DBType(INT), AutoInc, PrimaryKey
   *  @param tAdImageMimeType Database column t_ad_image_mime_type DBType(VARCHAR), Length(50,true)
   *  @param tAdImageName Database column t_ad_image_name DBType(TEXT), Length(65535,true)
   *  @param tAdImageUrl Database column t_ad_image_url DBType(VARCHAR), Length(255,true) */
  case class TAdImageRow(tAdImageId: Int, tAdImageMimeType: String, tAdImageName: String, tAdImageUrl: String)
  /** GetResult implicit for fetching TAdImageRow objects using plain SQL queries */
  implicit def GetResultTAdImageRow(implicit e0: GR[Int], e1: GR[String]): GR[TAdImageRow] = GR{
    prs => import prs._
    TAdImageRow.tupled((<<[Int], <<[String], <<[String], <<[String]))
  }
  /** Table description of table t_ad_image. Objects of this class serve as prototypes for rows in queries. */
  class TAdImage(_tableTag: Tag) extends Table[TAdImageRow](_tableTag, "t_ad_image") {
    def * = (tAdImageId, tAdImageMimeType, tAdImageName, tAdImageUrl) <> (TAdImageRow.tupled, TAdImageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tAdImageId.?, tAdImageMimeType.?, tAdImageName.?, tAdImageUrl.?).shaped.<>({r=>import r._; _1.map(_=> TAdImageRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_ad_image_id DBType(INT), AutoInc, PrimaryKey */
    val tAdImageId: Column[Int] = column[Int]("t_ad_image_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_ad_image_mime_type DBType(VARCHAR), Length(50,true) */
    val tAdImageMimeType: Column[String] = column[String]("t_ad_image_mime_type", O.Length(50,varying=true))
    /** Database column t_ad_image_name DBType(TEXT), Length(65535,true) */
    val tAdImageName: Column[String] = column[String]("t_ad_image_name", O.Length(65535,varying=true))
    /** Database column t_ad_image_url DBType(VARCHAR), Length(255,true) */
    val tAdImageUrl: Column[String] = column[String]("t_ad_image_url", O.Length(255,varying=true))
  }
  /** Collection-like TableQuery object for table TAdImage */
  lazy val TAdImage = new TableQuery(tag => new TAdImage(tag))
  
  /** Entity class storing rows of table TAnnouncement
   *  @param tAnnouncementId Database column t_announcement_id DBType(INT), AutoInc, PrimaryKey
   *  @param tAnnouncementVoidFlag Database column t_announcement_void_flag DBType(TINYINT)
   *  @param tAnnouncementCategory Database column t_announcement_category DBType(TINYINT)
   *  @param tAnnouncementType Database column t_announcement_type DBType(TINYINT)
   *  @param tAnnouncementOrder Database column t_announcement_order DBType(INT)
   *  @param tAnnouncementDate Database column t_announcement_date DBType(DATE)
   *  @param tAnnouncementStart Database column t_announcement_start DBType(DATETIME)
   *  @param tAnnouncementEnd Database column t_announcement_end DBType(DATETIME)
   *  @param tAnnouncementName Database column t_announcement_name DBType(VARCHAR), Length(255,true)
   *  @param tAnnouncementTitle Database column t_announcement_title DBType(VARCHAR), Length(255,true)
   *  @param tAnnouncementUrl Database column t_announcement_url DBType(TEXT), Length(65535,true)
   *  @param tAnnouncementContents Database column t_announcement_contents DBType(TEXT), Length(65535,true) */
  case class TAnnouncementRow(tAnnouncementId: Int, tAnnouncementVoidFlag: Byte, tAnnouncementCategory: Byte, tAnnouncementType: Byte, tAnnouncementOrder: Int, tAnnouncementDate: java.sql.Date, tAnnouncementStart: java.sql.Timestamp, tAnnouncementEnd: java.sql.Timestamp, tAnnouncementName: String, tAnnouncementTitle: String, tAnnouncementUrl: String, tAnnouncementContents: String)
  /** GetResult implicit for fetching TAnnouncementRow objects using plain SQL queries */
  implicit def GetResultTAnnouncementRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[java.sql.Date], e3: GR[java.sql.Timestamp], e4: GR[String]): GR[TAnnouncementRow] = GR{
    prs => import prs._
    TAnnouncementRow.tupled((<<[Int], <<[Byte], <<[Byte], <<[Byte], <<[Int], <<[java.sql.Date], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table t_announcement. Objects of this class serve as prototypes for rows in queries. */
  class TAnnouncement(_tableTag: Tag) extends Table[TAnnouncementRow](_tableTag, "t_announcement") {
    def * = (tAnnouncementId, tAnnouncementVoidFlag, tAnnouncementCategory, tAnnouncementType, tAnnouncementOrder, tAnnouncementDate, tAnnouncementStart, tAnnouncementEnd, tAnnouncementName, tAnnouncementTitle, tAnnouncementUrl, tAnnouncementContents) <> (TAnnouncementRow.tupled, TAnnouncementRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tAnnouncementId.?, tAnnouncementVoidFlag.?, tAnnouncementCategory.?, tAnnouncementType.?, tAnnouncementOrder.?, tAnnouncementDate.?, tAnnouncementStart.?, tAnnouncementEnd.?, tAnnouncementName.?, tAnnouncementTitle.?, tAnnouncementUrl.?, tAnnouncementContents.?).shaped.<>({r=>import r._; _1.map(_=> TAnnouncementRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_announcement_id DBType(INT), AutoInc, PrimaryKey */
    val tAnnouncementId: Column[Int] = column[Int]("t_announcement_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_announcement_void_flag DBType(TINYINT) */
    val tAnnouncementVoidFlag: Column[Byte] = column[Byte]("t_announcement_void_flag")
    /** Database column t_announcement_category DBType(TINYINT) */
    val tAnnouncementCategory: Column[Byte] = column[Byte]("t_announcement_category")
    /** Database column t_announcement_type DBType(TINYINT) */
    val tAnnouncementType: Column[Byte] = column[Byte]("t_announcement_type")
    /** Database column t_announcement_order DBType(INT) */
    val tAnnouncementOrder: Column[Int] = column[Int]("t_announcement_order")
    /** Database column t_announcement_date DBType(DATE) */
    val tAnnouncementDate: Column[java.sql.Date] = column[java.sql.Date]("t_announcement_date")
    /** Database column t_announcement_start DBType(DATETIME) */
    val tAnnouncementStart: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_announcement_start")
    /** Database column t_announcement_end DBType(DATETIME) */
    val tAnnouncementEnd: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_announcement_end")
    /** Database column t_announcement_name DBType(VARCHAR), Length(255,true) */
    val tAnnouncementName: Column[String] = column[String]("t_announcement_name", O.Length(255,varying=true))
    /** Database column t_announcement_title DBType(VARCHAR), Length(255,true) */
    val tAnnouncementTitle: Column[String] = column[String]("t_announcement_title", O.Length(255,varying=true))
    /** Database column t_announcement_url DBType(TEXT), Length(65535,true) */
    val tAnnouncementUrl: Column[String] = column[String]("t_announcement_url", O.Length(65535,varying=true))
    /** Database column t_announcement_contents DBType(TEXT), Length(65535,true) */
    val tAnnouncementContents: Column[String] = column[String]("t_announcement_contents", O.Length(65535,varying=true))
    
    /** Index over (tAnnouncementCategory) (database name t_announcement_category) */
    val index1 = index("t_announcement_category", tAnnouncementCategory)
  }
  /** Collection-like TableQuery object for table TAnnouncement */
  lazy val TAnnouncement = new TableQuery(tag => new TAnnouncement(tag))
  
  /** Row type of table TApplication */
  type TApplicationRow = HCons[Int,HCons[Byte,HCons[Int,HCons[Int,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Boolean,HCons[Byte,HCons[java.sql.Timestamp,HCons[Int,HCons[String,HCons[java.sql.Timestamp,HCons[Int,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[Int,HCons[Int,HCons[Byte,HCons[Byte,HCons[Byte,HCons[java.sql.Timestamp,HCons[String,HNil]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for TApplicationRow providing default values if available in the database schema. */
  def TApplicationRow(tApplicationId: Int, tApplicationVoidFlag: Byte, tApplicationMMakerId: Int, tApplicationMItemId: Int, tApplicationData: String, tApplicationComment: String, tApplicationNgComment: String, tApplicationCheck: String, tApplicationCheckStatus: Boolean = false, tApplicationNgFlag: Byte, tApplicationNgUdatetime: java.sql.Timestamp, tApplicationNgUuser: Int, tApplicationNgCause: String, tApplicationLockDatetime: java.sql.Timestamp, tApplicationLockUser: Int = 0, tApplicationRdatetime: java.sql.Timestamp, tApplicationUdatetime: java.sql.Timestamp, tApplicationRuser: Int, tApplicationUuser: Int, tApplicationAutoFlag: Byte = 0, tApplicationRunFlag: Byte = 0, tApplicationAutotimeFlag: Byte = 0, tApplicationTimedate: java.sql.Timestamp, tApplicationCmdStatus: String = "simple"): TApplicationRow = {
    tApplicationId :: tApplicationVoidFlag :: tApplicationMMakerId :: tApplicationMItemId :: tApplicationData :: tApplicationComment :: tApplicationNgComment :: tApplicationCheck :: tApplicationCheckStatus :: tApplicationNgFlag :: tApplicationNgUdatetime :: tApplicationNgUuser :: tApplicationNgCause :: tApplicationLockDatetime :: tApplicationLockUser :: tApplicationRdatetime :: tApplicationUdatetime :: tApplicationRuser :: tApplicationUuser :: tApplicationAutoFlag :: tApplicationRunFlag :: tApplicationAutotimeFlag :: tApplicationTimedate :: tApplicationCmdStatus :: HNil
  }
  /** GetResult implicit for fetching TApplicationRow objects using plain SQL queries */
  implicit def GetResultTApplicationRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[Boolean], e4: GR[java.sql.Timestamp]): GR[TApplicationRow] = GR{
    prs => import prs._
    <<[Int] :: <<[Byte] :: <<[Int] :: <<[Int] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Boolean] :: <<[Byte] :: <<[java.sql.Timestamp] :: <<[Int] :: <<[String] :: <<[java.sql.Timestamp] :: <<[Int] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[Int] :: <<[Int] :: <<[Byte] :: <<[Byte] :: <<[Byte] :: <<[java.sql.Timestamp] :: <<[String] :: HNil
  }
  /** Table description of table t_application. Objects of this class serve as prototypes for rows in queries. */
  class TApplication(_tableTag: Tag) extends Table[TApplicationRow](_tableTag, "t_application") {
    def * = tApplicationId :: tApplicationVoidFlag :: tApplicationMMakerId :: tApplicationMItemId :: tApplicationData :: tApplicationComment :: tApplicationNgComment :: tApplicationCheck :: tApplicationCheckStatus :: tApplicationNgFlag :: tApplicationNgUdatetime :: tApplicationNgUuser :: tApplicationNgCause :: tApplicationLockDatetime :: tApplicationLockUser :: tApplicationRdatetime :: tApplicationUdatetime :: tApplicationRuser :: tApplicationUuser :: tApplicationAutoFlag :: tApplicationRunFlag :: tApplicationAutotimeFlag :: tApplicationTimedate :: tApplicationCmdStatus :: HNil
    
    /** Database column t_application_id DBType(INT), AutoInc, PrimaryKey */
    val tApplicationId: Column[Int] = column[Int]("t_application_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_application_void_flag DBType(TINYINT) */
    val tApplicationVoidFlag: Column[Byte] = column[Byte]("t_application_void_flag")
    /** Database column t_application_m_maker_id DBType(INT) */
    val tApplicationMMakerId: Column[Int] = column[Int]("t_application_m_maker_id")
    /** Database column t_application_m_item_id DBType(INT) */
    val tApplicationMItemId: Column[Int] = column[Int]("t_application_m_item_id")
    /** Database column t_application_data DBType(MEDIUMTEXT), Length(16777215,true) */
    val tApplicationData: Column[String] = column[String]("t_application_data", O.Length(16777215,varying=true))
    /** Database column t_application_comment DBType(TEXT), Length(65535,true) */
    val tApplicationComment: Column[String] = column[String]("t_application_comment", O.Length(65535,varying=true))
    /** Database column t_application_ng_comment DBType(TEXT), Length(65535,true) */
    val tApplicationNgComment: Column[String] = column[String]("t_application_ng_comment", O.Length(65535,varying=true))
    /** Database column t_application_check DBType(TEXT), Length(65535,true) */
    val tApplicationCheck: Column[String] = column[String]("t_application_check", O.Length(65535,varying=true))
    /** Database column t_application_check_status DBType(BIT), Default(false) */
    val tApplicationCheckStatus: Column[Boolean] = column[Boolean]("t_application_check_status", O.Default(false))
    /** Database column t_application_ng_flag DBType(TINYINT) */
    val tApplicationNgFlag: Column[Byte] = column[Byte]("t_application_ng_flag")
    /** Database column t_application_ng_udatetime DBType(DATETIME) */
    val tApplicationNgUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_application_ng_udatetime")
    /** Database column t_application_ng_uuser DBType(INT) */
    val tApplicationNgUuser: Column[Int] = column[Int]("t_application_ng_uuser")
    /** Database column t_application_ng_cause DBType(TEXT), Length(65535,true) */
    val tApplicationNgCause: Column[String] = column[String]("t_application_ng_cause", O.Length(65535,varying=true))
    /** Database column t_application_lock_datetime DBType(DATETIME) */
    val tApplicationLockDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_application_lock_datetime")
    /** Database column t_application_lock_user DBType(INT), Default(0) */
    val tApplicationLockUser: Column[Int] = column[Int]("t_application_lock_user", O.Default(0))
    /** Database column t_application_rdatetime DBType(DATETIME) */
    val tApplicationRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_application_rdatetime")
    /** Database column t_application_udatetime DBType(DATETIME) */
    val tApplicationUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_application_udatetime")
    /** Database column t_application_ruser DBType(INT) */
    val tApplicationRuser: Column[Int] = column[Int]("t_application_ruser")
    /** Database column t_application_uuser DBType(INT) */
    val tApplicationUuser: Column[Int] = column[Int]("t_application_uuser")
    /** Database column t_application_auto_flag DBType(TINYINT UNSIGNED), Default(0) */
    val tApplicationAutoFlag: Column[Byte] = column[Byte]("t_application_auto_flag", O.Default(0))
    /** Database column t_application_run_flag DBType(TINYINT UNSIGNED), Default(0) */
    val tApplicationRunFlag: Column[Byte] = column[Byte]("t_application_run_flag", O.Default(0))
    /** Database column t_application_autotime_flag DBType(TINYINT UNSIGNED), Default(0) */
    val tApplicationAutotimeFlag: Column[Byte] = column[Byte]("t_application_autotime_flag", O.Default(0))
    /** Database column t_application_timedate DBType(DATETIME) */
    val tApplicationTimedate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_application_timedate")
    /** Database column t_application_cmd_status DBType(ENUM), Length(12,false), Default(simple) */
    val tApplicationCmdStatus: Column[String] = column[String]("t_application_cmd_status", O.Length(12,varying=false), O.Default("simple"))
  }
  /** Collection-like TableQuery object for table TApplication */
  lazy val TApplication = new TableQuery(tag => new TApplication(tag))
  
  /** Entity class storing rows of table TApplicationImg
   *  @param tApplicationImgId Database column t_application_img_id DBType(INT), AutoInc, PrimaryKey
   *  @param tApplicationImgTApplicationId Database column t_application_img_t_application_id DBType(INT), Default(0)
   *  @param tApplicationImgMSpaceImageId Database column t_application_img_m_space_image_id DBType(INT), Default(0)
   *  @param tApplicationImgOrder Database column t_application_img_order DBType(SMALLINT), Default(0)
   *  @param tApplicationImgRdatetime Database column t_application_img_rdatetime DBType(DATETIME)
   *  @param tApplicationImgUdatetime Database column t_application_img_udatetime DBType(DATETIME)
   *  @param tApplicationImgRuser Database column t_application_img_ruser DBType(INT)
   *  @param tApplicationImgUuser Database column t_application_img_uuser DBType(INT) */
  case class TApplicationImgRow(tApplicationImgId: Int, tApplicationImgTApplicationId: Int = 0, tApplicationImgMSpaceImageId: Int = 0, tApplicationImgOrder: Short = 0, tApplicationImgRdatetime: java.sql.Timestamp, tApplicationImgUdatetime: java.sql.Timestamp, tApplicationImgRuser: Int, tApplicationImgUuser: Int)
  /** GetResult implicit for fetching TApplicationImgRow objects using plain SQL queries */
  implicit def GetResultTApplicationImgRow(implicit e0: GR[Int], e1: GR[Short], e2: GR[java.sql.Timestamp]): GR[TApplicationImgRow] = GR{
    prs => import prs._
    TApplicationImgRow.tupled((<<[Int], <<[Int], <<[Int], <<[Short], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table t_application_img. Objects of this class serve as prototypes for rows in queries. */
  class TApplicationImg(_tableTag: Tag) extends Table[TApplicationImgRow](_tableTag, "t_application_img") {
    def * = (tApplicationImgId, tApplicationImgTApplicationId, tApplicationImgMSpaceImageId, tApplicationImgOrder, tApplicationImgRdatetime, tApplicationImgUdatetime, tApplicationImgRuser, tApplicationImgUuser) <> (TApplicationImgRow.tupled, TApplicationImgRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tApplicationImgId.?, tApplicationImgTApplicationId.?, tApplicationImgMSpaceImageId.?, tApplicationImgOrder.?, tApplicationImgRdatetime.?, tApplicationImgUdatetime.?, tApplicationImgRuser.?, tApplicationImgUuser.?).shaped.<>({r=>import r._; _1.map(_=> TApplicationImgRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_application_img_id DBType(INT), AutoInc, PrimaryKey */
    val tApplicationImgId: Column[Int] = column[Int]("t_application_img_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_application_img_t_application_id DBType(INT), Default(0) */
    val tApplicationImgTApplicationId: Column[Int] = column[Int]("t_application_img_t_application_id", O.Default(0))
    /** Database column t_application_img_m_space_image_id DBType(INT), Default(0) */
    val tApplicationImgMSpaceImageId: Column[Int] = column[Int]("t_application_img_m_space_image_id", O.Default(0))
    /** Database column t_application_img_order DBType(SMALLINT), Default(0) */
    val tApplicationImgOrder: Column[Short] = column[Short]("t_application_img_order", O.Default(0))
    /** Database column t_application_img_rdatetime DBType(DATETIME) */
    val tApplicationImgRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_application_img_rdatetime")
    /** Database column t_application_img_udatetime DBType(DATETIME) */
    val tApplicationImgUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_application_img_udatetime")
    /** Database column t_application_img_ruser DBType(INT) */
    val tApplicationImgRuser: Column[Int] = column[Int]("t_application_img_ruser")
    /** Database column t_application_img_uuser DBType(INT) */
    val tApplicationImgUuser: Column[Int] = column[Int]("t_application_img_uuser")
    
    /** Index over (tApplicationImgTApplicationId) (database name t_application_img_t_application_id) */
    val index1 = index("t_application_img_t_application_id", tApplicationImgTApplicationId)
  }
  /** Collection-like TableQuery object for table TApplicationImg */
  lazy val TApplicationImg = new TableQuery(tag => new TApplicationImg(tag))
  
  /** Entity class storing rows of table TApplicationTemplate
   *  @param tApplicationTemplateId Database column t_application_template_id DBType(INT), AutoInc, PrimaryKey
   *  @param tApplicationTemplateName Database column t_application_template_name DBType(VARCHAR), Length(100,true)
   *  @param tApplicationTemplateHtml Database column t_application_template_html DBType(VARCHAR), Length(100,true)
   *  @param tApplicationTemplateUnitarray Database column t_application_template_unitarray DBType(VARCHAR), Length(255,true) */
  case class TApplicationTemplateRow(tApplicationTemplateId: Int, tApplicationTemplateName: String, tApplicationTemplateHtml: String, tApplicationTemplateUnitarray: String)
  /** GetResult implicit for fetching TApplicationTemplateRow objects using plain SQL queries */
  implicit def GetResultTApplicationTemplateRow(implicit e0: GR[Int], e1: GR[String]): GR[TApplicationTemplateRow] = GR{
    prs => import prs._
    TApplicationTemplateRow.tupled((<<[Int], <<[String], <<[String], <<[String]))
  }
  /** Table description of table t_application_template. Objects of this class serve as prototypes for rows in queries. */
  class TApplicationTemplate(_tableTag: Tag) extends Table[TApplicationTemplateRow](_tableTag, "t_application_template") {
    def * = (tApplicationTemplateId, tApplicationTemplateName, tApplicationTemplateHtml, tApplicationTemplateUnitarray) <> (TApplicationTemplateRow.tupled, TApplicationTemplateRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tApplicationTemplateId.?, tApplicationTemplateName.?, tApplicationTemplateHtml.?, tApplicationTemplateUnitarray.?).shaped.<>({r=>import r._; _1.map(_=> TApplicationTemplateRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_application_template_id DBType(INT), AutoInc, PrimaryKey */
    val tApplicationTemplateId: Column[Int] = column[Int]("t_application_template_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_application_template_name DBType(VARCHAR), Length(100,true) */
    val tApplicationTemplateName: Column[String] = column[String]("t_application_template_name", O.Length(100,varying=true))
    /** Database column t_application_template_html DBType(VARCHAR), Length(100,true) */
    val tApplicationTemplateHtml: Column[String] = column[String]("t_application_template_html", O.Length(100,varying=true))
    /** Database column t_application_template_unitarray DBType(VARCHAR), Length(255,true) */
    val tApplicationTemplateUnitarray: Column[String] = column[String]("t_application_template_unitarray", O.Length(255,varying=true))
  }
  /** Collection-like TableQuery object for table TApplicationTemplate */
  lazy val TApplicationTemplate = new TableQuery(tag => new TApplicationTemplate(tag))
  
  /** Entity class storing rows of table TAuthority
   *  @param tAuthorityId Database column t_authority_id DBType(INT), AutoInc, PrimaryKey
   *  @param tAuthorityAro Database column t_authority_aro DBType(INT)
   *  @param tAuthorityAco Database column t_authority_aco DBType(VARCHAR), Length(200,true)
   *  @param tAuthorityRdtime Database column t_authority_rdtime DBType(DATETIME)
   *  @param tAuthorityUdtime Database column t_authority_udtime DBType(DATETIME)
   *  @param tAuthorityRuser Database column t_authority_ruser DBType(INT)
   *  @param tAuthorityUuser Database column t_authority_uuser DBType(INT) */
  case class TAuthorityRow(tAuthorityId: Int, tAuthorityAro: Int, tAuthorityAco: String, tAuthorityRdtime: java.sql.Timestamp, tAuthorityUdtime: java.sql.Timestamp, tAuthorityRuser: Int, tAuthorityUuser: Int)
  /** GetResult implicit for fetching TAuthorityRow objects using plain SQL queries */
  implicit def GetResultTAuthorityRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TAuthorityRow] = GR{
    prs => import prs._
    TAuthorityRow.tupled((<<[Int], <<[Int], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table t_authority. Objects of this class serve as prototypes for rows in queries. */
  class TAuthority(_tableTag: Tag) extends Table[TAuthorityRow](_tableTag, "t_authority") {
    def * = (tAuthorityId, tAuthorityAro, tAuthorityAco, tAuthorityRdtime, tAuthorityUdtime, tAuthorityRuser, tAuthorityUuser) <> (TAuthorityRow.tupled, TAuthorityRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tAuthorityId.?, tAuthorityAro.?, tAuthorityAco.?, tAuthorityRdtime.?, tAuthorityUdtime.?, tAuthorityRuser.?, tAuthorityUuser.?).shaped.<>({r=>import r._; _1.map(_=> TAuthorityRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_authority_id DBType(INT), AutoInc, PrimaryKey */
    val tAuthorityId: Column[Int] = column[Int]("t_authority_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_authority_aro DBType(INT) */
    val tAuthorityAro: Column[Int] = column[Int]("t_authority_aro")
    /** Database column t_authority_aco DBType(VARCHAR), Length(200,true) */
    val tAuthorityAco: Column[String] = column[String]("t_authority_aco", O.Length(200,varying=true))
    /** Database column t_authority_rdtime DBType(DATETIME) */
    val tAuthorityRdtime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_authority_rdtime")
    /** Database column t_authority_udtime DBType(DATETIME) */
    val tAuthorityUdtime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_authority_udtime")
    /** Database column t_authority_ruser DBType(INT) */
    val tAuthorityRuser: Column[Int] = column[Int]("t_authority_ruser")
    /** Database column t_authority_uuser DBType(INT) */
    val tAuthorityUuser: Column[Int] = column[Int]("t_authority_uuser")
    
    /** Uniqueness Index over (tAuthorityAro,tAuthorityAco) (database name t_authority_aro) */
    val index1 = index("t_authority_aro", (tAuthorityAro, tAuthorityAco), unique=true)
  }
  /** Collection-like TableQuery object for table TAuthority */
  lazy val TAuthority = new TableQuery(tag => new TAuthority(tag))
  
  /** Entity class storing rows of table TCardhistory
   *  @param tCardhistoryMCustomerId Database column t_cardhistory_m_customer_id DBType(INT), PrimaryKey, Default(0)
   *  @param tCardhistoryInfo Database column t_cardhistory_info DBType(VARCHAR), Length(225,true), Default()
   *  @param tCardhistoryRdatetime Database column t_cardhistory_rdatetime DBType(DATETIME) */
  case class TCardhistoryRow(tCardhistoryMCustomerId: Int = 0, tCardhistoryInfo: String = "", tCardhistoryRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TCardhistoryRow objects using plain SQL queries */
  implicit def GetResultTCardhistoryRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TCardhistoryRow] = GR{
    prs => import prs._
    TCardhistoryRow.tupled((<<[Int], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_cardhistory. Objects of this class serve as prototypes for rows in queries. */
  class TCardhistory(_tableTag: Tag) extends Table[TCardhistoryRow](_tableTag, "t_cardhistory") {
    def * = (tCardhistoryMCustomerId, tCardhistoryInfo, tCardhistoryRdatetime) <> (TCardhistoryRow.tupled, TCardhistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCardhistoryMCustomerId.?, tCardhistoryInfo.?, tCardhistoryRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TCardhistoryRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_cardhistory_m_customer_id DBType(INT), PrimaryKey, Default(0) */
    val tCardhistoryMCustomerId: Column[Int] = column[Int]("t_cardhistory_m_customer_id", O.PrimaryKey, O.Default(0))
    /** Database column t_cardhistory_info DBType(VARCHAR), Length(225,true), Default() */
    val tCardhistoryInfo: Column[String] = column[String]("t_cardhistory_info", O.Length(225,varying=true), O.Default(""))
    /** Database column t_cardhistory_rdatetime DBType(DATETIME) */
    val tCardhistoryRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_cardhistory_rdatetime")
  }
  /** Collection-like TableQuery object for table TCardhistory */
  lazy val TCardhistory = new TableQuery(tag => new TCardhistory(tag))
  
  /** Entity class storing rows of table TCardpay
   *  @param tCardpayXid Database column t_cardpay_xid DBType(VARCHAR), PrimaryKey, Length(225,true)
   *  @param tCardpayTJuchuId Database column t_cardpay_t_juchu_id DBType(INT), Default(0)
   *  @param tCardpayPayFlag Database column t_cardpay_pay_flag DBType(BIT), Default(false)
   *  @param tCardpayAmount Database column t_cardpay_amount DBType(INT), Default(0)
   *  @param tCardpaySavecardinfo Database column t_cardpay_savecardinfo DBType(BIT), Default(false)
   *  @param tCardpayRdatetime Database column t_cardpay_rdatetime DBType(DATETIME)
   *  @param tCardpayUdatetime Database column t_cardpay_udatetime DBType(DATETIME) */
  case class TCardpayRow(tCardpayXid: String, tCardpayTJuchuId: Int = 0, tCardpayPayFlag: Boolean = false, tCardpayAmount: Int = 0, tCardpaySavecardinfo: Boolean = false, tCardpayRdatetime: java.sql.Timestamp, tCardpayUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TCardpayRow objects using plain SQL queries */
  implicit def GetResultTCardpayRow(implicit e0: GR[String], e1: GR[Int], e2: GR[Boolean], e3: GR[java.sql.Timestamp]): GR[TCardpayRow] = GR{
    prs => import prs._
    TCardpayRow.tupled((<<[String], <<[Int], <<[Boolean], <<[Int], <<[Boolean], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_cardpay. Objects of this class serve as prototypes for rows in queries. */
  class TCardpay(_tableTag: Tag) extends Table[TCardpayRow](_tableTag, "t_cardpay") {
    def * = (tCardpayXid, tCardpayTJuchuId, tCardpayPayFlag, tCardpayAmount, tCardpaySavecardinfo, tCardpayRdatetime, tCardpayUdatetime) <> (TCardpayRow.tupled, TCardpayRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCardpayXid.?, tCardpayTJuchuId.?, tCardpayPayFlag.?, tCardpayAmount.?, tCardpaySavecardinfo.?, tCardpayRdatetime.?, tCardpayUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TCardpayRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_cardpay_xid DBType(VARCHAR), PrimaryKey, Length(225,true) */
    val tCardpayXid: Column[String] = column[String]("t_cardpay_xid", O.PrimaryKey, O.Length(225,varying=true))
    /** Database column t_cardpay_t_juchu_id DBType(INT), Default(0) */
    val tCardpayTJuchuId: Column[Int] = column[Int]("t_cardpay_t_juchu_id", O.Default(0))
    /** Database column t_cardpay_pay_flag DBType(BIT), Default(false) */
    val tCardpayPayFlag: Column[Boolean] = column[Boolean]("t_cardpay_pay_flag", O.Default(false))
    /** Database column t_cardpay_amount DBType(INT), Default(0) */
    val tCardpayAmount: Column[Int] = column[Int]("t_cardpay_amount", O.Default(0))
    /** Database column t_cardpay_savecardinfo DBType(BIT), Default(false) */
    val tCardpaySavecardinfo: Column[Boolean] = column[Boolean]("t_cardpay_savecardinfo", O.Default(false))
    /** Database column t_cardpay_rdatetime DBType(DATETIME) */
    val tCardpayRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_cardpay_rdatetime")
    /** Database column t_cardpay_udatetime DBType(DATETIME) */
    val tCardpayUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_cardpay_udatetime")
  }
  /** Collection-like TableQuery object for table TCardpay */
  lazy val TCardpay = new TableQuery(tag => new TCardpay(tag))
  
  /** Entity class storing rows of table TCart
   *  @param tCartId Database column t_cart_id DBType(INT), AutoInc, PrimaryKey
   *  @param tCartTotal Database column t_cart_total DBType(INT)
   *  @param tCartPrice Database column t_cart_price DBType(INT)
   *  @param tCartTax Database column t_cart_tax DBType(INT)
   *  @param tCartPostage Database column t_cart_postage DBType(INT)
   *  @param tCartPlanCharge Database column t_cart_plan_charge DBType(TEXT), Length(65535,true)
   *  @param tCartAccount Database column t_cart_account DBType(VARCHAR), Length(50,true)
   *  @param tCartCustomerInfo Database column t_cart_customer_info DBType(TEXT), Length(65535,true)
   *  @param tCartRdatetime Database column t_cart_rdatetime DBType(DATETIME)
   *  @param tCartUdatetime Database column t_cart_udatetime DBType(DATETIME)
   *  @param tCartTCouponId Database column t_cart_t_coupon_id DBType(INT), Default(0) */
  case class TCartRow(tCartId: Int, tCartTotal: Int, tCartPrice: Int, tCartTax: Int, tCartPostage: Int, tCartPlanCharge: String, tCartAccount: String, tCartCustomerInfo: String, tCartRdatetime: java.sql.Timestamp, tCartUdatetime: java.sql.Timestamp, tCartTCouponId: Int = 0)
  /** GetResult implicit for fetching TCartRow objects using plain SQL queries */
  implicit def GetResultTCartRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TCartRow] = GR{
    prs => import prs._
    TCartRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int]))
  }
  /** Table description of table t_cart. Objects of this class serve as prototypes for rows in queries. */
  class TCart(_tableTag: Tag) extends Table[TCartRow](_tableTag, "t_cart") {
    def * = (tCartId, tCartTotal, tCartPrice, tCartTax, tCartPostage, tCartPlanCharge, tCartAccount, tCartCustomerInfo, tCartRdatetime, tCartUdatetime, tCartTCouponId) <> (TCartRow.tupled, TCartRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCartId.?, tCartTotal.?, tCartPrice.?, tCartTax.?, tCartPostage.?, tCartPlanCharge.?, tCartAccount.?, tCartCustomerInfo.?, tCartRdatetime.?, tCartUdatetime.?, tCartTCouponId.?).shaped.<>({r=>import r._; _1.map(_=> TCartRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_cart_id DBType(INT), AutoInc, PrimaryKey */
    val tCartId: Column[Int] = column[Int]("t_cart_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_cart_total DBType(INT) */
    val tCartTotal: Column[Int] = column[Int]("t_cart_total")
    /** Database column t_cart_price DBType(INT) */
    val tCartPrice: Column[Int] = column[Int]("t_cart_price")
    /** Database column t_cart_tax DBType(INT) */
    val tCartTax: Column[Int] = column[Int]("t_cart_tax")
    /** Database column t_cart_postage DBType(INT) */
    val tCartPostage: Column[Int] = column[Int]("t_cart_postage")
    /** Database column t_cart_plan_charge DBType(TEXT), Length(65535,true) */
    val tCartPlanCharge: Column[String] = column[String]("t_cart_plan_charge", O.Length(65535,varying=true))
    /** Database column t_cart_account DBType(VARCHAR), Length(50,true) */
    val tCartAccount: Column[String] = column[String]("t_cart_account", O.Length(50,varying=true))
    /** Database column t_cart_customer_info DBType(TEXT), Length(65535,true) */
    val tCartCustomerInfo: Column[String] = column[String]("t_cart_customer_info", O.Length(65535,varying=true))
    /** Database column t_cart_rdatetime DBType(DATETIME) */
    val tCartRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_cart_rdatetime")
    /** Database column t_cart_udatetime DBType(DATETIME) */
    val tCartUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_cart_udatetime")
    /** Database column t_cart_t_coupon_id DBType(INT), Default(0) */
    val tCartTCouponId: Column[Int] = column[Int]("t_cart_t_coupon_id", O.Default(0))
  }
  /** Collection-like TableQuery object for table TCart */
  lazy val TCart = new TableQuery(tag => new TCart(tag))
  
  /** Entity class storing rows of table TCartItem
   *  @param tCartItemId Database column t_cart_item_id DBType(INT), AutoInc, PrimaryKey
   *  @param tCartItemTCartId Database column t_cart_item_t_cart_id DBType(INT)
   *  @param tCartItemMItemId Database column t_cart_item_m_item_id DBType(INT)
   *  @param tCartItemMSkuId Database column t_cart_item_m_sku_id DBType(INT)
   *  @param tCartItemAmount Database column t_cart_item_amount DBType(INT)
   *  @param tCartItemWeight Database column t_cart_item_weight DBType(INT)
   *  @param tCartItemPrice Database column t_cart_item_price DBType(DECIMAL)
   *  @param tCartItemTotal Database column t_cart_item_total DBType(INT)
   *  @param tCartItemSoryo Database column t_cart_item_soryo DBType(INT)
   *  @param tCartItemShohizei Database column t_cart_item_shohizei DBType(INT)
   *  @param tCartItemDiscount Database column t_cart_item_discount DBType(DECIMAL)
   *  @param tCartItemMMakertimesaleId Database column t_cart_item_m_makertimesale_id DBType(INT)
   *  @param tCartItemMMallsaleId Database column t_cart_item_m_mallsale_id DBType(INT)
   *  @param tCartItemDiscountType Database column t_cart_item_discount_type DBType(TINYINT UNSIGNED), Default(0)
   *  @param tCartItemTSalesActivityId Database column t_cart_item_t_sales_activity_id DBType(INT), Default(0)
   *  @param tCartItemTSalesActivityItemDiscountFlag Database column t_cart_item_t_sales_activity_item_discount_flag DBType(TINYINT), Default(0)
   *  @param tCartItemTSalesActivityItemDiscountval Database column t_cart_item_t_sales_activity_item_discountval DBType(DECIMAL)
   *  @param tCartOwner Database column t_cart_owner DBType(VARCHAR), Length(50,true)
   *  @param tCartRdatetime Database column t_cart_rdatetime DBType(DATETIME)
   *  @param tCartUdatetime Database column t_cart_udatetime DBType(DATETIME) */
  case class TCartItemRow(tCartItemId: Int, tCartItemTCartId: Int, tCartItemMItemId: Int, tCartItemMSkuId: Int, tCartItemAmount: Int, tCartItemWeight: Int, tCartItemPrice: scala.math.BigDecimal, tCartItemTotal: Int, tCartItemSoryo: Int, tCartItemShohizei: Int, tCartItemDiscount: scala.math.BigDecimal, tCartItemMMakertimesaleId: Int, tCartItemMMallsaleId: Int, tCartItemDiscountType: Byte = 0, tCartItemTSalesActivityId: Int = 0, tCartItemTSalesActivityItemDiscountFlag: Byte = 0, tCartItemTSalesActivityItemDiscountval: scala.math.BigDecimal, tCartOwner: String, tCartRdatetime: java.sql.Timestamp, tCartUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TCartItemRow objects using plain SQL queries */
  implicit def GetResultTCartItemRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[Byte], e3: GR[String], e4: GR[java.sql.Timestamp]): GR[TCartItemRow] = GR{
    prs => import prs._
    TCartItemRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[Int], <<[Int], <<[Byte], <<[Int], <<[Byte], <<[scala.math.BigDecimal], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_cart_item. Objects of this class serve as prototypes for rows in queries. */
  class TCartItem(_tableTag: Tag) extends Table[TCartItemRow](_tableTag, "t_cart_item") {
    def * = (tCartItemId, tCartItemTCartId, tCartItemMItemId, tCartItemMSkuId, tCartItemAmount, tCartItemWeight, tCartItemPrice, tCartItemTotal, tCartItemSoryo, tCartItemShohizei, tCartItemDiscount, tCartItemMMakertimesaleId, tCartItemMMallsaleId, tCartItemDiscountType, tCartItemTSalesActivityId, tCartItemTSalesActivityItemDiscountFlag, tCartItemTSalesActivityItemDiscountval, tCartOwner, tCartRdatetime, tCartUdatetime) <> (TCartItemRow.tupled, TCartItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCartItemId.?, tCartItemTCartId.?, tCartItemMItemId.?, tCartItemMSkuId.?, tCartItemAmount.?, tCartItemWeight.?, tCartItemPrice.?, tCartItemTotal.?, tCartItemSoryo.?, tCartItemShohizei.?, tCartItemDiscount.?, tCartItemMMakertimesaleId.?, tCartItemMMallsaleId.?, tCartItemDiscountType.?, tCartItemTSalesActivityId.?, tCartItemTSalesActivityItemDiscountFlag.?, tCartItemTSalesActivityItemDiscountval.?, tCartOwner.?, tCartRdatetime.?, tCartUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TCartItemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get, _18.get, _19.get, _20.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_cart_item_id DBType(INT), AutoInc, PrimaryKey */
    val tCartItemId: Column[Int] = column[Int]("t_cart_item_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_cart_item_t_cart_id DBType(INT) */
    val tCartItemTCartId: Column[Int] = column[Int]("t_cart_item_t_cart_id")
    /** Database column t_cart_item_m_item_id DBType(INT) */
    val tCartItemMItemId: Column[Int] = column[Int]("t_cart_item_m_item_id")
    /** Database column t_cart_item_m_sku_id DBType(INT) */
    val tCartItemMSkuId: Column[Int] = column[Int]("t_cart_item_m_sku_id")
    /** Database column t_cart_item_amount DBType(INT) */
    val tCartItemAmount: Column[Int] = column[Int]("t_cart_item_amount")
    /** Database column t_cart_item_weight DBType(INT) */
    val tCartItemWeight: Column[Int] = column[Int]("t_cart_item_weight")
    /** Database column t_cart_item_price DBType(DECIMAL) */
    val tCartItemPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_cart_item_price")
    /** Database column t_cart_item_total DBType(INT) */
    val tCartItemTotal: Column[Int] = column[Int]("t_cart_item_total")
    /** Database column t_cart_item_soryo DBType(INT) */
    val tCartItemSoryo: Column[Int] = column[Int]("t_cart_item_soryo")
    /** Database column t_cart_item_shohizei DBType(INT) */
    val tCartItemShohizei: Column[Int] = column[Int]("t_cart_item_shohizei")
    /** Database column t_cart_item_discount DBType(DECIMAL) */
    val tCartItemDiscount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_cart_item_discount")
    /** Database column t_cart_item_m_makertimesale_id DBType(INT) */
    val tCartItemMMakertimesaleId: Column[Int] = column[Int]("t_cart_item_m_makertimesale_id")
    /** Database column t_cart_item_m_mallsale_id DBType(INT) */
    val tCartItemMMallsaleId: Column[Int] = column[Int]("t_cart_item_m_mallsale_id")
    /** Database column t_cart_item_discount_type DBType(TINYINT UNSIGNED), Default(0) */
    val tCartItemDiscountType: Column[Byte] = column[Byte]("t_cart_item_discount_type", O.Default(0))
    /** Database column t_cart_item_t_sales_activity_id DBType(INT), Default(0) */
    val tCartItemTSalesActivityId: Column[Int] = column[Int]("t_cart_item_t_sales_activity_id", O.Default(0))
    /** Database column t_cart_item_t_sales_activity_item_discount_flag DBType(TINYINT), Default(0) */
    val tCartItemTSalesActivityItemDiscountFlag: Column[Byte] = column[Byte]("t_cart_item_t_sales_activity_item_discount_flag", O.Default(0))
    /** Database column t_cart_item_t_sales_activity_item_discountval DBType(DECIMAL) */
    val tCartItemTSalesActivityItemDiscountval: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_cart_item_t_sales_activity_item_discountval")
    /** Database column t_cart_owner DBType(VARCHAR), Length(50,true) */
    val tCartOwner: Column[String] = column[String]("t_cart_owner", O.Length(50,varying=true))
    /** Database column t_cart_rdatetime DBType(DATETIME) */
    val tCartRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_cart_rdatetime")
    /** Database column t_cart_udatetime DBType(DATETIME) */
    val tCartUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_cart_udatetime")
    
    /** Index over (tCartItemTCartId) (database name idx_t_cart_item_2) */
    val index1 = index("idx_t_cart_item_2", tCartItemTCartId)
  }
  /** Collection-like TableQuery object for table TCartItem */
  lazy val TCartItem = new TableQuery(tag => new TCartItem(tag))
  
  /** Entity class storing rows of table TCategoryCount
   *  @param tCategoryCountMCategoryId Database column t_category_count_m_category_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param count Database column count DBType(VARCHAR), Length(45,true) */
  case class TCategoryCountRow(tCategoryCountMCategoryId: Int, count: String)
  /** GetResult implicit for fetching TCategoryCountRow objects using plain SQL queries */
  implicit def GetResultTCategoryCountRow(implicit e0: GR[Int], e1: GR[String]): GR[TCategoryCountRow] = GR{
    prs => import prs._
    TCategoryCountRow.tupled((<<[Int], <<[String]))
  }
  /** Table description of table t_category_count. Objects of this class serve as prototypes for rows in queries. */
  class TCategoryCount(_tableTag: Tag) extends Table[TCategoryCountRow](_tableTag, "t_category_count") {
    def * = (tCategoryCountMCategoryId, count) <> (TCategoryCountRow.tupled, TCategoryCountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCategoryCountMCategoryId.?, count.?).shaped.<>({r=>import r._; _1.map(_=> TCategoryCountRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_category_count_m_category_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tCategoryCountMCategoryId: Column[Int] = column[Int]("t_category_count_m_category_id", O.AutoInc, O.PrimaryKey)
    /** Database column count DBType(VARCHAR), Length(45,true) */
    val count: Column[String] = column[String]("count", O.Length(45,varying=true))
  }
  /** Collection-like TableQuery object for table TCategoryCount */
  lazy val TCategoryCount = new TableQuery(tag => new TCategoryCount(tag))
  
  /** Entity class storing rows of table TConstant
   *  @param tConstantKey Database column t_constant_key DBType(VARCHAR), PrimaryKey, Length(100,true)
   *  @param tConstantValue Database column t_constant_value DBType(VARCHAR), Length(250,true)
   *  @param tConstantCaption Database column t_constant_caption DBType(TEXT), Length(65535,true) */
  case class TConstantRow(tConstantKey: String, tConstantValue: String, tConstantCaption: String)
  /** GetResult implicit for fetching TConstantRow objects using plain SQL queries */
  implicit def GetResultTConstantRow(implicit e0: GR[String]): GR[TConstantRow] = GR{
    prs => import prs._
    TConstantRow.tupled((<<[String], <<[String], <<[String]))
  }
  /** Table description of table t_constant. Objects of this class serve as prototypes for rows in queries. */
  class TConstant(_tableTag: Tag) extends Table[TConstantRow](_tableTag, "t_constant") {
    def * = (tConstantKey, tConstantValue, tConstantCaption) <> (TConstantRow.tupled, TConstantRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tConstantKey.?, tConstantValue.?, tConstantCaption.?).shaped.<>({r=>import r._; _1.map(_=> TConstantRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_constant_key DBType(VARCHAR), PrimaryKey, Length(100,true) */
    val tConstantKey: Column[String] = column[String]("t_constant_key", O.PrimaryKey, O.Length(100,varying=true))
    /** Database column t_constant_value DBType(VARCHAR), Length(250,true) */
    val tConstantValue: Column[String] = column[String]("t_constant_value", O.Length(250,varying=true))
    /** Database column t_constant_caption DBType(TEXT), Length(65535,true) */
    val tConstantCaption: Column[String] = column[String]("t_constant_caption", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table TConstant */
  lazy val TConstant = new TableQuery(tag => new TConstant(tag))
  
  /** Entity class storing rows of table TCoupon
   *  @param tCouponId Database column t_coupon_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param tCouponCon Database column t_coupon_con DBType(VARCHAR), Length(250,true)
   *  @param tCouponCondition Database column t_coupon_condition DBType(INT), Default(0)
   *  @param tCouponAmount Database column t_coupon_amount DBType(INT)
   *  @param tCouponActivityStartDate Database column t_coupon_activity_start_date DBType(DATETIME)
   *  @param tCouponActivityEndDate Database column t_coupon_activity_end_date DBType(DATETIME)
   *  @param tCouponAddDate Database column t_coupon_add_date DBType(DATETIME) */
  case class TCouponRow(tCouponId: Int, tCouponCon: String, tCouponCondition: Int = 0, tCouponAmount: Int, tCouponActivityStartDate: java.sql.Timestamp, tCouponActivityEndDate: java.sql.Timestamp, tCouponAddDate: java.sql.Timestamp)
  /** GetResult implicit for fetching TCouponRow objects using plain SQL queries */
  implicit def GetResultTCouponRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TCouponRow] = GR{
    prs => import prs._
    TCouponRow.tupled((<<[Int], <<[String], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_coupon. Objects of this class serve as prototypes for rows in queries. */
  class TCoupon(_tableTag: Tag) extends Table[TCouponRow](_tableTag, "t_coupon") {
    def * = (tCouponId, tCouponCon, tCouponCondition, tCouponAmount, tCouponActivityStartDate, tCouponActivityEndDate, tCouponAddDate) <> (TCouponRow.tupled, TCouponRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCouponId.?, tCouponCon.?, tCouponCondition.?, tCouponAmount.?, tCouponActivityStartDate.?, tCouponActivityEndDate.?, tCouponAddDate.?).shaped.<>({r=>import r._; _1.map(_=> TCouponRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_coupon_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tCouponId: Column[Int] = column[Int]("t_coupon_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_coupon_con DBType(VARCHAR), Length(250,true) */
    val tCouponCon: Column[String] = column[String]("t_coupon_con", O.Length(250,varying=true))
    /** Database column t_coupon_condition DBType(INT), Default(0) */
    val tCouponCondition: Column[Int] = column[Int]("t_coupon_condition", O.Default(0))
    /** Database column t_coupon_amount DBType(INT) */
    val tCouponAmount: Column[Int] = column[Int]("t_coupon_amount")
    /** Database column t_coupon_activity_start_date DBType(DATETIME) */
    val tCouponActivityStartDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_coupon_activity_start_date")
    /** Database column t_coupon_activity_end_date DBType(DATETIME) */
    val tCouponActivityEndDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_coupon_activity_end_date")
    /** Database column t_coupon_add_date DBType(DATETIME) */
    val tCouponAddDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_coupon_add_date")
  }
  /** Collection-like TableQuery object for table TCoupon */
  lazy val TCoupon = new TableQuery(tag => new TCoupon(tag))
  
  /** Entity class storing rows of table TCrawlerLog
   *  @param tCrawlerLogId Database column t_crawler_log_id DBType(INT), AutoInc, PrimaryKey
   *  @param tCrawlerLogDate Database column t_crawler_log_date DBType(DATE)
   *  @param tCrawlerLogHour Database column t_crawler_log_hour DBType(INT)
   *  @param tCrawlerLogSuccess Database column t_crawler_log_success DBType(INT)
   *  @param tCrawlerLogFailed Database column t_crawler_log_failed DBType(INT) */
  case class TCrawlerLogRow(tCrawlerLogId: Int, tCrawlerLogDate: java.sql.Date, tCrawlerLogHour: Int, tCrawlerLogSuccess: Int, tCrawlerLogFailed: Int)
  /** GetResult implicit for fetching TCrawlerLogRow objects using plain SQL queries */
  implicit def GetResultTCrawlerLogRow(implicit e0: GR[Int], e1: GR[java.sql.Date]): GR[TCrawlerLogRow] = GR{
    prs => import prs._
    TCrawlerLogRow.tupled((<<[Int], <<[java.sql.Date], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table t_crawler_log. Objects of this class serve as prototypes for rows in queries. */
  class TCrawlerLog(_tableTag: Tag) extends Table[TCrawlerLogRow](_tableTag, "t_crawler_log") {
    def * = (tCrawlerLogId, tCrawlerLogDate, tCrawlerLogHour, tCrawlerLogSuccess, tCrawlerLogFailed) <> (TCrawlerLogRow.tupled, TCrawlerLogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCrawlerLogId.?, tCrawlerLogDate.?, tCrawlerLogHour.?, tCrawlerLogSuccess.?, tCrawlerLogFailed.?).shaped.<>({r=>import r._; _1.map(_=> TCrawlerLogRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_crawler_log_id DBType(INT), AutoInc, PrimaryKey */
    val tCrawlerLogId: Column[Int] = column[Int]("t_crawler_log_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_crawler_log_date DBType(DATE) */
    val tCrawlerLogDate: Column[java.sql.Date] = column[java.sql.Date]("t_crawler_log_date")
    /** Database column t_crawler_log_hour DBType(INT) */
    val tCrawlerLogHour: Column[Int] = column[Int]("t_crawler_log_hour")
    /** Database column t_crawler_log_success DBType(INT) */
    val tCrawlerLogSuccess: Column[Int] = column[Int]("t_crawler_log_success")
    /** Database column t_crawler_log_failed DBType(INT) */
    val tCrawlerLogFailed: Column[Int] = column[Int]("t_crawler_log_failed")
  }
  /** Collection-like TableQuery object for table TCrawlerLog */
  lazy val TCrawlerLog = new TableQuery(tag => new TCrawlerLog(tag))
  
  /** Entity class storing rows of table TCustomerBrand
   *  @param tCustomerBrandId Database column t_customer_brand_id DBType(INT), AutoInc, PrimaryKey
   *  @param tCustomerBrandMCustomerId Database column t_customer_brand_m_customer_id DBType(INT)
   *  @param tCustomerBrandMBrandId Database column t_customer_brand_m_brand_id DBType(INT)
   *  @param tCustomerBrandRdatetime Database column t_customer_brand_rdatetime DBType(DATETIME) */
  case class TCustomerBrandRow(tCustomerBrandId: Int, tCustomerBrandMCustomerId: Int, tCustomerBrandMBrandId: Int, tCustomerBrandRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TCustomerBrandRow objects using plain SQL queries */
  implicit def GetResultTCustomerBrandRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TCustomerBrandRow] = GR{
    prs => import prs._
    TCustomerBrandRow.tupled((<<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_customer_brand. Objects of this class serve as prototypes for rows in queries. */
  class TCustomerBrand(_tableTag: Tag) extends Table[TCustomerBrandRow](_tableTag, "t_customer_brand") {
    def * = (tCustomerBrandId, tCustomerBrandMCustomerId, tCustomerBrandMBrandId, tCustomerBrandRdatetime) <> (TCustomerBrandRow.tupled, TCustomerBrandRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCustomerBrandId.?, tCustomerBrandMCustomerId.?, tCustomerBrandMBrandId.?, tCustomerBrandRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TCustomerBrandRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_customer_brand_id DBType(INT), AutoInc, PrimaryKey */
    val tCustomerBrandId: Column[Int] = column[Int]("t_customer_brand_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_customer_brand_m_customer_id DBType(INT) */
    val tCustomerBrandMCustomerId: Column[Int] = column[Int]("t_customer_brand_m_customer_id")
    /** Database column t_customer_brand_m_brand_id DBType(INT) */
    val tCustomerBrandMBrandId: Column[Int] = column[Int]("t_customer_brand_m_brand_id")
    /** Database column t_customer_brand_rdatetime DBType(DATETIME) */
    val tCustomerBrandRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_customer_brand_rdatetime")
    
    /** Uniqueness Index over (tCustomerBrandMCustomerId,tCustomerBrandMBrandId) (database name t_customer_brand_m_customer_id) */
    val index1 = index("t_customer_brand_m_customer_id", (tCustomerBrandMCustomerId, tCustomerBrandMBrandId), unique=true)
  }
  /** Collection-like TableQuery object for table TCustomerBrand */
  lazy val TCustomerBrand = new TableQuery(tag => new TCustomerBrand(tag))
  
  /** Entity class storing rows of table TCustomerCheck
   *  @param tCustomerCheckId Database column t_customer_check_id DBType(INT), AutoInc, PrimaryKey
   *  @param tCustomerCheckMCustomerId Database column t_customer_check_m_customer_id DBType(INT)
   *  @param tCustomerCheckMMakerId Database column t_customer_check_m_maker_id DBType(INT)
   *  @param tCustomerCheckMItemId Database column t_customer_check_m_item_id DBType(INT)
   *  @param tCustomerCheckMSkuId Database column t_customer_check_m_sku_id DBType(INT)
   *  @param tCustomerCheckFlag Database column t_customer_check_flag DBType(INT)
   *  @param tCustomerCheckRdatetime Database column t_customer_check_rdatetime DBType(DATETIME)
   *  @param tCustomerCheckUdatetime Database column t_customer_check_udatetime DBType(DATETIME) */
  case class TCustomerCheckRow(tCustomerCheckId: Int, tCustomerCheckMCustomerId: Int, tCustomerCheckMMakerId: Int, tCustomerCheckMItemId: Int, tCustomerCheckMSkuId: Int, tCustomerCheckFlag: Int, tCustomerCheckRdatetime: java.sql.Timestamp, tCustomerCheckUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TCustomerCheckRow objects using plain SQL queries */
  implicit def GetResultTCustomerCheckRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TCustomerCheckRow] = GR{
    prs => import prs._
    TCustomerCheckRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_customer_check. Objects of this class serve as prototypes for rows in queries. */
  class TCustomerCheck(_tableTag: Tag) extends Table[TCustomerCheckRow](_tableTag, "t_customer_check") {
    def * = (tCustomerCheckId, tCustomerCheckMCustomerId, tCustomerCheckMMakerId, tCustomerCheckMItemId, tCustomerCheckMSkuId, tCustomerCheckFlag, tCustomerCheckRdatetime, tCustomerCheckUdatetime) <> (TCustomerCheckRow.tupled, TCustomerCheckRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCustomerCheckId.?, tCustomerCheckMCustomerId.?, tCustomerCheckMMakerId.?, tCustomerCheckMItemId.?, tCustomerCheckMSkuId.?, tCustomerCheckFlag.?, tCustomerCheckRdatetime.?, tCustomerCheckUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TCustomerCheckRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_customer_check_id DBType(INT), AutoInc, PrimaryKey */
    val tCustomerCheckId: Column[Int] = column[Int]("t_customer_check_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_customer_check_m_customer_id DBType(INT) */
    val tCustomerCheckMCustomerId: Column[Int] = column[Int]("t_customer_check_m_customer_id")
    /** Database column t_customer_check_m_maker_id DBType(INT) */
    val tCustomerCheckMMakerId: Column[Int] = column[Int]("t_customer_check_m_maker_id")
    /** Database column t_customer_check_m_item_id DBType(INT) */
    val tCustomerCheckMItemId: Column[Int] = column[Int]("t_customer_check_m_item_id")
    /** Database column t_customer_check_m_sku_id DBType(INT) */
    val tCustomerCheckMSkuId: Column[Int] = column[Int]("t_customer_check_m_sku_id")
    /** Database column t_customer_check_flag DBType(INT) */
    val tCustomerCheckFlag: Column[Int] = column[Int]("t_customer_check_flag")
    /** Database column t_customer_check_rdatetime DBType(DATETIME) */
    val tCustomerCheckRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_customer_check_rdatetime")
    /** Database column t_customer_check_udatetime DBType(DATETIME) */
    val tCustomerCheckUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_customer_check_udatetime")
    
    /** Index over (tCustomerCheckFlag) (database name t_customer_check_flag) */
    val index1 = index("t_customer_check_flag", tCustomerCheckFlag)
  }
  /** Collection-like TableQuery object for table TCustomerCheck */
  lazy val TCustomerCheck = new TableQuery(tag => new TCustomerCheck(tag))
  
  /** Entity class storing rows of table TCustomerCoupon
   *  @param tCustomerCouponId Database column t_customer_coupon_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param tCustomerCouponMCustomerId Database column t_customer_coupon_m_customer_id DBType(INT)
   *  @param tCustomerCouponTJuchuId Database column t_customer_coupon_t_juchu_id DBType(INT)
   *  @param tCustomerCouponTCouponId Database column t_customer_coupon_t_coupon_id DBType(INT)
   *  @param tCustomerCouponStartDate Database column t_customer_coupon_start_date DBType(DATETIME)
   *  @param tCustomerCouponEndDate Database column t_customer_coupon_end_date DBType(DATETIME)
   *  @param tCustomerCouponState Database column t_customer_coupon_state DBType(INT), Default(0)
   *  @param tCustomerCouponUsebyTJuchuId Database column t_customer_coupon_useby_t_juchu_id DBType(INT), Default(0)
   *  @param tCustomerCouponAddDate Database column t_customer_coupon_add_date DBType(DATETIME) */
  case class TCustomerCouponRow(tCustomerCouponId: Int, tCustomerCouponMCustomerId: Int, tCustomerCouponTJuchuId: Int, tCustomerCouponTCouponId: Int, tCustomerCouponStartDate: java.sql.Timestamp, tCustomerCouponEndDate: java.sql.Timestamp, tCustomerCouponState: Int = 0, tCustomerCouponUsebyTJuchuId: Int = 0, tCustomerCouponAddDate: java.sql.Timestamp)
  /** GetResult implicit for fetching TCustomerCouponRow objects using plain SQL queries */
  implicit def GetResultTCustomerCouponRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TCustomerCouponRow] = GR{
    prs => import prs._
    TCustomerCouponRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_customer_coupon. Objects of this class serve as prototypes for rows in queries. */
  class TCustomerCoupon(_tableTag: Tag) extends Table[TCustomerCouponRow](_tableTag, "t_customer_coupon") {
    def * = (tCustomerCouponId, tCustomerCouponMCustomerId, tCustomerCouponTJuchuId, tCustomerCouponTCouponId, tCustomerCouponStartDate, tCustomerCouponEndDate, tCustomerCouponState, tCustomerCouponUsebyTJuchuId, tCustomerCouponAddDate) <> (TCustomerCouponRow.tupled, TCustomerCouponRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCustomerCouponId.?, tCustomerCouponMCustomerId.?, tCustomerCouponTJuchuId.?, tCustomerCouponTCouponId.?, tCustomerCouponStartDate.?, tCustomerCouponEndDate.?, tCustomerCouponState.?, tCustomerCouponUsebyTJuchuId.?, tCustomerCouponAddDate.?).shaped.<>({r=>import r._; _1.map(_=> TCustomerCouponRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_customer_coupon_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tCustomerCouponId: Column[Int] = column[Int]("t_customer_coupon_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_customer_coupon_m_customer_id DBType(INT) */
    val tCustomerCouponMCustomerId: Column[Int] = column[Int]("t_customer_coupon_m_customer_id")
    /** Database column t_customer_coupon_t_juchu_id DBType(INT) */
    val tCustomerCouponTJuchuId: Column[Int] = column[Int]("t_customer_coupon_t_juchu_id")
    /** Database column t_customer_coupon_t_coupon_id DBType(INT) */
    val tCustomerCouponTCouponId: Column[Int] = column[Int]("t_customer_coupon_t_coupon_id")
    /** Database column t_customer_coupon_start_date DBType(DATETIME) */
    val tCustomerCouponStartDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_customer_coupon_start_date")
    /** Database column t_customer_coupon_end_date DBType(DATETIME) */
    val tCustomerCouponEndDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_customer_coupon_end_date")
    /** Database column t_customer_coupon_state DBType(INT), Default(0) */
    val tCustomerCouponState: Column[Int] = column[Int]("t_customer_coupon_state", O.Default(0))
    /** Database column t_customer_coupon_useby_t_juchu_id DBType(INT), Default(0) */
    val tCustomerCouponUsebyTJuchuId: Column[Int] = column[Int]("t_customer_coupon_useby_t_juchu_id", O.Default(0))
    /** Database column t_customer_coupon_add_date DBType(DATETIME) */
    val tCustomerCouponAddDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_customer_coupon_add_date")
  }
  /** Collection-like TableQuery object for table TCustomerCoupon */
  lazy val TCustomerCoupon = new TableQuery(tag => new TCustomerCoupon(tag))
  
  /** Entity class storing rows of table TCustomerFirstWeight
   *  @param tCustomerFirstWeightId Database column t_customer_first_weight_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param tCustomerFirstWeightMCustomerId Database column t_customer_first_weight_m_customer_id DBType(INT)
   *  @param tCustomerFirstWeightTJuchuId Database column t_customer_first_weight_t_juchu_id DBType(INT)
   *  @param tCustomerFirstWeightUseDate Database column t_customer_first_weight_use_date DBType(DATETIME) */
  case class TCustomerFirstWeightRow(tCustomerFirstWeightId: Int, tCustomerFirstWeightMCustomerId: Int, tCustomerFirstWeightTJuchuId: Int, tCustomerFirstWeightUseDate: java.sql.Timestamp)
  /** GetResult implicit for fetching TCustomerFirstWeightRow objects using plain SQL queries */
  implicit def GetResultTCustomerFirstWeightRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TCustomerFirstWeightRow] = GR{
    prs => import prs._
    TCustomerFirstWeightRow.tupled((<<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_customer_first_weight. Objects of this class serve as prototypes for rows in queries. */
  class TCustomerFirstWeight(_tableTag: Tag) extends Table[TCustomerFirstWeightRow](_tableTag, "t_customer_first_weight") {
    def * = (tCustomerFirstWeightId, tCustomerFirstWeightMCustomerId, tCustomerFirstWeightTJuchuId, tCustomerFirstWeightUseDate) <> (TCustomerFirstWeightRow.tupled, TCustomerFirstWeightRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCustomerFirstWeightId.?, tCustomerFirstWeightMCustomerId.?, tCustomerFirstWeightTJuchuId.?, tCustomerFirstWeightUseDate.?).shaped.<>({r=>import r._; _1.map(_=> TCustomerFirstWeightRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_customer_first_weight_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tCustomerFirstWeightId: Column[Int] = column[Int]("t_customer_first_weight_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_customer_first_weight_m_customer_id DBType(INT) */
    val tCustomerFirstWeightMCustomerId: Column[Int] = column[Int]("t_customer_first_weight_m_customer_id")
    /** Database column t_customer_first_weight_t_juchu_id DBType(INT) */
    val tCustomerFirstWeightTJuchuId: Column[Int] = column[Int]("t_customer_first_weight_t_juchu_id")
    /** Database column t_customer_first_weight_use_date DBType(DATETIME) */
    val tCustomerFirstWeightUseDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_customer_first_weight_use_date")
  }
  /** Collection-like TableQuery object for table TCustomerFirstWeight */
  lazy val TCustomerFirstWeight = new TableQuery(tag => new TCustomerFirstWeight(tag))
  
  /** Entity class storing rows of table TCustomersession
   *  @param tCustomersessionId Database column t_customersession_id DBType(INT), AutoInc, PrimaryKey
   *  @param tCustomersessionMCustomerId Database column t_customersession_m_customer_id DBType(INT)
   *  @param tCustomersessionCartId Database column t_customersession_cart_id DBType(INT)
   *  @param tCustomersessionCode Database column t_customersession_code DBType(VARCHAR), Length(128,true)
   *  @param tCustomersessionAddress Database column t_customersession_address DBType(VARCHAR), Length(64,true)
   *  @param tCustomersessionUseragent Database column t_customersession_useragent DBType(VARCHAR), Length(200,true)
   *  @param tCustomersessionLimitDatetime Database column t_customersession_limit_datetime DBType(DATETIME) */
  case class TCustomersessionRow(tCustomersessionId: Int, tCustomersessionMCustomerId: Int, tCustomersessionCartId: Int, tCustomersessionCode: String, tCustomersessionAddress: String, tCustomersessionUseragent: String, tCustomersessionLimitDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TCustomersessionRow objects using plain SQL queries */
  implicit def GetResultTCustomersessionRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TCustomersessionRow] = GR{
    prs => import prs._
    TCustomersessionRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_customersession. Objects of this class serve as prototypes for rows in queries. */
  class TCustomersession(_tableTag: Tag) extends Table[TCustomersessionRow](_tableTag, "t_customersession") {
    def * = (tCustomersessionId, tCustomersessionMCustomerId, tCustomersessionCartId, tCustomersessionCode, tCustomersessionAddress, tCustomersessionUseragent, tCustomersessionLimitDatetime) <> (TCustomersessionRow.tupled, TCustomersessionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCustomersessionId.?, tCustomersessionMCustomerId.?, tCustomersessionCartId.?, tCustomersessionCode.?, tCustomersessionAddress.?, tCustomersessionUseragent.?, tCustomersessionLimitDatetime.?).shaped.<>({r=>import r._; _1.map(_=> TCustomersessionRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_customersession_id DBType(INT), AutoInc, PrimaryKey */
    val tCustomersessionId: Column[Int] = column[Int]("t_customersession_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_customersession_m_customer_id DBType(INT) */
    val tCustomersessionMCustomerId: Column[Int] = column[Int]("t_customersession_m_customer_id")
    /** Database column t_customersession_cart_id DBType(INT) */
    val tCustomersessionCartId: Column[Int] = column[Int]("t_customersession_cart_id")
    /** Database column t_customersession_code DBType(VARCHAR), Length(128,true) */
    val tCustomersessionCode: Column[String] = column[String]("t_customersession_code", O.Length(128,varying=true))
    /** Database column t_customersession_address DBType(VARCHAR), Length(64,true) */
    val tCustomersessionAddress: Column[String] = column[String]("t_customersession_address", O.Length(64,varying=true))
    /** Database column t_customersession_useragent DBType(VARCHAR), Length(200,true) */
    val tCustomersessionUseragent: Column[String] = column[String]("t_customersession_useragent", O.Length(200,varying=true))
    /** Database column t_customersession_limit_datetime DBType(DATETIME) */
    val tCustomersessionLimitDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_customersession_limit_datetime")
    
    /** Uniqueness Index over (tCustomersessionMCustomerId) (database name t_customersession_m_customer_id) */
    val index1 = index("t_customersession_m_customer_id", tCustomersessionMCustomerId, unique=true)
  }
  /** Collection-like TableQuery object for table TCustomersession */
  lazy val TCustomersession = new TableQuery(tag => new TCustomersession(tag))
  
  /** Entity class storing rows of table TCustomerSuruzo
   *  @param tCustomerSuruzoId Database column t_customer_suruzo_id DBType(INT), PrimaryKey
   *  @param tCustomerSuruzoEntrypoint Database column t_customer_suruzo_entrypoint DBType(VARCHAR), Length(255,true)
   *  @param tCustomerSuruzoKey Database column t_customer_suruzo_key DBType(VARCHAR), Length(255,true)
   *  @param tCustomerSuruzoRdatetime Database column t_customer_suruzo_rdatetime DBType(DATETIME)
   *  @param tCustomerSuruzoUdatetime Database column t_customer_suruzo_udatetime DBType(DATETIME) */
  case class TCustomerSuruzoRow(tCustomerSuruzoId: Int, tCustomerSuruzoEntrypoint: String, tCustomerSuruzoKey: String, tCustomerSuruzoRdatetime: java.sql.Timestamp, tCustomerSuruzoUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TCustomerSuruzoRow objects using plain SQL queries */
  implicit def GetResultTCustomerSuruzoRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TCustomerSuruzoRow] = GR{
    prs => import prs._
    TCustomerSuruzoRow.tupled((<<[Int], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_customer_suruzo. Objects of this class serve as prototypes for rows in queries. */
  class TCustomerSuruzo(_tableTag: Tag) extends Table[TCustomerSuruzoRow](_tableTag, "t_customer_suruzo") {
    def * = (tCustomerSuruzoId, tCustomerSuruzoEntrypoint, tCustomerSuruzoKey, tCustomerSuruzoRdatetime, tCustomerSuruzoUdatetime) <> (TCustomerSuruzoRow.tupled, TCustomerSuruzoRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tCustomerSuruzoId.?, tCustomerSuruzoEntrypoint.?, tCustomerSuruzoKey.?, tCustomerSuruzoRdatetime.?, tCustomerSuruzoUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TCustomerSuruzoRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_customer_suruzo_id DBType(INT), PrimaryKey */
    val tCustomerSuruzoId: Column[Int] = column[Int]("t_customer_suruzo_id", O.PrimaryKey)
    /** Database column t_customer_suruzo_entrypoint DBType(VARCHAR), Length(255,true) */
    val tCustomerSuruzoEntrypoint: Column[String] = column[String]("t_customer_suruzo_entrypoint", O.Length(255,varying=true))
    /** Database column t_customer_suruzo_key DBType(VARCHAR), Length(255,true) */
    val tCustomerSuruzoKey: Column[String] = column[String]("t_customer_suruzo_key", O.Length(255,varying=true))
    /** Database column t_customer_suruzo_rdatetime DBType(DATETIME) */
    val tCustomerSuruzoRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_customer_suruzo_rdatetime")
    /** Database column t_customer_suruzo_udatetime DBType(DATETIME) */
    val tCustomerSuruzoUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_customer_suruzo_udatetime")
  }
  /** Collection-like TableQuery object for table TCustomerSuruzo */
  lazy val TCustomerSuruzo = new TableQuery(tag => new TCustomerSuruzo(tag))
  
  /** Entity class storing rows of table TDeliveryChargeDetail
   *  @param tDeliveryChargeDetailDate Database column t_delivery_charge_detail_date DBType(DATE), PrimaryKey
   *  @param tDeliveryChargeDetailNewCharge Database column t_delivery_charge_detail_new_charge DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tDeliveryChargeDetailPileCharge Database column t_delivery_charge_detail_pile_charge DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tDeliveryChargeDetailBargain Database column t_delivery_charge_detail_bargain DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tDeliveryChargeDetailReturn Database column t_delivery_charge_detail_return DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tDeliveryChargeDetailBalance Database column t_delivery_charge_detail_balance DBType(DECIMAL), Default(0.00) */
  case class TDeliveryChargeDetailRow(tDeliveryChargeDetailDate: java.sql.Date, tDeliveryChargeDetailNewCharge: scala.math.BigDecimal = "0.00", tDeliveryChargeDetailPileCharge: scala.math.BigDecimal = "0.00", tDeliveryChargeDetailBargain: scala.math.BigDecimal = "0.00", tDeliveryChargeDetailReturn: scala.math.BigDecimal = "0.00", tDeliveryChargeDetailBalance: scala.math.BigDecimal = "0.00")
  /** GetResult implicit for fetching TDeliveryChargeDetailRow objects using plain SQL queries */
  implicit def GetResultTDeliveryChargeDetailRow(implicit e0: GR[java.sql.Date], e1: GR[scala.math.BigDecimal]): GR[TDeliveryChargeDetailRow] = GR{
    prs => import prs._
    TDeliveryChargeDetailRow.tupled((<<[java.sql.Date], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal]))
  }
  /** Table description of table t_delivery_charge_detail. Objects of this class serve as prototypes for rows in queries. */
  class TDeliveryChargeDetail(_tableTag: Tag) extends Table[TDeliveryChargeDetailRow](_tableTag, "t_delivery_charge_detail") {
    def * = (tDeliveryChargeDetailDate, tDeliveryChargeDetailNewCharge, tDeliveryChargeDetailPileCharge, tDeliveryChargeDetailBargain, tDeliveryChargeDetailReturn, tDeliveryChargeDetailBalance) <> (TDeliveryChargeDetailRow.tupled, TDeliveryChargeDetailRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tDeliveryChargeDetailDate.?, tDeliveryChargeDetailNewCharge.?, tDeliveryChargeDetailPileCharge.?, tDeliveryChargeDetailBargain.?, tDeliveryChargeDetailReturn.?, tDeliveryChargeDetailBalance.?).shaped.<>({r=>import r._; _1.map(_=> TDeliveryChargeDetailRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_delivery_charge_detail_date DBType(DATE), PrimaryKey */
    val tDeliveryChargeDetailDate: Column[java.sql.Date] = column[java.sql.Date]("t_delivery_charge_detail_date", O.PrimaryKey)
    /** Database column t_delivery_charge_detail_new_charge DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tDeliveryChargeDetailNewCharge: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_delivery_charge_detail_new_charge", O.Default("0.00"))
    /** Database column t_delivery_charge_detail_pile_charge DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tDeliveryChargeDetailPileCharge: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_delivery_charge_detail_pile_charge", O.Default("0.00"))
    /** Database column t_delivery_charge_detail_bargain DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tDeliveryChargeDetailBargain: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_delivery_charge_detail_bargain", O.Default("0.00"))
    /** Database column t_delivery_charge_detail_return DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tDeliveryChargeDetailReturn: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_delivery_charge_detail_return", O.Default("0.00"))
    /** Database column t_delivery_charge_detail_balance DBType(DECIMAL), Default(0.00) */
    val tDeliveryChargeDetailBalance: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_delivery_charge_detail_balance", O.Default("0.00"))
  }
  /** Collection-like TableQuery object for table TDeliveryChargeDetail */
  lazy val TDeliveryChargeDetail = new TableQuery(tag => new TDeliveryChargeDetail(tag))
  
  /** Entity class storing rows of table TDeliveryCompany
   *  @param tDeliveryCompanyId Database column t_delivery_company_id DBType(INT), AutoInc, PrimaryKey
   *  @param tDeliveryCompanyName Database column t_delivery_company_name DBType(VARCHAR), Length(150,true)
   *  @param tDeliveryCompanyUrl Database column t_delivery_company_url DBType(VARCHAR), Length(100,true)
   *  @param tDeliveryCompanyMMakerId Database column t_delivery_company_m_maker_id DBType(INT), Default(0)
   *  @param tDeliveryCompanyAdddate Database column t_delivery_company_adddate DBType(DATETIME)
   *  @param tDeliveryCompanyOrder Database column t_delivery_company_order DBType(INT), Default(0) */
  case class TDeliveryCompanyRow(tDeliveryCompanyId: Int, tDeliveryCompanyName: String, tDeliveryCompanyUrl: String, tDeliveryCompanyMMakerId: Int = 0, tDeliveryCompanyAdddate: java.sql.Timestamp, tDeliveryCompanyOrder: Int = 0)
  /** GetResult implicit for fetching TDeliveryCompanyRow objects using plain SQL queries */
  implicit def GetResultTDeliveryCompanyRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TDeliveryCompanyRow] = GR{
    prs => import prs._
    TDeliveryCompanyRow.tupled((<<[Int], <<[String], <<[String], <<[Int], <<[java.sql.Timestamp], <<[Int]))
  }
  /** Table description of table t_delivery_company. Objects of this class serve as prototypes for rows in queries. */
  class TDeliveryCompany(_tableTag: Tag) extends Table[TDeliveryCompanyRow](_tableTag, "t_delivery_company") {
    def * = (tDeliveryCompanyId, tDeliveryCompanyName, tDeliveryCompanyUrl, tDeliveryCompanyMMakerId, tDeliveryCompanyAdddate, tDeliveryCompanyOrder) <> (TDeliveryCompanyRow.tupled, TDeliveryCompanyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tDeliveryCompanyId.?, tDeliveryCompanyName.?, tDeliveryCompanyUrl.?, tDeliveryCompanyMMakerId.?, tDeliveryCompanyAdddate.?, tDeliveryCompanyOrder.?).shaped.<>({r=>import r._; _1.map(_=> TDeliveryCompanyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_delivery_company_id DBType(INT), AutoInc, PrimaryKey */
    val tDeliveryCompanyId: Column[Int] = column[Int]("t_delivery_company_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_delivery_company_name DBType(VARCHAR), Length(150,true) */
    val tDeliveryCompanyName: Column[String] = column[String]("t_delivery_company_name", O.Length(150,varying=true))
    /** Database column t_delivery_company_url DBType(VARCHAR), Length(100,true) */
    val tDeliveryCompanyUrl: Column[String] = column[String]("t_delivery_company_url", O.Length(100,varying=true))
    /** Database column t_delivery_company_m_maker_id DBType(INT), Default(0) */
    val tDeliveryCompanyMMakerId: Column[Int] = column[Int]("t_delivery_company_m_maker_id", O.Default(0))
    /** Database column t_delivery_company_adddate DBType(DATETIME) */
    val tDeliveryCompanyAdddate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_delivery_company_adddate")
    /** Database column t_delivery_company_order DBType(INT), Default(0) */
    val tDeliveryCompanyOrder: Column[Int] = column[Int]("t_delivery_company_order", O.Default(0))
  }
  /** Collection-like TableQuery object for table TDeliveryCompany */
  lazy val TDeliveryCompany = new TableQuery(tag => new TDeliveryCompany(tag))
  
  /** Entity class storing rows of table TDhlXml
   *  @param tDhlXmlId Database column t_dhl_xml_id DBType(INT)
   *  @param tDhlXmlRequest Database column t_dhl_xml_request DBType(TEXT), Length(65535,true)
   *  @param tDhlXmlRequestDatetime Database column t_dhl_xml_request_datetime DBType(DATETIME)
   *  @param tDhlXmlResponse Database column t_dhl_xml_response DBType(TEXT), Length(65535,true), Default(None)
   *  @param tDhlXmlResponseDatetime Database column t_dhl_xml_response_datetime DBType(INT), Default(None) */
  case class TDhlXmlRow(tDhlXmlId: Int, tDhlXmlRequest: String, tDhlXmlRequestDatetime: java.sql.Timestamp, tDhlXmlResponse: Option[String] = None, tDhlXmlResponseDatetime: Option[Int] = None)
  /** GetResult implicit for fetching TDhlXmlRow objects using plain SQL queries */
  implicit def GetResultTDhlXmlRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[String]], e4: GR[Option[Int]]): GR[TDhlXmlRow] = GR{
    prs => import prs._
    TDhlXmlRow.tupled((<<[Int], <<[String], <<[java.sql.Timestamp], <<?[String], <<?[Int]))
  }
  /** Table description of table t_dhl_xml. Objects of this class serve as prototypes for rows in queries. */
  class TDhlXml(_tableTag: Tag) extends Table[TDhlXmlRow](_tableTag, "t_dhl_xml") {
    def * = (tDhlXmlId, tDhlXmlRequest, tDhlXmlRequestDatetime, tDhlXmlResponse, tDhlXmlResponseDatetime) <> (TDhlXmlRow.tupled, TDhlXmlRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tDhlXmlId.?, tDhlXmlRequest.?, tDhlXmlRequestDatetime.?, tDhlXmlResponse, tDhlXmlResponseDatetime).shaped.<>({r=>import r._; _1.map(_=> TDhlXmlRow.tupled((_1.get, _2.get, _3.get, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_dhl_xml_id DBType(INT) */
    val tDhlXmlId: Column[Int] = column[Int]("t_dhl_xml_id")
    /** Database column t_dhl_xml_request DBType(TEXT), Length(65535,true) */
    val tDhlXmlRequest: Column[String] = column[String]("t_dhl_xml_request", O.Length(65535,varying=true))
    /** Database column t_dhl_xml_request_datetime DBType(DATETIME) */
    val tDhlXmlRequestDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_dhl_xml_request_datetime")
    /** Database column t_dhl_xml_response DBType(TEXT), Length(65535,true), Default(None) */
    val tDhlXmlResponse: Column[Option[String]] = column[Option[String]]("t_dhl_xml_response", O.Length(65535,varying=true), O.Default(None))
    /** Database column t_dhl_xml_response_datetime DBType(INT), Default(None) */
    val tDhlXmlResponseDatetime: Column[Option[Int]] = column[Option[Int]]("t_dhl_xml_response_datetime", O.Default(None))
  }
  /** Collection-like TableQuery object for table TDhlXml */
  lazy val TDhlXml = new TableQuery(tag => new TDhlXml(tag))
  
  /** Entity class storing rows of table TDiscount
   *  @param tDiscountId Database column t_discount_id DBType(INT), AutoInc, PrimaryKey
   *  @param tDiscountMCustomerId Database column t_discount_m_customer_id DBType(INT)
   *  @param tDiscountMMakerId Database column t_discount_m_maker_id DBType(INT)
   *  @param tDiscountTotalPurchase Database column t_discount_total_purchase DBType(DECIMAL)
   *  @param tDiscountTotalPrice Database column t_discount_total_price DBType(DECIMAL)
   *  @param tDiscountLastmonthPrice Database column t_discount_lastmonth_price DBType(DECIMAL)
   *  @param tDiscountPercent Database column t_discount_percent DBType(DECIMAL)
   *  @param tDiscountRdatetime Database column t_discount_rdatetime DBType(DATETIME) */
  case class TDiscountRow(tDiscountId: Int, tDiscountMCustomerId: Int, tDiscountMMakerId: Int, tDiscountTotalPurchase: scala.math.BigDecimal, tDiscountTotalPrice: scala.math.BigDecimal, tDiscountLastmonthPrice: scala.math.BigDecimal, tDiscountPercent: scala.math.BigDecimal, tDiscountRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TDiscountRow objects using plain SQL queries */
  implicit def GetResultTDiscountRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[java.sql.Timestamp]): GR[TDiscountRow] = GR{
    prs => import prs._
    TDiscountRow.tupled((<<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_discount. Objects of this class serve as prototypes for rows in queries. */
  class TDiscount(_tableTag: Tag) extends Table[TDiscountRow](_tableTag, "t_discount") {
    def * = (tDiscountId, tDiscountMCustomerId, tDiscountMMakerId, tDiscountTotalPurchase, tDiscountTotalPrice, tDiscountLastmonthPrice, tDiscountPercent, tDiscountRdatetime) <> (TDiscountRow.tupled, TDiscountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tDiscountId.?, tDiscountMCustomerId.?, tDiscountMMakerId.?, tDiscountTotalPurchase.?, tDiscountTotalPrice.?, tDiscountLastmonthPrice.?, tDiscountPercent.?, tDiscountRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TDiscountRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_discount_id DBType(INT), AutoInc, PrimaryKey */
    val tDiscountId: Column[Int] = column[Int]("t_discount_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_discount_m_customer_id DBType(INT) */
    val tDiscountMCustomerId: Column[Int] = column[Int]("t_discount_m_customer_id")
    /** Database column t_discount_m_maker_id DBType(INT) */
    val tDiscountMMakerId: Column[Int] = column[Int]("t_discount_m_maker_id")
    /** Database column t_discount_total_purchase DBType(DECIMAL) */
    val tDiscountTotalPurchase: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_discount_total_purchase")
    /** Database column t_discount_total_price DBType(DECIMAL) */
    val tDiscountTotalPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_discount_total_price")
    /** Database column t_discount_lastmonth_price DBType(DECIMAL) */
    val tDiscountLastmonthPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_discount_lastmonth_price")
    /** Database column t_discount_percent DBType(DECIMAL) */
    val tDiscountPercent: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_discount_percent")
    /** Database column t_discount_rdatetime DBType(DATETIME) */
    val tDiscountRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_discount_rdatetime")
    
    /** Uniqueness Index over (tDiscountMCustomerId,tDiscountMMakerId) (database name discount) */
    val index1 = index("discount", (tDiscountMCustomerId, tDiscountMMakerId), unique=true)
  }
  /** Collection-like TableQuery object for table TDiscount */
  lazy val TDiscount = new TableQuery(tag => new TDiscount(tag))
  
  /** Entity class storing rows of table TDownload
   *  @param tDownloadId Database column t_download_id DBType(INT), AutoInc, PrimaryKey
   *  @param tDownloadWhen Database column t_download_when DBType(DATETIME)
   *  @param tDownloadWho Database column t_download_who DBType(INT)
   *  @param tDownloadWhat Database column t_download_what DBType(INT)
   *  @param tDownloadFormat Database column t_download_format DBType(TINYINT)
   *  @param tDownloadFee Database column t_download_fee DBType(INT)
   *  @param tDownloadRdatetime Database column t_download_rdatetime DBType(DATETIME)
   *  @param tDownloadUdatetime Database column t_download_udatetime DBType(DATETIME)
   *  @param tDownloadRuser Database column t_download_ruser DBType(INT)
   *  @param tDownloadUuser Database column t_download_uuser DBType(INT) */
  case class TDownloadRow(tDownloadId: Int, tDownloadWhen: java.sql.Timestamp, tDownloadWho: Int, tDownloadWhat: Int, tDownloadFormat: Byte, tDownloadFee: Int, tDownloadRdatetime: java.sql.Timestamp, tDownloadUdatetime: java.sql.Timestamp, tDownloadRuser: Int, tDownloadUuser: Int)
  /** GetResult implicit for fetching TDownloadRow objects using plain SQL queries */
  implicit def GetResultTDownloadRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp], e2: GR[Byte]): GR[TDownloadRow] = GR{
    prs => import prs._
    TDownloadRow.tupled((<<[Int], <<[java.sql.Timestamp], <<[Int], <<[Int], <<[Byte], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table t_download. Objects of this class serve as prototypes for rows in queries. */
  class TDownload(_tableTag: Tag) extends Table[TDownloadRow](_tableTag, "t_download") {
    def * = (tDownloadId, tDownloadWhen, tDownloadWho, tDownloadWhat, tDownloadFormat, tDownloadFee, tDownloadRdatetime, tDownloadUdatetime, tDownloadRuser, tDownloadUuser) <> (TDownloadRow.tupled, TDownloadRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tDownloadId.?, tDownloadWhen.?, tDownloadWho.?, tDownloadWhat.?, tDownloadFormat.?, tDownloadFee.?, tDownloadRdatetime.?, tDownloadUdatetime.?, tDownloadRuser.?, tDownloadUuser.?).shaped.<>({r=>import r._; _1.map(_=> TDownloadRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_download_id DBType(INT), AutoInc, PrimaryKey */
    val tDownloadId: Column[Int] = column[Int]("t_download_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_download_when DBType(DATETIME) */
    val tDownloadWhen: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_download_when")
    /** Database column t_download_who DBType(INT) */
    val tDownloadWho: Column[Int] = column[Int]("t_download_who")
    /** Database column t_download_what DBType(INT) */
    val tDownloadWhat: Column[Int] = column[Int]("t_download_what")
    /** Database column t_download_format DBType(TINYINT) */
    val tDownloadFormat: Column[Byte] = column[Byte]("t_download_format")
    /** Database column t_download_fee DBType(INT) */
    val tDownloadFee: Column[Int] = column[Int]("t_download_fee")
    /** Database column t_download_rdatetime DBType(DATETIME) */
    val tDownloadRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_download_rdatetime")
    /** Database column t_download_udatetime DBType(DATETIME) */
    val tDownloadUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_download_udatetime")
    /** Database column t_download_ruser DBType(INT) */
    val tDownloadRuser: Column[Int] = column[Int]("t_download_ruser")
    /** Database column t_download_uuser DBType(INT) */
    val tDownloadUuser: Column[Int] = column[Int]("t_download_uuser")
  }
  /** Collection-like TableQuery object for table TDownload */
  lazy val TDownload = new TableQuery(tag => new TDownload(tag))
  
  /** Entity class storing rows of table TFavItem
   *  @param tFavItemId Database column t_fav_item_id DBType(INT), AutoInc, PrimaryKey
   *  @param tFavItemMItemId Database column t_fav_item_m_item_id DBType(INT)
   *  @param tFavItemMMakerId Database column t_fav_item_m_maker_id DBType(INT)
   *  @param tFavItemMCustomerId Database column t_fav_item_m_customer_id DBType(INT)
   *  @param tFavItemAddDate Database column t_fav_item_add_date DBType(DATETIME) */
  case class TFavItemRow(tFavItemId: Int, tFavItemMItemId: Int, tFavItemMMakerId: Int, tFavItemMCustomerId: Int, tFavItemAddDate: java.sql.Timestamp)
  /** GetResult implicit for fetching TFavItemRow objects using plain SQL queries */
  implicit def GetResultTFavItemRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TFavItemRow] = GR{
    prs => import prs._
    TFavItemRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_fav_item. Objects of this class serve as prototypes for rows in queries. */
  class TFavItem(_tableTag: Tag) extends Table[TFavItemRow](_tableTag, "t_fav_item") {
    def * = (tFavItemId, tFavItemMItemId, tFavItemMMakerId, tFavItemMCustomerId, tFavItemAddDate) <> (TFavItemRow.tupled, TFavItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tFavItemId.?, tFavItemMItemId.?, tFavItemMMakerId.?, tFavItemMCustomerId.?, tFavItemAddDate.?).shaped.<>({r=>import r._; _1.map(_=> TFavItemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_fav_item_id DBType(INT), AutoInc, PrimaryKey */
    val tFavItemId: Column[Int] = column[Int]("t_fav_item_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_fav_item_m_item_id DBType(INT) */
    val tFavItemMItemId: Column[Int] = column[Int]("t_fav_item_m_item_id")
    /** Database column t_fav_item_m_maker_id DBType(INT) */
    val tFavItemMMakerId: Column[Int] = column[Int]("t_fav_item_m_maker_id")
    /** Database column t_fav_item_m_customer_id DBType(INT) */
    val tFavItemMCustomerId: Column[Int] = column[Int]("t_fav_item_m_customer_id")
    /** Database column t_fav_item_add_date DBType(DATETIME) */
    val tFavItemAddDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_fav_item_add_date")
  }
  /** Collection-like TableQuery object for table TFavItem */
  lazy val TFavItem = new TableQuery(tag => new TFavItem(tag))
  
  /** Entity class storing rows of table TFeedbackImage
   *  @param tFeedbackImageId Database column t_feedback_image_id DBType(INT), AutoInc, PrimaryKey
   *  @param tFeedbackImageVoidFlag Database column t_feedback_image_void_flag DBType(INT)
   *  @param tFeedbackImageTMakerFeedbackId Database column t_feedback_image_t_maker_feedback_id DBType(INT)
   *  @param tFeedbackImageMime Database column t_feedback_image_mime DBType(VARCHAR), Length(50,true)
   *  @param tFeedbackImageData Database column t_feedback_image_data DBType(MEDIUMBLOB)
   *  @param tFeedbackImageKey Database column t_feedback_image_key DBType(VARCHAR), Length(20,true)
   *  @param tFeedbackImageVolume Database column t_feedback_image_volume DBType(INT)
   *  @param tFeedbackImageOrder Database column t_feedback_image_order DBType(INT)
   *  @param tFeedbackImageRuser Database column t_feedback_image_ruser DBType(INT)
   *  @param tFeedbackImageRdatetime Database column t_feedback_image_rdatetime DBType(DATETIME)
   *  @param tFeedbackImageUuser Database column t_feedback_image_uuser DBType(INT)
   *  @param tFeedbackImageUdatetime Database column t_feedback_image_udatetime DBType(DATETIME) */
  case class TFeedbackImageRow(tFeedbackImageId: Int, tFeedbackImageVoidFlag: Int, tFeedbackImageTMakerFeedbackId: Int, tFeedbackImageMime: String, tFeedbackImageData: java.sql.Blob, tFeedbackImageKey: String, tFeedbackImageVolume: Int, tFeedbackImageOrder: Int, tFeedbackImageRuser: Int, tFeedbackImageRdatetime: java.sql.Timestamp, tFeedbackImageUuser: Int, tFeedbackImageUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TFeedbackImageRow objects using plain SQL queries */
  implicit def GetResultTFeedbackImageRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Blob], e3: GR[java.sql.Timestamp]): GR[TFeedbackImageRow] = GR{
    prs => import prs._
    TFeedbackImageRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<[java.sql.Blob], <<[String], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_feedback_image. Objects of this class serve as prototypes for rows in queries. */
  class TFeedbackImage(_tableTag: Tag) extends Table[TFeedbackImageRow](_tableTag, "t_feedback_image") {
    def * = (tFeedbackImageId, tFeedbackImageVoidFlag, tFeedbackImageTMakerFeedbackId, tFeedbackImageMime, tFeedbackImageData, tFeedbackImageKey, tFeedbackImageVolume, tFeedbackImageOrder, tFeedbackImageRuser, tFeedbackImageRdatetime, tFeedbackImageUuser, tFeedbackImageUdatetime) <> (TFeedbackImageRow.tupled, TFeedbackImageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tFeedbackImageId.?, tFeedbackImageVoidFlag.?, tFeedbackImageTMakerFeedbackId.?, tFeedbackImageMime.?, tFeedbackImageData.?, tFeedbackImageKey.?, tFeedbackImageVolume.?, tFeedbackImageOrder.?, tFeedbackImageRuser.?, tFeedbackImageRdatetime.?, tFeedbackImageUuser.?, tFeedbackImageUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TFeedbackImageRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_feedback_image_id DBType(INT), AutoInc, PrimaryKey */
    val tFeedbackImageId: Column[Int] = column[Int]("t_feedback_image_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_feedback_image_void_flag DBType(INT) */
    val tFeedbackImageVoidFlag: Column[Int] = column[Int]("t_feedback_image_void_flag")
    /** Database column t_feedback_image_t_maker_feedback_id DBType(INT) */
    val tFeedbackImageTMakerFeedbackId: Column[Int] = column[Int]("t_feedback_image_t_maker_feedback_id")
    /** Database column t_feedback_image_mime DBType(VARCHAR), Length(50,true) */
    val tFeedbackImageMime: Column[String] = column[String]("t_feedback_image_mime", O.Length(50,varying=true))
    /** Database column t_feedback_image_data DBType(MEDIUMBLOB) */
    val tFeedbackImageData: Column[java.sql.Blob] = column[java.sql.Blob]("t_feedback_image_data")
    /** Database column t_feedback_image_key DBType(VARCHAR), Length(20,true) */
    val tFeedbackImageKey: Column[String] = column[String]("t_feedback_image_key", O.Length(20,varying=true))
    /** Database column t_feedback_image_volume DBType(INT) */
    val tFeedbackImageVolume: Column[Int] = column[Int]("t_feedback_image_volume")
    /** Database column t_feedback_image_order DBType(INT) */
    val tFeedbackImageOrder: Column[Int] = column[Int]("t_feedback_image_order")
    /** Database column t_feedback_image_ruser DBType(INT) */
    val tFeedbackImageRuser: Column[Int] = column[Int]("t_feedback_image_ruser")
    /** Database column t_feedback_image_rdatetime DBType(DATETIME) */
    val tFeedbackImageRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_feedback_image_rdatetime")
    /** Database column t_feedback_image_uuser DBType(INT) */
    val tFeedbackImageUuser: Column[Int] = column[Int]("t_feedback_image_uuser")
    /** Database column t_feedback_image_udatetime DBType(DATETIME) */
    val tFeedbackImageUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_feedback_image_udatetime")
    
    /** Index over (tFeedbackImageTMakerFeedbackId) (database name t_feedfack_image_m_item_id) */
    val index1 = index("t_feedfack_image_m_item_id", tFeedbackImageTMakerFeedbackId)
  }
  /** Collection-like TableQuery object for table TFeedbackImage */
  lazy val TFeedbackImage = new TableQuery(tag => new TFeedbackImage(tag))
  
  /** Entity class storing rows of table THolidays
   *  @param tHolidaysId Database column t_holidays_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param tHolidaysContry Database column t_holidays_contry DBType(VARCHAR), Length(10,true)
   *  @param tHolidaysYears Database column t_holidays_years DBType(INT)
   *  @param tHolidaysDate Database column t_holidays_date DBType(DATE)
   *  @param tHolidaysIsUpdate Database column t_holidays_is_update DBType(BIT), Default(false) */
  case class THolidaysRow(tHolidaysId: Int, tHolidaysContry: String, tHolidaysYears: Int, tHolidaysDate: java.sql.Date, tHolidaysIsUpdate: Boolean = false)
  /** GetResult implicit for fetching THolidaysRow objects using plain SQL queries */
  implicit def GetResultTHolidaysRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Date], e3: GR[Boolean]): GR[THolidaysRow] = GR{
    prs => import prs._
    THolidaysRow.tupled((<<[Int], <<[String], <<[Int], <<[java.sql.Date], <<[Boolean]))
  }
  /** Table description of table t_holidays. Objects of this class serve as prototypes for rows in queries. */
  class THolidays(_tableTag: Tag) extends Table[THolidaysRow](_tableTag, "t_holidays") {
    def * = (tHolidaysId, tHolidaysContry, tHolidaysYears, tHolidaysDate, tHolidaysIsUpdate) <> (THolidaysRow.tupled, THolidaysRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tHolidaysId.?, tHolidaysContry.?, tHolidaysYears.?, tHolidaysDate.?, tHolidaysIsUpdate.?).shaped.<>({r=>import r._; _1.map(_=> THolidaysRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_holidays_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tHolidaysId: Column[Int] = column[Int]("t_holidays_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_holidays_contry DBType(VARCHAR), Length(10,true) */
    val tHolidaysContry: Column[String] = column[String]("t_holidays_contry", O.Length(10,varying=true))
    /** Database column t_holidays_years DBType(INT) */
    val tHolidaysYears: Column[Int] = column[Int]("t_holidays_years")
    /** Database column t_holidays_date DBType(DATE) */
    val tHolidaysDate: Column[java.sql.Date] = column[java.sql.Date]("t_holidays_date")
    /** Database column t_holidays_is_update DBType(BIT), Default(false) */
    val tHolidaysIsUpdate: Column[Boolean] = column[Boolean]("t_holidays_is_update", O.Default(false))
    
    /** Uniqueness Index over (tHolidaysContry,tHolidaysDate) (database name t_holidays_contry) */
    val index1 = index("t_holidays_contry", (tHolidaysContry, tHolidaysDate), unique=true)
  }
  /** Collection-like TableQuery object for table THolidays */
  lazy val THolidays = new TableQuery(tag => new THolidays(tag))
  
  /** Entity class storing rows of table TImage
   *  @param tImageId Database column t_image_id DBType(INT), AutoInc, PrimaryKey
   *  @param tImageMime Database column t_image_mime DBType(VARCHAR), Length(50,true)
   *  @param tImageExt Database column t_image_ext DBType(VARCHAR), Length(50,true)
   *  @param tImageRdatetime Database column t_image_rdatetime DBType(DATETIME)
   *  @param tImageTitle Database column t_image_title DBType(VARCHAR), Length(200,true)
   *  @param tImageComment Database column t_image_comment DBType(VARCHAR), Length(200,true)
   *  @param tImageData Database column t_image_data DBType(MEDIUMBLOB) */
  case class TImageRow(tImageId: Int, tImageMime: String, tImageExt: String, tImageRdatetime: java.sql.Timestamp, tImageTitle: String, tImageComment: String, tImageData: java.sql.Blob)
  /** GetResult implicit for fetching TImageRow objects using plain SQL queries */
  implicit def GetResultTImageRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[java.sql.Blob]): GR[TImageRow] = GR{
    prs => import prs._
    TImageRow.tupled((<<[Int], <<[String], <<[String], <<[java.sql.Timestamp], <<[String], <<[String], <<[java.sql.Blob]))
  }
  /** Table description of table t_image. Objects of this class serve as prototypes for rows in queries. */
  class TImage(_tableTag: Tag) extends Table[TImageRow](_tableTag, "t_image") {
    def * = (tImageId, tImageMime, tImageExt, tImageRdatetime, tImageTitle, tImageComment, tImageData) <> (TImageRow.tupled, TImageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tImageId.?, tImageMime.?, tImageExt.?, tImageRdatetime.?, tImageTitle.?, tImageComment.?, tImageData.?).shaped.<>({r=>import r._; _1.map(_=> TImageRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_image_id DBType(INT), AutoInc, PrimaryKey */
    val tImageId: Column[Int] = column[Int]("t_image_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_image_mime DBType(VARCHAR), Length(50,true) */
    val tImageMime: Column[String] = column[String]("t_image_mime", O.Length(50,varying=true))
    /** Database column t_image_ext DBType(VARCHAR), Length(50,true) */
    val tImageExt: Column[String] = column[String]("t_image_ext", O.Length(50,varying=true))
    /** Database column t_image_rdatetime DBType(DATETIME) */
    val tImageRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_image_rdatetime")
    /** Database column t_image_title DBType(VARCHAR), Length(200,true) */
    val tImageTitle: Column[String] = column[String]("t_image_title", O.Length(200,varying=true))
    /** Database column t_image_comment DBType(VARCHAR), Length(200,true) */
    val tImageComment: Column[String] = column[String]("t_image_comment", O.Length(200,varying=true))
    /** Database column t_image_data DBType(MEDIUMBLOB) */
    val tImageData: Column[java.sql.Blob] = column[java.sql.Blob]("t_image_data")
  }
  /** Collection-like TableQuery object for table TImage */
  lazy val TImage = new TableQuery(tag => new TImage(tag))
  
  /** Entity class storing rows of table TInformation
   *  @param tInformationId Database column t_information_id DBType(INT), AutoInc, PrimaryKey
   *  @param tInformationVoidFlag Database column t_information_void_flag DBType(TINYINT)
   *  @param tInformationType Database column t_information_type DBType(TINYINT)
   *  @param tInformationOrder Database column t_information_order DBType(INT)
   *  @param tInformationDateStart Database column t_information_date_start DBType(DATE)
   *  @param tInformationDateEnd Database column t_information_date_end DBType(DATE)
   *  @param tInformationTitle Database column t_information_title DBType(VARCHAR), Length(255,true)
   *  @param tInformationUrl Database column t_information_url DBType(TEXT), Length(65535,true)
   *  @param tInformationContents Database column t_information_contents DBType(TEXT), Length(65535,true)
   *  @param tInformationRdatetime Database column t_information_rdatetime DBType(DATETIME)
   *  @param tInformationUdatetime Database column t_information_udatetime DBType(DATETIME)
   *  @param tInformationRuser Database column t_information_ruser DBType(INT)
   *  @param tInformationUuser Database column t_information_uuser DBType(INT) */
  case class TInformationRow(tInformationId: Int, tInformationVoidFlag: Byte, tInformationType: Byte, tInformationOrder: Int, tInformationDateStart: java.sql.Date, tInformationDateEnd: java.sql.Date, tInformationTitle: String, tInformationUrl: String, tInformationContents: String, tInformationRdatetime: java.sql.Timestamp, tInformationUdatetime: java.sql.Timestamp, tInformationRuser: Int, tInformationUuser: Int)
  /** GetResult implicit for fetching TInformationRow objects using plain SQL queries */
  implicit def GetResultTInformationRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[java.sql.Date], e3: GR[String], e4: GR[java.sql.Timestamp]): GR[TInformationRow] = GR{
    prs => import prs._
    TInformationRow.tupled((<<[Int], <<[Byte], <<[Byte], <<[Int], <<[java.sql.Date], <<[java.sql.Date], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table t_information. Objects of this class serve as prototypes for rows in queries. */
  class TInformation(_tableTag: Tag) extends Table[TInformationRow](_tableTag, "t_information") {
    def * = (tInformationId, tInformationVoidFlag, tInformationType, tInformationOrder, tInformationDateStart, tInformationDateEnd, tInformationTitle, tInformationUrl, tInformationContents, tInformationRdatetime, tInformationUdatetime, tInformationRuser, tInformationUuser) <> (TInformationRow.tupled, TInformationRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tInformationId.?, tInformationVoidFlag.?, tInformationType.?, tInformationOrder.?, tInformationDateStart.?, tInformationDateEnd.?, tInformationTitle.?, tInformationUrl.?, tInformationContents.?, tInformationRdatetime.?, tInformationUdatetime.?, tInformationRuser.?, tInformationUuser.?).shaped.<>({r=>import r._; _1.map(_=> TInformationRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_information_id DBType(INT), AutoInc, PrimaryKey */
    val tInformationId: Column[Int] = column[Int]("t_information_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_information_void_flag DBType(TINYINT) */
    val tInformationVoidFlag: Column[Byte] = column[Byte]("t_information_void_flag")
    /** Database column t_information_type DBType(TINYINT) */
    val tInformationType: Column[Byte] = column[Byte]("t_information_type")
    /** Database column t_information_order DBType(INT) */
    val tInformationOrder: Column[Int] = column[Int]("t_information_order")
    /** Database column t_information_date_start DBType(DATE) */
    val tInformationDateStart: Column[java.sql.Date] = column[java.sql.Date]("t_information_date_start")
    /** Database column t_information_date_end DBType(DATE) */
    val tInformationDateEnd: Column[java.sql.Date] = column[java.sql.Date]("t_information_date_end")
    /** Database column t_information_title DBType(VARCHAR), Length(255,true) */
    val tInformationTitle: Column[String] = column[String]("t_information_title", O.Length(255,varying=true))
    /** Database column t_information_url DBType(TEXT), Length(65535,true) */
    val tInformationUrl: Column[String] = column[String]("t_information_url", O.Length(65535,varying=true))
    /** Database column t_information_contents DBType(TEXT), Length(65535,true) */
    val tInformationContents: Column[String] = column[String]("t_information_contents", O.Length(65535,varying=true))
    /** Database column t_information_rdatetime DBType(DATETIME) */
    val tInformationRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_information_rdatetime")
    /** Database column t_information_udatetime DBType(DATETIME) */
    val tInformationUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_information_udatetime")
    /** Database column t_information_ruser DBType(INT) */
    val tInformationRuser: Column[Int] = column[Int]("t_information_ruser")
    /** Database column t_information_uuser DBType(INT) */
    val tInformationUuser: Column[Int] = column[Int]("t_information_uuser")
  }
  /** Collection-like TableQuery object for table TInformation */
  lazy val TInformation = new TableQuery(tag => new TInformation(tag))
  
  /** Entity class storing rows of table TInquiry
   *  @param tInquiryId Database column t_inquiry_id DBType(INT), AutoInc, PrimaryKey
   *  @param tInquiryVoidFlag Database column t_inquiry_void_flag DBType(TINYINT)
   *  @param tInquiryStatus Database column t_inquiry_status DBType(TINYINT)
   *  @param tInquiryName Database column t_inquiry_name DBType(VARCHAR), Length(200,true)
   *  @param tInquiryMessage Database column t_inquiry_message DBType(MEDIUMTEXT), Length(16777215,true)
   *  @param tInquiryCompany Database column t_inquiry_company DBType(VARCHAR), Length(200,true)
   *  @param tInquiryTantosha Database column t_inquiry_tantosha DBType(VARCHAR), Length(200,true)
   *  @param tInquiryEmail Database column t_inquiry_email DBType(VARCHAR), Length(200,true)
   *  @param tInquiryTel Database column t_inquiry_tel DBType(VARCHAR), Length(200,true)
   *  @param tInquiryIp Database column t_inquiry_ip DBType(VARCHAR), Length(200,true)
   *  @param tInquiryUseragent Database column t_inquiry_useragent DBType(VARCHAR), Length(200,true)
   *  @param tInquiryDatetime Database column t_inquiry_datetime DBType(DATETIME)
   *  @param tInquiryRdatetime Database column t_inquiry_rdatetime DBType(DATETIME)
   *  @param tInquiryUdatetime Database column t_inquiry_udatetime DBType(DATETIME)
   *  @param tInquiryRuser Database column t_inquiry_ruser DBType(INT)
   *  @param tInquiryUuser Database column t_inquiry_uuser DBType(INT) */
  case class TInquiryRow(tInquiryId: Int, tInquiryVoidFlag: Byte, tInquiryStatus: Byte, tInquiryName: String, tInquiryMessage: String, tInquiryCompany: String, tInquiryTantosha: String, tInquiryEmail: String, tInquiryTel: String, tInquiryIp: String, tInquiryUseragent: String, tInquiryDatetime: java.sql.Timestamp, tInquiryRdatetime: java.sql.Timestamp, tInquiryUdatetime: java.sql.Timestamp, tInquiryRuser: Int, tInquiryUuser: Int)
  /** GetResult implicit for fetching TInquiryRow objects using plain SQL queries */
  implicit def GetResultTInquiryRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[java.sql.Timestamp]): GR[TInquiryRow] = GR{
    prs => import prs._
    TInquiryRow.tupled((<<[Int], <<[Byte], <<[Byte], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table t_inquiry. Objects of this class serve as prototypes for rows in queries. */
  class TInquiry(_tableTag: Tag) extends Table[TInquiryRow](_tableTag, "t_inquiry") {
    def * = (tInquiryId, tInquiryVoidFlag, tInquiryStatus, tInquiryName, tInquiryMessage, tInquiryCompany, tInquiryTantosha, tInquiryEmail, tInquiryTel, tInquiryIp, tInquiryUseragent, tInquiryDatetime, tInquiryRdatetime, tInquiryUdatetime, tInquiryRuser, tInquiryUuser) <> (TInquiryRow.tupled, TInquiryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tInquiryId.?, tInquiryVoidFlag.?, tInquiryStatus.?, tInquiryName.?, tInquiryMessage.?, tInquiryCompany.?, tInquiryTantosha.?, tInquiryEmail.?, tInquiryTel.?, tInquiryIp.?, tInquiryUseragent.?, tInquiryDatetime.?, tInquiryRdatetime.?, tInquiryUdatetime.?, tInquiryRuser.?, tInquiryUuser.?).shaped.<>({r=>import r._; _1.map(_=> TInquiryRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_inquiry_id DBType(INT), AutoInc, PrimaryKey */
    val tInquiryId: Column[Int] = column[Int]("t_inquiry_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_inquiry_void_flag DBType(TINYINT) */
    val tInquiryVoidFlag: Column[Byte] = column[Byte]("t_inquiry_void_flag")
    /** Database column t_inquiry_status DBType(TINYINT) */
    val tInquiryStatus: Column[Byte] = column[Byte]("t_inquiry_status")
    /** Database column t_inquiry_name DBType(VARCHAR), Length(200,true) */
    val tInquiryName: Column[String] = column[String]("t_inquiry_name", O.Length(200,varying=true))
    /** Database column t_inquiry_message DBType(MEDIUMTEXT), Length(16777215,true) */
    val tInquiryMessage: Column[String] = column[String]("t_inquiry_message", O.Length(16777215,varying=true))
    /** Database column t_inquiry_company DBType(VARCHAR), Length(200,true) */
    val tInquiryCompany: Column[String] = column[String]("t_inquiry_company", O.Length(200,varying=true))
    /** Database column t_inquiry_tantosha DBType(VARCHAR), Length(200,true) */
    val tInquiryTantosha: Column[String] = column[String]("t_inquiry_tantosha", O.Length(200,varying=true))
    /** Database column t_inquiry_email DBType(VARCHAR), Length(200,true) */
    val tInquiryEmail: Column[String] = column[String]("t_inquiry_email", O.Length(200,varying=true))
    /** Database column t_inquiry_tel DBType(VARCHAR), Length(200,true) */
    val tInquiryTel: Column[String] = column[String]("t_inquiry_tel", O.Length(200,varying=true))
    /** Database column t_inquiry_ip DBType(VARCHAR), Length(200,true) */
    val tInquiryIp: Column[String] = column[String]("t_inquiry_ip", O.Length(200,varying=true))
    /** Database column t_inquiry_useragent DBType(VARCHAR), Length(200,true) */
    val tInquiryUseragent: Column[String] = column[String]("t_inquiry_useragent", O.Length(200,varying=true))
    /** Database column t_inquiry_datetime DBType(DATETIME) */
    val tInquiryDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_inquiry_datetime")
    /** Database column t_inquiry_rdatetime DBType(DATETIME) */
    val tInquiryRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_inquiry_rdatetime")
    /** Database column t_inquiry_udatetime DBType(DATETIME) */
    val tInquiryUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_inquiry_udatetime")
    /** Database column t_inquiry_ruser DBType(INT) */
    val tInquiryRuser: Column[Int] = column[Int]("t_inquiry_ruser")
    /** Database column t_inquiry_uuser DBType(INT) */
    val tInquiryUuser: Column[Int] = column[Int]("t_inquiry_uuser")
  }
  /** Collection-like TableQuery object for table TInquiry */
  lazy val TInquiry = new TableQuery(tag => new TInquiry(tag))
  
  /** Entity class storing rows of table TItem
   *  @param tItemId Database column t_item_id DBType(INT), AutoInc, PrimaryKey
   *  @param tItemName Database column t_item_name DBType(VARCHAR), Length(255,true)
   *  @param tItemPcCatchcopy Database column t_item_pc_catchcopy DBType(VARCHAR), Length(255,true)
   *  @param tItemMobileCatchcopy Database column t_item_mobile_catchcopy DBType(VARCHAR), Length(255,true)
   *  @param tItemPcDescription Database column t_item_pc_description DBType(TEXT), Length(65535,true)
   *  @param tItemMobileDescription Database column t_item_mobile_description DBType(TEXT), Length(65535,true)
   *  @param tItemRdatetime Database column t_item_rdatetime DBType(DATETIME)
   *  @param tItemUdatetime Database column t_item_udatetime DBType(DATETIME)
   *  @param tItemRuser Database column t_item_ruser DBType(INT)
   *  @param tItemUuser Database column t_item_uuser DBType(INT) */
  case class TItemRow(tItemId: Int, tItemName: String, tItemPcCatchcopy: String, tItemMobileCatchcopy: String, tItemPcDescription: String, tItemMobileDescription: String, tItemRdatetime: java.sql.Timestamp, tItemUdatetime: java.sql.Timestamp, tItemRuser: Int, tItemUuser: Int)
  /** GetResult implicit for fetching TItemRow objects using plain SQL queries */
  implicit def GetResultTItemRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TItemRow] = GR{
    prs => import prs._
    TItemRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table t_item. Objects of this class serve as prototypes for rows in queries. */
  class TItem(_tableTag: Tag) extends Table[TItemRow](_tableTag, "t_item") {
    def * = (tItemId, tItemName, tItemPcCatchcopy, tItemMobileCatchcopy, tItemPcDescription, tItemMobileDescription, tItemRdatetime, tItemUdatetime, tItemRuser, tItemUuser) <> (TItemRow.tupled, TItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tItemId.?, tItemName.?, tItemPcCatchcopy.?, tItemMobileCatchcopy.?, tItemPcDescription.?, tItemMobileDescription.?, tItemRdatetime.?, tItemUdatetime.?, tItemRuser.?, tItemUuser.?).shaped.<>({r=>import r._; _1.map(_=> TItemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_item_id DBType(INT), AutoInc, PrimaryKey */
    val tItemId: Column[Int] = column[Int]("t_item_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_item_name DBType(VARCHAR), Length(255,true) */
    val tItemName: Column[String] = column[String]("t_item_name", O.Length(255,varying=true))
    /** Database column t_item_pc_catchcopy DBType(VARCHAR), Length(255,true) */
    val tItemPcCatchcopy: Column[String] = column[String]("t_item_pc_catchcopy", O.Length(255,varying=true))
    /** Database column t_item_mobile_catchcopy DBType(VARCHAR), Length(255,true) */
    val tItemMobileCatchcopy: Column[String] = column[String]("t_item_mobile_catchcopy", O.Length(255,varying=true))
    /** Database column t_item_pc_description DBType(TEXT), Length(65535,true) */
    val tItemPcDescription: Column[String] = column[String]("t_item_pc_description", O.Length(65535,varying=true))
    /** Database column t_item_mobile_description DBType(TEXT), Length(65535,true) */
    val tItemMobileDescription: Column[String] = column[String]("t_item_mobile_description", O.Length(65535,varying=true))
    /** Database column t_item_rdatetime DBType(DATETIME) */
    val tItemRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_rdatetime")
    /** Database column t_item_udatetime DBType(DATETIME) */
    val tItemUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_udatetime")
    /** Database column t_item_ruser DBType(INT) */
    val tItemRuser: Column[Int] = column[Int]("t_item_ruser")
    /** Database column t_item_uuser DBType(INT) */
    val tItemUuser: Column[Int] = column[Int]("t_item_uuser")
  }
  /** Collection-like TableQuery object for table TItem */
  lazy val TItem = new TableQuery(tag => new TItem(tag))
  
  /** Entity class storing rows of table TItemCategory
   *  @param tItemCategoryId Database column t_item_category_id DBType(INT), AutoInc, PrimaryKey
   *  @param tItemCategoryMItemId Database column t_item_category_m_item_id DBType(INT)
   *  @param tItemCategoryMCategoryId Database column t_item_category_m_category_id DBType(INT)
   *  @param tItemCategoryRuser Database column t_item_category_ruser DBType(INT)
   *  @param tItemCategoryRdatetime Database column t_item_category_rdatetime DBType(DATETIME)
   *  @param tItemCategoryUuser Database column t_item_category_uuser DBType(INT)
   *  @param tItemCategoryUdatetime Database column t_item_category_udatetime DBType(DATETIME) */
  case class TItemCategoryRow(tItemCategoryId: Int, tItemCategoryMItemId: Int, tItemCategoryMCategoryId: Int, tItemCategoryRuser: Int, tItemCategoryRdatetime: java.sql.Timestamp, tItemCategoryUuser: Int, tItemCategoryUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TItemCategoryRow objects using plain SQL queries */
  implicit def GetResultTItemCategoryRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TItemCategoryRow] = GR{
    prs => import prs._
    TItemCategoryRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_item_category. Objects of this class serve as prototypes for rows in queries. */
  class TItemCategory(_tableTag: Tag) extends Table[TItemCategoryRow](_tableTag, "t_item_category") {
    def * = (tItemCategoryId, tItemCategoryMItemId, tItemCategoryMCategoryId, tItemCategoryRuser, tItemCategoryRdatetime, tItemCategoryUuser, tItemCategoryUdatetime) <> (TItemCategoryRow.tupled, TItemCategoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tItemCategoryId.?, tItemCategoryMItemId.?, tItemCategoryMCategoryId.?, tItemCategoryRuser.?, tItemCategoryRdatetime.?, tItemCategoryUuser.?, tItemCategoryUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TItemCategoryRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_item_category_id DBType(INT), AutoInc, PrimaryKey */
    val tItemCategoryId: Column[Int] = column[Int]("t_item_category_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_item_category_m_item_id DBType(INT) */
    val tItemCategoryMItemId: Column[Int] = column[Int]("t_item_category_m_item_id")
    /** Database column t_item_category_m_category_id DBType(INT) */
    val tItemCategoryMCategoryId: Column[Int] = column[Int]("t_item_category_m_category_id")
    /** Database column t_item_category_ruser DBType(INT) */
    val tItemCategoryRuser: Column[Int] = column[Int]("t_item_category_ruser")
    /** Database column t_item_category_rdatetime DBType(DATETIME) */
    val tItemCategoryRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_category_rdatetime")
    /** Database column t_item_category_uuser DBType(INT) */
    val tItemCategoryUuser: Column[Int] = column[Int]("t_item_category_uuser")
    /** Database column t_item_category_udatetime DBType(DATETIME) */
    val tItemCategoryUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_category_udatetime")
    
    /** Index over (tItemCategoryMItemId) (database name t_item_category_m_item_id) */
    val index1 = index("t_item_category_m_item_id", tItemCategoryMItemId)
  }
  /** Collection-like TableQuery object for table TItemCategory */
  lazy val TItemCategory = new TableQuery(tag => new TItemCategory(tag))
  
  /** Entity class storing rows of table TItemColor
   *  @param tItemColorId Database column t_item_color_id DBType(INT), AutoInc, PrimaryKey
   *  @param tItemColor16code Database column t_item_color_16code DBType(VARCHAR), Length(100,true)
   *  @param tItemColorEn Database column t_item_color_en DBType(VARCHAR), Length(200,true)
   *  @param tItemColorJp Database column t_item_color_jp DBType(VARCHAR), Length(200,true)
   *  @param tItemColorZh Database column t_item_color_zh DBType(VARCHAR), Length(200,true)
   *  @param tItemColorSequence Database column t_item_color_sequence DBType(INT), Default(0)
   *  @param tItemColorVoidFlag Database column t_item_color_void_flag DBType(TINYINT), Default(0)
   *  @param tItemColorAddtime Database column t_item_color_addtime DBType(DATETIME) */
  case class TItemColorRow(tItemColorId: Int, tItemColor16code: String, tItemColorEn: String, tItemColorJp: String, tItemColorZh: String, tItemColorSequence: Int = 0, tItemColorVoidFlag: Byte = 0, tItemColorAddtime: java.sql.Timestamp)
  /** GetResult implicit for fetching TItemColorRow objects using plain SQL queries */
  implicit def GetResultTItemColorRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Byte], e3: GR[java.sql.Timestamp]): GR[TItemColorRow] = GR{
    prs => import prs._
    TItemColorRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[Byte], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_item_color. Objects of this class serve as prototypes for rows in queries. */
  class TItemColor(_tableTag: Tag) extends Table[TItemColorRow](_tableTag, "t_item_color") {
    def * = (tItemColorId, tItemColor16code, tItemColorEn, tItemColorJp, tItemColorZh, tItemColorSequence, tItemColorVoidFlag, tItemColorAddtime) <> (TItemColorRow.tupled, TItemColorRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tItemColorId.?, tItemColor16code.?, tItemColorEn.?, tItemColorJp.?, tItemColorZh.?, tItemColorSequence.?, tItemColorVoidFlag.?, tItemColorAddtime.?).shaped.<>({r=>import r._; _1.map(_=> TItemColorRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_item_color_id DBType(INT), AutoInc, PrimaryKey */
    val tItemColorId: Column[Int] = column[Int]("t_item_color_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_item_color_16code DBType(VARCHAR), Length(100,true) */
    val tItemColor16code: Column[String] = column[String]("t_item_color_16code", O.Length(100,varying=true))
    /** Database column t_item_color_en DBType(VARCHAR), Length(200,true) */
    val tItemColorEn: Column[String] = column[String]("t_item_color_en", O.Length(200,varying=true))
    /** Database column t_item_color_jp DBType(VARCHAR), Length(200,true) */
    val tItemColorJp: Column[String] = column[String]("t_item_color_jp", O.Length(200,varying=true))
    /** Database column t_item_color_zh DBType(VARCHAR), Length(200,true) */
    val tItemColorZh: Column[String] = column[String]("t_item_color_zh", O.Length(200,varying=true))
    /** Database column t_item_color_sequence DBType(INT), Default(0) */
    val tItemColorSequence: Column[Int] = column[Int]("t_item_color_sequence", O.Default(0))
    /** Database column t_item_color_void_flag DBType(TINYINT), Default(0) */
    val tItemColorVoidFlag: Column[Byte] = column[Byte]("t_item_color_void_flag", O.Default(0))
    /** Database column t_item_color_addtime DBType(DATETIME) */
    val tItemColorAddtime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_color_addtime")
  }
  /** Collection-like TableQuery object for table TItemColor */
  lazy val TItemColor = new TableQuery(tag => new TItemColor(tag))
  
  /** Entity class storing rows of table TItemGekiyasu
   *  @param tItemGekiyasuId Database column t_item_gekiyasu_id DBType(INT), AutoInc, PrimaryKey
   *  @param tItemGekiyasuVoidFlag Database column t_item_gekiyasu_void_flag DBType(TINYINT)
   *  @param tItemGekiyasuMItemId Database column t_item_gekiyasu_m_item_id DBType(INT)
   *  @param tItemGekiyasuRdatetime Database column t_item_gekiyasu_rdatetime DBType(DATETIME) */
  case class TItemGekiyasuRow(tItemGekiyasuId: Int, tItemGekiyasuVoidFlag: Byte, tItemGekiyasuMItemId: Int, tItemGekiyasuRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TItemGekiyasuRow objects using plain SQL queries */
  implicit def GetResultTItemGekiyasuRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[java.sql.Timestamp]): GR[TItemGekiyasuRow] = GR{
    prs => import prs._
    TItemGekiyasuRow.tupled((<<[Int], <<[Byte], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_item_gekiyasu. Objects of this class serve as prototypes for rows in queries. */
  class TItemGekiyasu(_tableTag: Tag) extends Table[TItemGekiyasuRow](_tableTag, "t_item_gekiyasu") {
    def * = (tItemGekiyasuId, tItemGekiyasuVoidFlag, tItemGekiyasuMItemId, tItemGekiyasuRdatetime) <> (TItemGekiyasuRow.tupled, TItemGekiyasuRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tItemGekiyasuId.?, tItemGekiyasuVoidFlag.?, tItemGekiyasuMItemId.?, tItemGekiyasuRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TItemGekiyasuRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_item_gekiyasu_id DBType(INT), AutoInc, PrimaryKey */
    val tItemGekiyasuId: Column[Int] = column[Int]("t_item_gekiyasu_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_item_gekiyasu_void_flag DBType(TINYINT) */
    val tItemGekiyasuVoidFlag: Column[Byte] = column[Byte]("t_item_gekiyasu_void_flag")
    /** Database column t_item_gekiyasu_m_item_id DBType(INT) */
    val tItemGekiyasuMItemId: Column[Int] = column[Int]("t_item_gekiyasu_m_item_id")
    /** Database column t_item_gekiyasu_rdatetime DBType(DATETIME) */
    val tItemGekiyasuRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_gekiyasu_rdatetime")
    
    /** Uniqueness Index over (tItemGekiyasuMItemId) (database name m_item_id) */
    val index1 = index("m_item_id", tItemGekiyasuMItemId, unique=true)
  }
  /** Collection-like TableQuery object for table TItemGekiyasu */
  lazy val TItemGekiyasu = new TableQuery(tag => new TItemGekiyasu(tag))
  
  /** Entity class storing rows of table TItemHolidays
   *  @param tItemHolidaysId Database column t_item_holidays_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param tItemHolidaysContry Database column t_item_holidays_contry DBType(VARCHAR), Length(20,true), Default(cn)
   *  @param tItemHolidaysYears Database column t_item_holidays_years DBType(INT)
   *  @param tItemHolidaysDate Database column t_item_holidays_date DBType(DATE) */
  case class TItemHolidaysRow(tItemHolidaysId: Int, tItemHolidaysContry: String = "cn", tItemHolidaysYears: Int, tItemHolidaysDate: java.sql.Date)
  /** GetResult implicit for fetching TItemHolidaysRow objects using plain SQL queries */
  implicit def GetResultTItemHolidaysRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Date]): GR[TItemHolidaysRow] = GR{
    prs => import prs._
    TItemHolidaysRow.tupled((<<[Int], <<[String], <<[Int], <<[java.sql.Date]))
  }
  /** Table description of table t_item_holidays. Objects of this class serve as prototypes for rows in queries. */
  class TItemHolidays(_tableTag: Tag) extends Table[TItemHolidaysRow](_tableTag, "t_item_holidays") {
    def * = (tItemHolidaysId, tItemHolidaysContry, tItemHolidaysYears, tItemHolidaysDate) <> (TItemHolidaysRow.tupled, TItemHolidaysRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tItemHolidaysId.?, tItemHolidaysContry.?, tItemHolidaysYears.?, tItemHolidaysDate.?).shaped.<>({r=>import r._; _1.map(_=> TItemHolidaysRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_item_holidays_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tItemHolidaysId: Column[Int] = column[Int]("t_item_holidays_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_item_holidays_contry DBType(VARCHAR), Length(20,true), Default(cn) */
    val tItemHolidaysContry: Column[String] = column[String]("t_item_holidays_contry", O.Length(20,varying=true), O.Default("cn"))
    /** Database column t_item_holidays_years DBType(INT) */
    val tItemHolidaysYears: Column[Int] = column[Int]("t_item_holidays_years")
    /** Database column t_item_holidays_date DBType(DATE) */
    val tItemHolidaysDate: Column[java.sql.Date] = column[java.sql.Date]("t_item_holidays_date")
    
    /** Uniqueness Index over (tItemHolidaysContry,tItemHolidaysDate) (database name t_item_holidays_contry) */
    val index1 = index("t_item_holidays_contry", (tItemHolidaysContry, tItemHolidaysDate), unique=true)
  }
  /** Collection-like TableQuery object for table TItemHolidays */
  lazy val TItemHolidays = new TableQuery(tag => new TItemHolidays(tag))
  
  /** Entity class storing rows of table TItemHscode
   *  @param tItemHscodeId Database column t_item_hscode_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param tItemHscodeTJuchuitemId Database column t_item_hscode_t_juchuitem_id DBType(INT UNSIGNED)
   *  @param tItemHscodeMItemId Database column t_item_hscode_m_item_id DBType(INT)
   *  @param tItemHscodeCode Database column t_item_hscode_code DBType(VARCHAR), Length(10,true)
   *  @param tItemHscodeCode2 Database column t_item_hscode_code2 DBType(VARCHAR), Length(2,true)
   *  @param tItemHscodeCommercialRights Database column t_item_hscode_commercial_rights DBType(BIT) */
  case class TItemHscodeRow(tItemHscodeId: Int, tItemHscodeTJuchuitemId: Int, tItemHscodeMItemId: Int, tItemHscodeCode: String, tItemHscodeCode2: String, tItemHscodeCommercialRights: Boolean)
  /** GetResult implicit for fetching TItemHscodeRow objects using plain SQL queries */
  implicit def GetResultTItemHscodeRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Boolean]): GR[TItemHscodeRow] = GR{
    prs => import prs._
    TItemHscodeRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[Boolean]))
  }
  /** Table description of table t_item_hscode. Objects of this class serve as prototypes for rows in queries. */
  class TItemHscode(_tableTag: Tag) extends Table[TItemHscodeRow](_tableTag, "t_item_hscode") {
    def * = (tItemHscodeId, tItemHscodeTJuchuitemId, tItemHscodeMItemId, tItemHscodeCode, tItemHscodeCode2, tItemHscodeCommercialRights) <> (TItemHscodeRow.tupled, TItemHscodeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tItemHscodeId.?, tItemHscodeTJuchuitemId.?, tItemHscodeMItemId.?, tItemHscodeCode.?, tItemHscodeCode2.?, tItemHscodeCommercialRights.?).shaped.<>({r=>import r._; _1.map(_=> TItemHscodeRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_item_hscode_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tItemHscodeId: Column[Int] = column[Int]("t_item_hscode_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_item_hscode_t_juchuitem_id DBType(INT UNSIGNED) */
    val tItemHscodeTJuchuitemId: Column[Int] = column[Int]("t_item_hscode_t_juchuitem_id")
    /** Database column t_item_hscode_m_item_id DBType(INT) */
    val tItemHscodeMItemId: Column[Int] = column[Int]("t_item_hscode_m_item_id")
    /** Database column t_item_hscode_code DBType(VARCHAR), Length(10,true) */
    val tItemHscodeCode: Column[String] = column[String]("t_item_hscode_code", O.Length(10,varying=true))
    /** Database column t_item_hscode_code2 DBType(VARCHAR), Length(2,true) */
    val tItemHscodeCode2: Column[String] = column[String]("t_item_hscode_code2", O.Length(2,varying=true))
    /** Database column t_item_hscode_commercial_rights DBType(BIT) */
    val tItemHscodeCommercialRights: Column[Boolean] = column[Boolean]("t_item_hscode_commercial_rights")
    
    /** Uniqueness Index over (tItemHscodeTJuchuitemId) (database name juchuitem) */
    val index1 = index("juchuitem", tItemHscodeTJuchuitemId, unique=true)
  }
  /** Collection-like TableQuery object for table TItemHscode */
  lazy val TItemHscode = new TableQuery(tag => new TItemHscode(tag))
  
  /** Entity class storing rows of table TItemMeta
   *  @param tItemMetaId Database column t_item_meta_id DBType(INT), AutoInc, PrimaryKey
   *  @param tItemMetaMItemId Database column t_item_meta_m_item_id DBType(INT)
   *  @param tItemMetaMMetaId Database column t_item_meta_m_meta_id DBType(INT)
   *  @param tItemMetaMMetaValueId Database column t_item_meta_m_meta_value_id DBType(INT) */
  case class TItemMetaRow(tItemMetaId: Int, tItemMetaMItemId: Int, tItemMetaMMetaId: Int, tItemMetaMMetaValueId: Int)
  /** GetResult implicit for fetching TItemMetaRow objects using plain SQL queries */
  implicit def GetResultTItemMetaRow(implicit e0: GR[Int]): GR[TItemMetaRow] = GR{
    prs => import prs._
    TItemMetaRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table t_item_meta. Objects of this class serve as prototypes for rows in queries. */
  class TItemMeta(_tableTag: Tag) extends Table[TItemMetaRow](_tableTag, "t_item_meta") {
    def * = (tItemMetaId, tItemMetaMItemId, tItemMetaMMetaId, tItemMetaMMetaValueId) <> (TItemMetaRow.tupled, TItemMetaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tItemMetaId.?, tItemMetaMItemId.?, tItemMetaMMetaId.?, tItemMetaMMetaValueId.?).shaped.<>({r=>import r._; _1.map(_=> TItemMetaRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_item_meta_id DBType(INT), AutoInc, PrimaryKey */
    val tItemMetaId: Column[Int] = column[Int]("t_item_meta_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_item_meta_m_item_id DBType(INT) */
    val tItemMetaMItemId: Column[Int] = column[Int]("t_item_meta_m_item_id")
    /** Database column t_item_meta_m_meta_id DBType(INT) */
    val tItemMetaMMetaId: Column[Int] = column[Int]("t_item_meta_m_meta_id")
    /** Database column t_item_meta_m_meta_value_id DBType(INT) */
    val tItemMetaMMetaValueId: Column[Int] = column[Int]("t_item_meta_m_meta_value_id")
  }
  /** Collection-like TableQuery object for table TItemMeta */
  lazy val TItemMeta = new TableQuery(tag => new TItemMeta(tag))
  
  /** Entity class storing rows of table TItemRanking
   *  @param tItemRankingId Database column t_item_ranking_id DBType(INT), AutoInc, PrimaryKey
   *  @param tItemRankingMItemId Database column t_item_ranking_m_item_id DBType(INT)
   *  @param tItemRankingCount Database column t_item_ranking_count DBType(INT)
   *  @param tItemRankingRdatetime Database column t_item_ranking_rdatetime DBType(DATETIME)
   *  @param tItemRankingUdatetime Database column t_item_ranking_udatetime DBType(DATETIME)
   *  @param tItemRankingRuser Database column t_item_ranking_ruser DBType(INT)
   *  @param tItemRankingUuser Database column t_item_ranking_uuser DBType(INT) */
  case class TItemRankingRow(tItemRankingId: Int, tItemRankingMItemId: Int, tItemRankingCount: Int, tItemRankingRdatetime: java.sql.Timestamp, tItemRankingUdatetime: java.sql.Timestamp, tItemRankingRuser: Int, tItemRankingUuser: Int)
  /** GetResult implicit for fetching TItemRankingRow objects using plain SQL queries */
  implicit def GetResultTItemRankingRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TItemRankingRow] = GR{
    prs => import prs._
    TItemRankingRow.tupled((<<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table t_item_ranking. Objects of this class serve as prototypes for rows in queries. */
  class TItemRanking(_tableTag: Tag) extends Table[TItemRankingRow](_tableTag, "t_item_ranking") {
    def * = (tItemRankingId, tItemRankingMItemId, tItemRankingCount, tItemRankingRdatetime, tItemRankingUdatetime, tItemRankingRuser, tItemRankingUuser) <> (TItemRankingRow.tupled, TItemRankingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tItemRankingId.?, tItemRankingMItemId.?, tItemRankingCount.?, tItemRankingRdatetime.?, tItemRankingUdatetime.?, tItemRankingRuser.?, tItemRankingUuser.?).shaped.<>({r=>import r._; _1.map(_=> TItemRankingRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_item_ranking_id DBType(INT), AutoInc, PrimaryKey */
    val tItemRankingId: Column[Int] = column[Int]("t_item_ranking_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_item_ranking_m_item_id DBType(INT) */
    val tItemRankingMItemId: Column[Int] = column[Int]("t_item_ranking_m_item_id")
    /** Database column t_item_ranking_count DBType(INT) */
    val tItemRankingCount: Column[Int] = column[Int]("t_item_ranking_count")
    /** Database column t_item_ranking_rdatetime DBType(DATETIME) */
    val tItemRankingRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_ranking_rdatetime")
    /** Database column t_item_ranking_udatetime DBType(DATETIME) */
    val tItemRankingUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_ranking_udatetime")
    /** Database column t_item_ranking_ruser DBType(INT) */
    val tItemRankingRuser: Column[Int] = column[Int]("t_item_ranking_ruser")
    /** Database column t_item_ranking_uuser DBType(INT) */
    val tItemRankingUuser: Column[Int] = column[Int]("t_item_ranking_uuser")
    
    /** Index over (tItemRankingMItemId) (database name t_item_ranking_m_item_id) */
    val index1 = index("t_item_ranking_m_item_id", tItemRankingMItemId)
  }
  /** Collection-like TableQuery object for table TItemRanking */
  lazy val TItemRanking = new TableQuery(tag => new TItemRanking(tag))
  
  /** Entity class storing rows of table TItemRankingMonthly
   *  @param tItemRankingMonthlyId Database column t_item_ranking_monthly_id DBType(INT), AutoInc, PrimaryKey
   *  @param tItemRankingMonthlyMItemId Database column t_item_ranking_monthly_m_item_id DBType(INT)
   *  @param tItemRankingMonthlyCount Database column t_item_ranking_monthly_count DBType(INT)
   *  @param tItemRankingMonthlyRdatetime Database column t_item_ranking_monthly_rdatetime DBType(DATETIME)
   *  @param tItemRankingMonthlyUdatetime Database column t_item_ranking_monthly_udatetime DBType(DATETIME)
   *  @param tItemRankingMonthlyRuser Database column t_item_ranking_monthly_ruser DBType(INT)
   *  @param tItemRankingMonthlyUuser Database column t_item_ranking_monthly_uuser DBType(INT) */
  case class TItemRankingMonthlyRow(tItemRankingMonthlyId: Int, tItemRankingMonthlyMItemId: Int, tItemRankingMonthlyCount: Int, tItemRankingMonthlyRdatetime: java.sql.Timestamp, tItemRankingMonthlyUdatetime: java.sql.Timestamp, tItemRankingMonthlyRuser: Int, tItemRankingMonthlyUuser: Int)
  /** GetResult implicit for fetching TItemRankingMonthlyRow objects using plain SQL queries */
  implicit def GetResultTItemRankingMonthlyRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TItemRankingMonthlyRow] = GR{
    prs => import prs._
    TItemRankingMonthlyRow.tupled((<<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table t_item_ranking_monthly. Objects of this class serve as prototypes for rows in queries. */
  class TItemRankingMonthly(_tableTag: Tag) extends Table[TItemRankingMonthlyRow](_tableTag, "t_item_ranking_monthly") {
    def * = (tItemRankingMonthlyId, tItemRankingMonthlyMItemId, tItemRankingMonthlyCount, tItemRankingMonthlyRdatetime, tItemRankingMonthlyUdatetime, tItemRankingMonthlyRuser, tItemRankingMonthlyUuser) <> (TItemRankingMonthlyRow.tupled, TItemRankingMonthlyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tItemRankingMonthlyId.?, tItemRankingMonthlyMItemId.?, tItemRankingMonthlyCount.?, tItemRankingMonthlyRdatetime.?, tItemRankingMonthlyUdatetime.?, tItemRankingMonthlyRuser.?, tItemRankingMonthlyUuser.?).shaped.<>({r=>import r._; _1.map(_=> TItemRankingMonthlyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_item_ranking_monthly_id DBType(INT), AutoInc, PrimaryKey */
    val tItemRankingMonthlyId: Column[Int] = column[Int]("t_item_ranking_monthly_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_item_ranking_monthly_m_item_id DBType(INT) */
    val tItemRankingMonthlyMItemId: Column[Int] = column[Int]("t_item_ranking_monthly_m_item_id")
    /** Database column t_item_ranking_monthly_count DBType(INT) */
    val tItemRankingMonthlyCount: Column[Int] = column[Int]("t_item_ranking_monthly_count")
    /** Database column t_item_ranking_monthly_rdatetime DBType(DATETIME) */
    val tItemRankingMonthlyRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_ranking_monthly_rdatetime")
    /** Database column t_item_ranking_monthly_udatetime DBType(DATETIME) */
    val tItemRankingMonthlyUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_ranking_monthly_udatetime")
    /** Database column t_item_ranking_monthly_ruser DBType(INT) */
    val tItemRankingMonthlyRuser: Column[Int] = column[Int]("t_item_ranking_monthly_ruser")
    /** Database column t_item_ranking_monthly_uuser DBType(INT) */
    val tItemRankingMonthlyUuser: Column[Int] = column[Int]("t_item_ranking_monthly_uuser")
    
    /** Index over (tItemRankingMonthlyMItemId) (database name t_item_ranking_m_item_id) */
    val index1 = index("t_item_ranking_m_item_id", tItemRankingMonthlyMItemId)
  }
  /** Collection-like TableQuery object for table TItemRankingMonthly */
  lazy val TItemRankingMonthly = new TableQuery(tag => new TItemRankingMonthly(tag))
  
  /** Entity class storing rows of table TItemRecomend
   *  @param tItemRecomendId Database column t_item_recomend_id DBType(INT), AutoInc, PrimaryKey
   *  @param tItemRecomendVoidFlag Database column t_item_recomend_void_flag DBType(TINYINT)
   *  @param tItemRecomendMItemId Database column t_item_recomend_m_item_id DBType(INT)
   *  @param tItemRecomendRdatetime Database column t_item_recomend_rdatetime DBType(DATETIME) */
  case class TItemRecomendRow(tItemRecomendId: Int, tItemRecomendVoidFlag: Byte, tItemRecomendMItemId: Int, tItemRecomendRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TItemRecomendRow objects using plain SQL queries */
  implicit def GetResultTItemRecomendRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[java.sql.Timestamp]): GR[TItemRecomendRow] = GR{
    prs => import prs._
    TItemRecomendRow.tupled((<<[Int], <<[Byte], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_item_recomend. Objects of this class serve as prototypes for rows in queries. */
  class TItemRecomend(_tableTag: Tag) extends Table[TItemRecomendRow](_tableTag, "t_item_recomend") {
    def * = (tItemRecomendId, tItemRecomendVoidFlag, tItemRecomendMItemId, tItemRecomendRdatetime) <> (TItemRecomendRow.tupled, TItemRecomendRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tItemRecomendId.?, tItemRecomendVoidFlag.?, tItemRecomendMItemId.?, tItemRecomendRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TItemRecomendRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_item_recomend_id DBType(INT), AutoInc, PrimaryKey */
    val tItemRecomendId: Column[Int] = column[Int]("t_item_recomend_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_item_recomend_void_flag DBType(TINYINT) */
    val tItemRecomendVoidFlag: Column[Byte] = column[Byte]("t_item_recomend_void_flag")
    /** Database column t_item_recomend_m_item_id DBType(INT) */
    val tItemRecomendMItemId: Column[Int] = column[Int]("t_item_recomend_m_item_id")
    /** Database column t_item_recomend_rdatetime DBType(DATETIME) */
    val tItemRecomendRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_recomend_rdatetime")
    
    /** Uniqueness Index over (tItemRecomendMItemId) (database name m_item_id) */
    val index1 = index("m_item_id", tItemRecomendMItemId, unique=true)
  }
  /** Collection-like TableQuery object for table TItemRecomend */
  lazy val TItemRecomend = new TableQuery(tag => new TItemRecomend(tag))
  
  /** Entity class storing rows of table TItemRelation
   *  @param tItemRelationId Database column t_item_relation_id DBType(INT), AutoInc, PrimaryKey
   *  @param tItemRelationMItemId1 Database column t_item_relation_m_item_id1 DBType(INT)
   *  @param tItemRelationMItemId2 Database column t_item_relation_m_item_id2 DBType(INT UNSIGNED)
   *  @param tItemRelationRdatetime Database column t_item_relation_rdatetime DBType(DATETIME) */
  case class TItemRelationRow(tItemRelationId: Int, tItemRelationMItemId1: Int, tItemRelationMItemId2: Int, tItemRelationRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TItemRelationRow objects using plain SQL queries */
  implicit def GetResultTItemRelationRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TItemRelationRow] = GR{
    prs => import prs._
    TItemRelationRow.tupled((<<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_item_relation. Objects of this class serve as prototypes for rows in queries. */
  class TItemRelation(_tableTag: Tag) extends Table[TItemRelationRow](_tableTag, "t_item_relation") {
    def * = (tItemRelationId, tItemRelationMItemId1, tItemRelationMItemId2, tItemRelationRdatetime) <> (TItemRelationRow.tupled, TItemRelationRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tItemRelationId.?, tItemRelationMItemId1.?, tItemRelationMItemId2.?, tItemRelationRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TItemRelationRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_item_relation_id DBType(INT), AutoInc, PrimaryKey */
    val tItemRelationId: Column[Int] = column[Int]("t_item_relation_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_item_relation_m_item_id1 DBType(INT) */
    val tItemRelationMItemId1: Column[Int] = column[Int]("t_item_relation_m_item_id1")
    /** Database column t_item_relation_m_item_id2 DBType(INT UNSIGNED) */
    val tItemRelationMItemId2: Column[Int] = column[Int]("t_item_relation_m_item_id2")
    /** Database column t_item_relation_rdatetime DBType(DATETIME) */
    val tItemRelationRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_relation_rdatetime")
  }
  /** Collection-like TableQuery object for table TItemRelation */
  lazy val TItemRelation = new TableQuery(tag => new TItemRelation(tag))
  
  /** Entity class storing rows of table TItemWadai
   *  @param tItemWadaiId Database column t_item_wadai_id DBType(INT), AutoInc, PrimaryKey
   *  @param tItemWadaiVoidFlag Database column t_item_wadai_void_flag DBType(TINYINT)
   *  @param tItemWadaiMItemId Database column t_item_wadai_m_item_id DBType(INT)
   *  @param tItemWadaiRdatetime Database column t_item_wadai_rdatetime DBType(DATETIME) */
  case class TItemWadaiRow(tItemWadaiId: Int, tItemWadaiVoidFlag: Byte, tItemWadaiMItemId: Int, tItemWadaiRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TItemWadaiRow objects using plain SQL queries */
  implicit def GetResultTItemWadaiRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[java.sql.Timestamp]): GR[TItemWadaiRow] = GR{
    prs => import prs._
    TItemWadaiRow.tupled((<<[Int], <<[Byte], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_item_wadai. Objects of this class serve as prototypes for rows in queries. */
  class TItemWadai(_tableTag: Tag) extends Table[TItemWadaiRow](_tableTag, "t_item_wadai") {
    def * = (tItemWadaiId, tItemWadaiVoidFlag, tItemWadaiMItemId, tItemWadaiRdatetime) <> (TItemWadaiRow.tupled, TItemWadaiRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tItemWadaiId.?, tItemWadaiVoidFlag.?, tItemWadaiMItemId.?, tItemWadaiRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TItemWadaiRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_item_wadai_id DBType(INT), AutoInc, PrimaryKey */
    val tItemWadaiId: Column[Int] = column[Int]("t_item_wadai_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_item_wadai_void_flag DBType(TINYINT) */
    val tItemWadaiVoidFlag: Column[Byte] = column[Byte]("t_item_wadai_void_flag")
    /** Database column t_item_wadai_m_item_id DBType(INT) */
    val tItemWadaiMItemId: Column[Int] = column[Int]("t_item_wadai_m_item_id")
    /** Database column t_item_wadai_rdatetime DBType(DATETIME) */
    val tItemWadaiRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_item_wadai_rdatetime")
    
    /** Uniqueness Index over (tItemWadaiMItemId) (database name m_item_id) */
    val index1 = index("m_item_id", tItemWadaiMItemId, unique=true)
  }
  /** Collection-like TableQuery object for table TItemWadai */
  lazy val TItemWadai = new TableQuery(tag => new TItemWadai(tag))
  
  /** Row type of table TJuchu */
  type TJuchuRow = HCons[Int,HCons[Byte,HCons[String,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[Int,HCons[Int,HCons[scala.math.BigDecimal,HCons[Int,HCons[Int,HCons[scala.math.BigDecimal,HCons[scala.math.BigDecimal,HCons[Option[Boolean],HCons[Int,HCons[Int,HCons[Int,HCons[scala.math.BigDecimal,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Option[Int],HCons[Option[String],HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[Int,HCons[Boolean,HCons[Int,HCons[String,HCons[Option[String],HCons[Int,HCons[String,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for TJuchuRow providing default values if available in the database schema. */
  def TJuchuRow(tJuchuId: Int, tJuchuVoidFlag: Byte, tJuchuNumber: String, tJuchuDatetime: java.sql.Timestamp, tJuchuAskmailDatetime: java.sql.Timestamp, tJuchuNyukinDatetime: java.sql.Timestamp, tJuchuTJuchuitemCollectionLimit: java.sql.Timestamp, tJuchuCloseDatetime: java.sql.Timestamp, tJuchuMCustomerId: Int, tJuchuMPlanId: Int, tJuchuRate: scala.math.BigDecimal, tJuchuPrice: Int, tJuchuLatestPrice: Int, tJuchuPriceDoller: scala.math.BigDecimal, tJuchuLatestPriceDoller: scala.math.BigDecimal, tJuchuSaleCurrency: Option[Boolean], tJuchuTax: Int, tJuchuNebiki: Int, tJuchuSp: Int, tJuchuSpRate: scala.math.BigDecimal, tJuchuPoint: Int, tJuchuDeliveryCharges: Int, tJuchuBasicDeliveryCharges: Int, tJuchuLastBasicDeliveryCharges: Int, tJuchuDeliveryDiscount: Int, tJuchuDeliveryExtra: Int, tJuchuDeliveryPlanId: Int, tJuchuLatestDeliveryCharges: Int, tJuchuTotal: Int, tJuchuLatestTotal: Int, tJuchuWeightTotal: Int, tJuchuLatestWeightTotal: Int, tJuchuDeliveryCompanyName: String, tJuchuDeliveryCompanyNameEn: String = "", tJuchuDeliveryReceivedName: String = "", tJuchuDeliveryReceivedNameEn: String = "", tJuchuDeliveryZip: String = "", tJuchuDeliveryAddress: String = "", tJuchuDeliveryAddressEnPref: Option[Int] = None, tJuchuDeliveryAddressEnCity: Option[String] = None, tJuchuDeliveryAddressEn: String = "", tJuchuDeliveryTel: String = "", tJuchuDeliveryFax: String = "", tJuchuMessage: String, tJuchuNote: String, tJuchuDeliveryDateCount: Int, tJuchuStatu: Boolean = false, tJuchuMOemId: Int, tJuchuAffsrc: String = "", tJuchuShippingDatePreview: Option[String] = None, tJuchuTCouponId: Int = 0, tJuchuTCouponAmount: String = "0"): TJuchuRow = {
    tJuchuId :: tJuchuVoidFlag :: tJuchuNumber :: tJuchuDatetime :: tJuchuAskmailDatetime :: tJuchuNyukinDatetime :: tJuchuTJuchuitemCollectionLimit :: tJuchuCloseDatetime :: tJuchuMCustomerId :: tJuchuMPlanId :: tJuchuRate :: tJuchuPrice :: tJuchuLatestPrice :: tJuchuPriceDoller :: tJuchuLatestPriceDoller :: tJuchuSaleCurrency :: tJuchuTax :: tJuchuNebiki :: tJuchuSp :: tJuchuSpRate :: tJuchuPoint :: tJuchuDeliveryCharges :: tJuchuBasicDeliveryCharges :: tJuchuLastBasicDeliveryCharges :: tJuchuDeliveryDiscount :: tJuchuDeliveryExtra :: tJuchuDeliveryPlanId :: tJuchuLatestDeliveryCharges :: tJuchuTotal :: tJuchuLatestTotal :: tJuchuWeightTotal :: tJuchuLatestWeightTotal :: tJuchuDeliveryCompanyName :: tJuchuDeliveryCompanyNameEn :: tJuchuDeliveryReceivedName :: tJuchuDeliveryReceivedNameEn :: tJuchuDeliveryZip :: tJuchuDeliveryAddress :: tJuchuDeliveryAddressEnPref :: tJuchuDeliveryAddressEnCity :: tJuchuDeliveryAddressEn :: tJuchuDeliveryTel :: tJuchuDeliveryFax :: tJuchuMessage :: tJuchuNote :: tJuchuDeliveryDateCount :: tJuchuStatu :: tJuchuMOemId :: tJuchuAffsrc :: tJuchuShippingDatePreview :: tJuchuTCouponId :: tJuchuTCouponAmount :: HNil
  }
  /** GetResult implicit for fetching TJuchuRow objects using plain SQL queries */
  implicit def GetResultTJuchuRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[java.sql.Timestamp], e4: GR[scala.math.BigDecimal], e5: GR[Option[Boolean]], e6: GR[Option[Int]], e7: GR[Option[String]], e8: GR[Boolean]): GR[TJuchuRow] = GR{
    prs => import prs._
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
    val tJuchuNumber: Column[String] = column[String]("t_juchu_number", O.Length(15,varying=true))
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
    val tJuchuDeliveryCompanyName: Column[String] = column[String]("t_juchu_delivery_company_name", O.Length(255,varying=true))
    /** Database column t_juchu_delivery_company_name_en DBType(VARCHAR), Length(255,true), Default() */
    val tJuchuDeliveryCompanyNameEn: Column[String] = column[String]("t_juchu_delivery_company_name_en", O.Length(255,varying=true), O.Default(""))
    /** Database column t_juchu_delivery_received_name DBType(VARCHAR), Length(255,true), Default() */
    val tJuchuDeliveryReceivedName: Column[String] = column[String]("t_juchu_delivery_received_name", O.Length(255,varying=true), O.Default(""))
    /** Database column t_juchu_delivery_received_name_en DBType(VARCHAR), Length(255,true), Default() */
    val tJuchuDeliveryReceivedNameEn: Column[String] = column[String]("t_juchu_delivery_received_name_en", O.Length(255,varying=true), O.Default(""))
    /** Database column t_juchu_delivery_zip DBType(VARCHAR), Length(20,true), Default() */
    val tJuchuDeliveryZip: Column[String] = column[String]("t_juchu_delivery_zip", O.Length(20,varying=true), O.Default(""))
    /** Database column t_juchu_delivery_address DBType(VARCHAR), Length(255,true), Default() */
    val tJuchuDeliveryAddress: Column[String] = column[String]("t_juchu_delivery_address", O.Length(255,varying=true), O.Default(""))
    /** Database column t_juchu_delivery_address_en_pref DBType(INT), Default(None) */
    val tJuchuDeliveryAddressEnPref: Column[Option[Int]] = column[Option[Int]]("t_juchu_delivery_address_en_pref", O.Default(None))
    /** Database column t_juchu_delivery_address_en_city DBType(VARCHAR), Length(200,true), Default(None) */
    val tJuchuDeliveryAddressEnCity: Column[Option[String]] = column[Option[String]]("t_juchu_delivery_address_en_city", O.Length(200,varying=true), O.Default(None))
    /** Database column t_juchu_delivery_address_en DBType(VARCHAR), Length(255,true), Default() */
    val tJuchuDeliveryAddressEn: Column[String] = column[String]("t_juchu_delivery_address_en", O.Length(255,varying=true), O.Default(""))
    /** Database column t_juchu_delivery_tel DBType(VARCHAR), Length(20,true), Default() */
    val tJuchuDeliveryTel: Column[String] = column[String]("t_juchu_delivery_tel", O.Length(20,varying=true), O.Default(""))
    /** Database column t_juchu_delivery_fax DBType(VARCHAR), Length(20,true), Default() */
    val tJuchuDeliveryFax: Column[String] = column[String]("t_juchu_delivery_fax", O.Length(20,varying=true), O.Default(""))
    /** Database column t_juchu_message DBType(TEXT), Length(65535,true) */
    val tJuchuMessage: Column[String] = column[String]("t_juchu_message", O.Length(65535,varying=true))
    /** Database column t_juchu_note DBType(TEXT), Length(65535,true) */
    val tJuchuNote: Column[String] = column[String]("t_juchu_note", O.Length(65535,varying=true))
    /** Database column t_juchu_delivery_date_count DBType(INT) */
    val tJuchuDeliveryDateCount: Column[Int] = column[Int]("t_juchu_delivery_date_count")
    /** Database column t_juchu_statu DBType(BIT), Default(false) */
    val tJuchuStatu: Column[Boolean] = column[Boolean]("t_juchu_statu", O.Default(false))
    /** Database column t_juchu_m_oem_id DBType(INT) */
    val tJuchuMOemId: Column[Int] = column[Int]("t_juchu_m_oem_id")
    /** Database column t_juchu_affsrc DBType(VARCHAR), Length(225,true), Default() */
    val tJuchuAffsrc: Column[String] = column[String]("t_juchu_affsrc", O.Length(225,varying=true), O.Default(""))
    /** Database column t_juchu_shipping_date_preview DBType(TEXT), Length(65535,true), Default(None) */
    val tJuchuShippingDatePreview: Column[Option[String]] = column[Option[String]]("t_juchu_shipping_date_preview", O.Length(65535,varying=true), O.Default(None))
    /** Database column t_juchu_t_coupon_id DBType(INT), Default(0) */
    val tJuchuTCouponId: Column[Int] = column[Int]("t_juchu_t_coupon_id", O.Default(0))
    /** Database column t_juchu_t_coupon_amount DBType(VARCHAR), Length(200,true), Default(0) */
    val tJuchuTCouponAmount: Column[String] = column[String]("t_juchu_t_coupon_amount", O.Length(200,varying=true), O.Default("0"))
    
    /** Index over (tJuchuMCustomerId) (database name t_juchu_m_customer_id) */
    val index1 = index("t_juchu_m_customer_id", tJuchuMCustomerId :: HNil)
    /** Index over (tJuchuStatu) (database name t_juchu_statu) */
    val index2 = index("t_juchu_statu", tJuchuStatu :: HNil)
  }
  /** Collection-like TableQuery object for table TJuchu */
  lazy val TJuchu = new TableQuery(tag => new TJuchu(tag))
  
  /** Row type of table TJuchuitem */
  type TJuchuitemRow = HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[String,HCons[String,HCons[String,HCons[String,HCons[String,HCons[scala.math.BigDecimal,HCons[Int,HCons[scala.math.BigDecimal,HCons[scala.math.BigDecimal,HCons[Int,HCons[scala.math.BigDecimal,HCons[Int,HCons[Int,HCons[Int,HCons[scala.math.BigDecimal,HCons[scala.math.BigDecimal,HCons[Int,HCons[Int,HCons[Int,HCons[scala.math.BigDecimal,HCons[Byte,HCons[Int,HCons[Byte,HCons[scala.math.BigDecimal,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[String,HCons[Byte,HCons[java.sql.Timestamp,HCons[Int,HCons[String,HCons[String,HCons[Byte,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for TJuchuitemRow providing default values if available in the database schema. */
  def TJuchuitemRow(tJuchuitemId: Int, tJuchuitemTJuchuId: Int, tJuchuitemMMakerId: Int, tJuchuitemMItemId: Int, tJuchuitemMSkuId: Int, tJuchuitemMSkuColor: String, tJuchuitemMSkuColorJp: String, tJuchuitemMSkuSize: String, tJuchuitemMItemCode: String, tJuchuitemName: String, tJuchuitemQuantity: scala.math.BigDecimal, tJuchuitemLatestQuantity: Int, tJuchuitemUnitPrice: scala.math.BigDecimal, tJuchuitemUnitPriceDoller: scala.math.BigDecimal, tJuchuitemPrice: Int, tJuchuitemPriceDoller: scala.math.BigDecimal, tJuchuitemTax: Int, tJuchuitemTotal: Int, tJuchuitemLatestTotal: Int, tJuchuitemTotalDoller: scala.math.BigDecimal, tJuchuitemLatestTotalDoller: scala.math.BigDecimal, tJuchuitemWeight: Int, tJuchuitemWeightTotal: Int, tJuchuitemLatestWeightTotal: Int, tJuchuitemDiscount: scala.math.BigDecimal, tJuchuitemDiscountType: Byte = 0, tJuchuitemTSalesActivityId: Int = 0, tJuchuitemTSalesActivityItemDiscountFlag: Byte = 0, tJuchuitemTSalesActivityItemDiscountval: scala.math.BigDecimal, tJuchuitemCollectionLimit: java.sql.Timestamp, tJuchuitemCloseDatetime: java.sql.Timestamp, tJuchuitemNote: String, tJuchuitemPaymentStatu: Byte, tJuchuitemMakerDeliverydate: java.sql.Timestamp, tJuchuitemTDeliveryCompanyId: Int, tJuchuitemWarehousenum: String, tJuchuitemPsmethod: String, tJuchuitemTZaikoitemVoidFlag: Byte = 0): TJuchuitemRow = {
    tJuchuitemId :: tJuchuitemTJuchuId :: tJuchuitemMMakerId :: tJuchuitemMItemId :: tJuchuitemMSkuId :: tJuchuitemMSkuColor :: tJuchuitemMSkuColorJp :: tJuchuitemMSkuSize :: tJuchuitemMItemCode :: tJuchuitemName :: tJuchuitemQuantity :: tJuchuitemLatestQuantity :: tJuchuitemUnitPrice :: tJuchuitemUnitPriceDoller :: tJuchuitemPrice :: tJuchuitemPriceDoller :: tJuchuitemTax :: tJuchuitemTotal :: tJuchuitemLatestTotal :: tJuchuitemTotalDoller :: tJuchuitemLatestTotalDoller :: tJuchuitemWeight :: tJuchuitemWeightTotal :: tJuchuitemLatestWeightTotal :: tJuchuitemDiscount :: tJuchuitemDiscountType :: tJuchuitemTSalesActivityId :: tJuchuitemTSalesActivityItemDiscountFlag :: tJuchuitemTSalesActivityItemDiscountval :: tJuchuitemCollectionLimit :: tJuchuitemCloseDatetime :: tJuchuitemNote :: tJuchuitemPaymentStatu :: tJuchuitemMakerDeliverydate :: tJuchuitemTDeliveryCompanyId :: tJuchuitemWarehousenum :: tJuchuitemPsmethod :: tJuchuitemTZaikoitemVoidFlag :: HNil
  }
  /** GetResult implicit for fetching TJuchuitemRow objects using plain SQL queries */
  implicit def GetResultTJuchuitemRow(implicit e0: GR[Int], e1: GR[String], e2: GR[scala.math.BigDecimal], e3: GR[Byte], e4: GR[java.sql.Timestamp]): GR[TJuchuitemRow] = GR{
    prs => import prs._
    <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[String] :: <<[scala.math.BigDecimal] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[scala.math.BigDecimal] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[scala.math.BigDecimal] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[Byte] :: <<[Int] :: <<[Byte] :: <<[scala.math.BigDecimal] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[String] :: <<[Byte] :: <<[java.sql.Timestamp] :: <<[Int] :: <<[String] :: <<[String] :: <<[Byte] :: HNil
  }
  /** Table description of table t_juchuitem. Objects of this class serve as prototypes for rows in queries. */
  class TJuchuitem(_tableTag: Tag) extends Table[TJuchuitemRow](_tableTag, "t_juchuitem") {
    def * = tJuchuitemId :: tJuchuitemTJuchuId :: tJuchuitemMMakerId :: tJuchuitemMItemId :: tJuchuitemMSkuId :: tJuchuitemMSkuColor :: tJuchuitemMSkuColorJp :: tJuchuitemMSkuSize :: tJuchuitemMItemCode :: tJuchuitemName :: tJuchuitemQuantity :: tJuchuitemLatestQuantity :: tJuchuitemUnitPrice :: tJuchuitemUnitPriceDoller :: tJuchuitemPrice :: tJuchuitemPriceDoller :: tJuchuitemTax :: tJuchuitemTotal :: tJuchuitemLatestTotal :: tJuchuitemTotalDoller :: tJuchuitemLatestTotalDoller :: tJuchuitemWeight :: tJuchuitemWeightTotal :: tJuchuitemLatestWeightTotal :: tJuchuitemDiscount :: tJuchuitemDiscountType :: tJuchuitemTSalesActivityId :: tJuchuitemTSalesActivityItemDiscountFlag :: tJuchuitemTSalesActivityItemDiscountval :: tJuchuitemCollectionLimit :: tJuchuitemCloseDatetime :: tJuchuitemNote :: tJuchuitemPaymentStatu :: tJuchuitemMakerDeliverydate :: tJuchuitemTDeliveryCompanyId :: tJuchuitemWarehousenum :: tJuchuitemPsmethod :: tJuchuitemTZaikoitemVoidFlag :: HNil
    
    /** Database column t_juchuitem_id DBType(INT), AutoInc, PrimaryKey */
    val tJuchuitemId: Column[Int] = column[Int]("t_juchuitem_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_juchuitem_t_juchu_id DBType(INT) */
    val tJuchuitemTJuchuId: Column[Int] = column[Int]("t_juchuitem_t_juchu_id")
    /** Database column t_juchuitem_m_maker_id DBType(INT) */
    val tJuchuitemMMakerId: Column[Int] = column[Int]("t_juchuitem_m_maker_id")
    /** Database column t_juchuitem_m_item_id DBType(INT) */
    val tJuchuitemMItemId: Column[Int] = column[Int]("t_juchuitem_m_item_id")
    /** Database column t_juchuitem_m_sku_id DBType(INT) */
    val tJuchuitemMSkuId: Column[Int] = column[Int]("t_juchuitem_m_sku_id")
    /** Database column t_juchuitem_m_sku_color DBType(VARCHAR), Length(20,true) */
    val tJuchuitemMSkuColor: Column[String] = column[String]("t_juchuitem_m_sku_color", O.Length(20,varying=true))
    /** Database column t_juchuitem_m_sku_color_jp DBType(VARCHAR), Length(100,true) */
    val tJuchuitemMSkuColorJp: Column[String] = column[String]("t_juchuitem_m_sku_color_jp", O.Length(100,varying=true))
    /** Database column t_juchuitem_m_sku_size DBType(VARCHAR), Length(20,true) */
    val tJuchuitemMSkuSize: Column[String] = column[String]("t_juchuitem_m_sku_size", O.Length(20,varying=true))
    /** Database column t_juchuitem_m_item_code DBType(VARCHAR), Length(50,true) */
    val tJuchuitemMItemCode: Column[String] = column[String]("t_juchuitem_m_item_code", O.Length(50,varying=true))
    /** Database column t_juchuitem_name DBType(VARCHAR), Length(200,true) */
    val tJuchuitemName: Column[String] = column[String]("t_juchuitem_name", O.Length(200,varying=true))
    /** Database column t_juchuitem_quantity DBType(DECIMAL) */
    val tJuchuitemQuantity: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_juchuitem_quantity")
    /** Database column t_juchuitem_latest_quantity DBType(INT) */
    val tJuchuitemLatestQuantity: Column[Int] = column[Int]("t_juchuitem_latest_quantity")
    /** Database column t_juchuitem_unit_price DBType(DECIMAL) */
    val tJuchuitemUnitPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_juchuitem_unit_price")
    /** Database column t_juchuitem_unit_price_doller DBType(DECIMAL) */
    val tJuchuitemUnitPriceDoller: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_juchuitem_unit_price_doller")
    /** Database column t_juchuitem_price DBType(INT) */
    val tJuchuitemPrice: Column[Int] = column[Int]("t_juchuitem_price")
    /** Database column t_juchuitem_price_doller DBType(DECIMAL) */
    val tJuchuitemPriceDoller: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_juchuitem_price_doller")
    /** Database column t_juchuitem_tax DBType(INT) */
    val tJuchuitemTax: Column[Int] = column[Int]("t_juchuitem_tax")
    /** Database column t_juchuitem_total DBType(INT) */
    val tJuchuitemTotal: Column[Int] = column[Int]("t_juchuitem_total")
    /** Database column t_juchuitem_latest_total DBType(INT) */
    val tJuchuitemLatestTotal: Column[Int] = column[Int]("t_juchuitem_latest_total")
    /** Database column t_juchuitem_total_doller DBType(DECIMAL) */
    val tJuchuitemTotalDoller: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_juchuitem_total_doller")
    /** Database column t_juchuitem_latest_total_doller DBType(DECIMAL) */
    val tJuchuitemLatestTotalDoller: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_juchuitem_latest_total_doller")
    /** Database column t_juchuitem_weight DBType(INT) */
    val tJuchuitemWeight: Column[Int] = column[Int]("t_juchuitem_weight")
    /** Database column t_juchuitem_weight_total DBType(INT) */
    val tJuchuitemWeightTotal: Column[Int] = column[Int]("t_juchuitem_weight_total")
    /** Database column t_juchuitem_latest_weight_total DBType(INT) */
    val tJuchuitemLatestWeightTotal: Column[Int] = column[Int]("t_juchuitem_latest_weight_total")
    /** Database column t_juchuitem_discount DBType(DECIMAL) */
    val tJuchuitemDiscount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_juchuitem_discount")
    /** Database column t_juchuitem_discount_type DBType(TINYINT UNSIGNED), Default(0) */
    val tJuchuitemDiscountType: Column[Byte] = column[Byte]("t_juchuitem_discount_type", O.Default(0))
    /** Database column t_juchuitem_t_sales_activity_id DBType(INT UNSIGNED), Default(0) */
    val tJuchuitemTSalesActivityId: Column[Int] = column[Int]("t_juchuitem_t_sales_activity_id", O.Default(0))
    /** Database column t_juchuitem_t_sales_activity_item_discount_flag DBType(TINYINT), Default(0) */
    val tJuchuitemTSalesActivityItemDiscountFlag: Column[Byte] = column[Byte]("t_juchuitem_t_sales_activity_item_discount_flag", O.Default(0))
    /** Database column t_juchuitem_t_sales_activity_item_discountval DBType(DECIMAL) */
    val tJuchuitemTSalesActivityItemDiscountval: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_juchuitem_t_sales_activity_item_discountval")
    /** Database column t_juchuitem_collection_limit DBType(DATETIME) */
    val tJuchuitemCollectionLimit: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchuitem_collection_limit")
    /** Database column t_juchuitem_close_datetime DBType(DATETIME) */
    val tJuchuitemCloseDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchuitem_close_datetime")
    /** Database column t_juchuitem_note DBType(TEXT), Length(65535,true) */
    val tJuchuitemNote: Column[String] = column[String]("t_juchuitem_note", O.Length(65535,varying=true))
    /** Database column t_juchuitem_payment_statu DBType(TINYINT) */
    val tJuchuitemPaymentStatu: Column[Byte] = column[Byte]("t_juchuitem_payment_statu")
    /** Database column t_juchuitem_maker_deliverydate DBType(DATETIME) */
    val tJuchuitemMakerDeliverydate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchuitem_maker_deliverydate")
    /** Database column t_juchuitem_t_delivery_company_id DBType(INT) */
    val tJuchuitemTDeliveryCompanyId: Column[Int] = column[Int]("t_juchuitem_t_delivery_company_id")
    /** Database column t_juchuitem_warehousenum DBType(VARCHAR), Length(150,true) */
    val tJuchuitemWarehousenum: Column[String] = column[String]("t_juchuitem_warehousenum", O.Length(150,varying=true))
    /** Database column t_juchuitem_psmethod DBType(VARCHAR), Length(150,true) */
    val tJuchuitemPsmethod: Column[String] = column[String]("t_juchuitem_psmethod", O.Length(150,varying=true))
    /** Database column t_juchuitem_t_zaikoitem_void_flag DBType(TINYINT), Default(0) */
    val tJuchuitemTZaikoitemVoidFlag: Column[Byte] = column[Byte]("t_juchuitem_t_zaikoitem_void_flag", O.Default(0))
    
    /** Index over (tJuchuitemTJuchuId) (database name t_juchuitem_t_juchu_id) */
    val index1 = index("t_juchuitem_t_juchu_id", tJuchuitemTJuchuId :: HNil)
  }
  /** Collection-like TableQuery object for table TJuchuitem */
  lazy val TJuchuitem = new TableQuery(tag => new TJuchuitem(tag))
  
  /** Entity class storing rows of table TJuchumaker
   *  @param tJuchumakerId Database column t_juchumaker_id DBType(INT), AutoInc, PrimaryKey
   *  @param tJuchumakerMMakerId Database column t_juchumaker_m_maker_id DBType(INT)
   *  @param tJuchumakerTJuchuId Database column t_juchumaker_t_juchu_id DBType(INT)
   *  @param tJuchumakerNouhinshoDatetime Database column t_juchumaker_nouhinsho_datetime DBType(DATETIME) */
  case class TJuchumakerRow(tJuchumakerId: Int, tJuchumakerMMakerId: Int, tJuchumakerTJuchuId: Int, tJuchumakerNouhinshoDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TJuchumakerRow objects using plain SQL queries */
  implicit def GetResultTJuchumakerRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TJuchumakerRow] = GR{
    prs => import prs._
    TJuchumakerRow.tupled((<<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_juchumaker. Objects of this class serve as prototypes for rows in queries. */
  class TJuchumaker(_tableTag: Tag) extends Table[TJuchumakerRow](_tableTag, "t_juchumaker") {
    def * = (tJuchumakerId, tJuchumakerMMakerId, tJuchumakerTJuchuId, tJuchumakerNouhinshoDatetime) <> (TJuchumakerRow.tupled, TJuchumakerRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tJuchumakerId.?, tJuchumakerMMakerId.?, tJuchumakerTJuchuId.?, tJuchumakerNouhinshoDatetime.?).shaped.<>({r=>import r._; _1.map(_=> TJuchumakerRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_juchumaker_id DBType(INT), AutoInc, PrimaryKey */
    val tJuchumakerId: Column[Int] = column[Int]("t_juchumaker_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_juchumaker_m_maker_id DBType(INT) */
    val tJuchumakerMMakerId: Column[Int] = column[Int]("t_juchumaker_m_maker_id")
    /** Database column t_juchumaker_t_juchu_id DBType(INT) */
    val tJuchumakerTJuchuId: Column[Int] = column[Int]("t_juchumaker_t_juchu_id")
    /** Database column t_juchumaker_nouhinsho_datetime DBType(DATETIME) */
    val tJuchumakerNouhinshoDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchumaker_nouhinsho_datetime")
    
    /** Uniqueness Index over (tJuchumakerMMakerId,tJuchumakerTJuchuId) (database name t_juchumaker_m_maker_id) */
    val index1 = index("t_juchumaker_m_maker_id", (tJuchumakerMMakerId, tJuchumakerTJuchuId), unique=true)
  }
  /** Collection-like TableQuery object for table TJuchumaker */
  lazy val TJuchumaker = new TableQuery(tag => new TJuchumaker(tag))
  
  /** Entity class storing rows of table TJuchuPayment
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
   *  @param tJuchuPaymentFundFreezeTime Database column t_juchu_payment_fund_freeze_time DBType(DATE) */
  case class TJuchuPaymentRow(tJuchuPaymentId: Int, tJuchuPaymentTradingId: Int = 0, tJuchuPaymentPaid: Int = 0, tJuchuPaymentDeposit: Int = 0, tJuchuPaymentNoticeId: Int, tJuchuPaymentType: Int, tJuchuPaymentStatus: Int, tJuchuPaymentResult: String, tJuchuPaymentResult2: String, tJuchuPaymentRdatetime: java.sql.Timestamp, tJuchuPaymentUdatetime: java.sql.Timestamp, tJuchuPaymentCode: String = "", tJuchuPaymentBankResult: Option[Boolean] = None, tJuchuPaymentBankResulttime: Option[Int] = Some(0), tJuchuPaymentFundFreezeTime: java.sql.Date)
  /** GetResult implicit for fetching TJuchuPaymentRow objects using plain SQL queries */
  implicit def GetResultTJuchuPaymentRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[Boolean]], e4: GR[Option[Int]], e5: GR[java.sql.Date]): GR[TJuchuPaymentRow] = GR{
    prs => import prs._
    TJuchuPaymentRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<?[Boolean], <<?[Int], <<[java.sql.Date]))
  }
  /** Table description of table t_juchu_payment. Objects of this class serve as prototypes for rows in queries. */
  class TJuchuPayment(_tableTag: Tag) extends Table[TJuchuPaymentRow](_tableTag, "t_juchu_payment") {
    def * = (tJuchuPaymentId, tJuchuPaymentTradingId, tJuchuPaymentPaid, tJuchuPaymentDeposit, tJuchuPaymentNoticeId, tJuchuPaymentType, tJuchuPaymentStatus, tJuchuPaymentResult, tJuchuPaymentResult2, tJuchuPaymentRdatetime, tJuchuPaymentUdatetime, tJuchuPaymentCode, tJuchuPaymentBankResult, tJuchuPaymentBankResulttime, tJuchuPaymentFundFreezeTime) <> (TJuchuPaymentRow.tupled, TJuchuPaymentRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tJuchuPaymentId.?, tJuchuPaymentTradingId.?, tJuchuPaymentPaid.?, tJuchuPaymentDeposit.?, tJuchuPaymentNoticeId.?, tJuchuPaymentType.?, tJuchuPaymentStatus.?, tJuchuPaymentResult.?, tJuchuPaymentResult2.?, tJuchuPaymentRdatetime.?, tJuchuPaymentUdatetime.?, tJuchuPaymentCode.?, tJuchuPaymentBankResult, tJuchuPaymentBankResulttime, tJuchuPaymentFundFreezeTime.?).shaped.<>({r=>import r._; _1.map(_=> TJuchuPaymentRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13, _14, _15.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
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
    val tJuchuPaymentResult: Column[String] = column[String]("t_juchu_payment_result", O.Length(65535,varying=true))
    /** Database column t_juchu_payment_result2 DBType(TEXT), Length(65535,true) */
    val tJuchuPaymentResult2: Column[String] = column[String]("t_juchu_payment_result2", O.Length(65535,varying=true))
    /** Database column t_juchu_payment_rdatetime DBType(DATETIME) */
    val tJuchuPaymentRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchu_payment_rdatetime")
    /** Database column t_juchu_payment_udatetime DBType(DATETIME) */
    val tJuchuPaymentUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_juchu_payment_udatetime")
    /** Database column t_juchu_payment_code DBType(VARCHAR), Length(225,true), Default() */
    val tJuchuPaymentCode: Column[String] = column[String]("t_juchu_payment_code", O.Length(225,varying=true), O.Default(""))
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
  
  /** Entity class storing rows of table TLoginfail
   *  @param tLoginfailApp Database column t_loginfail_app DBType(VARCHAR), Length(30,true), Default()
   *  @param tLoginfailAccount Database column t_loginfail_account DBType(VARCHAR), Length(50,true), Default()
   *  @param tLoginfailIp Database column t_loginfail_ip DBType(VARCHAR), Length(50,true), Default()
   *  @param tLoginfailCount Database column t_loginfail_count DBType(BIT), Default(false)
   *  @param tLoginfailUdatetime Database column t_loginfail_udatetime DBType(DATETIME) */
  case class TLoginfailRow(tLoginfailApp: String = "", tLoginfailAccount: String = "", tLoginfailIp: String = "", tLoginfailCount: Boolean = false, tLoginfailUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TLoginfailRow objects using plain SQL queries */
  implicit def GetResultTLoginfailRow(implicit e0: GR[String], e1: GR[Boolean], e2: GR[java.sql.Timestamp]): GR[TLoginfailRow] = GR{
    prs => import prs._
    TLoginfailRow.tupled((<<[String], <<[String], <<[String], <<[Boolean], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_loginfail. Objects of this class serve as prototypes for rows in queries. */
  class TLoginfail(_tableTag: Tag) extends Table[TLoginfailRow](_tableTag, "t_loginfail") {
    def * = (tLoginfailApp, tLoginfailAccount, tLoginfailIp, tLoginfailCount, tLoginfailUdatetime) <> (TLoginfailRow.tupled, TLoginfailRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tLoginfailApp.?, tLoginfailAccount.?, tLoginfailIp.?, tLoginfailCount.?, tLoginfailUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TLoginfailRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_loginfail_app DBType(VARCHAR), Length(30,true), Default() */
    val tLoginfailApp: Column[String] = column[String]("t_loginfail_app", O.Length(30,varying=true), O.Default(""))
    /** Database column t_loginfail_account DBType(VARCHAR), Length(50,true), Default() */
    val tLoginfailAccount: Column[String] = column[String]("t_loginfail_account", O.Length(50,varying=true), O.Default(""))
    /** Database column t_loginfail_ip DBType(VARCHAR), Length(50,true), Default() */
    val tLoginfailIp: Column[String] = column[String]("t_loginfail_ip", O.Length(50,varying=true), O.Default(""))
    /** Database column t_loginfail_count DBType(BIT), Default(false) */
    val tLoginfailCount: Column[Boolean] = column[Boolean]("t_loginfail_count", O.Default(false))
    /** Database column t_loginfail_udatetime DBType(DATETIME) */
    val tLoginfailUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_loginfail_udatetime")
    
    /** Primary key of TLoginfail (database name t_loginfail_PK) */
    val pk = primaryKey("t_loginfail_PK", (tLoginfailApp, tLoginfailAccount, tLoginfailIp))
  }
  /** Collection-like TableQuery object for table TLoginfail */
  lazy val TLoginfail = new TableQuery(tag => new TLoginfail(tag))
  
  /** Entity class storing rows of table TMaker
   *  @param tMakerMMakerId Database column t_maker_m_maker_id DBType(INT UNSIGNED), Default(0)
   *  @param tMakerFrozenSpeedCoin Database column t_maker_frozen_speed_coin DBType(DECIMAL UNSIGNED), Default(0.00) */
  case class TMakerRow(tMakerMMakerId: Int = 0, tMakerFrozenSpeedCoin: scala.math.BigDecimal = "0.00")
  /** GetResult implicit for fetching TMakerRow objects using plain SQL queries */
  implicit def GetResultTMakerRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal]): GR[TMakerRow] = GR{
    prs => import prs._
    TMakerRow.tupled((<<[Int], <<[scala.math.BigDecimal]))
  }
  /** Table description of table t_maker. Objects of this class serve as prototypes for rows in queries. */
  class TMaker(_tableTag: Tag) extends Table[TMakerRow](_tableTag, "t_maker") {
    def * = (tMakerMMakerId, tMakerFrozenSpeedCoin) <> (TMakerRow.tupled, TMakerRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tMakerMMakerId.?, tMakerFrozenSpeedCoin.?).shaped.<>({r=>import r._; _1.map(_=> TMakerRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_maker_m_maker_id DBType(INT UNSIGNED), Default(0) */
    val tMakerMMakerId: Column[Int] = column[Int]("t_maker_m_maker_id", O.Default(0))
    /** Database column t_maker_frozen_speed_coin DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tMakerFrozenSpeedCoin: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_maker_frozen_speed_coin", O.Default("0.00"))
    
    /** Uniqueness Index over (tMakerMMakerId) (database name t_maker_m_maker_id) */
    val index1 = index("t_maker_m_maker_id", tMakerMMakerId, unique=true)
  }
  /** Collection-like TableQuery object for table TMaker */
  lazy val TMaker = new TableQuery(tag => new TMaker(tag))
  
  /** Entity class storing rows of table TMakerFeedback
   *  @param tMakerFeedbackId Database column t_maker_feedback_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param tMakerFeedbackMMakerId Database column t_maker_feedback_m_maker_id DBType(INT), Default(0)
   *  @param tMakerFeedbackTitle Database column t_maker_feedback_title DBType(VARCHAR), Length(100,true)
   *  @param tMakerFeedbackContent Database column t_maker_feedback_content DBType(TEXT), Length(65535,true)
   *  @param tMakerFeedbackMemo Database column t_maker_feedback_memo DBType(TEXT), Length(65535,true)
   *  @param tMakerFeedbackCreattime Database column t_maker_feedback_creattime DBType(DATETIME) */
  case class TMakerFeedbackRow(tMakerFeedbackId: Int, tMakerFeedbackMMakerId: Int = 0, tMakerFeedbackTitle: String, tMakerFeedbackContent: String, tMakerFeedbackMemo: String, tMakerFeedbackCreattime: java.sql.Timestamp)
  /** GetResult implicit for fetching TMakerFeedbackRow objects using plain SQL queries */
  implicit def GetResultTMakerFeedbackRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TMakerFeedbackRow] = GR{
    prs => import prs._
    TMakerFeedbackRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_maker_feedback. Objects of this class serve as prototypes for rows in queries. */
  class TMakerFeedback(_tableTag: Tag) extends Table[TMakerFeedbackRow](_tableTag, "t_maker_feedback") {
    def * = (tMakerFeedbackId, tMakerFeedbackMMakerId, tMakerFeedbackTitle, tMakerFeedbackContent, tMakerFeedbackMemo, tMakerFeedbackCreattime) <> (TMakerFeedbackRow.tupled, TMakerFeedbackRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tMakerFeedbackId.?, tMakerFeedbackMMakerId.?, tMakerFeedbackTitle.?, tMakerFeedbackContent.?, tMakerFeedbackMemo.?, tMakerFeedbackCreattime.?).shaped.<>({r=>import r._; _1.map(_=> TMakerFeedbackRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_maker_feedback_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tMakerFeedbackId: Column[Int] = column[Int]("t_maker_feedback_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_maker_feedback_m_maker_id DBType(INT), Default(0) */
    val tMakerFeedbackMMakerId: Column[Int] = column[Int]("t_maker_feedback_m_maker_id", O.Default(0))
    /** Database column t_maker_feedback_title DBType(VARCHAR), Length(100,true) */
    val tMakerFeedbackTitle: Column[String] = column[String]("t_maker_feedback_title", O.Length(100,varying=true))
    /** Database column t_maker_feedback_content DBType(TEXT), Length(65535,true) */
    val tMakerFeedbackContent: Column[String] = column[String]("t_maker_feedback_content", O.Length(65535,varying=true))
    /** Database column t_maker_feedback_memo DBType(TEXT), Length(65535,true) */
    val tMakerFeedbackMemo: Column[String] = column[String]("t_maker_feedback_memo", O.Length(65535,varying=true))
    /** Database column t_maker_feedback_creattime DBType(DATETIME) */
    val tMakerFeedbackCreattime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_maker_feedback_creattime")
  }
  /** Collection-like TableQuery object for table TMakerFeedback */
  lazy val TMakerFeedback = new TableQuery(tag => new TMakerFeedback(tag))
  
  /** Entity class storing rows of table TMakerHoliday
   *  @param tMakerHolidayId Database column t_maker_holiday_id DBType(INT), AutoInc, PrimaryKey
   *  @param tMakerHolidayMMakerId Database column t_maker_holiday_m_maker_id DBType(INT)
   *  @param tMakerHolidayDate Database column t_maker_holiday_date DBType(DATE)
   *  @param tMakerHolidayLegal Database column t_maker_holiday_legal DBType(TINYINT UNSIGNED), Default(0) */
  case class TMakerHolidayRow(tMakerHolidayId: Int, tMakerHolidayMMakerId: Int, tMakerHolidayDate: java.sql.Date, tMakerHolidayLegal: Byte = 0)
  /** GetResult implicit for fetching TMakerHolidayRow objects using plain SQL queries */
  implicit def GetResultTMakerHolidayRow(implicit e0: GR[Int], e1: GR[java.sql.Date], e2: GR[Byte]): GR[TMakerHolidayRow] = GR{
    prs => import prs._
    TMakerHolidayRow.tupled((<<[Int], <<[Int], <<[java.sql.Date], <<[Byte]))
  }
  /** Table description of table t_maker_holiday. Objects of this class serve as prototypes for rows in queries. */
  class TMakerHoliday(_tableTag: Tag) extends Table[TMakerHolidayRow](_tableTag, "t_maker_holiday") {
    def * = (tMakerHolidayId, tMakerHolidayMMakerId, tMakerHolidayDate, tMakerHolidayLegal) <> (TMakerHolidayRow.tupled, TMakerHolidayRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tMakerHolidayId.?, tMakerHolidayMMakerId.?, tMakerHolidayDate.?, tMakerHolidayLegal.?).shaped.<>({r=>import r._; _1.map(_=> TMakerHolidayRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_maker_holiday_id DBType(INT), AutoInc, PrimaryKey */
    val tMakerHolidayId: Column[Int] = column[Int]("t_maker_holiday_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_maker_holiday_m_maker_id DBType(INT) */
    val tMakerHolidayMMakerId: Column[Int] = column[Int]("t_maker_holiday_m_maker_id")
    /** Database column t_maker_holiday_date DBType(DATE) */
    val tMakerHolidayDate: Column[java.sql.Date] = column[java.sql.Date]("t_maker_holiday_date")
    /** Database column t_maker_holiday_legal DBType(TINYINT UNSIGNED), Default(0) */
    val tMakerHolidayLegal: Column[Byte] = column[Byte]("t_maker_holiday_legal", O.Default(0))
    
    /** Uniqueness Index over (tMakerHolidayMMakerId,tMakerHolidayDate) (database name t_maker_holiday_m_maker_id) */
    val index1 = index("t_maker_holiday_m_maker_id", (tMakerHolidayMMakerId, tMakerHolidayDate), unique=true)
  }
  /** Collection-like TableQuery object for table TMakerHoliday */
  lazy val TMakerHoliday = new TableQuery(tag => new TMakerHoliday(tag))
  
  /** Entity class storing rows of table TMakerLoginHistory
   *  @param tMakerLoginHistoryId Database column t_maker_login_history_id DBType(INT), AutoInc, PrimaryKey
   *  @param tMakerLoginHistoryMMakerId Database column t_maker_login_history_m_maker_id DBType(INT)
   *  @param tMakerLoginHistoryAccountId Database column t_maker_login_history_account_id DBType(VARCHAR), Length(20,true)
   *  @param tMakerLoginHistoryDatetime Database column t_maker_login_history_datetime DBType(DATETIME)
   *  @param tMakerLoginHistoryIp Database column t_maker_login_history_ip DBType(VARCHAR), Length(40,true)
   *  @param tMakerLoginHistoryUserAgent Database column t_maker_login_history_user_agent DBType(INT) */
  case class TMakerLoginHistoryRow(tMakerLoginHistoryId: Int, tMakerLoginHistoryMMakerId: Int, tMakerLoginHistoryAccountId: String, tMakerLoginHistoryDatetime: java.sql.Timestamp, tMakerLoginHistoryIp: String, tMakerLoginHistoryUserAgent: Int)
  /** GetResult implicit for fetching TMakerLoginHistoryRow objects using plain SQL queries */
  implicit def GetResultTMakerLoginHistoryRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TMakerLoginHistoryRow] = GR{
    prs => import prs._
    TMakerLoginHistoryRow.tupled((<<[Int], <<[Int], <<[String], <<[java.sql.Timestamp], <<[String], <<[Int]))
  }
  /** Table description of table t_maker_login_history. Objects of this class serve as prototypes for rows in queries. */
  class TMakerLoginHistory(_tableTag: Tag) extends Table[TMakerLoginHistoryRow](_tableTag, "t_maker_login_history") {
    def * = (tMakerLoginHistoryId, tMakerLoginHistoryMMakerId, tMakerLoginHistoryAccountId, tMakerLoginHistoryDatetime, tMakerLoginHistoryIp, tMakerLoginHistoryUserAgent) <> (TMakerLoginHistoryRow.tupled, TMakerLoginHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tMakerLoginHistoryId.?, tMakerLoginHistoryMMakerId.?, tMakerLoginHistoryAccountId.?, tMakerLoginHistoryDatetime.?, tMakerLoginHistoryIp.?, tMakerLoginHistoryUserAgent.?).shaped.<>({r=>import r._; _1.map(_=> TMakerLoginHistoryRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_maker_login_history_id DBType(INT), AutoInc, PrimaryKey */
    val tMakerLoginHistoryId: Column[Int] = column[Int]("t_maker_login_history_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_maker_login_history_m_maker_id DBType(INT) */
    val tMakerLoginHistoryMMakerId: Column[Int] = column[Int]("t_maker_login_history_m_maker_id")
    /** Database column t_maker_login_history_account_id DBType(VARCHAR), Length(20,true) */
    val tMakerLoginHistoryAccountId: Column[String] = column[String]("t_maker_login_history_account_id", O.Length(20,varying=true))
    /** Database column t_maker_login_history_datetime DBType(DATETIME) */
    val tMakerLoginHistoryDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_maker_login_history_datetime")
    /** Database column t_maker_login_history_ip DBType(VARCHAR), Length(40,true) */
    val tMakerLoginHistoryIp: Column[String] = column[String]("t_maker_login_history_ip", O.Length(40,varying=true))
    /** Database column t_maker_login_history_user_agent DBType(INT) */
    val tMakerLoginHistoryUserAgent: Column[Int] = column[Int]("t_maker_login_history_user_agent")
  }
  /** Collection-like TableQuery object for table TMakerLoginHistory */
  lazy val TMakerLoginHistory = new TableQuery(tag => new TMakerLoginHistory(tag))
  
  /** Entity class storing rows of table TMakermenu
   *  @param tMakermenuId Database column t_makermenu_id DBType(INT), AutoInc, PrimaryKey
   *  @param tMakermenuVoidFlag Database column t_makermenu_void_flag DBType(INT)
   *  @param tMakermenuMMakerId Database column t_makermenu_m_maker_id DBType(INT)
   *  @param tMakermenuTitle Database column t_makermenu_title DBType(VARCHAR), Length(100,true)
   *  @param tMakermenuData Database column t_makermenu_data DBType(MEDIUMBLOB)
   *  @param tMakermenuLink Database column t_makermenu_link DBType(VARCHAR), Length(255,true)
   *  @param tMakermenuOrder Database column t_makermenu_order DBType(INT)
   *  @param tMakermenuRuser Database column t_makermenu_ruser DBType(INT)
   *  @param tMakermenuUuser Database column t_makermenu_uuser DBType(INT)
   *  @param tMakermenuRdatetime Database column t_makermenu_rdatetime DBType(DATETIME)
   *  @param tMakermenuUdatetime Database column t_makermenu_udatetime DBType(DATETIME) */
  case class TMakermenuRow(tMakermenuId: Int, tMakermenuVoidFlag: Int, tMakermenuMMakerId: Int, tMakermenuTitle: String, tMakermenuData: java.sql.Blob, tMakermenuLink: String, tMakermenuOrder: Int, tMakermenuRuser: Int, tMakermenuUuser: Int, tMakermenuRdatetime: java.sql.Timestamp, tMakermenuUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TMakermenuRow objects using plain SQL queries */
  implicit def GetResultTMakermenuRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Blob], e3: GR[java.sql.Timestamp]): GR[TMakermenuRow] = GR{
    prs => import prs._
    TMakermenuRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<[java.sql.Blob], <<[String], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_makermenu. Objects of this class serve as prototypes for rows in queries. */
  class TMakermenu(_tableTag: Tag) extends Table[TMakermenuRow](_tableTag, "t_makermenu") {
    def * = (tMakermenuId, tMakermenuVoidFlag, tMakermenuMMakerId, tMakermenuTitle, tMakermenuData, tMakermenuLink, tMakermenuOrder, tMakermenuRuser, tMakermenuUuser, tMakermenuRdatetime, tMakermenuUdatetime) <> (TMakermenuRow.tupled, TMakermenuRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tMakermenuId.?, tMakermenuVoidFlag.?, tMakermenuMMakerId.?, tMakermenuTitle.?, tMakermenuData.?, tMakermenuLink.?, tMakermenuOrder.?, tMakermenuRuser.?, tMakermenuUuser.?, tMakermenuRdatetime.?, tMakermenuUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TMakermenuRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_makermenu_id DBType(INT), AutoInc, PrimaryKey */
    val tMakermenuId: Column[Int] = column[Int]("t_makermenu_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_makermenu_void_flag DBType(INT) */
    val tMakermenuVoidFlag: Column[Int] = column[Int]("t_makermenu_void_flag")
    /** Database column t_makermenu_m_maker_id DBType(INT) */
    val tMakermenuMMakerId: Column[Int] = column[Int]("t_makermenu_m_maker_id")
    /** Database column t_makermenu_title DBType(VARCHAR), Length(100,true) */
    val tMakermenuTitle: Column[String] = column[String]("t_makermenu_title", O.Length(100,varying=true))
    /** Database column t_makermenu_data DBType(MEDIUMBLOB) */
    val tMakermenuData: Column[java.sql.Blob] = column[java.sql.Blob]("t_makermenu_data")
    /** Database column t_makermenu_link DBType(VARCHAR), Length(255,true) */
    val tMakermenuLink: Column[String] = column[String]("t_makermenu_link", O.Length(255,varying=true))
    /** Database column t_makermenu_order DBType(INT) */
    val tMakermenuOrder: Column[Int] = column[Int]("t_makermenu_order")
    /** Database column t_makermenu_ruser DBType(INT) */
    val tMakermenuRuser: Column[Int] = column[Int]("t_makermenu_ruser")
    /** Database column t_makermenu_uuser DBType(INT) */
    val tMakermenuUuser: Column[Int] = column[Int]("t_makermenu_uuser")
    /** Database column t_makermenu_rdatetime DBType(DATETIME) */
    val tMakermenuRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_makermenu_rdatetime")
    /** Database column t_makermenu_udatetime DBType(DATETIME) */
    val tMakermenuUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_makermenu_udatetime")
  }
  /** Collection-like TableQuery object for table TMakermenu */
  lazy val TMakermenu = new TableQuery(tag => new TMakermenu(tag))
  
  /** Entity class storing rows of table TMakerRecomend
   *  @param tMakerRecomendId Database column t_maker_recomend_id DBType(INT), AutoInc, PrimaryKey
   *  @param tMakerRecomendVoidFlag Database column t_maker_recomend_void_flag DBType(TINYINT)
   *  @param tMakerRecomendMMakerId Database column t_maker_recomend_m_maker_id DBType(INT)
   *  @param tMakerRecomendRdatetime Database column t_maker_recomend_rdatetime DBType(DATETIME) */
  case class TMakerRecomendRow(tMakerRecomendId: Int, tMakerRecomendVoidFlag: Byte, tMakerRecomendMMakerId: Int, tMakerRecomendRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TMakerRecomendRow objects using plain SQL queries */
  implicit def GetResultTMakerRecomendRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[java.sql.Timestamp]): GR[TMakerRecomendRow] = GR{
    prs => import prs._
    TMakerRecomendRow.tupled((<<[Int], <<[Byte], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_maker_recomend. Objects of this class serve as prototypes for rows in queries. */
  class TMakerRecomend(_tableTag: Tag) extends Table[TMakerRecomendRow](_tableTag, "t_maker_recomend") {
    def * = (tMakerRecomendId, tMakerRecomendVoidFlag, tMakerRecomendMMakerId, tMakerRecomendRdatetime) <> (TMakerRecomendRow.tupled, TMakerRecomendRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tMakerRecomendId.?, tMakerRecomendVoidFlag.?, tMakerRecomendMMakerId.?, tMakerRecomendRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TMakerRecomendRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_maker_recomend_id DBType(INT), AutoInc, PrimaryKey */
    val tMakerRecomendId: Column[Int] = column[Int]("t_maker_recomend_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_maker_recomend_void_flag DBType(TINYINT) */
    val tMakerRecomendVoidFlag: Column[Byte] = column[Byte]("t_maker_recomend_void_flag")
    /** Database column t_maker_recomend_m_maker_id DBType(INT) */
    val tMakerRecomendMMakerId: Column[Int] = column[Int]("t_maker_recomend_m_maker_id")
    /** Database column t_maker_recomend_rdatetime DBType(DATETIME) */
    val tMakerRecomendRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_maker_recomend_rdatetime")
    
    /** Uniqueness Index over (tMakerRecomendMMakerId) (database name m_item_id) */
    val index1 = index("m_item_id", tMakerRecomendMMakerId, unique=true)
  }
  /** Collection-like TableQuery object for table TMakerRecomend */
  lazy val TMakerRecomend = new TableQuery(tag => new TMakerRecomend(tag))
  
  /** Entity class storing rows of table TMediate
   *  @param tMediateId Database column t_mediate_id DBType(INT), AutoInc, PrimaryKey
   *  @param tMediateTJuchuId Database column t_mediate_t_juchu_id DBType(INT)
   *  @param tMediateMMakerId Database column t_mediate_m_maker_id DBType(INT)
   *  @param tMediateFrom Database column t_mediate_from DBType(INT)
   *  @param tMediateApplyDatetime Database column t_mediate_apply_datetime DBType(DATETIME)
   *  @param tMediateResultDatetime Database column t_mediate_result_datetime DBType(DATETIME)
   *  @param tMediateCause Database column t_mediate_cause DBType(TEXT), Length(65535,true), Default(None)
   *  @param tMediateGoods Database column t_mediate_goods DBType(VARCHAR), Length(1000,true), Default(None)
   *  @param tMediateImage1 Database column t_mediate_image_1 DBType(MEDIUMBLOB), Default(None)
   *  @param tMediateImage2 Database column t_mediate_image_2 DBType(MEDIUMBLOB), Default(None)
   *  @param tMediateImage3 Database column t_mediate_image_3 DBType(MEDIUMBLOB), Default(None)
   *  @param tMediateImage4 Database column t_mediate_image_4 DBType(MEDIUMBLOB), Default(None)
   *  @param tMediateImage5 Database column t_mediate_image_5 DBType(MEDIUMBLOB), Default(None)
   *  @param tMediateResult Database column t_mediate_result DBType(TEXT), Length(65535,true), Default(None)
   *  @param tMediateAppealDatetime Database column t_mediate_appeal_datetime DBType(DATETIME)
   *  @param tMediateAppealStatus Database column t_mediate_appeal_status DBType(BIT), Default(false)
   *  @param tMediateApproveDatetime Database column t_mediate_approve_datetime DBType(DATETIME)
   *  @param tMediateRemark Database column t_mediate_remark DBType(TEXT), Length(65535,true), Default(None)
   *  @param tMediateStatus Database column t_mediate_status DBType(TINYINT UNSIGNED), Default(0)
   *  @param tMediateProcessStatus Database column t_mediate_process_status DBType(BIT), Default(false) */
  case class TMediateRow(tMediateId: Int, tMediateTJuchuId: Int, tMediateMMakerId: Int, tMediateFrom: Int, tMediateApplyDatetime: java.sql.Timestamp, tMediateResultDatetime: java.sql.Timestamp, tMediateCause: Option[String] = None, tMediateGoods: Option[String] = None, tMediateImage1: Option[java.sql.Blob] = None, tMediateImage2: Option[java.sql.Blob] = None, tMediateImage3: Option[java.sql.Blob] = None, tMediateImage4: Option[java.sql.Blob] = None, tMediateImage5: Option[java.sql.Blob] = None, tMediateResult: Option[String] = None, tMediateAppealDatetime: java.sql.Timestamp, tMediateAppealStatus: Boolean = false, tMediateApproveDatetime: java.sql.Timestamp, tMediateRemark: Option[String] = None, tMediateStatus: Byte = 0, tMediateProcessStatus: Boolean = false)
  /** GetResult implicit for fetching TMediateRow objects using plain SQL queries */
  implicit def GetResultTMediateRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp], e2: GR[Option[String]], e3: GR[Option[java.sql.Blob]], e4: GR[Boolean], e5: GR[Byte]): GR[TMediateRow] = GR{
    prs => import prs._
    TMediateRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[java.sql.Blob], <<?[java.sql.Blob], <<?[java.sql.Blob], <<?[java.sql.Blob], <<?[java.sql.Blob], <<?[String], <<[java.sql.Timestamp], <<[Boolean], <<[java.sql.Timestamp], <<?[String], <<[Byte], <<[Boolean]))
  }
  /** Table description of table t_mediate. Objects of this class serve as prototypes for rows in queries. */
  class TMediate(_tableTag: Tag) extends Table[TMediateRow](_tableTag, "t_mediate") {
    def * = (tMediateId, tMediateTJuchuId, tMediateMMakerId, tMediateFrom, tMediateApplyDatetime, tMediateResultDatetime, tMediateCause, tMediateGoods, tMediateImage1, tMediateImage2, tMediateImage3, tMediateImage4, tMediateImage5, tMediateResult, tMediateAppealDatetime, tMediateAppealStatus, tMediateApproveDatetime, tMediateRemark, tMediateStatus, tMediateProcessStatus) <> (TMediateRow.tupled, TMediateRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tMediateId.?, tMediateTJuchuId.?, tMediateMMakerId.?, tMediateFrom.?, tMediateApplyDatetime.?, tMediateResultDatetime.?, tMediateCause, tMediateGoods, tMediateImage1, tMediateImage2, tMediateImage3, tMediateImage4, tMediateImage5, tMediateResult, tMediateAppealDatetime.?, tMediateAppealStatus.?, tMediateApproveDatetime.?, tMediateRemark, tMediateStatus.?, tMediateProcessStatus.?).shaped.<>({r=>import r._; _1.map(_=> TMediateRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8, _9, _10, _11, _12, _13, _14, _15.get, _16.get, _17.get, _18, _19.get, _20.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_mediate_id DBType(INT), AutoInc, PrimaryKey */
    val tMediateId: Column[Int] = column[Int]("t_mediate_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_mediate_t_juchu_id DBType(INT) */
    val tMediateTJuchuId: Column[Int] = column[Int]("t_mediate_t_juchu_id")
    /** Database column t_mediate_m_maker_id DBType(INT) */
    val tMediateMMakerId: Column[Int] = column[Int]("t_mediate_m_maker_id")
    /** Database column t_mediate_from DBType(INT) */
    val tMediateFrom: Column[Int] = column[Int]("t_mediate_from")
    /** Database column t_mediate_apply_datetime DBType(DATETIME) */
    val tMediateApplyDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_mediate_apply_datetime")
    /** Database column t_mediate_result_datetime DBType(DATETIME) */
    val tMediateResultDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_mediate_result_datetime")
    /** Database column t_mediate_cause DBType(TEXT), Length(65535,true), Default(None) */
    val tMediateCause: Column[Option[String]] = column[Option[String]]("t_mediate_cause", O.Length(65535,varying=true), O.Default(None))
    /** Database column t_mediate_goods DBType(VARCHAR), Length(1000,true), Default(None) */
    val tMediateGoods: Column[Option[String]] = column[Option[String]]("t_mediate_goods", O.Length(1000,varying=true), O.Default(None))
    /** Database column t_mediate_image_1 DBType(MEDIUMBLOB), Default(None) */
    val tMediateImage1: Column[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("t_mediate_image_1", O.Default(None))
    /** Database column t_mediate_image_2 DBType(MEDIUMBLOB), Default(None) */
    val tMediateImage2: Column[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("t_mediate_image_2", O.Default(None))
    /** Database column t_mediate_image_3 DBType(MEDIUMBLOB), Default(None) */
    val tMediateImage3: Column[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("t_mediate_image_3", O.Default(None))
    /** Database column t_mediate_image_4 DBType(MEDIUMBLOB), Default(None) */
    val tMediateImage4: Column[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("t_mediate_image_4", O.Default(None))
    /** Database column t_mediate_image_5 DBType(MEDIUMBLOB), Default(None) */
    val tMediateImage5: Column[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("t_mediate_image_5", O.Default(None))
    /** Database column t_mediate_result DBType(TEXT), Length(65535,true), Default(None) */
    val tMediateResult: Column[Option[String]] = column[Option[String]]("t_mediate_result", O.Length(65535,varying=true), O.Default(None))
    /** Database column t_mediate_appeal_datetime DBType(DATETIME) */
    val tMediateAppealDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_mediate_appeal_datetime")
    /** Database column t_mediate_appeal_status DBType(BIT), Default(false) */
    val tMediateAppealStatus: Column[Boolean] = column[Boolean]("t_mediate_appeal_status", O.Default(false))
    /** Database column t_mediate_approve_datetime DBType(DATETIME) */
    val tMediateApproveDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_mediate_approve_datetime")
    /** Database column t_mediate_remark DBType(TEXT), Length(65535,true), Default(None) */
    val tMediateRemark: Column[Option[String]] = column[Option[String]]("t_mediate_remark", O.Length(65535,varying=true), O.Default(None))
    /** Database column t_mediate_status DBType(TINYINT UNSIGNED), Default(0) */
    val tMediateStatus: Column[Byte] = column[Byte]("t_mediate_status", O.Default(0))
    /** Database column t_mediate_process_status DBType(BIT), Default(false) */
    val tMediateProcessStatus: Column[Boolean] = column[Boolean]("t_mediate_process_status", O.Default(false))
  }
  /** Collection-like TableQuery object for table TMediate */
  lazy val TMediate = new TableQuery(tag => new TMediate(tag))
  
  /** Entity class storing rows of table TMediateItem
   *  @param tMediateItemId Database column t_mediate_item_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param tMediateItemTMediateId Database column t_mediate_item_t_mediate_id DBType(INT)
   *  @param tMediateItemCause Database column t_mediate_item_cause DBType(TEXT), Length(65535,true)
   *  @param tMediateItemImage1 Database column t_mediate_item_image_1 DBType(MEDIUMBLOB)
   *  @param tMediateItemImage2 Database column t_mediate_item_image_2 DBType(MEDIUMBLOB)
   *  @param tMediateItemImage3 Database column t_mediate_item_image_3 DBType(MEDIUMBLOB)
   *  @param tMediateItemImage4 Database column t_mediate_item_image_4 DBType(MEDIUMBLOB)
   *  @param tMediateItemImage5 Database column t_mediate_item_image_5 DBType(MEDIUMBLOB)
   *  @param tMediateItemApplyDatetime Database column t_mediate_item_apply_datetime DBType(DATETIME)
   *  @param tMediateItemUpdateDatetime Database column t_mediate_item_update_datetime DBType(DATETIME) */
  case class TMediateItemRow(tMediateItemId: Int, tMediateItemTMediateId: Int, tMediateItemCause: String, tMediateItemImage1: java.sql.Blob, tMediateItemImage2: java.sql.Blob, tMediateItemImage3: java.sql.Blob, tMediateItemImage4: java.sql.Blob, tMediateItemImage5: java.sql.Blob, tMediateItemApplyDatetime: java.sql.Timestamp, tMediateItemUpdateDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TMediateItemRow objects using plain SQL queries */
  implicit def GetResultTMediateItemRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Blob], e3: GR[java.sql.Timestamp]): GR[TMediateItemRow] = GR{
    prs => import prs._
    TMediateItemRow.tupled((<<[Int], <<[Int], <<[String], <<[java.sql.Blob], <<[java.sql.Blob], <<[java.sql.Blob], <<[java.sql.Blob], <<[java.sql.Blob], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_mediate_item. Objects of this class serve as prototypes for rows in queries. */
  class TMediateItem(_tableTag: Tag) extends Table[TMediateItemRow](_tableTag, "t_mediate_item") {
    def * = (tMediateItemId, tMediateItemTMediateId, tMediateItemCause, tMediateItemImage1, tMediateItemImage2, tMediateItemImage3, tMediateItemImage4, tMediateItemImage5, tMediateItemApplyDatetime, tMediateItemUpdateDatetime) <> (TMediateItemRow.tupled, TMediateItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tMediateItemId.?, tMediateItemTMediateId.?, tMediateItemCause.?, tMediateItemImage1.?, tMediateItemImage2.?, tMediateItemImage3.?, tMediateItemImage4.?, tMediateItemImage5.?, tMediateItemApplyDatetime.?, tMediateItemUpdateDatetime.?).shaped.<>({r=>import r._; _1.map(_=> TMediateItemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_mediate_item_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tMediateItemId: Column[Int] = column[Int]("t_mediate_item_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_mediate_item_t_mediate_id DBType(INT) */
    val tMediateItemTMediateId: Column[Int] = column[Int]("t_mediate_item_t_mediate_id")
    /** Database column t_mediate_item_cause DBType(TEXT), Length(65535,true) */
    val tMediateItemCause: Column[String] = column[String]("t_mediate_item_cause", O.Length(65535,varying=true))
    /** Database column t_mediate_item_image_1 DBType(MEDIUMBLOB) */
    val tMediateItemImage1: Column[java.sql.Blob] = column[java.sql.Blob]("t_mediate_item_image_1")
    /** Database column t_mediate_item_image_2 DBType(MEDIUMBLOB) */
    val tMediateItemImage2: Column[java.sql.Blob] = column[java.sql.Blob]("t_mediate_item_image_2")
    /** Database column t_mediate_item_image_3 DBType(MEDIUMBLOB) */
    val tMediateItemImage3: Column[java.sql.Blob] = column[java.sql.Blob]("t_mediate_item_image_3")
    /** Database column t_mediate_item_image_4 DBType(MEDIUMBLOB) */
    val tMediateItemImage4: Column[java.sql.Blob] = column[java.sql.Blob]("t_mediate_item_image_4")
    /** Database column t_mediate_item_image_5 DBType(MEDIUMBLOB) */
    val tMediateItemImage5: Column[java.sql.Blob] = column[java.sql.Blob]("t_mediate_item_image_5")
    /** Database column t_mediate_item_apply_datetime DBType(DATETIME) */
    val tMediateItemApplyDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_mediate_item_apply_datetime")
    /** Database column t_mediate_item_update_datetime DBType(DATETIME) */
    val tMediateItemUpdateDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_mediate_item_update_datetime")
  }
  /** Collection-like TableQuery object for table TMediateItem */
  lazy val TMediateItem = new TableQuery(tag => new TMediateItem(tag))
  
  /** Entity class storing rows of table TmpCusPerMons
   *  @param mStkJpyMCustomerId Database column m_stk_jpy_m_customer_id DBType(INT)
   *  @param y Database column y DBType(INT), Default(None)
   *  @param m Database column m DBType(INT), Default(None)
   *  @param dm Database column dm DBType(VARCHAR), Length(7,true), Default(None) */
  case class TmpCusPerMonsRow(mStkJpyMCustomerId: Int, y: Option[Int] = None, m: Option[Int] = None, dm: Option[String] = None)
  /** GetResult implicit for fetching TmpCusPerMonsRow objects using plain SQL queries */
  implicit def GetResultTmpCusPerMonsRow(implicit e0: GR[Int], e1: GR[Option[Int]], e2: GR[Option[String]]): GR[TmpCusPerMonsRow] = GR{
    prs => import prs._
    TmpCusPerMonsRow.tupled((<<[Int], <<?[Int], <<?[Int], <<?[String]))
  }
  /** Table description of table tmp_cus_per_mons. Objects of this class serve as prototypes for rows in queries. */
  class TmpCusPerMons(_tableTag: Tag) extends Table[TmpCusPerMonsRow](_tableTag, "tmp_cus_per_mons") {
    def * = (mStkJpyMCustomerId, y, m, dm) <> (TmpCusPerMonsRow.tupled, TmpCusPerMonsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkJpyMCustomerId.?, y, m, dm).shaped.<>({r=>import r._; _1.map(_=> TmpCusPerMonsRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_jpy_m_customer_id DBType(INT) */
    val mStkJpyMCustomerId: Column[Int] = column[Int]("m_stk_jpy_m_customer_id")
    /** Database column y DBType(INT), Default(None) */
    val y: Column[Option[Int]] = column[Option[Int]]("y", O.Default(None))
    /** Database column m DBType(INT), Default(None) */
    val m: Column[Option[Int]] = column[Option[Int]]("m", O.Default(None))
    /** Database column dm DBType(VARCHAR), Length(7,true), Default(None) */
    val dm: Column[Option[String]] = column[Option[String]]("dm", O.Length(7,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table TmpCusPerMons */
  lazy val TmpCusPerMons = new TableQuery(tag => new TmpCusPerMons(tag))
  
  /** Entity class storing rows of table TmpCusSumPerMoms
   *  @param mStkJpyMCustomerId Database column m_stk_jpy_m_customer_id DBType(INT)
   *  @param y Database column y DBType(INT), Default(None)
   *  @param m Database column m DBType(INT), Default(None)
   *  @param dm Database column dm DBType(VARCHAR), Length(7,true), Default(None)
   *  @param mStkJpyLatestBalance Database column m_stk_jpy_latest_balance DBType(INT), Default(None) */
  case class TmpCusSumPerMomsRow(mStkJpyMCustomerId: Int, y: Option[Int] = None, m: Option[Int] = None, dm: Option[String] = None, mStkJpyLatestBalance: Option[Int] = None)
  /** GetResult implicit for fetching TmpCusSumPerMomsRow objects using plain SQL queries */
  implicit def GetResultTmpCusSumPerMomsRow(implicit e0: GR[Int], e1: GR[Option[Int]], e2: GR[Option[String]]): GR[TmpCusSumPerMomsRow] = GR{
    prs => import prs._
    TmpCusSumPerMomsRow.tupled((<<[Int], <<?[Int], <<?[Int], <<?[String], <<?[Int]))
  }
  /** Table description of table tmp_cus_sum_per_moms. Objects of this class serve as prototypes for rows in queries. */
  class TmpCusSumPerMoms(_tableTag: Tag) extends Table[TmpCusSumPerMomsRow](_tableTag, "tmp_cus_sum_per_moms") {
    def * = (mStkJpyMCustomerId, y, m, dm, mStkJpyLatestBalance) <> (TmpCusSumPerMomsRow.tupled, TmpCusSumPerMomsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (mStkJpyMCustomerId.?, y, m, dm, mStkJpyLatestBalance).shaped.<>({r=>import r._; _1.map(_=> TmpCusSumPerMomsRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column m_stk_jpy_m_customer_id DBType(INT) */
    val mStkJpyMCustomerId: Column[Int] = column[Int]("m_stk_jpy_m_customer_id")
    /** Database column y DBType(INT), Default(None) */
    val y: Column[Option[Int]] = column[Option[Int]]("y", O.Default(None))
    /** Database column m DBType(INT), Default(None) */
    val m: Column[Option[Int]] = column[Option[Int]]("m", O.Default(None))
    /** Database column dm DBType(VARCHAR), Length(7,true), Default(None) */
    val dm: Column[Option[String]] = column[Option[String]]("dm", O.Length(7,varying=true), O.Default(None))
    /** Database column m_stk_jpy_latest_balance DBType(INT), Default(None) */
    val mStkJpyLatestBalance: Column[Option[Int]] = column[Option[Int]]("m_stk_jpy_latest_balance", O.Default(None))
  }
  /** Collection-like TableQuery object for table TmpCusSumPerMoms */
  lazy val TmpCusSumPerMoms = new TableQuery(tag => new TmpCusSumPerMoms(tag))
  
  /** Entity class storing rows of table TNyukin
   *  @param tNyukinId Database column t_nyukin_id DBType(INT), AutoInc, PrimaryKey
   *  @param tNyukinVoidFlag Database column t_nyukin_void_flag DBType(TINYINT)
   *  @param tNyukinMCustomerId Database column t_nyukin_m_customer_id DBType(INT)
   *  @param tNyukinDatetime Database column t_nyukin_datetime DBType(DATETIME)
   *  @param tNyukinMBankId Database column t_nyukin_m_bank_id DBType(INT)
   *  @param tNyukinNote Database column t_nyukin_note DBType(TEXT), Length(65535,true) */
  case class TNyukinRow(tNyukinId: Int, tNyukinVoidFlag: Byte, tNyukinMCustomerId: Int, tNyukinDatetime: java.sql.Timestamp, tNyukinMBankId: Int, tNyukinNote: String)
  /** GetResult implicit for fetching TNyukinRow objects using plain SQL queries */
  implicit def GetResultTNyukinRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[java.sql.Timestamp], e3: GR[String]): GR[TNyukinRow] = GR{
    prs => import prs._
    TNyukinRow.tupled((<<[Int], <<[Byte], <<[Int], <<[java.sql.Timestamp], <<[Int], <<[String]))
  }
  /** Table description of table t_nyukin. Objects of this class serve as prototypes for rows in queries. */
  class TNyukin(_tableTag: Tag) extends Table[TNyukinRow](_tableTag, "t_nyukin") {
    def * = (tNyukinId, tNyukinVoidFlag, tNyukinMCustomerId, tNyukinDatetime, tNyukinMBankId, tNyukinNote) <> (TNyukinRow.tupled, TNyukinRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tNyukinId.?, tNyukinVoidFlag.?, tNyukinMCustomerId.?, tNyukinDatetime.?, tNyukinMBankId.?, tNyukinNote.?).shaped.<>({r=>import r._; _1.map(_=> TNyukinRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_nyukin_id DBType(INT), AutoInc, PrimaryKey */
    val tNyukinId: Column[Int] = column[Int]("t_nyukin_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_nyukin_void_flag DBType(TINYINT) */
    val tNyukinVoidFlag: Column[Byte] = column[Byte]("t_nyukin_void_flag")
    /** Database column t_nyukin_m_customer_id DBType(INT) */
    val tNyukinMCustomerId: Column[Int] = column[Int]("t_nyukin_m_customer_id")
    /** Database column t_nyukin_datetime DBType(DATETIME) */
    val tNyukinDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_nyukin_datetime")
    /** Database column t_nyukin_m_bank_id DBType(INT) */
    val tNyukinMBankId: Column[Int] = column[Int]("t_nyukin_m_bank_id")
    /** Database column t_nyukin_note DBType(TEXT), Length(65535,true) */
    val tNyukinNote: Column[String] = column[String]("t_nyukin_note", O.Length(65535,varying=true))
    
    /** Index over (tNyukinMCustomerId) (database name t_nyukin_m_customer_id) */
    val index1 = index("t_nyukin_m_customer_id", tNyukinMCustomerId)
  }
  /** Collection-like TableQuery object for table TNyukin */
  lazy val TNyukin = new TableQuery(tag => new TNyukin(tag))
  
  /** Entity class storing rows of table TNyukinitem
   *  @param tNyukinitemId Database column t_nyukinitem_id DBType(INT), AutoInc, PrimaryKey
   *  @param tNyukinitemTNyukinId Database column t_nyukinitem_t_nyukin_id DBType(INT)
   *  @param tNyukinitemName Database column t_nyukinitem_name DBType(INT)
   *  @param tNyukinitemAmount Database column t_nyukinitem_amount DBType(INT) */
  case class TNyukinitemRow(tNyukinitemId: Int, tNyukinitemTNyukinId: Int, tNyukinitemName: Int, tNyukinitemAmount: Int)
  /** GetResult implicit for fetching TNyukinitemRow objects using plain SQL queries */
  implicit def GetResultTNyukinitemRow(implicit e0: GR[Int]): GR[TNyukinitemRow] = GR{
    prs => import prs._
    TNyukinitemRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table t_nyukinitem. Objects of this class serve as prototypes for rows in queries. */
  class TNyukinitem(_tableTag: Tag) extends Table[TNyukinitemRow](_tableTag, "t_nyukinitem") {
    def * = (tNyukinitemId, tNyukinitemTNyukinId, tNyukinitemName, tNyukinitemAmount) <> (TNyukinitemRow.tupled, TNyukinitemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tNyukinitemId.?, tNyukinitemTNyukinId.?, tNyukinitemName.?, tNyukinitemAmount.?).shaped.<>({r=>import r._; _1.map(_=> TNyukinitemRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_nyukinitem_id DBType(INT), AutoInc, PrimaryKey */
    val tNyukinitemId: Column[Int] = column[Int]("t_nyukinitem_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_nyukinitem_t_nyukin_id DBType(INT) */
    val tNyukinitemTNyukinId: Column[Int] = column[Int]("t_nyukinitem_t_nyukin_id")
    /** Database column t_nyukinitem_name DBType(INT) */
    val tNyukinitemName: Column[Int] = column[Int]("t_nyukinitem_name")
    /** Database column t_nyukinitem_amount DBType(INT) */
    val tNyukinitemAmount: Column[Int] = column[Int]("t_nyukinitem_amount")
    
    /** Index over (tNyukinitemTNyukinId) (database name t_nyukinitem_t_nyukin_id) */
    val index1 = index("t_nyukinitem_t_nyukin_id", tNyukinitemTNyukinId)
  }
  /** Collection-like TableQuery object for table TNyukinitem */
  lazy val TNyukinitem = new TableQuery(tag => new TNyukinitem(tag))
  
  /** Entity class storing rows of table TOem
   *  @param tOemId Database column t_oem_id DBType(INT), AutoInc, PrimaryKey
   *  @param tOemStatusFlag Database column t_oem_status_flag DBType(INT)
   *  @param tOemMOemId Database column t_oem_m_oem_id DBType(INT)
   *  @param tOemOrder Database column t_oem_order DBType(TEXT), Length(65535,true)
   *  @param tOemCreateuser Database column t_oem_createuser DBType(TINYINT)
   *  @param tOemNote Database column t_oem_note DBType(TEXT), Length(65535,true)
   *  @param tOemRdatetime Database column t_oem_rdatetime DBType(DATETIME)
   *  @param tOemUdatetime Database column t_oem_udatetime DBType(DATETIME) */
  case class TOemRow(tOemId: Int, tOemStatusFlag: Int, tOemMOemId: Int, tOemOrder: String, tOemCreateuser: Byte, tOemNote: String, tOemRdatetime: java.sql.Timestamp, tOemUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TOemRow objects using plain SQL queries */
  implicit def GetResultTOemRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Byte], e3: GR[java.sql.Timestamp]): GR[TOemRow] = GR{
    prs => import prs._
    TOemRow.tupled((<<[Int], <<[Int], <<[Int], <<[String], <<[Byte], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_oem. Objects of this class serve as prototypes for rows in queries. */
  class TOem(_tableTag: Tag) extends Table[TOemRow](_tableTag, "t_oem") {
    def * = (tOemId, tOemStatusFlag, tOemMOemId, tOemOrder, tOemCreateuser, tOemNote, tOemRdatetime, tOemUdatetime) <> (TOemRow.tupled, TOemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tOemId.?, tOemStatusFlag.?, tOemMOemId.?, tOemOrder.?, tOemCreateuser.?, tOemNote.?, tOemRdatetime.?, tOemUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TOemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_oem_id DBType(INT), AutoInc, PrimaryKey */
    val tOemId: Column[Int] = column[Int]("t_oem_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_oem_status_flag DBType(INT) */
    val tOemStatusFlag: Column[Int] = column[Int]("t_oem_status_flag")
    /** Database column t_oem_m_oem_id DBType(INT) */
    val tOemMOemId: Column[Int] = column[Int]("t_oem_m_oem_id")
    /** Database column t_oem_order DBType(TEXT), Length(65535,true) */
    val tOemOrder: Column[String] = column[String]("t_oem_order", O.Length(65535,varying=true))
    /** Database column t_oem_createuser DBType(TINYINT) */
    val tOemCreateuser: Column[Byte] = column[Byte]("t_oem_createuser")
    /** Database column t_oem_note DBType(TEXT), Length(65535,true) */
    val tOemNote: Column[String] = column[String]("t_oem_note", O.Length(65535,varying=true))
    /** Database column t_oem_rdatetime DBType(DATETIME) */
    val tOemRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_oem_rdatetime")
    /** Database column t_oem_udatetime DBType(DATETIME) */
    val tOemUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_oem_udatetime")
  }
  /** Collection-like TableQuery object for table TOem */
  lazy val TOem = new TableQuery(tag => new TOem(tag))
  
  /** Entity class storing rows of table TPaygentLog
   *  @param tPaygentLogId Database column t_paygent_log_id DBType(INT), AutoInc, PrimaryKey
   *  @param tPaygentLogTitle Database column t_paygent_log_title DBType(VARCHAR), Length(20,true)
   *  @param tPaygentLogData Database column t_paygent_log_data DBType(TEXT), Length(65535,true)
   *  @param tPaygentLogResult Database column t_paygent_log_result DBType(TEXT), Length(65535,true)
   *  @param tPaygentLogRdatetime Database column t_paygent_log_rdatetime DBType(DATETIME) */
  case class TPaygentLogRow(tPaygentLogId: Int, tPaygentLogTitle: String, tPaygentLogData: String, tPaygentLogResult: String, tPaygentLogRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TPaygentLogRow objects using plain SQL queries */
  implicit def GetResultTPaygentLogRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TPaygentLogRow] = GR{
    prs => import prs._
    TPaygentLogRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_paygent_log. Objects of this class serve as prototypes for rows in queries. */
  class TPaygentLog(_tableTag: Tag) extends Table[TPaygentLogRow](_tableTag, "t_paygent_log") {
    def * = (tPaygentLogId, tPaygentLogTitle, tPaygentLogData, tPaygentLogResult, tPaygentLogRdatetime) <> (TPaygentLogRow.tupled, TPaygentLogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tPaygentLogId.?, tPaygentLogTitle.?, tPaygentLogData.?, tPaygentLogResult.?, tPaygentLogRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TPaygentLogRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_paygent_log_id DBType(INT), AutoInc, PrimaryKey */
    val tPaygentLogId: Column[Int] = column[Int]("t_paygent_log_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_paygent_log_title DBType(VARCHAR), Length(20,true) */
    val tPaygentLogTitle: Column[String] = column[String]("t_paygent_log_title", O.Length(20,varying=true))
    /** Database column t_paygent_log_data DBType(TEXT), Length(65535,true) */
    val tPaygentLogData: Column[String] = column[String]("t_paygent_log_data", O.Length(65535,varying=true))
    /** Database column t_paygent_log_result DBType(TEXT), Length(65535,true) */
    val tPaygentLogResult: Column[String] = column[String]("t_paygent_log_result", O.Length(65535,varying=true))
    /** Database column t_paygent_log_rdatetime DBType(DATETIME) */
    val tPaygentLogRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_paygent_log_rdatetime")
  }
  /** Collection-like TableQuery object for table TPaygentLog */
  lazy val TPaygentLog = new TableQuery(tag => new TPaygentLog(tag))
  
  /** Entity class storing rows of table TPaypal
   *  @param tPaypalTJuchuId Database column t_paypal_t_juchu_id DBType(INT), PrimaryKey
   *  @param tPaypalToken Database column t_paypal_token DBType(VARCHAR), Length(20,true)
   *  @param tPaypalRequestInfoSet Database column t_paypal_request_info_set DBType(TEXT), Length(65535,true)
   *  @param tPaypalRequestInfoGet Database column t_paypal_request_info_get DBType(TEXT), Length(65535,true)
   *  @param tPaypalRequestInfoDo Database column t_paypal_request_info_do DBType(TEXT), Length(65535,true)
   *  @param tPaypalPayFlag Database column t_paypal_pay_flag DBType(CHAR), Length(1,false)
   *  @param tPaypalUpdateDatetime Database column t_paypal_update_datetime DBType(DATETIME) */
  case class TPaypalRow(tPaypalTJuchuId: Int, tPaypalToken: String, tPaypalRequestInfoSet: String, tPaypalRequestInfoGet: String, tPaypalRequestInfoDo: String, tPaypalPayFlag: String, tPaypalUpdateDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TPaypalRow objects using plain SQL queries */
  implicit def GetResultTPaypalRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TPaypalRow] = GR{
    prs => import prs._
    TPaypalRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_paypal. Objects of this class serve as prototypes for rows in queries. */
  class TPaypal(_tableTag: Tag) extends Table[TPaypalRow](_tableTag, "t_paypal") {
    def * = (tPaypalTJuchuId, tPaypalToken, tPaypalRequestInfoSet, tPaypalRequestInfoGet, tPaypalRequestInfoDo, tPaypalPayFlag, tPaypalUpdateDatetime) <> (TPaypalRow.tupled, TPaypalRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tPaypalTJuchuId.?, tPaypalToken.?, tPaypalRequestInfoSet.?, tPaypalRequestInfoGet.?, tPaypalRequestInfoDo.?, tPaypalPayFlag.?, tPaypalUpdateDatetime.?).shaped.<>({r=>import r._; _1.map(_=> TPaypalRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_paypal_t_juchu_id DBType(INT), PrimaryKey */
    val tPaypalTJuchuId: Column[Int] = column[Int]("t_paypal_t_juchu_id", O.PrimaryKey)
    /** Database column t_paypal_token DBType(VARCHAR), Length(20,true) */
    val tPaypalToken: Column[String] = column[String]("t_paypal_token", O.Length(20,varying=true))
    /** Database column t_paypal_request_info_set DBType(TEXT), Length(65535,true) */
    val tPaypalRequestInfoSet: Column[String] = column[String]("t_paypal_request_info_set", O.Length(65535,varying=true))
    /** Database column t_paypal_request_info_get DBType(TEXT), Length(65535,true) */
    val tPaypalRequestInfoGet: Column[String] = column[String]("t_paypal_request_info_get", O.Length(65535,varying=true))
    /** Database column t_paypal_request_info_do DBType(TEXT), Length(65535,true) */
    val tPaypalRequestInfoDo: Column[String] = column[String]("t_paypal_request_info_do", O.Length(65535,varying=true))
    /** Database column t_paypal_pay_flag DBType(CHAR), Length(1,false) */
    val tPaypalPayFlag: Column[String] = column[String]("t_paypal_pay_flag", O.Length(1,varying=false))
    /** Database column t_paypal_update_datetime DBType(DATETIME) */
    val tPaypalUpdateDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_paypal_update_datetime")
    
    /** Index over (tPaypalPayFlag) (database name t_paypal_pay_flag) */
    val index1 = index("t_paypal_pay_flag", tPaypalPayFlag)
  }
  /** Collection-like TableQuery object for table TPaypal */
  lazy val TPaypal = new TableQuery(tag => new TPaypal(tag))
  
  /** Entity class storing rows of table TPickupItem
   *  @param tPickupItemId Database column t_pickup_item_id DBType(INT), AutoInc, PrimaryKey
   *  @param tPickupItemMItemId Database column t_pickup_item_m_item_id DBType(INT)
   *  @param tPickupItemRdatetime Database column t_pickup_item_rdatetime DBType(DATETIME)
   *  @param tPickupItemUdatetime Database column t_pickup_item_udatetime DBType(DATETIME)
   *  @param tPickupItemRuser Database column t_pickup_item_ruser DBType(INT)
   *  @param tPickupItemUuser Database column t_pickup_item_uuser DBType(INT) */
  case class TPickupItemRow(tPickupItemId: Int, tPickupItemMItemId: Int, tPickupItemRdatetime: java.sql.Timestamp, tPickupItemUdatetime: java.sql.Timestamp, tPickupItemRuser: Int, tPickupItemUuser: Int)
  /** GetResult implicit for fetching TPickupItemRow objects using plain SQL queries */
  implicit def GetResultTPickupItemRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TPickupItemRow] = GR{
    prs => import prs._
    TPickupItemRow.tupled((<<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table t_pickup_item. Objects of this class serve as prototypes for rows in queries. */
  class TPickupItem(_tableTag: Tag) extends Table[TPickupItemRow](_tableTag, "t_pickup_item") {
    def * = (tPickupItemId, tPickupItemMItemId, tPickupItemRdatetime, tPickupItemUdatetime, tPickupItemRuser, tPickupItemUuser) <> (TPickupItemRow.tupled, TPickupItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tPickupItemId.?, tPickupItemMItemId.?, tPickupItemRdatetime.?, tPickupItemUdatetime.?, tPickupItemRuser.?, tPickupItemUuser.?).shaped.<>({r=>import r._; _1.map(_=> TPickupItemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_pickup_item_id DBType(INT), AutoInc, PrimaryKey */
    val tPickupItemId: Column[Int] = column[Int]("t_pickup_item_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_pickup_item_m_item_id DBType(INT) */
    val tPickupItemMItemId: Column[Int] = column[Int]("t_pickup_item_m_item_id")
    /** Database column t_pickup_item_rdatetime DBType(DATETIME) */
    val tPickupItemRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_pickup_item_rdatetime")
    /** Database column t_pickup_item_udatetime DBType(DATETIME) */
    val tPickupItemUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_pickup_item_udatetime")
    /** Database column t_pickup_item_ruser DBType(INT) */
    val tPickupItemRuser: Column[Int] = column[Int]("t_pickup_item_ruser")
    /** Database column t_pickup_item_uuser DBType(INT) */
    val tPickupItemUuser: Column[Int] = column[Int]("t_pickup_item_uuser")
  }
  /** Collection-like TableQuery object for table TPickupItem */
  lazy val TPickupItem = new TableQuery(tag => new TPickupItem(tag))
  
  /** Entity class storing rows of table TPoint
   *  @param tPointId Database column t_point_id DBType(INT), AutoInc, PrimaryKey
   *  @param tPointVoidFlag Database column t_point_void_flag DBType(INT)
   *  @param tPointMCustomerId Database column t_point_m_customer_id DBType(INT)
   *  @param tPointValue Database column t_point_value DBType(INT)
   *  @param tPointStartDatetime Database column t_point_start_datetime DBType(DATETIME)
   *  @param tPointLimitDatetime Database column t_point_limit_datetime DBType(DATETIME)
   *  @param tPointCreateDatetime Database column t_point_create_datetime DBType(DATETIME) */
  case class TPointRow(tPointId: Int, tPointVoidFlag: Int, tPointMCustomerId: Int, tPointValue: Int, tPointStartDatetime: java.sql.Timestamp, tPointLimitDatetime: java.sql.Timestamp, tPointCreateDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TPointRow objects using plain SQL queries */
  implicit def GetResultTPointRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TPointRow] = GR{
    prs => import prs._
    TPointRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_point. Objects of this class serve as prototypes for rows in queries. */
  class TPoint(_tableTag: Tag) extends Table[TPointRow](_tableTag, "t_point") {
    def * = (tPointId, tPointVoidFlag, tPointMCustomerId, tPointValue, tPointStartDatetime, tPointLimitDatetime, tPointCreateDatetime) <> (TPointRow.tupled, TPointRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tPointId.?, tPointVoidFlag.?, tPointMCustomerId.?, tPointValue.?, tPointStartDatetime.?, tPointLimitDatetime.?, tPointCreateDatetime.?).shaped.<>({r=>import r._; _1.map(_=> TPointRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_point_id DBType(INT), AutoInc, PrimaryKey */
    val tPointId: Column[Int] = column[Int]("t_point_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_point_void_flag DBType(INT) */
    val tPointVoidFlag: Column[Int] = column[Int]("t_point_void_flag")
    /** Database column t_point_m_customer_id DBType(INT) */
    val tPointMCustomerId: Column[Int] = column[Int]("t_point_m_customer_id")
    /** Database column t_point_value DBType(INT) */
    val tPointValue: Column[Int] = column[Int]("t_point_value")
    /** Database column t_point_start_datetime DBType(DATETIME) */
    val tPointStartDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_point_start_datetime")
    /** Database column t_point_limit_datetime DBType(DATETIME) */
    val tPointLimitDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_point_limit_datetime")
    /** Database column t_point_create_datetime DBType(DATETIME) */
    val tPointCreateDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_point_create_datetime")
  }
  /** Collection-like TableQuery object for table TPoint */
  lazy val TPoint = new TableQuery(tag => new TPoint(tag))
  
  /** Entity class storing rows of table TPointrate
   *  @param tPointrateId Database column t_pointrate_id DBType(INT), AutoInc, PrimaryKey
   *  @param tPointrateStartdate Database column t_pointrate_startdate DBType(DATETIME)
   *  @param tPointrateEnddate Database column t_pointrate_enddate DBType(DATETIME)
   *  @param tPointrateRate Database column t_pointrate_rate DBType(DECIMAL)
   *  @param tPointrateRuser Database column t_pointrate_ruser DBType(INT)
   *  @param tPointrateUuser Database column t_pointrate_uuser DBType(INT)
   *  @param tPointrateRdatetime Database column t_pointrate_rdatetime DBType(DATETIME)
   *  @param tPointrateUdatetime Database column t_pointrate_udatetime DBType(DATETIME) */
  case class TPointrateRow(tPointrateId: Int, tPointrateStartdate: java.sql.Timestamp, tPointrateEnddate: java.sql.Timestamp, tPointrateRate: scala.math.BigDecimal, tPointrateRuser: Int, tPointrateUuser: Int, tPointrateRdatetime: java.sql.Timestamp, tPointrateUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TPointrateRow objects using plain SQL queries */
  implicit def GetResultTPointrateRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp], e2: GR[scala.math.BigDecimal]): GR[TPointrateRow] = GR{
    prs => import prs._
    TPointrateRow.tupled((<<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[scala.math.BigDecimal], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_pointrate. Objects of this class serve as prototypes for rows in queries. */
  class TPointrate(_tableTag: Tag) extends Table[TPointrateRow](_tableTag, "t_pointrate") {
    def * = (tPointrateId, tPointrateStartdate, tPointrateEnddate, tPointrateRate, tPointrateRuser, tPointrateUuser, tPointrateRdatetime, tPointrateUdatetime) <> (TPointrateRow.tupled, TPointrateRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tPointrateId.?, tPointrateStartdate.?, tPointrateEnddate.?, tPointrateRate.?, tPointrateRuser.?, tPointrateUuser.?, tPointrateRdatetime.?, tPointrateUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TPointrateRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_pointrate_id DBType(INT), AutoInc, PrimaryKey */
    val tPointrateId: Column[Int] = column[Int]("t_pointrate_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_pointrate_startdate DBType(DATETIME) */
    val tPointrateStartdate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_pointrate_startdate")
    /** Database column t_pointrate_enddate DBType(DATETIME) */
    val tPointrateEnddate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_pointrate_enddate")
    /** Database column t_pointrate_rate DBType(DECIMAL) */
    val tPointrateRate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_pointrate_rate")
    /** Database column t_pointrate_ruser DBType(INT) */
    val tPointrateRuser: Column[Int] = column[Int]("t_pointrate_ruser")
    /** Database column t_pointrate_uuser DBType(INT) */
    val tPointrateUuser: Column[Int] = column[Int]("t_pointrate_uuser")
    /** Database column t_pointrate_rdatetime DBType(DATETIME) */
    val tPointrateRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_pointrate_rdatetime")
    /** Database column t_pointrate_udatetime DBType(DATETIME) */
    val tPointrateUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_pointrate_udatetime")
  }
  /** Collection-like TableQuery object for table TPointrate */
  lazy val TPointrate = new TableQuery(tag => new TPointrate(tag))
  
  /** Entity class storing rows of table TPointUse
   *  @param tPointUseId Database column t_point_use_id DBType(INT), AutoInc, PrimaryKey
   *  @param tPointUseMCustomerId Database column t_point_use_m_customer_id DBType(INT)
   *  @param tPointUseDatetime Database column t_point_use_datetime DBType(DATETIME)
   *  @param tPointUseValue Database column t_point_use_value DBType(INT)
   *  @param tPointUsePercent Database column t_point_use_percent DBType(DECIMAL)
   *  @param tPointUseTPointId Database column t_point_use_t_point_id DBType(INT)
   *  @param tPointUseTJuchuId Database column t_point_use_t_juchu_id DBType(INT) */
  case class TPointUseRow(tPointUseId: Int, tPointUseMCustomerId: Int, tPointUseDatetime: java.sql.Timestamp, tPointUseValue: Int, tPointUsePercent: scala.math.BigDecimal, tPointUseTPointId: Int, tPointUseTJuchuId: Int)
  /** GetResult implicit for fetching TPointUseRow objects using plain SQL queries */
  implicit def GetResultTPointUseRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp], e2: GR[scala.math.BigDecimal]): GR[TPointUseRow] = GR{
    prs => import prs._
    TPointUseRow.tupled((<<[Int], <<[Int], <<[java.sql.Timestamp], <<[Int], <<[scala.math.BigDecimal], <<[Int], <<[Int]))
  }
  /** Table description of table t_point_use. Objects of this class serve as prototypes for rows in queries. */
  class TPointUse(_tableTag: Tag) extends Table[TPointUseRow](_tableTag, "t_point_use") {
    def * = (tPointUseId, tPointUseMCustomerId, tPointUseDatetime, tPointUseValue, tPointUsePercent, tPointUseTPointId, tPointUseTJuchuId) <> (TPointUseRow.tupled, TPointUseRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tPointUseId.?, tPointUseMCustomerId.?, tPointUseDatetime.?, tPointUseValue.?, tPointUsePercent.?, tPointUseTPointId.?, tPointUseTJuchuId.?).shaped.<>({r=>import r._; _1.map(_=> TPointUseRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_point_use_id DBType(INT), AutoInc, PrimaryKey */
    val tPointUseId: Column[Int] = column[Int]("t_point_use_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_point_use_m_customer_id DBType(INT) */
    val tPointUseMCustomerId: Column[Int] = column[Int]("t_point_use_m_customer_id")
    /** Database column t_point_use_datetime DBType(DATETIME) */
    val tPointUseDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_point_use_datetime")
    /** Database column t_point_use_value DBType(INT) */
    val tPointUseValue: Column[Int] = column[Int]("t_point_use_value")
    /** Database column t_point_use_percent DBType(DECIMAL) */
    val tPointUsePercent: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_point_use_percent")
    /** Database column t_point_use_t_point_id DBType(INT) */
    val tPointUseTPointId: Column[Int] = column[Int]("t_point_use_t_point_id")
    /** Database column t_point_use_t_juchu_id DBType(INT) */
    val tPointUseTJuchuId: Column[Int] = column[Int]("t_point_use_t_juchu_id")
  }
  /** Collection-like TableQuery object for table TPointUse */
  lazy val TPointUse = new TableQuery(tag => new TPointUse(tag))
  
  /** Entity class storing rows of table TrackingSessionMaker
   *  @param trackingSessionMakerId Database column tracking_session_maker_id DBType(INT), AutoInc, PrimaryKey
   *  @param trackingSessionMakerMMakerId Database column tracking_session_maker_m_maker_id DBType(INT)
   *  @param trackingSessionMakerSession Database column tracking_session_maker_session DBType(VARCHAR), Length(50,true) */
  case class TrackingSessionMakerRow(trackingSessionMakerId: Int, trackingSessionMakerMMakerId: Int, trackingSessionMakerSession: String)
  /** GetResult implicit for fetching TrackingSessionMakerRow objects using plain SQL queries */
  implicit def GetResultTrackingSessionMakerRow(implicit e0: GR[Int], e1: GR[String]): GR[TrackingSessionMakerRow] = GR{
    prs => import prs._
    TrackingSessionMakerRow.tupled((<<[Int], <<[Int], <<[String]))
  }
  /** Table description of table tracking_session_maker. Objects of this class serve as prototypes for rows in queries. */
  class TrackingSessionMaker(_tableTag: Tag) extends Table[TrackingSessionMakerRow](_tableTag, "tracking_session_maker") {
    def * = (trackingSessionMakerId, trackingSessionMakerMMakerId, trackingSessionMakerSession) <> (TrackingSessionMakerRow.tupled, TrackingSessionMakerRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (trackingSessionMakerId.?, trackingSessionMakerMMakerId.?, trackingSessionMakerSession.?).shaped.<>({r=>import r._; _1.map(_=> TrackingSessionMakerRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column tracking_session_maker_id DBType(INT), AutoInc, PrimaryKey */
    val trackingSessionMakerId: Column[Int] = column[Int]("tracking_session_maker_id", O.AutoInc, O.PrimaryKey)
    /** Database column tracking_session_maker_m_maker_id DBType(INT) */
    val trackingSessionMakerMMakerId: Column[Int] = column[Int]("tracking_session_maker_m_maker_id")
    /** Database column tracking_session_maker_session DBType(VARCHAR), Length(50,true) */
    val trackingSessionMakerSession: Column[String] = column[String]("tracking_session_maker_session", O.Length(50,varying=true))
    
    /** Uniqueness Index over (trackingSessionMakerMMakerId,trackingSessionMakerSession) (database name tracking_session_maker_m_maker_2) */
    val index1 = index("tracking_session_maker_m_maker_2", (trackingSessionMakerMMakerId, trackingSessionMakerSession), unique=true)
    /** Index over (trackingSessionMakerMMakerId) (database name tracking_session_maker_m_maker_id) */
    val index2 = index("tracking_session_maker_m_maker_id", trackingSessionMakerMMakerId)
    /** Index over (trackingSessionMakerSession) (database name tracking_session_maker_session) */
    val index3 = index("tracking_session_maker_session", trackingSessionMakerSession)
  }
  /** Collection-like TableQuery object for table TrackingSessionMaker */
  lazy val TrackingSessionMaker = new TableQuery(tag => new TrackingSessionMaker(tag))
  
  /** Entity class storing rows of table TRanking
   *  @param tRankingId Database column t_ranking_id DBType(INT), AutoInc, PrimaryKey
   *  @param tRankingType Database column t_ranking_type DBType(VARCHAR), Length(45,true)
   *  @param tRankingMCategoryId Database column t_ranking_m_category_id DBType(INT)
   *  @param tRankingMItemId Database column t_ranking_m_item_id DBType(INT UNSIGNED)
   *  @param tRankingNumber Database column t_ranking_number DBType(INT) */
  case class TRankingRow(tRankingId: Int, tRankingType: String, tRankingMCategoryId: Int, tRankingMItemId: Int, tRankingNumber: Int)
  /** GetResult implicit for fetching TRankingRow objects using plain SQL queries */
  implicit def GetResultTRankingRow(implicit e0: GR[Int], e1: GR[String]): GR[TRankingRow] = GR{
    prs => import prs._
    TRankingRow.tupled((<<[Int], <<[String], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table t_ranking. Objects of this class serve as prototypes for rows in queries. */
  class TRanking(_tableTag: Tag) extends Table[TRankingRow](_tableTag, "t_ranking") {
    def * = (tRankingId, tRankingType, tRankingMCategoryId, tRankingMItemId, tRankingNumber) <> (TRankingRow.tupled, TRankingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tRankingId.?, tRankingType.?, tRankingMCategoryId.?, tRankingMItemId.?, tRankingNumber.?).shaped.<>({r=>import r._; _1.map(_=> TRankingRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_ranking_id DBType(INT), AutoInc, PrimaryKey */
    val tRankingId: Column[Int] = column[Int]("t_ranking_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_ranking_type DBType(VARCHAR), Length(45,true) */
    val tRankingType: Column[String] = column[String]("t_ranking_type", O.Length(45,varying=true))
    /** Database column t_ranking_m_category_id DBType(INT) */
    val tRankingMCategoryId: Column[Int] = column[Int]("t_ranking_m_category_id")
    /** Database column t_ranking_m_item_id DBType(INT UNSIGNED) */
    val tRankingMItemId: Column[Int] = column[Int]("t_ranking_m_item_id")
    /** Database column t_ranking_number DBType(INT) */
    val tRankingNumber: Column[Int] = column[Int]("t_ranking_number")
    
    /** Index over (tRankingType) (database name Index_2) */
    val index1 = index("Index_2", tRankingType)
  }
  /** Collection-like TableQuery object for table TRanking */
  lazy val TRanking = new TableQuery(tag => new TRanking(tag))
  
  /** Entity class storing rows of table TRefund
   *  @param tRefundId Database column t_refund_id DBType(INT), AutoInc, PrimaryKey
   *  @param tRefundTJuchuitemId Database column t_refund_t_juchuitem_id DBType(INT)
   *  @param tRefundCause Database column t_refund_cause DBType(TEXT), Length(65535,true)
   *  @param tRefundImage1 Database column t_refund_image_1 DBType(MEDIUMBLOB)
   *  @param tRefundImage2 Database column t_refund_image_2 DBType(MEDIUMBLOB)
   *  @param tRefundImage3 Database column t_refund_image_3 DBType(MEDIUMBLOB)
   *  @param tRefundImage4 Database column t_refund_image_4 DBType(MEDIUMBLOB)
   *  @param tRefundImage5 Database column t_refund_image_5 DBType(MEDIUMBLOB)
   *  @param tRefundQuantity Database column t_refund_quantity DBType(INT), Default(0)
   *  @param tRefundApplyDatetime Database column t_refund_apply_datetime DBType(DATETIME)
   *  @param tRefundProcessDatetime Database column t_refund_process_datetime DBType(DATETIME)
   *  @param tRefundResult Database column t_refund_result DBType(TEXT), Length(65535,true)
   *  @param tRefundResultDatetime Database column t_refund_result_datetime DBType(DATETIME) */
  case class TRefundRow(tRefundId: Int, tRefundTJuchuitemId: Int, tRefundCause: String, tRefundImage1: java.sql.Blob, tRefundImage2: java.sql.Blob, tRefundImage3: java.sql.Blob, tRefundImage4: java.sql.Blob, tRefundImage5: java.sql.Blob, tRefundQuantity: Int = 0, tRefundApplyDatetime: java.sql.Timestamp, tRefundProcessDatetime: java.sql.Timestamp, tRefundResult: String, tRefundResultDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TRefundRow objects using plain SQL queries */
  implicit def GetResultTRefundRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Blob], e3: GR[java.sql.Timestamp]): GR[TRefundRow] = GR{
    prs => import prs._
    TRefundRow.tupled((<<[Int], <<[Int], <<[String], <<[java.sql.Blob], <<[java.sql.Blob], <<[java.sql.Blob], <<[java.sql.Blob], <<[java.sql.Blob], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_refund. Objects of this class serve as prototypes for rows in queries. */
  class TRefund(_tableTag: Tag) extends Table[TRefundRow](_tableTag, "t_refund") {
    def * = (tRefundId, tRefundTJuchuitemId, tRefundCause, tRefundImage1, tRefundImage2, tRefundImage3, tRefundImage4, tRefundImage5, tRefundQuantity, tRefundApplyDatetime, tRefundProcessDatetime, tRefundResult, tRefundResultDatetime) <> (TRefundRow.tupled, TRefundRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tRefundId.?, tRefundTJuchuitemId.?, tRefundCause.?, tRefundImage1.?, tRefundImage2.?, tRefundImage3.?, tRefundImage4.?, tRefundImage5.?, tRefundQuantity.?, tRefundApplyDatetime.?, tRefundProcessDatetime.?, tRefundResult.?, tRefundResultDatetime.?).shaped.<>({r=>import r._; _1.map(_=> TRefundRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_refund_id DBType(INT), AutoInc, PrimaryKey */
    val tRefundId: Column[Int] = column[Int]("t_refund_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_refund_t_juchuitem_id DBType(INT) */
    val tRefundTJuchuitemId: Column[Int] = column[Int]("t_refund_t_juchuitem_id")
    /** Database column t_refund_cause DBType(TEXT), Length(65535,true) */
    val tRefundCause: Column[String] = column[String]("t_refund_cause", O.Length(65535,varying=true))
    /** Database column t_refund_image_1 DBType(MEDIUMBLOB) */
    val tRefundImage1: Column[java.sql.Blob] = column[java.sql.Blob]("t_refund_image_1")
    /** Database column t_refund_image_2 DBType(MEDIUMBLOB) */
    val tRefundImage2: Column[java.sql.Blob] = column[java.sql.Blob]("t_refund_image_2")
    /** Database column t_refund_image_3 DBType(MEDIUMBLOB) */
    val tRefundImage3: Column[java.sql.Blob] = column[java.sql.Blob]("t_refund_image_3")
    /** Database column t_refund_image_4 DBType(MEDIUMBLOB) */
    val tRefundImage4: Column[java.sql.Blob] = column[java.sql.Blob]("t_refund_image_4")
    /** Database column t_refund_image_5 DBType(MEDIUMBLOB) */
    val tRefundImage5: Column[java.sql.Blob] = column[java.sql.Blob]("t_refund_image_5")
    /** Database column t_refund_quantity DBType(INT), Default(0) */
    val tRefundQuantity: Column[Int] = column[Int]("t_refund_quantity", O.Default(0))
    /** Database column t_refund_apply_datetime DBType(DATETIME) */
    val tRefundApplyDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_refund_apply_datetime")
    /** Database column t_refund_process_datetime DBType(DATETIME) */
    val tRefundProcessDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_refund_process_datetime")
    /** Database column t_refund_result DBType(TEXT), Length(65535,true) */
    val tRefundResult: Column[String] = column[String]("t_refund_result", O.Length(65535,varying=true))
    /** Database column t_refund_result_datetime DBType(DATETIME) */
    val tRefundResultDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_refund_result_datetime")
  }
  /** Collection-like TableQuery object for table TRefund */
  lazy val TRefund = new TableQuery(tag => new TRefund(tag))
  
  /** Entity class storing rows of table TRefundResult
   *  @param tRefundResultId Database column t_refund_result_id DBType(INT), AutoInc, PrimaryKey
   *  @param tRefundResultRefuseFlg Database column t_refund_result_refuse_flg DBType(INT), Default(Some(0))
   *  @param tRefundResultAmount Database column t_refund_result_amount DBType(DECIMAL)
   *  @param tRefundResultApplyAmount Database column t_refund_result_apply_amount DBType(DECIMAL)
   *  @param tRefundResultDatetime Database column t_refund_result_datetime DBType(DATETIME)
   *  @param tRefundResultAcceptDatetime Database column t_refund_result_accept_datetime DBType(DATETIME)
   *  @param tRefundResultMMakerId Database column t_refund_result_m_maker_id DBType(INT)
   *  @param tRefundResultTJuchuId Database column t_refund_result_t_juchu_id DBType(INT) */
  case class TRefundResultRow(tRefundResultId: Int, tRefundResultRefuseFlg: Option[Int] = Some(0), tRefundResultAmount: scala.math.BigDecimal, tRefundResultApplyAmount: scala.math.BigDecimal, tRefundResultDatetime: java.sql.Timestamp, tRefundResultAcceptDatetime: java.sql.Timestamp, tRefundResultMMakerId: Int, tRefundResultTJuchuId: Int)
  /** GetResult implicit for fetching TRefundResultRow objects using plain SQL queries */
  implicit def GetResultTRefundResultRow(implicit e0: GR[Int], e1: GR[Option[Int]], e2: GR[scala.math.BigDecimal], e3: GR[java.sql.Timestamp]): GR[TRefundResultRow] = GR{
    prs => import prs._
    TRefundResultRow.tupled((<<[Int], <<?[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table t_refund_result. Objects of this class serve as prototypes for rows in queries. */
  class TRefundResult(_tableTag: Tag) extends Table[TRefundResultRow](_tableTag, "t_refund_result") {
    def * = (tRefundResultId, tRefundResultRefuseFlg, tRefundResultAmount, tRefundResultApplyAmount, tRefundResultDatetime, tRefundResultAcceptDatetime, tRefundResultMMakerId, tRefundResultTJuchuId) <> (TRefundResultRow.tupled, TRefundResultRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tRefundResultId.?, tRefundResultRefuseFlg, tRefundResultAmount.?, tRefundResultApplyAmount.?, tRefundResultDatetime.?, tRefundResultAcceptDatetime.?, tRefundResultMMakerId.?, tRefundResultTJuchuId.?).shaped.<>({r=>import r._; _1.map(_=> TRefundResultRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_refund_result_id DBType(INT), AutoInc, PrimaryKey */
    val tRefundResultId: Column[Int] = column[Int]("t_refund_result_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_refund_result_refuse_flg DBType(INT), Default(Some(0)) */
    val tRefundResultRefuseFlg: Column[Option[Int]] = column[Option[Int]]("t_refund_result_refuse_flg", O.Default(Some(0)))
    /** Database column t_refund_result_amount DBType(DECIMAL) */
    val tRefundResultAmount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_refund_result_amount")
    /** Database column t_refund_result_apply_amount DBType(DECIMAL) */
    val tRefundResultApplyAmount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_refund_result_apply_amount")
    /** Database column t_refund_result_datetime DBType(DATETIME) */
    val tRefundResultDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_refund_result_datetime")
    /** Database column t_refund_result_accept_datetime DBType(DATETIME) */
    val tRefundResultAcceptDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_refund_result_accept_datetime")
    /** Database column t_refund_result_m_maker_id DBType(INT) */
    val tRefundResultMMakerId: Column[Int] = column[Int]("t_refund_result_m_maker_id")
    /** Database column t_refund_result_t_juchu_id DBType(INT) */
    val tRefundResultTJuchuId: Column[Int] = column[Int]("t_refund_result_t_juchu_id")
  }
  /** Collection-like TableQuery object for table TRefundResult */
  lazy val TRefundResult = new TableQuery(tag => new TRefundResult(tag))
  
  /** Entity class storing rows of table TReview
   *  @param tReviewId Database column t_review_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param tReviewVoidFlag Database column t_review_void_flag DBType(TINYINT)
   *  @param tReviewTJuchuNumber Database column t_review_t_juchu_number DBType(VARCHAR), Length(25,true)
   *  @param tReviewMMakerId Database column t_review_m_maker_id DBType(INT)
   *  @param tReviewVariations Database column t_review_variations DBType(DECIMAL)
   *  @param tReviewQuality Database column t_review_quality DBType(DECIMAL)
   *  @param tReviewPicture Database column t_review_picture DBType(DECIMAL)
   *  @param tReviewEvaluate Database column t_review_evaluate DBType(TEXT), Length(65535,true)
   *  @param tReviewMakerReply Database column t_review_maker_reply DBType(TEXT), Length(65535,true)
   *  @param tReviewCreateDatetime Database column t_review_create_datetime DBType(DATETIME)
   *  @param tReviewUpdateDatetime Database column t_review_update_datetime DBType(DATETIME) */
  case class TReviewRow(tReviewId: Int, tReviewVoidFlag: Byte, tReviewTJuchuNumber: String, tReviewMMakerId: Int, tReviewVariations: scala.math.BigDecimal, tReviewQuality: scala.math.BigDecimal, tReviewPicture: scala.math.BigDecimal, tReviewEvaluate: String, tReviewMakerReply: String, tReviewCreateDatetime: java.sql.Timestamp, tReviewUpdateDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TReviewRow objects using plain SQL queries */
  implicit def GetResultTReviewRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[scala.math.BigDecimal], e4: GR[java.sql.Timestamp]): GR[TReviewRow] = GR{
    prs => import prs._
    TReviewRow.tupled((<<[Int], <<[Byte], <<[String], <<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_review. Objects of this class serve as prototypes for rows in queries. */
  class TReview(_tableTag: Tag) extends Table[TReviewRow](_tableTag, "t_review") {
    def * = (tReviewId, tReviewVoidFlag, tReviewTJuchuNumber, tReviewMMakerId, tReviewVariations, tReviewQuality, tReviewPicture, tReviewEvaluate, tReviewMakerReply, tReviewCreateDatetime, tReviewUpdateDatetime) <> (TReviewRow.tupled, TReviewRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tReviewId.?, tReviewVoidFlag.?, tReviewTJuchuNumber.?, tReviewMMakerId.?, tReviewVariations.?, tReviewQuality.?, tReviewPicture.?, tReviewEvaluate.?, tReviewMakerReply.?, tReviewCreateDatetime.?, tReviewUpdateDatetime.?).shaped.<>({r=>import r._; _1.map(_=> TReviewRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_review_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tReviewId: Column[Int] = column[Int]("t_review_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_review_void_flag DBType(TINYINT) */
    val tReviewVoidFlag: Column[Byte] = column[Byte]("t_review_void_flag")
    /** Database column t_review_t_juchu_number DBType(VARCHAR), Length(25,true) */
    val tReviewTJuchuNumber: Column[String] = column[String]("t_review_t_juchu_number", O.Length(25,varying=true))
    /** Database column t_review_m_maker_id DBType(INT) */
    val tReviewMMakerId: Column[Int] = column[Int]("t_review_m_maker_id")
    /** Database column t_review_variations DBType(DECIMAL) */
    val tReviewVariations: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_review_variations")
    /** Database column t_review_quality DBType(DECIMAL) */
    val tReviewQuality: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_review_quality")
    /** Database column t_review_picture DBType(DECIMAL) */
    val tReviewPicture: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_review_picture")
    /** Database column t_review_evaluate DBType(TEXT), Length(65535,true) */
    val tReviewEvaluate: Column[String] = column[String]("t_review_evaluate", O.Length(65535,varying=true))
    /** Database column t_review_maker_reply DBType(TEXT), Length(65535,true) */
    val tReviewMakerReply: Column[String] = column[String]("t_review_maker_reply", O.Length(65535,varying=true))
    /** Database column t_review_create_datetime DBType(DATETIME) */
    val tReviewCreateDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_review_create_datetime")
    /** Database column t_review_update_datetime DBType(DATETIME) */
    val tReviewUpdateDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_review_update_datetime")
    
    /** Uniqueness Index over (tReviewTJuchuNumber,tReviewMMakerId) (database name Index_2) */
    val index1 = index("Index_2", (tReviewTJuchuNumber, tReviewMMakerId), unique=true)
  }
  /** Collection-like TableQuery object for table TReview */
  lazy val TReview = new TableQuery(tag => new TReview(tag))
  
  /** Entity class storing rows of table TReviewMaker
   *  @param tReviewMakerId Database column t_review_maker_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param tReviewMakerMMakerId Database column t_review_maker_m_maker_id DBType(INT UNSIGNED)
   *  @param tReviewMakerVariations Database column t_review_maker_variations DBType(DECIMAL)
   *  @param tReviewMakerQuality Database column t_review_maker_quality DBType(DECIMAL)
   *  @param tReviewMakerPicture Database column t_review_maker_picture DBType(DECIMAL) */
  case class TReviewMakerRow(tReviewMakerId: Int, tReviewMakerMMakerId: Int, tReviewMakerVariations: scala.math.BigDecimal, tReviewMakerQuality: scala.math.BigDecimal, tReviewMakerPicture: scala.math.BigDecimal)
  /** GetResult implicit for fetching TReviewMakerRow objects using plain SQL queries */
  implicit def GetResultTReviewMakerRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal]): GR[TReviewMakerRow] = GR{
    prs => import prs._
    TReviewMakerRow.tupled((<<[Int], <<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal]))
  }
  /** Table description of table t_review_maker. Objects of this class serve as prototypes for rows in queries. */
  class TReviewMaker(_tableTag: Tag) extends Table[TReviewMakerRow](_tableTag, "t_review_maker") {
    def * = (tReviewMakerId, tReviewMakerMMakerId, tReviewMakerVariations, tReviewMakerQuality, tReviewMakerPicture) <> (TReviewMakerRow.tupled, TReviewMakerRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tReviewMakerId.?, tReviewMakerMMakerId.?, tReviewMakerVariations.?, tReviewMakerQuality.?, tReviewMakerPicture.?).shaped.<>({r=>import r._; _1.map(_=> TReviewMakerRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_review_maker_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tReviewMakerId: Column[Int] = column[Int]("t_review_maker_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_review_maker_m_maker_id DBType(INT UNSIGNED) */
    val tReviewMakerMMakerId: Column[Int] = column[Int]("t_review_maker_m_maker_id")
    /** Database column t_review_maker_variations DBType(DECIMAL) */
    val tReviewMakerVariations: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_review_maker_variations")
    /** Database column t_review_maker_quality DBType(DECIMAL) */
    val tReviewMakerQuality: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_review_maker_quality")
    /** Database column t_review_maker_picture DBType(DECIMAL) */
    val tReviewMakerPicture: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_review_maker_picture")
    
    /** Uniqueness Index over (tReviewMakerMMakerId) (database name Index_2) */
    val index1 = index("Index_2", tReviewMakerMMakerId, unique=true)
  }
  /** Collection-like TableQuery object for table TReviewMaker */
  lazy val TReviewMaker = new TableQuery(tag => new TReviewMaker(tag))
  
  /** Entity class storing rows of table TSalesActivity
   *  @param tSalesActivityId Database column t_sales_activity_id DBType(INT), AutoInc, PrimaryKey
   *  @param tSalesActivityTitle Database column t_sales_activity_title DBType(VARCHAR), Length(250,true)
   *  @param tSalesActivityDiscountFlag Database column t_sales_activity_discount_flag DBType(TINYINT), Default(0)
   *  @param tSalesActivityDiscountval Database column t_sales_activity_discountval DBType(VARCHAR), Length(50,true)
   *  @param tSalesActivityStartDate Database column t_sales_activity_start_date DBType(DATETIME)
   *  @param tSalesActivityEndDate Database column t_sales_activity_end_date DBType(DATETIME)
   *  @param tSalesActivityAddDate Database column t_sales_activity_add_date DBType(DATETIME)
   *  @param tSalesActivityStartType Database column t_sales_activity_start_type DBType(TINYINT), Default(0) */
  case class TSalesActivityRow(tSalesActivityId: Int, tSalesActivityTitle: String, tSalesActivityDiscountFlag: Byte = 0, tSalesActivityDiscountval: String, tSalesActivityStartDate: java.sql.Timestamp, tSalesActivityEndDate: java.sql.Timestamp, tSalesActivityAddDate: java.sql.Timestamp, tSalesActivityStartType: Byte = 0)
  /** GetResult implicit for fetching TSalesActivityRow objects using plain SQL queries */
  implicit def GetResultTSalesActivityRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Byte], e3: GR[java.sql.Timestamp]): GR[TSalesActivityRow] = GR{
    prs => import prs._
    TSalesActivityRow.tupled((<<[Int], <<[String], <<[Byte], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Byte]))
  }
  /** Table description of table t_sales_activity. Objects of this class serve as prototypes for rows in queries. */
  class TSalesActivity(_tableTag: Tag) extends Table[TSalesActivityRow](_tableTag, "t_sales_activity") {
    def * = (tSalesActivityId, tSalesActivityTitle, tSalesActivityDiscountFlag, tSalesActivityDiscountval, tSalesActivityStartDate, tSalesActivityEndDate, tSalesActivityAddDate, tSalesActivityStartType) <> (TSalesActivityRow.tupled, TSalesActivityRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tSalesActivityId.?, tSalesActivityTitle.?, tSalesActivityDiscountFlag.?, tSalesActivityDiscountval.?, tSalesActivityStartDate.?, tSalesActivityEndDate.?, tSalesActivityAddDate.?, tSalesActivityStartType.?).shaped.<>({r=>import r._; _1.map(_=> TSalesActivityRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_sales_activity_id DBType(INT), AutoInc, PrimaryKey */
    val tSalesActivityId: Column[Int] = column[Int]("t_sales_activity_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_sales_activity_title DBType(VARCHAR), Length(250,true) */
    val tSalesActivityTitle: Column[String] = column[String]("t_sales_activity_title", O.Length(250,varying=true))
    /** Database column t_sales_activity_discount_flag DBType(TINYINT), Default(0) */
    val tSalesActivityDiscountFlag: Column[Byte] = column[Byte]("t_sales_activity_discount_flag", O.Default(0))
    /** Database column t_sales_activity_discountval DBType(VARCHAR), Length(50,true) */
    val tSalesActivityDiscountval: Column[String] = column[String]("t_sales_activity_discountval", O.Length(50,varying=true))
    /** Database column t_sales_activity_start_date DBType(DATETIME) */
    val tSalesActivityStartDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_sales_activity_start_date")
    /** Database column t_sales_activity_end_date DBType(DATETIME) */
    val tSalesActivityEndDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_sales_activity_end_date")
    /** Database column t_sales_activity_add_date DBType(DATETIME) */
    val tSalesActivityAddDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_sales_activity_add_date")
    /** Database column t_sales_activity_start_type DBType(TINYINT), Default(0) */
    val tSalesActivityStartType: Column[Byte] = column[Byte]("t_sales_activity_start_type", O.Default(0))
  }
  /** Collection-like TableQuery object for table TSalesActivity */
  lazy val TSalesActivity = new TableQuery(tag => new TSalesActivity(tag))
  
  /** Entity class storing rows of table TSalesActivityItem
   *  @param tSalesActivityItemId Database column t_sales_activity_item_id DBType(INT), AutoInc, PrimaryKey
   *  @param tSalesActivityItemTSalesActivityId Database column t_sales_activity_item_t_sales_activity_id DBType(INT)
   *  @param tSalesActivityItemMItemId Database column t_sales_activity_item_m_item_id DBType(INT)
   *  @param tSalesActivityItemMMakerId Database column t_sales_activity_item_m_maker_id DBType(INT)
   *  @param tSalesActivityItemMItemMinPrice Database column t_sales_activity_item_m_item_min_price DBType(DECIMAL)
   *  @param tSalesActivityItemSalesPrice Database column t_sales_activity_item_sales_price DBType(DECIMAL)
   *  @param tSalesActivityItemDiscountFlag Database column t_sales_activity_item_discount_flag DBType(TINYINT), Default(0)
   *  @param tSalesActivityItemDiscountval Database column t_sales_activity_item_discountval DBType(VARCHAR), Length(50,true)
   *  @param tSalesActivityItemInFlag Database column t_sales_activity_item_in_flag DBType(TINYINT), Default(0)
   *  @param tSalesActivityItemAdddate Database column t_sales_activity_item_adddate DBType(DATETIME) */
  case class TSalesActivityItemRow(tSalesActivityItemId: Int, tSalesActivityItemTSalesActivityId: Int, tSalesActivityItemMItemId: Int, tSalesActivityItemMMakerId: Int, tSalesActivityItemMItemMinPrice: scala.math.BigDecimal, tSalesActivityItemSalesPrice: scala.math.BigDecimal, tSalesActivityItemDiscountFlag: Byte = 0, tSalesActivityItemDiscountval: String, tSalesActivityItemInFlag: Byte = 0, tSalesActivityItemAdddate: java.sql.Timestamp)
  /** GetResult implicit for fetching TSalesActivityItemRow objects using plain SQL queries */
  implicit def GetResultTSalesActivityItemRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[Byte], e3: GR[String], e4: GR[java.sql.Timestamp]): GR[TSalesActivityItemRow] = GR{
    prs => import prs._
    TSalesActivityItemRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[Byte], <<[String], <<[Byte], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_sales_activity_item. Objects of this class serve as prototypes for rows in queries. */
  class TSalesActivityItem(_tableTag: Tag) extends Table[TSalesActivityItemRow](_tableTag, "t_sales_activity_item") {
    def * = (tSalesActivityItemId, tSalesActivityItemTSalesActivityId, tSalesActivityItemMItemId, tSalesActivityItemMMakerId, tSalesActivityItemMItemMinPrice, tSalesActivityItemSalesPrice, tSalesActivityItemDiscountFlag, tSalesActivityItemDiscountval, tSalesActivityItemInFlag, tSalesActivityItemAdddate) <> (TSalesActivityItemRow.tupled, TSalesActivityItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tSalesActivityItemId.?, tSalesActivityItemTSalesActivityId.?, tSalesActivityItemMItemId.?, tSalesActivityItemMMakerId.?, tSalesActivityItemMItemMinPrice.?, tSalesActivityItemSalesPrice.?, tSalesActivityItemDiscountFlag.?, tSalesActivityItemDiscountval.?, tSalesActivityItemInFlag.?, tSalesActivityItemAdddate.?).shaped.<>({r=>import r._; _1.map(_=> TSalesActivityItemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_sales_activity_item_id DBType(INT), AutoInc, PrimaryKey */
    val tSalesActivityItemId: Column[Int] = column[Int]("t_sales_activity_item_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_sales_activity_item_t_sales_activity_id DBType(INT) */
    val tSalesActivityItemTSalesActivityId: Column[Int] = column[Int]("t_sales_activity_item_t_sales_activity_id")
    /** Database column t_sales_activity_item_m_item_id DBType(INT) */
    val tSalesActivityItemMItemId: Column[Int] = column[Int]("t_sales_activity_item_m_item_id")
    /** Database column t_sales_activity_item_m_maker_id DBType(INT) */
    val tSalesActivityItemMMakerId: Column[Int] = column[Int]("t_sales_activity_item_m_maker_id")
    /** Database column t_sales_activity_item_m_item_min_price DBType(DECIMAL) */
    val tSalesActivityItemMItemMinPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_sales_activity_item_m_item_min_price")
    /** Database column t_sales_activity_item_sales_price DBType(DECIMAL) */
    val tSalesActivityItemSalesPrice: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_sales_activity_item_sales_price")
    /** Database column t_sales_activity_item_discount_flag DBType(TINYINT), Default(0) */
    val tSalesActivityItemDiscountFlag: Column[Byte] = column[Byte]("t_sales_activity_item_discount_flag", O.Default(0))
    /** Database column t_sales_activity_item_discountval DBType(VARCHAR), Length(50,true) */
    val tSalesActivityItemDiscountval: Column[String] = column[String]("t_sales_activity_item_discountval", O.Length(50,varying=true))
    /** Database column t_sales_activity_item_in_flag DBType(TINYINT), Default(0) */
    val tSalesActivityItemInFlag: Column[Byte] = column[Byte]("t_sales_activity_item_in_flag", O.Default(0))
    /** Database column t_sales_activity_item_adddate DBType(DATETIME) */
    val tSalesActivityItemAdddate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_sales_activity_item_adddate")
  }
  /** Collection-like TableQuery object for table TSalesActivityItem */
  lazy val TSalesActivityItem = new TableQuery(tag => new TSalesActivityItem(tag))
  
  /** Row type of table TShukka */
  type TShukkaRow = HCons[Int,HCons[String,HCons[String,HCons[Int,HCons[Int,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Date,HCons[Int,HCons[scala.math.BigDecimal,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[scala.math.BigDecimal,HCons[Int,HCons[String,HCons[String,HCons[Option[String],HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[java.sql.Timestamp,HCons[Boolean,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for TShukkaRow providing default values if available in the database schema. */
  def TShukkaRow(tShukkaId: Int, tShukkaNumber: String, tShukkaPieces: String, tShukkaMPlanId: Int, tShukkaCustomId: Int, tShukkaShukaDatetime: java.sql.Timestamp, tShukkaPickingDatetime: java.sql.Timestamp, tShukkaFixDatetime: java.sql.Timestamp, tShukkaSlipnoDatetime: java.sql.Timestamp, tShukkaHsCodeDatetime: java.sql.Timestamp, tShukkaPackingDatetime: java.sql.Timestamp, tShukkaAwbCodeDatetime: java.sql.Timestamp, tShukkaHsInvoiceDatetime: java.sql.Timestamp, tShukkaInvoiceDatetime: java.sql.Timestamp, tShukkaSlipDatetime: java.sql.Timestamp, tShukkaDatetime: java.sql.Timestamp, tShukkaPickupDate: java.sql.Date, tShukkaPrice: Int, tShukkaPriceDoller: scala.math.BigDecimal, tShukkaTax: Int, tShukkaNebiki: Int, tShukkaDeliveryCharges: Int, tShukkaTotal: Int, tShukkaTotalDoller: scala.math.BigDecimal, tShukkaWeightTotal: Int, tShukkaBox: String, tShukkaNote: String, tShukkaStatu: Option[String] = None, tShukkaStatuDatetime: java.sql.Timestamp, tShukkaMailDatetime: java.sql.Timestamp, tShukkaDhlOrderDatetime: java.sql.Timestamp, tShukkaDeliveredFrom: Boolean = false): TShukkaRow = {
    tShukkaId :: tShukkaNumber :: tShukkaPieces :: tShukkaMPlanId :: tShukkaCustomId :: tShukkaShukaDatetime :: tShukkaPickingDatetime :: tShukkaFixDatetime :: tShukkaSlipnoDatetime :: tShukkaHsCodeDatetime :: tShukkaPackingDatetime :: tShukkaAwbCodeDatetime :: tShukkaHsInvoiceDatetime :: tShukkaInvoiceDatetime :: tShukkaSlipDatetime :: tShukkaDatetime :: tShukkaPickupDate :: tShukkaPrice :: tShukkaPriceDoller :: tShukkaTax :: tShukkaNebiki :: tShukkaDeliveryCharges :: tShukkaTotal :: tShukkaTotalDoller :: tShukkaWeightTotal :: tShukkaBox :: tShukkaNote :: tShukkaStatu :: tShukkaStatuDatetime :: tShukkaMailDatetime :: tShukkaDhlOrderDatetime :: tShukkaDeliveredFrom :: HNil
  }
  /** GetResult implicit for fetching TShukkaRow objects using plain SQL queries */
  implicit def GetResultTShukkaRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[java.sql.Date], e4: GR[scala.math.BigDecimal], e5: GR[Option[String]], e6: GR[Boolean]): GR[TShukkaRow] = GR{
    prs => import prs._
    <<[Int] :: <<[String] :: <<[String] :: <<[Int] :: <<[Int] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Date] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[scala.math.BigDecimal] :: <<[Int] :: <<[String] :: <<[String] :: <<?[String] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[java.sql.Timestamp] :: <<[Boolean] :: HNil
  }
  /** Table description of table t_shukka. Objects of this class serve as prototypes for rows in queries. */
  class TShukka(_tableTag: Tag) extends Table[TShukkaRow](_tableTag, "t_shukka") {
    def * = tShukkaId :: tShukkaNumber :: tShukkaPieces :: tShukkaMPlanId :: tShukkaCustomId :: tShukkaShukaDatetime :: tShukkaPickingDatetime :: tShukkaFixDatetime :: tShukkaSlipnoDatetime :: tShukkaHsCodeDatetime :: tShukkaPackingDatetime :: tShukkaAwbCodeDatetime :: tShukkaHsInvoiceDatetime :: tShukkaInvoiceDatetime :: tShukkaSlipDatetime :: tShukkaDatetime :: tShukkaPickupDate :: tShukkaPrice :: tShukkaPriceDoller :: tShukkaTax :: tShukkaNebiki :: tShukkaDeliveryCharges :: tShukkaTotal :: tShukkaTotalDoller :: tShukkaWeightTotal :: tShukkaBox :: tShukkaNote :: tShukkaStatu :: tShukkaStatuDatetime :: tShukkaMailDatetime :: tShukkaDhlOrderDatetime :: tShukkaDeliveredFrom :: HNil
    
    /** Database column t_shukka_id DBType(INT), AutoInc, PrimaryKey */
    val tShukkaId: Column[Int] = column[Int]("t_shukka_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_shukka_number DBType(VARCHAR), Length(20,true) */
    val tShukkaNumber: Column[String] = column[String]("t_shukka_number", O.Length(20,varying=true))
    /** Database column t_shukka_pieces DBType(VARCHAR), Length(255,true) */
    val tShukkaPieces: Column[String] = column[String]("t_shukka_pieces", O.Length(255,varying=true))
    /** Database column t_shukka_m_plan_id DBType(INT) */
    val tShukkaMPlanId: Column[Int] = column[Int]("t_shukka_m_plan_id")
    /** Database column t_shukka_custom_id DBType(INT) */
    val tShukkaCustomId: Column[Int] = column[Int]("t_shukka_custom_id")
    /** Database column t_shukka_shuka_datetime DBType(DATETIME) */
    val tShukkaShukaDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_shuka_datetime")
    /** Database column t_shukka_picking_datetime DBType(DATETIME) */
    val tShukkaPickingDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_picking_datetime")
    /** Database column t_shukka_fix_datetime DBType(DATETIME) */
    val tShukkaFixDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_fix_datetime")
    /** Database column t_shukka_slipno_datetime DBType(DATETIME) */
    val tShukkaSlipnoDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_slipno_datetime")
    /** Database column t_shukka_hs_code_datetime DBType(DATETIME) */
    val tShukkaHsCodeDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_hs_code_datetime")
    /** Database column t_shukka_packing_datetime DBType(DATETIME) */
    val tShukkaPackingDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_packing_datetime")
    /** Database column t_shukka_awb_code_datetime DBType(DATETIME) */
    val tShukkaAwbCodeDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_awb_code_datetime")
    /** Database column t_shukka_hs_invoice_datetime DBType(DATETIME) */
    val tShukkaHsInvoiceDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_hs_invoice_datetime")
    /** Database column t_shukka_invoice_datetime DBType(DATETIME) */
    val tShukkaInvoiceDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_invoice_datetime")
    /** Database column t_shukka_slip_datetime DBType(DATETIME) */
    val tShukkaSlipDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_slip_datetime")
    /** Database column t_shukka_datetime DBType(DATETIME) */
    val tShukkaDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_datetime")
    /** Database column t_shukka_pickup_date DBType(DATE) */
    val tShukkaPickupDate: Column[java.sql.Date] = column[java.sql.Date]("t_shukka_pickup_date")
    /** Database column t_shukka_price DBType(INT) */
    val tShukkaPrice: Column[Int] = column[Int]("t_shukka_price")
    /** Database column t_shukka_price_doller DBType(DECIMAL) */
    val tShukkaPriceDoller: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_shukka_price_doller")
    /** Database column t_shukka_tax DBType(INT) */
    val tShukkaTax: Column[Int] = column[Int]("t_shukka_tax")
    /** Database column t_shukka_nebiki DBType(INT) */
    val tShukkaNebiki: Column[Int] = column[Int]("t_shukka_nebiki")
    /** Database column t_shukka_delivery_charges DBType(INT) */
    val tShukkaDeliveryCharges: Column[Int] = column[Int]("t_shukka_delivery_charges")
    /** Database column t_shukka_total DBType(INT) */
    val tShukkaTotal: Column[Int] = column[Int]("t_shukka_total")
    /** Database column t_shukka_total_doller DBType(DECIMAL) */
    val tShukkaTotalDoller: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_shukka_total_doller")
    /** Database column t_shukka_weight_total DBType(INT) */
    val tShukkaWeightTotal: Column[Int] = column[Int]("t_shukka_weight_total")
    /** Database column t_shukka_box DBType(TEXT), Length(65535,true) */
    val tShukkaBox: Column[String] = column[String]("t_shukka_box", O.Length(65535,varying=true))
    /** Database column t_shukka_note DBType(TEXT), Length(65535,true) */
    val tShukkaNote: Column[String] = column[String]("t_shukka_note", O.Length(65535,varying=true))
    /** Database column t_shukka_statu DBType(CHAR), Length(2,false), Default(None) */
    val tShukkaStatu: Column[Option[String]] = column[Option[String]]("t_shukka_statu", O.Length(2,varying=false), O.Default(None))
    /** Database column t_shukka_statu_datetime DBType(DATETIME) */
    val tShukkaStatuDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_statu_datetime")
    /** Database column t_shukka_mail_datetime DBType(DATETIME) */
    val tShukkaMailDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_mail_datetime")
    /** Database column t_shukka_dhl_order_datetime DBType(DATETIME) */
    val tShukkaDhlOrderDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukka_dhl_order_datetime")
    /** Database column t_shukka_delivered_from DBType(BIT), Default(false) */
    val tShukkaDeliveredFrom: Column[Boolean] = column[Boolean]("t_shukka_delivered_from", O.Default(false))
  }
  /** Collection-like TableQuery object for table TShukka */
  lazy val TShukka = new TableQuery(tag => new TShukka(tag))
  
  /** Entity class storing rows of table TShukkaitem
   *  @param tShukkaitemId Database column t_shukkaitem_id DBType(INT), AutoInc, PrimaryKey
   *  @param tShukkaitemQuantity Database column t_shukkaitem_quantity DBType(DECIMAL)
   *  @param tShukkaitemPrice Database column t_shukkaitem_price DBType(INT)
   *  @param tShukkaitemPriceDoller Database column t_shukkaitem_price_doller DBType(DECIMAL)
   *  @param tShukkaitemTax Database column t_shukkaitem_tax DBType(INT)
   *  @param tShukkaitemTotal Database column t_shukkaitem_total DBType(INT)
   *  @param tShukkaitemTotalDoller Database column t_shukkaitem_total_doller DBType(DECIMAL)
   *  @param tShukkaitemWeightTotal Database column t_shukkaitem_weight_total DBType(INT) */
  case class TShukkaitemRow(tShukkaitemId: Int, tShukkaitemQuantity: scala.math.BigDecimal, tShukkaitemPrice: Int, tShukkaitemPriceDoller: scala.math.BigDecimal, tShukkaitemTax: Int, tShukkaitemTotal: Int, tShukkaitemTotalDoller: scala.math.BigDecimal, tShukkaitemWeightTotal: Int)
  /** GetResult implicit for fetching TShukkaitemRow objects using plain SQL queries */
  implicit def GetResultTShukkaitemRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal]): GR[TShukkaitemRow] = GR{
    prs => import prs._
    TShukkaitemRow.tupled((<<[Int], <<[scala.math.BigDecimal], <<[Int], <<[scala.math.BigDecimal], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[Int]))
  }
  /** Table description of table t_shukkaitem. Objects of this class serve as prototypes for rows in queries. */
  class TShukkaitem(_tableTag: Tag) extends Table[TShukkaitemRow](_tableTag, "t_shukkaitem") {
    def * = (tShukkaitemId, tShukkaitemQuantity, tShukkaitemPrice, tShukkaitemPriceDoller, tShukkaitemTax, tShukkaitemTotal, tShukkaitemTotalDoller, tShukkaitemWeightTotal) <> (TShukkaitemRow.tupled, TShukkaitemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tShukkaitemId.?, tShukkaitemQuantity.?, tShukkaitemPrice.?, tShukkaitemPriceDoller.?, tShukkaitemTax.?, tShukkaitemTotal.?, tShukkaitemTotalDoller.?, tShukkaitemWeightTotal.?).shaped.<>({r=>import r._; _1.map(_=> TShukkaitemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_shukkaitem_id DBType(INT), AutoInc, PrimaryKey */
    val tShukkaitemId: Column[Int] = column[Int]("t_shukkaitem_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_shukkaitem_quantity DBType(DECIMAL) */
    val tShukkaitemQuantity: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_shukkaitem_quantity")
    /** Database column t_shukkaitem_price DBType(INT) */
    val tShukkaitemPrice: Column[Int] = column[Int]("t_shukkaitem_price")
    /** Database column t_shukkaitem_price_doller DBType(DECIMAL) */
    val tShukkaitemPriceDoller: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_shukkaitem_price_doller")
    /** Database column t_shukkaitem_tax DBType(INT) */
    val tShukkaitemTax: Column[Int] = column[Int]("t_shukkaitem_tax")
    /** Database column t_shukkaitem_total DBType(INT) */
    val tShukkaitemTotal: Column[Int] = column[Int]("t_shukkaitem_total")
    /** Database column t_shukkaitem_total_doller DBType(DECIMAL) */
    val tShukkaitemTotalDoller: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_shukkaitem_total_doller")
    /** Database column t_shukkaitem_weight_total DBType(INT) */
    val tShukkaitemWeightTotal: Column[Int] = column[Int]("t_shukkaitem_weight_total")
  }
  /** Collection-like TableQuery object for table TShukkaitem */
  lazy val TShukkaitem = new TableQuery(tag => new TShukkaitem(tag))
  
  /** Entity class storing rows of table TShukkamaker
   *  @param tShukkamakerId Database column t_shukkamaker_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param tShukkamakerMMakerId Database column t_shukkamaker_m_maker_id DBType(INT UNSIGNED)
   *  @param tShukkamakerTShukkaId Database column t_shukkamaker_t_shukka_id DBType(VARCHAR), Length(45,true)
   *  @param tShukkamakerDatetime Database column t_shukkamaker_datetime DBType(DATETIME) */
  case class TShukkamakerRow(tShukkamakerId: Int, tShukkamakerMMakerId: Int, tShukkamakerTShukkaId: String, tShukkamakerDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TShukkamakerRow objects using plain SQL queries */
  implicit def GetResultTShukkamakerRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TShukkamakerRow] = GR{
    prs => import prs._
    TShukkamakerRow.tupled((<<[Int], <<[Int], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_shukkamaker. Objects of this class serve as prototypes for rows in queries. */
  class TShukkamaker(_tableTag: Tag) extends Table[TShukkamakerRow](_tableTag, "t_shukkamaker") {
    def * = (tShukkamakerId, tShukkamakerMMakerId, tShukkamakerTShukkaId, tShukkamakerDatetime) <> (TShukkamakerRow.tupled, TShukkamakerRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tShukkamakerId.?, tShukkamakerMMakerId.?, tShukkamakerTShukkaId.?, tShukkamakerDatetime.?).shaped.<>({r=>import r._; _1.map(_=> TShukkamakerRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_shukkamaker_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tShukkamakerId: Column[Int] = column[Int]("t_shukkamaker_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_shukkamaker_m_maker_id DBType(INT UNSIGNED) */
    val tShukkamakerMMakerId: Column[Int] = column[Int]("t_shukkamaker_m_maker_id")
    /** Database column t_shukkamaker_t_shukka_id DBType(VARCHAR), Length(45,true) */
    val tShukkamakerTShukkaId: Column[String] = column[String]("t_shukkamaker_t_shukka_id", O.Length(45,varying=true))
    /** Database column t_shukkamaker_datetime DBType(DATETIME) */
    val tShukkamakerDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukkamaker_datetime")
  }
  /** Collection-like TableQuery object for table TShukkamaker */
  lazy val TShukkamaker = new TableQuery(tag => new TShukkamaker(tag))
  
  /** Entity class storing rows of table TShukkin
   *  @param tShukkinId Database column t_shukkin_id DBType(INT), AutoInc, PrimaryKey
   *  @param tShukkinVoidFlag Database column t_shukkin_void_flag DBType(TINYINT)
   *  @param tShukkinDatetime Database column t_shukkin_datetime DBType(DATETIME)
   *  @param tShukkinMCustomerId Database column t_shukkin_m_customer_id DBType(INT)
   *  @param tShukkinAmount Database column t_shukkin_amount DBType(INT)
   *  @param tShukkinStFee Database column t_shukkin_st_fee DBType(INT)
   *  @param tShukkinOutputDatetime Database column t_shukkin_output_datetime DBType(DATETIME)
   *  @param tShukkinMessage Database column t_shukkin_message DBType(TEXT), Length(65535,true)
   *  @param tShukkinNote Database column t_shukkin_note DBType(TEXT), Length(65535,true)
   *  @param tShukkinCsvId Database column t_shukkin_csv_id DBType(VARCHAR), Length(20,true)
   *  @param tShukkinFinanceCode Database column t_shukkin_finance_code DBType(VARCHAR), Length(20,true)
   *  @param tShukkinFinanceBranchCode Database column t_shukkin_finance_branch_code DBType(VARCHAR), Length(20,true)
   *  @param tShukkinFinanceKouzaNumber Database column t_shukkin_finance_kouza_number DBType(VARCHAR), Length(20,true)
   *  @param tShukkinFinanceKouzaMeigi Database column t_shukkin_finance_kouza_meigi DBType(VARCHAR), Length(100,true)
   *  @param tShukkinFinishDatetime Database column t_shukkin_finish_datetime DBType(DATETIME)
   *  @param tShukkinFurikomiName Database column t_shukkin_furikomi_name DBType(VARCHAR), Length(100,true)
   *  @param tShukkinFurikomiDatetime Database column t_shukkin_furikomi_datetime DBType(DATETIME)
   *  @param tShukkinBankFee Database column t_shukkin_bank_fee DBType(INT)
   *  @param tShukkinRdatetime Database column t_shukkin_rdatetime DBType(DATETIME)
   *  @param tShukkinUdatetime Database column t_shukkin_udatetime DBType(DATETIME)
   *  @param tShukkinRuser Database column t_shukkin_ruser DBType(INT)
   *  @param tShukkinUuser Database column t_shukkin_uuser DBType(INT) */
  case class TShukkinRow(tShukkinId: Int, tShukkinVoidFlag: Byte, tShukkinDatetime: java.sql.Timestamp, tShukkinMCustomerId: Int, tShukkinAmount: Int, tShukkinStFee: Int, tShukkinOutputDatetime: java.sql.Timestamp, tShukkinMessage: String, tShukkinNote: String, tShukkinCsvId: String, tShukkinFinanceCode: String, tShukkinFinanceBranchCode: String, tShukkinFinanceKouzaNumber: String, tShukkinFinanceKouzaMeigi: String, tShukkinFinishDatetime: java.sql.Timestamp, tShukkinFurikomiName: String, tShukkinFurikomiDatetime: java.sql.Timestamp, tShukkinBankFee: Int, tShukkinRdatetime: java.sql.Timestamp, tShukkinUdatetime: java.sql.Timestamp, tShukkinRuser: Int, tShukkinUuser: Int)
  /** GetResult implicit for fetching TShukkinRow objects using plain SQL queries */
  implicit def GetResultTShukkinRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[java.sql.Timestamp], e3: GR[String]): GR[TShukkinRow] = GR{
    prs => import prs._
    TShukkinRow.tupled((<<[Int], <<[Byte], <<[java.sql.Timestamp], <<[Int], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[String], <<[java.sql.Timestamp], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table t_shukkin. Objects of this class serve as prototypes for rows in queries. */
  class TShukkin(_tableTag: Tag) extends Table[TShukkinRow](_tableTag, "t_shukkin") {
    def * = (tShukkinId, tShukkinVoidFlag, tShukkinDatetime, tShukkinMCustomerId, tShukkinAmount, tShukkinStFee, tShukkinOutputDatetime, tShukkinMessage, tShukkinNote, tShukkinCsvId, tShukkinFinanceCode, tShukkinFinanceBranchCode, tShukkinFinanceKouzaNumber, tShukkinFinanceKouzaMeigi, tShukkinFinishDatetime, tShukkinFurikomiName, tShukkinFurikomiDatetime, tShukkinBankFee, tShukkinRdatetime, tShukkinUdatetime, tShukkinRuser, tShukkinUuser) <> (TShukkinRow.tupled, TShukkinRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tShukkinId.?, tShukkinVoidFlag.?, tShukkinDatetime.?, tShukkinMCustomerId.?, tShukkinAmount.?, tShukkinStFee.?, tShukkinOutputDatetime.?, tShukkinMessage.?, tShukkinNote.?, tShukkinCsvId.?, tShukkinFinanceCode.?, tShukkinFinanceBranchCode.?, tShukkinFinanceKouzaNumber.?, tShukkinFinanceKouzaMeigi.?, tShukkinFinishDatetime.?, tShukkinFurikomiName.?, tShukkinFurikomiDatetime.?, tShukkinBankFee.?, tShukkinRdatetime.?, tShukkinUdatetime.?, tShukkinRuser.?, tShukkinUuser.?).shaped.<>({r=>import r._; _1.map(_=> TShukkinRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get, _18.get, _19.get, _20.get, _21.get, _22.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_shukkin_id DBType(INT), AutoInc, PrimaryKey */
    val tShukkinId: Column[Int] = column[Int]("t_shukkin_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_shukkin_void_flag DBType(TINYINT) */
    val tShukkinVoidFlag: Column[Byte] = column[Byte]("t_shukkin_void_flag")
    /** Database column t_shukkin_datetime DBType(DATETIME) */
    val tShukkinDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukkin_datetime")
    /** Database column t_shukkin_m_customer_id DBType(INT) */
    val tShukkinMCustomerId: Column[Int] = column[Int]("t_shukkin_m_customer_id")
    /** Database column t_shukkin_amount DBType(INT) */
    val tShukkinAmount: Column[Int] = column[Int]("t_shukkin_amount")
    /** Database column t_shukkin_st_fee DBType(INT) */
    val tShukkinStFee: Column[Int] = column[Int]("t_shukkin_st_fee")
    /** Database column t_shukkin_output_datetime DBType(DATETIME) */
    val tShukkinOutputDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukkin_output_datetime")
    /** Database column t_shukkin_message DBType(TEXT), Length(65535,true) */
    val tShukkinMessage: Column[String] = column[String]("t_shukkin_message", O.Length(65535,varying=true))
    /** Database column t_shukkin_note DBType(TEXT), Length(65535,true) */
    val tShukkinNote: Column[String] = column[String]("t_shukkin_note", O.Length(65535,varying=true))
    /** Database column t_shukkin_csv_id DBType(VARCHAR), Length(20,true) */
    val tShukkinCsvId: Column[String] = column[String]("t_shukkin_csv_id", O.Length(20,varying=true))
    /** Database column t_shukkin_finance_code DBType(VARCHAR), Length(20,true) */
    val tShukkinFinanceCode: Column[String] = column[String]("t_shukkin_finance_code", O.Length(20,varying=true))
    /** Database column t_shukkin_finance_branch_code DBType(VARCHAR), Length(20,true) */
    val tShukkinFinanceBranchCode: Column[String] = column[String]("t_shukkin_finance_branch_code", O.Length(20,varying=true))
    /** Database column t_shukkin_finance_kouza_number DBType(VARCHAR), Length(20,true) */
    val tShukkinFinanceKouzaNumber: Column[String] = column[String]("t_shukkin_finance_kouza_number", O.Length(20,varying=true))
    /** Database column t_shukkin_finance_kouza_meigi DBType(VARCHAR), Length(100,true) */
    val tShukkinFinanceKouzaMeigi: Column[String] = column[String]("t_shukkin_finance_kouza_meigi", O.Length(100,varying=true))
    /** Database column t_shukkin_finish_datetime DBType(DATETIME) */
    val tShukkinFinishDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukkin_finish_datetime")
    /** Database column t_shukkin_furikomi_name DBType(VARCHAR), Length(100,true) */
    val tShukkinFurikomiName: Column[String] = column[String]("t_shukkin_furikomi_name", O.Length(100,varying=true))
    /** Database column t_shukkin_furikomi_datetime DBType(DATETIME) */
    val tShukkinFurikomiDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukkin_furikomi_datetime")
    /** Database column t_shukkin_bank_fee DBType(INT) */
    val tShukkinBankFee: Column[Int] = column[Int]("t_shukkin_bank_fee")
    /** Database column t_shukkin_rdatetime DBType(DATETIME) */
    val tShukkinRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukkin_rdatetime")
    /** Database column t_shukkin_udatetime DBType(DATETIME) */
    val tShukkinUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_shukkin_udatetime")
    /** Database column t_shukkin_ruser DBType(INT) */
    val tShukkinRuser: Column[Int] = column[Int]("t_shukkin_ruser")
    /** Database column t_shukkin_uuser DBType(INT) */
    val tShukkinUuser: Column[Int] = column[Int]("t_shukkin_uuser")
    
    /** Index over (tShukkinMCustomerId) (database name t_shukkin_m_customer_id) */
    val index1 = index("t_shukkin_m_customer_id", tShukkinMCustomerId)
  }
  /** Collection-like TableQuery object for table TShukkin */
  lazy val TShukkin = new TableQuery(tag => new TShukkin(tag))
  
  /** Entity class storing rows of table TSpRate
   *  @param tSpRateId Database column t_sp_rate_id DBType(INT), AutoInc, PrimaryKey
   *  @param tSpRateStartdate Database column t_sp_rate_startdate DBType(DATETIME)
   *  @param tSpRateEnddate Database column t_sp_rate_enddate DBType(DATETIME)
   *  @param tSpRateRate Database column t_sp_rate_rate DBType(DECIMAL)
   *  @param tSpRateRuser Database column t_sp_rate_ruser DBType(INT)
   *  @param tSpRateUuser Database column t_sp_rate_uuser DBType(INT)
   *  @param tSpRateRdatetime Database column t_sp_rate_rdatetime DBType(DATETIME)
   *  @param tSpRateUdatetime Database column t_sp_rate_udatetime DBType(DATETIME) */
  case class TSpRateRow(tSpRateId: Int, tSpRateStartdate: java.sql.Timestamp, tSpRateEnddate: java.sql.Timestamp, tSpRateRate: scala.math.BigDecimal, tSpRateRuser: Int, tSpRateUuser: Int, tSpRateRdatetime: java.sql.Timestamp, tSpRateUdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TSpRateRow objects using plain SQL queries */
  implicit def GetResultTSpRateRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp], e2: GR[scala.math.BigDecimal]): GR[TSpRateRow] = GR{
    prs => import prs._
    TSpRateRow.tupled((<<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[scala.math.BigDecimal], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_sp_rate. Objects of this class serve as prototypes for rows in queries. */
  class TSpRate(_tableTag: Tag) extends Table[TSpRateRow](_tableTag, "t_sp_rate") {
    def * = (tSpRateId, tSpRateStartdate, tSpRateEnddate, tSpRateRate, tSpRateRuser, tSpRateUuser, tSpRateRdatetime, tSpRateUdatetime) <> (TSpRateRow.tupled, TSpRateRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tSpRateId.?, tSpRateStartdate.?, tSpRateEnddate.?, tSpRateRate.?, tSpRateRuser.?, tSpRateUuser.?, tSpRateRdatetime.?, tSpRateUdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TSpRateRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_sp_rate_id DBType(INT), AutoInc, PrimaryKey */
    val tSpRateId: Column[Int] = column[Int]("t_sp_rate_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_sp_rate_startdate DBType(DATETIME) */
    val tSpRateStartdate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_sp_rate_startdate")
    /** Database column t_sp_rate_enddate DBType(DATETIME) */
    val tSpRateEnddate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_sp_rate_enddate")
    /** Database column t_sp_rate_rate DBType(DECIMAL) */
    val tSpRateRate: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_sp_rate_rate")
    /** Database column t_sp_rate_ruser DBType(INT) */
    val tSpRateRuser: Column[Int] = column[Int]("t_sp_rate_ruser")
    /** Database column t_sp_rate_uuser DBType(INT) */
    val tSpRateUuser: Column[Int] = column[Int]("t_sp_rate_uuser")
    /** Database column t_sp_rate_rdatetime DBType(DATETIME) */
    val tSpRateRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_sp_rate_rdatetime")
    /** Database column t_sp_rate_udatetime DBType(DATETIME) */
    val tSpRateUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_sp_rate_udatetime")
  }
  /** Collection-like TableQuery object for table TSpRate */
  lazy val TSpRate = new TableQuery(tag => new TSpRate(tag))
  
  /** Entity class storing rows of table TSupportAdmin
   *  @param tSupportAdminId Database column t_support_admin_id DBType(INT), AutoInc, PrimaryKey
   *  @param tSupportAdminStatus Database column t_support_admin_status DBType(TINYINT)
   *  @param tSupportAdminReturnId Database column t_support_admin_return_id DBType(INT)
   *  @param tSupportAdminTo Database column t_support_admin_to DBType(VARCHAR), Length(20,true)
   *  @param tSupportAdminMMakerId Database column t_support_admin_m_maker_id DBType(INT)
   *  @param tSupportAdminReadFlag Database column t_support_admin_read_flag DBType(INT)
   *  @param tSupportAdminTitle Database column t_support_admin_title DBType(VARCHAR), Length(100,true)
   *  @param tSupportAdminBody Database column t_support_admin_body DBType(TEXT), Length(65535,true)
   *  @param tSupportAdminRdatetime Database column t_support_admin_rdatetime DBType(DATETIME)
   *  @param tSupportAdminRuser Database column t_support_admin_ruser DBType(INT) */
  case class TSupportAdminRow(tSupportAdminId: Int, tSupportAdminStatus: Byte, tSupportAdminReturnId: Int, tSupportAdminTo: String, tSupportAdminMMakerId: Int, tSupportAdminReadFlag: Int, tSupportAdminTitle: String, tSupportAdminBody: String, tSupportAdminRdatetime: java.sql.Timestamp, tSupportAdminRuser: Int)
  /** GetResult implicit for fetching TSupportAdminRow objects using plain SQL queries */
  implicit def GetResultTSupportAdminRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[java.sql.Timestamp]): GR[TSupportAdminRow] = GR{
    prs => import prs._
    TSupportAdminRow.tupled((<<[Int], <<[Byte], <<[Int], <<[String], <<[Int], <<[Int], <<[String], <<[String], <<[java.sql.Timestamp], <<[Int]))
  }
  /** Table description of table t_support_admin. Objects of this class serve as prototypes for rows in queries. */
  class TSupportAdmin(_tableTag: Tag) extends Table[TSupportAdminRow](_tableTag, "t_support_admin") {
    def * = (tSupportAdminId, tSupportAdminStatus, tSupportAdminReturnId, tSupportAdminTo, tSupportAdminMMakerId, tSupportAdminReadFlag, tSupportAdminTitle, tSupportAdminBody, tSupportAdminRdatetime, tSupportAdminRuser) <> (TSupportAdminRow.tupled, TSupportAdminRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tSupportAdminId.?, tSupportAdminStatus.?, tSupportAdminReturnId.?, tSupportAdminTo.?, tSupportAdminMMakerId.?, tSupportAdminReadFlag.?, tSupportAdminTitle.?, tSupportAdminBody.?, tSupportAdminRdatetime.?, tSupportAdminRuser.?).shaped.<>({r=>import r._; _1.map(_=> TSupportAdminRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_support_admin_id DBType(INT), AutoInc, PrimaryKey */
    val tSupportAdminId: Column[Int] = column[Int]("t_support_admin_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_support_admin_status DBType(TINYINT) */
    val tSupportAdminStatus: Column[Byte] = column[Byte]("t_support_admin_status")
    /** Database column t_support_admin_return_id DBType(INT) */
    val tSupportAdminReturnId: Column[Int] = column[Int]("t_support_admin_return_id")
    /** Database column t_support_admin_to DBType(VARCHAR), Length(20,true) */
    val tSupportAdminTo: Column[String] = column[String]("t_support_admin_to", O.Length(20,varying=true))
    /** Database column t_support_admin_m_maker_id DBType(INT) */
    val tSupportAdminMMakerId: Column[Int] = column[Int]("t_support_admin_m_maker_id")
    /** Database column t_support_admin_read_flag DBType(INT) */
    val tSupportAdminReadFlag: Column[Int] = column[Int]("t_support_admin_read_flag")
    /** Database column t_support_admin_title DBType(VARCHAR), Length(100,true) */
    val tSupportAdminTitle: Column[String] = column[String]("t_support_admin_title", O.Length(100,varying=true))
    /** Database column t_support_admin_body DBType(TEXT), Length(65535,true) */
    val tSupportAdminBody: Column[String] = column[String]("t_support_admin_body", O.Length(65535,varying=true))
    /** Database column t_support_admin_rdatetime DBType(DATETIME) */
    val tSupportAdminRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_support_admin_rdatetime")
    /** Database column t_support_admin_ruser DBType(INT) */
    val tSupportAdminRuser: Column[Int] = column[Int]("t_support_admin_ruser")
  }
  /** Collection-like TableQuery object for table TSupportAdmin */
  lazy val TSupportAdmin = new TableQuery(tag => new TSupportAdmin(tag))
  
  /** Entity class storing rows of table TSupportFilter
   *  @param tSupportFilterId Database column t_support_filter_id DBType(INT), AutoInc, PrimaryKey
   *  @param tSupportFilterName Database column t_support_filter_name DBType(VARCHAR), Length(100,true)
   *  @param tSupportFilterFind Database column t_support_filter_find DBType(VARCHAR), Length(255,true) */
  case class TSupportFilterRow(tSupportFilterId: Int, tSupportFilterName: String, tSupportFilterFind: String)
  /** GetResult implicit for fetching TSupportFilterRow objects using plain SQL queries */
  implicit def GetResultTSupportFilterRow(implicit e0: GR[Int], e1: GR[String]): GR[TSupportFilterRow] = GR{
    prs => import prs._
    TSupportFilterRow.tupled((<<[Int], <<[String], <<[String]))
  }
  /** Table description of table t_support_filter. Objects of this class serve as prototypes for rows in queries. */
  class TSupportFilter(_tableTag: Tag) extends Table[TSupportFilterRow](_tableTag, "t_support_filter") {
    def * = (tSupportFilterId, tSupportFilterName, tSupportFilterFind) <> (TSupportFilterRow.tupled, TSupportFilterRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tSupportFilterId.?, tSupportFilterName.?, tSupportFilterFind.?).shaped.<>({r=>import r._; _1.map(_=> TSupportFilterRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_support_filter_id DBType(INT), AutoInc, PrimaryKey */
    val tSupportFilterId: Column[Int] = column[Int]("t_support_filter_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_support_filter_name DBType(VARCHAR), Length(100,true) */
    val tSupportFilterName: Column[String] = column[String]("t_support_filter_name", O.Length(100,varying=true))
    /** Database column t_support_filter_find DBType(VARCHAR), Length(255,true) */
    val tSupportFilterFind: Column[String] = column[String]("t_support_filter_find", O.Length(255,varying=true))
  }
  /** Collection-like TableQuery object for table TSupportFilter */
  lazy val TSupportFilter = new TableQuery(tag => new TSupportFilter(tag))
  
  /** Entity class storing rows of table TSupportMaker
   *  @param tSupportMakerId Database column t_support_maker_id DBType(INT), AutoInc, PrimaryKey
   *  @param tMakerSupportMakerTrashboxFlag Database column t_maker_support_maker_trashbox_flag DBType(INT)
   *  @param tMakerSupportMakerDeleteFlag Database column t_maker_support_maker_delete_flag DBType(INT)
   *  @param tMakerSupportMakerReturnFlag Database column t_maker_support_maker_return_flag DBType(INT)
   *  @param tSupportMakerReturnId Database column t_support_maker_return_id DBType(INT)
   *  @param tSupportMakerTo Database column t_support_maker_to DBType(VARCHAR), Length(20,true)
   *  @param tSupportMakerMCustomerId Database column t_support_maker_m_customer_id DBType(VARCHAR), Length(255,true)
   *  @param tSupportMakerMMakerId Database column t_support_maker_m_maker_id DBType(CHAR), Length(255,false)
   *  @param tSupportMakerAdminreadFlag Database column t_support_maker_adminread_flag DBType(VARCHAR), Length(255,true), Default({0})
   *  @param tSupportMakerReadFlag Database column t_support_maker_read_flag DBType(INT)
   *  @param tSupportMakerTitle Database column t_support_maker_title DBType(VARCHAR), Length(100,true)
   *  @param tSupportMakerBody Database column t_support_maker_body DBType(TEXT), Length(65535,true)
   *  @param tSupportMakerRdatetime Database column t_support_maker_rdatetime DBType(DATETIME)
   *  @param tSupportMakerRuser Database column t_support_maker_ruser DBType(INT)
   *  @param tSupportMakerType Database column t_support_maker_type DBType(ENUM), Length(4,false), Default(msg)
   *  @param tSupportMakerBuyerTrashboxFlag Database column t_support_maker_buyer_trashbox_flag DBType(INT), Default(0)
   *  @param tSupportMakerBuyerDeleteFlag Database column t_support_maker_buyer_delete_flag DBType(INT), Default(0)
   *  @param tSupportMakerBuyerReturnFlag Database column t_support_maker_buyer_return_flag DBType(INT), Default(0)
   *  @param tSupportMakerFromType Database column t_support_maker_from_type DBType(TINYINT UNSIGNED), Default(0)
   *  @param tTitle Database column t_title DBType(VARCHAR), Length(100,true)
   *  @param tBody Database column t_body DBType(TEXT), Length(65535,true)
   *  @param tTransStatus Database column t_trans_status DBType(ENUM), Length(9,false), Default(original) */
  case class TSupportMakerRow(tSupportMakerId: Int, tMakerSupportMakerTrashboxFlag: Int, tMakerSupportMakerDeleteFlag: Int, tMakerSupportMakerReturnFlag: Int, tSupportMakerReturnId: Int, tSupportMakerTo: String, tSupportMakerMCustomerId: String, tSupportMakerMMakerId: String, tSupportMakerAdminreadFlag: String = "{0}", tSupportMakerReadFlag: Int, tSupportMakerTitle: String, tSupportMakerBody: String, tSupportMakerRdatetime: java.sql.Timestamp, tSupportMakerRuser: Int, tSupportMakerType: String = "msg", tSupportMakerBuyerTrashboxFlag: Int = 0, tSupportMakerBuyerDeleteFlag: Int = 0, tSupportMakerBuyerReturnFlag: Int = 0, tSupportMakerFromType: Byte = 0, tTitle: String, tBody: String, tTransStatus: String = "original")
  /** GetResult implicit for fetching TSupportMakerRow objects using plain SQL queries */
  implicit def GetResultTSupportMakerRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Byte]): GR[TSupportMakerRow] = GR{
    prs => import prs._
    TSupportMakerRow.tupled((<<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[String], <<[String], <<[java.sql.Timestamp], <<[Int], <<[String], <<[Int], <<[Int], <<[Int], <<[Byte], <<[String], <<[String], <<[String]))
  }
  /** Table description of table t_support_maker. Objects of this class serve as prototypes for rows in queries. */
  class TSupportMaker(_tableTag: Tag) extends Table[TSupportMakerRow](_tableTag, "t_support_maker") {
    def * = (tSupportMakerId, tMakerSupportMakerTrashboxFlag, tMakerSupportMakerDeleteFlag, tMakerSupportMakerReturnFlag, tSupportMakerReturnId, tSupportMakerTo, tSupportMakerMCustomerId, tSupportMakerMMakerId, tSupportMakerAdminreadFlag, tSupportMakerReadFlag, tSupportMakerTitle, tSupportMakerBody, tSupportMakerRdatetime, tSupportMakerRuser, tSupportMakerType, tSupportMakerBuyerTrashboxFlag, tSupportMakerBuyerDeleteFlag, tSupportMakerBuyerReturnFlag, tSupportMakerFromType, tTitle, tBody, tTransStatus) <> (TSupportMakerRow.tupled, TSupportMakerRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tSupportMakerId.?, tMakerSupportMakerTrashboxFlag.?, tMakerSupportMakerDeleteFlag.?, tMakerSupportMakerReturnFlag.?, tSupportMakerReturnId.?, tSupportMakerTo.?, tSupportMakerMCustomerId.?, tSupportMakerMMakerId.?, tSupportMakerAdminreadFlag.?, tSupportMakerReadFlag.?, tSupportMakerTitle.?, tSupportMakerBody.?, tSupportMakerRdatetime.?, tSupportMakerRuser.?, tSupportMakerType.?, tSupportMakerBuyerTrashboxFlag.?, tSupportMakerBuyerDeleteFlag.?, tSupportMakerBuyerReturnFlag.?, tSupportMakerFromType.?, tTitle.?, tBody.?, tTransStatus.?).shaped.<>({r=>import r._; _1.map(_=> TSupportMakerRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17.get, _18.get, _19.get, _20.get, _21.get, _22.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_support_maker_id DBType(INT), AutoInc, PrimaryKey */
    val tSupportMakerId: Column[Int] = column[Int]("t_support_maker_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_maker_support_maker_trashbox_flag DBType(INT) */
    val tMakerSupportMakerTrashboxFlag: Column[Int] = column[Int]("t_maker_support_maker_trashbox_flag")
    /** Database column t_maker_support_maker_delete_flag DBType(INT) */
    val tMakerSupportMakerDeleteFlag: Column[Int] = column[Int]("t_maker_support_maker_delete_flag")
    /** Database column t_maker_support_maker_return_flag DBType(INT) */
    val tMakerSupportMakerReturnFlag: Column[Int] = column[Int]("t_maker_support_maker_return_flag")
    /** Database column t_support_maker_return_id DBType(INT) */
    val tSupportMakerReturnId: Column[Int] = column[Int]("t_support_maker_return_id")
    /** Database column t_support_maker_to DBType(VARCHAR), Length(20,true) */
    val tSupportMakerTo: Column[String] = column[String]("t_support_maker_to", O.Length(20,varying=true))
    /** Database column t_support_maker_m_customer_id DBType(VARCHAR), Length(255,true) */
    val tSupportMakerMCustomerId: Column[String] = column[String]("t_support_maker_m_customer_id", O.Length(255,varying=true))
    /** Database column t_support_maker_m_maker_id DBType(CHAR), Length(255,false) */
    val tSupportMakerMMakerId: Column[String] = column[String]("t_support_maker_m_maker_id", O.Length(255,varying=false))
    /** Database column t_support_maker_adminread_flag DBType(VARCHAR), Length(255,true), Default({0}) */
    val tSupportMakerAdminreadFlag: Column[String] = column[String]("t_support_maker_adminread_flag", O.Length(255,varying=true), O.Default("{0}"))
    /** Database column t_support_maker_read_flag DBType(INT) */
    val tSupportMakerReadFlag: Column[Int] = column[Int]("t_support_maker_read_flag")
    /** Database column t_support_maker_title DBType(VARCHAR), Length(100,true) */
    val tSupportMakerTitle: Column[String] = column[String]("t_support_maker_title", O.Length(100,varying=true))
    /** Database column t_support_maker_body DBType(TEXT), Length(65535,true) */
    val tSupportMakerBody: Column[String] = column[String]("t_support_maker_body", O.Length(65535,varying=true))
    /** Database column t_support_maker_rdatetime DBType(DATETIME) */
    val tSupportMakerRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_support_maker_rdatetime")
    /** Database column t_support_maker_ruser DBType(INT) */
    val tSupportMakerRuser: Column[Int] = column[Int]("t_support_maker_ruser")
    /** Database column t_support_maker_type DBType(ENUM), Length(4,false), Default(msg) */
    val tSupportMakerType: Column[String] = column[String]("t_support_maker_type", O.Length(4,varying=false), O.Default("msg"))
    /** Database column t_support_maker_buyer_trashbox_flag DBType(INT), Default(0) */
    val tSupportMakerBuyerTrashboxFlag: Column[Int] = column[Int]("t_support_maker_buyer_trashbox_flag", O.Default(0))
    /** Database column t_support_maker_buyer_delete_flag DBType(INT), Default(0) */
    val tSupportMakerBuyerDeleteFlag: Column[Int] = column[Int]("t_support_maker_buyer_delete_flag", O.Default(0))
    /** Database column t_support_maker_buyer_return_flag DBType(INT), Default(0) */
    val tSupportMakerBuyerReturnFlag: Column[Int] = column[Int]("t_support_maker_buyer_return_flag", O.Default(0))
    /** Database column t_support_maker_from_type DBType(TINYINT UNSIGNED), Default(0) */
    val tSupportMakerFromType: Column[Byte] = column[Byte]("t_support_maker_from_type", O.Default(0))
    /** Database column t_title DBType(VARCHAR), Length(100,true) */
    val tTitle: Column[String] = column[String]("t_title", O.Length(100,varying=true))
    /** Database column t_body DBType(TEXT), Length(65535,true) */
    val tBody: Column[String] = column[String]("t_body", O.Length(65535,varying=true))
    /** Database column t_trans_status DBType(ENUM), Length(9,false), Default(original) */
    val tTransStatus: Column[String] = column[String]("t_trans_status", O.Length(9,varying=false), O.Default("original"))
  }
  /** Collection-like TableQuery object for table TSupportMaker */
  lazy val TSupportMaker = new TableQuery(tag => new TSupportMaker(tag))
  
  /** Entity class storing rows of table TTemplate
   *  @param tTemplateId Database column t_template_id DBType(INT), AutoInc, PrimaryKey
   *  @param tTemplateVoidFlag Database column t_template_void_flag DBType(TINYINT)
   *  @param tTemplateName Database column t_template_name DBType(VARCHAR), Length(255,true)
   *  @param tTemplateTitle Database column t_template_title DBType(VARCHAR), Length(255,true)
   *  @param tTemplateContents Database column t_template_contents DBType(TEXT), Length(65535,true)
   *  @param tTemplateRdatetime Database column t_template_rdatetime DBType(DATETIME)
   *  @param tTemplateUdatetime Database column t_template_udatetime DBType(DATETIME)
   *  @param tTemplateRuser Database column t_template_ruser DBType(INT)
   *  @param tTemplateUuser Database column t_template_uuser DBType(INT) */
  case class TTemplateRow(tTemplateId: Int, tTemplateVoidFlag: Byte, tTemplateName: String, tTemplateTitle: String, tTemplateContents: String, tTemplateRdatetime: java.sql.Timestamp, tTemplateUdatetime: java.sql.Timestamp, tTemplateRuser: Int, tTemplateUuser: Int)
  /** GetResult implicit for fetching TTemplateRow objects using plain SQL queries */
  implicit def GetResultTTemplateRow(implicit e0: GR[Int], e1: GR[Byte], e2: GR[String], e3: GR[java.sql.Timestamp]): GR[TTemplateRow] = GR{
    prs => import prs._
    TTemplateRow.tupled((<<[Int], <<[Byte], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[Int]))
  }
  /** Table description of table t_template. Objects of this class serve as prototypes for rows in queries. */
  class TTemplate(_tableTag: Tag) extends Table[TTemplateRow](_tableTag, "t_template") {
    def * = (tTemplateId, tTemplateVoidFlag, tTemplateName, tTemplateTitle, tTemplateContents, tTemplateRdatetime, tTemplateUdatetime, tTemplateRuser, tTemplateUuser) <> (TTemplateRow.tupled, TTemplateRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tTemplateId.?, tTemplateVoidFlag.?, tTemplateName.?, tTemplateTitle.?, tTemplateContents.?, tTemplateRdatetime.?, tTemplateUdatetime.?, tTemplateRuser.?, tTemplateUuser.?).shaped.<>({r=>import r._; _1.map(_=> TTemplateRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_template_id DBType(INT), AutoInc, PrimaryKey */
    val tTemplateId: Column[Int] = column[Int]("t_template_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_template_void_flag DBType(TINYINT) */
    val tTemplateVoidFlag: Column[Byte] = column[Byte]("t_template_void_flag")
    /** Database column t_template_name DBType(VARCHAR), Length(255,true) */
    val tTemplateName: Column[String] = column[String]("t_template_name", O.Length(255,varying=true))
    /** Database column t_template_title DBType(VARCHAR), Length(255,true) */
    val tTemplateTitle: Column[String] = column[String]("t_template_title", O.Length(255,varying=true))
    /** Database column t_template_contents DBType(TEXT), Length(65535,true) */
    val tTemplateContents: Column[String] = column[String]("t_template_contents", O.Length(65535,varying=true))
    /** Database column t_template_rdatetime DBType(DATETIME) */
    val tTemplateRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_template_rdatetime")
    /** Database column t_template_udatetime DBType(DATETIME) */
    val tTemplateUdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_template_udatetime")
    /** Database column t_template_ruser DBType(INT) */
    val tTemplateRuser: Column[Int] = column[Int]("t_template_ruser")
    /** Database column t_template_uuser DBType(INT) */
    val tTemplateUuser: Column[Int] = column[Int]("t_template_uuser")
  }
  /** Collection-like TableQuery object for table TTemplate */
  lazy val TTemplate = new TableQuery(tag => new TTemplate(tag))
  
  /** Entity class storing rows of table TTradeDetail
   *  @param tTradeDetailDate Database column t_trade_detail_date DBType(DATE), PrimaryKey
   *  @param tTradeDetailStoreAmount Database column t_trade_detail_store_amount DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tTradeDetailCashAmount Database column t_trade_detail_cash_amount DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tTradeDetailNewBail Database column t_trade_detail_new_bail DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tTradeDetailPileBail Database column t_trade_detail_pile_bail DBType(DECIMAL), Default(0.00)
   *  @param tTradeDetailBargain Database column t_trade_detail_bargain DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tTradeDetailDeliveryCharges Database column t_trade_detail_delivery_charges DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tTradeDetailLatestDeliveryCharges Database column t_trade_detail_latest_delivery_charges DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tTradeDetailRefund Database column t_trade_detail_refund DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tTradeDetailBalance Database column t_trade_detail_balance DBType(DECIMAL), Default(0.00)
   *  @param tTradeDetailFacBargain Database column t_trade_detail_fac_bargain DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tTradeDetailFacCash Database column t_trade_detail_fac_cash DBType(DECIMAL UNSIGNED), Default(0.00)
   *  @param tTradeDetailFacBalance Database column t_trade_detail_fac_balance DBType(DECIMAL), Default(0.00) */
  case class TTradeDetailRow(tTradeDetailDate: java.sql.Date, tTradeDetailStoreAmount: scala.math.BigDecimal = "0.00", tTradeDetailCashAmount: scala.math.BigDecimal = "0.00", tTradeDetailNewBail: scala.math.BigDecimal = "0.00", tTradeDetailPileBail: scala.math.BigDecimal = "0.00", tTradeDetailBargain: scala.math.BigDecimal = "0.00", tTradeDetailDeliveryCharges: scala.math.BigDecimal = "0.00", tTradeDetailLatestDeliveryCharges: scala.math.BigDecimal = "0.00", tTradeDetailRefund: scala.math.BigDecimal = "0.00", tTradeDetailBalance: scala.math.BigDecimal = "0.00", tTradeDetailFacBargain: scala.math.BigDecimal = "0.00", tTradeDetailFacCash: scala.math.BigDecimal = "0.00", tTradeDetailFacBalance: scala.math.BigDecimal = "0.00")
  /** GetResult implicit for fetching TTradeDetailRow objects using plain SQL queries */
  implicit def GetResultTTradeDetailRow(implicit e0: GR[java.sql.Date], e1: GR[scala.math.BigDecimal]): GR[TTradeDetailRow] = GR{
    prs => import prs._
    TTradeDetailRow.tupled((<<[java.sql.Date], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal]))
  }
  /** Table description of table t_trade_detail. Objects of this class serve as prototypes for rows in queries. */
  class TTradeDetail(_tableTag: Tag) extends Table[TTradeDetailRow](_tableTag, "t_trade_detail") {
    def * = (tTradeDetailDate, tTradeDetailStoreAmount, tTradeDetailCashAmount, tTradeDetailNewBail, tTradeDetailPileBail, tTradeDetailBargain, tTradeDetailDeliveryCharges, tTradeDetailLatestDeliveryCharges, tTradeDetailRefund, tTradeDetailBalance, tTradeDetailFacBargain, tTradeDetailFacCash, tTradeDetailFacBalance) <> (TTradeDetailRow.tupled, TTradeDetailRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tTradeDetailDate.?, tTradeDetailStoreAmount.?, tTradeDetailCashAmount.?, tTradeDetailNewBail.?, tTradeDetailPileBail.?, tTradeDetailBargain.?, tTradeDetailDeliveryCharges.?, tTradeDetailLatestDeliveryCharges.?, tTradeDetailRefund.?, tTradeDetailBalance.?, tTradeDetailFacBargain.?, tTradeDetailFacCash.?, tTradeDetailFacBalance.?).shaped.<>({r=>import r._; _1.map(_=> TTradeDetailRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_trade_detail_date DBType(DATE), PrimaryKey */
    val tTradeDetailDate: Column[java.sql.Date] = column[java.sql.Date]("t_trade_detail_date", O.PrimaryKey)
    /** Database column t_trade_detail_store_amount DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tTradeDetailStoreAmount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_trade_detail_store_amount", O.Default("0.00"))
    /** Database column t_trade_detail_cash_amount DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tTradeDetailCashAmount: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_trade_detail_cash_amount", O.Default("0.00"))
    /** Database column t_trade_detail_new_bail DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tTradeDetailNewBail: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_trade_detail_new_bail", O.Default("0.00"))
    /** Database column t_trade_detail_pile_bail DBType(DECIMAL), Default(0.00) */
    val tTradeDetailPileBail: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_trade_detail_pile_bail", O.Default("0.00"))
    /** Database column t_trade_detail_bargain DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tTradeDetailBargain: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_trade_detail_bargain", O.Default("0.00"))
    /** Database column t_trade_detail_delivery_charges DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tTradeDetailDeliveryCharges: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_trade_detail_delivery_charges", O.Default("0.00"))
    /** Database column t_trade_detail_latest_delivery_charges DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tTradeDetailLatestDeliveryCharges: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_trade_detail_latest_delivery_charges", O.Default("0.00"))
    /** Database column t_trade_detail_refund DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tTradeDetailRefund: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_trade_detail_refund", O.Default("0.00"))
    /** Database column t_trade_detail_balance DBType(DECIMAL), Default(0.00) */
    val tTradeDetailBalance: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_trade_detail_balance", O.Default("0.00"))
    /** Database column t_trade_detail_fac_bargain DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tTradeDetailFacBargain: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_trade_detail_fac_bargain", O.Default("0.00"))
    /** Database column t_trade_detail_fac_cash DBType(DECIMAL UNSIGNED), Default(0.00) */
    val tTradeDetailFacCash: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_trade_detail_fac_cash", O.Default("0.00"))
    /** Database column t_trade_detail_fac_balance DBType(DECIMAL), Default(0.00) */
    val tTradeDetailFacBalance: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_trade_detail_fac_balance", O.Default("0.00"))
  }
  /** Collection-like TableQuery object for table TTradeDetail */
  lazy val TTradeDetail = new TableQuery(tag => new TTradeDetail(tag))
  
  /** Entity class storing rows of table TTranslate
   *  @param tTranslateId Database column t_translate_id DBType(INT), AutoInc, PrimaryKey
   *  @param tTranslateUsername Database column t_translate_username DBType(VARCHAR), Length(20,true)
   *  @param tTranslateMItemId Database column t_translate_m_item_id DBType(INT)
   *  @param tTranslateRdatetime Database column t_translate_rdatetime DBType(DATETIME) */
  case class TTranslateRow(tTranslateId: Int, tTranslateUsername: String, tTranslateMItemId: Int, tTranslateRdatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TTranslateRow objects using plain SQL queries */
  implicit def GetResultTTranslateRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TTranslateRow] = GR{
    prs => import prs._
    TTranslateRow.tupled((<<[Int], <<[String], <<[Int], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_translate. Objects of this class serve as prototypes for rows in queries. */
  class TTranslate(_tableTag: Tag) extends Table[TTranslateRow](_tableTag, "t_translate") {
    def * = (tTranslateId, tTranslateUsername, tTranslateMItemId, tTranslateRdatetime) <> (TTranslateRow.tupled, TTranslateRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tTranslateId.?, tTranslateUsername.?, tTranslateMItemId.?, tTranslateRdatetime.?).shaped.<>({r=>import r._; _1.map(_=> TTranslateRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_translate_id DBType(INT), AutoInc, PrimaryKey */
    val tTranslateId: Column[Int] = column[Int]("t_translate_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_translate_username DBType(VARCHAR), Length(20,true) */
    val tTranslateUsername: Column[String] = column[String]("t_translate_username", O.Length(20,varying=true))
    /** Database column t_translate_m_item_id DBType(INT) */
    val tTranslateMItemId: Column[Int] = column[Int]("t_translate_m_item_id")
    /** Database column t_translate_rdatetime DBType(DATETIME) */
    val tTranslateRdatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_translate_rdatetime")
    
    /** Index over (tTranslateUsername) (database name t_translate_username) */
    val index1 = index("t_translate_username", tTranslateUsername)
  }
  /** Collection-like TableQuery object for table TTranslate */
  lazy val TTranslate = new TableQuery(tag => new TTranslate(tag))
  
  /** Entity class storing rows of table TTransportConstant
   *  @param tTransportConstantKey Database column t_transport_constant_key DBType(VARCHAR), PrimaryKey, Length(100,true)
   *  @param tTransportConstantValue Database column t_transport_constant_value DBType(VARCHAR), Length(250,true)
   *  @param tTransportConstantCaption Database column t_transport_constant_caption DBType(TEXT), Length(65535,true) */
  case class TTransportConstantRow(tTransportConstantKey: String, tTransportConstantValue: String, tTransportConstantCaption: String)
  /** GetResult implicit for fetching TTransportConstantRow objects using plain SQL queries */
  implicit def GetResultTTransportConstantRow(implicit e0: GR[String]): GR[TTransportConstantRow] = GR{
    prs => import prs._
    TTransportConstantRow.tupled((<<[String], <<[String], <<[String]))
  }
  /** Table description of table t_transport_constant. Objects of this class serve as prototypes for rows in queries. */
  class TTransportConstant(_tableTag: Tag) extends Table[TTransportConstantRow](_tableTag, "t_transport_constant") {
    def * = (tTransportConstantKey, tTransportConstantValue, tTransportConstantCaption) <> (TTransportConstantRow.tupled, TTransportConstantRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tTransportConstantKey.?, tTransportConstantValue.?, tTransportConstantCaption.?).shaped.<>({r=>import r._; _1.map(_=> TTransportConstantRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_transport_constant_key DBType(VARCHAR), PrimaryKey, Length(100,true) */
    val tTransportConstantKey: Column[String] = column[String]("t_transport_constant_key", O.PrimaryKey, O.Length(100,varying=true))
    /** Database column t_transport_constant_value DBType(VARCHAR), Length(250,true) */
    val tTransportConstantValue: Column[String] = column[String]("t_transport_constant_value", O.Length(250,varying=true))
    /** Database column t_transport_constant_caption DBType(TEXT), Length(65535,true) */
    val tTransportConstantCaption: Column[String] = column[String]("t_transport_constant_caption", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table TTransportConstant */
  lazy val TTransportConstant = new TableQuery(tag => new TTransportConstant(tag))
  
  /** Entity class storing rows of table TTransportRemarks
   *  @param tTransportRemarksId Database column t_transport_remarks_id DBType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param tTransportRemarksTJuchuNum Database column t_transport_remarks_t_juchu_num DBType(VARCHAR), Length(50,true)
   *  @param tTransportRemarksCustomerId Database column t_transport_remarks_customer_id DBType(INT)
   *  @param tTransportRemarksCon Database column t_transport_remarks_con DBType(TEXT), Length(65535,true)
   *  @param tTransportRemarksAddDate Database column t_transport_remarks_add_date DBType(DATETIME) */
  case class TTransportRemarksRow(tTransportRemarksId: Int, tTransportRemarksTJuchuNum: String, tTransportRemarksCustomerId: Int, tTransportRemarksCon: String, tTransportRemarksAddDate: java.sql.Timestamp)
  /** GetResult implicit for fetching TTransportRemarksRow objects using plain SQL queries */
  implicit def GetResultTTransportRemarksRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TTransportRemarksRow] = GR{
    prs => import prs._
    TTransportRemarksRow.tupled((<<[Int], <<[String], <<[Int], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_transport_remarks. Objects of this class serve as prototypes for rows in queries. */
  class TTransportRemarks(_tableTag: Tag) extends Table[TTransportRemarksRow](_tableTag, "t_transport_remarks") {
    def * = (tTransportRemarksId, tTransportRemarksTJuchuNum, tTransportRemarksCustomerId, tTransportRemarksCon, tTransportRemarksAddDate) <> (TTransportRemarksRow.tupled, TTransportRemarksRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tTransportRemarksId.?, tTransportRemarksTJuchuNum.?, tTransportRemarksCustomerId.?, tTransportRemarksCon.?, tTransportRemarksAddDate.?).shaped.<>({r=>import r._; _1.map(_=> TTransportRemarksRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_transport_remarks_id DBType(INT UNSIGNED), AutoInc, PrimaryKey */
    val tTransportRemarksId: Column[Int] = column[Int]("t_transport_remarks_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_transport_remarks_t_juchu_num DBType(VARCHAR), Length(50,true) */
    val tTransportRemarksTJuchuNum: Column[String] = column[String]("t_transport_remarks_t_juchu_num", O.Length(50,varying=true))
    /** Database column t_transport_remarks_customer_id DBType(INT) */
    val tTransportRemarksCustomerId: Column[Int] = column[Int]("t_transport_remarks_customer_id")
    /** Database column t_transport_remarks_con DBType(TEXT), Length(65535,true) */
    val tTransportRemarksCon: Column[String] = column[String]("t_transport_remarks_con", O.Length(65535,varying=true))
    /** Database column t_transport_remarks_add_date DBType(DATETIME) */
    val tTransportRemarksAddDate: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_transport_remarks_add_date")
  }
  /** Collection-like TableQuery object for table TTransportRemarks */
  lazy val TTransportRemarks = new TableQuery(tag => new TTransportRemarks(tag))
  
  /** Entity class storing rows of table TVisit
   *  @param tVisitId Database column t_visit_id DBType(INT), AutoInc, PrimaryKey
   *  @param tVisitUrl Database column t_visit_url DBType(VARCHAR), Length(250,true)
   *  @param tVisitWebchannel Database column t_visit_webchannel DBType(VARCHAR), Length(100,true)
   *  @param tVisitIp Database column t_visit_ip DBType(VARCHAR), Length(250,true)
   *  @param tVisitDatetime Database column t_visit_datetime DBType(DATETIME) */
  case class TVisitRow(tVisitId: Int, tVisitUrl: String, tVisitWebchannel: String, tVisitIp: String, tVisitDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TVisitRow objects using plain SQL queries */
  implicit def GetResultTVisitRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[TVisitRow] = GR{
    prs => import prs._
    TVisitRow.tupled((<<[Int], <<[String], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_visit. Objects of this class serve as prototypes for rows in queries. */
  class TVisit(_tableTag: Tag) extends Table[TVisitRow](_tableTag, "t_visit") {
    def * = (tVisitId, tVisitUrl, tVisitWebchannel, tVisitIp, tVisitDatetime) <> (TVisitRow.tupled, TVisitRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tVisitId.?, tVisitUrl.?, tVisitWebchannel.?, tVisitIp.?, tVisitDatetime.?).shaped.<>({r=>import r._; _1.map(_=> TVisitRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_visit_id DBType(INT), AutoInc, PrimaryKey */
    val tVisitId: Column[Int] = column[Int]("t_visit_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_visit_url DBType(VARCHAR), Length(250,true) */
    val tVisitUrl: Column[String] = column[String]("t_visit_url", O.Length(250,varying=true))
    /** Database column t_visit_webchannel DBType(VARCHAR), Length(100,true) */
    val tVisitWebchannel: Column[String] = column[String]("t_visit_webchannel", O.Length(100,varying=true))
    /** Database column t_visit_ip DBType(VARCHAR), Length(250,true) */
    val tVisitIp: Column[String] = column[String]("t_visit_ip", O.Length(250,varying=true))
    /** Database column t_visit_datetime DBType(DATETIME) */
    val tVisitDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_visit_datetime")
  }
  /** Collection-like TableQuery object for table TVisit */
  lazy val TVisit = new TableQuery(tag => new TVisit(tag))
  
  /** Entity class storing rows of table TWebChannel
   *  @param tWebChannelId Database column t_web_channel_id DBType(INT), AutoInc, PrimaryKey
   *  @param tWebChannelTJuchuId Database column t_web_channel_t_juchu_id DBType(INT), Default(0)
   *  @param tWebChannelCustomerIp Database column t_web_channel_customer_ip DBType(VARCHAR), Length(100,true) */
  case class TWebChannelRow(tWebChannelId: Int, tWebChannelTJuchuId: Int = 0, tWebChannelCustomerIp: String)
  /** GetResult implicit for fetching TWebChannelRow objects using plain SQL queries */
  implicit def GetResultTWebChannelRow(implicit e0: GR[Int], e1: GR[String]): GR[TWebChannelRow] = GR{
    prs => import prs._
    TWebChannelRow.tupled((<<[Int], <<[Int], <<[String]))
  }
  /** Table description of table t_web_channel. Objects of this class serve as prototypes for rows in queries. */
  class TWebChannel(_tableTag: Tag) extends Table[TWebChannelRow](_tableTag, "t_web_channel") {
    def * = (tWebChannelId, tWebChannelTJuchuId, tWebChannelCustomerIp) <> (TWebChannelRow.tupled, TWebChannelRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tWebChannelId.?, tWebChannelTJuchuId.?, tWebChannelCustomerIp.?).shaped.<>({r=>import r._; _1.map(_=> TWebChannelRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_web_channel_id DBType(INT), AutoInc, PrimaryKey */
    val tWebChannelId: Column[Int] = column[Int]("t_web_channel_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_web_channel_t_juchu_id DBType(INT), Default(0) */
    val tWebChannelTJuchuId: Column[Int] = column[Int]("t_web_channel_t_juchu_id", O.Default(0))
    /** Database column t_web_channel_customer_ip DBType(VARCHAR), Length(100,true) */
    val tWebChannelCustomerIp: Column[String] = column[String]("t_web_channel_customer_ip", O.Length(100,varying=true))
  }
  /** Collection-like TableQuery object for table TWebChannel */
  lazy val TWebChannel = new TableQuery(tag => new TWebChannel(tag))
  
  /** Entity class storing rows of table TZaiko
   *  @param tZaikoId Database column t_zaiko_id DBType(INT), AutoInc, PrimaryKey
   *  @param tZaikoDatetime Database column t_zaiko_datetime DBType(DATETIME)
   *  @param tZaikoShippingDatetime Database column t_zaiko_shipping_datetime DBType(DATETIME)
   *  @param tZaikoDeliveryDatetime Database column t_zaiko_delivery_datetime DBType(DATETIME) */
  case class TZaikoRow(tZaikoId: Int, tZaikoDatetime: java.sql.Timestamp, tZaikoShippingDatetime: java.sql.Timestamp, tZaikoDeliveryDatetime: java.sql.Timestamp)
  /** GetResult implicit for fetching TZaikoRow objects using plain SQL queries */
  implicit def GetResultTZaikoRow(implicit e0: GR[Int], e1: GR[java.sql.Timestamp]): GR[TZaikoRow] = GR{
    prs => import prs._
    TZaikoRow.tupled((<<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table t_zaiko. Objects of this class serve as prototypes for rows in queries. */
  class TZaiko(_tableTag: Tag) extends Table[TZaikoRow](_tableTag, "t_zaiko") {
    def * = (tZaikoId, tZaikoDatetime, tZaikoShippingDatetime, tZaikoDeliveryDatetime) <> (TZaikoRow.tupled, TZaikoRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tZaikoId.?, tZaikoDatetime.?, tZaikoShippingDatetime.?, tZaikoDeliveryDatetime.?).shaped.<>({r=>import r._; _1.map(_=> TZaikoRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_zaiko_id DBType(INT), AutoInc, PrimaryKey */
    val tZaikoId: Column[Int] = column[Int]("t_zaiko_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_zaiko_datetime DBType(DATETIME) */
    val tZaikoDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_zaiko_datetime")
    /** Database column t_zaiko_shipping_datetime DBType(DATETIME) */
    val tZaikoShippingDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_zaiko_shipping_datetime")
    /** Database column t_zaiko_delivery_datetime DBType(DATETIME) */
    val tZaikoDeliveryDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_zaiko_delivery_datetime")
  }
  /** Collection-like TableQuery object for table TZaiko */
  lazy val TZaiko = new TableQuery(tag => new TZaiko(tag))
  
  /** Entity class storing rows of table TZaikoitem
   *  @param tZaikoitemId Database column t_zaikoitem_id DBType(INT), AutoInc, PrimaryKey
   *  @param tZaikoitemConfirmQuantity Database column t_zaikoitem_confirm_quantity DBType(DECIMAL)
   *  @param tZaikoitemQuantity Database column t_zaikoitem_quantity DBType(DECIMAL)
   *  @param tZaikoitemDatetime Database column t_zaikoitem_datetime DBType(DATETIME)
   *  @param tZaikoitemDeliveryQuantity Database column t_zaikoitem_delivery_quantity DBType(DECIMAL)
   *  @param tZaikoitemDeliveryDatetime Database column t_zaikoitem_delivery_datetime DBType(DATETIME)
   *  @param tZaikoitemShippingDatetime Database column t_zaikoitem_shipping_datetime DBType(DATETIME)
   *  @param tZaikoitemTDeliveryCompanyId Database column t_zaikoitem_t_delivery_company_id DBType(INT), Default(0)
   *  @param tZaikoitemTrackingno Database column t_zaikoitem_trackingno DBType(VARCHAR), Length(30,true), Default()
   *  @param tZaikoitemVoidFlag Database column t_zaikoitem_void_flag DBType(TINYINT), Default(0) */
  case class TZaikoitemRow(tZaikoitemId: Int, tZaikoitemConfirmQuantity: scala.math.BigDecimal, tZaikoitemQuantity: scala.math.BigDecimal, tZaikoitemDatetime: java.sql.Timestamp, tZaikoitemDeliveryQuantity: scala.math.BigDecimal, tZaikoitemDeliveryDatetime: java.sql.Timestamp, tZaikoitemShippingDatetime: java.sql.Timestamp, tZaikoitemTDeliveryCompanyId: Int = 0, tZaikoitemTrackingno: String = "", tZaikoitemVoidFlag: Byte = 0)
  /** GetResult implicit for fetching TZaikoitemRow objects using plain SQL queries */
  implicit def GetResultTZaikoitemRow(implicit e0: GR[Int], e1: GR[scala.math.BigDecimal], e2: GR[java.sql.Timestamp], e3: GR[String], e4: GR[Byte]): GR[TZaikoitemRow] = GR{
    prs => import prs._
    TZaikoitemRow.tupled((<<[Int], <<[scala.math.BigDecimal], <<[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Int], <<[String], <<[Byte]))
  }
  /** Table description of table t_zaikoitem. Objects of this class serve as prototypes for rows in queries. */
  class TZaikoitem(_tableTag: Tag) extends Table[TZaikoitemRow](_tableTag, "t_zaikoitem") {
    def * = (tZaikoitemId, tZaikoitemConfirmQuantity, tZaikoitemQuantity, tZaikoitemDatetime, tZaikoitemDeliveryQuantity, tZaikoitemDeliveryDatetime, tZaikoitemShippingDatetime, tZaikoitemTDeliveryCompanyId, tZaikoitemTrackingno, tZaikoitemVoidFlag) <> (TZaikoitemRow.tupled, TZaikoitemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (tZaikoitemId.?, tZaikoitemConfirmQuantity.?, tZaikoitemQuantity.?, tZaikoitemDatetime.?, tZaikoitemDeliveryQuantity.?, tZaikoitemDeliveryDatetime.?, tZaikoitemShippingDatetime.?, tZaikoitemTDeliveryCompanyId.?, tZaikoitemTrackingno.?, tZaikoitemVoidFlag.?).shaped.<>({r=>import r._; _1.map(_=> TZaikoitemRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))
    
    /** Database column t_zaikoitem_id DBType(INT), AutoInc, PrimaryKey */
    val tZaikoitemId: Column[Int] = column[Int]("t_zaikoitem_id", O.AutoInc, O.PrimaryKey)
    /** Database column t_zaikoitem_confirm_quantity DBType(DECIMAL) */
    val tZaikoitemConfirmQuantity: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_zaikoitem_confirm_quantity")
    /** Database column t_zaikoitem_quantity DBType(DECIMAL) */
    val tZaikoitemQuantity: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_zaikoitem_quantity")
    /** Database column t_zaikoitem_datetime DBType(DATETIME) */
    val tZaikoitemDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_zaikoitem_datetime")
    /** Database column t_zaikoitem_delivery_quantity DBType(DECIMAL) */
    val tZaikoitemDeliveryQuantity: Column[scala.math.BigDecimal] = column[scala.math.BigDecimal]("t_zaikoitem_delivery_quantity")
    /** Database column t_zaikoitem_delivery_datetime DBType(DATETIME) */
    val tZaikoitemDeliveryDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_zaikoitem_delivery_datetime")
    /** Database column t_zaikoitem_shipping_datetime DBType(DATETIME) */
    val tZaikoitemShippingDatetime: Column[java.sql.Timestamp] = column[java.sql.Timestamp]("t_zaikoitem_shipping_datetime")
    /** Database column t_zaikoitem_t_delivery_company_id DBType(INT), Default(0) */
    val tZaikoitemTDeliveryCompanyId: Column[Int] = column[Int]("t_zaikoitem_t_delivery_company_id", O.Default(0))
    /** Database column t_zaikoitem_trackingno DBType(VARCHAR), Length(30,true), Default() */
    val tZaikoitemTrackingno: Column[String] = column[String]("t_zaikoitem_trackingno", O.Length(30,varying=true), O.Default(""))
    /** Database column t_zaikoitem_void_flag DBType(TINYINT), Default(0) */
    val tZaikoitemVoidFlag: Column[Byte] = column[Byte]("t_zaikoitem_void_flag", O.Default(0))
  }
  /** Collection-like TableQuery object for table TZaikoitem */
  lazy val TZaikoitem = new TableQuery(tag => new TZaikoitem(tag))
}