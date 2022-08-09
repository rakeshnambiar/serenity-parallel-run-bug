package autotestsuite.actions;

import autotestsuite.pages.GuardianNewsHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import autotestsuite.pages.WikipediaHomePage;

public class NavigateTo {
    public static Performable theWikipediaHomePage() {
        return Task.where("{0} opens the Wikipedia home page",
                Open.browserOn().the(WikipediaHomePage.class));
    }

    public static Performable theGuardianNewsHomePage() {
        return Task.where("{0} open the Guardian News home page",
                Open.browserOn().the(GuardianNewsHomePage.class));
    }
}
