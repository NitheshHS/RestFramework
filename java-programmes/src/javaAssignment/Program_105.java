package javaAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Program_105 {
public static void main(String[] args) {
	ArrayList<String> list=new  ArrayList<String>();
	list.add("Java");
	list.add("Python");
	list.add("Ruby");
	Iterator<String> n=list.listIterator();
	while(n.hasNext()) {
		System.out.print(n.next()+",");
	}

		
		
	
}
}
