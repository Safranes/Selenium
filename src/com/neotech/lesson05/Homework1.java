package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// HW1: Orange HRM Application Login:
		// Open Chrome browser
		// Go to https://opensource-demo.orangehrmlive.com/
		// Enter valid username and password
		// Click on login button
		// Then verify that Welcome message is displayed.
		// Quit the browser

		setUp();

		String user = ConfigsReader.getProperty("username");
		String pass = ConfigsReader.getProperty("password");
		
		WebElement usernameBox = driver.findElement(By.id("txtUsername"));
		usernameBox.clear(); 
		usernameBox.sendKeys(user);

		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		Thread.sleep(1000);

		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);

		WebElement welcomeMsg = driver.findElement(By.id("welcome"));

		if (welcomeMsg.isDisplayed()) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!");
		}
		Thread.sleep(1000);

		tearDown();

	}

}