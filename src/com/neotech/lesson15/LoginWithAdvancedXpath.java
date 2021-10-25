package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginWithAdvancedXpath extends CommonMethods {
	// 1. Navigate to https://opensource-demo.orangehrmlive.com/
		// 2. Login to the application by writing Advanced xpath
	
	public static void main(String[] args) {
		setUp();
		
		//Using grandparent to locate the grand-child
		WebElement username = driver.findElement(By.xpath("//form[@id='frmLogin']/div[2]/input"));
		sendText(username, ConfigsReader.getProperty("username"));

		//Using uncle to locate the nephew 
		WebElement password = driver.findElement(By.xpath("//div[@id='divUsername']/following-sibling::div/input"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		//Using brother to locate the brother
		WebElement loginBtn = driver.findElement(By.xpath("//div[@id='forgotPasswordLink']/preceding-sibling::input"));
		loginBtn.click();

		wait(3);

		tearDown();
	}

}
