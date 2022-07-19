package org.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Bharath Kumar\\\\eclipse-workspace\\\\SeleniumClass\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/entry");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();		
		
		
	}

}
