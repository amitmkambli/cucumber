package stepdefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	    System.out.println("user on registration page.");
	}

	@When("User enters following details")
	//public void user_enters_following_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new io.cucumber.java.PendingException();
	//}
	//above method is auto generated, we need 'DataTable' and not 'io.cucumber.datatable.DataTable', import Datatable fro cucumber
	//parameter name can be anything and not just 'dataTable'
	public void user_enters_following_details(DataTable dataTable) {
		// note : to avoid error use dataTable.asLists(String.class) and not dataTable.asList(String.class) 
		List<List<String>> userList =   dataTable.asLists(String.class);
		for(List<String> e : userList) {
			System.out.println(e);
		}
	}
	
	@When("User enters following details with columns")
	public void user_enters_following_details_with_columns(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> user =  dataTable.asMaps(String.class, String.class);
		
		System.out.println(user);
		for(Map<String, String> u : user) {
			for(String s : u.keySet()) {
				System.out.println(s +"::"+ u.get(s));
			}
		}
	}

	@Then("user registration should be sucessfull")
	public void user_registration_should_be_sucessfull() {
		System.out.println("user registration complete.");
	}
}
