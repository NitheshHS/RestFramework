package javaAssignment;

public class Program_53 {
public static void main(String[] args) {
	String str="nithesh";
	int vow=0;
	int cons=0;
	for(int i=0;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			vow++;
		}else {
			cons++;
		}
	}
	System.out.println("Vowels: "+vow);
	System.out.println("Consonents: "+cons);
}
}
