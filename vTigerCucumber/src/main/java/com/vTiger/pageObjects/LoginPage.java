package com.vTiger.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name="user_name")
	private WebElement userNameTF;
	
	@FindBy(name="user_password")
	private WebElement passwordTF;
	
	@FindBy(id="submitButton")
	private WebElement loginBT;

	public WebElement getUserNameTF() {
		return userNameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginBT() {
		return loginBT;
	}
	
	public void login(String username,String password) {
		userNameTF.sendKeys(username);
		passwordTF.sendKeys(password);
		loginBT.click();
	}

}
