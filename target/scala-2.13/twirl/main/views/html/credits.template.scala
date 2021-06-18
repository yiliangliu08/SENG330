
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

object credits extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/section/*2.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.11*/("""
    """),format.raw/*3.5*/("""<h1 class="center" style="font-family: Arial, Helvetica, sans-serif;">Whale Watchers SENG 330 Final Project<hr/></h1>
    <br />
    <div class="center" style="font-family: Arial, Helvetica, sans-serif;">December 2020

    <p>
        <strong>Group 6:</strong><br />
        Alec Krawciw<br />
        Charles Yang<br />
        Diana Borinaga<br />
        Kenil Shah <br />
        Yiliang Liu <br />
    </p>

        <div class="credits-panel">
        <h2>Image Credits:</h2><hr/>
        <a class="block" href="https://creazilla.com/nodes/1052-sperm-whale-silhouette">https://creazilla.com/nodes/1052-sperm-whale-silhouette</a>
        <a class="block" href="https://www.freeicons.io/index.php/vector-and-svg-logos-01/x-icon-5301#">https://www.freeicons.io/index.php/vector-and-svg-logos-01/x-icon-5301#</a>
        </div>
    </div>



""")))};
Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*25.2*/("""

    """),_display_(/*27.6*/htmlHeader(section)))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:42.952915600
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/credits.scala.html
                  HASH: dbd6f5615f301b0e6c6d8db536b89ed2a4a878cf
                  MATRIX: 902->1|982->6|996->13|1076->15|1108->21|2012->3|2041->887|2076->896
                  LINES: 27->1|31->2|31->2|33->2|34->3|57->1|58->25|60->27
                  -- GENERATED --
              */
          