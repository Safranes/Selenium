package com.neotech.lesson08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class ExplicitWaitDemo extends BaseClass {

	public static void main(String[] args) {
		//http://uitestpractice.com/Students/Contact
		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("This is a Ajax link")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//visibilityOfElementLocated- we only need the locator of the element
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ContactUs")));
		
		//visibilityOf- we need the WebElement
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("ContactUs"))));
		
		boolean isThere = driver.findElement(By.xpath("//*[@id=\"Result\"]/div/p[contains(text(), 'Selenium')]")).isDisplayed();
		System.out.println(isThere);
		
		tearDown();
		
		
	}

}
