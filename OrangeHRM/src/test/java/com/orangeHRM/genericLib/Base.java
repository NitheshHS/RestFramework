package com.orangeHRM.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangeHRM.pageObject.HomePage;
import com.orangeHRM.pageObject.LoginPage;

public class Base {
	FileLib file=new FileLib();
	public WebDriver driver;
	public static WebDriver staticDriver;
	@BeforeClass
	public void configBC() {
		if(file.getPropertyValue("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
			driver=new ChromeDriver();
			staticDriver=driver;
		}
		else if(file.getPropertyValue("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\Resources\\geckodriver.exe");
			driver=new FirefoxDriver();
			staticDriver=driver;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(file.getPropertyValue("url"));
	}
	@BeforeMethod
	public void configBM() {
		LoginPage lPage = PageFactory.initElements(driver, LoginPage.class);
		lPage.loginToOrangeHRM(file.getPropertyValue("username"), file.getPropertyValue("password"));
		
		
	}
	@AfterMethod
	public void configAM() {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.logOut();
		
	}
	
	
	@AfterClass
	public void configAC() {
		driver.close();
	}

}
