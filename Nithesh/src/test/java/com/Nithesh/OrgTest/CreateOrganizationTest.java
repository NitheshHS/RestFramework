package com.Nithesh.OrgTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Nithesh.ObjctRepository.CreateOrganizationPage;
import com.Nithesh.ObjctRepository.HomePage;
import com.Nithesh.ObjctRepository.OrganizationInfoPage;
import com.Nithesh.genericUtils.BaseClass;

public class CreateOrganizationTest extends BaseClass {
	@Test
	public void createOrganizationTest() throws Throwable {
		String orgName = eLib.getExcelData("org", 1, 2)+wLib.getRamDomNum();
		String org_Type=eLib.getExcelData("org", 1, 3);
		String org_industry=eLib.getExcelData("org", 1, 4);
		driver.findElement(By.linkText("Organizations")).click();
		
		HomePage homePage=new HomePage(driver);
		homePage.navigateToOrganization();
		
		CreateOrganizationPage cop=new CreateOrganizationPage(driver);
		cop.createOrganization(orgName, org_industry, org_Type);
		
		OrganizationInfoPage orgInfo=new OrganizationInfoPage(driver);
		orgInfo.verifyOrganizationName(orgName);
	}
	
	@Test
	public void createOrganizationByorgNameTest() throws Throwable {
		String orgName = eLib.getExcelData("org", 1, 2)+wLib.getRamDomNum();
		HomePage home=new HomePage(driver);
		home.navigateToOrganization();
		
		CreateOrganizationPage cop=new CreateOrganizationPage(driver);
		cop.createOragnization(orgName);
		
		OrganizationInfoPage info=new OrganizationInfoPage(driver);
		info.verifyOrganizationName(orgName);
		
	}

}
