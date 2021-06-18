
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

object searchRow extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Observation,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(observation: Observation):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<tr onclick="redirect('/observation/"""),_display_(/*3.38*/observation/*3.49*/.getId),format.raw/*3.55*/("""')">
    <td>
    """),_display_(/*5.6*/observation/*5.17*/.getId),format.raw/*5.23*/("""
    """),format.raw/*6.5*/("""</td>
    <td>
    """),_display_(/*8.6*/observation/*8.17*/.getTime),format.raw/*8.25*/("""
    """),format.raw/*9.5*/("""</td>
    <td>
    """),_display_(/*11.6*/observation/*11.17*/.getWhales.size),format.raw/*11.32*/("""
    """),format.raw/*12.5*/("""</td>
    <td>
    """),_display_(/*14.6*/observation/*14.17*/.getLocation),format.raw/*14.29*/("""
    """),format.raw/*15.5*/("""</td>
</tr>"""))
      }
    }
  }

  def render(observation:Observation): play.twirl.api.HtmlFormat.Appendable = apply(observation)

  def f:((Observation) => play.twirl.api.HtmlFormat.Appendable) = (observation) => apply(observation)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:43.594105200
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/searchRow.scala.html
                  HASH: 670efb724d15c2b4a3c0a5b7f8664e50669f955d
                  MATRIX: 916->1|1037->27|1067->31|1130->68|1149->79|1175->85|1221->106|1240->117|1266->123|1298->129|1345->151|1364->162|1392->170|1424->176|1472->198|1492->209|1528->224|1561->230|1609->252|1629->263|1662->275|1695->281
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|42->11|42->11|42->11|43->12|45->14|45->14|45->14|46->15
                  -- GENERATED --
              */
          