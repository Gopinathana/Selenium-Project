package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClous4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		
		WebElement cancelbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancelbtn.click();
		
		WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));

		Actions actions =new Actions(driver);
		actions.moveToElement(home).perform();
		
		Thread.sleep(3000);
		
		WebElement bthItem = driver.findElement(By.xpath("//a[text()='Bath linen']"));
		bthItem.click();
		
		Thread.sleep(3000);
		
		WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Microfiber 380 GSM')]"));
		String textProducr = text.getText();
		System.out.println(textProducr);
		
		
		
	}
}
