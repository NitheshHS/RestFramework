package javaAssignment;

public class Program_66 {
public static void main(String[] args) {
	String str="Nithesh";
	String rev="";
	System.out.println("Before reversing: "+str);
	for(int i=str.length()-1;i>=0;i--) {
		rev+=str.charAt(i);
	}
	System.out.println("After reversing: "+rev);
}
}
