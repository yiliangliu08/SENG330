
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

object whaleForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Observation,Form[WhaleData],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(observation: Observation, whaleForm: Form[WhaleData])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*4.2*/section/*4.9*/(whaleForm: Form[WhaleData]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.41*/("""
    """),_display_(/*5.6*/helper/*5.12*/.form(routes.WhaleController.handleResult(obsId = observation.getId))/*5.81*/ {_display_(Seq[Any](format.raw/*5.83*/("""
    """),_display_(/*6.6*/helper/*6.12*/.CSRF.formField),format.raw/*6.27*/("""
    """),_display_(/*7.6*/helper/*7.12*/.select(whaleForm("species"), _root_.utils.FormUtils.doubleString(WhaleData.speciesOptions()))),format.raw/*7.106*/("""
    """),_display_(/*8.6*/helper/*8.12*/.inputText(whaleForm("weight"))),format.raw/*8.43*/("""
    """),_display_(/*9.6*/helper/*9.12*/.select(whaleForm("gender"),  _root_.utils.FormUtils.doubleString(WhaleData.genderOptions()))),format.raw/*9.105*/("""
    """),format.raw/*10.5*/("""<input type="submit"/>
    """)))}),format.raw/*11.6*/("""
""")))};def /*13.6*/optionBuildGender/*13.23*/(gender: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.43*/("""
        """),format.raw/*14.9*/("""<option value=""""),_display_(/*14.25*/gender),format.raw/*14.31*/("""" >"""),_display_(/*14.35*/gender),format.raw/*14.41*/("""</option>
    """)))};def /*17.6*/optionBuildSpecies/*17.24*/(species: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.45*/("""
        """),format.raw/*18.9*/("""<option value=""""),_display_(/*18.25*/species),format.raw/*18.32*/("""" >"""),_display_(/*18.36*/species),format.raw/*18.43*/("""</option>
    """)))};def /*21.2*/panelVersion/*21.14*/(whaleForm: Form[WhaleData]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.44*/("""
    """),format.raw/*22.5*/("""<div class="panel">
        <div class="image-wrapper">
            <img src="/assets/images/unknown.png"  alt="unknown whale"/>
        </div>
        <form action=""""),_display_(/*26.24*/routes/*26.30*/.WhaleController.handleResult(obsId = observation.getId)),format.raw/*26.86*/("""" onsubmit="validateWhaleInput('#estimatedWeight')" method="POST">
            """),_display_(/*27.14*/helper/*27.20*/.CSRF.formField),format.raw/*27.35*/("""
            """),format.raw/*28.13*/("""<h4 class="whale_info">
                <div>Species:
                    <select id="species" name="species">
                        """),_display_(/*31.26*/WhaleData/*31.35*/.speciesOptions().asScala.map(x => optionBuildSpecies(x))),format.raw/*31.92*/("""
                    """),format.raw/*32.21*/("""</select>
                </div></h4>
            <h5 class="whale_info">
                <div>Estimated Weight: <input type="text" id="estimatedWeight" min=0 name="estimatedWeight" placeholder="Min. 0" value=""> kg </div>
            </h5>
            <h6 class="whale_info">
                <div>Gender:
                    <select id="gender" name="gender" >
                        """),_display_(/*40.26*/WhaleData/*40.35*/.genderOptions().asScala.map(x => optionBuildGender(x))),format.raw/*40.90*/("""
                    """),format.raw/*41.21*/("""</select>
                </div>
            </h6>
            <div class= "whale_info"> <input type="submit" id="whale_submit" disabled="disabled"/></div>
        </form>
    </div>

    <script>
        $(document).ready(function () """),format.raw/*49.39*/("""{"""),format.raw/*49.40*/("""
            """),format.raw/*50.13*/("""bindValidator('#estimatedWeight');
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/(""");
    </script>
""")))};
Seq[Any](format.raw/*2.118*/("""

"""),format.raw/*12.2*/("""
    """),format.raw/*15.6*/("""

    """),format.raw/*19.6*/("""

"""),format.raw/*53.2*/("""

"""),_display_(/*55.2*/panelVersion(whaleForm)))
      }
    }
  }

  def render(observation:Observation,whaleForm:Form[WhaleData],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(observation,whaleForm)(request,messages)

  def f:((Observation,Form[WhaleData]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (observation,whaleForm) => (request,messages) => apply(observation,whaleForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:43.684162600
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/whaleForm.scala.html
                  HASH: 36abc1e09bd35dd012c3aae8a2049df915c211ec
                  MATRIX: 964->3|1158->124|1172->131|1280->163|1312->170|1326->176|1403->245|1442->247|1474->254|1488->260|1523->275|1555->282|1569->288|1684->382|1716->389|1730->395|1781->426|1813->433|1827->439|1941->532|1974->538|2033->567|2059->577|2085->594|2182->614|2219->624|2262->640|2289->646|2320->650|2347->656|2386->681|2413->699|2511->720|2548->730|2591->746|2619->753|2650->757|2678->764|2717->785|2738->797|2847->827|2880->833|3078->1004|3093->1010|3170->1066|3278->1147|3293->1153|3329->1168|3371->1182|3537->1321|3555->1330|3633->1387|3683->1409|4105->1804|4123->1813|4199->1868|4249->1890|4520->2133|4549->2134|4591->2148|4662->2192|4691->2193|4751->119|4782->570|4815->672|4850->780|4881->2213|4912->2218
                  LINES: 27->2|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|40->11|41->13|41->13|43->13|44->14|44->14|44->14|44->14|44->14|45->17|45->17|47->17|48->18|48->18|48->18|48->18|48->18|49->21|49->21|51->21|52->22|56->26|56->26|56->26|57->27|57->27|57->27|58->28|61->31|61->31|61->31|62->32|70->40|70->40|70->40|71->41|79->49|79->49|80->50|81->51|81->51|84->2|86->12|87->15|89->19|91->53|93->55
                  -- GENERATED --
              */
          