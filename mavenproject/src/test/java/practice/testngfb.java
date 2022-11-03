package practice;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practices.fb;

public class testngfb {
	WebDriver driver;
	fb f1;
	@BeforeClass
	public void openbrouser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
		
	}
	
	@BeforeMethod
	public void method()
	{
	 f1=new fb(driver);
	 f1.entertext();
		f1.search();
	}
	
	
	@Test
	public void test1()
	{
		String expected="https://www.w3schools.com/";
		String actual = driver.getCurrentUrl();
		
		Assert.assertEquals(expected, actual,"correct URL");
		
	}
	@Test (priority=3)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test (priority=2)
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void clasemethod()
	{
		f1=null;
	}
	
	@AfterClass
	public void closebrouser()
	{
		driver.close();
	}

}
