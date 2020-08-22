package hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class CovertHashSetToArrayList {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Item1");
	hset.add("Item2");
	hset.add("Item3");
	hset.add("Item4");
	hset.add("Item1");
	hset.add("Item1");
	System.out.println("Hashset conatins: "+hset);
	
	ArrayList<String> al=new ArrayList<>(hset);
	System.out.println("ArrayList contains: "+al);
	
	
}
}
