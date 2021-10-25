package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class GoogleTest extends CommonMethods {

	public static void main(String[] args) {
		//https://www.google.com/
		//Enter a text in search textbox
		//Press Enter
		
		setUp();
		
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("iPhone");
		
		wait(3);
		
		//Sending keyboard keys
		searchBox.sendKeys(Keys.ENTER);
		
		wait(3);
		
		
		tearDown();

	}

}
