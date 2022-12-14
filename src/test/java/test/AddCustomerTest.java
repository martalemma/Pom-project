package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	String userName = "demo@techfios.com";
	String password = "abc123";
	
//	TestData
	String fullName = "Selenium";
	String company = "Amazon";
	String email = "abc@techfios.com";
	String phone = "123456";
	
	WebDriver driver;
	@Test
	public void ValidUserShoulBeTbletoLogin() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.PeriformLogin(userName, password);
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.ValidateDashboardPage();
		dashboardpage.clickCustomerField();
		dashboardpage.clickAddCustomerFiled();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.selectCompanyDropDown(company);
		addCustomerPage.inserEmai(email);
		addCustomerPage.insertPhoneNum(phone);
		
//		BrowserFactory.tearDown();
	}


}
