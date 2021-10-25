package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public final static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);


		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("flori");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("jambaba");
		driver.findElement(By.cssSelector("button[id*='u_0']")).click();
		

		Thread.sleep(3000);

		driver.quit();
	}
}
