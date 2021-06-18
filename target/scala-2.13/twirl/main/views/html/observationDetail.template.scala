
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

object observationDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Observation,Form[WhaleData],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(observation: Observation, whaleForm: Form[WhaleData])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*4.2*/section/*4.9*/(observation: Observation):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.38*/("""
    """),format.raw/*5.5*/("""<section id="obsDetail">
        <h1 class="center">Observation Table """),_display_(/*6.47*/observation/*6.58*/.getId),format.raw/*6.64*/(""" """),format.raw/*6.65*/("""</h1><hr/>
        <p class="center">
        A summary of observation list """),_display_(/*8.40*/observation/*8.51*/.getId),format.raw/*8.57*/(""" """),format.raw/*8.58*/("""is given below.
        The columns are sortable, click the table headers to do so. Click on a table
        row to see the whale details of that observation.
        The observed whales are shown as well.
        </p>
        <section class="obsInfo">

            """),_display_(/*15.14*/views/*15.19*/.html.observationTable(Collections.singletonList(observation))),format.raw/*15.81*/("""

        """),format.raw/*17.9*/("""</section>

        <section class="card-group">
            """),_display_(/*20.14*/observation/*20.25*/.getWhales.map(x => views.html.panel(observation, x))),format.raw/*20.78*/("""
            """),_display_(/*21.14*/views/*21.19*/.html.whaleForm(observation, whaleForm)),format.raw/*21.58*/("""
        """),format.raw/*22.9*/("""</section>
    </section>
""")))};
Seq[Any](format.raw/*2.118*/("""

"""),format.raw/*24.2*/("""

"""),_display_(/*26.2*/htmlHeader(section(observation))),format.raw/*26.34*/("""
"""))
      }
    }
  }

  def render(observation:Observation,whaleForm:Form[WhaleData],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(observation,whaleForm)(request,messages)

  def f:((Observation,Form[WhaleData]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (observation,whaleForm) => (request,messages) => apply(observation,whaleForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:43.126669200
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/observationDetail.scala.html
                  HASH: 2ac55bc8f6a432f3829eb73b10ec54a20a6e81f0
                  MATRIX: 972->3|1166->124|1180->131|1286->160|1318->166|1416->238|1435->249|1461->255|1489->256|1594->335|1613->346|1639->352|1667->353|1968->627|1982->632|2065->694|2104->706|2196->771|2216->782|2290->835|2332->850|2346->855|2406->894|2443->904|2512->119|2543->933|2574->938|2627->970
                  LINES: 27->2|31->4|31->4|33->4|34->5|35->6|35->6|35->6|35->6|37->8|37->8|37->8|37->8|44->15|44->15|44->15|46->17|49->20|49->20|49->20|50->21|50->21|50->21|51->22|54->2|56->24|58->26|58->26
                  -- GENERATED --
              */
          