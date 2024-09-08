package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
 

public class Amazon {
	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	//input[@type='text'][@id='twotabsearchtextbox']  
	
	driver.findElement(By.xpath("//input[@type='text'][@id='twotabsearchtextbox']")).sendKeys("Iphone 15");
	
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
  }

}
