
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("About")/*1.15*/{_display_(Seq[Any](format.raw/*1.16*/("""
       """),format.raw/*2.8*/("""<h2>About Us</h2>
        <p>Founded by 4 friends towards the end of 2016, we are a small clothing business dedicated to selling quality t-shirts, hooded swearshirts and tracksuits.</p>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Sat Nov 19 23:35:42 GMT 2016
                  SOURCE: /home/wdd/webapps/WebCA/app/views/about.scala.html
                  HASH: be738aa30b211d88c5e4538cc3704160e64ec538
                  MATRIX: 827->1|848->14|886->15|920->23
                  LINES: 32->1|32->1|32->1|33->2
                  -- GENERATED --
              */
          