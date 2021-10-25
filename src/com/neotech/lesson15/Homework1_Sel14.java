package com.neotech.lesson15;

import org.openqa.selenium.By;

import com.neotech.pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework1_Sel14 extends CommonMethods {
//	USE PAGE FACTORY-Loginpageusingfactory class
//	TC 1: Orange HRM blank password validation
//	1. Go to https://opensource-demo.orangehrmlive.com/
//	2. Enter valid username and leave password field empty
//	3. Click on login button
//	4. Verify error message with text "Password cannot be empty" is displayed

	public static void main(String[] args) {
		setUp();
		
		LoginPageUsingFactory login = new LoginPageUsingFactory();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		wait(3);
		
//		login.loginBtn.click();
		click(login.loginBtn);
		
		wait(3);
		
		String expectedTxt="Password cannot be empty";
		String actualTxt= login.errorMsg.getText();
		if(expectedTxt.equals(actualTxt)) {
			System.out.println("Test passed!!");
				
			}else {
				System.out.println("Test failed!!");
		}
		
		
		
		
		
		
		tearDown();
		
	}

}
