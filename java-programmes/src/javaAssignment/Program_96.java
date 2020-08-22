package javaAssignment;

import java.util.Scanner;

public class Program_96 {
public static void main(String[] args) {
	int total,sum=0,mean=0;
	int[] numArr=new int[10];
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter the total number");
	
	 total=scan.nextInt();
	 System.out.println("Enter the numbers");
	for(int i=1;i<=total;i++) {
	numArr[i]=scan.nextInt();
	sum=sum+numArr[i];
	}
	mean=sum/total;
	System.out.println("Arthmetic Mean"+mean);
}
}
