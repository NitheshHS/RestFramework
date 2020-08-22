package com.vTiger.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import com.vTiger.GenericLibs.FileLib;
import com.vTiger.GenericLibs.Utility;

public class Contacts {
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContactIcon;
	
	@FindBy(name="salutationtype")
	private WebElement firstdrop;
	
	@FindBy(name="firstname")
	private WebElement firstnameTF;
	
	@FindBy(name="lastname")
	private WebElement lastnameTF;
	
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
	

	public WebElement getCreateContactIcon() {
		return createContactIcon;
	}

	public WebElement getFirstdrop() {
		return firstdrop;
	}

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}
	

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	public void enterContacts(String value,String firstname,String lastname) {
		createContactIcon.click();
		Utility.dropDown(firstdrop, value);
		firstnameTF.sendKeys(firstname);
		lastnameTF.sendKeys(lastname);
		
		savebutton.click();
	}
}
