package aster24b;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class MyTestCase extends MyOtherTestCaseClass{
	@Test
	public void m1() {
		System.out.println("I am first test case of my class");
		SoftAssert softly=new SoftAssert();
		softly.assertEquals("hello", "hi");
		softly.assertEquals(780, 10);
		softly.assertEquals(80, 20);
		//softly.assertAll();
	}
	
	@Test
	public void m2() {
		System.out.println("I am second test case in MyTestCase class");
	}
	
	@Test
	public void m3()  {
		System.out.println("I am third test case in MyTestCase class");
	}
	
	@Test
	public void m4() {
		System.out.println("Am smoke in m4() in MyTestCase class");	
	}
	

}
