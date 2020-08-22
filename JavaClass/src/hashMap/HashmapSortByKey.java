package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashmapSortByKey {
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<>();
	hm.put(1, "Anna");
	hm.put(100, "Tom");
	hm.put(22, "hulk");
	hm.put(11, "Ironman");
	System.out.println("Size of hashmap: "+hm.size());
	System.out.println("Befor sorting");
	Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
	while(itr.hasNext()) {
		Entry<Integer, String> kv = itr.next();
		System.out.println("Key: "+kv.getKey()+" value: "+kv.getValue());
		
	}
	
	TreeMap<Integer, String> tm=new TreeMap<>(hm);
	Iterator<Entry<Integer, String>> itr1 = tm.entrySet().iterator();
	System.out.println("After sorting key");
	while(itr1.hasNext()) {
		Entry<Integer, String> kv = itr1.next();
		System.out.println("Key: "+kv.getKey()+" value: "+kv.getValue());
	}
	
	
	
}
}
