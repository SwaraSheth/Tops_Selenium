package com.practicelink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class ParaBank {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//by name 
//	driver.findElement(By.name("username")).sendKeys("swara");
//	Thread.sleep(2000);
//	driver.findElement(By.name("password")).sendKeys("Pass@1234");
//	Thread.sleep(2000);
//	driver.findElement(By.cssSelector("input.button")).click();
//	Thread.sleep(2000);
	
	//by CSS
//	driver.findElement(By.cssSelector("input.input")).sendKeys("swara");
//	Thread.sleep(2000);
//	driver.findElement(By.name("password")).sendKeys("Pass@1234");
//	Thread.sleep(2000);
//	driver.findElement(By.cssSelector("input.button")).click();
//	Thread.sleep(2000);
	
	//by attribute
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("swara");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Pass@1234");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	Thread.sleep(2000);
	driver.close();
	
}
}
