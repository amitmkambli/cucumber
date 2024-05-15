package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class UberBookingSteps {
	
	@Given("User wants to book a car type {string} fom ubber app")
	public void user_wants_to_book_a_car_type_fom_ubber_app(String carType) {
	    System.out.println("step 1 car type is " + carType);
	}
	
	@When("User selects car type {string} and pick up point from {string} and drop location {string}")
	public void user_selects_car_type_and_pick_up_point_from_and_drop_location(String carType, String pickLocation, String dropLocation) {
	    System.out.println("step 2 car type, picklocation, droplocation : " + carType +" - "+ pickLocation +" - "+ dropLocation);
	}
	
	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("step 3");
	}
	
	@Then("Driver ends the jpurney")
	public void driver_ends_the_jpurney() {
		System.out.println("step 4");
	}
	
	@Then("User pays {int} USD")
	public void user_pays_usd(int price) {
	    System.out.println("step 5 payment made " + price);
	}

}
