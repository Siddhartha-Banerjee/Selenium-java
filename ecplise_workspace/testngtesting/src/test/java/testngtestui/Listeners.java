package testngtestui;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends screenshot implements ITestListener 
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("Testcase is starting");
	}
	public void onTestSuccess(ITestResult result)
	{
		
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test failed-- screenshot captured");
		//extend screenshot class use getscreenshot() method to take screenshot like selenium ui package
		try {
			getss();
		} catch (IOException e) {
			System.out.println("exception: "+e);
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	public void onStart(ITestContext context)
	{
		
	}
	public void onFinish(ITestContext context)
	{
		
	}
}
