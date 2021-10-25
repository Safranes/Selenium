package com.neotech.lesson09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Homework2_Lesson8 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		Homework 2:
//	        Verify element is enabled
//	        Open chrome browser
//	        Go to “https://the-internet.herokuapp.com/”
//	        Click on “Click on the “Dynamic Controls” link
//	        Click on enable button
//	        Enter “Hello” and verify text is entered successfully
//	        Close the browser 
		
		//I COULDN'T MAKE IT WORK WITH EXPLICIT OR IMPLICIT FOR TYPING HELLO
		//AND I COULDN'T VERIFY THAT HELLO IS ENTERED
		
		setUp();
		
//		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[13]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Disable")));
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form[2]/input")).sendKeys("Hello");
		
		String expectedText=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form[2]/input")).getText();
		System.out.println(expectedText);
		
		Thread.sleep(2000);
		tearDown();

	}

}
