package practicelink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Swara@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[value='1']")).click();
	Thread.sleep(30000);
	
	driver.close();
}
}
