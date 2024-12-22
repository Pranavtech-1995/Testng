package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class POMTYPE2 {


WebDriver driver;

POMTYPE2( WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(how=How.XPATH,using =" //input[@placeholder='Username']")
//@FindBy(xpath=" //input[@placeholder='Username']") 
WebElement username;
@FindBy (xpath="//input[@placeholder='Password']")
WebElement Pssword;
@FindBy (xpath="//button[normalize-space()='Login']")
WebElement Login;



void username(String user)
{
	username.sendKeys(user);
}
void password (String pass)
{
	Pssword.sendKeys(pass);
}
void Logincl() 
{
	Login.click();
}













}
