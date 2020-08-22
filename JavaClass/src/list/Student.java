package list;

public class Student implements Comparable {
	int id;
	String name;
	int age;
	Student(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int compareTo(Student comparestu) {
		int compresult=((Student)comparestu).getAge();
		return this.age-compresult;
	}
	
	public String toString() {
		return "id: "+id+" name:"+name+" age:"+age;
		
	}



	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
