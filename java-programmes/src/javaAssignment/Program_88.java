package javaAssignment;

import java.util.Scanner;

public class Program_88 {
static int sumOfNumber(int num) {
	int sum=0;
	while(num>0) {
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	return sum;
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any number");
	int sum = sumOfNumber(scan.nextInt());
	scan.close();
	System.out.println(sum);
}
}
