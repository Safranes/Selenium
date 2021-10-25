package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//HW2: Facebook sign up: 
//
//Open chrome browser
//Go to “https://www.facebook.com/”
//Enter first name
//Enter last name
//Enter mobile number
//Click on sign up button
public class Homework {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.navigate().to("https://www.facebook.com/r.php");
	Thread.sleep(3000);
	driver.findElement(By.name("firstname")).sendKeys("Enes");
	driver.findElement(By.name("lastname")).sendKeys("Safran");
	driver.findElement(By.name("reg_email__")).sendKeys("2134234");
	Thread.sleep(3000);
	driver.findElement(By.name("websubmit")).click();
	
	driver.close();
	
}}
