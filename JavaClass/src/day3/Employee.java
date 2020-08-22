package day3;

public class Employee {
	int id;
	String name;
	static String company="TY";
	Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+" "+name+" "+company);
	}
	public static void main(String[] args) {
		Employee emp=new Employee(12, "XYZ");
		Employee emp1=new Employee(23, "ABC");
		emp.display();
		Employee.company="google";
		emp1.display();
	}

}
