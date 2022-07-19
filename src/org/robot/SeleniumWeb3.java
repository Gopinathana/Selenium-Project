package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SeleniumWeb3 {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
	

		Actions actions = new Actions(driver);
		WebElement findElement = driver.findElement(By.id("heading20"));
		actions.click(findElement).perform();
		
		WebElement cts = driver.findElement(By.xpath("//a[contains(text(),'CTS Interview')]"));
         actions.contextClick(cts).perform();
		
		Robot robot= new Robot();
		for(int i=0;i<6;i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
	}
	robot.keyPress(KeyEvent.VK_ENTER);	
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
}
