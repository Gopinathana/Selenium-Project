package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Toolsqa4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("gopi");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("anandh");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("gopi@123");
		
		WebElement gender = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
		gender.click();
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='userNumber']"));
		phone.sendKeys("123456");
		
//		Thread.sleep(5000);
//		WebElement subject = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
//        subject.sendKeys("greens");
		
		WebElement sports = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
		sports.click();
		
		
		
		WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		address.click();
		
		
		
//		driver.quit();
	}
}
