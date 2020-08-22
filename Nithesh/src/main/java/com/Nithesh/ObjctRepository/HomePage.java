package com.Nithesh.ObjctRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nithesh.genericUtils.WebDriverUtils;
/**
 * This class contains webelement in home page and their business logic
 * @author Nithesh H S
 *
 */
public class HomePage extends WebDriverUtils {
	WebDriver driver;
	/*constructor of home page*/
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*Webelements in home page*/
	@FindBy(linkText="Organizations")
	private WebElement organizationLink;
	
	@FindBy(linkText="Contacts")
	private WebElement contactLink;
	
	@FindBy(xpath="//a[.='More']")
	private WebElement moreLink;
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignsLink;
	
	@FindBy(xpath="//img[contains(@src,'/user.PNG')]")
	private WebElement AdminstratorIMG;
	
	@FindBy(linkText="Sign Out")
	private WebElement signoutLink;

	/* getters method for webelement*/
	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getCampaignsLink() {
		return campaignsLink;
	}

	public WebElement getAdminstratorIMG() {
		return AdminstratorIMG;
	}

	public WebElement getSignoutLink() {
		return signoutLink;
	}
	
	/* business logic elements in home page*/
	public void navigateToOrganization() {
		organizationLink.click();
	}
	public void navigateToCantacts() {
		contactLink.click();
	}
	
	public void navigateToCampaigns() {
		moveMouseToElemnet(driver, moreLink);
		campaignsLink.click();
	}
	
	public void logOut() {
		moveMouseToElemnet(driver, AdminstratorIMG);
		signoutLink.click();
	}
	
	
}
