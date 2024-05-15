package parallel;

import java.util.Properties;

import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	private DriverFactory driveFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	
	// import @Before from io.cucumber and not junit
	// we can skip scenario by adding a tag e.g. @skip and calling it in testrunner e.g tags = "not @Skip", 
	// or mvn command : mvn test -DCucumber.options="--tags 'not @Skip'"
	// or we can create below method in applicationhooks
	@Before(value = "@Skip", order = 0)
	public void skip_scenario(Scenario scenario) {
		System.out.println("skipped scenario is " + scenario.getName());
		Assume.assumeTrue(false);
	}

	@Before(order = 1)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}
	
	@Before(order = 2)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driveFactory = new DriverFactory();
		driver = driveFactory.init_driver(browserName);
		
	}
	
	// After methods are executed in reverse order i.e. order=0 will be executed in the end
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order = 1)
	public void tearDown(Scenario scenaro) {
		if(scenaro.isFailed()) {
			String screenShotName = scenaro.getName().replace(" ", "_");
			// if we wnat to use this in jenkins file will not work, so better to use OutputType.BYTES or Base64 instead of OutputType.File
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			//can be used to attach screenshot to a report 
			scenaro.attach(sourcePath, "image/png", screenShotName);
		}
	}
}
