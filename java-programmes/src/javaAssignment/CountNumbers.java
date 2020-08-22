package javaAssignment;

import java.util.Scanner;

public class CountNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int count=0;
		while(num>0) {
			
			count++;
			num=num/10;
		}
		System.out.println("number of digits in "+num+" is: "+count);
		scan.close();
	}
}
