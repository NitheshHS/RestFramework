package javaAssignment;

import java.util.Scanner;

public class DivisibleByn {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
	System.out.println("Multiples of "+num);
	for(int i=1;i<=100;i++) {
		if(i%num==0) {
			System.out.println(i);
		}
	}
	scan.close();
}
}
