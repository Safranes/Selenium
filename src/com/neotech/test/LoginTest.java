package com.neotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest extends CommonMethods {
public static void main(String[] args) {
	// HW1: Orange HRM Application Login:
			// Open Chrome browser
			// Go to https://opensource-demo.orangehrmlive.com/
			// Enter valid username and password
			// Click on login button
			// Then verify that Welcome message is displayed.
			// Quit the browser
	setUp();
	WebElement username = driver.findElement(By.id("txtUsername"));
	sendText(username, ConfigsReader.getProperty("username"));
	WebElement password = driver.findElement(By.id("txtPassword"));
	sendText(password, ConfigsReader.getProperty("password"));
	WebElement loginBtn = driver.findElement(By.id("btnLogin"));
	loginBtn.click();
	wait(2);
	WebElement welcome = driver.findElement(By.id("welcome"));
	if (welcome.isDisplayed()) {
		System.out.println("Test passed!");
	} else {
		System.out.println("Test failed!");
	}
	tearDown();
}
}