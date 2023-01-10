package com.testng.selenium.v1;

	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;
	public class firsttestngfile {
	    public String baseUrl = "https://www.saucedemo.com/";
	    String driverPath = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	    public WebDriver driver ; 
	     @BeforeMethod                            //Jumbled
	      public void launchBrowser() {
	          System.out.println("launching chrome browser"); 
	          System.setProperty("webdriver.chrome.driver", driverPath);
	          driver = new ChromeDriver();
	          driver.get(baseUrl);
	      }
	     
	      @Test                                //Testcase1
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Swag Labs";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle,expectedTitle);
	     }
	      
	     @Test									//Testcase2
	     public void validLogin() {
	    	 WebElement userName = driver.findElement(By.name("user-name"));
	         userName.click();
	         userName.clear();
	         userName.sendKeys("standard_user");
	         WebElement password = driver.findElement(By.name("password"));
	         password.click();
	         password.clear();
	         password.sendKeys("standard_user");
	         WebElement submitButton = driver.findElement(By.name("login-button"));
	         submitButton.click();
	     }
	     
	     @Test
	     public void invalidEmptyLogin() {
	    	 driver.findElement(By.name("user-name")).clear();
	    	 driver.findElement(By.name("password")).clear();
	    	 driver.findElement(By.name("login-button")).click();
	     }
	     
	     @Test
	     public void invalidUsernameLogin() {
	    	 driver.findElement(By.name("user-name")).clear();
	    	 driver.findElement(By.name("user-name")).sendKeys("");
	    	 driver.findElement(By.name("password")).clear();
	    	 driver.findElement(By.name("login-button")).click();
	     }
	     
	     @Test
	     public void invalidPasswordLogin() {
	    	 driver.findElement(By.name("user-name")).clear();
	    	 driver.findElement(By.name("password")).clear();
	    	 driver.findElement(By.name("login-button")).click();
	     }
	     
	      @AfterMethod                           
	      public void terminateBrowser(){
	          driver.close();
	      }
	      
	}
