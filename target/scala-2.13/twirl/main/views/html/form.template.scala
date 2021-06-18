
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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[WhaleData],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(whaleForm: Form[WhaleData])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*4.2*/section/*4.9*/(whaleForm: Form[WhaleData]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.41*/("""
    """),_display_(/*5.6*/helper/*5.12*/.form(routes.WhaleController.handleResult(0))/*5.57*/ {_display_(Seq[Any](format.raw/*5.59*/("""
    """),_display_(/*6.6*/helper/*6.12*/.CSRF.formField),format.raw/*6.27*/("""
    """),_display_(/*7.6*/helper/*7.12*/.inputText(whaleForm("species"))),format.raw/*7.44*/("""
    """),_display_(/*8.6*/helper/*8.12*/.inputText(whaleForm("location"))),format.raw/*8.45*/("""
    """),_display_(/*9.6*/helper/*9.12*/.select(whaleForm("gender"),  _root_.utils.FormUtils.doubleString(WhaleData.genderOptions()))),format.raw/*9.105*/("""
    """),_display_(/*10.6*/helper/*10.12*/.inputText(whaleForm("time"), Symbol("type") -> "datetime-local")),format.raw/*10.77*/("""
    """),format.raw/*11.5*/("""<input type="submit"/>
    """)))}),format.raw/*12.6*/("""
""")))};
Seq[Any](format.raw/*2.92*/("""

"""),format.raw/*13.2*/("""
"""),_display_(/*14.2*/htmlHeader(section(whaleForm))))
      }
    }
  }

  def render(whaleForm:Form[WhaleData],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(whaleForm)(request,messages)

  def f:((Form[WhaleData]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (whaleForm) => (request,messages) => apply(whaleForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-09T17:27:44.129424200
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/form.scala.html
                  HASH: 0a3caa2ac66e715037f7fd51eb08c2c70187aa4d
                  MATRIX: 947->3|1115->98|1129->105|1237->137|1269->144|1283->150|1336->195|1375->197|1407->204|1421->210|1456->225|1488->232|1502->238|1554->270|1586->277|1600->283|1653->316|1685->323|1699->329|1813->422|1846->429|1861->435|1947->500|1980->506|2039->535|2081->93|2112->538|2141->541
                  LINES: 27->2|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|41->12|43->2|45->13|46->14
                  -- GENERATED --
              */
          