package javaAssignment;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	int temp,rem,sum=0,i,fact;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any number");
	int num=scan.nextInt();
	temp=num;
	while(temp>0) {
		fact=1;
		i=1;
		rem=temp%10;
		while(i<=rem) {
			fact=fact*i;
			i++;
		}
		sum=sum+fact;
		temp=temp/10;
	}
	if(num==sum) {
		System.out.println("Strong number");
	}else {
		System.out.println("Not Strong number");
	}
}
}
