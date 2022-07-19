package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTableHead {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();

	WebElement tableData = driver.findElement(By.id("customers"));

	List<WebElement> allth = tableData.findElements(By.tagName("th"));
	for (int i=0; i<allth.size();i++) {
		WebElement ele = allth.get(i);
		String text = ele.getText();
		System.out.println(text);
		
			}
	
	
	
		}
	
	
	
	
	
}

