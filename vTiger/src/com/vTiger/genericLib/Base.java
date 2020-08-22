package com.vTiger.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
public	FileLib fil=new FileLib();
  public WebDriver driver;
  public static WebDriver  staticdriver;
	@BeforeClass
	public void configBC()
	{
		if(fil.getpropertyKeyValue("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			staticdriver=driver;
		}
		else if(fil.getpropertyKeyValue("Browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			staticdriver=driver;
		}
		driver.manage().window().maximize();
		driver.get(fil.getpropertyKeyValue("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterClass
	public void configAc()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void configBM()
	{
		driver.findElement(By.name("user_name")).sendKeys(fil.getpropertyKeyValue("username"));
		driver.findElement(By.name("user_password")).sendKeys(fil.getpropertyKeyValue("password"),Keys.ENTER);
	}
	
	@AfterMethod
	public void configAM()
	{
		driver.findElement(By.xpath("//img[contains(@src,'user.PNG')]")).click();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	}
	
}
