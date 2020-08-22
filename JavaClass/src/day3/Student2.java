package day3;

public class Student2 {
	int roll;
	String name;
	Student2(int i, String s)
	{
		roll=i;
		name=s;
	}
	Student2(Student2 s){
		roll=s.roll;
		name=s.name;
	}
	void display()
	{
		System.out.println(roll+" "+name);	
	}
	public static void main(String[] args) {
		Student2 st1=new Student2(123, "ABX");
		Student2 st2=new Student2(st1);
		st1.display();
		st2.display();
	}

}
