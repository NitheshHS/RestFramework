package com.NewApp.GenericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.NewApp.PageObject.HomePage;
import com.NewApp.PageObject.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public FileLib fLib=new FileLib();
	public WebdriverUtits wLib=new WebdriverUtits();
	@BeforeSuite
	public void configBS() {
		
	}
//	@Parameters("browser")
//	@BeforeTest
//	public void configBT(String browservar) {
//		
//		if(browservar.equals("chrome")) {
//			driver=new ChromeDriver();
//		}
//		else if(browservar.equals("firefox")) {
//			driver=new FirefoxDriver();
//		}
//	}
	@BeforeClass
	public void configBC() throws Throwable {
		String browser=fLib.getPropertyKeyValue("browser");
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.get(fLib.getPropertyKeyValue("url"));
		wLib.setPageload(driver, 10);
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void configBM() throws Throwable {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login();
		
	}
	@AfterMethod
	public void configAM() throws InterruptedException {
		HomePage homePage=new HomePage(driver);
		homePage.logout();

	}
	@AfterClass
	public void configAC() {
		driver.close();
	}
	@AfterSuite
	public void configAT() {
		
	}

}
