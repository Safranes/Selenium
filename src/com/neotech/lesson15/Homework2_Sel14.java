package com.neotech.lesson15;

import com.neotech.pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2_Sel14 extends CommonMethods {

//	TC 2: Orange HRM wrong password validation
//	1. Go to https://opensource-demo.orangehrmlive.com/
//	2. Enter valid username and wrong password
//	3. Click on login button
//	4. Verify error message with text "Invalid credentials" is displayed
	public static void main(String[] args) {
		setUp();

		LoginPageUsingFactory login = new LoginPageUsingFactory();

		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "wrong password");
		wait(3);

		// login.loginBtn.click();
		click(login.loginBtn);

		String expectedTxt = "Invalid credentials";
		String actualTxt = login.errorMsg.getText();

		if (expectedTxt.equals(actualTxt)) {
			System.out.println("Test passed!!");
		} else {
			System.out.println("Test failed!!");
		}

		wait(3);

		tearDown();
	}
}