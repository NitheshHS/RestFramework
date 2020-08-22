package day3;

public class Employee1 {
	int id;
	String name;
	Address address;
	Employee1(int id, String name, Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+address.city+" "+address.state);
	}
	public static void main(String[] args) {
		Address ad1=new Address("Alur", "karnataka");
		Address ad2=new Address("Hassan", "karnataka");
		Employee1 e1=new Employee1(123, "Abc", ad1);
		Employee1 e2=new Employee1(456, "XYZ", ad2);
		e1.display();
		e2.display();
	}

}
