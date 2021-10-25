package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {
public static void main(String[] args) throws InterruptedException {
//	 Orange HRM Application Negative Login: 
//		 Open Chrome browser
//		 Go to https://opensource-demo.orangehrmlive.com/
//		 Enter valid username
//		 Leave password field empty
//		 Verify error message with text "Password cannot be empty" is displayed.
	setUp();
	
	WebElement usernameBox=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
	WebElement paswordBox=driver.findElement(By.xpath("//*[@id='txtPassword']"));
	WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
	
	usernameBox.sendKeys("Admin");
	paswordBox.clear();
	loginButton.click();
	
	WebElement errorMsg=driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"));
	if(errorMsg.isDisplayed()) {
		System.out.println("Test passed!");
	}else {
		System.out.println("Test failed!");
	}
	Thread.sleep(3000);
	
	tearDown();
}
}
