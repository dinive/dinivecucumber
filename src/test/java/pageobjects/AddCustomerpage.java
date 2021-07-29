package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerpage {

	WebDriver driver;
	public AddCustomerpage(WebDriver rdriver) {
	
	this.driver=rdriver;
	
	PageFactory.initElements(rdriver, this);
}
	
	By lnkcustomersmenu=By.xpath("//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]");
			By lnkcustomersmenuitem=By.xpath("//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]");
					By btnAddnew=By.xpath("//a[@class='btn btn-primary']");
					By txtemail=By.xpath("//input[@id='Email']");
					By txtpass=By.xpath("//input[@id='Password']");
					By txtcustomerroles=By.xpath("//div[@class=\'k-multiselect-wrap k-floatwrap']");
					By listitemadmin=By.xpath("//span[contains(text(),'Administrators')]");
					By listitemvendors=By.xpath("//span[contains(text(),'Vendors')]");
					By listitemregistered=By.xpath("//span[contains(text(),'Registered')]");
					By listitemguest=By.xpath("//span[contains(text(),'Guests')]");
					By forummoderators=By.xpath("//span[contains(text(),'Forum Moderators')]");
					By drpdownvendor=By.xpath("//select[@id='VendorId']");
					By firstname=By.xpath("//input[@id='FirstName']");
					By lastname=By.xpath("//input[@id='LastName']");
					By gendrmale=By.xpath("//input[@id='Gender_Male']");
					By genderfemale=By.xpath("//input[@id='Gender_Female']");
					By dob=By.xpath("//input[@id='DateOfBirth']");
					By companyname=By.xpath("//input[@id='Company']");
					By admincontent=By.xpath("//textarea[@id='AdminComment']");
					By btnsave=By.xpath("//button[@name='save']");
					
					//Action methods
					
					public String getpagetitle() {
					return this.driver.getTitle();
					}
					
					public void customermenu() {
						this.driver.findElement(lnkcustomersmenu).click();
					}
					
					public void customermenuitem() {
						this.driver.findElement(lnkcustomersmenuitem).click();
					}
					
					public void customermenuaddnew() {
						this.driver.findElement(btnAddnew).click();
					}
					
					public void customeremail(String email) {
						this.driver.findElement(txtemail).sendKeys(email);;
					}
					
					public void customerpassword(String pass) {
						this.driver.findElement(txtpass).sendKeys(pass);
					}
					

					
					
					public void cutomermenu() {
						this.driver.findElement(lnkcustomersmenu).click();
					}
					
					public void setCustomerRoles(String role) throws InterruptedException {
						if(role.equals("Vendors")) {
							driver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[contains(text(),'CustomerRole')]"));
									}
						
						this.driver.findElement(txtcustomerroles).click();
						
						WebElement listitem;
						
						Thread.sleep(3000);
						
						if(role.equals("Administrators"))
						{
							listitem=this.driver.findElement(listitemadmin);
						}
						else if(role.equals("Guests"))
						{
							listitem=this.driver.findElement(listitemguest);
							}
						
							else if(role.equals("Vendors"))
							{
								listitem=this.driver.findElement(listitemguest);
							
							
						}
						else if(role.equals("Registered"))
						{
							listitem=this.driver.findElement(listitemregistered);
							
							
						
					}
					
						else if(role.equals("Vendors"))
						{
							listitem=this.driver.findElement(listitemvendors);
							
				
					listitem.click();
						JavascriptExecutor js=(JavascriptExecutor)this.driver;
						js.executeScript("arguments[0].click()", listitem);
							
					}}
						
						public void drpdownvendor(String value) {
							Select drp=new Select(this.driver.findElement(drpdownvendor));
							drp.selectByVisibleText(value);
							
						}
						
						public void setGender(String gender) {
							if (gender.equals("Male"))
							{
								this.driver.findElement( gendrmale).click();
							}
							
							else if(gender.equals("Female")) {
								this.driver.findElement(genderfemale).click();
							}
							else
							{
								this.driver.findElement(gendrmale).click();
							}
						}
						
						public void setfirstnam(String fname) {
							this.driver.findElement(firstname).sendKeys(fname);
						}
						
						public void setlastname(String name) {
							this.driver.findElement(lastname).sendKeys(name);
						}
						
						public void dob(String name) {
							this.driver.findElement(dob).sendKeys(name);
						}
						
						public void setcmpnyname(String name) {
							this.driver.findElement(companyname).sendKeys(name);
						}
						
						public void setadmin(String name) {
							this.driver.findElement(admincontent).sendKeys(name);
						}
						
						public void btnsave() {
							this.driver.findElement(btnsave).click();
						}
						
} 

		
					
					
					