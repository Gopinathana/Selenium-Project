package com.action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepots11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		Alert alert=driver.switchTo().alert();
//		alert.dismiss();
		
		WebElement course = driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions actions= new Actions(driver);
		actions.moveToElement(course).perform();
		Thread.sleep(3000);
		
		WebElement selenium = driver.findElement(By.xpath("//a[text()='Paint']"));
		Thread.sleep(3000);
		actions.moveToElement(selenium).perform();
		
		
		WebElement interior = driver.findElement(By.xpath("(//a[text()='Interior Paint'])[1]"));
		Thread.sleep(3000);
		actions.moveToElement(interior).perform();
		
		Thread.sleep(3000	);
		WebElement interiorpaint = driver.findElement(By.xpath("(//a[text()='Interior Paint'])[2]"));
		interiorpaint.click();
	}
}
