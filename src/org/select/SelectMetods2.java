package org.select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMetods2 {

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
		 List<WebElement> allop = s.getOptions();
		 for(int i=0; i<allop.size();i++) {
			 WebElement ele = allop.get(i);
			 String text = ele.getText();
			 System.out.println(text);
		 if(i==5) {
			 break;
			 
		 }
		
		 
		 
		 WebElement year = driver.findElement(By.name("birthday_year"));
		 Thread.sleep(5000);
		 Select s1= new Select(year);
		 s1.deselectByIndex(0);
		 
		 
		 WebElement f = s1.getFirstSelectedOption();
		 String text2 = f.getText();
		 System.out.println(text2);
		}
	}	 
				 
				
			}
			
		
	
	
 
