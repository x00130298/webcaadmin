
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
	<title>"""),_display_(/*12.10*/title),format.raw/*12.15*/("""</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="script.js"></script>
	<link href='"""),_display_(/*18.15*/routes/*18.21*/.Assets.at("stylesheets/main.css")),format.raw/*18.55*/("""' rel="stylesheet" alt="cascading" >
</head>



<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-1">
		</div>
		<div class="col-md-10">
			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>                        
						</button>
					</div>
					<div class="collapse navbar-collapse" id="myNavbar">
						<ul class="nav navbar-nav">
							<li """),_display_(/*40.13*/if(title == "Home")/*40.32*/{_display_(Seq[Any](format.raw/*40.33*/(""" """),format.raw/*40.34*/("""class="active";""")))}),format.raw/*40.50*/("""><a href="/">Home</a></li>
							<li """),_display_(/*41.13*/if(title == "Products")/*41.36*/{_display_(Seq[Any](format.raw/*41.37*/(""" """),format.raw/*41.38*/("""class="active";""")))}),format.raw/*41.54*/("""><a href="/prod">Products</a></li>
							<li """),_display_(/*42.13*/if(title == "About")/*42.33*/{_display_(Seq[Any](format.raw/*42.34*/(""" """),format.raw/*42.35*/("""class="active" ;""")))}),format.raw/*42.52*/("""><a href="/about">About</a></li>
							<li """),_display_(/*43.13*/if(title == "Contact")/*43.35*/{_display_(Seq[Any](format.raw/*43.36*/(""" """),format.raw/*43.37*/("""class="active" ;""")))}),format.raw/*43.54*/("""><a href="/contact">Contact Us</a></li>
							<li """),_display_(/*44.13*/if(title == "Login")/*44.33*/{_display_(Seq[Any](format.raw/*44.34*/("""class="active"""")))}),format.raw/*44.49*/("""><a href=""""),_display_(/*44.60*/routes/*44.66*/.LoginController.login()),format.raw/*44.90*/("""">Login</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<!--<li """),_display_(/*47.17*/if(title == "Sign Up")/*47.39*/{_display_(Seq[Any](format.raw/*47.40*/(""" """),format.raw/*47.41*/("""class="active" ;""")))}),format.raw/*47.58*/("""><a href="/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
							<li """),_display_(/*48.13*/if(title == "Sign In")/*48.35*/{_display_(Seq[Any](format.raw/*48.36*/(""" """),format.raw/*48.37*/("""class="active" ;""")))}),format.raw/*48.54*/("""><a href="/signin"><span class="glyphicon glyphicon-user"></span> Sign In</a></li> -->
							<li """),_display_(/*49.13*/if(title == "Account")/*49.35*/{_display_(Seq[Any](format.raw/*49.36*/("""class = "active";)""")))}),format.raw/*49.55*/("""><a href="/account"><span class="glyphicon glyphicon-user"></span>Account</a></li>
							<li """),_display_(/*50.13*/if(title == "Cart")/*50.32*/{_display_(Seq[Any](format.raw/*50.33*/(""" """),format.raw/*50.34*/("""class="active" ;""")))}),format.raw/*50.51*/("""><a href="/cart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
						</ul>
					</div> 
				</div>
			</nav>
		</div>
		<div class="col-md-1">
		</div>
	</div>
	<div class="row">
		<div class="container">
			<div class="col-md-2">
			</div>
			<div class="col-md-8">
				"""),_display_(/*64.6*/content),format.raw/*64.13*/("""
			"""),format.raw/*65.4*/("""</div>
			<div class="col-md-2">
			</div>
		</div>
	</div>
	</br>
	<div class="row">
		<div id="footer">
			<div class="col-md-1">
			</div>
			<div class="col-md-10">
				<div class="col-md-12">
					<div class="panel-body">
						
							&copy 2016 SKAS Clothing Inc. 
						
						<div class="footersocial">
							<a href="https://twitter.com/SKASClothing" class="twitter-follow-button" data-show-count="false">Follow SKASClothing</a><script async src="//platform.twitter.com/widgets.js" charset="utf-8"></script>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-1">
			</div>
		</div>
	</div>
</div>
</body>
</html>



"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Dec 09 13:26:52 GMT 2016
                  SOURCE: /home/wdd/webapps/webcaadmin/app/views/main.scala.html
                  HASH: 774952a6216cd5994d6a38da2ce261732fd3f640
                  MATRIX: 1002->260|1127->290|1155->292|1231->341|1257->346|1697->759|1712->765|1767->799|2432->1437|2460->1456|2499->1457|2528->1458|2575->1474|2641->1513|2673->1536|2712->1537|2741->1538|2788->1554|2862->1601|2891->1621|2930->1622|2959->1623|3007->1640|3079->1685|3110->1707|3149->1708|3178->1709|3226->1726|3305->1778|3334->1798|3373->1799|3419->1814|3457->1825|3472->1831|3517->1855|3636->1947|3667->1969|3706->1970|3735->1971|3783->1988|3905->2083|3936->2105|3975->2106|4004->2107|4052->2124|4178->2223|4209->2245|4248->2246|4298->2265|4420->2360|4448->2379|4487->2380|4516->2381|4564->2398|4886->2694|4914->2701|4945->2705
                  LINES: 32->7|37->7|39->9|42->12|42->12|48->18|48->18|48->18|70->40|70->40|70->40|70->40|70->40|71->41|71->41|71->41|71->41|71->41|72->42|72->42|72->42|72->42|72->42|73->43|73->43|73->43|73->43|73->43|74->44|74->44|74->44|74->44|74->44|74->44|74->44|77->47|77->47|77->47|77->47|77->47|78->48|78->48|78->48|78->48|78->48|79->49|79->49|79->49|79->49|80->50|80->50|80->50|80->50|80->50|94->64|94->64|95->65
                  -- GENERATED --
              */
          