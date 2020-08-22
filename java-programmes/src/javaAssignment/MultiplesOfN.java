package javaAssignment;

import java.util.Scanner;

public class MultiplesOfN {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
	System.out.println("Enter the range");
	int range=scan.nextInt();
	System.out.println("Multiple of "+num+" of range "+range+" is ;");
	for(int i=0;i<=range;i++) {
		int mul=num*i;
		System.out.print(mul+", ");
	}
	scan.close();
}
}
