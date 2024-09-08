package day8;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascriptexecu {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// instead of using sendkeys
		WebElement name = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].setAttribute('value','John')", name);
		
		// click function using 
		
		WebElement search = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		js.executeScript("arguments[0].setAttribute('value','Cat')", search);
		
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("arguments[0].click()", button);
		
		// scroll
		//by pixel
	//	js.executeScript("window.scrollBy(0,600)");
		
		//scroll till end of document
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//scroll to top of document
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		// scroll till webelement is visisble
	//	WebElement table = driver.findElement(By.xpath("//h2[normalize-space()='Web Table']"));
	//	js.executeScript("arguments[0].scrollIntoView()",table);
		System.out.println(js.executeScript("return window.pageYOffset;"));
	}

}
