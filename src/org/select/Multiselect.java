package org.select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jsbin.com/osebed/2/edit?css,js,output");		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//select[@id='fruits']"));

		
		Select select = new Select(e);
		boolean multiple = select.isMultiple();
		System.out.println(multiple);
		
				
			}
			
		
}
