package queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueExample {
public static void main(String[] args) {
	PriorityQueue<Integer> queue=new PriorityQueue<>();
	queue.addAll(Arrays.asList(10,20,30,40,55,1));
	System.out.println(queue);
	queue.remove();
	System.out.println(queue);
	queue.remove();
	System.out.println(queue);
	System.out.println(queue.isEmpty());
}
}
