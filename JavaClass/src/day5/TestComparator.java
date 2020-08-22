package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {
public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<>();
	al.add(new Employee(12, "Nithesh", 22));
	al.add(new Employee(3, "Alex", 30));
	al.add(new Employee(5, "peter", 15));
	Comparator<Employee> cmp1=Comparator.comparing(Employee::getName);
	Collections.sort(al, cmp1);
	for(Employee e:al)
	{
		System.out.println(e.id+" "+e.name+" "+e.age);
	}
	
	Comparator<Employee> cmp2 = Comparator.comparing(Employee::getAge);
	Collections.sort(al,cmp2);
	for(Employee e:al)
	{
		System.out.println(e.id+" "+e.name+" "+e.age);
	}
	
	
	
}
}
