package practices;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class listofelemntinfacemonth {
	@FindBy(xpath="//select[@name='birthday_month']") private WebElement monthdrp; 
	
	
public listofelemntinfacemonth(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void displayelementofdrp()
{
	Select s1=new Select(monthdrp);
	List<WebElement> l1 = s1.getOptions();
	for(int i=0;i<l1.size();i++)
	{
		System.out.println(l1.get(i).toString());
	}
}
}
