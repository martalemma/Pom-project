package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BrowserFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
//	webElement list
	@FindBy(how = How.XPATH,using = "//input[@id='username']")WebElement USERNAME_Element;
	@FindBy(how = How.XPATH,using = "//input[@id='password']")WebElement PASSWORD_Element;
	@FindBy(how = How.XPATH,using = "//button[@name='login']")WebElement SIGNIN_Element;

//	Corresponding method
	public  void PeriformLogin(String UserName, String Password) {
		
		USERNAME_Element.sendKeys(UserName);
		PASSWORD_Element.sendKeys(Password);
		SIGNIN_Element.click();
		
	}
}
