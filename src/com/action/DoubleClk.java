package com.action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement cancelbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancelbtn.click();
		
		WebElement searchBox = driver.findElement(By.name("q"));	
		searchBox.sendKeys("iphone");
		
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.doubleClick(searchBox).perform();
		
		
	}
}
