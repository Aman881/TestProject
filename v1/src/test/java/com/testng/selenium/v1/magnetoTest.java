package com.testng.selenium.v1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class magnetoTest {
		public WebDriver driver;
		public String testUrl ="https://magento.softwaretestingboard.com/";
		String driverPath = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		
		@BeforeTest
		public void launchBrowser(){
			System.setProperty("webdriver.chrome.driver",driverPath);
			driver = new ChromeDriver();
			driver.get(testUrl);
		}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
