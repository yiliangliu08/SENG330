// @GENERATOR:play-routes-compiler
// @SOURCE:D:/exercise-10-ex8_team6_01/conf/routes
// @DATE:Fri Dec 11 18:28:42 PST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:21
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:10
  class ReverseObservationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def createObservation(): Call = {
    
      () match {
      
        // @LINE:11
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "observation")
      
      }
    
    }
  
    // @LINE:10
    def showObservation(obsId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "observation/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("obsId", obsId)))
    }
  
  }

  // @LINE:16
  class ReverseWhaleAPI(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def guide(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api_guide")
    }
  
  }

  // @LINE:6
  class ReverseDriver(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def generateFakeData(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fake_data")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:15
    def credits(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "credits")
    }
  
  }

  // @LINE:17
  class ReverseSearchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def search(): Call = {
    
      () match {
      
        // @LINE:17
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "search")
      
      }
    
    }
  
  }

  // @LINE:9
  class ReverseWhaleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def removeWhale(obsId:Long, whaleId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "observation/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("obsId", obsId)) + "/remove_whale/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("whaleId", whaleId)))
    }
  
    // @LINE:9
    def handleResult(obsId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "observation/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("obsId", obsId)) + "/whale")
    }
  
    // @LINE:14
    def manageRequestType(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "whales")
    }
  
  }


}
