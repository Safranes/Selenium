package com.neotech.lesson09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class WebTableDemo extends BaseClass {

	public static void main(String[] args) {
		
		//Go to the site https://www.seleniumeasy.com/test/table-search-filter-demo.html
		//Store all headers and print the header data
		//Print number of rows
		//Print the row data
	
		setUp();
		System.out.println("==================Header Data===================");
		
		List<WebElement> headerData = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		
		Iterator<WebElement> it = headerData.iterator();
		while(it.hasNext()) {
			String headerText = it.next().getText();
			System.out.print(headerText + " | ");
		}
		System.out.println();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println("This is the number of rows: " + rows.size());
		
		System.out.println("================Row Data=======================");
		
		List<WebElement> rowsData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td"));
		for(WebElement data: rowsData) {
			String cellData = data.getText();
			System.out.println(cellData);
		}
		
		tearDown();
	}

}

