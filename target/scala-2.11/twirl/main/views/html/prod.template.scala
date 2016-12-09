
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object prod_Scope0 {
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

class prod extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/main("Products")/*2.18*/{_display_(Seq[Any](format.raw/*2.19*/("""
"""),format.raw/*3.1*/("""<!-- <div class="row">
    <div class="col-md-4">
	    <div class="row">
		    <div class="text-center">
                <div class="col-md-1">
                </div>
                <div class="col-md-10">
                    <div class="img">
                        <img src='http://lorempixel.com/output/technics-h-g-300-400-6.jpg' class="img-responsive" style="width:100%;"alt="Image">
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
</br> -->
    """),_display_(/*57.6*/for(p <- products) yield /*57.24*/{_display_(Seq[Any](format.raw/*57.25*/("""
        """),format.raw/*58.9*/("""<tr>
            <td class="numeric">"""),_display_(/*59.34*/p/*59.35*/.getId),format.raw/*59.41*/("""</td>
            <td>"""),_display_(/*60.18*/p/*60.19*/.getName),format.raw/*60.27*/("""</td>
            <td class="numeric">&euro; """),_display_(/*61.41*/("%.2f".format(p.getPrice))),format.raw/*61.68*/("""</td>
        </tr>
    """)))}),format.raw/*63.6*/("""
""")))}),format.raw/*64.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


}

/**/
object prod extends prod_Scope0.prod
              /*
                  -- GENERATED --
                  DATE: Fri Dec 09 13:09:29 GMT 2016
                  SOURCE: /home/wdd/webapps/webcaadmin/app/views/prod.scala.html
                  HASH: e90f06bc3bc71a9b0a3a21d749c40e08e1506c38
                  MATRIX: 757->1|884->33|911->35|935->51|973->52|1000->53|2931->1958|2965->1976|3004->1977|3040->1986|3105->2024|3115->2025|3142->2031|3192->2054|3202->2055|3231->2063|3304->2109|3352->2136|3407->2161|3439->2163
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|88->57|88->57|88->57|89->58|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|94->63|95->64
                  -- GENERATED --
              */
          