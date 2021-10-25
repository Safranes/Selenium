package com.neotech.lesson10;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class CalendarDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("//span[@id='calDepartLabelCont']/span[2]")).click();
		
		String month=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		while(!month)
		driver.findElement(By.xpath("//span[text()='Next']"));
		
		
		Thread.sleep(3000);
		tearDown();

	}

}
