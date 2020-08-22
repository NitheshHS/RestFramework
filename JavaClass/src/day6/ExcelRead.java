package day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\user\\Desktop\\TestLead.xlsx");
		try {
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Lead");
			int lastrow=sheet.getLastRowNum();
			for(int i=0;i<lastrow;i++)
			{
				int lastcell = sheet.getRow(i).getLastCellNum();
				for(int j=0;j<lastcell;j++)
				{
					String data=sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(data+" ");
				}
			}
			workbook.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
