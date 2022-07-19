package org.scrn;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHome {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		TakesScreenshot scr = (TakesScreenshot)driver;
	    File s = scr.getScreenshotAs(OutputType.FILE);
	    File d=new File("C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\ScreenShot\\sr.png");
	    FileUtils.copyFile(s, d);
	}
	
}
