package controllers

import play.api.mvc._

object TetokaController extends Controller {

    def home = Action {
        Ok("Hello Tetoka!")
    }

}