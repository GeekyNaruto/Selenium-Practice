package day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		driver.switchTo().alert().sendKeys("hero");
		driver.switchTo().alert().accept();
		
	}

}
