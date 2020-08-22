package javaAssignment;

import java.util.ArrayList;

public class Program_103 {
public static void main(String[] args) {
	int[] arr= {10,20,30,40,50,60};
	ArrayList list=new ArrayList();
	for(int i=0;i<=arr.length-1;i++) {
		list.add(arr[i]);
	}
	System.out.println(list);
}
}
