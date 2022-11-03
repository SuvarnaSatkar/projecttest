package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
		@FindBy (xpath="//input[@type='text']") private WebElement username;
		@FindBy (xpath="//input[@type='password']") private WebElement password;
		@FindBy (xpath="//button[@type='submit']") private WebElement loginbten;
		
		public login(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void enterUNm()
		{
			username.sendKeys("OKP335 ");
		}
		public void enterPWD()
		{
			password.sendKeys("ZAQ1234567");
		}
		public void loginbtn()
		{
			loginbten.click();
		}

}

