package Grouping;

import org.testng.annotations.Test;

public class Payment {

	@Test(priority=1,groups= {"sanity","regression","functional"})
 void paymentbypaytm() 
 {
	 System.out.println("Payment by paytm");
 }
	@Test(priority=2,groups= {"sanity","regression","functional"})
 void paymentbygpay() 
 {
	 System.out.println("Payment by gpay");
	 
 }
	@Test(priority=3,groups= {"sanity","regression","functional"})
 void paymentbyphonepe() 
 {
	 System.out.println("Payment by phonepay");
 }
 


}

//syntax is groups in array with name in the form of string 
//include tag is used to define in xml to execute group
// exclude tag is also used 
//group ,run, include,exclude must be inserted before test defining then it will execute concept of group
// without xml we can't use grouping concept 
