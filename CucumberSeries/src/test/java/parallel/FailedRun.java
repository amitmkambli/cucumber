package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//while executing using junit and maven-failsafe-plugin
//@RunWith(Cucumber.class)
//while running specific feature file : src/test/resources/parallel/ContactUs.feature
//to capture failed test "rerun:target/failedrerun.txt" and features = {"@target/failedrerun.txt"}
@CucumberOptions(
		features = {"@target/failedrerun.txt"},
		glue = {"parallel"},
		plugin= {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedrerun.txt"
				}
		)
public class FailedRun extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
