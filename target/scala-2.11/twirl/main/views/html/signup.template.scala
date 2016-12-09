
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Sign Up")/*1.17*/{_display_(Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*3.1*/("""<div class="text-center">
	<div class="forms">
		<form>
			<input type="text" name="firstname" placeholder="Enter First Name"></br></br>
			<input type="text" name="lastname" placeholder="Enter Last Name"></br></br>
			<input type="text" name="email" placeholder="Enter Email Address"><br></br>
			<input type="password" name="password" placeholder="Enter Password"><br></br>
			<input type="password" name="passwordconfirm" placeholder="Confirm Password"><br></br>
			<input type="submit" value="Submit"><br>
		</form>
	<p> Already have an account?<a href="/account">Sign In</a> </p>
	</div>
</div>

""")))}),format.raw/*17.2*/("""
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
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Fri Dec 09 13:09:29 GMT 2016
                  SOURCE: /home/wdd/webapps/webcaadmin/app/views/signup.scala.html
                  HASH: 3fca688a670972dc2e2b397ffe544e447a42939f
                  MATRIX: 829->1|852->16|890->17|918->19|1550->621
                  LINES: 32->1|32->1|32->1|34->3|48->17
                  -- GENERATED --
              */
          