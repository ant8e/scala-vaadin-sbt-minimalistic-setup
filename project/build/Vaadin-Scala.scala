import sbt._

class WebappBuild(info: ProjectInfo) extends DefaultWebProject(info) {
  val jetty7 = "org.eclipse.jetty" % "jetty-webapp" % "7.0.2.RC0" % "test"
  val vaadin = "com.vaadin" % "vaadin" % "6.5.4"


}
