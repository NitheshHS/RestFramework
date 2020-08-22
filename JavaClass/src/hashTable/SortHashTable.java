package hashTable;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SortHashTable {
public static void main(String[] args) {
	Hashtable<Integer, String> ht=new Hashtable<>();
	ht.put(12, "Tom");
	ht.put(23, "Rick");
	ht.put(2, "Anna");
	ht.put(5, "Flynn");
	System.out.println("HashTable: "+ht);
	
	TreeMap<Integer, String> tm=new TreeMap<>(ht);
	System.out.println("Treemap: "+tm);
	
	LinkedHashMap<Integer, String> lh=new LinkedHashMap<>(ht);
	System.out.println("LinkedHashMap: "+lh);
}
}
