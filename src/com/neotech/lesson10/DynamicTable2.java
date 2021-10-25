package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DynamicTable2 extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		setUp();

		// Login
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).submit();

		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		Thread.sleep(2000);

		String expectedValue = "Charlie";

		// Locating all the rows of the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) { // loop all the rows
			String rowText = rows.get(i).getText(); // get the text of one row

			if (rowText.contains(expectedValue)) { // validating the expected value
				// List starts from 0; WebTable xpath start from 1
				int rowIndex = i + 1;
				String path = "//table[@id='resultTable']/tbody/tr[" + rowIndex + "]/td[1]";
				System.out.println(path);

				driver.findElement(By.xpath(path)).click();

				// After we find the row and click to go to the details
				// you have to break the loop, otherwise we will have
				// StaleElementReferenceException
				break;
			}
		}

//		Thread.sleep(2000);
//		tearDown();
	}

}

