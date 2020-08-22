package javaAssignment;

public class Program_46 {
public static void main(String[] args) {
	String str="Nithesh";
	char ch='?';
	String replace="";
	for(int i=0;i<=str.length()-1;i++) {
		if(i%2==0) {
			replace+=ch;
		}else {
			replace+=str.charAt(i);
		}
	}
	System.out.println(replace);
}
}
