package com.Nithesh.ObjctRepository;

import org.openqa.selenium.By;
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
public class CreateContactPage extends WebDriverUtils{
	WebDriver driver;
	public CreateContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/* webelement in create contact page*/
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContactIMG;
	
	@FindBy(name="lastname")
	private WebElement lastNameTF;
	
	@FindBy(xpath="//img[contains(@src,'/select.gif')]")
	private WebElement organizationNameLookUp;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBT;
	/*getter method*/
	public WebElement getCreateContactIMG() {
		return createContactIMG;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getOrganizationNameLookUp() {
		return organizationNameLookUp;
	}

	public WebElement getSaveBT() {
		return saveBT;
	}
	
	/*business logic*/
	public void createConteact(String lastName,String orgName) {
		createContactIMG.click();
		lastNameTF.sendKeys(lastName);
		organizationNameLookUp.click();
		switchToNewTab(driver, "specific_contact_account_address");
		OrganizationPage org=new OrganizationPage(driver);
		org.getSearchEDT().sendKeys(orgName);
		select(org.getSearchDD(), "Organization Name");
		org.getSearchBT().click();
		driver.findElement(By.xpath("//a[text()='"+orgName+"']")).click();
		switchToNewTab(driver, "Administrator");
		saveBT.click();
		
		
	}
	
	 

}
