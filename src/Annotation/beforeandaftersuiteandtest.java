package Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class beforeandaftersuiteandtest {

@AfterSuite
void Aftersuite() {
	System.out.println("After suite");
}
	
	
	
	
@BeforeSuite
void Beforesuite()
{
	System.out.println("Beforesuite");
}


@BeforeTest
void Beforetest()
{
	System.out.println("before test");
}


@AfterTest
void Aftertest()
{
	System.out.println("After test");
}


@Test
void exit()
{
	System.out.println("completed all test case");
}

//if class is single in each test suite then it will execute single time as before test and after test 
//if contain double classes then it will execute multiple time











}
