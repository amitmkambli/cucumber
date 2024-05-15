package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLoginSteps {
	
	@Given("user is on Amazon landing page")
	public void user_is_on_amazon_landing_page() {
	    System.out.println("Step 1");
	}

	@Given("Sign in button is present on screen")
	public void sign_in_button_is_present_on_screen() {
		System.out.println("Step 2");
	}

	@When("user clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
		System.out.println("Step 3");
	}

	@When("user clicks Sign in button")
	public void user_clicks_sign_in_button() {
		System.out.println("user_clicks_sign_in_button");
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
	    System.out.println("user_is_on_home_page");
	}

	@Then("title of home page is {string}")
	public void title_of_home_page_is(String title) {
	    System.out.println("title_of_home_page_is " + title);
	}

	@Then("sign in button is not present")
	public void sign_in_button_is_not_present() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
