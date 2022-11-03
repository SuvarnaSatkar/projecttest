package mavenproject;

import java.io.FileInputStream;

import java.util.Date;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

import utils.utility;

public class screenTest {
	
	  @Test
	public void displayScreenshot(Date d)
	{
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
	
		Date d1=new Date();
		//utility.capturescreenshot1(driver, d1);		
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage()); 
		}
	}
	  @Test
	 public void displayexcel()
	 {
		 try
		 {
			 FileInputStream file = new FileInputStream("D:\\screenshot\\Book1.xlsx");
				
			 FileInputStream f1=new FileInputStream("D:\\Book1.xlsx");
				short colcount = WorkbookFactory.create(f1).getSheet("Sheet1").getRow(0).getLastCellNum();
				
				FileInputStream f2=new FileInputStream("D:\\Book1.xlsx");
				int row_no = WorkbookFactory.create(f2).getSheet("Sheet1").getLastRowNum();
				
				
				utility.fetchexceldata(file,row_no,colcount);

		 }catch(Exception e)
		 {
			 e.getMessage();
		 }
	 }
	

}
