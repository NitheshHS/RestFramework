package vector;

import java.util.Collections;
import java.util.Vector;

public class Sample2 {
public static void main(String[] args) {
	Vector<String> vector=new Vector<>();
	vector.addElement("Walter");
	vector.add("Anna");
	vector.add("Hank");
	vector.add("Tom");
	vector.add("Flynn");
	
	System.out.println("original vector: "+vector);
	
	Collections.sort(vector);
	System.out.println("sorted vector: "+vector);
	
	
}
}
