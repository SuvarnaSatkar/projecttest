package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
public class utility {
	
	
	public static void fetchexceldata(FileInputStream file, int row_no, short colcount) throws IOException
	{
	
		System.out.println("No.of Row in Excel File :"+row_no);
		System.out.println("No.of Column in Excel File :"+colcount);
	}

	public static void capturescreenshot1(WebDriver driver, String dateformat) throws IOException {
		
//		int TestId=123;
//		Date d=new Date();
//		DateFormat df=new SimpleDateFormat("yyyy-MM-dd& hh:mm:ss");
//		String dateformat = df.format(d);
		int TestId=123;
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\screenshot\\capture"+TestId+""+dateformat+".jpg");
		FileHandler.copy(src, dest);
		
	}

	
	
	
}
