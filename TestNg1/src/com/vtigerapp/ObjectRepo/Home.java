package com.vtigerapp.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.Base.GenericLibs.Utility;

public class Home{
	@FindBy(linkText="Contacts")
	private WebElement contactLink;
	
	@FindBy(xpath="//img[contains(@src,'user.PNG')]")
	private WebElement userIcon;
	
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signoutLink;

	public WebElement getUserIcon() {
		return userIcon;
	}

	public WebElement getSignoutLink() {
		return signoutLink;
	}
	
	public void signout(WebDriver driver)
	{
		Utility.moveToElement(driver, userIcon);
		signoutLink.click();
	}
}
