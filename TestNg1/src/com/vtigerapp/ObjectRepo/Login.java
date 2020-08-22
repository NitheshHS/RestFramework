package com.vtigerapp.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(name="user_name")
	private WebElement userNameTF;
	
	@FindBy(name="user_password")
	private WebElement passwordTF;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;

	public WebElement getUserNameTF() {
		return userNameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void login(String username, String password)
	{
		userNameTF.sendKeys(username);
		passwordTF.sendKeys(password);
		loginButton.click();
	}
	
	

}
