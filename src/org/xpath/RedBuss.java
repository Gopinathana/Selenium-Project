package org.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBuss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebElement downbtn = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		downbtn.click();
		
		Thread.sleep(5000);
		WebElement signin = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
		signin.click();
		
		
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(ele);
		
		WebElement phone = driver.findElement(By.id("mobileNoInp"));
		phone.sendKeys("983245698743");
		
		
	}}