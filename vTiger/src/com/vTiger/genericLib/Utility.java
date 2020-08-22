package com.vTiger.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;



public class Utility {
	public static Actions act;
	
	public static void takeScreenshot(WebDriver driver, ITestResult result)
	{
		String methodName = result.getMethod().getMethodName();
		Date date=new Date();
		int d = date.getDate();
		String[] dAry=date.toString().split(" ");
		String month = dAry[1];
		String year = dAry[5];
		String time = dAry[3].replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)Base.staticdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+methodName+"_"+d+"_"+month+"_"+year+"_"+time+"_.PNG");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
	
	public static void moveToElement(WebDriver driver, WebElement element)
	{
		act = new Actions(driver);
		act.moveToElement(element);
	}
	
	public static void dropDown(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
}

