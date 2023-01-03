package Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
        String baseUrl = "http://www.google.com/";
        String expectedTitle = "Google";
        String actualTitle = "";

		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		/*
		 * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.click();
        textBox.clear();
        textBox.sendKeys("Google");
        WebElement submitButton = driver.findElement(By.name("btnK"));
        submitButton.click();
        driver.close();
	}

}
