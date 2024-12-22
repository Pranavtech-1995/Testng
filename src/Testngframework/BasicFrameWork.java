package Testngframework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicFrameWork {



//login
//openapp
//testlogopresence
//logout
	
 WebDriver driver;
 @Test(priority=4)
 void closeapp () 
{
 driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
 driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
 driver.quit();
}
 
 
 
 
 @Test(priority=3)
 void testlogopresence() 

{
	
   Boolean b=driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
   System.out.println("LOGO DISPLAYED is "+b);

}
 
 
 @Test(priority=1)
 
 void openapp()
 {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
 }
 
 
 @Test (priority=2)
 void login()
 {
	
	 driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
 }




















}
