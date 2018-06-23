package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CRMPage;
import page.TechHFiosLogInpage;
import util.BrowserFactory;

public class CRMTest {

	
	@Test
	public void CRMTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/\r\n");
	TechHFiosLogInpage Loginpage = PageFactory.initElements(driver, TechHFiosLogInpage.class);
	Loginpage.login_demo();
    System.out.println ("login Sucessfully");
	
System.out.println ("ready to add contact");		
	CRMPage TFCrmPage = PageFactory.initElements(driver, CRMPage.class);
		
				
	TFCrmPage.CRMPage_demo();
	
	

	driver.close();

	driver.quit();
				
		
	}
	}

