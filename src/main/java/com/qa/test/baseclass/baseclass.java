package com.qa.test.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.test.util.util;

public class baseclass {
public static WebDriver driver ;
public static Properties prop;


public baseclass() {
	
	try {
prop= new Properties();
FileInputStream ip = new FileInputStream("/Users/imthiyaz/eclipse-workspace2"
		+ "/secframework/src/main/java/com/qa/test/config/config.properties");
		prop.load(ip);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
		
	}
}
	
	//create a method that will instantiate webdriver and other browser related activities

public void instantiate() {
		String browser = prop.getProperty("browser");
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			driver = new ChromeDriver();
			
		}
		if (browser.equals("FF")) {
			System.setProperty("webdriver.driver.gecko", "geckodriver");
			driver = new FirefoxDriver();
		}
	
	driver.get(prop.getProperty("url1"));
		
		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(util.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS );
		//driver.manage().timeouts().pageLoadTimeout(util.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
}

public static void handlingnormalpopup() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	driver.switchTo().frame("intercom-borderless-frame");
	Actions actions = new Actions(driver);
actions.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'intercom-chat-card-author')]"))).build().perform();
	
	driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-dismiss-button')]")).click();
	System.out.println("this is a test method");
	}
	
	// this is a test comment made on 4th jan 2020
	
	
	
}





	

