package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class LoginPage extends CommonMethods {
//RESPONSIBLE TO FIND THE ELEMENTS ON THIS PAGE
	
		public WebElement username = driver.findElement(By.id("txtUsername"));
		
		public WebElement password = driver.findElement(By.id("txtPassword"));
		
		public WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		
		
		
	

}
