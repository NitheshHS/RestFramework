package mapConcept;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashmapExample {
public static void main(String[] args) {
	Map<String, String> map=new LinkedHashMap<>();
	map.put("Nithesh", "BE");
	map.put("Anushree", "commerce");
	Set<Entry<String, String>> set = map.entrySet();
	Iterator<Entry<String, String>> it = set.iterator();
	while(it.hasNext()) {
		Entry<String, String> keyValue = it.next();
	System.out.println(keyValue.getKey()+"->"+keyValue.getValue());
	}
	System.out.println(map.containsKey("Anushree"));
	System.out.println(map.get("Anushree"));
	System.out.println(map);
}
	
}
