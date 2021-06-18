// @GENERATOR:play-routes-compiler
// @SOURCE:D:/exercise-10-ex8_team6_01/conf/routes
// @DATE:Fri Dec 11 18:28:42 PST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
