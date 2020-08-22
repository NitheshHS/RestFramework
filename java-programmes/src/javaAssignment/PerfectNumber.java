package javaAssignment;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any number");
	int num=scan.nextInt();
	int sum=0;
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			sum+=i;
		}
	}
	if(sum==num) {
		System.out.println("Perfect number");
	}else {
		System.out.println("not perfect number");
	}
	scan.close();
}
}
