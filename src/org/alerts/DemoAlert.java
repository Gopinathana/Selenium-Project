package org.alerts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Bharath Kumar\\\\eclipse-workspace\\\\SeleniumClass\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement alrtwithTextBx = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alrtwithTextBx.click();
		
		
		WebElement prompBtn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		prompBtn.click();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("gopi");
//		alert.accept();
//		
		
		
	}

}
