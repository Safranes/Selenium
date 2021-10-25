package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkLesson3 {
//	 Using xPath ONLY
//	    TC 2: Mercury Tours Registration: 
//	        Open chrome browser
//	        Go to “http://demo.guru99.com/test/newtours/”
//	        Click on Register Link
//	        Fill out all required info
//	        Click Submit
//	        User successfully registered
	
	public final static String url = "http://demo.guru99.com/test/newtours/";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Mike");
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Miller");
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("2143325");
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("2143325");
		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("123 Street");

		Thread.sleep(1000);

		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);

		String expected = "http://demo.guru99.com/test/newtours/register_sucess.php";
		String current = driver.getCurrentUrl();

		if (expected.equals(current)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!");
		}

		driver.close();

	}


	}


