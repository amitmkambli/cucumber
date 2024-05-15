package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Search.feature"},
		// MyHooks : has hooks i.e. setup & tear down methods
		glue = {"stepdefinations","MyHooks"},
				tags = "@Smoke or @Regression",
		//to highlight test results in different colors
		plugin = {"pretty"}
		)

//if we want to run the file from maven, then junit needs file name ending with Test. 
//hence we changed file name from AmazonTestRunner to AmazonTest
public class AmazonTest {
	
}
