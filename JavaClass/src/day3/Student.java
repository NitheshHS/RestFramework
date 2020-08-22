package day3;

public class Student {
	int id;
	String name;
	void display()
	{
		System.out.println(id+"---"+name);
	}

	public static void main(String[] args) {
		Student st1=new Student();
		Student st2=new Student();
		st1.display();
		st2.display();
	}
}
