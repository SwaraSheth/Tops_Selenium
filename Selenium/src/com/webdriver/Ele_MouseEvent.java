package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

/*
 * 
 */
public class Ele_MouseEvent {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement home=driver.findElement(By.linkText("Home"));
	WebElement flight=driver.findElement(By.linkText("Flights"));
	WebElement hotel=driver.findElement(By.linkText("Hotels"));
	
	Actions	actions=new Actions(driver);
	
	Action a1=actions.moveToElement(home).build();
	a1.perform();
	Thread.sleep(2000);
	
	Action a2=actions.moveToElement(hotel).build();
	a2.perform();
	Thread.sleep(2000);
	
	Action a3=actions.moveToElement(flight).build();
	a3.perform();
	Thread.sleep(2000);
	
	driver.close();
	
}
}
