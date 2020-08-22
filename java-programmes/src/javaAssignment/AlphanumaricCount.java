package javaAssignment;

import java.util.Scanner;

public class AlphanumaricCount {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any word");
		String str=scan.next();
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)>=90 && str.charAt(i)<=122) {
				count++;
			}
		}
		System.out.println("number of alphabets in "+str+" is "+count);
		scan.close();
	}

}

