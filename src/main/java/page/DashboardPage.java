package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	public void DashboardPage(WebDriver driver) {
		this.driver= driver;
		
	}
//	WebElement
	@FindBy(how = How.XPATH,using = "//h2[text()=' Dashboard ']")
	WebElement DASHBOARD_Element;
	@FindBy(how = How.XPATH,using = "//span[text()='Customers']")
	WebElement CUSTEMER_Element;
	@FindBy(how = How.XPATH,using = "//a[text()='Add Customer']")
	WebElement ADDCUSTOMER_Element;
	
//  Corresponding method
	public void ValidateDashboardPage() {
		Assert.assertEquals(DASHBOARD_Element.getText(), "Dashboard","Page not found");
	}
	
	public void clickCustomerField() {
		CUSTEMER_Element.click();
	}
	public void clickAddCustomerFiled() {
		ADDCUSTOMER_Element.click();
	}
}
