package parallel;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import com.pages.ContactUsPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsSteps {
	
	private ContactUsPage contactus = new ContactUsPage(DriverFactory.getDriver());
	
	@Given("user navigates to contact us")
	public void user_navigates_to_contact_us() {
		DriverFactory.getDriver().get("https://automationexercise.com/contact_us");
	}

	@When("user fill form from given sheetname {string} and rownumber {int}")
	public void user_fill_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		// unable to find file at 'C:\Users\amitm\eclipse-workspace\CucumberSeries', getting file not found exception. 
		List<Map<String, String>> testData = reader.getData("C:\\Users\\amitm\\OneDrive\\Documents\\testdata.xlsx", sheetName);
		
		String name = testData.get(rowNumber).get("name");
		String email = testData.get(rowNumber).get("email");
		String subject = testData.get(rowNumber).get("subject");
		String message = testData.get(rowNumber).get("message");
		
		contactus.fillContactUsForm(name, email, subject, message);
	}

	@When("use clicks on send button")
	public void use_clicks_on_send_button() {
		contactus.clickSend();
	}

	@Then("it shows a sucessfull message {string}")
	public void it_shows_a_sucessfull_message(String expectedmsg) {
		System.out.println("actual msg : " + contactus.getSuccessMessg());
		Assert.assertTrue(expectedmsg.equals(contactus.getSuccessMessg()));
	}
}
