package queue;

import java.util.ArrayDeque;

public class ArrayDequeEx {
public static void main(String[] args) {
	ArrayDeque<String> ad=new ArrayDeque<>();
	ad.add("Tom");
	ad.addFirst("Rick");
	ad.addLast("Tom");
	ad.add("Anna");
	ad.add("Nithesh");
	ad.add("Nithesh");
	System.out.println("ArrayDeque : "+ad);
	
	System.out.println("head: "+ad.peek());
	
	System.out.println("Remove head: "+ad.poll());
	
	System.out.println(ad.element());
}
}
