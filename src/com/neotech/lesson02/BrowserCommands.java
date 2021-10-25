package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.get("https://facebook.com/");
		// will NOT store the history
		// wait for the page elements to be loaded

		driver.navigate().to("https://github.com/");
		// saves the history
		// does NOT wait the page to be fully loaded

		Thread.sleep(1000);

		driver.manage().window().fullscreen(); // -> makes full screen
		Thread.sleep(1000);

		driver.navigate().refresh(); // refresh the page
		Thread.sleep(1000);

		driver.navigate().to("https://amazon.com");
		Thread.sleep(1000);

		driver.navigate().back(); // need to go back to github page
		Thread.sleep(1000);

		driver.navigate().forward(); // brings you forward to amazon page

		driver.close(); // closes the current tab (webpage)
		driver.quit(); // closes all tabs (webpages)

	}

}

		
	