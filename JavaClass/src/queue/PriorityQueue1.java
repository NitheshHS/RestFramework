package queue;
import java.util.Iterator;
import java.util.PriorityQueue;;
public class PriorityQueue1 {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<>(new MyComparator());
	queue.offer("Nithesh");
	queue.offer("Tom");
	queue.offer("Rick");
	queue.offer("Tywin Lannister");
	queue.offer("A");
	
	Iterator<String> itr = queue.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		
	
	while(queue.size()!=0) {
		System.out.println(queue.poll());
	}
	}
}

