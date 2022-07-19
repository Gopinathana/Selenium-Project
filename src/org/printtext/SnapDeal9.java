package org.printtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement useName = driver.findElement(By.id("inputValEnter"));
		useName.sendKeys("iphone");
		
		WebElement clickbtn = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		clickbtn.click();
		
		
		
		
	}
	
}
