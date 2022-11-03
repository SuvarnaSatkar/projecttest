package practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb {
	@FindBy(xpath="//input[@type='text']") private WebElement search;
	@FindBy(xpath="//button[@type='button']")private WebElement searchclk;
	
	public fb(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void entertext()
	{
		search.sendKeys("javascripts");
	}
	
	public void search()
	{
		searchclk.click();
	}
	

}
