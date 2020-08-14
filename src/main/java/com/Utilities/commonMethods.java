package com.Utilities;

import java.io.IOException;

import org.openqa.selenium.Alert;

import com.Base.BaseTest;

public class commonMethods extends BaseTest {
	
	public commonMethods() throws IOException {
		super();
	}

	
	//Alert Interface
	
	public static void acceptAlert() {
		
		Alert accept = driver.switchTo().alert();
		accept.accept();
		
	}
	
	public static void declineAlert() {
		Alert decline = driver.switchTo().alert();
		decline.dismiss();
	}
	
	public static void textAlert(String data) {
		Alert text = driver.switchTo().alert();
		text.sendKeys(data);
	}
	
	public static void switchWindow() {
		for(String switchWindow: driver.getWindowHandles()) {
			driver.switchTo().window(switchWindow);
		}
	}
	
	
}
