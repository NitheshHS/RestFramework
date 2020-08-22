package javaAssignment;

import java.util.Scanner;

public class Program_82 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any number");
	int num = scan.nextInt();
	for(int i=0;i<=10;i++) {
		System.out.println(num+" * "+i+" = "+num*i);
	}
	scan.close();
}
}
