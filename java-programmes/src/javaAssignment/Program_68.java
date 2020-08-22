package javaAssignment;

import java.util.Scanner;

public class Program_68 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any word");
		String str = scan.next();
		char[] arr=new char[str.length()-1];
		System.out.println("duplicate characters");
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=1+i;j<=str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					arr[i]=str.charAt(i);
					System.out.print(str.charAt(i)+",");
				}
			}
		}
		scan.close();
	}
}
