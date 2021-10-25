package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Task extends BaseClass {
//	  Verify:
//	        month dd has 12 month options
//	        day dd has 31 day options
//	        year dd has 117 year options
//	        Select your date of birth	
//	        Quit browser
public static void main(String[] args) throws InterruptedException {
	setUp();
	WebElement monthsDD=driver.findElement(By.id("month"));
	Select selectMonths=new Select(monthsDD);
	
	if(selectMonths.getOptions().size()==12) {
		System.out.println("Test passed!");
	}else {
		System.out.println("Test failed");
	}
	
	WebElement daysDD=driver.findElement(By.id("day"));
	Select selectDays=new Select(daysDD);

	if(selectDays.getOptions().size()==31) {
		System.out.println("Test passed!");
	}else {
		System.out.println("Test failed");
	}
	
	
	
	WebElement yearsDD=driver.findElement(By.id("year"));
	Select selectYears=new Select(yearsDD);

	if(selectYears.getOptions().size()==117) {
		System.out.println("Test passed!");
	}else {
		System.out.println("Test failed");
	}
	
	selectMonths.selectByValue("12");
	selectDays.selectByValue("6");
	selectYears.selectByValue("1993");
	Thread.sleep(2000);
	tearDown();
}
}
