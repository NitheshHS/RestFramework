package day5;

import java.util.Comparator;

public class NameComparator implements Comparator<Student1>{

	
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.name.compareTo(o2.name);
	}
	

}
