
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/myapos/Desktop/myProjects/EventManager/conf/routes
// @DATE:Mon Nov 19 03:25:42 EET 2018


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
