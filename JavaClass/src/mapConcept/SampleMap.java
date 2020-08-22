package mapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SampleMap {
public static void main(String[] args) {
	Map<Integer, String> map=new HashMap<>();
	map.put(1, "one");
	map.put(2, "two");
	map.getOrDefault(2, "default");
	System.out.println(map.get(2));
	map.replace(2, "three");
	System.out.println(map.containsKey(1));
	System.out.println(map.containsValue("two"));
	map.putIfAbsent(4, "four");
	System.out.println(map);
	Iterator<Map.Entry<Integer, String>> i=map.entrySet().iterator();
	while(i.hasNext()) {
		Entry<Integer, String> m = i.next();
		System.out.println(m);
	}
	
	for(Entry<Integer, String> pair:map.entrySet())
	{
		System.out.println(pair.getKey()+"->"+pair.getValue());
	}
}
}
