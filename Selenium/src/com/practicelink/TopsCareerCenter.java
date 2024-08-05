package com.practicelink;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TopsCareerCenter {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();

	driver.get("https://careercenter.tops-int.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	Actions actions=new Actions(driver);
	
	WebElement mobile=driver.findElement(By.id("mobile"));
	WebElement password=driver.findElement(By.id("password"));
	
	
	Action a1=actions.moveToElement(mobile)
			.click()
			.sendKeys("9429555234")
			.keyDown(Keys.CONTROL)
			.sendKeys("a","c")
			.build();
	
	a1.perform();
	
	Thread.sleep(2000);
	
	Action a2=actions.moveToElement(password)
			.click()
			.keyDown(Keys.CONTROL)
			.sendKeys("v")
			.keyUp(Keys.CONTROL)
			.build();
	
	a2.perform();
	
	Thread.sleep(2000);
	
	driver.close();
		
}
}
