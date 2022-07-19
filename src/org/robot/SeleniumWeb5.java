package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SeleniumWeb5 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
	

		Actions actions = new Actions(driver);
		WebElement findElement = driver.findElement(By.id("heading201"));
		actions.click(findElement).perform();
		WebElement resume4 = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
		actions.contextClick(resume4).perform();
		
		Robot robot= new Robot();
		for(int i=0;i<4;i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
	}
	   robot.keyPress(KeyEvent.VK_ENTER);	
	   robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
}
