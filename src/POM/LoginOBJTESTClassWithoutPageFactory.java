package POM;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginOBJTESTClassWithoutPageFactory {

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
	   LoginPage log = new LoginPage(driver);
	   log.setmail_id("Admin");
	   log.setpassword("admin123");
	   log.clickonlogin();
	   Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	   
   
   }
   
   @Test (priority=1)
   
    void display() throws InterruptedException
   {
	   LoginPage log = new LoginPage(driver);
	   boolean Stat=log.statusoflogo();
	   System.out.println(Stat);
	   Assert.assertTrue(Stat);
   }
   @AfterClass
   void TearDown()
   {
	   driver.quit();
   }









}
