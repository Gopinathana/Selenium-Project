package com.web;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesAuto {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		WebElement tableData = driver.findElement(By.id("customers"));

		List<WebElement> allRow = tableData.findElements(By.tagName("tr"));
		
		for (int i=0; i<allRow.size(); i++) {
			WebElement rows = allRow.get(i);
			
			List<WebElement> datas = rows.findElements(By.tagName("td"));
			for(int j=0; j<datas.size();j++) {
					
				WebElement allDta = datas.get(j);
				String text = allDta.getText();
				System.out.println(text);
				
				
			}
			
			
			
		}
	}

}
