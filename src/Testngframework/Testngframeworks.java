package Testngframework;

import org.testng.annotations.Test;

public class Testngframeworks {

	
	 //login
	//openapp
	//logout
	//act as main method //if we don't assign any priority then it is set as 0
	//it will set  exceution  a/c to  alphabets 
	//after setting priority it will work a/c to priority
	//priority will set as -1 and 
	
	@Test(priority=100)
	void login()
	{
		System.out.println("welcome to login page");
	}
	@Test(priority=200)
	void openapp()
	{
		System.out.println("welcome to app");
		
	}
	
	@Test//if we don't apply then it will set as 0
	void entry ()
	{
		System.out.println("Welcome to enviornment");
	}
	@Test(priority=-1)
	void exit()//if we don't apply then it will not execute
	{
		System.out.println("Bye Bye from enviornment");
	}
	@Test(priority=300)//it will work a/c to mathematical incremental  order //order of method is considered
	void logout()
	{
		System.out.println("welcome to logout");
	}
	@Test //a/c to alphabets if priority order is same
	void aentry() 
	{
		System.out.println("preentry");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


