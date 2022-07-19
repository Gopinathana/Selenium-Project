package org.printtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement modelRes = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		modelRes.sendKeys("username");
		String tetxUserNAme = modelRes.getAttribute("value");
		System.out.println(tetxUserNAme);
		
		WebElement signin = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		signin.sendKeys("Password");
		String textPass = signin.getAttribute("value");
		System.out.println(textPass);
	    
	}
}
