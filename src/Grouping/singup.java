package Grouping;

import org.testng.annotations.Test;

public class singup {
    
	@Test(priority=1,groups= {"regression"})
	 void signupbymail()
	    {
	    	System.out.println("sign by mail");
	    }
	    
	@Test(priority=2,groups= {"regression"})
	    void signupbygoogle()
	    {
	    	System.out.println("sign by google");
	    }
	@Test(priority=3,groups= {"regression"})
	    void signupbyfacebook()
	    {
	    	System.out.println("sign by facebook");
	    }
	@Test(priority=4,groups= {"regression"})
	    void signupbyappleid()
	    {
	    	System.out.println("sign by appleid");
	    }





}
