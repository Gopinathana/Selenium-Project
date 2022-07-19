package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement s1 = driver.findElement(By.id("credit2"));
		WebElement t1 = driver.findElement(By.id("bank"));
		Actions action = new Actions(driver);
		action.dragAndDrop(s1, t1).perform();
		
		WebElement s2 = driver.findElement(By.id("fourth"));
		WebElement t2 = driver.findElement(By.id("amt7"));
		action.dragAndDrop(s2, t2).perform();
		
		WebElement s3 = driver.findElement(By.id("credit1"));
		WebElement t3 = driver.findElement(By.id("loan"));
		action.dragAndDrop(s3, t3).perform();
		
		WebElement s4 = driver.findElement(By.id("fourth"));
		WebElement t4 = driver.findElement(By.id("amt8"));
		action.dragAndDrop(s4, t4).perform();
		
		Thread.sleep(5000);
		WebElement textperfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text = textperfect.getText();
		System.out.println(text);
	}
}
