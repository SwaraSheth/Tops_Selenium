package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstDemo {
public static void main(String[] args) throws InterruptedException {
	//Edge browser setup
	//System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	
	//Chrome browser setup
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
	
	//to open empty browser
	//WebDriver driver=new EdgeDriver();
	WebDriver driver=new ChromeDriver();
	
	//to open website
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	
	System.out.println("Url is : "+driver.getCurrentUrl());
	Thread.sleep(2000);
	System.out.println("Title is : "+driver.getTitle());
	
	//driver.close();//to close a tab
	
	driver.quit();//to close browser
	
}
}
