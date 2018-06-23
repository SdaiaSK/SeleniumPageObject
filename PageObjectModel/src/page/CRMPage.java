package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CRMPage {

	
WebDriver driver;
	
	public CRMPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.XPATH,using="//text()[contains(.,'CRM')]/ancestor::a[1]")
	WebElement CRM;
	
	/*@FindBy(how=How.ID,using="content")
	WebElement CRM;
	
	@FindBy(how=How.ID, using="publish")
	WebElement publish;
	*/
     public void CRMPage_demo()
     {
		
		//title.sendKeys("Hello");
		//content.sendKeys("How are you doing");
		CRM.click();
	}


   public void validatehomepage(){
    	
	  if (driver.findElement(By.id("//a[text()='Add Contact']")).isDisplayed())
	  
	  {
		  System.out.println("Open CRM");
		  
	  }
    
    	 
     }


}

