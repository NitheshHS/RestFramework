package javaAssignment;

import java.util.Scanner;

public class Program_44 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any word");
	String str=scan.next();
	String first="";
	String second = "";
	for(int i=str.length()-1;i>=(str.length()-1)/2;i--) {
		second+=str.charAt(i);
	}
	for(int i=0;i<=(str.length()-1)/2;i++) {
		first+=str.charAt(i);
	}
	System.out.println(first+second);
	scan.close();
}
}
