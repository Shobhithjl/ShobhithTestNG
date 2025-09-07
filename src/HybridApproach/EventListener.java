package HybridApproach;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class EventListener implements ITestListener 
{
	public void onStart(ITestContext context)
	{
		System.out.println("The testsuite execution is started");
	}
	public void onFinish(ITestContext context)
	{
		System.out.println("The testsuite execution is completed");
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("The testcase execution is started and testcase name is"+ result.getName());
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("The testcase execution is successfully completed and testcase name is"+ result.getName());		
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("The testcase executino is failed and testcase name is"+result.getName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("The testcase execution is skipped and testcase name is"+result.getName());
	}
}
