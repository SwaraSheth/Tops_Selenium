package com.webdriver;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ele_KeyBoard {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement email=driver.findElement(By.name("email"));
	
	Actions actions=new Actions(driver);
	
	Action a1=actions.moveToElement(email)
			.keyDown(email, Keys.SHIFT)
			.sendKeys("swara")
			.keyUp(email,Keys.SHIFT)
			.doubleClick()
			.contextClick()
			.build();
	
	a1.perform();
	Thread.sleep(2000);
	
	driver.close();
}
}
