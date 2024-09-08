package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Orangehrm {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@placeholder='Username'][@name='username']")).sendKeys("Admin"); 
	
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.quit();
  }
}
