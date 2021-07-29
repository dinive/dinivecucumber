package Stepdefinition;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageobjects.AddCustomerpage;
import pageobjects.Loginpage;

public class Baseclass {
	
	public WebDriver driver;
	public Loginpage lp;
	public AddCustomerpage addcust;
	
	public static String randomstring() {
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return(generatedstring);
		
	}

}
