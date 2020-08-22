package day6;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	@Test
	public void test() {
		SoftAssert sa=new SoftAssert();
		System.out.println("step1");
		System.out.println("step2");
		sa.assertEquals(true, false);
		System.out.println("step3");
		System.out.println("step4");
		System.out.println("step5");
		sa.assertAll();
	}


}
