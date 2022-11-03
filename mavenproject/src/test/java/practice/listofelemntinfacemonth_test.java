package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practices.listofelemntinfacemonth;

public class listofelemntinfacemonth_test {
	WebDriver driver;
	listofelemntinfacemonth l1;
	@BeforeClass
	public void openbrouser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void getobj()
	{
		l1=new listofelemntinfacemonth(driver);
		
	}
	@Test
	public void displaydetails()
	{
		l1.displayelementofdrp();
	}

}
