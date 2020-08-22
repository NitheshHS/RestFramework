package javaAssignment;

import java.util.Scanner;

public class Program_52 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any word in lower case");
		String lower=scan.next();
		String upper="";
		for(int i=0;i<=lower.length()-1;i++) {
			if(lower.charAt(i)>=97 && lower.charAt(i)<=122) {
				char ch=(char)(lower.charAt(i)-32);
				upper+=ch;
			}
		}
		System.out.println(upper);
		scan.close();
	}
}
