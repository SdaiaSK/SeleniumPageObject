package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.TechHFiosLogInpage;
import page.TechHFiosLogInpage;
import util.BrowserFactory;

public class LoginTest {

	@Test
	public void loginTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/\r\n");
					
			
	TechHFiosLogInpage Loginpage = PageFactory.initElements(driver, TechHFiosLogInpage.class);
		
				
	Loginpage.login_demo();

	driver.close();

	driver.quit();
				
		
	}
	}
