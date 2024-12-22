package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

    @Test
	void checking()
	{
		
		String s="Welcome";
		String s1="welcome";
		
		//Assert.assertEquals(s, s1);//this is used to check test case is pass or fail
		//Assert.assertEquals(123, 345);//failed
		//Assert.assertNotEquals(s, s1);//failed 
		//Assert.assertTrue(true);//passed
		//Assert.assertFalse(false);//passed
		//Assert.assertTrue(false);//failed
		//Assert.assertFalse(true);//failed
		//Assert.fail();
		
		//hardassertion//after this if there is any line it will not exceute 
		//softassertion//but in this case it will exceute 
		
		SoftAssert Sa= new SoftAssert();
		Sa.assertEquals(s, s1);
		
		System.out.println("TEST  CASE Failed");
		
		Sa.assertAll();//Mandatory//otherwise it will always through passed if we use soft assertion
		
	}



}
