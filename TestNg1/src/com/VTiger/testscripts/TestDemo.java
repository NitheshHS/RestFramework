package com.VTiger.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Base.GenericLibs.Base;

public class TestDemo extends Base{
	@Test
	public void testdemo()
	{
		Assert.assertTrue(false);
		System.out.println("passed");
	}

}
