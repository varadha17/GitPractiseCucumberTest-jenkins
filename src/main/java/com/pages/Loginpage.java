package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseTest;
import com.Utilities.commonMethods;

public class Loginpage extends BaseTest{
	
	public Loginpage() throws IOException{
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="email")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginbutton;
	
	@FindBy(name="cusid")
	WebElement ID;
	
	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(linkText="Click Here")
	WebElement clickHere;
	
	
	public void validLogin(String username, String Password) throws InterruptedException {
		
		user.sendKeys(username);
		pass.sendKeys(Password);
		loginbutton.click();
		System.out.println(driver.getTitle());
		
		
	}

}
