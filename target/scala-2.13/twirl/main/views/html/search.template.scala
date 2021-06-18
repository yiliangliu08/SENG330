
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[SearchData],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(searchForm: Form[SearchData])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*16.6*/optionBuildSpecies/*16.24*/(species: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.45*/("""
    """),format.raw/*17.5*/("""<option value=""""),_display_(/*17.21*/species),format.raw/*17.28*/("""" >"""),_display_(/*17.32*/species),format.raw/*17.39*/("""</option>
    """)))};
Seq[Any](format.raw/*2.94*/("""

"""),format.raw/*4.1*/("""<div class="search_panel center">
    <h2><b>Whale Search</b></h2>
    Enter the whale species and/or date that you would like to search for.
    <br /><hr/>
<form id="searchForm"action=""""),_display_(/*8.31*/routes/*8.37*/.SearchController.search()),format.raw/*8.63*/("""" class="vertically-centered search_fields">
    """),_display_(/*9.6*/helper/*9.12*/.CSRF.formField),format.raw/*9.27*/("""
    """),_display_(/*10.6*/{
        val v = WhaleData.speciesOptions();
        v.add(0, "");
        helper.select(searchForm("Species"), _root_.utils.FormUtils.doubleString(v))
    }),format.raw/*14.6*/("""
    """),_display_(/*15.6*/helper/*15.12*/.inputText(searchForm("time"), Symbol("_label") -> "Date & Time:")),format.raw/*15.78*/("""
    """),format.raw/*18.6*/("""
    """),format.raw/*19.5*/("""<input type="submit" value="Search" id="search" formmethod="post">

    <input type="submit" value="Reset" id="reset" formmethod="get">
</form>

</div>
"""))
      }
    }
  }

  def render(searchForm:Form[SearchData],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(searchForm)(request,messages)

  def f:((Form[SearchData]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (searchForm) => (request,messages) => apply(searchForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:35:02.901735
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/search.scala.html
                  HASH: b16a9633939aee8d356d362fd03f0c5868923abd
                  MATRIX: 950->3|1121->650|1148->668|1246->689|1279->695|1322->711|1350->718|1381->722|1409->729|1464->95|1494->99|1712->291|1726->297|1772->323|1848->374|1862->380|1897->395|1930->402|2112->564|2145->571|2160->577|2247->643|2280->745|2313->751
                  LINES: 27->2|31->16|31->16|33->16|34->17|34->17|34->17|34->17|34->17|36->2|38->4|42->8|42->8|42->8|43->9|43->9|43->9|44->10|48->14|49->15|49->15|49->15|50->18|51->19
                  -- GENERATED --
              */
          