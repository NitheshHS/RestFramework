package javaAssignment;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();
		int count=0,sum=0,temp=num;
		while(num>0) {
			num=num/10;
			count++;
		}
		num=temp;
		while(num>0) {
			int rem=num%10;
			int mul=1;
			for(int i=1;i<=count;i++) {
				mul=mul*rem;
			}
			sum=sum+mul;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not armstrong");
		}
		scan.close();
	}
}
