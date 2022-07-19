package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDemo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		userName.sendKeys("gopi");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		password.sendKeys("123");
		
		WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		Address.sendKeys("chennai");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("Go@123");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("123456");
		
		WebElement radio = driver.findElement(By.xpath("//input[@value='Male']"));
		radio.click();
		
		WebElement chkBtn = driver.findElement(By.xpath("//input[@value='Cricket']"));
		chkBtn.click();
		
		WebElement language = driver.findElement(By.xpath("//div[@id='msdd']"));
		language.click();
		WebElement language1 = driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
		language1.click();
		
		WebElement pass = driver.findElement(By.xpath("//input[@ng-model='Password']"));
		pass.sendKeys("tamil");
		
		WebElement conPass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		conPass.sendKeys("tamil");
		
		
		
		driver.quit();
	}
	
}
