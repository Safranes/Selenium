package com.neotech.lesson08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Task extends BaseClass {
//	TC 1: Verify element is present
//	1. Open chrome browser
//	2. Go to “https://the-internet.herokuapp.com/”
//	3. Click on “Click on the “Dynamic Loading” link
//	4. Click on “Example 1...” and click on “Start”
//	5. Verify element with text “Hello World!” is displayed
//	6. Close the browser 
	public static void main(String[] args) {
		//https://the-internet.herokuapp.com/
setUp();

//set up an implicit wait for 5 seconds
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

driver.findElement(By.linkText("Dynamic Loading")).click();
driver.findElement(By.xpath("/html/body/div[2]/div/div/a[1]")).click();
driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();



WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));
boolean helloWorld=driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).isDisplayed();

System.out.println(helloWorld);
tearDown();
	}

}
