package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
//	Radio Button Practice  
//	Open chrome browser
//	Go to “https://demoqa.com/radio-button” 
//	Verify if all radio buttons are displayed and clickable
//	Click on all radio buttons 
//	Verify radio buttons has been clicked successfully
//	Quit the browser
	public final static String url = "https://demoqa.com/radio-button";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

			List<WebElement> radioButtons=driver.findElements(By.cssSelector("label[for*='Radio']"));
			for(WebElement element: radioButtons) {
				if(element.isDisplayed() && element.isEnabled()) {
					System.out.println(element);
					element.click();
					Thread.sleep(3000);
				}else {
					System.out.println(element+" is not clickable");
				}
			}
driver.quit();
	}

}
