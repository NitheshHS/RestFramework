package com.Nithesh.genericUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerIMP implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		Date d=new Date() ;
		String date = d.toString().replace(" ", "_").replace(":", "_");
		EventFiringWebDriver event=new EventFiringWebDriver(BaseClass.staticdriver);
		File src = event.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./Screenshot/"+methodName+"_"+date+"_"+".PNG"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
