package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Homepage;
import page.TechHFiosLogInpage;
import util.BrowserFactory;

public class Homepagetest {
	@Test
	public void Homepagetest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/\r\n");
					
			TechHFioshomepage Loginpage = PageFactory.initElements(driver, TechHFioshomepage.class);
		
				
	Loginpage.login_demo();

	driver.close();

	driver.quit();
				
		
	}
	}

}
