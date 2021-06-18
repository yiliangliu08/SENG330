
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
/*3.2*/import java.util.function.BiPredicate

object whale_aggregations extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[util.List[Observation],BiPredicate[Observation, Whale],Form[SearchData],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(observations: util.List[Observation], filterFunction: BiPredicate[Observation, Whale], searchForm: Form[SearchData])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*6.2*/section/*6.9*/(observations: util.List[Observation]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.51*/("""
    """),_display_(/*7.6*/search(searchForm)),format.raw/*7.24*/("""

    """),_display_(/*9.6*/if(!observations.isEmpty)/*9.31*/ {_display_(Seq[Any](format.raw/*9.33*/("""
        """),_display_(/*10.10*/whaleTable(observations, filterFunction)),format.raw/*10.50*/("""
    """)))}),format.raw/*11.6*/("""
""")))};
Seq[Any](format.raw/*4.181*/("""

"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/htmlHeader(section(observations))))
      }
    }
  }

  def render(observations:util.List[Observation],filterFunction:BiPredicate[Observation, Whale],searchForm:Form[SearchData],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(observations,filterFunction,searchForm)(request,messages)

  def f:((util.List[Observation],BiPredicate[Observation, Whale],Form[SearchData]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (observations,filterFunction,searchForm) => (request,messages) => apply(observations,filterFunction,searchForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:43.784148600
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/whale_aggregations.scala.html
                  HASH: 7bc36b4eaf301cbcf3659eba8cf7d0eb309c6ed9
                  MATRIX: 610->1|634->22|1086->62|1343->246|1357->253|1475->295|1507->302|1545->320|1579->329|1612->354|1651->356|1689->367|1750->407|1787->414|1830->241|1861->417|1892->422
                  LINES: 23->1|24->3|29->4|33->6|33->6|35->6|36->7|36->7|38->9|38->9|38->9|39->10|39->10|40->11|42->4|44->12|46->14
                  -- GENERATED --
              */
          