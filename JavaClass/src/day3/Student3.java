package day3;

public class Student3 {
	int id;
	String name;
	int age;
	Student3(int i, String s)
	{
		id=i;
		name=s;
	}
	Student3(int i, String s, int a)
	{
		id=i;
		name=s;
		age=a;
	}
	void display() {
		System.out.println(id+"-->"+name+"<--"+age);
	}
	public static void main(String[] args) {
		Student3 st1=new Student3(123, "ABC");
		Student3 st2=new Student3(46, "Xyz", 12);
		st1.display();
		st2.display();
	}

}
