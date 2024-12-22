package myListener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//@Listeners(myListener.Mylistener.class)// through same class implementions
public class Listeneresting {


//setup
//logapp display
//get title
//get cureent url
//teardown
WebDriver driver;

@BeforeClass
void setup()
{   driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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
	Assert.assertEquals(driver.getTitle(), "rangeHRM");
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
