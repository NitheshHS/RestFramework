package com.vTiger.testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vTiger.genericLib.Base;
import com.vTiger.genericLib.FileLib;
@Listeners(com.vTiger.genericLib.ListenerImp.class)
public class CreateOrganozation extends Base {
	//@DataProvider
	public Object[][] readData()
	{
		return fil.readAllDataFromExcel("organization");
	}
	
	//@Test(dataProvider="readData")
	public void createOrganization(String orgName,String website,String tickerFile,String Employees) {
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.name("website")).sendKeys(website);
		driver.findElement(By.id("tickersymbol")).sendKeys(tickerFile);
		driver.findElement(By.id("employees")).sendKeys(Employees);
		
	}
	
	@Test
	public void test() {
		System.out.println("done"
				+ "");
	}

}
