package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageobjects.AddCustomerpage;
import pageobjects.Loginpage;

public class stepdefinitioin extends Baseclass {
	


	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {

System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
driver=new ChromeDriver();
lp=new Loginpage(driver);
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	 driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String string2) {
		lp.txtusername(email);
		lp.txtpassword(string2);
		
	   
	}

	@When("Click on Login")
	public void click_on_login() {
		lp.clicklogin();
	  
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("login unsuccess"))
		{
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
			
			
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		lp.clicklogout();
		Thread.sleep(3000);
	    
	}

@Then("close browser")
	public void close_browser() {
		driver.quit();
	    
	}
	
	
	//customer feature
	

@Then("Customer can view Dashboard")
public void customer_can_view_dashboard() {
	addcust=new AddCustomerpage(this.driver);
	Assert.assertEquals("Dashboard / nopCommerce administration", addcust.getpagetitle());
  
}
@When("User clicks on customer Menu")
public void user_clicks_on_customer_menu() throws InterruptedException {
	Thread.sleep(3000);
	addcust.customermenu();

}
@When("click on customer menu dropdown")
public void click_on_customer_menu_dropdown() throws InterruptedException {
	Thread.sleep(2000);
	addcust.customermenuitem();
}

@When("click on add new button")
 public void click_on_add_new_button() {
	 addcust.customermenuaddnew();
	}
  
@Then("user can view add new customer page")
public void user_can_view_add_new_customer_page() throws InterruptedException {
	Thread.sleep(2000);
  Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.getpagetitle());
}
@When("user enter customer info")
public void user_enter_customer_info() throws InterruptedException {
	String email=randomstring()+"@gmail.com";
	addcust.customeremail(email);
	addcust.customerpassword("test123");
	addcust.setCustomerRoles("Guest");
 Thread.sleep(2000);
 
 addcust.drpdownvendor("Vendor 2");
 addcust.setGender("Male");
 addcust.setfirstnam("dinive"); 
 addcust.setlastname("prakash");
 addcust.dob("12/21/1991");
 addcust.setcmpnyname("Cognizant");
 addcust.setadmin("new tester");;
}
@When("click on save button")
public void click_on_save_button() throws InterruptedException {
	addcust.btnsave();
	Thread.sleep(2000);
   
}
@Then("user can view {string}")
public void user_can_view(String string) {
	Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
  
}

}
