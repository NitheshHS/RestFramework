package com.orangeHRM.genericLib;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerIMP implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		Utility.takeScreenshot(result);
	}


}
