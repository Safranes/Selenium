package com.neotech.lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {
public static void main(String[] args) throws InterruptedException {
//	==================  HW_1_Handling Multiple Windows =======================
//
//			1) Launch the browser and open the site " http://demo.guru99.com/popup.php "
//			2) Click on link "Click Here ".When the user clicks on the " Click Here " link, new child window opens.
//			3)On the Child Window, Enter your email ID and submit.
//			4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//			5) Close the Child window on which credentials are displayed.Switch to the parent window.

setUp();

driver.findElement(By.linkText("Click Here")).click();

Set<String> winHandles= driver.getWindowHandles();

Iterator<String> it = winHandles.iterator();

String pWin=it.next();
String chWin=it.next();

//using switchTo() we will move to the child window
driver.switchTo().window(chWin);

driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("johndoe@gmail.com");
driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

//get credential data
driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]")).getText();

Thread.sleep(3000);


tearDown();

}
}
