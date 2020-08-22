package day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {
public static void main(String[] args) {
	try {
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\user\\\\Desktop\\\\TestLead.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Lead");
		int rowCount = sh.getLastRowNum();
		int cellCount=sh.getRow(0).getLastCellNum();
		Object[][] data=new Object[rowCount][cellCount];
		for(int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<=cellCount;j++)
			{
				System.out.println(data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue());
			}
			
			
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
