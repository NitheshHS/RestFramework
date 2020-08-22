package flipkartTest;

import java.util.Date;

public class DateArray {
public static void main(String[] args) {
	Date d=new Date();
	System.out.println(d);
	String[] dAry = d.toString().split(" ");
	for(int i=0;i<dAry.length;i++) {
		System.out.println(dAry[i]);
	}
	System.out.println(dAry[3].replaceAll(":", "_"));
}
}
