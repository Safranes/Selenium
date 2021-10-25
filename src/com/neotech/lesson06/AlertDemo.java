package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	
	//url= http://uitestpractice.com/Students/SwitchTo
	setUp();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.id("alert")).click();

	Thread.sleep(2000);

	// If the alert is not handled (closed) and try to interact with other elements
	// we will get an UnhandledAlertException
	// driver.findElement(By.id("confirm")).click();

	// handling simple alerts
	Alert simpleAlert = driver.switchTo().alert();
	String alertText = simpleAlert.getText();
	System.out.println("The text of the alert is -> " + alertText);
	simpleAlert.accept();
	Thread.sleep(2000);

	// handling confirm alerts
	driver.findElement(By.id("confirm")).click();
	Thread.sleep(2000);

	Alert confAlert = driver.switchTo().alert();

	// We are getting text from alert
	String confText = confAlert.getText();
	System.out.println("The text of confirm alert is -> " + confText);
	
	// if we accept() --> we clicked on OK
	// confAlert.accept();

	// if we dismiss() --> we clicked on Cancel
	confAlert.dismiss();
	
	Thread.sleep(2000);
	
	// handling prompt alerts
	driver.findElement(By.id("prompt")).click();
	
	Alert promptAlert = driver.switchTo().alert();
	promptAlert.getText();
	promptAlert.sendKeys("Hi there");
	promptAlert.accept();
	//promptAlert.dismiss();
	Thread.sleep(2000);

	tearDown();
}
}