package javaAssignment;

import java.util.Scanner;

public class Program_64 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any word");
		String str = scan.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		scan.close();
	}
}
