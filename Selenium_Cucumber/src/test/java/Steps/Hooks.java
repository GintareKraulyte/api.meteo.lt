package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Before;
import utils.DriverFactory;

public class Hooks extends DriverFactory{

    public static Scenario scenario;

    @Before
    public void setUp(Scenario scenario) {
        Hooks.scenario = scenario;
        System.out.println("Hook done");
    }

    @After
    public void tearDown() {
        closeDriver();
    }
}
