package speed.trans

import java.sql.{Connection,DriverManager}

import scalaj.http._
import java.io._
import net.liftweb.json._

import java.net.URLEncoder
class TranslateApp {
  val url = "jdbc:mysql://192.168.1.145/speedSTATAS"
  val driver = "com.mysql.jdbc.Driver"
  val username = "root"
  val password = "123456"
  var connection: Connection = _

  val ids: Array[Int] = new Array[Int](5);

  var param_string: String = "";
  var param_app_id: String = "";
  var param_title_jps: String = "";
  var param_marks: String = "";
  var param_revisions: String = "";

  def doTrans() {
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement
      val rs = statement.executeQuery("SELECT id,app_id,name_jp,marketing_txt,revision from items_for_trans WHERE status='y'  order by translated limit 5 ")

      var i = 0;
      val mk = URLEncoder.encode("[]");
      while (rs.next) {
        val app_id = rs.getInt("app_id")
        val name_jp = rs.getString("name_jp")
        val marketing_txt = rs.getString("marketing_txt")
        val revision = rs.getString("revision");
        ids(i) = app_id
        param_app_id += "ids" + mk + "=" + app_id + "&"
        param_title_jps += "title_jps" + mk + "=" + name_jp + "&"
        param_marks += "marks" + mk + "=" + marketing_txt + "&"
        param_revisions += "revisions" + mk + "=" + revision + "&"
        i += 1
        println("app_id = %d, name_jp = %s, mark = %s".format(app_id, name_jp, marketing_txt))
      }
    } catch {
      case e: Exception => e.printStackTrace
    }

    connection.close

    param_string = "http://admin.max.com/api/remote_act?" + param_app_id + param_title_jps + param_marks + param_revisions + "a=translate_item_app";
    println(param_string);

    val res: HttpResponse[String] = Http(param_string)
                                    .option(HttpOptions.connTimeout(1000))
                                    .option(HttpOptions.readTimeout(5000))
                                    .header("content-type", "application/json").asString;

    println(res)

    //System.exit(1)

    val json = parse(res.body)
    println(json)
    val JInt(err) = json \ "err"

    println(err)
    var ss = for {
      JObject(child) <- json \ "items"
      JField("err", JInt(err)) <- child
      JField("msg", JString(msg)) <- child
    } println(err + ":" + msg)

    //val get_req = "http://localhost/cgi-bin/items_dev.pl?m_c=maxkerrer&a=get&s_t="+token
    //println(get_req)
    //val data = (Http(get_req).option(HttpOptions.connTimeout(1000)).option(HttpOptions.readTimeout(5000))){inputStream => 
    //     JsonParser.parse(new InputStreamReader(inputStream))
    // }
    //println(data)

  }

}
