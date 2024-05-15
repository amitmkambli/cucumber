package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//while executing using junit and maven-failsafe-plugin
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//while running using testng
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//while executing using junit and maven-failsafe-plugin
//@RunWith(Cucumber.class)
// while running specific feature file : src/test/resources/parallel/ContactUs.feature
//to capture failed test "rerun:target/failedrerun.txt"
// mvn command to skip test : mvn test -DCucumber.options="--tags 'not @Skip'"
// we can also add method in application hooks, report will show test skipped via this method
@CucumberOptions(
		features = {"src/test/resources/parallel/LoginPage.feature"},
		glue = {"parallel"},
//		tags = "not @Skip",
		plugin= {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedrerun.txt"
				}
		)
public class ParallelRun extends AbstractTestNGCucumberTests{
	
	// for running tests using testng
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
