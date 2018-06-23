package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddContactPage;
import page.TechFiosHomePage;
import page.TechHFiosLogInpage;
import util.BrowserFactory;

public class AddContactTest {

	
	@Test
	public void LoginTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/\r\n");
					
			
	TechHFiosLogInpage Loginpage = PageFactory.initElements(driver, TechHFiosLogInpage.class);
		
				
	Loginpage.login_demo();
	
	TechHFiosLogInpage homepage = PageFactory.initElements(driver, TechHFiosLogInpage.class);
	
	homepage.clicking contactbuttons();
	
	AddContactPage addcontact = PageFactory.initElements(driver, AddContactPage.class);
	addcontact.addingcontact();
	driver.close();

	driver.quit();
				
		
	}
}

