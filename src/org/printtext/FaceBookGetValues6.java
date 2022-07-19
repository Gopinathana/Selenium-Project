package org.printtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookGetValues6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("gopi");
		String s=userName.getAttribute("value");
		System.out.println(s);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("1234");
		String ss=password.getAttribute("value");
		System.out.println(ss);
		
	    
	}
}
