package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddingNewValue {
public static void main(String[] args) {
	LinkedList<String> li=new LinkedList<>();
	li.add("item1");
	li.add("item2");
	li.add("item3");
	li.add("item4");
	li.add("item5");
	
	System.out.println("Before adding new element: "+li);
	
	li.set(2, "New element");
	System.out.println("After adding new element: "+li);
	
	ArrayList<String> al=new ArrayList<>(li);
	System.out.println("Arraylist :"+al);
	
	//adding elements to array
	String[] arr=li.toArray(new String[li.size()]);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	
	
}
}
