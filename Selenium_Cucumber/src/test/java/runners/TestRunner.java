package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = "src/test/java/tests",
        glue = {"elements", "pages", "Steps", "utils"},
        //tags = {"@Print"},
        plugin = {"html:C:\\ToolsQA\\CucumberFramework",
                "json:C:\\ToolsQA\\CucumberFramework\\cucumber.json",
                "junit:C:\\ToolsQA\\CucumberFramework\\cucumber.xml",
                "pretty"},
        monochrome = true
)
public class TestRunner {
}