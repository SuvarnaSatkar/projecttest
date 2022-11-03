package mavenproject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testtestngcls {
	WebDriver driver;
	login log;
	login1 log1;
	home hom;
	logoutcls logout;
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Downloads\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
	
	}
	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{
		
		log = new login(driver);
		
		log.enterUNm();
		log.enterPWD();
		log.loginbtn();
		
		
		log1 = new login1(driver);
		Thread.sleep(5000);
		
		log1.enterpin();
		log1.clicksubmit();
		
		hom = new home(driver);
		logout = new logoutcls(driver);
		
	}
	@Test
	public void test() throws InterruptedException
	{
		
		
		hom = new home(driver);
		hom.order();
		String actual=driver.getCurrentUrl();
		if(actual.equals("https://kite.zerodha.com/orders"))
		{
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		
		
	}
public void test1() {
		
		System.out.println("test1");
		
		hom.holdings();
		
		String url = driver.getCurrentUrl();// Actual
		if(url.equals("https://kite.zerodha.com/holdings")) {
			System.out.println("Test Case Pass");
			}
		else {
			System.out.println("Test Case Fail");
		}
	}
	
	@Test
	public void test2() {
		
		System.out.println("test2");
		
		hom.positions();
		
	String url = driver.getCurrentUrl();// Actual
//		if(url.equals("https://kite.zerodha.com/positions")) {
//			System.out.println("Test Case Pass");
//			}
//		else {
//			System.out.println("Test Case Fail");
//		}
		//Assertion
SoftAssert soft = new SoftAssert();
		
		// 1) Comparison 2) Apply result on @Test
		// Actual equal to expected = True => TC passed
		// Actual equal to expected = False => TC failed
		soft.assertEquals(url, "https://kite.zerodha.com/holdings");
	
		// 1) Comparison 2) Apply result on @Test
				// Actual equal to expected = True => TC Failed
				// Actual equal to expected = False => TC failed
		soft.assertNotEquals(url, "https://kite.zerodha.com/holdings");
	
				
				boolean result = url.equals("https://kite.zerodha.com/holdings");
	// 1) Apply result on @Test
	// Result = True => TC PASSED
	// Result = False => TC Failed			
				
				soft.assertTrue(result);
	
	
	boolean result1 = url.equals("https://kite.zerodha.com/holdings");
	// 1) Apply result on @Test
	// Result = True => TC Failed
	// Result = False => TC Passed			
				
	soft.assertFalse(result1);
	
//	Forcefully remove from execution 
	
	soft.fail();
	// Apply the soft assertbresults on the @test methods
	soft.assertAll();
	
		
		
		
	}
			
	@AfterMethod
	public void aftermethod() throws InterruptedException
	{
		 logout=new logoutcls(driver);
		 hom.logout();
		logout.Clickuser();
		Thread.sleep(5000);
	}
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}

}
