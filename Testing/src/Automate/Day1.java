package Automate;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	
	WebDriver driver;
	
	public void verifyHomepage() {
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.saucedemo.com/");
		driver.navigate().refresh();
		
		String expected ="Swag Labs";
		String actual = driver.getTitle();
		
		if(expected.equals(actual)==true) {
			System.out.println("The test is passed");
		}
		else {
			System.out.println("The test is failed");
		}
	}catch(Exception e) {
		e.printStackTrace();
		}
//		driver.close();
	}
	
	public void Login() {
		try {
		// Login with valid user
//			JavascriptExecutor jse = (JavascriptExecutor) driver;
//			jse.executeScript("document.getElementById('user-name').value='standard-user';");
		WebElement username = driver.findElement(By.name("user-name"));
		username.clear();
		username.click();
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.click();
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.id("login-button"));
		submit.submit();
		Thread.sleep(5000);
		System.out.println("User is logged in to the secret sauce");
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
	
	public void newTest() {
	 System.out.println(driver.getClass());
	 System.out.println(driver.getTitle());
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getPageSource());
//	 driver.getText();
//	 driver.getAttribute();
	 System.out.println(driver.getWindowHandle());
	 System.out.println(driver.getWindowHandles());
	}

	public static void main(String[] args) {
		Day1 myObj = new Day1();
		myObj.verifyHomepage();
		myObj.Login();
		myObj.newTest();
		
//		Day1 login = new Day1();
//		login.Login();
	}
}
