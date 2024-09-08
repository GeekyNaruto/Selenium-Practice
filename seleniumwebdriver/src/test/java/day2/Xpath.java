package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// by absolute xpath
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/form[1]/input[1]")).sendKeys("Iphone14");
		
		// by relative xpath
	//	driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	//	driver.findElement(By.xpath("//button[@type='submit'][@class='button-1 search-box-button']")).click();
		driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 search-box-button']")).click();
		
		
		
		
		//driver.quit();
	}
}
