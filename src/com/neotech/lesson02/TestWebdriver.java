package com.neotech.lesson02;



public class TestWebdriver {

	public static void main(String[] args) {
		Webdriver driver = new Firefoxdriver();

		driver.get("www.neotech.com");

		String title = driver.getTitle();
		System.out.println(title);

		driver.close();
	}
}
