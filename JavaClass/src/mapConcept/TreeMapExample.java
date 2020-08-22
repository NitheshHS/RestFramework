package mapConcept;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {
public static void main(String[] args) {
	TreeMap<Integer, String> treemap=new TreeMap<>();
	treemap.put(10, "Ten");
	treemap.put(1, "one");
	treemap.put(3, "three");
	System.out.println(treemap);
	NavigableMap<Integer, String> des = treemap.descendingMap();
	System.out.println(des);
	System.out.println(treemap.firstEntry());
	System.out.println(treemap.lastEntry());
	System.out.println(treemap.remove(3));
	System.out.println(treemap);
	
	Iterator<Entry<Integer, String>> itr = treemap.entrySet().iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
