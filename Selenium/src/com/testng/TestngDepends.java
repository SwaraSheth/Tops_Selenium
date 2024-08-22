package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDepends {

WebDriver driver;
	
		@Test
		public void before() throws InterruptedException {
		System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods = {"enterPassword"})
	public void clickLogin() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods = {"before"})
	public void enterLogin() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods =  {"enterLogin"})
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods = {"clickLogin"})
	public void after() throws InterruptedException {
		driver.close();
		Thread.sleep(2000);
	}
}
