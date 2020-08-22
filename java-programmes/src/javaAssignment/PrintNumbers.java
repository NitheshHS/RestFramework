package javaAssignment;

import java.util.Scanner;

public class PrintNumbers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the range of number");
	int num=scan.nextInt();
	if(num>=48||num<=59) {
		for(int i=0;i<=num;i++) {
			System.out.println(i);
		}
	}
	scan.close();
}
}
