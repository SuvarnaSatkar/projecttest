package mavenproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class prioritycls {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	@BeforeMethod 
	public void beforemethod()
	{
		System.out.println("before method");
	}
	@Test (priority=4,invocationCount=3)
	public void testcase1()
	{
		System.out.println("Test case 1");
	}
	@Test (priority=3,dependsOnMethods={"testcase1"} )
	public void testcase2()
	{
		System.out.println("Test case 2");
	}
	@Test (priority=0)
	public void testcase3()
	{
		System.out.println("Test case 2");
	}
	
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("After method");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("After Class");
	}
	

}
