package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateGoogleacc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement sigin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		sigin.click();
		
		WebElement registerbtn = driver.findElement(By.xpath("//span[@class=' newUserRegister']"));
		registerbtn.click();
		
		WebElement phone = driver.findElement(By.xpath("//input[@name='username']"));
		phone.sendKeys("1234567");
		
		
		WebElement okbtn = driver.findElement(By.xpath("//button[@id='checkUser']"));
		okbtn.click();
		
		//driver.quit();
	}
	
}
