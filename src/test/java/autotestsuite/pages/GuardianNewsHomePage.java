package autotestsuite.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("https://www.theguardian.com/tone/news")
public class GuardianNewsHomePage extends PageObject {

    @FindBy(css = "a.u-faux-block-link__overlay.js-headline-text")
    List<WebElement> xx;
    public static final Target NEWS_HEADINGS = Target.the("News heading list").locatedBy("a.u-faux-block-link__overlay.js-headline-text");
    public static final Target COOKIE_YES = Target.the("Cookies Yes, I am happy").locatedBy("button[title^='Yes']");

    public void getHeadlines() {
        for (WebElement x : xx) {
            x.click();
            waitABit(1000);
        }
    }
}
