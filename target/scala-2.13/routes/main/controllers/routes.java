// @GENERATOR:play-routes-compiler
// @SOURCE:D:/exercise-10-ex8_team6_01/conf/routes
// @DATE:Fri Dec 11 18:28:42 PST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseObservationController ObservationController = new controllers.ReverseObservationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWhaleAPI WhaleAPI = new controllers.ReverseWhaleAPI(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDriver Driver = new controllers.ReverseDriver(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSearchController SearchController = new controllers.ReverseSearchController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWhaleController WhaleController = new controllers.ReverseWhaleController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseObservationController ObservationController = new controllers.javascript.ReverseObservationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWhaleAPI WhaleAPI = new controllers.javascript.ReverseWhaleAPI(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDriver Driver = new controllers.javascript.ReverseDriver(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSearchController SearchController = new controllers.javascript.ReverseSearchController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWhaleController WhaleController = new controllers.javascript.ReverseWhaleController(RoutesPrefix.byNamePrefix());
  }

}
