
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._
/*1.2*/import java.util

object result extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,util.List[Observation],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(groupName: String, observations: util.List[Observation]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*6.2*/section/*6.9*/(groupName: String, observations: util.List[Observation]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.70*/("""
    """),format.raw/*7.5*/("""<h1>Welcome to Whale Watchers!</h1>

    <p>
        This page shows the result of search.
    </p>

"""),_display_(/*13.2*/views/*13.7*/.html.searchTable(observations)),format.raw/*13.38*/("""
""")))};
Seq[Any](format.raw/*4.59*/("""

"""),format.raw/*14.2*/("""

"""),_display_(/*16.2*/views/*16.7*/.html.htmlHeader(section(groupName, observations))))
      }
    }
  }

  def render(groupName:String,observations:util.List[Observation]): play.twirl.api.HtmlFormat.Appendable = apply(groupName,observations)

  def f:((String,util.List[Observation]) => play.twirl.api.HtmlFormat.Appendable) = (groupName,observations) => apply(groupName,observations)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:43.387731700
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/result.scala.html
                  HASH: 61b07b2018f4ffcc1141190b216abea368843cfe
                  MATRIX: 610->1|955->24|1090->86|1104->93|1241->154|1273->160|1407->268|1420->273|1472->304|1514->81|1545->307|1576->312|1589->317
                  LINES: 23->1|28->4|32->6|32->6|34->6|35->7|41->13|41->13|41->13|43->4|45->14|47->16|47->16
                  -- GENERATED --
              */
          