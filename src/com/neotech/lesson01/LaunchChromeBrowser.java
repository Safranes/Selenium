package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//where driver is located
	
	//Declaring a variable of type WebDriver
	//Calling constructor of ChromeDriver
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");//The webpage where I want to navigate

	String url = driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	System.out.println("Current URL: "+url); //Same thing
	
	String title = driver.getTitle();
	System.out.println("Title= "+title);
	
	Thread.sleep(4000);//Pause for 4000 miliseconds=4 seconds
	driver.close();// closing current tab
	
	driver.quit(); //closing the whole browser
	
}
}
