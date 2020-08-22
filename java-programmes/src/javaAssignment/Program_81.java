package javaAssignment;


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Program_81 {
public static void main(String[] args) {
	SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date=new Date();
	DateFormat formatter =format;
	System.out.println(formatter.format(date));
	
}
}
