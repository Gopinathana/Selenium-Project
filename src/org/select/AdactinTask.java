package org.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinTask {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Bharath Kumar\\eclipse-workspace\\SeleniumClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Greens8767");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("QN8V3A");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		
		WebElement location = driver.findElement(By.id("location"));
		Select select = new Select(location);
		select.selectByValue("Sydney");
		
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select select1 = new Select(hotels);
		select1.selectByValue("Hotel Creek");

		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select select2 = new Select(roomType);
		select2.selectByValue("Standard");
		
		
		WebElement nofRoom = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(nofRoom);
		select3.selectByValue("2");
		
		
		WebElement chkIN = driver.findElement(By.id("datepick_in"));
		chkIN.sendKeys("09/07/2022");
		
		WebElement chkOut = driver.findElement(By.id("datepick_out"));
		chkOut.sendKeys("10/07/2022");
		
		
		WebElement adultno = driver.findElement(By.id("adult_room"));
		Select select4 = new Select(adultno);
		select4.selectByValue("2");
		
		WebElement cheltno = driver.findElement(By.id("child_room"));
		Select select5 = new Select(cheltno);
		select5.selectByValue("2");
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		WebElement radbtn = driver.findElement(By.id("radiobutton_0"));
		radbtn.click();
		
		WebElement continu = driver.findElement(By.id("continue"));
		continu.click();
		
		WebElement firtsName = driver.findElement(By.id("first_name"));
		firtsName.sendKeys("firstname");
		
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("lastname");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("chennai");
		
		WebElement crdDetail = driver.findElement(By.id("cc_num"));
		crdDetail.sendKeys("2345654327892345");
		
		
		WebElement crdType = driver.findElement(By.id("cc_type"));
		Select select6 = new Select(crdType);
		select6.selectByValue("VISA");
		
		WebElement expmnt = driver.findElement(By.id("cc_exp_month"));
		Select select7 = new Select(expmnt);
		select7.selectByVisibleText("December");
		
		
		WebElement expyer = driver.findElement(By.id("cc_exp_year"));
		Select select8 = new Select(expyer);
		select8.selectByVisibleText("2022");
		
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("234");
		
		WebElement bookNow = driver.findElement(By.id("book_now"));
		bookNow.click();
		
		Thread.sleep(5000);
		WebElement orderId = driver.findElement(By.id("order_no"));
		String text = orderId.getAttribute("value");
		System.out.println(text);
	}
	
}
