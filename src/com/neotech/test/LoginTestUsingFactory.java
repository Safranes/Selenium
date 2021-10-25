package com.neotech.test;

import com.neotech.pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingFactory extends CommonMethods {

	public static void main(String[] args) {
		// open the browser and navigate to the url
		setUp();

		// At this point we are NOT finding the elements
		// We are just telling how the elements will be found
		LoginPageUsingFactory login = new LoginPageUsingFactory();

		// sending the username
		sendText(login.username, ConfigsReader.getProperty("username"));

		// sending the password
		sendText(login.password, ConfigsReader.getProperty("password"));

		// click on login button
		login.loginBtn.click();

		wait(2);

		// validating that the welcome is displayed

		// Task until 2:40
		// Create the DashboardPageUsingFactory similar to LoginPageUsingFactory
		// Find Welcome Element using xpath

		// closing the browser
		tearDown();
	}
}
