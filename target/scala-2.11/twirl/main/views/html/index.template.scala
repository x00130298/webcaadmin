
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.27*/("""
"""),_display_(/*3.2*/main("Home",user)/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
"""),format.raw/*4.1*/("""<div class="container-fluid">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
		<div class="carousel-caption">
			<!--<a href="/prod">
				<button type="button" class="btn btn-default">Shop Now</button>
			</a> -->
			<div class="carousel-caption">
				<a class="shopnow" href="/prod">Shop Now</a>
			</div>
		</div>
      <div class="item active">
        <img src="http://lorempixel.com/output/animals-q-g-1900-500-6.jpg">
      </div>

      <div class="item">
        <img src="http://lorempixel.com/output/technics-q-g-1900-500-6.jpg">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  <h4 style="text-align:Center">FEATURED</h4>
	<div class="row">
    <div class="col-md-4">
	    <div class="row">
		    <div class="text-center">
                <div class="col-md-1">
                </div>
                <div class="col-md-10">
                    <div class="img">
                        <img src='http://lorempixel.com/output/technics-h-g-300-400-6.jpg' class="img-responsive" style="width:100%; max-height:300px;"alt="Image">
                    </div>
                    <div class="Description">Buy headphones</div>
				    <div class="price">$5,000,000</div>
                </div>
                <div class="col-md-1">
                </div>
			</div>   
		</div>
	</div>
    <div class="col-md-4">
	    <div class="row">
		    <div class="text-center">
                <div class="col-md-1">
                </div>
                <div class="col-md-10">
                    <div class="img">
                        <img src="http://lorempixel.com/output/technics-h-g-300-400-6.jpg" class="img-responsive" style="width:100%" alt="Image">
                    </div>
                    <div class="Description">Buy headphones</div>
				    <div class="price">$5,000,000</div>
                </div>
                <div class="col-md-1">
                </div>
			</div>   
		</div>
	</div>
    <div class="col-md-4">
	    <div class="row">
		    <div class="text-center">
                <div class="col-md-1">
                </div>
                <div class="col-md-10">
                    <div class="img">
                        <img src="http://lorempixel.com/output/technics-h-g-300-400-6.jpg" class="img-responsive" style="width:100%" alt="Image">
                    </div>
                    <div class="Description">Buy headphones</div>
				    <div class="price">$5,000,000</div>
                </div>
                <div class="col-md-1">
                </div>
			</div>   
		</div>
	</div>
</div>
</div>
""")))}),format.raw/*96.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 16:11:04 GMT 2016
                  SOURCE: /home/wdd/webapps/webcaadmin/app/views/index.scala.html
                  HASH: 7576bc878462baa289adc38f8e69003ba9d5a63b
                  MATRIX: 756->3|876->28|904->31|929->48|967->49|995->51|4436->3462
                  LINES: 27->2|32->2|33->3|33->3|33->3|34->4|126->96
                  -- GENERATED --
              */
          