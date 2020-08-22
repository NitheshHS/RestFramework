package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideFromExcel {
	@DataProvider
	public Object[][] readExcel(){
		Object data[][] = null;
		File file=new File("C:\\Users\\user\\Desktop\\ContactTest.xlsx");
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			Workbook workbook=WorkbookFactory.create(fis);
			Sheet sheet=workbook.getSheet("Organization");
			int lastRow=sheet.getLastRowNum();
			int lastCell=sheet.getRow(0).getLastCellNum();
			data=new Object[lastRow][lastCell];
			for(int i=0;i<lastRow;i++) {
				for(int j=0;j<lastCell;j++) {
					data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
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
	@Test(dataProvider="readExcel")
	public void details(String org,String website,String ticket,String noEmp, String ind,String type,String phone,
			String fax,String otherPH, String email, String ownership) {
		System.out.println("===>details<===");
		System.out.println(org+" "+website+" "+ticket+" "+noEmp+" "+ind+" "+type+" "+phone+" "+fax+" "+otherPH+" "+
			email+" "+ownership);
		
	}

}
