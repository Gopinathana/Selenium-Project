package org.windows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone 13 pro max", Keys.ENTER);

		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro Max (512GB) - Gold']")).click();

		// to get the parent window id
		String parentwindowsid = driver.getWindowHandle();
		System.out.println(parentwindowsid);

		Set<String> allwindowid = driver.getWindowHandles();
		System.out.println(allwindowid);

		for (String x : allwindowid) {

			if (!parentwindowsid.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		driver.findElement(By.id("add-to-cart-button")).click();

		driver.switchTo().window(parentwindowsid);

		driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 Pro Max (256GB) - Sierra Blue'])[1]")).click();

		Set<String> allwindowsid2 = driver.getWindowHandles();
		System.out.println(allwindowsid2);

//		for (String y : allwindowsid2) {
//
//			if (!allwindowid.equals(y)) {
//
//				driver.switchTo().window(y);
		
		List<String> li = new LinkedList<>();
		li.addAll(allwindowsid2);
		
		String string = li.get(2);
		System.out.println(string);
		driver.switchTo().window(string);

			}

	
	}

