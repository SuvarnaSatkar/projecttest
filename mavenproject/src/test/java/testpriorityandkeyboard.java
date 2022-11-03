import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.utility;
import setup.setup;

public class testpriorityandkeyboard {
	WebDriver driver;
	setup s1;
	@BeforeClass
	public void Brouser()
	{
		setup s1=new setup();
		try {
		s1.openbrouser();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@BeforeMethod
	public void objcreation()
	{
		//setup s1=new setup(driver) ;
	}
	@Test
	public void test1()
	{
		
	}
	@Test
	public void test2()
	{
		
	}
	@Test
	public void methodexe_test3() throws IOException
	{
		
		Date d=new Date();
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd& hh:mm:ss");
		String dateformat = df.format(d);
		utility.capturescreenshot1(driver, dateformat);	
	}
	@AfterMethod
	public void objnull()
	{
		s1=null;
	}
	@AfterClass
	public void closebrouser()
	{
		s1.closeBrouser();
	}

}
