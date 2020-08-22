package day1;

public abstract class Animal {
	String name;
	int lifeExpectancy;
	public Animal(String name, int lifeExpectancy) {
		this.name=name;
		this.lifeExpectancy=lifeExpectancy;
	}
	public abstract void remember();
	public abstract void protectOwner();
	public String toString() {
		return this.getClass().getSimpleName()+":"+name+":"+lifeExpectancy;
		
	}

}
