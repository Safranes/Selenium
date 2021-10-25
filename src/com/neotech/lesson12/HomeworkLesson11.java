package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class HomeworkLesson11 extends CommonMethods {

	public static void main(String[] args) {
		/* Homework 1:
		 *Create FrameDemo.java from Java Lesson07 using the CommonMethods.java	 
		 */
		// http://uitestpractice.com/Students/Switchto

		setUp();
		
		// switch to frame by index
		switchToFrame(0);
		WebElement nameText = driver.findElement(By.id("name"));

		sendText(nameText, "Enes");

		wait(2);

		driver.switchTo().defaultContent();
		
		// switch to frame by name
		switchToFrame("iframe_a");
		WebElement nameText2 = driver.findElement(By.id("name"));
		sendText(nameText2, "Alex");
		
		wait(2);
		driver.switchTo().defaultContent();
		
		//switch to frame by WebElement
		switchToFrame(driver.findElement(By.xpath("//iframe[@name='iframe_a']")));
		sendText(driver.findElement(By.id("name")),"Rapaic");
		wait(2);
		
		tearDown();
		
	}

}
