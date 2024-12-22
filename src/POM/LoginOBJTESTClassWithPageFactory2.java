package POM;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginOBJTESTClassWithPageFactory2 {

   WebDriver driver;
   @BeforeClass
   void setup ()
   {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
   }
   @Test(priority=2)
   void login() throws InterruptedException
   {
	   POMTYPE2 log = new POMTYPE2(driver);
	   log.username("Admin");
	   log.password("admin123");
	   log.Logincl();
	   Thread.sleep(5000);
	   Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	   
 }
   
   
   
   @AfterClass
   void TearDown()
   {
	   driver.quit();
   }









}
