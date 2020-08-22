package linkedList;


import java.util.LinkedList;

public class Sample3 {
public static void main(String[] args) {
	LinkedList<String> li=new LinkedList<>();
	li.add("item1");
	li.add("item2");
	li.add("item3");
	li.add("item4");
	li.add("item5");
	System.out.println(li);
	LinkedList<String> llist=new LinkedList<>();
	llist.add("Aa");
	llist.add("Bb");
	llist.add("Cc");
	llist.add("Dd");
	
	llist.addAll(li);
	System.out.println(llist);
	
	
	System.out.println("First Element is: "+li.getFirst());
	
	System.out.println("Last Element is: "+li.getLast());
	
	
	
	
	
	
}
}
