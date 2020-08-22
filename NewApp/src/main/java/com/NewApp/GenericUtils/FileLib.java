package com.NewApp.GenericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Nithesh HS
 *
 */
public class FileLib {
	/**
	 * This method read the value from property file by using key
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		
		File file=new File("H:\\ELF-5 selenium\\NewApp\\src\\main\\java\\commonData\\Credentials.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
	/**
	 * This method used to read excel cell value by specifing cell number and row number
	 * @param sheetName
	 * @param row
	 * @param column
	 * @return
	 * @throws Throwable
	 */
	public Object getExcelcellValue(String sheetName, int row, int column) throws Throwable {
		String filepath="./commonData\\Credentials.properties";
		File file=new File(filepath);
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Object ob=sh.getRow(row).getCell(column).toString();
		return ob;	
	}
	/**
	 * This method used read all data from excel sheet
	 * @param sheetName
	 * @return
	 * @throws Throwable
	 */
	public Object[][] readXcel(String sheetName) throws Throwable{
		String filepath="";
		File file=new File(filepath);
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int row = sh.getLastRowNum();
		int cell=sh.getRow(0).getLastCellNum();
		Object[][] data=new Object[row][cell];
		for(int i=0;i<row;i++) {
			for(int j=0;j<cell;j++) {
				data[i][j]=sh.getRow(i+1).getCell(j).toString();
			}
		}
		return data;	
	}
	/**
	 * This method used write data to excel sheet 
	 * @param sheetName
	 * @param row
	 * @param column
	 * @param data
	 * @throws Throwable
	 */
	public void writeExcel(String sheetName, int row, int column,String data) throws Throwable {
		String filepath="";
		File file=new File(filepath);
		FileInputStream fis=new FileInputStream(file);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row r=sh.getRow(row);
		Cell c=r.createCell(row);
		c.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);
		wb.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
