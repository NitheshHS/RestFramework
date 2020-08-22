package mapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Sample2 {
public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<String, Integer>();
	map.put("peter", 123);
	map.put("David", 456);
	map.put("Alex", 987);
	for(String key:map.keySet()) {
		System.out.println(key);
	}
	
	for(Integer val:map.values())
	{
		System.out.println(val);
	}
	
}
}
