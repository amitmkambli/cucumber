package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	// import annotations from cucumber and not junit
	// commenting (order= 1) as getting error on adding hooks @Smoke
	@Before("@Smoke") // (order= 1)
	public void setup_browser(Scenario sc) {
		System.out.println("launch chrome browser");
		System.out.println(sc.getName());
	}
	
//comented to test tags with hooks i.e. ("@Smoke")
//	@Before(order = 2)
//	public void setup_url() {
//		System.out.println("launch url");
//	}
//	
//	@After(order= 2)
//	public void teardown_close(Scenario sc) {
//		System.out.println("close the browser");
//		System.out.println(sc.getName());
//	}
	
	@After("@Smoke") //(order= 1)
	public void teardown_logout() {
		System.out.println("logout from application");
	}	
	
	@BeforeStep(order= 1)
	public void takescreenshot() {
		System.out.println("take a screenshot");
	}
	
	@AfterStep(order= 1)
	public void refreshpage() {
		System.out.println("refresh the page");
	}
}
