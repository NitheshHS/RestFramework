package javaAssignment;

import java.util.Scanner;

public class SumOfNumInAlphaNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any word");
		String str = scan.next();

		int sum=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)>=47 && str.charAt(i)<=58) {
				char ch=str.charAt(i);
				int num = Integer.parseInt(String.valueOf(ch));
				sum=sum+num;
			}
		}
		System.out.println("The sum of digits in String"+str+" is "+sum);
		scan.close();
	}
}
