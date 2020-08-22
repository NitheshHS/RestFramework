package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Simple {
public static void main(String[] args) {
	ArrayList<Student1> al=new ArrayList<>();
	al.add(new Student1(12, "zebra", 6));
	al.add(new Student1(1, "Kangaro", 15));
	al.add(new Student1(55, "Elephant", 1));
	Collections.sort(al,new NameComparator());
	 Iterator<Student1> itr = al.iterator();
	while(itr.hasNext())
	{
		Student1 st = itr.next();
		System.out.println(st.id+" "+st.name+" "+st.age);
	}
	
	Collections.sort(al, new AgeComparator());
	 Iterator<Student1> it = al.iterator();
		while(it.hasNext())
		{
			Student1 st = it.next();
			System.out.println(st.id+" "+st.name+" "+st.age);
		}
}
}
