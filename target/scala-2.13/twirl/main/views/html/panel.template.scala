
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

object panel extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Observation,Whale,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(observation: Observation, whale: Whale):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*3.1*/("""<div class="panel">
    <a class="delete" href=""""),_display_(/*4.30*/routes/*4.36*/.WhaleController.removeWhale(observation.getId, whale.getId)),format.raw/*4.96*/("""">
    </a>
    <div class="image-wrapper">
        <img style="object-fit: contain" src="/assets/images/"""),_display_(/*7.63*/{whale.getSpecies.toString.toLowerCase}),format.raw/*7.102*/(""".png"  alt=""""),_display_(/*7.115*/{whale.getSpecies}),format.raw/*7.133*/(""""/>
    </div>
    <h1 class="title">"""),_display_(/*9.24*/{whale.getSpecies}),format.raw/*9.42*/(""" """),format.raw/*9.43*/("""Whale</h1>
    <hr/>
    <h4 class="center">Identification: """),_display_(/*11.41*/whale/*11.46*/.getId),format.raw/*11.52*/("""</h4>
    <div class="whale_info vertically-centered">
        <h5>Estimated Weight: """),_display_(/*13.32*/whale/*13.37*/.getEstimatedWeight),format.raw/*13.56*/(""" """),format.raw/*13.57*/("""kg</h5>
        <h5>Gender: """),_display_(/*14.22*/whale/*14.27*/.getGender),format.raw/*14.37*/("""</h5>
    </div>
</div>"""))
      }
    }
  }

  def render(observation:Observation,whale:Whale): play.twirl.api.HtmlFormat.Appendable = apply(observation,whale)

  def f:((Observation,Whale) => play.twirl.api.HtmlFormat.Appendable) = (observation,whale) => apply(observation,whale)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:43.258087400
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/panel.scala.html
                  HASH: ff77029c04470288dc30cf1602bcbbe8c3b0add0
                  MATRIX: 918->1|1053->41|1083->45|1159->95|1173->101|1253->161|1388->270|1448->309|1488->322|1527->340|1593->380|1631->398|1659->399|1749->462|1763->467|1790->473|1905->561|1919->566|1959->585|1988->586|2045->616|2059->621|2090->631
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|38->7|38->7|38->7|38->7|40->9|40->9|40->9|42->11|42->11|42->11|44->13|44->13|44->13|44->13|45->14|45->14|45->14
                  -- GENERATED --
              */
          