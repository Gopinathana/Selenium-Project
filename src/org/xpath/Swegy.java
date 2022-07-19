package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Swegy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		signin.click();
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='mobile']"));
		phone.sendKeys("1243252543");
		
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("gopi");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("gg@123");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("g@123");
		
		WebElement login = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		login.click();
		
	}}