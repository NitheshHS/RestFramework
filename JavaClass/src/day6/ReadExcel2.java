package day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel2 {
public static void main(String[] args) {
	File file=new File("C:\\Users\\user\\Desktop\\ReadExcel.xlsx");
	try {
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		int lastrow = sheet.getLastRowNum();
		for(int i=0;i<lastrow;i++) {
			int lastcell = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<lastcell;j++)
			{
				String value=sheet.getRow(i+1).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
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
	
}
}
