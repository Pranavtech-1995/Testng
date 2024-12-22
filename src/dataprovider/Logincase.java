package dataprovider;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Logincase {

WebDriver driver;
@BeforeClass
void openapp()
{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://reports.crownit.in/");
}
@Test(priority=2,dataProvider="dp")
void login(String email,String password) throws InterruptedException
{
	driver.findElement(By.xpath("//*[@name='inemail']")).sendKeys(email);
	driver.findElement(By.xpath("//*[@name='inpassword']")).sendKeys(password);
	driver.findElement(By.xpath("//*[text()='Login']")).click();
	Thread.sleep(2000);
	driver.navigate().refresh();
   
    
}
	

@Test(priority=3,dependsOnMethods= {"login"})
void logodisplay() 
{
    boolean status= driver.findElement(By.xpath("//*[@class='logo']")).isDisplayed();
    Assert.assertEquals(true, status);
}
@Test(priority=4,dependsOnMethods= {"login","logodisplay"})
void logout()
{

	driver.findElement(By.xpath("//img[@src='../img/avtar.png']")).click();
	
	
}
@AfterClass
void teardown()
{
	
System.out.println("teardown");
driver.quit();
}
@DataProvider(name="dp")//indices= {0,1,2}
Object[][] logindata()
{ 
	Object [][] data= { {"aman@gamil.com","we123"},{"Neeleshbali@ipsos.com","Test@123"},{"pranav.prakash@ipsos.com","Test@123"},
	};
	
	return data;
	
}


}
