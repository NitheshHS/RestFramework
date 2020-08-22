package javaAssignment;

import java.util.Scanner;

public class Program_79 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int num = scan.nextInt();
	System.out.println("Enter the array elements");
	int a[] = new int[num];
	int sum=0;
	for(int i=0;i<num;i++) {
		
		a[i]=scan.nextInt();
		sum=sum+a[i];
	}
	System.out.println("Sum of array elements is:"+sum);
}
}
