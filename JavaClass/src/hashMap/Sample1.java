package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Sample1 {
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<>();
	hm.put(1, "Anna");
	hm.put(2, "cruice");
	hm.put(3, "Nicola");
	hm.put(33, "tom");
	System.out.println(hm);
	
	Set<Entry<Integer, String>> set = hm.entrySet();
	Iterator<Entry<Integer, String>> i = set.iterator();
	while(i.hasNext()) {
		Entry<Integer, String> kv = i.next();
		System.out.println("key is: "+kv.getKey()+" and value is: "+kv.getValue());
	}
	
	hm.remove(33);
	System.out.println(hm);
	
}
}
