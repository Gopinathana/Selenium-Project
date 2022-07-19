package org.navigat;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				URL url = new URL("https://www.facebook.com/");
				driver.navigate().to(url);
				driver.navigate().back();
				driver.navigate().forward();
				driver.navigate().refresh();
				
	}
	
}
