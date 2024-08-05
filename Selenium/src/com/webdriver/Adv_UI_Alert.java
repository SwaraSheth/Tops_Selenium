package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * An Alert in Selenium is a small message box which appears on screen to give the user some information or notification. 
 * It notifies the user with some specific information or error, asks for permission to perform certain tasks and 
 * it also provides warning messages as well.
 * 
 *Types of Alerts in Selenium
1) Simple Alert
The simple alert class in Selenium displays some information or warning on the screen.
2) Prompt Alert
This Prompt Alert asks some input from the user and Selenium webdriver can enter the text using sendkeys(” input…. “).
3) Confirmation Alert
This confirmation alert asks permission to do some type of operation.

 */

public class Adv_UI_Alert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);	
	
	driver.findElement(By.name("cusid")).sendKeys("123");
	Thread.sleep(2000);
	
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	
	Alert a1=driver.switchTo().alert();
	System.out.println("Alert msg is : "+a1.getText());
	
	//a1.dismiss();
	a1.accept();
	Thread.sleep(2000);
	
	Alert a2=driver.switchTo().alert();
	System.out.println("Alert msg is : "+a2.getText());
	a2.accept();
	Thread.sleep(2000);
	
	driver.close();
	
}
}
