package com.Nithesh.ObjctRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nithesh.genericUtils.WebDriverUtils;
/**
 * 
 * @author Nithesh
 *
 */
public class CreateOrganizationPage extends WebDriverUtils{
	WebDriver driver;
	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/*Webelements in create organization page*/
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOraganizationImg;
	
	@FindBy(name="accountname")
	private WebElement accountNameEDT;
	
	@FindBy(name="industry")
	private WebElement industryDD;
	
	@FindBy(name="accounttype")
	private WebElement accounttypeDD;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBT;
	
	/*getter method for webelement*/
	public WebElement getCreateOraganizationImg() {
		return createOraganizationImg;
	}

	public WebElement getAccountNameEDT() {
		return accountNameEDT;
	}

	public WebElement getIndustryDD() {
		return industryDD;
	}

	public WebElement getAccounttypeDD() {
		return accounttypeDD;
	}

	public WebElement getSaveBT() {
		return saveBT;
	}
	
	public void createOragnization(String orgName) {
		createOraganizationImg.click();
		accountNameEDT.sendKeys(orgName);
		saveBT.click();
	}
	
	public void createOrganization(String orgName, String orgIndustry, String orgType) {
		createOraganizationImg.click();
		accountNameEDT.sendKeys(orgName);
		select(industryDD, orgIndustry);
		select(accounttypeDD, orgType);
		saveBT.click();
	}
	
	
	
	
}
