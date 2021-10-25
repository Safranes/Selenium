package com.neotech.lesson09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework1_Lesson8 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		Homework 1:
//	        Open chrome browser
//	        Go to “https://semantic-ui.com/modules/dropdown.html”
//	        Scroll down to “Multiple Selection”
//	        Click on drop down and select “CSS” and “HTML”
//	        Verify value has been selected
//	        Deselect 1 of the option from the dropdown
//	        Quit browser

//		This is returning css and html is not selected and also not deselecting one of them
		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1400)", "");
		
		WebElement multiSelectDD = driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/select"));
//		multiSelectDD.click();
		
		Select selectDD = new Select(multiSelectDD);

		selectDD.selectByIndex(1);
		selectDD.selectByIndex(4);
//		selectDD.selectByValue("css");
//		selectDD.selectByValue("html");
		
//		WebElement css= driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[2]"));
//		WebElement html = driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[5]"));
		
//		css.click();
//		html.click();
		
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[2]")).isSelected()) {
			System.out.println("CSS is selected");
		}else {
			System.out.println("CSS is not selected");
		}
		if(driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[5]")).isSelected()) {
			System.out.println("HTML is selected");
		}else {
			System.out.println("HTML is not selected");
		}

	Thread.sleep(2000);	
//	driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a[2]/i"))	;
	selectDD.deselectByIndex(1);
	
	tearDown();
	
		
	}

}
