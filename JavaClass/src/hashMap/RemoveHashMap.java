package hashMap;

import java.util.HashMap;

public class RemoveHashMap {
public static void main(String[] args) {
	HashMap<Integer, String> map=new HashMap<>();
	map.put(11, "value1");
	map.put(22, "value2");
	map.put(33, "value3");
	map.put(44, "value4");
	map.put(55, "value5");
	map.put(66, "value6");
	System.out.println("Original hashmap: "+map);
	
	String ele1 = map.remove(44);
	System.out.println("removed element: "+ele1);
	
	String element2 = map.remove(11);
	System.out.println("removed element: "+element2);
	
	System.out.println("After remove");
	System.out.println("----------------");
	System.out.println(map);
	
}
}
