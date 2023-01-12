package com.testng.selenium.v1;

	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;
	public class firsttestngfile {
	    public String baseUrl = "https://www.saucedemo.com/";
	    String driverPath = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	    public WebDriver driver ; 
	    
	    @BeforeMethod
	      public void launchBrowser() {
	          System.out.println("launching chrome browser"); 
	          System.setProperty("webdriver.chrome.driver", driverPath);
	          driver = new ChromeDriver();
	          driver.get(baseUrl);
	      }
	     
	      @Test                                //Testcase1
	      public void verifyHomepageTitle() {
	    	  System.out.println("Check the test cases as expected");
	          String expectedTitle = "Swag Labs";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle,expectedTitle);
	     }
	      
	     @Test									//Testcase2
	     public void validLogin() {
	    	 try {
	    	 System.out.println("Login with valid username and valid password");
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
	         Thread.sleep(5000);
	         Alert alert=driver.switchTo().alert();
	         String alertMessage=driver.switchTo().alert().getText();
	         System.out.println(alertMessage);
	         Thread.sleep(5000);
	         alert.accept();
	    	 }
	    	 catch(Exception e) {
	    			e.printStackTrace();
	    	 }
	    	 }
	         
	     
	     @Test
	     public void invalidEmptyLogin() {
	    	 System.out.println("Login with empty credentials");
	    	 try {
	    	 driver.findElement(By.name("user-name")).clear();
	    	 driver.findElement(By.name("password")).clear();
	    	 driver.findElement(By.name("login-button")).click();
	    	 Alert alert=driver.switchTo().alert();
	         String alertMessage=driver.switchTo().alert().getText();
	         System.out.println(alertMessage);
	         Thread.sleep(5000);
	         alert.accept();
	    	 }catch(Exception e) {
	    			e.printStackTrace();
	    	 }
	     }
	     
	     @Test
	     public void invalidUsernameLogin() {
	    	 try {
	    	 System.out.println("login with invalid username");
	    	 driver.findElement(By.name("user-name")).clear();
	    	 driver.findElement(By.name("user-name")).sendKeys("abc");
	    	 driver.findElement(By.name("password")).clear();
	    	 driver.findElement(By.name("login-button")).click();
	    	 Alert alert=driver.switchTo().alert();
	         String alertMessage=driver.switchTo().alert().getText();
	         System.out.println(alertMessage);
	         Thread.sleep(5000);
	         alert.accept();
	    	 }
	    	 catch(Exception e) {
	    		 e.printStackTrace();
	    	 }
	     }
	     
	     @Test
	     public void invalidPasswordLogin() {
	    	 try {
	    	 WebElement userName = driver.findElement(By.name("user-name"));
	    	 userName.clear();
	    	 userName.sendKeys("standard-user");
	    	 WebElement password = driver.findElement(By.name("password"));
	    	 password.clear();
	    	 password.sendKeys("invalid");
	    	 driver.findElement(By.name("login-button")).click();
	    	 Alert alert=driver.switchTo().alert();
	         String alertMessage=driver.switchTo().alert().getText();
	         System.out.println(alertMessage);
	         Thread.sleep(5000);
	         alert.accept();
	    	 }
	    	 catch(Exception e) {
	    		 e.printStackTrace();
	    	 }
	     }
	     
	      @AfterMethod                           
	      public void terminateBrowser(){
	          driver.close();
	      }
	      
	}
