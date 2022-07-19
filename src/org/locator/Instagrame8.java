package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagrame8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		
		Thread.sleep(5000);
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("gopi_silent_killer");
		
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("gopi@1234");
		
		
		//driver.quit();
		
		
	}
}
