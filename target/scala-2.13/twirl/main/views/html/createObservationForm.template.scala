
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

object createObservationForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[ObservationData],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(observationForm: Form[ObservationData])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*4.2*/section/*4.9*/(whaleForm: Form[ObservationData]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.47*/("""
"""),format.raw/*5.1*/("""<div class="obs_panel center">
    <h2><b>Create Observation</b></h2>
    Before adding whales, please provide the location where the whales were seen and the time of the observation.
    <br /><hr/>
    """),_display_(/*9.6*/helper/*9.12*/.form(routes.ObservationController.createObservation())/*9.67*/ {_display_(Seq[Any](format.raw/*9.69*/("""
    """),_display_(/*10.6*/helper/*10.12*/.CSRF.formField),format.raw/*10.27*/("""
    """),_display_(/*11.6*/helper/*11.12*/.inputText(whaleForm("location"),  Symbol("_label") -> "Location Where the Whales Were Seen")),format.raw/*11.105*/("""
    """),_display_(/*12.6*/helper/*12.12*/.inputText(whaleForm("time"), Symbol("class") -> "datetimepicker",
        Symbol("_label") -> "Date & Time of Sighting")),format.raw/*13.55*/("""
    """),format.raw/*14.5*/("""<input type="submit"/>
    """)))}),format.raw/*15.6*/("""
""")))};
Seq[Any](format.raw/*2.104*/("""

"""),format.raw/*16.2*/("""</div>
"""),_display_(/*17.2*/htmlHeader(section(observationForm))))
      }
    }
  }

  def render(observationForm:Form[ObservationData],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(observationForm)(request,messages)

  def f:((Form[ObservationData]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (observationForm) => (request,messages) => apply(observationForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:42.862372500
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/createObservationForm.scala.html
                  HASH: 6f3eed7c16cb6a3a7cb048ca04c1003fadf6827f
                  MATRIX: 970->3|1150->110|1164->117|1278->155|1306->157|1540->366|1554->372|1617->427|1656->429|1689->436|1704->442|1740->457|1773->464|1788->470|1903->563|1936->570|1951->576|2094->698|2127->704|2186->733|2229->105|2260->736|2295->745
                  LINES: 27->2|31->4|31->4|33->4|34->5|38->9|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|42->13|43->14|44->15|46->2|48->16|49->17
                  -- GENERATED --
              */
          