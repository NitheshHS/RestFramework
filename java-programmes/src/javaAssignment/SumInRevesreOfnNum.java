package javaAssignment;

import java.util.Scanner;

public class SumInRevesreOfnNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int sum=0,rev=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		while(sum>0) {
			int rem=sum%10;
			rev=rev*10+rem;
			sum=sum/10;
		}
		System.out.println("sum after reversing: "+rev);
		scan.close();
	}
}
