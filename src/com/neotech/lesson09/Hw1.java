package com.neotech.lesson09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Hw1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		1)Open chrome browser
//	2)Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//	3)Login to the application
//	4)Verify customer "Susan McLaren" is present in the table
//	5)Click on customer details
//	6)Update customers last name and credit card info
//	7)Verify updated customers name and credit card number is displayed in table
//	8Close browser
		
		setUp();
		
	driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
	driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
	driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
	
		WebElement table = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody"));
		
		String expectedText = "Susan McLaren";
		String actualText = table.getText();
		
		if(actualText.contains(expectedText)) {
			System.out.println(expectedText +" is in the table. Test case passed");
		}else {
			System.out.println(expectedText +" is NOT in the table. Test case failed");
		}
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[13]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]")).sendKeys("Susan Smith");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")).sendKeys("12357432811");
		
		String expectedName="Susan Smith";
		String expectedCCnumber="12357432811";
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_UpdateButton\"]")).click();
		
		Thread.sleep(3000);
		WebElement updatedTable = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody"));
//		String updatedText = table.getText();
		actualText = updatedTable.getText();

		if(actualText.contains(expectedName)&& actualText.contains(expectedCCnumber)) {
			System.out.println(expectedName+" & "+expectedCCnumber +" is in the table. Test case passed");
		}else {
			System.out.println(expectedName+" & "+expectedCCnumber +" is NOT in the table. Test case failed");
		}
		
		Thread.sleep(5000);
		
		tearDown();

	}

}
