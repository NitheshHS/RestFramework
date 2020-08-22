package ReadData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ReadData {
public static void main(String[] args) throws Exception {
	FileInputStream file=new FileInputStream("./src\\ContactTest.xlsx");
	Workbook wb=WorkbookFactory.create(file);
	Sheet sh=wb.getSheet("Lead");
	System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
}
}
