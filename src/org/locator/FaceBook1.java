package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("gopi");
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("1234");
	
	WebElement attributvalue = driver.findElement(By.xpath("//input[@id='email']"));
	attributvalue.getAttribute("class");
	
	//driver.quit();
}
}
