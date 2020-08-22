package list;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
public static void main(String[] args) {
	ArrayList<Student> st=new ArrayList<>();
	st.add(new Student(85, "Nithesh", 22));
	st.add(new Student(12, "Anushree", 18));
	
	Collections.sort(st, Collections.reverseOrder());
	System.out.println(st);
}
}
