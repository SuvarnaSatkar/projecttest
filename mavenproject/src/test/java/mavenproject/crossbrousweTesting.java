package mavenproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import projectfacebook.flipcard;

public class crossbrousweTesting {
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
			System.setProperty("webdriver.edge.driver","D:\\Suvarna DATA\\selenium\\edge\\msedgedriver.exe");
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

	@BeforeMethod
	public void getlinkk() 
	{
		t1=new flipcard(driver);
		t1.cloasebutton();
		t1.entertext();
		t1.searchele();
			
		
	}
	@Test
	public void diaplay()
	{
		
		System.out.println("brouser");
	}
	@AfterTest
	public void Screenshot() throws IOException
	{
	String a=RandomString.make();
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\abc"+a+".jpg");
	
	FileHandler.copy(src,dest);
	}
	@AfterMethod
	public void clesrr()
	{	driver=null;
		t1=null;
	}
	@AfterClass
	public void closee()
	{
		driver.close();
		System.gc();
	}
	
}
