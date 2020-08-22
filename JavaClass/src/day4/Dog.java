package day4;

public class Dog extends Animal{
	void bark()
	{
		System.out.println("Barking...");
	}
	void eat()
	{
		System.out.println("eating...");
	}
	void work()
	{
		super.eat();
		this.bark();
	}

}
