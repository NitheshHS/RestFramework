package com.NewApp.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NewApp.GenericUtils.WebdriverUtits;
/**
 * This page contains all home page web elements and their business logic
 * @author Nithesh HS
 *
 */
public class HomePage extends WebdriverUtits{
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 * webelements in home page
	 */
	@FindBy(id="welcome")
	private WebElement welcomeAdminLink;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutLink;
	
	/**
	 * getters method
	 */
	public WebElement getWelcomeAdminLink() {
		return welcomeAdminLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	/**
	 * Method for logout from application
	 * @throws InterruptedException 
	 */
	public void logout() throws InterruptedException {
		waitAndClick(driver, welcomeAdminLink);
		waitAndClick(driver, logoutLink);
		
	}
}
