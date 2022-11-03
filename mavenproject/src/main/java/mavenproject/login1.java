package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1 {
	@FindBy (xpath="//input[@type='password']")	private WebElement pin;
	@FindBy (xpath="//button[@type='submit']")	private WebElement submit;
	
	
	// Step 2 Initialisation of variable
	
	public login1(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	// Step 3 Method create
	
			public void enterpin() {
				pin.sendKeys("234567");
			}
			
			public void clicksubmit() {
				submit.click();
			}
	

}
