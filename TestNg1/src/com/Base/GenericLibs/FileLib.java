package com.Base.GenericLibs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
/**
 * 
 * @author user
 *
 */
public class FileLib {
	/**
	 * This method will return the String value in property file
	 * @param key
	 * @return String
	 */
	public String getpropertyKeyValue(String key)
	{
		
		Properties prop=null;
		try {
			FileInputStream ip = new FileInputStream("./src\\com\\commondata\\commondata.properties");
			 prop = new Properties();
			 prop.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}
	
	/**
	 * This method will return String value in specified row and cell
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return String
	 */
public String readDataFromExcel(String sheetName,int rowNum, int cellNum) {
		Sheet sh = null;
		
		try {
			FileInputStream ip =new FileInputStream("./src\\com\\commondata\\testdata.xlsx");
			Workbook wb =WorkbookFactory.create(ip);
			sh=wb.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
/**
 * This method will return the data in specified sheet
 * @param sheetName
 * @return Object[][]
 */


public Object[][] readAllDataFromExcel(String sheetName){
	Sheet sh=null;
	Object[][] data=null;
	try {
		FileInputStream ip=new FileInputStream("./src\\com\\commondata\\testdata.xlsx");
		Workbook wb=WorkbookFactory.create(ip);
		sh=wb.getSheet(sheetName);
		int rowCount=sh.getLastRowNum();
		int cellCount = sh.getRow(0).getLastCellNum();
		data=new Object[rowCount][cellCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++)
			{
				data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return data;
	
}
}
