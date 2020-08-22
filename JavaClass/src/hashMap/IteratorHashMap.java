package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IteratorHashMap {
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<>();
	hm.put(1, "Aa");
	hm.put(2, "Bb");
	hm.put(3, "Cc");
	hm.put(4, "Dd");
	
	System.out.println(hm);
	
	Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
	while(itr.hasNext()) {
		Entry<Integer, String> kv = itr.next();
		System.out.println("Key is: "+kv.getKey()+" and value is: "+kv.getValue());
	
		
		
	}
	
	for(Entry<Integer, String> i:hm.entrySet()) {
		System.out.println("key: "+i.getKey()+" and value: "+i.getValue());
	}
}
}
