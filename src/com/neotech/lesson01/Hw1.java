package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
//	HW1: Amazon Page Title Verification: 
//		Open chrome browser
//		Go to “https://www.amazon.com/”
//		Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
//		End the Session (close the browser).
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String title = driver.getTitle();
		String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	
		if(driver.getTitle().equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title = Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
			
		}else {
			System.out.println("This title is wrong");
		}
		
		driver.close();
	}
	

}
