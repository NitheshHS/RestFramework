package javaAssignment;

import java.util.Scanner;

public class FactorsOneToN {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=scan.nextInt();

		for(int i=0;i<=range;i++) {
			int fact=1;
			for(int j=1;j<=i;j++) {
				fact=fact*j;
			}
			System.out.println("Factorial of num "+i+" is "+fact);
		}
		scan.close();
	}
}
