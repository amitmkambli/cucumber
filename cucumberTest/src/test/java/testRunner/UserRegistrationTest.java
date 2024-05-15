package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Registration.feature"},
		glue = {"stepdefinations"},
		tags = "not @Smoke",
		plugin = {"pretty",
					"json:target/MyReports/report.json",
					"junit:target/MyReports/report.xml"
			},
		monochrome = false,		// for better alignment of report but colors go away
		dryRun = false			// will not execute but will check if all script is ok
		)
public class UserRegistrationTest {

}
