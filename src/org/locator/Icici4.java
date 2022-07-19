package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	
	WebElement clk = driver.findElement(By.id("DUMMY1"));
	clk.click();
	
	WebElement userName = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	userName.sendKeys("gopianandh");
	
	WebElement password = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
	password.sendKeys("gopi@1234");
	
	Thread.sleep(3000);
	
	driver.quit();
	
}
}
