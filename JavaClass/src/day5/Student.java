package day5;

public class Student implements Comparable<Student> {
	int id;
	String name;
	int age;
	Student(int id, String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public int compareTo(Student st) {
		if(age==st.age)
		return 0;
		else if(age<st.age)
			return 1;
		else
			return-1;
		
			
			
		
	}


}
