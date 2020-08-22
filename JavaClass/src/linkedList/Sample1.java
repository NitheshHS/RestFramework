package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Sample1 {
public static void main(String[] args) {
	LinkedList<String> llist=new LinkedList<>();
	llist.add("Apple");
	llist.add("Mango");
	llist.add("Orange");
	llist.add("Lemon");
	
	System.out.println("*For-Loop*");
	for(int i=0;i<llist.size();i++) {
		System.out.println(llist.get(i));
	}
	
	System.out.println("*Advanced For-Loop*");
	for(String li:llist)
	{
		System.out.println(li);
	}
	
	System.out.println("*iterator*");
	Iterator<String> i=llist.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	System.out.println("*While loop*");
	int num=0;
	while(llist.size()>num) {
		System.out.println(llist.get(num));
		num++;
	}
}
}
