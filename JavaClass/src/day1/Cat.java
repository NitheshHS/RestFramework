package day1;

public class Cat extends Animal implements Climb{

	public Cat(String name, int lifeExpectancy) {
		super(name, lifeExpectancy);
	}

	
	public void climb() {
		System.out.println(this.getClass().getSimpleName()+": can climb");
		
	}

	
	public void remember() {
		System.out.println(this.getClass().getSimpleName()+": can't remember");
		
	}

	
	public void protectOwner() {
		System.out.println(this.getClass().getSimpleName()+": not protects owner");
		
	}
	

}
