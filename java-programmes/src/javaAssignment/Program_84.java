package javaAssignment;

import java.util.Scanner;

public class Program_84 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in) ;
	System.out.println("Enter the number");
	prime(scan.nextInt());
}
static void prime(int num) {
	boolean flag=true;
	for(int i=2;i<=num;i++) {
		if(num%i==0) {
			flag=false;
		}
		break;
	}
	if(flag==true) {
		System.out.println("prime number");
	}else {
		System.out.println("not prime number");
	}
}
}
