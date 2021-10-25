package com.neotech.lesson09;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;
//Homework 3: (try to use FluentWait)
//Add Employee
//Open chrome browser
//Go to “https://opensource-demo.orangehrmlive.com/”
//Login into the application
//Click on Admin>User Management> Users
//Add Employee
//Log out 
//Quit the browser
public class Homework3_Lesson8 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
setUp();
		
		// Log in to out website
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
		
		
		// Navigating to to Add Employee page
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		//  Adding Employee
		driver.findElement(By.id("firstName")).sendKeys("John");
		driver.findElement(By.id("lastName")).sendKeys("Smith");
		driver.findElement(By.id("btnSave")).click();
		
		
		driver.findElement(By.id("welcome")).click();
		
		//Fluent wait usage
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
		
		WebElement logout = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a"));
			}
		});
		
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		
		
		
	}

}
