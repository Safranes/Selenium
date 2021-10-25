package com.neotech.lesson15;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class LambdaTest extends CommonMethods {

	public static void main(String[] args) {
//Go to https://accounts.lambdatest.com/register
		//		Find the Password Element and enter a password
//		Find the Show span as a nephew of the password element and click on it
//		Find the Business Email as a cousin of the password element and enter an email
		setUp();
		
		driver.findElement(By.id("userpassword")).sendKeys("Secret123");
		
		wait(1);
		
		driver.findElement(By.xpath("//input[@id='userpassword']/following-sibling::div/span"))args;
		
		
		
		
		
		
		
		
		tearDown();
		

	}

}
