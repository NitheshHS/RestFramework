package javaAssignment;

import java.util.Scanner;

public class PrintStringInAlphanumaric {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any word");
		String str=scan.next();
		String alpha="";
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)>=90 && str.charAt(i)<=122) {
				alpha+=str.charAt(i);
			}
		}
		System.out.println(alpha);
		scan.close();
	}
}
