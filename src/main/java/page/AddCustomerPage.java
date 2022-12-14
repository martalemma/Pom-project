package page;

import java.awt.geom.GeneralPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage{
	
	WebDriver driver;
	
	public void AddCustomerPage(WebDriver driver) {
		this.driver= driver;
		
	}
//	WebElement
	@FindBy(how = How.XPATH,using = "//input[@id='account']")
	WebElement FULLNAME_Element;
	@FindBy(how = How.XPATH,using = "//select[@id='cid']")
	WebElement COMPANY_Element;
	@FindBy(how = How.XPATH,using = "//input[@id='email']")
	WebElement EMAIL_Element;
	@FindBy(how = How.XPATH,using = "//input[@id='phone']")
	WebElement PHONENUMBER_Element;

// corresponding method

   public void insertFullName(String fullName) {
	   String insertName = fullName + generatRandomNum(999);
	FULLNAME_Element.sendKeys(insertName);
	}
    public void selectCompanyDropDown(String company) {
    	selectDropDownMenu(COMPANY_Element, company);
    		
    }
    public void inserEmai(String email) {
    	String insertEmail = generatRandomNum(999)+ email;
    	EMAIL_Element.sendKeys(insertEmail);
    }
    public void insertPhoneNum(String phone) {
    	PHONENUMBER_Element.sendKeys(phone + generatRandomNum(999));
    }
}
