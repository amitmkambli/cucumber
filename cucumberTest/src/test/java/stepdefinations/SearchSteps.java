package stepdefinations;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {
	
	Product product;
	Search search;
	
	//Annotations should match with feature file, the method name can be changed.
	@Given("I have a Search Field in Amazon Page")
	public void i_have_a_search_field_in_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//by default the above 2 lines will be added in each of the methods, we need to remove them and write actual selenium code
		System.out.println("Step 1 : I am on search page");
	}
	
	// integers are replaced by {string}, {int} in the annotation and method name. we can update the variable names in method name
	// below is the step definition using regular expression, this is older format and not is replaced by cucumber expression e.g. {string}. {int}
	// we can still use regular expression, but we cannot use both regular expression & cucumber expression in the same method
	//@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step 2 : search product with name " + productName + " an price " + price );
		
		product = new Product(productName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("step 3 : product " + productName + " is displayed.");
		
		search = new Search();
		search.displayProduct(product);
		
		Assert.assertEquals(search.displayProduct(product), productName);
		Assert.assertTrue(productName + "not found.", productName.equals(search.displayProduct(product)));
		
	}
	
	@Then("ordeid is {int} and username is {string}")
	public void ordeid_is_and_username_is(Integer orderId, String userName) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("orderID , user name values are - " + orderId + " :: " + userName);
	}
}
