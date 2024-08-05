package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Adv_UIEle_Popup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	
	driver.get("https://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);	
	
	String main_w=driver.getWindowHandle();
	System.out.println("main window : "+main_w);
	
	driver.findElement(By.linkText("Click Here")).click();
	
	Set<String> all_w=driver.getWindowHandles();
	//System.out.println("all window : "+all_w);
	
	Iterator<String> i1=all_w.iterator();
	while (i1.hasNext()) {
		String Child_W = (String) i1.next();
		System.out.println("Child Wondow : "+Child_W);
		
		if (!Child_W.equals(main_w)) {
			driver.switchTo().window(Child_W);
			Thread.sleep(2000);
			driver.findElement(By.name("emailid")).sendKeys("Swara@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.name("btnLogin")).click();
			Thread.sleep(2000);
			driver.close();
		}
		
	}
	
	driver.switchTo().window(main_w);
	Thread.sleep(2000);
	driver.close();
}
}
