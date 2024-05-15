package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Uber.feature"},
		glue = {"stepdefinations","MyHooks"},
		//to execute only smoke test, add @Smoke tag 
		// to run smoke or regression : "@Smoke or @Regression"
		// to run test having both smoke and regression tags : "@Smoke and @Regression"
		// to run test not having smoke  : "not @Smoke"
		// we can also add tags to the entire feature
		tags = "not @Smoke",
		//to highlight test results in different colors
		plugin = {"pretty",
					"json:target/MyReports/report.json",
					"junit:target/MyReports/report.xml"
			},
		monochrome = false,		// for better alignment of report but colors go away
		dryRun = false			// will not execute but will check if all script is ok
		//will publish a report on cloud, url will be in console results
		//we can also create a cucumber.properties file in src/test/resources and add cucumber.publish.enabled=true 
		//publish = true
		)

public class UberTest {
	// mvn command : mvn test -Dcucumber.filter.tags="@Smoke or @Regression"

}
