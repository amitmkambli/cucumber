package parallel;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountPageSteps {
	
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountspage; 
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credintialsTable) {
		
		//we can use dataTable as a list[dataTable.asLists()] or map [dataTable.asMaps()]
		List<Map<String, String>> credentials =   credintialsTable.asMaps();
		// in the feature we have defined data table with column headers username & password
		// from the map fetched from dataTable we are using keys 'username' , 'password' to fetch the respective values
		String username = credentials.get(0).get("username");
		String password = credentials.get(0).get("password");
		
		DriverFactory.getDriver().get("https://automationexercise.com/login");
		
		accountspage = loginpage.doLogin(username, password);
	}

	@Given("user is on Accounts page")
	public void user_is_on_accounts_page() {
		String title = accountspage.getAccountsPageTitle();
		System.out.println("accounts page title is " + title);
		Assert.assertTrue("this test is designed to fail to check rerun of failed tests", title.equals("abcdef/.."));
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable headerLinks) {
		// Retrieving data table as list, in above method we have used asMaps().
		List<String> expectedheaderlinks = headerLinks.asList();
		System.out.println("Expected headers links : " + expectedheaderlinks);
		
		List<String> actualheaderlinks = accountspage.getHeaderLinksList();
		System.out.println("actual header links : " + actualheaderlinks);
		
		expectedheaderlinks.forEach(l -> Assert.assertTrue("expected link text " + l + " is not matching", actualheaderlinks.contains(l)));
		
		//to check that one list has all elements of other list
		Assert.assertTrue(actualheaderlinks.containsAll(actualheaderlinks));
	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expectedheaderlinksCount) {
		Assert.assertTrue( expectedheaderlinksCount.equals(accountspage.getHeaderLinksCount()));
		
	}
}
