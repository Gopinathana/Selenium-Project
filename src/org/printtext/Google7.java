package org.printtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    
	    WebElement printtext = driver.findElement(By.name("q"));
	    printtext.sendKeys("greens velmurugan");
	    
	}
}
