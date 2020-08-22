package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
public static void main(String[] args) {
	HashSet<String> hashset=new HashSet<>();
	hashset.add("Element1");
	hashset.add("Element2");
	hashset.add("Element3");
	hashset.add("Element1");
	hashset.add("Element4");
	hashset.add("Element5");
	hashset.add("Tom");
	System.out.println("hashset size"+hashset.size());
	System.out.println(hashset);
	
	System.out.println("**using iterator**");
	Iterator<String> i=hashset.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}	
	
	System.out.println("**using for each loop**");
	for(String str:hashset)
	{
		System.out.println(str);
	}
	
	
}
}
