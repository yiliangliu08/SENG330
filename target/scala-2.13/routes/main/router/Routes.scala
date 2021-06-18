// @GENERATOR:play-routes-compiler
// @SOURCE:D:/exercise-10-ex8_team6_01/conf/routes
// @DATE:Fri Dec 11 18:28:42 PST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Driver_3: controllers.Driver,
  // @LINE:9
  WhaleController_2: controllers.WhaleController,
  // @LINE:10
  ObservationController_5: controllers.ObservationController,
  // @LINE:16
  WhaleAPI_0: controllers.WhaleAPI,
  // @LINE:17
  SearchController_1: controllers.SearchController,
  // @LINE:21
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Driver_3: controllers.Driver,
    // @LINE:9
    WhaleController_2: controllers.WhaleController,
    // @LINE:10
    ObservationController_5: controllers.ObservationController,
    // @LINE:16
    WhaleAPI_0: controllers.WhaleAPI,
    // @LINE:17
    SearchController_1: controllers.SearchController,
    // @LINE:21
    Assets_4: controllers.Assets
  ) = this(errorHandler, Driver_3, WhaleController_2, ObservationController_5, WhaleAPI_0, SearchController_1, Assets_4, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Driver_3, WhaleController_2, ObservationController_5, WhaleAPI_0, SearchController_1, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Driver.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """observation/""" + "$" + """obsId<[^/]+>/whale""", """controllers.WhaleController.handleResult(request:Request, obsId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """observation/""" + "$" + """obsId<[^/]+>""", """controllers.ObservationController.showObservation(request:Request, obsId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """observation""", """controllers.ObservationController.createObservation(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """observation""", """controllers.ObservationController.createObservation(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """observation/""" + "$" + """obsId<[^/]+>/remove_whale/""" + "$" + """whaleId<[^/]+>""", """controllers.WhaleController.removeWhale(obsId:Long, whaleId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """whales""", """controllers.WhaleController.manageRequestType(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """credits""", """controllers.Driver.credits()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api_guide""", """controllers.WhaleAPI.guide()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchController.search(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.SearchController.search(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fake_data""", """controllers.Driver.generateFakeData()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Driver_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Driver_index0_invoker = createInvoker(
    Driver_3.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Driver",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_WhaleController_handleResult1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("observation/"), DynamicPart("obsId", """[^/]+""",true), StaticPart("/whale")))
  )
  private[this] lazy val controllers_WhaleController_handleResult1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      WhaleController_2.handleResult(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WhaleController",
      "handleResult",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "POST",
      this.prefix + """observation/""" + "$" + """obsId<[^/]+>/whale""",
      """ A controller that takes the request (i.e., user form info)""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ObservationController_showObservation2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("observation/"), DynamicPart("obsId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ObservationController_showObservation2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ObservationController_5.showObservation(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ObservationController",
      "showObservation",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "GET",
      this.prefix + """observation/""" + "$" + """obsId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ObservationController_createObservation3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("observation")))
  )
  private[this] lazy val controllers_ObservationController_createObservation3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ObservationController_5.createObservation(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ObservationController",
      "createObservation",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """observation""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ObservationController_createObservation4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("observation")))
  )
  private[this] lazy val controllers_ObservationController_createObservation4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ObservationController_5.createObservation(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ObservationController",
      "createObservation",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """observation""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_WhaleController_removeWhale5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("observation/"), DynamicPart("obsId", """[^/]+""",true), StaticPart("/remove_whale/"), DynamicPart("whaleId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WhaleController_removeWhale5_invoker = createInvoker(
    WhaleController_2.removeWhale(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WhaleController",
      "removeWhale",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """observation/""" + "$" + """obsId<[^/]+>/remove_whale/""" + "$" + """whaleId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_WhaleController_manageRequestType6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("whales")))
  )
  private[this] lazy val controllers_WhaleController_manageRequestType6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      WhaleController_2.manageRequestType(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WhaleController",
      "manageRequestType",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """whales""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Driver_credits7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("credits")))
  )
  private[this] lazy val controllers_Driver_credits7_invoker = createInvoker(
    Driver_3.credits(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Driver",
      "credits",
      Nil,
      "GET",
      this.prefix + """credits""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_WhaleAPI_guide8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api_guide")))
  )
  private[this] lazy val controllers_WhaleAPI_guide8_invoker = createInvoker(
    WhaleAPI_0.guide(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WhaleAPI",
      "guide",
      Nil,
      "GET",
      this.prefix + """api_guide""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_SearchController_search9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchController_search9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SearchController_1.search(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "search",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_SearchController_search10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_SearchController_search10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SearchController_1.search(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SearchController",
      "search",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Driver_generateFakeData12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fake_data")))
  )
  private[this] lazy val controllers_Driver_generateFakeData12_invoker = createInvoker(
    Driver_3.generateFakeData(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Driver",
      "generateFakeData",
      Nil,
      "GET",
      this.prefix + """fake_data""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Driver_index0_route(params@_) =>
      call { 
        controllers_Driver_index0_invoker.call(Driver_3.index())
      }
  
    // @LINE:9
    case controllers_WhaleController_handleResult1_route(params@_) =>
      call(params.fromPath[Long]("obsId", None)) { (obsId) =>
        controllers_WhaleController_handleResult1_invoker.call(
          req => WhaleController_2.handleResult(req, obsId))
      }
  
    // @LINE:10
    case controllers_ObservationController_showObservation2_route(params@_) =>
      call(params.fromPath[Long]("obsId", None)) { (obsId) =>
        controllers_ObservationController_showObservation2_invoker.call(
          req => ObservationController_5.showObservation(req, obsId))
      }
  
    // @LINE:11
    case controllers_ObservationController_createObservation3_route(params@_) =>
      call { 
        controllers_ObservationController_createObservation3_invoker.call(
          req => ObservationController_5.createObservation(req))
      }
  
    // @LINE:12
    case controllers_ObservationController_createObservation4_route(params@_) =>
      call { 
        controllers_ObservationController_createObservation4_invoker.call(
          req => ObservationController_5.createObservation(req))
      }
  
    // @LINE:13
    case controllers_WhaleController_removeWhale5_route(params@_) =>
      call(params.fromPath[Long]("obsId", None), params.fromPath[Long]("whaleId", None)) { (obsId, whaleId) =>
        controllers_WhaleController_removeWhale5_invoker.call(WhaleController_2.removeWhale(obsId, whaleId))
      }
  
    // @LINE:14
    case controllers_WhaleController_manageRequestType6_route(params@_) =>
      call { 
        controllers_WhaleController_manageRequestType6_invoker.call(
          req => WhaleController_2.manageRequestType(req))
      }
  
    // @LINE:15
    case controllers_Driver_credits7_route(params@_) =>
      call { 
        controllers_Driver_credits7_invoker.call(Driver_3.credits())
      }
  
    // @LINE:16
    case controllers_WhaleAPI_guide8_route(params@_) =>
      call { 
        controllers_WhaleAPI_guide8_invoker.call(WhaleAPI_0.guide())
      }
  
    // @LINE:17
    case controllers_SearchController_search9_route(params@_) =>
      call { 
        controllers_SearchController_search9_invoker.call(
          req => SearchController_1.search(req))
      }
  
    // @LINE:18
    case controllers_SearchController_search10_route(params@_) =>
      call { 
        controllers_SearchController_search10_invoker.call(
          req => SearchController_1.search(req))
      }
  
    // @LINE:21
    case controllers_Assets_versioned11_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:24
    case controllers_Driver_generateFakeData12_route(params@_) =>
      call { 
        controllers_Driver_generateFakeData12_invoker.call(Driver_3.generateFakeData())
      }
  }
}
