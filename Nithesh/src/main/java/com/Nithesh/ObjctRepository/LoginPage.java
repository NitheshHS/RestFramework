package com.Nithesh.ObjctRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nithesh.genericUtils.FileLib;
/**
 * This class contain all webelement of login page and business logic
 * @author user
 *
 */
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*login page webelements*/
	@FindBy(name="user_name")
	private WebElement usernameETB;
	
	@FindBy(name="user_password")
	private WebElement passwordETB;
	
	@FindBy(id="submitButton")
	private WebElement submitBT;
	
	/*getters method for webeelement*/

	public WebElement getUsernameETB() {
		return usernameETB;
	}

	public WebElement getPasswordETB() {
		return passwordETB;
	}

	public WebElement getSubmitBT() {
		return submitBT;
	}
	
	/*Business logic for login*/
	public void login(String username, String password) {
		usernameETB.sendKeys(username);
		passwordETB.sendKeys(password);
		submitBT.click();
	}
	
	public void login() throws Throwable {
		FileLib flib=new FileLib();
		usernameETB.sendKeys(flib.getPropertyKeyValue("username"));
		passwordETB.sendKeys(flib.getPropertyKeyValue("password"));
		submitBT.click();
	}
	

}
