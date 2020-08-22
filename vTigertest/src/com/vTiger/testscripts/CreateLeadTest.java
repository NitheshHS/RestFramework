package com.vTiger.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vTiger.GenericLibs.Base;
import com.vTiger.PageObject.Home;
import com.vTiger.PageObject.Lead;

public class CreateLeadTest extends Base {
	@DataProvider
	public Object[][] readdata() {
		return fi.readAllDataFromExcel(fi.getCommonKeyValue("sheetname1"));
	}
	
	
	@Test(dataProvider="readdata")
	public void createLead(String firstvalue,String firstname, String lastname, String company, String title, String leadvalue)
	{
		home=PageFactory.initElements(driver, Home.class);
		home.clickOnLead();
		Lead lead = PageFactory.initElements(driver, Lead.class);
		lead.enetrLeadDtails(firstvalue, firstname, lastname, company, title, leadvalue);
		
	}

}
