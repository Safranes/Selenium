package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hw2proper {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
	
	WebDriver dr=new FirefoxDriver();
	
	String url="https://www.redfin.com/";
	dr.get(url);
	
	String actualUrl=dr.getCurrentUrl();
	
	//Verify that you have navigated to ("https://www.redfin.com/")
	if(actualUrl.equalsIgnoreCase(url)) {
		
		System.out.println("The url as expected->"+actualUrl);
	}else {
		System.out.println(actualUrl+" _<is NOT expected-> "+url);
	}
	Thread.sleep(5000);//
	dr.quit();
}
}
