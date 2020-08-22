package hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class CovertHashSetToTreeSet {

	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<>();
		hset.add("Flynn");
		hset.add("Anna");
		hset.add("Peter");
		hset.add("Cruise");
		hset.add("cruise");
		
		System.out.println("HashSet contains: "+hset);
		
		TreeSet<String> tset=new TreeSet<>(hset);
		System.out.println("TreeSet contains: "+tset);

	}

}
