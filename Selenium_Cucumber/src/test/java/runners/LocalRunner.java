package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:reports/cucumber-html-report",
                "json:reports/localSuite.json",
                "pretty"},
        features = {"src/test/java/tests/"},
        glue = {"steps"},
        strict = true,
        monochrome = true,
        stepNotifications = true//,
        //tags = "@Ready"
)
class LocalRunner {

}
