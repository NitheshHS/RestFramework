package javaAssignment;

import java.util.Scanner;

public class CountCharacterInString {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any word");
	String str=scan.next();
	System.out.println("number of characters in "+str+" is "+(str.length()));
	scan.close();
}
}
