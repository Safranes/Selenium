package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
//	Amazon link count: 
//		Open chrome browser
//		Go to “https://www.amazon.com/”
//		Get number of all links 
//		Get number of links that has text
//		Print to console only the links that has text
//		Close the browser

	public final static String url = "https://www.amazon.com/";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		List<WebElement> linkList = driver.findElements(By.tagName("a"));

		int size = linkList.size();
		System.out.println(size);

		int textSize = 0;
		for (WebElement element : linkList) {

			if (!element.getText().isEmpty()) {
				textSize += 1;
				System.out.println(element.getAttribute("href"));

			} else {
				continue;
			}

		}
		System.out.println(textSize);

		driver.close();
	}

}
