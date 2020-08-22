package com.Nithesh.genericUtils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Nithesh.ObjctRepository.HomePage;
import com.Nithesh.ObjctRepository.LoginPage;
/**
 * This class contains common configuration steps for all testscripts
 * @author Nithesh
 *
 */
public class BaseClass {
	public DataBaseLib dLib=new DataBaseLib();
	public ExcelLib eLib=new ExcelLib();
	public FileLib fLib=new FileLib();
	public WebDriverUtils wLib=new WebDriverUtils();
	public WebDriver driver;
	public static WebDriver staticdriver;
	@BeforeSuite
	public void configBS() {

	}
	/**
	 * this configuration method used for parallel execution of testscript in different browser
	 * @throws Throwable
	 */
//	@Parameters("browser")
//	@BeforeTest
//	public void configBT(String browser) {
//		if(browser.equals("chrome")) {
//			driver=new ChromeDriver();
//		}
//		else if(browser.equals("firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
//		else
//		{
//			driver=new ChromeDriver();
//		}
//	}
	/**
	 * this configuration method used launch browser in normal execution
	 * @throws Throwable
	 */
	@BeforeClass
	public void configBC() throws Throwable {
		String BROWSER = fLib.getPropertyKeyValue("browser");
		String URL=fLib.getPropertyKeyValue("url");
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
			staticdriver=driver;
		}
		else if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
			staticdriver=driver;
		}
		else
		{
			driver=new ChromeDriver();
			staticdriver=driver;
		}
		driver.get(URL);
		driver.manage().window().maximize();
		wLib.waitForPagetoLoad(driver);

	}
	@BeforeMethod
	public void configBM() throws Throwable {
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD=fLib.getPropertyKeyValue("password");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(USERNAME, PASSWORD);
	}
	@AfterMethod
	public void configAM() {
		HomePage home=new HomePage(driver);
		home.logOut();
	}
	@AfterClass
	public void configAC() {
		driver.close();
	}
	@AfterSuite
	public void configAS() {
		dLib.disConnectToDataBase();
	}



}
