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
public class ContactPage extends WebDriverUtils{
	WebDriver driver;
	public ContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="search_text")
	private WebElement searchEDT;
	
	@FindBy(id="bas_searchfield")
	private WebElement inDD;
	
	@FindBy(name="submit")
	private WebElement searchBT;
	
	@FindBy(name="selectall")
	private WebElement checkBox;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement deleteBT;
	
	@FindBy(xpath="//a[@title='Organizations']")
	private WebElement organizationLink;
	
	public WebElement getSearchEDT() {
		return searchEDT;
	}

	public WebElement getInDD() {
		return inDD;
	}

	public WebElement getSearchBT() {
		return searchBT;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getDeleteBT() {
		return deleteBT;
	}

	public WebElement getOrganizationLink() {
		return organizationLink;
	}
	
	public void searchConatact(String contactLastName) {
		select(inDD, "Last Name");
		searchEDT.sendKeys(contactLastName);
		searchBT.click();
		
	}
	
	public void deleteContact() throws InterruptedException {
		
		checkBox.click();
		waitAndClickElement(driver, deleteBT);
		
		alertOk(driver);
	}
	
	

}
