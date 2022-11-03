package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practices.linkofgoogle;


public class getalllinkoggoogle {
	WebDriver driver;
	linkofgoogle l1;
	
	@BeforeClass
	public void openbrouser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	
		public void search()
		{
		l1=new linkofgoogle(driver);
		
		
	}
	@Test
	
	public void displayalllink()
	{
	
		l1.displayalllink();
		
	}

}
