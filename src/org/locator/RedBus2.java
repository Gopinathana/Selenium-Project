package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus2 {
public static void main(String[] arg) {
	System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	WebElement from = driver.findElement(By.id("src"));
	from.sendKeys("Chennai");
	
	WebElement to = driver.findElement(By.id("dest"));
	to.sendKeys("Bangalore");
	
	driver.quit();
	
}
}
