package org.scrn;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniuJobopne {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement ele = driver.findElement(By.id("heading2011"));
		
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(false);", ele);
		
		
		TakesScreenshot scr = (TakesScreenshot)driver;
	    File s = scr.getScreenshotAs(OutputType.FILE);
	    File d=new File("C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\ScreenShot\\sr.png");
	    FileUtils.copyFile(s, d);
	}
	
}
