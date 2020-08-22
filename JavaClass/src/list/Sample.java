package list;

import java.util.ArrayList;
import java.util.Collections;

public class Sample {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("Apple");
	al.add("Mango");
	al.add("Orange");
	al.add("Jackfruit");
	
	ArrayList<String> al2=(ArrayList<String>)al.clone();
	al.add("Fig");
	System.out.println("original list:"+al);
	System.out.println("cloned list:"+al2);
	
	
	
	Collections.sort(al);
	System.out.println("After sorting:"+al);
	
	Collections.sort(al, Collections.reverseOrder());
	System.out.println("After reversing:"+al);
}
}
