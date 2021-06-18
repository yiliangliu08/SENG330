
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

object searchTable extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[util.List[Observation],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(searches: util.List[Observation]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.36*/("""

"""),format.raw/*5.1*/("""<table id="observationTable" class="observation-table sortable">
    <thead>
        <tr>
            <th>
                Index
            </th>
            <th>
                Date
            </th>
            <th>
                Pod Size
            </th>
            <th>
                Location
            </th>
        </tr>
    </thead>
    <tbody>
        """),_display_(/*23.10*/searches/*23.18*/.map(ob => {
            views.html.observationRow(ob)
        })),format.raw/*25.11*/("""
    """),format.raw/*26.5*/("""</tbody>

</table>

"""))
      }
    }
  }

  def render(searches:util.List[Observation]): play.twirl.api.HtmlFormat.Appendable = apply(searches)

  def f:((util.List[Observation]) => play.twirl.api.HtmlFormat.Appendable) = (searches) => apply(searches)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:43.642678600
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/searchTable.scala.html
                  HASH: 3ec43ae44a876fb57354d17fe701fb088cd1f9c9
                  MATRIX: 610->1|953->22|1082->56|1112->60|1528->449|1545->457|1633->524|1666->530
                  LINES: 23->1|28->3|33->3|35->5|53->23|53->23|55->25|56->26
                  -- GENERATED --
              */
          