package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	@Test
 public void validUserShouldAbleToLogin() {
	 
	 driver=BrowserFactory.init();
	//regular object creation 
	 //LoginPage loginPage1=new LoginPage();
	 LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class );
	 loginPage.insertUserName("demo@techfios.com");
	 loginPage.insertPassword("abc123");
	 loginPage.clickSignIn();
	 DashboardPage dashboard=PageFactory.initElements(driver, DashboardPage.class);
	 dashboard.verifyDashboardPage();
	 BrowserFactory.tearDown();
 }
}
