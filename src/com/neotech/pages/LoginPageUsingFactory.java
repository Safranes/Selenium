package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class LoginPageUsingFactory {
		@FindBy(id="txtUsername")
		public WebElement username;
		
		@FindBy(id="txtPassword")
		public WebElement password;
		
		
		@FindBy(id="btnLogin")
		public WebElement loginBtn;
		
		@FindBy(xpath = "//div[@id='divLoginButton']/span")
		public WebElement errorMsg;
		
		public LoginPageUsingFactory() {
			PageFactory.initElements(BaseClass.driver, this);
		}
}
