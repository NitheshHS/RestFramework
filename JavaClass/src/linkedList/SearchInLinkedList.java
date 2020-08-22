package linkedList;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SearchInLinkedList {
public static void main(String[] args) {
	LinkedList<String> li=new LinkedList<>();
	li.add("Rock");
	li.add("Tim");
	li.add("James");
	li.add("Hulk");
	li.add("Tom");
	li.add("Rock");
	
	System.out.println(li.indexOf("Rock"));
	System.out.println(li.lastIndexOf("Rock"));
	
	
	//sublist
	List<String> llist=li.subList(0, 3);
	System.out.println(llist);
	
	li.remove("Rock");
	System.out.println(li);
	
	
	Iterator<String> i = li.descendingIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
}
}
