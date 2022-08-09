package autotestsuite.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://wikipedia.org")
public class WikipediaHomePage extends PageObject {
    public static final Target HEADING =  Target.the("article identifier").locatedBy("#firstHeading");
}
