package day3;

public class Dog extends Animal{
	String color="White";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}

}
