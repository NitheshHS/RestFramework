package com.Nithesh.ObjctRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * 
 * @author Nithesh
 *
 */
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class ContactInfoPage {
	WebDriver driver;
	public ContactInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(.,'Contact Information')]")
	private WebElement contactInfo;
	
	public WebElement getContactInfo() {
		return contactInfo;
	}
	
	public void verifyContactInfo(String conatctName) {
		String info=contactInfo.getText();
		Assert.assertTrue(info.contains(conatctName));
	}
	
	
	
}
