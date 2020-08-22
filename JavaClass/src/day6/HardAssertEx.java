package day6;

import org.testng.Assert;
import org.testng.annotations.Test;



public class HardAssertEx {
	@Test
	public void test1() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		Assert.assertTrue(false);
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
	}
	@Test
	public void test2() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		
	}

}
