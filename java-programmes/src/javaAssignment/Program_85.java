package javaAssignment;

import java.util.Scanner;

public class Program_85 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the rows");
	int row=scan.nextInt(), num=1;
			for(int i=0;i<=row;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print(num+" ");
					num++;
				}
				System.out.println();
			}
}
}
