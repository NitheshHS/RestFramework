package com.VTiger.testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadData {
	@DataProvider
	public Object[][] readData() 
	{
		Object[][] data = null;
		FileInputStream file;
		try {
			file = new FileInputStream("./src\\com\\commondata\\TestLead.xlsx");
			Workbook wb=WorkbookFactory.create(file);
			Sheet sh=wb.getSheet("Lead");
			int rowcount=sh.getLastRowNum();
			System.out.println(rowcount);
			int cellcount=sh.getRow(0).getLastCellNum();
			System.out.println(cellcount);
			 data=new Object[rowcount][cellcount];
			for(int i=0;i<rowcount;i++)
			{
				for (int j=0;j<cellcount;j++)
				{
					data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		}
@Test(dataProvider="readData")	
public void readAll(String firstname, String lastname, String company, String title, String leadsource) {
	System.out.println(firstname+" "+lastname+" "+company+" "+title+" "+leadsource);
}
}
	


