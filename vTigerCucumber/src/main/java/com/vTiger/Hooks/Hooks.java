package com.vTiger.Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vTiger.GenericLib.FileLib;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public WebDriver driver;
	public static WebDriver staticDriver;
	public FileLib fLib=new FileLib();
	@Before
	public void setUp() throws Throwable {
		if(fLib.getPropertyKeyValue("chrome").equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(fLib.getPropertyKeyValue("firefox").equals("firefox")) {
			driver=new ChromeDriver();
		}
		staticDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(fLib.getPropertyKeyValue("url"));
	
	}
	@After
	public void tearDown() {
		driver.close();
	}

}
