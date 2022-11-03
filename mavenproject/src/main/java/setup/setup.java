package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setup {
	WebDriver driver;
	
	public void openbrouser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.demo.guru99.com/V4/"); 
		driver.manage().window().maximize();
		}
	public void closeBrouser()
	{
		driver.close();
	}

}
