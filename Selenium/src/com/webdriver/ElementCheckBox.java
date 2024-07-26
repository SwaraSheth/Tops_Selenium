package com.webdriver;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementCheckBox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();

	driver.get("https://demo.guru99.com/test/radio.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	for (int i = 0; i < 3; i++) {
		driver.findElement(By.id("vfb-6-"+i)).click();
		Thread.sleep(2000);
	}
	
	for (int i = 1; i < 4; i++) {
		driver.findElement(By.id("vfb-7-"+i)).click();
		Thread.sleep(2000);
	}
	
	driver.close();
}
}
