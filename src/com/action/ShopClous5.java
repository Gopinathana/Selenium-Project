package com.action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClous5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		a.dismiss();
	
		
		WebElement cancelbtn = driver.findElement(By.id("nav_45"));
		cancelbtn.click();
		
		WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));

		Actions actions =new Actions(driver);
		actions.moveToElement(home).perform();
		
		Thread.sleep(3000);
		
		WebElement bthItem = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		bthItem.click();
		
		Thread.sleep(3000);
		
		
		
	}
}
