package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/ ");
		Thread.sleep(3000);

		driver.manage().window().maximize();

		driver.switchTo().frame("login_page");
        WebElement ele = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
        ele.sendKeys("i3j3");
	}
}
