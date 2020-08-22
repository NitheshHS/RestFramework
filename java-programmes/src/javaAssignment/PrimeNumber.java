package javaAssignment;



import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any number");
	int num=scan.nextInt();
	boolean flag=true;
	for(int i=2;i<=num;) {
		if(num%i==0) {
			flag=false;
		}
		break;
	}
	if(num>0 && flag==true) {
		System.out.println("prime number");
	}else {
		System.out.println("not prime number");
	}
	scan.close();
}
}
