package practices;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class linkofgoogle {
	@FindBy(xpath="//a") private List<WebElement> linkofweb ;
	
	public linkofgoogle(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void displayalllink()
	{

		List<WebElement> link = linkofweb;
				
		for(int i=0;i< link.size();i++)
		{
			System.out.println(link.get(i).getText()+"  "+link.get(i).getAttribute("href"));
		}
	}

}
