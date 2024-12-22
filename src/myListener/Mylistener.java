package myListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener implements ITestListener
{

	 public void onStart(ITestContext context) {
	        System.out.println("once after Starting");
	    }
	 
	 public void onFinish (ITestContext context)
	 {
		System.out.println("after finsihing All"); 
	 }
	public  void onTestSuccess(ITestResult result)
	{
		    System.out.println("on success test case"+result.getName());
		  
	}
	public void onTestFailure(ITestResult result)
	{
	   
	  System.out.println("on each test fail "+result.getName());
	}
	 public void onTestSkipped(ITestResult result)
	 {
		  System.out.println("on each test skip"+result.getName());  
	}
	 public void onTestStart(ITestResult result) {
	        System.out.println("Test Started: " + result.getName());
	    }
	 
	
	
	
	
	
}
