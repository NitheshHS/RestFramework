package vector;

import java.util.List;
import java.util.Vector;

public class Sample1 {
public static void main(String[] args) {
	Vector<String> vec=new Vector<>();
	vec.addElement("Item1");
	vec.addElement("Item2");
	vec.addElement("Item3");
	vec.addElement("Item4");
	vec.addElement("Item5");
	System.out.println("original vector: "+vec);
	List vec1=(Vector<String>) vec.subList(0, 3);
	System.out.println("sublist: "+vec1);
	
	
	
	
	
}
}
