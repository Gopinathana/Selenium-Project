package org.select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMetods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");		
		driver.manage().window().maximize();
		
		
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 Thread.sleep(3000);
		 WebElement date = driver.findElement(By.id("day"));
		 
		 //to select particular value
		 Select s= new Select(date);
		 s.selectByValue("19");
		 
		 WebElement year = driver.findElement(By.name("birthday_year"));
		 Thread.sleep(5000);
		 Select s1= new Select(year);
		 s1.selectByVisibleText("2020");
		 	
		 s.selectByIndex(11);
		
		 List<WebElement> allOpt = s1.getOptions();
		 
			 
			for (int i=0; i<allOpt.size(); i++) {
				
				WebElement x = allOpt.get(i);
			 String text = x.getText();
			 System.out.println(text);
			 
			 List<WebElement> allsel = s.getAllSelectedOptions();
			 for (WebElement x1 : allsel) {
				 String text2 = x1.getText();
				 System.out.println(text2);
				 
				 
				 
				 
						 
				 
				
			}
			
		} 
	}
	
}
