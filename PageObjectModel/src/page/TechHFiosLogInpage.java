package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechHFiosLogInpage {
WebDriver driver;
	
	public TechHFiosLogInpage(WebDriver ldriver)
	{
		
		this.driver=ldriver;
	}
	// username=Id= user_login
	@FindBy(how=How.ID,using="username")
	WebElement username;
	
	@FindBy(how=How.ID,using="password")
	WebElement password;
	
	@FindBy(how=How.NAME, using="login")
	WebElement submit_button;
	
	
	
	
	public void login_demo()
	{
		
		username.sendKeys("techfiosdemo@gmail.com");
		password.sendKeys("abc123");
		submit_button.click();
	}
	
    
}


