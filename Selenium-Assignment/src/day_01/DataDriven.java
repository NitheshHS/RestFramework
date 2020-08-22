package day_01;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
public static void main(String[] args) throws Exception {
	FileInputStream file = new FileInputStream("H:\\ELF-5 selenium\\Selenium-Assignment\\Excel\\New Microsoft "
			+ "Office Excel Worksheet.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	int rowcount = sheet.getLastRowNum();
	int cellcount = sheet.getRow(0).getLastCellNum();
	System.out.println("rows; "+rowcount);
	System.out.println("cell: "+cellcount);
	
	 String value1 = sheet.getRow(1).getCell(1).toString();
	 System.out.println(value1);
	for(int i=0;i<rowcount;i++)
	{
		XSSFRow currentrow = sheet.getRow(i);
		for(int j=0;i<cellcount;j++)
		{
			String value = currentrow.getCell(j).getStringCellValue();
			System.out.print(value);
		}
		System.out.println();
	}
	
}
}
