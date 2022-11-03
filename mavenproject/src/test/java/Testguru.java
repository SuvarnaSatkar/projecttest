import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practices.guru;

public class Testguru {
	WebDriver driver;
	guru g1;
	@BeforeClass
	public void openbrouser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.demo.guru99.com/V4/"); 
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void objectcreation()
	{
	 g1=new guru(driver);
	}
	@Test
	public void login()
	{
		g1.Uname();
		g1.passwd();
		g1.login();
		g1.link();
	}
	@AfterMethod
	public void closebrouse()
	{
		
		g1=null;
		
	}
//	@AfterClass
//	public void close()
//	{
//		driver.close();
//	}
	
}
	
	


