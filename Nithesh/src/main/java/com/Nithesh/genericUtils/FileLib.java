package com.Nithesh.genericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
	public String getPropertyKeyValue(String key) throws Throwable  {
		 File file=new File("./testData\\commonData.properties");
		 FileInputStream fis=new FileInputStream(file);
		 Properties prop=new Properties();
		 prop.load(fis);
		 return prop.getProperty(key);
}
}
