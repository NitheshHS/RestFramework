package javaAssignment;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter any word");
	String str=scan.next();
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}
	scan.close();
}
}
