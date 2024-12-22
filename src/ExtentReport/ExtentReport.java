package ExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReport implements ITestListener {

	ExtentSparkReporter sparkreporter;//UI Of report
	ExtentReports extent;// common info of the report
	ExtentTest test;// result pass or fail status test entries 
	
   public void onStart(ITestContext context ) {
	   
       sparkreporter= new ExtentSparkReporter(System.getProperty("user.dir")+"\\myreport\\myreport.html");
        sparkreporter.config().setDocumentTitle("TESTING");
        sparkreporter.config().setReportName("Listener report");
        sparkreporter.config().setTheme(Theme.DARK);
        
        extent= new ExtentReports();
        extent.attachReporter(sparkreporter);
        
        extent.setSystemInfo("computer name","lenevo" );
        extent.setSystemInfo("QA", "Pranav");
        extent.setSystemInfo("Envirnment", "localhost");
        extent.setSystemInfo("Build version", "12.24");
        System.out.println("start");
        
   }
   public void onTestSuccess(ITestResult result)
   {
	   test= extent.createTest(result.getName());
	   test.log(Status.PASS, "Testcase passed is "+result.getName());
   }
   public void onTestFailure(ITestResult result )
   {
	   test=extent.createTest(result.getName());
	   test.log(Status.FAIL, "Testcase fail is "+result.getName());
	   test.log(Status.FAIL, "Test  case fail reason is "+result.getThrowable());
   }
   public void onTestSkipped(ITestResult result) 
   {
	   test =extent.createTest(result.getName());
	   test.log(Status.SKIP, "Testcase skip is"+result.getName());
	   
   }
   public void onFinish(ITestContext context)
   {
	   extent.flush();
   }







}
