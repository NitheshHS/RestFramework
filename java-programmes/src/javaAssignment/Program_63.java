package javaAssignment;

import java.util.Scanner;

public class Program_63 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any sentence");
	String str = scan.nextLine();
	String rep="";
	rep=str.replaceAll(" ", "@");
	System.out.println(rep);
	scan.close();
}
}
