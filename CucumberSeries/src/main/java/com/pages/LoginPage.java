package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	//1. By locators : object repository
	private By emailID = By.cssSelector("div.login-form input[name='email']");
	private By password = By.cssSelector("div.login-form input[name='password']");
	private By submit = By.cssSelector("div.login-form button");
	
	private By signup = By.cssSelector("div.signup-form button");
	
	//2. Initialize constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	//3. page actions : features of the page in the form of methods
	// note : no assertions in the page class, only in test or step definition class
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPWLinkExists() {
		return (driver.findElements(signup).size() > 0);
	}
	
	public void enterUserName(String username) {
		driver.findElement(emailID).sendKeys(username);
	}
	
	public void enterPassword(String pw) {
		driver.findElement(password).sendKeys(pw);
	}
	
	public void clickOnLogin() {
		driver.findElement(submit).click();
	}
	
	public AccountsPage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(emailID).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(submit).click();
		
		return new AccountsPage(driver);
	}
}
