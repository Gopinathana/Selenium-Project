package org.printtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactingetVAlues8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement useName = driver.findElement(By.id("username"));
		useName.sendKeys("gopi");
		String s=useName.getAttribute("value");
		System.out.println(s);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("39248");
		String ss=password.getAttribute("value");
		System.out.println(ss);
		driver.quit();
		
		
	}
	
}
