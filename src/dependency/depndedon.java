package dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class depndedon {


//openapp	
//login
//search
//advance search 
//logout
@Test(priority=1)	
void openapp()
{
	Assert.assertTrue(true);
}
@Test(priority=2,dependsOnMethods= {"openapp"})
void login()
{
	Assert.assertTrue(true);
}
@Test(priority=3,dependsOnMethods= {"login","openapp"})
void search()
{
	Assert.assertTrue(false);
}
@Test(priority=4,dependsOnMethods= {"login","openapp","search"})
void advancesearch()
{
	Assert.assertTrue(true);
}
@Test(priority=5,dependsOnMethods= {"login","openapp","search","advancesearch"})
void logout()
{
	Assert.assertTrue(true);
}









}
