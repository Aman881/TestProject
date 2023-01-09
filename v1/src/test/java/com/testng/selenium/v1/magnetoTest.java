package com.testng.selenium.v1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class magnetoTest {
//	public WebDriver driver;
//	public String testUrl ="https://magento.softwaretestingboard.com/";
//	String driverPath = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";

	
		//pre conditions annotations --starting with before
		@BeforeSuite             //1
		public void setUp() {
			System.out.println("setup system property for the chrome");
		}
		
		@BeforeTest   //2
		public void launchBrowser() {
			System.out.println("launch chrome browser");
		}
		
		@BeforeClass  //3
		public void login(){
			System.out.println("login to app");
//			System.setProperty("webdriver.chrome.driver",driverPath);
//			driver = new ChromeDriver();
//			driver.get(testUrl);
		}
		
		@BeforeMethod  //4
		public void enterURL() {
			System.out.println("@BeforeMethod : Enter the URL");
		}
		
		@Test  //5
		public void titleTest() {
			System.out.println("Testcase 1 : Assert the title of the given web page");
			
		}
		
		@Test
		public void searchTest() {
			System.out.println("Testcase 2 : Search the results Test");
		}
		
		@Test
		public void logoTest() {
			System.out.println("Testcase 3 : Test the logo of the application");
		}
		
		@AfterMethod  //6
		public void logOut() {
			System.out.println("@AfterMethod :logout from application");
		}
		
		@AfterClass //7
		public void closeBrowser() {
			System.out.println("Close the Browser");
//		driver.close();
		}
	
		@AfterTest  //8
		public void deleteAllCookies() {
			System.out.println("Delete all the cookies");
		}
		
//		@AfterSuite  //9
//		public void generateTestReport() {
//		System.out.println("Generate the test report");
//		 	}
}
