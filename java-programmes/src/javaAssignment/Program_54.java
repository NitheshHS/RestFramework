package javaAssignment;

public class Program_54 {
public static void main(String[] args) {
	String str="Nithesh@1998&";
	int upper=0,lower=0, number=0, spchar=0;
	for(int i=0;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		if(ch>=65 && ch<=90)
			upper++;
		else if(ch>=97 && ch<=122)
			lower++;
		else if(ch>=48 && ch<=57) 
			number++;
		else
			spchar++;				
		}
	System.out.println("Upper case: "+upper);
	System.out.println("Lower case: "+lower);
	System.out.println("numbers: "+number);
	System.out.println("Special characters: "+spchar);
				
	}
}

