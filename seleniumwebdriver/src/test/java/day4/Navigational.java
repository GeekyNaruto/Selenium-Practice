package day4;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Navigational {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();

	}

}
