package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver ldriver;
	
	public  Loginpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
		
		
		@FindBy(id="Email")
		@CacheLookup
		WebElement txtemail;
		
		@FindBy(id="Password")
		@CacheLookup
		WebElement txtpass;
	
		
		
		@FindBy(xpath="//button[contains(text(),'Log in')]")
		@CacheLookup
		WebElement clicklogin;
		
		@FindBy(xpath="//a[contains(text(),'Logout')]")
		WebElement logout;
		
		
		
		public void txtusername(String uname) {
			
			txtemail.clear();
			txtemail.sendKeys(uname);
			

		}
		
		
		public void txtpassword(String password) {
			
			txtpass.clear();
			txtpass.sendKeys(password);
		}
		
		public void clicklogin() {
			clicklogin.click(); }
			
			
			public void clicklogout() {
				logout.click();
				
			
		}
		
	

}
