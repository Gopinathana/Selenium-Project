package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemo9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("gopi@123gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("1234875");
		
		WebElement language = driver.findElement(By.id("msdd"));
		language.sendKeys("tamil");
		
		WebElement password = driver.findElement(By.id("firstpassword"));
		password.sendKeys("pass");
		
		WebElement conpassword = driver.findElement(By.id("secondpassword"));
		conpassword.sendKeys("pass");
		
		driver.quit();
	}
}
