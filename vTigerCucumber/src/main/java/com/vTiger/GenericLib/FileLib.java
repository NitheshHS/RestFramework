package com.vTiger.GenericLib;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
	
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\resources\\CommonData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
	}

}
