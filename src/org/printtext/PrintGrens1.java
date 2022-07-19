package org.printtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGrens1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("http://greenstech.in/selenium-course-content.html");
	    driver.manage().window().maximize();
	    
//	    WebElement printtext = driver.findElement(By.xpath("//u[contains(text(),'Centers in')]"));
//	    String text = printtext.getText();
//	    System.out.println(text);
	    
	    WebElement findElement = driver.findElement(By.xpath("//span[text()='Overview']"));
	    findElement.click();
	    
	    Thread.sleep(3000);
	    WebElement printtext1 = driver.findElement(By.xpath("//p[contains(text(),'training class will make you an')]"));
	    String text1 = printtext1.getText();
	    System.out.println(text1);
	     	 	
	}
}
