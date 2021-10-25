package com.neotech.lesson08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class ImplicitWithDemo extends BaseClass {

	public static void main(String[] args) {
		//http://uitestpractice.com/Students/Contact
		setUp();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("This is a Ajax link")).click();
		
		
		//we want to get the text after ajax link is done loading
		String resultText=driver.findElement(By.className("ContactUs")).getText();
		//or by xpath
//		driver.findElement(By.xpath("//*[@id=\"Result\"]/div")).getText();
		System.out.println(resultText);
		tearDown();

	}

}
