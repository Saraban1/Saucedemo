package com.auto.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.auto.base.Base;

public class Listener extends Base implements ITestListener {

	
	
	public void onTestStart(ITestResult result) {
		logger.info("Test has started");
		
	}

	
	public void onTestSuccess(ITestResult result) {
		logger.info("Test is Successful");
		
	}

	
	public void onTestFailure(ITestResult result) {
		logger.info("Test has failed");
		
	}

	
	public void onTestSkipped(ITestResult result) {
		
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	
	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		logger.info("Test is finished");
		
	}
}
