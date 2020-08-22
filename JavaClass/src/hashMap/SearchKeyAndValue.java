package hashMap;

import java.util.HashMap;

public class SearchKeyAndValue {
public static void main(String[] args) {
	HashMap<Integer, String> map=new HashMap<>();
	map.put(11, "value1");
	map.put(22, "value2");
	map.put(33, "value3");
	map.put(44, "value4");
	map.put(55, "value5");
	map.put(66, "value6");
	map.put(77, "value7");
	
	boolean flag1 = map.containsKey(22);
	System.out.println("key 22 in hashmap? "+flag1);
	
	boolean flag2 = map.containsValue("value7");
	System.out.println("value value1 in hashmap? "+flag2);
	
	
	HashMap<Integer, String> map1=new HashMap<>();
	//map1=(HashMap<Integer, String>) map.clone()
	System.out.println(map1);
}
}
