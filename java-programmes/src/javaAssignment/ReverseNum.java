package javaAssignment;

import java.util.Scanner;

public class ReverseNum {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
	int rev=0;
	while(num>0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println("Aftre revesing "+rev);
	scan.close();
}
}
