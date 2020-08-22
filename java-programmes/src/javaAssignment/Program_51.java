package javaAssignment;

import java.util.Scanner;

public class Program_51 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any word in upper case");
	String upper=scan.next();
	
	String lower="";
	for(int i=0;i<=upper.length()-1;i++) {
		if(upper.charAt(i)>=65 && upper.charAt(i)<=90) {
			char ch=(char) (upper.charAt(i)+32);
			lower+=ch;
			
		}
	}
	System.out.println(lower);
	scan.close();
}
}
