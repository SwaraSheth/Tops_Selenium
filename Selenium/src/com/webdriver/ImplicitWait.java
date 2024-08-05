package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.saucedemo.com/");
	/*
	 * The Implicit wait in selenium is used to tell the web driver to wait for creation amount of time before it throws a 
	 * "No such element exception".
	 */
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	
	driver.close();
}
}
