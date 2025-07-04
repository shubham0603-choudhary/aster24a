package aster24b;

import org.testng.annotations.Test;

public class A extends MyOtherTestCaseClass{
	@Test(groups = "regression")
	public void m1() {
		System.out.println("Am m1() of A class");
	}
	@Test(groups = "smoke")
	public void m2() {
		System.out.println("Am smoke in m2() of A class");
	}
}
