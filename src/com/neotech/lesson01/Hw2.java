package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//HW2: Opening Page on Firefox Browser
//Open Firefox browser
//Navigate to “https://www.redfin.com/”
//Verify that you have navigated to (https://www.redfin.com/)
//End the Session (close the browser).
public class Hw2 {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.redfin.com/");
	
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://www.redfin.com/";
	
	if(actualUrl.equalsIgnoreCase(expectedUrl)) {
		System.out.println("I have navigated to = "+expectedUrl);
	}else {
		System.out.println("This URL is wrong");
	}

	
	driver.close();
}
}
