package org.daynine;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NinethDay {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement dateBox = driver.findElement(By.id("dateOfBirthInput"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", dateBox);
		
	    dateBox.click();
	    
	    

//	    
//	    WebElement yearBox = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
//	    Select select = new Select();
	   
	    
	    
	    
		
		
	}
}
