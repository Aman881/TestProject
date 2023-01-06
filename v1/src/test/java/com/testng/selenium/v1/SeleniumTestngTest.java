package com.testng.selenium.v1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumTestngTest {
	public WebDriver driver;
	public String baseUrl = "https://www.saucedemo.com/";
	String driverPath ="C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	
	@BeforeTest
	public void initDriver() {
	System.setProperty("webdriver.chrome.driver", driverPath);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(baseUrl);
	}
	@Test
	public void firstTest() {
		 String expectedTitle = "Swag Labs";
         String actualTitle = driver.getTitle();
         Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void tearDown() {
	driver.close();
	}
}
