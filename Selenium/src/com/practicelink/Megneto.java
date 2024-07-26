package practicelink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Megneto {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
	
	driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.id("email")).sendKeys("Swarasheth09@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("Pass@1234");
	Thread.sleep(2000);
	driver.findElement(By.id("send2")).click();
	Thread.sleep(2000);
	
	driver.close();
}
}
