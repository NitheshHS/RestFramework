package linkedList;

import java.util.LinkedList;

public class Sample2 {
public static void main(String[] args) {
	LinkedList<String> li=new LinkedList<>();
	li.add("Aa");
	li.add("Bb");
	li.add("Cc");
	System.out.println(li);
	
	li.addFirst("First");
	li.addLast("Last");
	System.out.println(li);
	
	li.offerFirst("Nithesh");
	System.out.println(li);
	
	System.out.println("removing items");
	li.remove();
	System.out.println(li);
	
	li.removeFirst();
	System.out.println(li);
	
	li.removeLast();
	System.out.println(li);
	
	li.remove(2);
	System.out.println(li);
	
	li.remove("Aa");
	System.out.println(li);
	
}
}
