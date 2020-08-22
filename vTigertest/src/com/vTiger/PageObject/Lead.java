package com.vTiger.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vTiger.GenericLibs.Utility;

public class Lead {
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createLeadIcon;
	
	@FindBy(name="salutationtype")
	private WebElement firstnamedrop;
	
	@FindBy(name="firstname")
	private WebElement firstNameTF;
	
	@FindBy(name="lastname")
	private WebElement lastnameTF;
	
	@FindBy(name="company")
	private WebElement companyTF;
	
	@FindBy(id="designation")
	private WebElement titleTF;
	
	@FindBy(name="leadsource")
	private WebElement leadsourcedrop;
	
	@FindBy(name="industry")
	private WebElement industrydrop;
	
	@FindBy(name="annualrevenue")
	private WebElement annualrevTF;
	
	@FindBy(id="noofemployees")
	private WebElement noEmployeeTF;
	
	@FindBy(id="secondaryemail")
	private WebElement secondarymailTF;
	
	@FindBy(id="phone")
	private WebElement phoneTF;
	
	@FindBy(id="mobile")
	private WebElement mobileTF;
	
	@FindBy(id="fax")
	private WebElement faxTF;
	
	@FindBy(id="Email")
	private WebElement emailTF;
	
	@FindBy(name="website")
	private WebElement websiteTF;
	
	@FindBy(name="leadstatus")
	private WebElement leadstatusDrop;
	
	@FindBy(name="rating")
	private WebElement ratingdrop;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
	

	
	
	public WebElement getCreateLeadIcon() {
		return createLeadIcon;
	}
	public WebElement getFirstnamedrop() {
		return firstnamedrop;
	}
	public WebElement getFirstNameTF() {
		return firstNameTF;
	}
	public WebElement getLastnameTF() {
		return lastnameTF;
	}
	public WebElement getCompanyTF() {
		return companyTF;
	}
	public WebElement getTitleTF() {
		return titleTF;
	}
	public WebElement getLeadsourcedrop() {
		return leadsourcedrop;
	}
	public WebElement getIndustrydrop() {
		return industrydrop;
	}
	public WebElement getAnnualrevTF() {
		return annualrevTF;
	}
	public WebElement getNoEmployeeTF() {
		return noEmployeeTF;
	}
	public WebElement getSecondarymailTF() {
		return secondarymailTF;
	}




	public WebElement getPhoneTF() {
		return phoneTF;
	}




	public WebElement getMobileTF() {
		return mobileTF;
	}




	public WebElement getFaxTF() {
		return faxTF;
	}




	public WebElement getEmailTF() {
		return emailTF;
	}




	public WebElement getWebsiteTF() {
		return websiteTF;
	}




	public WebElement getLeadstatusDrop() {
		return leadstatusDrop;
	}




	public WebElement getRatingdrop() {
		return ratingdrop;
	}




	public WebElement getSavebutton() {
		return savebutton;
	}




	public void enetrLeadDtails(String firstvalue,String firstname, String lastname,String company, String title, String leadvalue)
	{
		createLeadIcon.click();
		Utility.dropDown(firstnamedrop, firstvalue);
		firstNameTF.sendKeys(firstname);
		lastnameTF.sendKeys(lastname);
		companyTF.sendKeys(company);
		titleTF.sendKeys(title);
		Utility.dropDown(leadsourcedrop, leadvalue);
		savebutton.click();
		
	}
	
}
