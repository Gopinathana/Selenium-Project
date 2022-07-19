package org.javascrpt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Argument;

public class JavaScrptExc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		WebElement email=driver.findElement(By.id("email"));
		
		JavascriptExecutor exe= (JavascriptExecutor)driver;
		exe.executeScript("argument[0].setAttribute('value','gopi')", email);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
