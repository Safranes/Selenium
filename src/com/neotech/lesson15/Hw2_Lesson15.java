package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

//Homework 2: OrangeHRM Login
//Navigate to https://opensource-demo.orangehrmlive.com/
//Login to the application by writing xpath based on “following and preceding siblings”
public class Hw2_Lesson15 extends CommonMethods {

	public static void main(String[] args) {
		setUp();

		WebElement username = driver.findElement(By.xpath("//*[@id=\"divUsername\"]/span/preceding-sibling::input"));
		sendText(username, ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.xpath("//div[@id='divUsername']/following-sibling::div/input"));
		sendText(password, ConfigsReader.getProperty("password"));

		WebElement loginBtn = driver.findElement(By.xpath("//div[@id='forgotPasswordLink']/preceding-sibling::input"));
		loginBtn.click();

		wait(2);
		tearDown();

	}

}
