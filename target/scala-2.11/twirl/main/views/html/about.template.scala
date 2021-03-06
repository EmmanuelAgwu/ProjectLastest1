
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!-- Pass page title and content """),format.raw/*2.34*/("""{"""),format.raw/*2.35*/("""html between braces"""),format.raw/*2.54*/("""}"""),format.raw/*2.55*/(""" """),format.raw/*2.56*/("""to the main view -->
    """),_display_(/*3.6*/main("About", user)/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
        """),format.raw/*4.9*/("""<div class="row">
            <div class="col-sm-12">
                    <!-- Header -->
                <header id="header" class="alt">
                    <h1><a href=""""),_display_(/*8.35*/routes/*8.41*/.HomeController.index()),format.raw/*8.64*/(""""<span class="glyphicon glyphicon-book"></span> DUT Library</a></h1>
                    <nav>
                        <a href="#menu">Menu</a>
                    </nav>
                </header>


                    <!-- Two -->
                <section id="two" class="wrapper alt spotlight style2">
                    <div class="inner">
                        <a href="#" class="image"><img src=""""),_display_(/*18.62*/routes/*18.68*/.Assets.versioned("images/give.jpg")),format.raw/*18.104*/("""" alt="" /></a>
                        <div class="content">
                            <h2 class="major">Who are we and what do we do?</h2>
                            <p>We're a team that provides a limited burrowing service for college students.</p>
                            <p>Students are allowed to create a personal account that will allow them to burrow products for a limited amount of time.</p>
                            <p>If you require any aid, feel free to contact to any of our friendly staff.</p>
                        </div>
                    </div>
                </section>


                    <!-- Three -->
                <section id="three" class="wrapper spotlight style3">
                    <div class="inner">
                        <a href="#" class="image"><img src=""""),_display_(/*32.62*/routes/*32.68*/.Assets.versioned("images/confused.png")),format.raw/*32.108*/("""" alt="" /></a>
                        <div class="content">
                            <h2 class="major">How does the Point System work?</h2>
                            <p>When you sign up, the new account will have 100 points. The User can then loan a product for 3, 5 or 7 days which will cost 30, 50 and 100 points respectively.</p>
                            <p>To retrieve the spent points, you must return the product and you can do this via personal account or by an admin in the building.</p>
                        </div>
                    </div>
                </section>

                    <!-- Four -->
                <section id="four" class="wrapper alt style1">
                    <div class="inner">
                        <h2 class="major">Meet our Staff</h2>
                        <section class="features">
                            <article>
                                <a href="" class="image"><img src=""""),_display_(/*47.69*/routes/*47.75*/.Assets.versioned("images/pic04.jpg")),format.raw/*47.112*/("""" alt="" /></a>
                                <h3 class="major">Michael White</h3>
                                <p>Michael is a our system advicer. Michael has added the library's development and upbrining till this day.</p>
                            </article>
                            <article>
                                <a href="" class="image"><img src=""""),_display_(/*52.69*/routes/*52.75*/.Assets.versioned("images/pic05.jpg")),format.raw/*52.112*/("""" alt="" /></a>
                                <h3 class="major">Tyrone Phillip</h3>
                                <p>Tyrone is our system analyst ensuring that our student receive the best software, software can ofer.</p>
                            </article>
                            <article>
                                <a href="" class="image"><img src=""""),_display_(/*57.69*/routes/*57.75*/.Assets.versioned("images/pic06.jpg")),format.raw/*57.112*/("""" alt="" /></a>
                                <h3 class="major">Jerome Jamal</h3>
                                <p> Jerome is our library assisant.Jerome is also currently a student at dut as well majoring in Human Resources.</p>
                            </article>
                            <article>
                                <a href="" class="image"><img src=""""),_display_(/*62.69*/routes/*62.75*/.Assets.versioned("images/pic07.jpg")),format.raw/*62.112*/("""" alt="" /></a>
                                <h3 class="major">Peter Oisin</h3>
                                <p>Peter Oisin's our librarain. Aiding all our students who wishes to loan our products being pyschially or virtually.</p>
                            </article>
                        </section>
                        <ul class="actions">
                            <li><a href="#" class="button">Browse All</a></li>
                        </ul>
                    </div>
                </section>
            </div>
        </div>
            <!-- End of content for main -->
    """)))}),format.raw/*75.6*/("""
"""))
      }
    }
  }

  def render(user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 16:26:52 IST 2017
                  SOURCE: /home/ifeanyi/Documents/project-latest-version/app/views/about.scala.html
                  HASH: eeaeba8ce0b55b031fbb05f393b9733c2d7c0e1e
                  MATRIX: 757->1|878->27|905->28|965->61|993->62|1039->81|1067->82|1095->83|1146->109|1173->128|1212->130|1247->139|1446->312|1460->318|1503->341|1935->746|1950->752|2008->788|2848->1601|2863->1607|2925->1647|3900->2595|3915->2601|3974->2638|4376->3013|4391->3019|4450->3056|4848->3427|4863->3433|4922->3470|5328->3849|5343->3855|5402->3892|6036->4496
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|33->2|33->2|34->3|34->3|34->3|35->4|39->8|39->8|39->8|49->18|49->18|49->18|63->32|63->32|63->32|78->47|78->47|78->47|83->52|83->52|83->52|88->57|88->57|88->57|93->62|93->62|93->62|106->75
                  -- GENERATED --
              */
          