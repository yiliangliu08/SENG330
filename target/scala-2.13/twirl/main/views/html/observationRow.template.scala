
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
/*1.2*/import java.time.format.DateTimeFormatter
/*2.2*/import java.time.format.FormatStyle

object observationRow extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Observation,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(observation: Observation):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.28*/("""

"""),format.raw/*5.1*/("""<tr onclick="redirect('/observation/"""),_display_(/*5.38*/observation/*5.49*/.getId),format.raw/*5.55*/("""')">
    <td>
        """),_display_(/*7.10*/{
            try {
                val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                formatter.format(observation.getTime)
            } catch{
            case e: Exception => e.getMessage
            }
        }),format.raw/*14.10*/("""
    """),format.raw/*15.5*/("""</td>
    <td>
        """),_display_(/*17.10*/observation/*17.21*/.getWhales.size),format.raw/*17.36*/("""
    """),format.raw/*18.5*/("""</td>
    <td>
        """),_display_(/*20.10*/observation/*20.21*/.getLocation),format.raw/*20.33*/("""
    """),format.raw/*21.5*/("""</td>
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
                  DATE: 2020-12-11T18:28:43.165072600
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/observationRow.scala.html
                  HASH: 666a8bff857a0346679fbd90aec72e467e11d635
                  MATRIX: 610->1|659->45|1013->83|1134->109|1164->113|1227->150|1246->161|1272->167|1323->192|1605->453|1638->459|1691->485|1711->496|1747->511|1780->517|1833->543|1853->554|1886->566|1919->572
                  LINES: 23->1|24->2|29->3|34->3|36->5|36->5|36->5|36->5|38->7|45->14|46->15|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21
                  -- GENERATED --
              */
          