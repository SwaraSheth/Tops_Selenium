package com.practicelink;

import java.util.ResourceBundle.Control;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class DemoQA_Element {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();

	driver.get("https://demoqa.com/elements");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']")).click();
//	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Swara Shah");
	Actions actions=new Actions(driver);
	
	WebElement fullName=driver.findElement(By.xpath("//input[@id='userName']"));
	WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
	WebElement c_address=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	WebElement p_address=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
	
	org.openqa.selenium.interactions.Action a1=actions.moveToElement(fullName).click().sendKeys("Swara Shah").build();
	a1.perform();
	Thread.sleep(2000);
	org.openqa.selenium.interactions.Action a2=actions.moveToElement(email).click().sendKeys("Swarasheth09@gmail.com").build();
	a2.perform();
	Thread.sleep(2000);
	org.openqa.selenium.interactions.Action a3=actions.moveToElement(c_address).click().sendKeys("Gauravpath road,surat").
			keyDown(Keys.CONTROL).sendKeys("a","c").keyUp(Keys.CONTROL).build();
	a3.perform();
	Thread.sleep(2000);
	org.openqa.selenium.interactions.Action a4=actions.moveToElement(p_address).click().
			keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build();
	a4.perform();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id='submit']")).click();
	
	
//	driver.close();
}

}
