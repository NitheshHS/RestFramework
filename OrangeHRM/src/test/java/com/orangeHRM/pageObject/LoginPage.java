package com.orangeHRM.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="txtUsername")
	private WebElement usernameTF;
	
	@FindBy(id="txtPassword")
	private WebElement passwordTF;
	
	@FindBy(id="btnLogin")
	private WebElement submitBT;

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getSubmitBT() {
		return submitBT;
	}
	
	public void loginToOrangeHRM(String username, String password)
	{
		usernameTF.sendKeys(username);
		passwordTF.sendKeys(password);
		submitBT.click();
		
		
	}
	

}
