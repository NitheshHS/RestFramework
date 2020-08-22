package day5;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class SystemProperty {
public static void main(String[] args) {
	Properties prop=System.getProperties();
	Set<Entry<Object, Object>> set = prop.entrySet();
	 Iterator<Entry<Object, Object>> itr = set.iterator();
	 while(itr.hasNext())
	 {
		 Entry<Object, Object> p = itr.next();
		 System.out.println(p.getKey()+"="+p.getValue());
	 }
	 
}
}
