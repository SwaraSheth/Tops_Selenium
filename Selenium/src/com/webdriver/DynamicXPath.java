package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicXPath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/selenium-xpath.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//tagname[@attr_name='attr_value']
	
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
	
	//tagname[text()='text_value']
	
	String msg= driver.findElement(By.xpath("//b[text()='Testing']")).getText();
	System.out.println("Text is : "+msg);
	
	Thread.sleep(2000);
	driver.close();
	

}
}
