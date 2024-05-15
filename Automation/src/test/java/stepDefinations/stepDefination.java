package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class stepDefination {
	
	@Given("^User is on NetBanking Lang page$")
	public void user_is_on_netBanking_lang_page() {
		System.out.println("User is on NetBanking Lang page...");
	}
	
	/*
	 * @When("^User login into application with username and password$") public void
	 * user_login_into_application_with_username_and_password() { System.out.
	 * println("User login into application with username and password..."); }
	 */
	
	@When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// you can change sr1, str2 to custom values e.g. user and password
	    System.out.println("User login into application with username " + arg1 + " and password " + arg2 +" ...");
	}

		
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		System.out.println("Home page is populated...");
	}
	
	@And("^Cards are displayed \"([^\"]*)\"$")
	public void cards_are_displayed(String pw) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String result = Boolean.valueOf(pw) ? "Cards are displayed..." : "Cards are not displayed...";
		System.out.println(result);
	}
}

