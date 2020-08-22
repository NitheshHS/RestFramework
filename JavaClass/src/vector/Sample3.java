package vector;

import java.util.Collections;
import java.util.Vector;

public class Sample3 {
public static void main(String[] args) {
	Vector<String> vector=new Vector<>();
	vector.add("Item1");
	vector.add("Item2");
	vector.add("Item3");
	vector.add("Item4");
	vector.add("Item5");
	vector.add("Item1");
	
	System.out.println(vector);
	
	System.out.println(vector.indexOf("Item 1"));
	
	System.out.println(vector.lastIndexOf("Item 1"));
	
	
	Vector<String> vec=new Vector<>();
	vec.add("Aa");
	vec.add("Bb");
	vec.add("Cc");
	vec.add("Dd");
	vec.add("Ee");
	System.out.println(vec);
	
	vector.remove("Item1");
	vector.removeAllElements();
	System.out.println(vector);
	
	//Collections.copy(vec, vector);
	
	System.out.println(vec);
	
	
}
}
