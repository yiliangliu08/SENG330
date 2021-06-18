
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
/*1.2*/import play.mvc.Http.MimeTypes._

object api_info extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/section/*5.9*/():play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.15*/("""
    """),format.raw/*6.5*/("""<h1><div class="center" style="font-family: Arial, Helvetica, sans-serif;">Using the REST API</div></h1><hr/>

    <div class="center" style="margin: 35px">In order to provide a useful functionality to expose the results of the Whale Watchers app for
    external analysis there is an API to get information on the observed whales in JSON format.

    Below are a few examples of how to use the api.
    The response will be updated dynamically to show the live results.
    A well formatted request only accepts a json response and contains no parameters.
    </div>
    <div class="request_info">
    <span class="response">Status: 200</span>
        <h4>Request</h4>

        <code>
            Accepts: ["""),_display_(/*20.24*/JSON),format.raw/*20.28*/("""]<br />
            GET /whales
        </code>
        <h4>Response</h4>
        <code id="valid_json" >
        </code>
        <br />
    </div>
    <div class="request_info">
        Error 422 is thrown if any parameters are specified<hr/>

        <span class="response">Status: 422</span>
        <h4>Request</h4>
        <code>
            Accepts: ["""),_display_(/*34.24*/JSON),format.raw/*34.28*/("""]
            GET /whales?any=parameters
        </code>
        <h4>Response</h4>
        <code id="invalid_json">
        </code>
    </div>

    <script>
            $(document).ready(function () """),format.raw/*43.43*/("""{"""),format.raw/*43.44*/("""
                """),format.raw/*44.17*/("""doSampleJson('/whales', '#valid_json');
                doSampleJson('/whales?any=parameter', '#invalid_json');
            """),format.raw/*46.13*/("""}"""),format.raw/*46.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*2.4*/("""


"""),format.raw/*48.2*/("""

"""),_display_(/*50.2*/htmlHeader(section())))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:42.754020900
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/api_info.scala.html
                  HASH: f01f505204f622749a2bb927184722964aa9bca8
                  MATRIX: 610->1|943->36|1023->45|1037->52|1119->58|1151->64|1901->787|1926->791|2325->1163|2350->1167|2586->1375|2615->1376|2661->1394|2815->1520|2844->1521|2902->38|2935->1541|2966->1546
                  LINES: 23->1|28->2|32->5|32->5|34->5|35->6|49->20|49->20|63->34|63->34|72->43|72->43|73->44|75->46|75->46|78->2|81->48|83->50
                  -- GENERATED --
              */
          