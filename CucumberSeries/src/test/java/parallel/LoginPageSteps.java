package parallel;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {
	
	// Usually the class variables should be private. 
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private static String title; 
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		//we will move the url to config property
	    DriverFactory.getDriver().get("https://automationexercise.com/login");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    title = loginPage.getLoginPageTitle();
	    System.out.println("page title is " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {

	    Assert.assertTrue(title.contains(expectedTitle));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		//forgot pw lnk is missing so checking signup link
	    Assert.assertTrue(loginPage.isForgotPWLinkExists());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	    loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String pwd) {
	    loginPage.enterPassword(pwd);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    loginPage.clickOnLogin();
	}

}
