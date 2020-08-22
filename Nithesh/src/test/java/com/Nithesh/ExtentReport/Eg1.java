package com.Nithesh.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.graphbuilder.math.ExpressionTree;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Eg1 {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest extentTest;
	@BeforeMethod
	public void startTest() {
		extent=new ExtentReports(System.getProperty("user.dir")+"\\test-output/extentReport.html",true);
		extent.addSystemInfo("user name", "Nithesh");
		
	}
	@Test
	public void test1() {
		extentTest=extent.startTest("test1");
		System.out.println("test1");
	}
	@Test
	public void test2() {
		extentTest=extent.startTest("test2");
		System.out.println("test2");
	}
	@AfterMethod
	public void endTest(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "Test case failed is "+result.getName());
			extentTest.log(LogStatus.FAIL, result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Test case skipped is "+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Test case passed is "+result.getName());
		}
		extent.endTest(extentTest);
		extent.flush();
		extent.close();
		
	}

}
