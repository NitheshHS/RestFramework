package javaAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program_104 {
public static <E> void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the elements to array list");
	ArrayList list=new ArrayList<>();
	for(int i=0;i<=5;i++) {
		list.add(scan.nextInt());
	}
	System.out.println("Before reversing");
	System.out.println(list);
	Collections.reverse(list);
	System.out.println("After reversing");
	  System.out.println(list);
}
}
