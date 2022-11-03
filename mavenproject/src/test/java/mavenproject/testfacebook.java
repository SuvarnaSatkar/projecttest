package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import projectfacebook.login2;

public class testfacebook {
	login2 l1;
	WebDriver driver;
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void beforemethod()
	{
		l1 = new login2(driver);
		l1.enterfname();
		l1.enterlname();
		l1.submitbtn();
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}

}
