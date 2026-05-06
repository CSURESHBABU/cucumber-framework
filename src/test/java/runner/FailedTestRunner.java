package runner;
//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "@target/failed-scenarios.txt",
                glue = "stepDefinitions",
                monochrome = true,
                plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json","rerun:target/failed-scenarios.txt"}
                //dryRun = true
        )
public class FailedTestRunner extends AbstractTestNGCucumberTests {
}
