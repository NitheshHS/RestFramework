package javaAssignment;

import java.util.Scanner;

public class MultipleOfn {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		System.out.println("Enter the range");
		int range=scan.nextInt();
		System.out.println("Multiple of :"+num+" is");
		for(int i=0;i<=range;i++) {
			if(i%num==0) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
