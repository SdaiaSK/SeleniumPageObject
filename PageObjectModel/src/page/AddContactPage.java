package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage {
WebDriver driver;
	
	public void LogInPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	// username=Id= user_login
	@FindBy(how=How.ID,using="user_login")
	WebElement Username;
	
	@FindBy(how=How.ID,using="user_pass")
	WebElement Password;
	
	@FindBy(how=How.ID, using="wp-submit")
	WebElement submitbutton;
	public void login() {}
	
	
	@FindBy(how=How.XPATH, using="//text()[contains(.,'CRM')]/ancestor::a[1]")
	WebElement crmlink;
	
	
	@FindBy(how=How.XPATH, using="//a[text()='Add Contact']")
	WebElement addcontact;
	
	
	@FindBy(how=How.ID,using="account")
	WebElement username;
	
	@FindBy(how=How.ID,using="user_pass")
	WebElement password;
	
	@FindBy(how=How.ID, using="wp-submit")
	WebElement submit_button;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void login_demo(){
		
		username.sendKeys("admin");
		password.sendKeys("demo123");
		submit_button.click();
	}
	
    
}

	
	
	
