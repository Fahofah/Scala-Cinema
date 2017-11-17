package controllers

import javax.inject.Inject

import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc.{Action, Controller}

class NavigationSimple @Inject() (val messagesApi: MessagesApi) extends Controller with I18nSupport{

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def classifications = Action {
    Ok(views.html.classifications())
  }

  def openingTimes = Action {
    Ok(views.html.openingTimes())
  }

  def gettingTherePage = Action {
    Ok(views.html.gettingThere())
  }

  def listingsGallery = Action {
    Ok(views.html.listingsGallery())
  }

  def newReleasesGallery = Action {
    Ok(views.html.newReleasesGallery())
  }

  def screens = Action {
    Ok(views.html.screens())
  }

  def aroundUs = Action{
    Ok(views.html.aroundUs())
  }

}
