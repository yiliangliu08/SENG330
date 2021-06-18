
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

object htmlHeader extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(body: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.13*/("""
"""),format.raw/*4.1*/("""<html lang="en">
<head>
    <title>Whales</title>
    <link rel="stylesheet" type="text/css" media="screen" href='"""),_display_(/*7.66*/routes/*7.72*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.113*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*8.51*/routes/*8.57*/.Assets.versioned("stylesheets/bootstrap/bootstrap.min.css")),format.raw/*8.117*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*9.51*/routes/*9.57*/.Assets.versioned("stylesheets/simple-sidebar.css")),format.raw/*9.108*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*10.51*/routes/*10.57*/.Assets.versioned("stylesheets/theme.bootstrap_4.css")),format.raw/*10.111*/("""'>
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*11.51*/routes/*11.57*/.Assets.versioned("stylesheets/jquery.datetimepicker.min.css")),format.raw/*11.119*/("""'>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <script type="text/javascript" src='"""),_display_(/*14.42*/routes/*14.48*/.Assets.versioned("javascripts/jquery-3.5.1.min.js")),format.raw/*14.100*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*15.42*/routes/*15.48*/.Assets.versioned("javascripts/jquery.tablesorter.min.js")),format.raw/*15.106*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*16.42*/routes/*16.48*/.Assets.versioned("javascripts/bootstrap/bootstrap.min.js")),format.raw/*16.107*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*17.42*/routes/*17.48*/.Assets.versioned("javascripts/jquery.tablesorter.widgets.js")),format.raw/*17.110*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*18.42*/routes/*18.48*/.Assets.versioned("javascripts/jquery.datetimepicker.full.min.js")),format.raw/*18.114*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*19.42*/routes/*19.48*/.Assets.versioned("javascripts/main.js")),format.raw/*19.88*/("""'></script>
</head>
    <body onload="init()">
        <div class="d-flex" id="wrapper">

                <!-- Sidebar -->
            <div class="bg-light border-right" id="sidebar-wrapper">
                <img class="list-group" src=""""),_display_(/*26.47*/routes/*26.53*/.Assets.versioned("images/Humpback-Whale-web.jpg")),format.raw/*26.103*/(""""/>
                <div class="sidebar-heading"><b>Whale Watchers </b></div>
                <div class="list-group list-group-flush">
                    <a href="/" class="list-group-item list-group-item-action bg-light">Observation Dashboard</a>
                    <a href="/observation" class="list-group-item list-group-item-action bg-light">Add Observation</a>
                    <a href="/whales" class="list-group-item list-group-item-action bg-light">Whale Analytics</a>
                    <a href="/api_guide" class="list-group-item list-group-item-action bg-light">API Guide</a>
                    <a href="/credits" class="list-group-item list-group-item-action bg-light">Credits</a>
                </div>

            </div>
                <!-- /#sidebar-wrapper -->

                <!-- Page Content -->
            <div id="page-content-wrapper">

                <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
                    <button class="btn btn-primary" id="menu-toggle"><img src=""""),_display_(/*43.81*/routes/*43.87*/.Assets.versioned("images/Hamburger_icon.svg")),format.raw/*43.133*/("""" /></button>
                </nav>

                <div class="container-fluid">
                    """),_display_(/*47.22*/body),format.raw/*47.26*/("""
                """),format.raw/*48.17*/("""</div>
            </div>
                <!-- /#page-content-wrapper -->

        </div>
    </body>
</html>

"""))
      }
    }
  }

  def render(body:Any): play.twirl.api.HtmlFormat.Appendable = apply(body)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (body) => apply(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-11T18:28:42.985270200
                  SOURCE: D:/exercise-10-ex8_team6_01/app/views/htmlHeader.scala.html
                  HASH: b77c1ef136b0de73c7ef499e014f4c979a5962e4
                  MATRIX: 909->5|1015->16|1043->18|1187->136|1201->142|1263->183|1343->237|1357->243|1438->303|1518->357|1532->363|1604->414|1685->468|1700->474|1776->528|1857->582|1872->588|1956->650|2122->789|2137->795|2211->847|2292->901|2307->907|2387->965|2468->1019|2483->1025|2564->1084|2645->1138|2660->1144|2744->1206|2825->1260|2840->1266|2928->1332|3009->1386|3024->1392|3085->1432|3357->1677|3372->1683|3444->1733|4529->2791|4544->2797|4612->2843|4748->2952|4773->2956|4819->2974
                  LINES: 27->3|32->3|33->4|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|55->26|55->26|55->26|72->43|72->43|72->43|76->47|76->47|77->48
                  -- GENERATED --
              */
          