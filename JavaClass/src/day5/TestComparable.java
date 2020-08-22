package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparable {
public static void main(String[] args) {
	Student st=new Student(12, "ABC", 12);
	Student st1=new Student(45, "MNO", 7);
	Student st2=new Student(1, "XYZ", 20);
	ArrayList<Student> al=new ArrayList<>();
	al.add(st);
	al.add(st1);
	al.add(st2);
	Collections.sort(al,Collections.reverseOrder());
	Iterator<Student> itr = al.iterator();
	while(itr.hasNext())
	{
		Student stu = itr.next();
		System.out.println(stu.id+" "+stu.name+" "+stu.age);
	}
	
	
}
}
