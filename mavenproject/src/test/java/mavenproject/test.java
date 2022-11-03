package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Suvarna DATA\\selenium\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
	
	

		login log = new login(driver);
		
		log.enterUNm();
		log.enterPWD();
		log.loginbtn();
		
		
		
		login1 log1 = new login1(driver);
		Thread.sleep(5000);
		
		log1.enterpin();
		log1.clicksubmit();
		
		
		
		home hom = new home(driver);
		
		hom.order();

}
}
