package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class ScreenShotDemo extends CommonMethods {

	public static void main(String[] args) {
		// url=https://opensource-demo.orangehrmlive.com/

		setUp();
		
		//usin our own sendText() method
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));	
	
		TakesScreenshot ts1= (TakesScreenshot) driver;
		//When we use 1 line, we take the screenshot and also save it
		try {
			FileUtils.copyFile(ts1.getScreenshotAs(OutputType.FILE), new File("screenshots/screenshot_2.png"));
		} catch (WebDriverException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		driver.findElement(By.id("btnLogin")).click();
		//creating a TakeScreenshot object
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		//take Screenshot and save it as an object type of File
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(source, new File("screenshots/screenshot_1.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	
	}

}
