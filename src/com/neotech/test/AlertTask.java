package com.neotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class AlertTask extends CommonMethods {

	public static void main(String[] args) {
//		Using the four alert methods we created
//		in CommonMethods class:
//		1. Click in alert button and get the alert
//		text and then accept the alert.
//		2. click in the confirm alert button and
//		then dismiss the alert.
//		3. click in the prompt alert button and
//		send a text to the alert and then accept or
//		dismiss.
		setUp();
		
		//click on the alert button
		driver.findElement(By.id("alert")).click();
		wait(1);
		//get text and accept the alert
		System.out.println(getAlertText());
		wait(3);
		acceptAlert();
		//click confirm button
		driver.findElement(By.id("confirm")).click();
//		wait(1);
		dismissAlert();
		
		wait(1);
		//handling prompt
		driver.findElement(By.id("prompt")).click();
//		wait(2);
		sendAlertText("Enes");
		
//		wait(1);
		acceptAlert();
//		wait(2);
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
		String welcomeName = msg.getText();
		
		if(welcomeName.contains("Enes"))
		{
			System.out.println("TEST PASSED");
		}
		else
		{
			System.out.println("TEST FAILED");
		}
			
		System.out.println(welcomeName);
		tearDown();
	}



}
