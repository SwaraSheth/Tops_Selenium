package com.webdriver;
/*
 * XPath in selenium is an XML path used for navigation through the HTML structure of the page
 * it is a syntax or language for finding any element on web page using XML path expression.
 * XPath can be used for both HTPL & XML documents to find the location of any element on a webpage using HTML DOM structure.
 * Two types:
 * 1.absolute XPath-static
 * 2.relative XPath-dynamic
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocXpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	driver.close();
	
}
}
