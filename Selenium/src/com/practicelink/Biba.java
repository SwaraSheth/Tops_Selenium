package com.practicelink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Biba {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
	
	driver.get("https://apps.kitomba.com/bookings/bibasouthyarra");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.id("email")).sendKeys("Swarasheth09@gmail.com");
	Thread.sleep(2000);
	
	driver.close();
	
}
}
