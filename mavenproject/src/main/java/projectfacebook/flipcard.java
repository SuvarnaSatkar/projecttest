package projectfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipcard {
	@FindBy(xpath="//button[@class='L0Z3Pu']") private WebElement search;
	@FindBy(xpath="//input[@title='Search for products, brands and more']") private WebElement textbx;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']") private WebElement closebtn;
	
	public flipcard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchele()
	{
		
		search.click();
	}
	public void entertext()
	{
		textbx.sendKeys("mobile");
	}
	public void cloasebutton()
	{
		closebtn.click();
	}
//
}
