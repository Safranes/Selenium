package com.neotech.lesson07;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework3 extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	//url=https://demoqa.com/
	setUp();
	

	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div[@class='category-cards']/div[3]")).click();
	Thread.sleep(5000);
	
	
	tearDown();
}
}
