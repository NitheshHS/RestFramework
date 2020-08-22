package treemap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortTreeMap {
	public static <K, V extends Comparable<V>> Map<K,V> sortByValues(final Map<K, V> map){
		Comparator<K> valueComparator=new Comparator<K>() {

			public int compare(K o1, K o2) {
				
				int compare=map.get(o1).compareTo(map.get(o2));
				if(compare==0)
					return 1;
				else
					return compare;
			}
		};
		
		Map<K, V> treemap=new TreeMap<K, V>(valueComparator);
		treemap.putAll(map);
		return treemap;
		
	}
	
	public static void main(String[] args) {
		TreeMap<String, String> treemap=new TreeMap<>();
		treemap.put("key1", "Jack");
		treemap.put("key2", "Anna");
		treemap.put("key3", "Flynn");
		treemap.put("key4", "Steve");
		treemap.put("key5", "Rick");
		
		Map<String, String> map = sortByValues(treemap);
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<String, String> kv = itr.next();
			System.out.println("key: "+kv.getKey()+" value: "+kv.getValue());
		}
		
	}

}
