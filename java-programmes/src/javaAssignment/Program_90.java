package javaAssignment;

import java.util.Scanner;

public class Program_90 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array size");
	int size=scan.nextInt();
	System.out.println("Enter the array elements");
	int[] arr=new int[size];
	
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	
	scan.close();
	int lar1=0,lar2=0;
	
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]>lar1) {
			lar2=lar1;
			lar1=arr[i];
			
		}
	}
	System.out.println("first largest element in array: "+lar1+" and Second largest elemt in array: "+lar2);
}
}
