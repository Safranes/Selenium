package com.neotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.pages.DashboardPage;
import com.neotech.pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPage extends CommonMethods {

	//------------I am doing the same things with LoginTest.java class from Test package
	//By utilizing the LoginPage from pages package---------
	
	public static void main(String[] args) {
		// open the browser and navigate to the url
		setUp();
		
		//At this point we are finding the elements
		LoginPage login = new LoginPage();
		
		//sending the username
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		//sending the password
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		//click on login button
		login.loginBtn.click();
		
		wait(3);
		
		// validating that the welcome is displayed
		// Under com.neotech.pages package
		// Create the DashboardPage similar to LoginPage
		// Create a variable orangeHRMLogo and find the WebElement
		// Use the orangeHRMLogo variable here in this class

		WebElement welcome = driver.findElement(By.id("welcome"));
		if (welcome.isDisplayed()) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!");
		}
		
		DashboardPage logo=new DashboardPage();
		if(logo.orangeHRMLogo.isDisplayed()) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		
		wait(3);
		tearDown();
	}

}
