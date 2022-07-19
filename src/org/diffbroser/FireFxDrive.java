package org.diffbroser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFxDrive {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		
	}
	
}
