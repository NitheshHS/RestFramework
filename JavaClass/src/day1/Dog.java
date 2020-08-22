package day1;

public class Dog extends Animal implements Learn {

	public Dog(String name, int lifeExpectancy) {
		super(name, lifeExpectancy);
	}

	
	public void learn() {
		System.out.println(this.getClass().getSimpleName()+": can learn");
	}

	
	public void remember() {
		System.out.println(this.getClass().getSimpleName()+": can remember");
	}

	
	public void protectOwner() {
		System.out.println(this.getClass().getSimpleName()+": can protect the owner");
		
	}
	

}
