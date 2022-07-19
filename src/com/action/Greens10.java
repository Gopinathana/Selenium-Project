package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement course = driver.findElement(By.className("header-browse-greens"));
		Actions actions= new Actions(driver);
		actions.moveToElement(course).perform();
		Thread.sleep(3000);
		
		WebElement selenium = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		Thread.sleep(3000);
		actions.moveToElement(selenium).perform();
	
		
	}
}
