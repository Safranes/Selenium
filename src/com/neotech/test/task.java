package com.neotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class task extends CommonMethods {
public static void main(String[] args) {
	// url=https://www.facebook.com/r.php
	// We are creating 3 Select
	// Let us select my birthday
	setUp();
	
	WebElement month=driver.findElement(By.id("month"));
	WebElement day=driver.findElement(By.id("day"));
	WebElement year=driver.findElement(By.id("year"));
	
	selectDropdown(month, "Dec");
	wait(2);
	selectDropdown(day, "6");
	wait(2);
	selectDropdown(year, "1993");
	wait(3);
	tearDown();
	
	
}
}
