package com.orangeHRM.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

public class Utility {
	public static void takeScreenshot(ITestResult result)
	{
		String mName = result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot)Base.staticDriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/"+mName+".PNG");
		if(!dst.exists())
			try {
				dst.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
