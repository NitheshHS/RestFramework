package com.Nithesh.ObjctRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrganizationInfoPage {
	WebDriver driver;
	public OrganizationInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Organization Information')]")
	private WebElement organizationInfo;
	
	public void verifyOrganizationName(String orgName) {
		String orgInfo = organizationInfo.getText();
		Assert.assertTrue(orgInfo.contains(orgName));
	}

}
