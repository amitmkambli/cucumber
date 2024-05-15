package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", for extent spark report
// "timeline:test-output-thread/" for timeline report of each thread 'test-output-thread/' is the folder name for report

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/features"},
		glue = {"stepdefinitions","AppHooks"},
		plugin= {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"}
		)

public class MyTestRunner {

}
