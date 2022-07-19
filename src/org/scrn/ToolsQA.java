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
import org.openqa.selenium.interactions.Actions;

public class ToolsQA {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		WebElement ex = driver.findElement(By.xpath("//div[text()='Recent Tutorials']"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
Object scre = executor.executeScript("arguments[0].scroolIntoview(false)", ex);
		
		TakesScreenshot scr = (TakesScreenshot)driver;
	    File s = scr.getScreenshotAs(OutputType.FILE);
	    File d=new File("C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\ScreenShot\\tqa.png");
	    FileUtils.copyFile(s, d);
	}
	
}
