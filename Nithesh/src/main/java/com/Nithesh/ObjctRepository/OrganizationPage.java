package com.Nithesh.ObjctRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	WebDriver driver;
	public OrganizationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search_txt")
	private WebElement searchEDT;
	
	@FindBy(name="search_field"	)
	private WebElement searchDD;
	
	@FindBy(name="search")
	private WebElement searchBT;
	public WebElement getSearchEDT() {
		return searchEDT;
	}

	public WebElement getSearchDD() {
		return searchDD;
	}

	public WebElement getSearchBT() {
		return searchBT;
	}
	
	

}
