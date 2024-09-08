package day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Explicit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement user = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		user.sendKeys("Admin");
		
		WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		
		WebElement button = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		button.click();

	}

}
