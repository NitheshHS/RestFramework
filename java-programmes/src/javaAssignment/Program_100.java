package javaAssignment;

public class Program_100 {
public static void main(String[] args) {
	int num=125;
	char[] hexaChar= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	String hexa="";
	while(num!=0) {
		int rem=num%16;
		hexa=hexa+hexaChar[rem];
		num/=16;
	}
	System.out.println("Hexadecimal is: "+hexa);
}
}
