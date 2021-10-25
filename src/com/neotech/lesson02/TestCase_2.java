package com.neotech.lesson02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/");

		Thread.sleep(1000);

		// Doing it in 2 steps
		// WebElement element = driver.findElement(By.linkText("REGISTER"));
		// element.click();

		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Murat");
		driver.findElement(By.name("lastName")).sendKeys("Tashpulatov");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.id("email")).sendKeys("murat@neotech.com");

		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();

		Thread.sleep(2000);
		driver.quit();

	}

}
