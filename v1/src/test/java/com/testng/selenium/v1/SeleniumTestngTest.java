package com.testng.selenium.v1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumTestngTest {
	public WebDriver driver;
	public String baseUrl = "https://magento.softwaretestingboard.com/"; //magento web application
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
		 String expectedTitle = "Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites";
         String actualTitle = driver.getTitle();
         Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void tearDown() {
	driver.close();
	}
}
