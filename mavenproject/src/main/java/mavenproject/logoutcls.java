package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutcls {
	@FindBy (xpath="//span[@class='user-id']")	private WebElement changeuser;
	
	
	public logoutcls(WebDriver driver){
	PageFactory.initElements(driver,this);
	}
	
    	
	
    public void Clickuser() {
    	changeuser.click();
		
	}

}
