package com.Nithesh.contactTest;

import org.testng.annotations.Test;

import com.Nithesh.ObjctRepository.ContactInfoPage;
import com.Nithesh.ObjctRepository.ContactPage;
import com.Nithesh.ObjctRepository.CreateContactPage;
import com.Nithesh.ObjctRepository.CreateOrganizationPage;
import com.Nithesh.ObjctRepository.HomePage;
import com.Nithesh.genericUtils.BaseClass;

public class DeleteContact extends BaseClass{
	
	@Test
	public void deleteContactTest() throws Throwable {
		String orgName = eLib.getExcelData("org", 1, 2)+wLib.getRamDomNum();
		String lastName=eLib.getExcelData("contact", 1, 4);
		HomePage home=new HomePage(driver);
		home.navigateToOrganization();
		
		CreateOrganizationPage cop=new CreateOrganizationPage(driver);
		cop.createOragnization(orgName);
		
		wLib.waitAndClickElement(driver, home.getContactLink());
		
		CreateContactPage ccp=new CreateContactPage(driver);
		ccp.createConteact(lastName, orgName);
		
		ContactInfoPage cip=new ContactInfoPage(driver);
		cip.verifyContactInfo(lastName);
		
		wLib.waitAndClickElement(driver, home.getContactLink());
		
		ContactPage cp=new ContactPage(driver);
		cp.searchConatact(lastName);
		System.out.println(cp.getOrganizationLink().getText());
		cp.deleteContact();
		
	}

}
