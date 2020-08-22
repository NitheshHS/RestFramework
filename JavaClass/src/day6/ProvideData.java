package day6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProvideData {
	@DataProvider
	public String[][] read() {
		String arr[][]=new String[2][3];
		arr[0][0]="1";
		arr[0][1]="Mouse";
		arr[0][2]="120";
		arr[1][0]="2";
		arr[1][1]="keyboard";
		arr[1][2]="300";
		
		
		return arr;
		
	}
	@Test(dataProvider="read")
	public void readData(String sno,String product,String price) {
		System.out.println(sno+" "+product+" "+price);
	}

}
