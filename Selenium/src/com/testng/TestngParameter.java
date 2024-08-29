package com.testng;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngParameter {
  
	WebDriver driver;
	
	@BeforeTest
	public void before() throws InterruptedException {
		System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
  }
	
	@Test
	@org.testng.annotations.Parameters({"username","password"})
	public void login1(String username,String password) throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	
	
	
	@AfterTest
	public void after() throws InterruptedException {
		driver.close();
		Thread.sleep(2000);
	}
}
