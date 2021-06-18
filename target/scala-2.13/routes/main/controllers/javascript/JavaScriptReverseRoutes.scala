// @GENERATOR:play-routes-compiler
// @SOURCE:D:/exercise-10-ex8_team6_01/conf/routes
// @DATE:Fri Dec 11 18:28:42 PST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseObservationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def createObservation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ObservationController.createObservation",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "observation"})
          }
        
        }
      """
    )
  
    // @LINE:10
    def showObservation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ObservationController.showObservation",
      """
        function(obsId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "observation/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("obsId", obsId0))})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseWhaleAPI(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def guide: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WhaleAPI.guide",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api_guide"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseDriver(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def generateFakeData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Driver.generateFakeData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fake_data"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Driver.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:15
    def credits: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Driver.credits",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "credits"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseSearchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SearchController.search",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
          }
        
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseWhaleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def removeWhale: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WhaleController.removeWhale",
      """
        function(obsId0,whaleId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "observation/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("obsId", obsId0)) + "/remove_whale/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("whaleId", whaleId1))})
        }
      """
    )
  
    // @LINE:9
    def handleResult: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WhaleController.handleResult",
      """
        function(obsId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "observation/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("obsId", obsId0)) + "/whale"})
        }
      """
    )
  
    // @LINE:14
    def manageRequestType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WhaleController.manageRequestType",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "whales"})
        }
      """
    )
  
  }


}
