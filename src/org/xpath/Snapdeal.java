package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		
		driver.manage().window().maximize();
		
		WebElement txtBox = driver.findElement(By.xpath("//input[@type='text']"));
		txtBox.sendKeys("chennai");;
		
		WebElement signin = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		signin.click();
		
	}}