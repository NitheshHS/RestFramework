package hashset;

import java.util.HashSet;

public class ConvertHashSetToArray {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Tom");
	hset.add("Anna");
	hset.add("peter");
	hset.add("Flynn");
	System.out.println(hset);
	String[] arr=hset.toArray(new String[hset.size()]);
	//String[] arr = new String[hset.size()];
	hset.toArray(arr);
	
	for(String a:arr)
	{
		System.out.println(a);
	}	
	
}
}
