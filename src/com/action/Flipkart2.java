package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement cancelbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancelbtn.click();
		
		Thread.sleep(5000);
		WebElement movetoTesxt = driver.findElement(By.xpath("//div[text()='Electronics']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(movetoTesxt).perform();
		Thread.sleep(5000);
		
		WebElement lapAndDesk = driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
		actions.moveToElement(lapAndDesk);
		Thread.sleep(5000);
		
		WebElement clickLapts = driver.findElement(By.xpath("(//a[text()='Laptops'])[1]"));
		clickLapts.click();
		
		Thread.sleep(5000);
		WebElement textprnt = driver.findElement(By.xpath("//a[@href=\"https://seller.flipkart.com/?utm_source=fkwebsite&utm_medium=websitedirect\"]"));
		String text = textprnt.getText();
		System.out.println(text);
	}
}
