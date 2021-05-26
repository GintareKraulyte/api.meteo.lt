package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPages;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;


public class CommonSteps extends DriverFactory {

    private final CommonPages commonPages = new CommonPages();

    @Given("I select {string}")
    public void iSelectBrowser(String browser) {
        setDriver(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://api.meteo.lt/");
    }

    @Then("header is visible")
    public void header() {
        commonPages.headerVisible();
    }
    @Then("heading is visible")
    public void heading() {
        commonPages.headingVisible();
    }



    @When("I scroll to {string} element")
    public void scrollToElement(String string) throws InterruptedException {
        commonPages.scrollToElement(string);
    }

    @When("I see places description")
    public void placesDescripion() { commonPages.placesDescriptionVisible();}

    @When("I see place-code description")
    public void placeCodeDescripion() { commonPages.placeCodeDescriptionVisible();}

    @When("I see forecasts description")
    public void forecastsDescription() {
        commonPages.forecastsDescriptionVisible();
    }

    @When("I see forecast-type description")
    public void forecastsTypeDescription() {
        commonPages.forecastsTypeDescriptionVisible();
    }
}
