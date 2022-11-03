package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import projectfacebook.login2;

public class practice {
	
	
public static void main(String[] args) {
	login2 l1;
	//WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Downloads\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver();
	
	
	
	driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver1.get("https://www.facebook.com/r.php");
	driver1.manage().window().maximize();
	l1 = new login2(driver1);
	l1.enterfname();
	l1.enterlname();
	l1.submitbtn();
	
}
}
