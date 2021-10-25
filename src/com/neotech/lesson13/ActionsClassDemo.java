package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class ActionsClassDemo extends CommonMethods {

	public static void main(String[] args) {
//		https://www.amazon.com/

		setUp();
		WebElement account = driver.findElement(By.id("nav-link-accountList"));
		
		Actions action =new Actions(driver);
		action.moveToElement(account).perform();
		wait(3);
		WebElement el = driver.findElement(By.id("nav-flyout-ya-newCust"));
		if (el.getText().contains("Start")) {
			System.out.println("Menu Shown");
		} else {
			System.out.println("Menu not shown");
		}
		wait(3);
		// performing a right click : contextClick()
		action.contextClick(el).perform();
		wait(2);
		// double click
		// go to search box, click on search box, send keys, and lastly double click.
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchBox).click().sendKeys("Movie").doubleClick().perform();
		wait(2);
		tearDown();
	}
}
