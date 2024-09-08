package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Opencart {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		// by name
		driver.findElement(By.name("search")).sendKeys("mac");
		
		//by id
		Boolean logo = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logo);
		
		//by linktext & partial linktest
       // driver.findElement(By.linkText("Tablets")).click();
		
	//	driver.findElement(By.partialLinkText("Tab")).click();
		
		//by class
		
		 List<WebElement> hyperlinks = driver.findElements(By.className("list-inline-item"));
		 System.out.println("no of hyperlinks are: "+hyperlinks.size());
		 
		//by tagname
		
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links are: "+totallinks.size());
		
	}

}
