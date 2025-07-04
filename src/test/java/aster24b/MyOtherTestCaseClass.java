package aster24b;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test(enabled = false)
public class MyOtherTestCaseClass {
	@BeforeClass
	public void beforeTestDemo() {
		System.out.println("I am BeforeClass of another class");
	}
	
	@AfterClass
	public void afterTestDemo() {
		System.out.println("I am AfterClass of another class");
	}

	

}
