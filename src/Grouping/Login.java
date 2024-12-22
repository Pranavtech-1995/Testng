package Grouping;

import org.testng.annotations.Test;

public class Login {

     @Test(priority=1,groups= {"sanity"})
    void loginbymail()
    {
    	System.out.println("login by mail");
    }
     @Test(priority=2,groups={"sanity"})
    void loginbygoogle()
    {
    	System.out.println("login by google");
    }
     @Test(priority=3,groups={"sanity"})
    void loginbyfacebook()
    {
    	System.out.println("login by facebook");
    }
     @Test(priority=4, groups={"sanity"})
    void loginbyappleid()
    {
    	System.out.println("login by appleid");
    }











}
