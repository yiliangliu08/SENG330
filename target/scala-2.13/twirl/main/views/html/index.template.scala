
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[util.List[Observation],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(observations: util.List[Observation]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*6.2*/section/*6.9*/(observations: util.List[Observation]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.51*/("""
    """),format.raw/*7.5*/("""<h1 class="center" style="font-family: Arial, Helvetica, sans-serif;">Welcome to Whale Watchers!</h1><hr/>

    <p class="center">
    Start by clicking <a href=""""),_display_(/*10.33*/routes/*10.39*/.ObservationController.createObservation()),format.raw/*10.81*/("""">
        <button class="btn btn-primary" id="menu-toggle" style="color: black">Add Observation
        </button></a><br/>

        Once you have created the initial observation record, you can add the whales as you saw.
        <br /><br />
    </p>

    """),_display_(/*18.6*/if(observations.nonEmpty)/*18.31*/ {_display_(Seq[Any](format.raw/*18.33*/("""
        """),format.raw/*19.9*/("""<p class="center">
            A summary of all active observations is given below.
            The columns are sortable, click the table headers to do so. Click on a table
            row to see the whale details of that observation.
        </p>

        """),_display_(/*25.10*/views/*25.15*/.html.observationTable(observations)),format.raw/*25.51*/("""
    """)))}),format.raw/*26.6*/("""
""")))};
Seq[Any](format.raw/*4.40*/("""

"""),format.raw/*27.2*/("""

"""),_display_(/*29.2*/views/*29.7*/.html.htmlHeader(section(observations))))
      }
    }
  }

  def render(observations:util.List[Observation]): play.twirl.api.HtmlFormat.Appendable = apply(observations)

  def f:((util.List[Observation]) => play.twirl.api.HtmlFormat.Appendable) = (observations) => apply(observations)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:43.009489200
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/index.scala.html
                  HASH: d6a54afc3a830d567c7b7334818f8644d7750824
                  MATRIX: 610->1|947->24|1063->67|1077->74|1195->116|1227->122|1420->288|1435->294|1498->336|1790->602|1824->627|1864->629|1901->639|2192->903|2206->908|2263->944|2300->951|2342->62|2373->954|2404->959|2417->964
                  LINES: 23->1|28->4|32->6|32->6|34->6|35->7|38->10|38->10|38->10|46->18|46->18|46->18|47->19|53->25|53->25|53->25|54->26|56->4|58->27|60->29|60->29
                  -- GENERATED --
              */
          