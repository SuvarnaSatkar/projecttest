package projectfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2 {
	@FindBy(xpath="//input[@name='firstname']") private WebElement fname;
	@FindBy(xpath="//input[@name='lastname']") private WebElement lname ;
	@FindBy(xpath="//button[@type='submit']")private WebElement submitbtn;
	
	public login2(WebDriver driver)
	{
		PageFactory.initElements(  driver,this);
	}
	
public void enterfname()
{
	fname.sendKeys("suvarna");
}
public void enterlname()
{
	lname.sendKeys("satkar");
}
public void submitbtn()
{
	submitbtn.click();
}

}
