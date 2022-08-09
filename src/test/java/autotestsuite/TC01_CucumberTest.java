package autotestsuite;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import autotestsuite.tags.Regression;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(tags = "@TC01_CucumberTest",
        plugin = {"pretty"},
        features = "src/test/resources/features"
)
@Category({Regression.class})
public class TC01_CucumberTest {}
