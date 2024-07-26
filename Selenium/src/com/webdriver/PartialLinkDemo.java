package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PartialLinkDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	//driver.get("file:///C:\\Users\\hp\\eclipse-workspace\\Selenium\\src\\com\\webdriver\\Index1.html");
	driver.get("https://www.geeksforgeeks.org/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//driver.findElement(By.partialLinkText("Click")).click();
	driver.findElement(By.partialLinkText("C")).click();
	Thread.sleep(2000);
	
	driver.close();
}
}
