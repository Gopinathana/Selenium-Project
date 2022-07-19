package org.printtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		
		WebElement cancelbtn = driver.findElement(By.id("autocomplete"));
		cancelbtn.sendKeys("mobiles");
		
		WebElement clikbth = driver.findElement(By.xpath("//a[text()='Search']"));
		clikbth.click();
	  
		
		
	}
}
