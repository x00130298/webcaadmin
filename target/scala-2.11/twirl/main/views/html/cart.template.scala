
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cart_Scope0 {
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

class cart extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Cart")/*1.14*/{_display_(Seq[Any](format.raw/*1.15*/("""
    """),format.raw/*2.5*/("""<div class="text-center">
        <h4>Your cart is empty!</h4>
        <p>Sounds like a good time to <a href="/prod">start shopping</a>!</p>
    </div>
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object cart extends cart_Scope0.cart
              /*
                  -- GENERATED --
                  DATE: Fri Dec 09 13:09:29 GMT 2016
                  SOURCE: /home/wdd/webapps/webcaadmin/app/views/cart.scala.html
                  HASH: e5840754f105f9f9932248aaaf903ba62d50040a
                  MATRIX: 825->1|845->13|883->14|914->19|1096->172
                  LINES: 32->1|32->1|32->1|33->2|37->6
                  -- GENERATED --
              */
          