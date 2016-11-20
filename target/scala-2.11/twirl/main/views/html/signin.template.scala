
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signin_Scope0 {
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

class signin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Sign In")/*1.17*/{_display_(Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<div class="text-center">
    <form>
        Email:<br>
        <input type="text" name="email"><br>
        Password:<br>
        <input type="password" name="password"><br>
        <br>
        <input type="submit" value="Sign In"><br>
    </form>
</div>

""")))}),format.raw/*13.2*/("""
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
object signin extends signin_Scope0.signin
              /*
                  -- GENERATED --
                  DATE: Sat Nov 19 23:28:27 GMT 2016
                  SOURCE: /home/wdd/webapps/WebCA/app/views/signin.scala.html
                  HASH: 1e7e335ab15c2f760a9ff5bd3903798580155830
                  MATRIX: 829->1|852->16|890->17|917->18|1206->277
                  LINES: 32->1|32->1|32->1|33->2|44->13
                  -- GENERATED --
              */
          