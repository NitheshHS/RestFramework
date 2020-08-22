package com.Base.GenericLibs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;

public class Utility {
	public static Actions act;
	public static void moveToElement(WebDriver driver, WebElement element)
	{
		act=new Actions(driver);
		act.moveToElement(element).perform();;
	}
	
	public static void takeSreenshot(ITestResult result, WebDriver driver) 
	{
		String methodName = result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+methodName+".PNG");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
