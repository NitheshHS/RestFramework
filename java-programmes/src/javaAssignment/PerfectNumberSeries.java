package javaAssignment;

import java.util.Scanner;

public class PerfectNumberSeries {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the start");
		int start=scan.nextInt();
		System.out.println("Enter the end");
		int end=scan.nextInt();
		System.out.println("The perfect number of range from "+start+" to "+end);
		for(int i=1;i<=1000;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(sum==i) {
				System.out.println(sum);
			}
		}
		scan.close();
	}
}
