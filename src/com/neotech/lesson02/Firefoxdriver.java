package com.neotech.lesson02;

public class Firefoxdriver implements Webdriver {

	public Firefoxdriver() {
		System.out.println("Opening firefox browser");
	}

	@Override
	public void get(String url) {
		System.out.println("Firefox navigates to " + url);
	}

	@Override
	public String getTitle() {
		System.out.println("Firefox gets the title of the page");
		return "Page title";
	}

	@Override
	public String getCurrentUrl() {
		System.out.println("Firefox gets the current url");
		return "Page url";
	}

	@Override
	public void close() {
		System.out.println("Firefox closing current tab");
	}

	@Override
	public void quit() {
		System.out.println("Firefox closing ALL tabs");
	}
}
