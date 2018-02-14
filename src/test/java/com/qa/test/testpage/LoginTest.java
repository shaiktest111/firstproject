package com.qa.test.testpage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.test.baseclass.baseclass;
import com.qa.test.pages.LoginPage;

public class LoginTest extends baseclass{

	LoginPage login;
	public  LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		instantiate();
		handlingnormalpopup();
		login = new LoginPage();
		
	
		
	}
    @Test
    public void login() {
  
    login.login(prop.getProperty("username"), prop.getProperty("password"));
    System.out.println("loggedin");
    	
    }
    @AfterMethod
    public void teardown()
    {
    	driver.quit();
    	
    }
}
