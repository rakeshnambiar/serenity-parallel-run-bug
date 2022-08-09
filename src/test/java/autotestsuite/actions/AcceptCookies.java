package autotestsuite.actions;

import autotestsuite.pages.GuardianNewsHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.WebDriver;

public class AcceptCookies {
    public static Performable yesIamHappy(Actor actor) {
//        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
//        driver.manage().window().maximize();
//        driver.switchTo().frame(1);
        actor.attemptsTo(Switch.toFrame(1));
        actor.attemptsTo(Wait.until(
                WebElementQuestion.the(GuardianNewsHomePage.COOKIE_YES) , WebElementStateMatchers.isClickable()
        ).forNoMoreThan(30).seconds());
        return Task.where("Accepts the Cookies",
                Click.on(GuardianNewsHomePage.COOKIE_YES),
                Switch.toParentFrame());
    }
}
