package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy6 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	driver.manage().window().maximize();
	
	WebElement textBox = driver.findElement(By.id("location"));
	textBox.sendKeys("Chennai");
	
	//driver.quit();
}
}
