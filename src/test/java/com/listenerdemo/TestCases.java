package com.listenerdemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class TestCases {
	@Test
	public void m1() {
		System.out.println("First Test Case");
	}
	@Test
	public void m2() {
		System.out.println("Second Test Case");
		//Assert.assertEquals("Hi", "Hello");
	}
	@Test
	public void m3() {
		System.out.println("Third Test Case");
	}
	@Test
	public void m4() {
		System.out.println("Fourth Test Case");
	}
	@Test
	public void m5() {
		System.out.println("Fifth Test Case");
	}
	@Test
	public void m6() {
		System.out.println("Sixth Test Case");
	}
	@Test
	public void m7() {
		System.out.println("Seventh Test Case");
	}
	

}
