package org.printtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAddress3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("http://greenstech.in/selenium-course-content.html#");
	    driver.manage().window().maximize();
	    
	    WebElement clktranine = driver.findElement(By.xpath("(//ul[@class='address'])[2]"));
	    String text = clktranine.getText();
	    System.out.println(text);
	    
	    
	}
}
