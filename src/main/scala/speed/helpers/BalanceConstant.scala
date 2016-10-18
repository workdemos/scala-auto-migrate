package speed.helpers

import scala.util.control.Exception
import java.lang.Boolean

object BalanceConstant {
  /**
   * FUND_CLASS
   */
  val FC_XIN_YONG_KA: Byte = 1; //信用卡
  val FC_ZX_YINGHANG: Byte = 2; //在线银行
  val FC_HUI_KUAN: Byte = 3; //汇款
  val FC_XIANJING_YU_E: Byte = 4; //现金余额

  /**
   * FUND_FROM
   */
  val FF_POOL_CHONG_ZHI: Byte = 11; //充值
  val FF_POOL_TI_XIAN: Byte = 12; //提现
  val FF_ORDER_FU_KUAN: Byte = 21; //订单支付
  val FF_ORDER_ALL_HKUAN: Byte = 22; //全额货款支付
  val FF_ORDER_YONG_JING: Byte = 23; //货款佣金
  val FF_ORDER_CANCEL: Byte = 24; //订单取消退款
  val FF_ORDER_DD_BUCHA: Byte = 25; //订单内单品缺货退款
  val FF_ORDER_WL_BUCHA: Byte = 26; //物流重量核对补差
  val FF_ORDER_WULIU_FEI: Byte = 27; //订单运费

  /**
   * JIUFEN
   */
  val FF_JIUFEN_HKUAN: Byte = 41; //纠纷内未退款货款
  val FF_JIUFEN_TUIKUAN: Byte = 42; //纠纷退款 
  val FF_JIUFEN_WULIU_FEI: Byte = 43; //纠纷内退货物流费用
  val FF_JIUFEN_WULIU_NO_FEI: Byte = 44; //纠纷内退还物流费用

  val FF_FEI_TI_XIAN: Byte = 71; //提现费用
  val FF_FEI_FANYI: Byte = 72; //翻译费用

  val FF_QT_BUY_SMB: Byte = 81; //购买速贸币  
  val FF_QT_BUCHA: Byte = 92; //其他补差
  val FF_QT_ZHI_CHU: Byte = 93; //其他支出
  val FF_QT_SHOU_RU: Byte = 94; //其他收入
  val FF_QT_UNKNOWN: Byte = 99; // 其他为未知
  /**
   * FUND_USER
   */
  val USER_PLAT: Byte = 1;
  val USER_MAKER: Byte = 2;
  val USER_BUYER: Byte = 3;

  /**
   * FUND_CURRENCY
   */
  val CURRENCY_CNY: Byte = 1;
  val CURRENCY_JPY: Byte = 2;

  /**
   * ecchange
   */

  val EXCHANGE_CNY_JPY: Byte = 1
  val EXCHANGE_JPY_CNY: Byte = 2

  val PLAT_USER_ID: Int = 1;

  var credits = Array(2, 4);

  def getFundFromForJPY(flag: Int): Byte = {
    val fund_from = flag match {
      case 1 => FF_POOL_CHONG_ZHI
      case 2 => FF_ORDER_DD_BUCHA
      case 3 => FF_ORDER_CANCEL
      case 4 => FF_ORDER_WL_BUCHA
      case 5 => FF_POOL_TI_XIAN
      case 6 => FF_FEI_TI_XIAN
      case 7 => FF_ORDER_FU_KUAN
      case 8 => FF_QT_BUCHA
      case 9 => FF_JIUFEN_TUIKUAN
      case 10 => FF_JIUFEN_TUIKUAN
      case 11 => FF_ORDER_CANCEL
      case 13 => FF_QT_BUCHA
      case 14 => FF_QT_BUCHA
      case 15 => FF_QT_BUCHA
      case 16 => FF_ORDER_FU_KUAN
      case 17 => FF_QT_BUCHA
      case _ => FF_QT_UNKNOWN
    }

    return fund_from
  }

  def getFundFromForUSD(flag: Int): Byte = {
    val fund_from = flag match {
      case 1 => FF_QT_SHOU_RU
      case 2 => FF_ORDER_ALL_HKUAN
      case 3 => FF_ORDER_YONG_JING
      case 4 => FF_ORDER_FU_KUAN
      case 5 => FF_POOL_TI_XIAN
      case 6 => FF_FEI_TI_XIAN
      case 7 => FF_JIUFEN_HKUAN
      case _ => FF_QT_UNKNOWN
    }

    return fund_from
  }

  def getFundFromForCNY(flag: Int): Byte = {
    val fund_from = flag match {
      case 1 => FF_POOL_CHONG_ZHI
      case 2 => FF_ORDER_DD_BUCHA
      case 3 => FF_ORDER_DD_BUCHA
      case 4 => FF_ORDER_WL_BUCHA
      case 5 => FF_POOL_TI_XIAN
      case 6 => FF_FEI_TI_XIAN
      case 7 => FF_FEI_FANYI
      case 8 => FF_QT_BUY_SMB
      case 9 => FF_QT_BUY_SMB
      case _ => FF_QT_UNKNOWN
    }

    return fund_from
  }

  def getFundClass(pay_type: Int): Byte = {
    val fund_class = pay_type match {
      case 1 => FC_HUI_KUAN
      case 2 => FC_ZX_YINGHANG
      case 3 => FC_XIANJING_YU_E
      case _ => FF_QT_UNKNOWN
    }
    return fund_class
  }

  def isCreditPayment(pay_type: Int): Boolean = {
    return credits.contains(pay_type)
  }
}