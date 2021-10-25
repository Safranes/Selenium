package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class DragAndDropDemo extends CommonMethods {

	public static void main(String[] args) {
		// https://jqueryui.com/droppable/

		setUp();
		
	//driver.switchTo().frame(0);
	
		//our own method from CommonMethods
		switchToFrame(0);
		
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action =new Actions(driver);
		
		//direct drag and drop
		action.dragAndDrop(drag, drop);
		
		wait(3);
		
		//indirect drag and drop
		action.clickAndHold(drag).moveToElement(drop).release().perform();
		
		
		
		
		tearDown();
	}

}
