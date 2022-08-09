package autotestsuite.stepdefinitions;

import autotestsuite.actions.AcceptCookies;
import autotestsuite.actions.ClickNews;
import autotestsuite.actions.NavigateTo;
import autotestsuite.pages.GuardianNewsHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.CountQuestion;
import net.serenitybdd.screenplay.questions.Text;


import java.util.Collection;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.assertj.core.api.Assertions.assertThat;


public class ValidateNewsStepDefinitions {
    GuardianNewsHomePage guardianNewsHomePage;
    @Given("{actor} is navigated to the Guardian news home page")
    public void navigateToNewsHomePage(Actor actor){
        actor.wasAbleTo(NavigateTo.theGuardianNewsHomePage());
        actor.wasAbleTo(AcceptCookies.yesIamHappy(actor));
    }

    @When("{actor} reads the top {int} news on the page")
    public void getTopNews(Actor actor, int news_count) {
        //guardianNewsHomePage.getHeadlines();
//        Collection<String> top_news = actor.asksFor(CountQuestion(GuardianNewsHomePage.NEWS_HEADINGS));
//        assertThat(top_news.size()).isGreaterThan(0);
//        actor.attemptsTo(Ensure
//                .that(GuardianNewsHomePage.NEWS_HEADINGS)
//                .isDisabled()
//        );
        //actor.attemptsTo(ClickNews.headline(actor, 1));
        System.out.println();
    }

    @And("{actor} decided to check the authenticity of these top news on Google Search Engine")
    public void confirmAuthenticity(Actor actor) {

    }

    @Then("{actor} should see similar news reported from at least {int} others sources on the Google search results")
    public void verifyMatchesFoundOnGoogle(Actor actor, int min_match_expected) {

    }

    @And("the news from the alternative sources should be the latest news")
    public void verifyWhenTheNewsIsPublished() {

    }
}
