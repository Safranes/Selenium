package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class HomeworkLesson12 extends CommonMethods {

	public static void main(String[] args) {
		setUp();
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));

		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		wait(2);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", driver.findElement(By.id("btnLogin")));

		WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));

		Actions action = new Actions(driver);

		action.moveToElement(pim).perform();
		wait(3);

		js.executeScript("arguments[0].click()", driver.findElement(By.id("menu_pim_addEmployee")));

		sendText(driver.findElement(By.id("firstName")), "Enes");
		sendText(driver.findElement(By.id("lastName")), "Carlos");
		sendText(driver.findElement(By.id("employeeId")), "3399");

		driver.findElement(By.id("btnSave")).click();

		driver.findElement(By.linkText("Employee List")).click();

		wait(3);
		List<WebElement> employeesRows = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]"));
		for (int i = 0; i < employeesRows.size(); i++) {
			String empName = employeesRows.get(i).getText();

			if (empName.contains("Enes")) {
				int rowIndex = i + 1;
				String path = "//*[@id=\"resultTable\"]/tbody/tr[" + rowIndex + "]/td[3]/a";
				driver.findElement(By.xpath(path)).click();

				break;
			}
		}
		TakesScreenshot ss=(TakesScreenshot) driver;
		
		try {
			FileUtils.copyFile(ss.getScreenshotAs(OutputType.FILE), new File("screenshots/screenshot_HW12.png"));
		} catch (WebDriverException | IOException e) {
			e.printStackTrace();
		}
		wait(2);
		tearDown();
		
		
		
		
		
	}
	
}
