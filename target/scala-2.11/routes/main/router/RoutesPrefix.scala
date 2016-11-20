
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/WebCA/conf/routes
// @DATE:Sun Nov 20 01:39:34 GMT 2016


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
