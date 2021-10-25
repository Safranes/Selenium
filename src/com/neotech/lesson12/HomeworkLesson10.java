package com.neotech.lesson12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;

public class HomeworkLesson10 extends CommonMethods {

	public static void main(String[] args) {
		// Homework 1: Leave List Search Validation
//1. Open chrome browser
//2. Go to https://opensource-demo.orangehrmlive.com/
//3. Login into the application
//4. Select Leave List
//5. Select from July 1, 2021 until August 31, 2020
//6. Check only "Scheduled"
//7. Click on Search
//8. Validate "No Records Found" is displayed
//9. Quit the browser

		setUp();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		wait(1);
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]/li"));
		for (WebElement opt : options) {
			if (opt.getText().equals("Leave")) {
				opt.click();
				break;
			}
		}

		driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[1]/img")).click();
		selectDropdown(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")), "Jul");
		List<WebElement> cells = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));

		for (WebElement day : cells) {
			String dayNum = day.getText();
			if (dayNum.equals("1")) {
				day.click();
				break;	}
		}
		driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[2]/img")).click();
		selectDropdown(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")), "Aug");

		List<WebElement> cellsReturn = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));

		for (WebElement day : cellsReturn) {
			String dayNum = day.getText();
			if (dayNum.equals("31")) {
				day.click();
				break;}
		}

		driver.findElement(By.xpath("//*[@id=\"leaveList_chkSearchFilter_1\"]")).click();
		clickRadioOrCheckbox(driver.findElements(By.xpath("//*[@id=\"leaveList_chkSearchFilter_checkboxgroup\"]/input")), "2");

		driver.findElement(By.id("btnSearch")).click();

		if (driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td")).getText().equals("No Records Found")) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!");
		}

		wait(3);
		tearDown();

	}

}
