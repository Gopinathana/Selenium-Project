package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement useName = driver.findElement(By.id("username"));
		useName.sendKeys("gopi");
		
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("gopi");
		
		driver.quit();
		
		
	}
	
}
