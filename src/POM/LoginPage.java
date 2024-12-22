package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

//constructor
//locator
//action
  WebDriver driver;
  LoginPage( WebDriver driver)
  {
	  this.driver=driver;
  }
  
  //locator 
  

           By mail_id=By.xpath("//input[@placeholder='Username']");
           By password=By.xpath("//input[@placeholder='Password']");
           By login = By.xpath("//button[normalize-space()='Login']");
           By logodisplayed=By.xpath("//div[@class='orangehrm-login-logo-mobile']//img[@alt='orangehrm-logo']");

 //action
           
           public void setmail_id(String mail)
           {
        	   driver.findElement(mail_id).sendKeys(mail);
           }
 
           public void setpassword(String pass) 
           {
        	   driver.findElement(password).sendKeys(pass);
           }
           public void clickonlogin()
           {
        	   driver.findElement(login).click();
           }
           public boolean statusoflogo()
           {
        	   
        	   
        	   return driver.findElement(logodisplayed).isEnabled();
           }
}
