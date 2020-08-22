package hashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class IterateHashTable {
public static void main(String[] args) {
	Hashtable<Integer, String> ht=new Hashtable<>();
	ht.put(12, "Apple");
	ht.put(1, "Mango");
	ht.put(5, "Grapes");
	ht.put(16, "Banana");
	
	Set<Integer> str = ht.keySet();
	Iterator<Integer> itr = str.iterator();
	while(itr.hasNext()) {
		Integer keyvalue = itr.next();
		System.out.println("Key: "+keyvalue+" value: "+ht.get(keyvalue));
	}
	
	System.out.println("size: "+ht.size());
	
}
}
