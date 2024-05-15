package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	private WebDriver driver;
	private By headerLinks = By.cssSelector("div.container ul.nav.navbar-nav li");
	
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}
	
	public int getHeaderLinksCount() {
		return driver.findElements(headerLinks).size();
	}
	
	public List<String> getHeaderLinksList() {
		List<WebElement> links = driver.findElements(headerLinks);
		List<String> linksText = new ArrayList<String>() ;
		// we need to replace junk characters , actual string is "[Home,  Products, Cart, Logout..."
		links.forEach(l -> linksText.add(l.getText().trim().replaceAll("[^\\w\\s]", "")));
		return linksText;
	}
}
