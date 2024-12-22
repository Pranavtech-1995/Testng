package ParllelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParllelTesting {


//setup
//logapp display
//get title
//get cureent url
//teardown
//1.make test case //2.make xml//3.make parameter in  xml with value and attribute
//4.with same attribute make annotation in main class where we have to applied in array form with multiple attribute if there is
	//5.pass same parameter as a variable in the method
	//6.if we want parallel execution then write with parallel keyword in suite to run these test cases
	//7.if we want parallel execution then write the same keyword at class level with class keyword
	
WebDriver driver;
@Parameters({"Browser","Url"})
@BeforeClass
void setup(String system,String link)
{   
	
	switch (system.toLowerCase()) 
	{ 
	case "chrome":driver=new ChromeDriver();break;
	case "edge" :driver= new EdgeDriver();break;
	default :System.out.println("invalid browser");return; 
	}
	
	driver.manage().window().maximize();
	driver.get(link);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test(priority=1)
void logodisplay()
{
	boolean display =driver.findElement(By.xpath("//*[@class='orangehrm-login-branding']")).isDisplayed();
     System.out.println(display);
     Assert.assertTrue(display);
}
@Test(priority=2)
void gettitle()
{
	driver.getTitle();
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
}
@Test(priority=3)
void getcurrenturl()
{
	Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@AfterClass
void teardown()
{
	driver.quit();
}
















}
