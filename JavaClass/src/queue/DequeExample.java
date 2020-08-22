package queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
public static void main(String[] args) {
	Deque<String> deque=new LinkedList<String>();
	deque.add("Nithesh");
	deque.addFirst("Anushree");
	deque.addLast("Gowda");
	System.out.println(deque);
	deque.addAll(Arrays.asList("Alex","Peter","David"));
	System.out.println(deque);
	System.out.println(deque.getLast());
	System.out.println(deque.getFirst());
	
	
	
}
}
