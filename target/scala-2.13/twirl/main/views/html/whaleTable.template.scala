
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
/*3.2*/import java.time.format.DateTimeFormatter
/*4.2*/import java.time.format.FormatStyle
/*5.2*/import java.util.function.BiPredicate

object whaleTable extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[util.List[Observation],BiPredicate[Observation, Whale],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(observations: util.List[Observation], filter: BiPredicate[Observation, Whale]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/row/*8.5*/(observation: Observation, whale: Whale):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.47*/("""
    """),format.raw/*9.5*/("""<tr onclick="redirect('/observation/"""),_display_(/*9.42*/observation/*9.53*/.getId),format.raw/*9.59*/("""')">
        <td>
            """),_display_(/*11.14*/whale/*11.19*/.getId),format.raw/*11.25*/("""
        """),format.raw/*12.9*/("""</td>
        <td>
            """),_display_(/*14.14*/whale/*14.19*/.getSpecies),format.raw/*14.30*/("""
        """),format.raw/*15.9*/("""</td>
        <td>
            """),_display_(/*17.14*/whale/*17.19*/.getEstimatedWeight),format.raw/*17.38*/("""
        """),format.raw/*18.9*/("""</td>
        <td>
            """),_display_(/*20.14*/whale/*20.19*/.getGender),format.raw/*20.29*/("""
        """),format.raw/*21.9*/("""</td>
        <td>
            """),_display_(/*23.14*/{
                try {
                    val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                    formatter.format(observation.getTime)
                } catch{
                    case e: Exception => e.getMessage
                }
            }),format.raw/*30.14*/("""
        """),format.raw/*31.9*/("""</td>
        <td>
            """),_display_(/*33.14*/observation/*33.25*/.getLocation),format.raw/*33.37*/("""
        """),format.raw/*34.9*/("""</td>
    </tr>
""")))};
Seq[Any](format.raw/*6.81*/("""

"""),format.raw/*36.2*/("""

"""),format.raw/*38.1*/("""<table id="whaleTable" class="tablesorter-bootstrap tablesorter tablesorter5f8107d9a9ca table table-bordered table-striped center">
    <thead>
        <tr>
            <th class="filter-select filter-exact" data-placeholder="Pick an ID">
                ID
            </th>
            <th class="filter-select filter-exact" data-placeholder="Pick a species">
                Species
            </th>
            <th>
                Estimated Weight (kg)
            </th>
            <th class="filter-select filter-exact" data-placeholder="Pick a gender">
                Gender
            </th>
            <th data-sorter="shortDate" >
                Date
            </th>
            <th>
                Location
            </th>
        </tr>
    </thead>
    <tbody>
        """),_display_(/*62.10*/{
            observations.flatMap(ob => ob.getWhales.map(w => (ob, w)))
                    .filter(tup => filter.test(tup._1, tup._2))
                    .map(tup => (row _).tupled(tup))
        }),format.raw/*66.10*/("""
    """),format.raw/*67.5*/("""</tbody>

</table>"""))
      }
    }
  }

  def render(observations:util.List[Observation],filter:BiPredicate[Observation, Whale]): play.twirl.api.HtmlFormat.Appendable = apply(observations,filter)

  def f:((util.List[Observation],BiPredicate[Observation, Whale]) => play.twirl.api.HtmlFormat.Appendable) = (observations,filter) => apply(observations,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:43.774577600
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/whaleTable.scala.html
                  HASH: e1ca390b23f2452a4445a357b8ec6f641e4c01b7
                  MATRIX: 610->1|634->22|683->66|726->104|1121->144|1278->228|1288->231|1408->273|1440->279|1503->316|1522->327|1548->333|1608->366|1622->371|1649->377|1686->387|1747->421|1761->426|1793->437|1830->447|1891->481|1905->486|1945->505|1982->515|2043->549|2057->554|2088->564|2125->574|2186->608|2500->901|2537->911|2598->945|2618->956|2651->968|2688->978|2746->223|2777->997|2808->1001|3651->1817|3875->2020|3908->2026
                  LINES: 23->1|24->3|25->4|26->5|31->6|35->8|35->8|37->8|38->9|38->9|38->9|38->9|40->11|40->11|40->11|41->12|43->14|43->14|43->14|44->15|46->17|46->17|46->17|47->18|49->20|49->20|49->20|50->21|52->23|59->30|60->31|62->33|62->33|62->33|63->34|66->6|68->36|70->38|94->62|98->66|99->67
                  -- GENERATED --
              */
          