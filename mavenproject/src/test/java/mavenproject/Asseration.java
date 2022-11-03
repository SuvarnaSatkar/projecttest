package mavenproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Asseration {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("beforemethod");
	}
	@Test (enabled=false)
	public void test1()
	{
		System.out.println("Test1 executed");
	}
	@Test (timeOut=2000)
	public void test2() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Test 2 executed");
	}
	@Test 
	public void test3()
	{
		System.out.println("Test 3 executed");
	}
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("Aftermethod");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("Afterclass");
	}
}
