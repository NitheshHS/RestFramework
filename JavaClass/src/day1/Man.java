package day1;

public class Man implements Think, Climb, Learn {
	String name;
	int age;
	public Man(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void learn() {
		System.out.println(this.getClass().getSimpleName()+": can learn");
		
	}
	
	public void climb() {
		System.out.println(this.getClass().getSimpleName()+": can climb");
		
	}
	
	public void think() {
		System.out.println(this.getClass().getSimpleName()+": can think");
		
	}
	public String toString() {
		return this.getClass().getSimpleName()+":"+name+":"+age;
		
	}

}
