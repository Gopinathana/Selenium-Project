package com.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensChennai {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement txtBox = driver.findElement(By.xpath("//span[text()='Overview']"));
		txtBox.click();
		Thread.sleep(5000);
		WebElement text = driver.findElement(By.xpath("//p[contains(text(),'make you an expert in Selenium')]"));
		String text2 = text.getText();
		
		
		System.out.println(text2);
	}
}