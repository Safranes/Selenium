package com.neotech.lesson07;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Task extends BaseClass{
//	TC 1: Frame verification
//	Open chrome browser
//	Go to https://demoqa.com/frames
//	Verify header of both frames
//	Quit browser
	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.switchTo().frame("frame1");
		String header1=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("The first frame header is -> "+ header1);
		
		//This is crucial!!You have to go back to main content so you can switch to other frame 
		//Think of it this way; you are in the first frame and you cannot reach to anything inside another
		//frame or anything outside the frame you are in..So you are moving the focus!!
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		//Locating an element inside the second frame
		String header2=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("The second frame header is-> "+header2);
		Thread.sleep(2000);
		
		
		
		tearDown();
		
	}
	
	
	
	
}
