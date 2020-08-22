package treemap;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapReverseOrder {
public static void main(String[] args) {
	TreeMap<Integer, String> map=new TreeMap<>(Collections.reverseOrder());
	map.put(12, "Anna");
	map.put(2, "Flynn");
	map.put(5, "Rick");
	map.put(1, "Tom");
	
	Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
	while(itr.hasNext())
	{
		Entry<Integer, String> keyvalue = itr.next();
		System.out.println("key: "+keyvalue.getKey()+" value: "+keyvalue.getValue());
		
	}
	
	
	
	
}
}
