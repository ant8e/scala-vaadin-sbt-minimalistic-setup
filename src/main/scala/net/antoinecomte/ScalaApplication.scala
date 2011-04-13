package net.antoinecomte

import com.vaadin.Application
import com.vaadin.ui.{Label, Window}

/**
 * User: ant
 * Date: 12.04.11
 * Time: 21:07
 */
class ScalaApplication extends Application {

  def init() {
    val mainWindow = new Window("My first scala Application")
    val label = new Label("Hello World ... ")
    mainWindow.addComponent(label)
    setMainWindow(mainWindow)
  }

}
