package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFiosHomePage {
WebDriver driver;
	
	public TechFiosHomePage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.ID,using="name")
	WebElement FullName ;
	
	@FindBy(how=How.ID,using="account")
	WebElement Account ;
	
	
	@FindBy(how=How.ID,using="company")
	WebElement CompanyName;
	
	@FindBy(how=How.ID, using="email")
	WebElement Email;
	
	
	@FindBy(how=How.ID,using="phone")
	WebElement Phone;
	
	@FindBy(how=How.ID,using="address")
	WebElement address;
	
	@FindBy(how=How.ID, using="city")
	WebElement City;
     public void publish(){

    	// @FindBy(how=How.ID, using="zip")
    	//	WebElement ZipCode;
    		
    		//@FindBy(how=How.ID,using="\"select2-country-container\"")
    		//WebElement Country;
    		
    	
	}


   public void validatehomepage(){
    	
	  if (driver.findElement(By.id("title")).isDisplayed())
	  
	  {
		  System.out.println("Home page opened");
		  
	  }
    
    	 
     }



	
	
	
	
	
}
