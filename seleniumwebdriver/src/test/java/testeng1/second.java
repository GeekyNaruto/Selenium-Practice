package testeng1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class second {
	
	WebDriver driver = new ChromeDriver();
	@BeforeTest 
	void open() throws InterruptedException
	{
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	void search() throws InterruptedException
	{
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Rose"+Keys.ENTER);
		Thread.sleep(2000);
	}
 
	@AfterTest
	void close() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.quit();
	}
}
