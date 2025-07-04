package com.listenerdemo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
		System.err.println("Test Case Failed");
		
	}
}
