package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class MultipleSelectDropdown extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	//in case you need to go to a different url
	//make sure you enter it in configuration.properties
	//url =http://uitestpractice.com/Students/Select
	
	//Let us locate the multiple select drop-down
	WebElement multiSelectDD=driver.findElement(By.id("countriesMultiple"));
	
	//Create a select object that WebElement
	Select selectDD = new Select(multiSelectDD);
	
	boolean isMulti=selectDD.isMultiple();
	System.out.println("Is it multi select? "+isMulti);
	
	if(isMulti) {
		List<WebElement> allOptions = selectDD.getOptions();
	
		for(WebElement option:allOptions) {
			String text=option.getText();
			selectDD.selectByVisibleText(text);
			Thread.sleep(1000);
		}
	}
	
	selectDD.deselectByIndex(1);
	Thread.sleep(2000);
	selectDD.deselectAll();
	Thread.sleep(2000);
	
	tearDown();
	
}
}
