package hashset;

import java.util.HashSet;

public class Sample1 {
public static void main(String[] args) {
	HashSet<String> hashset=new HashSet<>();
	hashset.add("Apple");
	hashset.add("Mango");
	hashset.add("Orange");
	hashset.add("lemon");
	System.out.println("original hashset: "+hashset);
	
	hashset.clear();
	
	System.out.println("After deleting: "+hashset);
	
	
}
}
