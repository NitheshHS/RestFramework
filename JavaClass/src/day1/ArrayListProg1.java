package day1;

import java.util.ArrayList;

public class ArrayListProg1 {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(10);
	a.add(null);
	a.add(13);
	a.add(1, 12);
	System.out.println(a.size());
	System.out.println(a);
	
}
}
