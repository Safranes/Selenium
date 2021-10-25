package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
//		/TC 1: Upload file and Take Screenshot
//		1.Navigate to http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload
//			2.Upload file
//			3.Verify file got successfully uploaded and take screenshot
	
		setUp();
		
		String filePath= System.getProperty("user.dir")+ "/screenshots/screenshot_1.png";
		
		wait(2);
		
		driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys(filePath);
		
		wait(2);
		
		driver.findElement(By.xpath(""))
		
		
		
		
		
		tearDown();
	
	
	}

}
