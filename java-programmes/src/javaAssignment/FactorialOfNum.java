package javaAssignment;

import java.util.Scanner;

public class FactorialOfNum {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	System.out.println("Factorial of "+num+" is: "+fact);
	scan.close();
}
}
