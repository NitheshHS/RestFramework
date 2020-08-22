package day5;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 st1, Student1 st2) {
		if(st1.age==st2.age)
			return 0;
		else if(st1.age<st2.age)
			return 1;
		else
			return -1;
	}

}
