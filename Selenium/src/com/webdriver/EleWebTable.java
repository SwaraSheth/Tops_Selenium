package com.webdriver;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EleWebTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("file:///C:\\Users\\hp\\git\\repository3\\Selenium\\src\\com\\webdriver\\Index2.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	for (int i = 2; i <= 5; i++) {
		for (int j = 1; j <= 4; j++) {
			String data=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(" | "+data);
		}
		System.out.println();
		Thread.sleep(2000);
	}
	
}
}
