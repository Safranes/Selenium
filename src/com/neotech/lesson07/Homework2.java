package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
//Homework2 of Class6
public class Homework2 extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		// url=https://semantic-ui.com/modules/dropdown.html
		setUp();
//I have to click on the element so that the drop-down options will show
		driver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[8]/div")).click();

		Thread.sleep(1000);
//Click on CSS option 
		WebElement cssOption = driver
				.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[2]"));
System.out.println("csOption text is -->"+cssOption.getText());
cssOption.click();
Thread.sleep(1000);
//click on HTML option
driver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[text()='HTML']")).click();
Thread.sleep(1000);
//Clicking on the x next to CSS
driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a[text()='CSS']/i")).click();

//Clicking on the x next to HTML
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a[@data-value='html']/i")).click();

Thread.sleep(3000);



		tearDown();

	}
}
