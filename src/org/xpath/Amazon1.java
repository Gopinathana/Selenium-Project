package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement useName = driver.findElement(By.xpath("//input[@type='text']"));
		useName.click();
		useName.sendKeys("iphone");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchBox.click();
		
		
		driver.quit();
		
		
	}
}
