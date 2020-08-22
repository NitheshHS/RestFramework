package hashMap;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DeserializeHashmap {
public static void main(String[] args) {
	HashMap<Integer, String> map=null;
	try {
		FileInputStream fis=new FileInputStream("hashmap.ser");
		ObjectInputStream os=new ObjectInputStream(fis);
		map=(HashMap<Integer, String>)os.readObject();
		os.close();
		fis.close();
	} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	Set<Entry<Integer, String>> set = map.entrySet();
	Iterator<Entry<Integer, String>> itr = set.iterator();
	while(itr.hasNext())
	{
		Entry<Integer, String> kv = itr.next();
		System.out.println("Key: "+kv.getKey()+" value: "+kv.getValue());
	}
	
	
	
}
}
