package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import projectfacebook.flipcard;

public class fliptest {
	flipcard f1;
	WebDriver driver;
	@BeforeClass
	public void openbrouser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	
		public void search()
		{
		 f1=new flipcard(driver);
		 f1.cloasebutton();
		f1.entertext();
		f1.searchele();
		
	}
	@Test
	public void display()
	{
		System.out.println("Test");
	}

}
