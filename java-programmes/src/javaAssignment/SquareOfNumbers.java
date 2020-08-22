package javaAssignment;

import java.util.Scanner;

public class SquareOfNumbers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the range");
	int range=scan.nextInt();
	System.out.println("The square numbers are");
	for(int num=1;num<=range;num++) {
		int sq=num*num;
		System.out.println("Square of "+num+" is: "+sq);
	}
	scan.close();
}
}
