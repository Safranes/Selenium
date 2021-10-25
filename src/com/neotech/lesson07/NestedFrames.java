package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class NestedFrames extends BaseClass {
public static void main(String[] args) {
	//url=https://demoqa.com/nestedframes
	setUp();
	
	//Switch to the frame using the ID
	driver.switchTo().frame("frame1");//parent frame
	
	//Let us locate the child frame
	WebElement childFrame=driver.findElement(By.xpath("/html/body/iframe[@srcdoc='<p>Child Iframe</p>']"));
	
	//Let us switch to child Frame
	driver.switchTo().frame(childFrame);
	
	//Now we are searching inside the child frame
	WebElement p=driver.findElement(By.xpath("//body/p"));
	System.out.println("The text inside the child frame-> "+p.getText());
	
	
}


}
