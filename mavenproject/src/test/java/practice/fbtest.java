package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practices.fb;

public class fbtest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/");
	fb f1=new fb(driver);
	f1.entertext();
	f1.search();
	
}
}
