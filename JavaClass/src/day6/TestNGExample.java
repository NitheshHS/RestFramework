package day6;


import org.testng.annotations.Test;

public class TestNGExample {
	@Test(invocationCount=3)
	public void createAccount()
	{
		System.out.println("Account creatd");
	}
	@Test(priority=2)
	public void editAccount()
	{
		System.out.println("Edit account");
	}
	@Test(dependsOnMethods="createAccount")
	public void deleteAccount()
	{
		System.out.println("Delete account");
	}

}
