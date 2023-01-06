package com.testng.selenium.v1;

	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;
	public class firsttestngfile {
	    public String baseUrl = "https://www.saucedemo.com/";
	    String driverPath = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	    public WebDriver driver ; 
	     @AfterTest                            //Jumbled
	      public void terminateBrowser(){
	          driver.close();
	      }
	     @BeforeTest                            //Jumbled
	      public void launchBrowser() {
	          System.out.println("launching chrome browser"); 
	          System.setProperty("webdriver.chrome.driver", driverPath);
	          driver = new ChromeDriver();
	          driver.get(baseUrl);
	      }
	      @Test                                //Jumbled
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	     }
	      
	}
