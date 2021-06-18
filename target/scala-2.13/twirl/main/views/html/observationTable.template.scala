
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

object observationTable extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[util.List[Observation],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(observations: util.List[Observation]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.40*/("""
"""),format.raw/*4.1*/("""<table id="observationTable" class="observation-table sortable center">
    <thead>
        <tr>
            <th data-sorter="shortDate" >
                Date
            </th>
            <th>
                Whales Observed
            </th>
            <th>
                Location
            </th>
        </tr>
    </thead>
    <tbody>
        """),_display_(/*19.10*/observations/*19.22*/.map(ob => {
            views.html.observationRow(ob)
        })),format.raw/*21.11*/("""
    """),format.raw/*22.5*/("""</tbody>

</table>

"""))
      }
    }
  }

  def render(observations:util.List[Observation]): play.twirl.api.HtmlFormat.Appendable = apply(observations)

  def f:((util.List[Observation]) => play.twirl.api.HtmlFormat.Appendable) = (observations) => apply(observations)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:43.247922400
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/observationTable.scala.html
                  HASH: c738ab956d16393961dd60300018ab48358d2fea
                  MATRIX: 610->1|958->22|1091->60|1119->62|1514->430|1535->442|1623->509|1656->515
                  LINES: 23->1|28->3|33->3|34->4|49->19|49->19|51->21|52->22
                  -- GENERATED --
              */
          