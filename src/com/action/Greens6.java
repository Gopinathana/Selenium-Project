package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement course = driver.findElement(By.className("header-browse-greens"));
		Actions actions= new Actions(driver);
		actions.moveToElement(course).perform();
		Thread.sleep(3000);
		
		WebElement selenium = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		Thread.sleep(3000);
		actions.moveToElement(selenium).perform();
		
		
		
		WebElement click = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		Thread.sleep(3000);
		click.click();
		
		driver.quit();
		
		Thread.sleep(3000);
		WebDriver driver1=new ChromeDriver();
		
		driver1.navigate().to("http://greenstech.in/selenium-course-content.html");
		
		driver1.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement course2 = driver1.findElement(By.className("header-browse-greens"));
		Actions actions2= new Actions(driver1);
		actions2.moveToElement(course2).perform();
		Thread.sleep(3000);
		
		WebElement oracle = driver1.findElement(By.xpath("//span[text()='Oracle (48)']"));
		actions2.moveToElement(oracle).perform();
		
		
		WebElement oracle2 = driver1.findElement(By.xpath("//span[text()='SQL Certification Training']"));
		actions2.moveToElement(oracle2).perform();
		Thread.sleep(3000);
		oracle2.click();
		
        driver1.quit();
		
        
		Thread.sleep(1000);
		
		WebDriver driver2=new ChromeDriver();
		driver2.navigate().to("http://greenstech.in/selenium-course-content.html");
		
		driver2.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement course3 = driver2.findElement(By.className("header-browse-greens"));
		Actions actions3= new Actions(driver2);
		actions3.moveToElement(course3).perform();
		Thread.sleep(3000);
		
		WebElement dataWareHouse = driver2.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		actions3.moveToElement(dataWareHouse).perform();
		Thread.sleep(3000);
		
		WebElement firstCourse = driver2.findElement(By.xpath("//span[text()='Informatica Certification Training']"));
		firstCourse.click();
		
		
        driver2.quit();
		
        
        
      //RPA Course
		Thread.sleep(1000);
		WebDriver driver3=new ChromeDriver();
		driver3.navigate().to("http://greenstech.in/selenium-course-content.html");
		
		driver3.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement course4 = driver3.findElement(By.className("header-browse-greens"));
		Actions actions4= new Actions(driver3);
		actions4.moveToElement(course4).perform();
		Thread.sleep(3000);
		
		WebElement rpa = driver3.findElement(By.xpath("//span[text()='RPA (6)']"));
		actions4.moveToElement(rpa).perform();
		
		
		WebElement blue = driver3.findElement(By.xpath("//span[contains(text(),'Blue Prism')]"));
		blue.click();
		
	}
}
