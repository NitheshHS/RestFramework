package javaAssignment;

public class Program_98 {
public static void main(String[] args) {
	int num=10;
	int[] arr= {0,1,2,3,4,5,6,7};
	String str="";
	while(num!=0) {
		int rem=num%8;
		str=str+arr[rem];
		num/=8;
	}
	
System.out.println(str);
}
}
