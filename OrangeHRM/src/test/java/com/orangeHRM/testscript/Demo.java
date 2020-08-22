package com.orangeHRM.testscript;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHRM.genericLib.Base;
@Listeners(com.orangeHRM.genericLib.ListenerIMP.class)
public class Demo extends Base {
	@Test
	public void demoTest()
	{
		System.out.println("success");
		//Assert.assertTrue(false);
	}

}
