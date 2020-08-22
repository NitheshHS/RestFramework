package com.NewApp.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NewApp.GenericUtils.FileLib;
/**
 * This page object used to login to application
 * @author Nithesh HS
 *
 */
public class LoginPage{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
/**
 * Web elements in login page
 */
	@FindBy(id="txtUsername")
	private WebElement usernameTF;
	
	@FindBy(id="txtPassword")
	private WebElement passwordTF;
	
	@FindBy(id="btnLogin")
	private WebElement loginBT;
/**
 * getters method
 * @return
 */
	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginBT() {
		return loginBT;
	}
	/**
	 * This method used to login to application
	 * @param username
	 * @param password
	 */
	public void login(String username,String password) {
		usernameTF.sendKeys(username);
		passwordTF.sendKeys(password);
		loginBT.click();
	}
	
	public void login() throws Throwable {
		FileLib flib=new FileLib();
		usernameTF.sendKeys(flib.getPropertyKeyValue("username"));
		passwordTF.sendKeys(flib.getPropertyKeyValue("password"));
		loginBT.click();
	}
	
}
