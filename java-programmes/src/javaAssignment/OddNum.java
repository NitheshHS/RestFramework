package javaAssignment;

import java.util.Scanner;

public class OddNum {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the range");
	int num=scan.nextInt();
	System.out.println("Odd number of given range are");
	for(int i=0;i<=num;i++) {
		if(i%2!=0) {
			System.out.println(i);
		}
	}
	scan.close();
}
}
