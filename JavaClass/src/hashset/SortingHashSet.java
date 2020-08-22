package hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SortingHashSet {
public static void main(String[] args) {
	HashSet<String> fruit=new HashSet<>();
	fruit.add("Apple");
	fruit.add("Lemon");
	fruit.add("Guava");
	fruit.add("mango");
	
	System.out.println("withou sort: "+fruit);
	
	ArrayList<String> al=new ArrayList<>(fruit);
	Collections.sort(al);
	System.out.println("After sorting: "+al);
	Collections.sort(al, Collections.reverseOrder());
	System.out.println("reverse order: "+al);
	
	TreeSet<String> ts=new TreeSet<>(fruit);
	
	System.out.println("using treeset: "+ts);
}
}
