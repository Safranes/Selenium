package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Hw1_Lesson15 extends CommonMethods {
//Homework 1: OrangeHRM Login 
//Navigate to https://opensource-demo.orangehrmlive.com/
//Login to the application by writing xpath based on “parent and child relation”
	public static void main(String[] args) {
		setUp();

		wait(3);
		WebElement username = driver.findElement(By.xpath("//*[@id=\"divUsername\"]/span/../input"));
		sendText(username, ConfigsReader.getProperty("username"));

		WebElement password = driver.findElement(By.xpath("//*[@id=\"divPassword\"]/input"));
		sendText(password, ConfigsReader.getProperty("password"));

		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"divLogin\"]/div[2]/div[2]/form/div[5]/input"));
		loginBtn.click();

		wait(3);

		tearDown();
	}

}
