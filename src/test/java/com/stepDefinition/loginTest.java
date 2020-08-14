package com.stepDefinition;

import java.io.IOException;

import com.Base.BaseTest;
import com.pages.Loginpage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class loginTest extends BaseTest{
	
	public loginTest() throws IOException {
		
		super();
		
	}
	
	public Loginpage login;
	
	
	@Before
	public void setup() throws IOException {
		
		startBrowser();
		
		login = new Loginpage();
		
	}
	
	@Given("^Enter the username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void enter_the_username_and_Password(String arg1, String arg2) throws Throwable {
	    login.validLogin(arg1, arg2);
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}



}
