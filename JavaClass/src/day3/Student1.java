package day3;

public class Student1 {
	int roll;
	String name;
	Student1(int id, String sname)
	{
		roll=id;
		name=sname;
	}
	void display()
	{
		System.out.println(roll+"-->"+name);
	}
	public static void main(String[] args) {
		Student1 st1=new Student1(123, "Nithesh");
		Student1 st2=new Student1(456, "Albert");
		st1.display();
		st2.display();
	}

}
