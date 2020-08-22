package com.VTiger.testscripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.GenericLibs.Base;

@Listeners(com.Base.GenericLibs.ListenerImp.class)
public class CreateOrganizationTest extends Base{
	@Test
	public void createOrganization() {
		String orgName="Qspiders1";
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		String act = driver.findElement(By.id("dtlview_Organization Name")).getText();
		Assert.assertEquals(act, orgName);
	}
}
