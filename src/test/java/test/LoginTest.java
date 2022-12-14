package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	String userName = "demo@techfios.com";
	String password = "abc123";
	
	WebDriver driver;
	@Test
	public void ValidUserShoulBeTbletoLogin() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.PeriformLogin(userName, password);
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.ValidateDashboardPage();
		BrowserFactory.tearDown();
	}

}
