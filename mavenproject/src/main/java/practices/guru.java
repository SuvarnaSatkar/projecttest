package practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru {
	@FindBy(xpath="//label[@id='message23'])") private WebElement uname;
	@FindBy(xpath="//input[@type='password']") private WebElement passwd;
	@FindBy(xpath="//input[@type='submit']") private WebElement submit;
	@FindBy(xpath="//a[text()='Insurance Project']") private WebElement link;

	
	public guru(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Uname()
	{
		uname.sendKeys("abc@gmail.com");
	}
	public void passwd()
	{
		
		passwd.sendKeys("123");
		
	}
	public void login()
	{
		submit.click();
	}
	public void link()
	{
		link.click();
	}
}
