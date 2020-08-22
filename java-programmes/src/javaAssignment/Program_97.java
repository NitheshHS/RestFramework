package javaAssignment;

import java.util.Scanner;

public class Program_97 {
	public static void main(String[] args) {
		int a,b,x,y,t,hcf,lcm;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		x=scan.nextInt();
		y=scan.nextInt();
		a=x;
		b=y;
		while(b!=0) {
			t=b;
			b=a%b;
			a=t;
		}
		hcf=a;
		lcm=(x*y)/hcf;
		System.out.println("Hcf"+hcf);
		System.out.println("Lcm"+lcm);
	}
}
