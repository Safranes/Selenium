package com.neotech.lesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {
public static void main(String[] args) {
//	=================   HW_2_Handling Frames =================================
//
//			1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
//			2) Verify on the page header "Not a Friendly Topic" displayed
//			3)Click on the Inner Frame Check box
//			4)Choose baby Cat from Animals dropdown
//			5)Quit the browser
	setUp();
	
	////*[@id="page-top"]/div/div/div/div/div/label/span
	//div[@class='card mb-3']/label/span
	
	//print out the header text, to make sure its there
	System.out.println(driver.findElement(By.xpath("//div[@class='card mb-3']/label/span")).getText());
	
	driver.switchTo().frame("frame1");
	driver.switchTo().frame("frame3");
	//click the checkbox
	driver.findElement(By.id("a"));
	
	driver.switchTo().defaultContent();
	
	//switch to frame using the frame name
	driver.switchTo().frame("frame2");
	//switch to frame using the web element
//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"frame2\"]")));	
	
	
	
	Select s1= new Select(driver.findElement(By.id("animals")));
//	s1.selectByValue("babycat");
	s1.selectByVisibleText("Baby Cat");
	
	Thread.sleep(3000);
	
	
	tearDown();
	
	
	
}
}
