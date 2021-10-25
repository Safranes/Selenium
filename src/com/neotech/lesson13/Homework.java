package com.neotech.lesson13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework extends CommonMethods {

	public static void main(String[] args) {
//		***Homework 1: 
//		    Go to url: https://opensource-demo.orangehrmlive.com
//		    Log in using our custom methods
//		    Go to PIM menu
//		    Add an employee
//		    Go to Employee List
//		    Get the list of the employees (Using tables - tr and td) 
//		    Loop to search for the employee you added
//		    When you find the employee - click on it.
//		    Upload another image in the employee photo

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

		driver.findElement(By.id("empPic")).click();
		String filePath = System.getProperty("user.dir") + "/screenshots/carlos.jpg";

		driver.findElement(By.id("photofile")).sendKeys(filePath);
		wait(3);

		driver.findElement(By.id("btnSave")).click();

		if (driver.findElement(By.id("btnDelete")).isDisplayed()) {
			System.out.println("Successfully uploaded!");
		}
		wait(3);
		tearDown();

	}

}
