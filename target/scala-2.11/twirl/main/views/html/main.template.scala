
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String, user:models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.56*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
	<title>"""),_display_(/*7.10*/title),format.raw/*7.15*/("""</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="script.js"></script>
	<link href='"""),_display_(/*13.15*/routes/*13.21*/.Assets.at("stylesheets/main.css")),format.raw/*13.55*/("""' rel="stylesheet" alt="cascading" >
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
							<li """),_display_(/*35.13*/if(title == "Home")/*35.32*/{_display_(Seq[Any](format.raw/*35.33*/(""" """),format.raw/*35.34*/("""class="active";""")))}),format.raw/*35.50*/("""><a href="/">Home</a></li>
							<li """),_display_(/*36.13*/if(title == "Products")/*36.36*/{_display_(Seq[Any](format.raw/*36.37*/(""" """),format.raw/*36.38*/("""class="active";""")))}),format.raw/*36.54*/("""><a href="/prod">Products</a></li>
							<li """),_display_(/*37.13*/if(title == "About")/*37.33*/{_display_(Seq[Any](format.raw/*37.34*/(""" """),format.raw/*37.35*/("""class="active" ;""")))}),format.raw/*37.52*/("""><a href="/about">About</a></li>
							<li """),_display_(/*38.13*/if(title == "Contact")/*38.35*/{_display_(Seq[Any](format.raw/*38.36*/(""" """),format.raw/*38.37*/("""class="active" ;""")))}),format.raw/*38.54*/("""><a href="/contact">Contact Us</a></li>
							<li """),_display_(/*39.13*/if(title == "Login")/*39.33*/{_display_(Seq[Any](format.raw/*39.34*/("""class="active"""")))}),format.raw/*39.49*/("""><a href=""""),_display_(/*39.60*/routes/*39.66*/.LoginController.login()),format.raw/*39.90*/("""">Login</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<!--<li """),_display_(/*42.17*/if(title == "Sign Up")/*42.39*/{_display_(Seq[Any](format.raw/*42.40*/(""" """),format.raw/*42.41*/("""class="active" ;""")))}),format.raw/*42.58*/("""><a href="/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
							<li """),_display_(/*43.13*/if(title == "Sign In")/*43.35*/{_display_(Seq[Any](format.raw/*43.36*/(""" """),format.raw/*43.37*/("""class="active" ;""")))}),format.raw/*43.54*/("""><a href="/signin"><span class="glyphicon glyphicon-user"></span> Sign In</a></li> -->
							<li """),_display_(/*44.13*/if(title == "Account")/*44.35*/{_display_(Seq[Any](format.raw/*44.36*/("""class = "active";)""")))}),format.raw/*44.55*/("""><a href="/account"><span class="glyphicon glyphicon-user"></span>Account</a></li>
							<li """),_display_(/*45.13*/if(title == "Cart")/*45.32*/{_display_(Seq[Any](format.raw/*45.33*/(""" """),format.raw/*45.34*/("""class="active" ;""")))}),format.raw/*45.51*/("""><a href="/cart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>

							<li """),_display_(/*47.13*/if(title == "Login")/*47.33*/ {_display_(Seq[Any](format.raw/*47.35*/("""class="active")>
								"""),_display_(/*48.10*/if(user != null)/*48.26*/{_display_(Seq[Any](format.raw/*48.27*/("""
									"""),format.raw/*49.10*/("""<a href=""""),_display_(/*49.20*/routes/*49.26*/.LoginController.logout()),format.raw/*49.51*/(""""> Logout """),_display_(/*49.62*/user/*49.66*/.getName()),format.raw/*49.76*/("""</a>
								""")))}/*50.11*/else/*50.16*/{_display_(Seq[Any](format.raw/*50.17*/("""
									"""),format.raw/*51.10*/("""<a href=""""),_display_(/*51.20*/routes/*51.26*/.LoginController.login()),format.raw/*51.50*/(""""> Login </a>
								""")))}),format.raw/*52.10*/("""

							"""),format.raw/*54.8*/("""</li>

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
				"""),_display_(/*69.6*/content),format.raw/*69.13*/("""
			"""),format.raw/*70.4*/("""</div>
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

""")))}),format.raw/*103.2*/("""

"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 15:58:06 GMT 2016
                  SOURCE: /home/wdd/webapps/webcaadmin/app/views/main.scala.html
                  HASH: aa9d5ccfcf18032c4876bdbaac317ae06bbe1eed
                  MATRIX: 766->2|915->56|943->58|1018->107|1043->112|1483->525|1498->531|1553->565|2218->1203|2246->1222|2285->1223|2314->1224|2361->1240|2427->1279|2459->1302|2498->1303|2527->1304|2574->1320|2648->1367|2677->1387|2716->1388|2745->1389|2793->1406|2865->1451|2896->1473|2935->1474|2964->1475|3012->1492|3091->1544|3120->1564|3159->1565|3205->1580|3243->1591|3258->1597|3303->1621|3422->1713|3453->1735|3492->1736|3521->1737|3569->1754|3691->1849|3722->1871|3761->1872|3790->1873|3838->1890|3964->1989|3995->2011|4034->2012|4084->2031|4206->2126|4234->2145|4273->2146|4302->2147|4350->2164|4477->2264|4506->2284|4546->2286|4599->2312|4624->2328|4663->2329|4701->2339|4738->2349|4753->2355|4799->2380|4837->2391|4850->2395|4881->2405|4914->2420|4927->2425|4966->2426|5004->2436|5041->2446|5056->2452|5101->2476|5155->2499|5191->2508|5433->2724|5461->2731|5492->2735|6169->3381
                  LINES: 27->2|32->2|34->4|37->7|37->7|43->13|43->13|43->13|65->35|65->35|65->35|65->35|65->35|66->36|66->36|66->36|66->36|66->36|67->37|67->37|67->37|67->37|67->37|68->38|68->38|68->38|68->38|68->38|69->39|69->39|69->39|69->39|69->39|69->39|69->39|72->42|72->42|72->42|72->42|72->42|73->43|73->43|73->43|73->43|73->43|74->44|74->44|74->44|74->44|75->45|75->45|75->45|75->45|75->45|77->47|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|79->49|79->49|79->49|79->49|80->50|80->50|80->50|81->51|81->51|81->51|81->51|82->52|84->54|99->69|99->69|100->70|133->103
                  -- GENERATED --
              */
          