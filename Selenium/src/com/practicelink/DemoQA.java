package com.practicelink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoQA {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();

	driver.get("https://demoqa.com/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.id("userName")).sendKeys("Swara");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("Pass@1234");
	Thread.sleep(2000);
	driver.findElement(By.id("login")).click();
	Thread.sleep(2000);
}
}
