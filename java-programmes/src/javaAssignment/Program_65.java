package javaAssignment;

import java.util.Scanner;

public class Program_65 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any word");
		String str = scan.next();
		int oc=0;
		char max=0;
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=1+i;j<=str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					oc++;
					max=str.charAt(i);
				}
			}
		}
		
		System.out.println("the maximum occuring character in "+str+" of times "+oc+" is "+max);
		scan.close();
	}
}
