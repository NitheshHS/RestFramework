package com.Nithesh.ExtentReport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class VtigerLoginTest {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest extentTest;
	public static String getScreenshot(WebDriver driver,String screenshotname) throws IOException {
		String date=new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new Date());
		EventFiringWebDriver event=new EventFiringWebDriver(driver);
		File src = event.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"/screenshot"+screenshotname+date+".PNG";
		File finalDestination=new File(destination);
		FileUtils.copyFile(src, finalDestination);
		return destination;
	}
	
	@BeforeTest
	public void configBT() {
		extent =new ExtentReports(System.getProperty("user.dir")+"/extentreport.html",true);
		extent.addSystemInfo("User name", "Nithesh");
	}
	@BeforeMethod
	public void configBM() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager",Keys.ENTER);
	}
	
	@Test
	public void test1() {
		extentTest=extent.startTest("first test");
		Assert.assertTrue(false);
		
	}
	@Test
	public void test2() {
		extentTest=extent.startTest("second test");
		Assert.assertTrue(true);
	}
	@AfterMethod
	public void configAM(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "Failed test case is :"+result.getName());
			extentTest.log(LogStatus.FAIL, "Failed test case is :"+result.getThrowable());
			String path=VtigerLoginTest.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(path));
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "skipped test case is: "+result.getName());
			extentTest.log(LogStatus.SKIP, result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "passed test case is: "+result.getName());
		}
		extent.endTest(extentTest);
		driver.quit();
		
	}
	@AfterTest
	public void configAT() {
		extent.flush();
		extent.close();
	}

}
