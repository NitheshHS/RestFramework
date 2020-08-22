package javaAssignment;

import java.util.Scanner;

public class Program_99 {
public static int getDecimal(int binary) {
	int decimal=0;
	int n=0;
	while(true) {
		if(binary==0)
			break;
		else
		{
			int temp=binary%10;
			decimal+=temp*Math.pow(2, n);
			binary=binary/10;
			n++;
		}
	}
	return decimal;
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the binary number");
	int binary = scan.nextInt();
	int num = getDecimal(binary);
	System.out.println(num);
}
}
