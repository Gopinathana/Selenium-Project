package org.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Bharath Kumar\\\\eclipse-workspace\\\\SeleniumClass\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement alrtwithTextBx = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]"));
		alrtwithTextBx.click();
		
		
		WebElement prompBtn = driver.findElement(By.xpath("//button[contains(text(),'display a confir')]"));
		prompBtn.click();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		Thread.sleep(3000);
		
		
		
		
	}

}
