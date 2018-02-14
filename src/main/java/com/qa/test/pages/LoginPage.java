package com.qa.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.test.baseclass.baseclass;

public class LoginPage extends baseclass{

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Login;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
		
		public void login(String un, String pw) {
			username.sendKeys(un);
			password.sendKeys(pw);
			Login.click();
			
		}
	
	
}

