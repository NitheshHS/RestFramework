package javaAssignment;

import java.util.Scanner;

public class PrintEvenNum {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the range");
	int num = scan.nextInt();
	for(int i=0;i<=num;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}scan.close();
}
}
