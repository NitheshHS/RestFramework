package javaAssignment;

import java.util.Scanner;

public class Program_91 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the range :");
	int range=scan.nextInt();
	System.out.print("Enter the first number :");
	int first=scan.nextInt();
	System.out.print("Enter the second number :");
	int second=scan.nextInt();
	scan.close();
	
	fibonacci(first, second, range);
}
static void fibonacci(int first,int second,int range) {
	for(int i=0;i<=range;i++) {
		int third=first+second;
		first=second;
		second=third;
		System.out.print(first+",");
	}
}
}
