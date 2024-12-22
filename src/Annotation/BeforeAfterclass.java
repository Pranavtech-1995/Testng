package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BeforeAfterclass {

	
	
	@BeforeMethod
	void login()
	{
		System.out.println("Welcome to login");
	}
	
	@BeforeClass
	void openapp()
	{
		System.out.println("open an app");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("search");
	}
	@Test(priority=2)
	void Advsearch()
	{
		System.out.println("Adv search ");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("logout");
	}
	@AfterClass
	void teardown()
	{
		System.out.println("close wndow and driver");
	}
	
	
	
	
	
	
	
	

}
