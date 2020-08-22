package day1;

public class Sample {
	public static void main(String[] args) {
		Dog dog=new Dog("puppy", 15);
		System.out.println(dog);
		dog.remember();
		dog.protectOwner();
		Learn l=dog;
		l.learn();
		
		Cat cat=new Cat("shizu", 10);
		System.out.println(cat);
		cat.remember();
		cat.protectOwner();
		cat.climb();
		
		Man man=new Man("Nithesh H S", 21);
		System.out.println(man);
		man.climb();
		man.learn();
		man.think();
	}
	

}
