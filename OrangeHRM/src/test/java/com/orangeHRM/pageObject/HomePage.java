package com.orangeHRM.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	@FindBy(how=How.XPATH,using="//a[.='Welcome Admin']" )
	private WebElement welcomAdminLink;
	
	@FindBy(how=How.XPATH, using="//a[.='Logout']")
	private WebElement logOutLink;

	public WebElement getWelcomAdminLink() {
		return welcomAdminLink;
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	public void logOut()
	{
		welcomAdminLink.click();
		logOutLink.click();
		
	}
	

}
