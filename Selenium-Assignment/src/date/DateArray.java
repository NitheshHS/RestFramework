package date;

import java.util.Date;

public class DateArray {
public static void main(String[] args) {
	Date date=new Date();
	int d = date.getDate();
	String[] dAry=date.toString().split(" ");
	System.out.println(date);
}
}
