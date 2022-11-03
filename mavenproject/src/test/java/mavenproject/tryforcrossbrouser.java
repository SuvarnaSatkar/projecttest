package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import projectfacebook.flipcard;

public class tryforcrossbrouser {
	
	WebDriver driver;
	flipcard t1;
	@Parameters("brouswer")
	
	@BeforeTest
	public void testexe(String browsername)
	{
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(browsername.equals("Microsoftedge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\Suvarna DATA\\Automation\\selenium\\msedgedriver.exe");
			driver = new EdgeDriver();

		}
	}
	@BeforeClass
	public void openbrouser()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		
	}
}
