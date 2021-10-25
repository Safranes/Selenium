package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class JSExecutorDemo extends CommonMethods {

	public static void main(String[] args) {
//		https://opensource-demo.orangehrmlive.com/
		
		setUp();
		
		//Create an object of JS Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement username= driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password,ConfigsReader.getProperty("password"));
		
		js.executeScript("arguments[0].style.backgroundColor='red'; arguments[1].style.backgroundColor='green'", username,password);
		
		wait(3);
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("btnLogin")));
		
		wait(3);
		
		WebElement pimMenu = driver.findElement(By.id("menu_pim_viewPimModule"));
		
		js.executeScript("arguments[0].click()", pimMenu);
		
		wait(3);
		
		js.executeScript("window.scrollBy(0,700)");
		
		wait(3);
		
		js.executeScript("window.scrollBy(0,-600)");
		
		wait(3);
		
		
		
		
		tearDown();
	}

}
