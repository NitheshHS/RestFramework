package com.Nithesh.OrgTest;

import org.testng.annotations.Test;

public class DebugTest {
	@Test
	public void test() {
		System.out.println("step-1");
		System.out.println("step2");
		mt();
		System.out.println("step3");
	}
	public void mt() {
		System.out.println("m1");
		System.out.println("m2");
	}

}
