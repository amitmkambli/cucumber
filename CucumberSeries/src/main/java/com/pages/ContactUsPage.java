package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
	WebDriver driver ;
	
	private By name = By.cssSelector("div#form-section input[name='name']");
	private By email = By.cssSelector("div#form-section input[name='email']");
	private By subject = By.cssSelector("div#form-section input[name='subject']");
	private By textarea = By.cssSelector("div#form-section textarea[name='message']");
	private By submit = By.cssSelector("div#form-section input[name='submit']");
	
	private By sucessmsg = By.cssSelector("div.status");

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getContactUsPageTitle() {
		return driver.getTitle();
	}
	
	public void fillContactUsForm(String fullname, String emailId, String sub, String message) {
		driver.findElement(name).sendKeys(fullname);
		driver.findElement(email).sendKeys(emailId);
		driver.findElement(subject).sendKeys(sub);
		driver.findElement(textarea).sendKeys(message);
	}
	
	public void clickSend() {
		driver.findElement(submit).click();		
		driver.switchTo().alert().accept();
	}
	
	public String getSuccessMessg() {
		return driver.findElement(sucessmsg).getText().trim();
	}
}
