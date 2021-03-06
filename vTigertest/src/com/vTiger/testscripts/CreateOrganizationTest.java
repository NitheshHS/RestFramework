package com.vTiger.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vTiger.GenericLibs.Base;
import com.vTiger.PageObject.Home;
import com.vTiger.PageObject.Organization;
@Listeners(com.vTiger.GenericLibs.ListenerIMP.class)
public class CreateOrganizationTest extends Base {
	@Test
	public void createOrganization()
	{
		home=PageFactory.initElements(driver, Home.class);
		home.getOrganizationLink().click();
		Organization org = PageFactory.initElements(driver, Organization.class);
		org.createOrganization(fi.getCommonKeyValue("orgName"));
	}
}
