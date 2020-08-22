package com.vTiger.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Organization {

	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrganizationIcon;
	
	@FindBy(name="accountname")
	private WebElement orgNameTF;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
	
	public WebElement getCreateOrganizationIcon() {
		return createOrganizationIcon;
	}

	public WebElement getOrgNameTF() {
		return orgNameTF;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	public void createOrganization(String orgName) {
		createOrganizationIcon.click();
		orgNameTF.sendKeys(orgName);
		savebutton.click();
	}
	
}
