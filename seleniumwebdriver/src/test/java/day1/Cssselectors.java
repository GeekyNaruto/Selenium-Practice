package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cssselectors {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// tag+id css selector
		
	//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirt");
	//	driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		// tag+class
	//	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Jacket");
		
		//tag+attribute
	//	driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("Jacket");
		
		//tag+class+attribute
		driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("Jacket");

	}

}
