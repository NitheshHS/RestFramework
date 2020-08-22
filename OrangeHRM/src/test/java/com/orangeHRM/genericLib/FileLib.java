package com.orangeHRM.genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class used to read data from external file
 * @author Nithesh H S
 *
 */
public class FileLib {
	public String getPropertyValue(String key) {
		Properties prop=null;
		try {
			FileInputStream file=new FileInputStream("H:\\ELF-5 selenium\\OrangeHRM\\src\\test\\java\\commonData\\common.properties");
			prop=new Properties();
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	
	
	public Object[][] readExcelFile(String sheetName)
	{
		File file=new File("");
		Object[][] data = null;
		try {
			FileInputStream fi=new FileInputStream(file);
			Workbook wb=WorkbookFactory.create(fi);
			Sheet s=wb.getSheet(sheetName);
			int lastRow = s.getLastRowNum();
			int lastCell = s.getRow(0).getLastCellNum();
			data=new Object[lastRow][lastCell];
			for(int i=0;i<lastRow;i++)
			{
				for(int j=0;j<lastCell;j++)
				{
					data[i][j]=s.getRow(i+1).getCell(j).getStringCellValue();
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}
	

}
