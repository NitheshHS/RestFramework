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

public class VtigerTest {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest extentTest;
	@BeforeTest
	public void setEvent() {
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport1.html",true);
		extent.addSystemInfo("Host Name", "Lenovo PC");
		extent.addSystemInfo("User Name", "Nithesh");
		extent.addSystemInfo("Environment", "QA");
		
	}
	@AfterTest
	public void endreport() {
		extent.flush();
		extent.close();
	}
	public static String getScreenshot(WebDriver driver,String screenshotName ) throws IOException {
		String date=new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new Date());
		EventFiringWebDriver event=new EventFiringWebDriver(driver);
		File source=event.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"/FailedTestScreenshot/"+screenshotName+date+".PNG";
		File finalDestination=new File(destination);
		FileUtils.copyFile(source, finalDestination);
		
		return destination;
		
	}
	@BeforeMethod
	public void setUp() {
		driver=new FirefoxDriver();
		driver.get("http://localhost:8888/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void loginTest() {
		extentTest=extent.startTest("loginTest");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager",Keys.ENTER);
		Assert.assertTrue(true);
		
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "Test case failed is "+result.getMethod().getMethodName());
			extentTest.log(LogStatus.FAIL, "Test case failed is "+result.getThrowable());
			String screenshotPath = VtigerTest.getScreenshot(driver, result.getMethod().getMethodName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Test case skipped is: "+result.getMethod().getMethodName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Test case passed is "+result.getMethod().getMethodName());
		}
		extent.endTest(extentTest);
		driver.quit();
	}
	

}
