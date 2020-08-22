package javaAssignment;

import java.util.Scanner;

public class PrintTableOfn {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		System.out.println("Enter the range");
		int range=scan.nextInt();
		int mul=1;
		for(int i=0;i<=range;i++) {
			mul=num*i;
			System.out.println(mul);
		}
		scan.close();
	}
}
