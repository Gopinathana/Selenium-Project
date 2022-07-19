package org.printtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWithVel2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("http://greenstech.in/selenium-course-content.html#");
	    driver.manage().window().maximize();
	    
	    WebElement clktranine = driver.findElement(By.xpath("//span[@title='Trainer']"));
	    clktranine.click();
	    
	    WebElement printtext = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan currently')]"));
	    String text = printtext.getText();
	    System.out.println(text);
	}
}
