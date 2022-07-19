package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FlipKart10 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
		WebElement cancelbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancelbtn.click();
		
		Thread.sleep(5000);

		WebElement modelRes = driver.findElement(By.xpath("//div[text()='Mobiles']"));
//		Actions actions = new Actions(driver);
//		actions.contextClick(modelRes);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", modelRes);
		

		Robot robot= new Robot();
		for(int i=0;i<3;i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
	}
	   robot.keyPress(KeyEvent.VK_ENTER);	
	   robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
}