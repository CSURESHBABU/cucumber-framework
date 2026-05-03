package runner;
//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "src/test/features",
                glue = "stepDefinitions",
                monochrome = true,
                plugin = {"pretty","html:target/cucumber-reports.html"}
                //dryRun = true
        )
public class TestRunner extends AbstractTestNGCucumberTests {
}
