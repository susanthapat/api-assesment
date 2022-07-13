package com.assurity.listeners;

import io.qameta.allure.Attachment;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;

public class TestListener implements ITestListener {

	private static Logger log = Logger.getLogger(TestListener.class.getName());

	// Text attachment for Allure report
	@Attachment(value = "{message}", type = "text/plain")
	public static String saveTextLog(String message) {
		return message;
	}

	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	@Override
	public void onTestStart(ITestResult iTestResult) {
		log.info("Started test method " + getTestMethodName(iTestResult) + " of the test class "
				+ getTestClassName(iTestResult) + ".");
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		log.info("");
		log.info(
				"================================================= TEST PASSED  ====================================================");
		log.info("");
		log.info("Passed test method " + getTestMethodName(iTestResult) + " of the test class "
				+ getTestClassName(iTestResult) + ".");
		log.info("");
		log.info(
				"===================================================================================================================");
		log.info("");

	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {

		log.info("");
		log.info(
				"================================================= TEST FAILED  ====================================================");
		log.info("");
	}

	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		log.info("Skipped test method " + getTestMethodName(iTestResult) + " of the test class."
				+ getTestClassName(iTestResult) + ".");
		log.info("");
		log.info(
				"================================================= TEST SKIPPED  ====================================================");
		log.info("");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

	}

	@Override
	public void onStart(ITestContext iTestContext) {
		log.info("Test execution started at : " + iTestContext.getStartDate() + ".");
		log.info("");
		log.info(
				"================================================= TEST STARTED  ====================================================");
		log.info("");
	}

	@Override
	public void onFinish(ITestContext iTestContext) {
		log.info("Test execution finished at : " + iTestContext.getEndDate() + ".");

		log.info("");
		log.info(
				"================================================= TEST FINISHED  ====================================================");
		log.info("");

	}

	private String getTestClassName(ITestResult iTestResult) {
		String testName = iTestResult.getInstanceName();

		String[] reqTestClassName = testName.split("\\.");
		int i = reqTestClassName.length - 1;
		log.info("Test class name - " + reqTestClassName[i] + ".");
		return reqTestClassName[i];
	}

}
