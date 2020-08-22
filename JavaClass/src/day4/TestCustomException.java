package day4;

public class TestCustomException {

	
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new InvalidAgeException();
		}
		else
		{
			System.out.println("vote");
		}
		
	}
	public static void main(String[] args) {
		TestCustomException.validate(12);
	}
	

}
