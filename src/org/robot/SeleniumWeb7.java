package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SeleniumWeb7 {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
	

		Actions actions = new Actions(driver);
		WebElement selenium = driver.findElement(By.id("heading303"));
		actions.click(selenium).perform();
		WebElement day6 = driver.findElement(By.xpath("(//a[text()=' DAY 6 TASK'])[1]"));
		actions.contextClick(day6).perform();
		
		Robot robot= new Robot();
		for(int i=0;i<6;i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
	}
	   robot.keyPress(KeyEvent.VK_ENTER);	
	   robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
}
