package javaAssignment;

import java.util.Scanner;

public class Program_62 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any sentence");
	String str = scan.nextLine();
	String[] arr = str.split("");
	String repl="";
	for(int i=0;i<=arr.length-1;i++) {
		String str1=arr[i];
		for(int j=0;j<=str1.length()-1;j++) {
			if(str1.charAt(j)>=65 && str1.charAt(j)<=90) {
				char ch=(char)(str1.charAt(j)+32);
				repl+=ch;	
			}else if(str1.charAt(j)>=97 && str1.charAt(j)<=122) {
				char ch=(char)(str1.charAt(j)-32);
				repl+=ch;
			}else {
				repl+=" ";
			}
			
		}
	}
	System.out.println(repl);
	scan.close();
}
}
