package com.neotech.lesson02;

public interface Webdriver {

	public void get(String url);

	public String getTitle();

	public String getCurrentUrl();

	public void close();

	public void quit();

}
