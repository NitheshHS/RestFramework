package com.Nithesh.OrgTest;
import org.testng.Assert;
import org.testng.annotations.*;

import com.Nithesh.genericUtils.BaseClass;
import com.Nithesh.genericUtils.FileLib;
@Listeners(com.Nithesh.genericUtils.ListenerIMP.class)
public class Test1 extends BaseClass{
 @Test
 public void test() throws Throwable {
	 FileLib fLib=new FileLib();
	 String username = fLib.getPropertyKeyValue("usernama");
	 System.out.println(username);
	 Assert.assertEquals(true, false);
 }
}
