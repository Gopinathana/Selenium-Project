package org.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Bharath Kumar\\\\eclipse-workspace\\\\SeleniumClass\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement alrtwithTextBx = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		alrtwithTextBx.click();
		
		
		WebElement prompBtn = driver.findElement(By.xpath("//button[contains(text(),'display an  ')]"));
		prompBtn.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(3000);
		
		
		WebElement welcome = driver.findElement(By.id("demo1"));
		String text = welcome.getText();
		
		System.out.println(text);
		
		
		
	}

}
