package day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Conditionalmeth {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		boolean displaystatus = driver.findElement(By.xpath("//img[@alt='image not displaying']")).isDisplayed();
		System.out.println(displaystatus);
		
		boolean selectstatus = driver.findElement(By.xpath("//input[@value='Male']")).isSelected();
		System.out.println(selectstatus);
		
		boolean enabledstatus = driver.findElement(By.xpath("//input[@id='checkbox3']")).isEnabled();
		System.out.println(enabledstatus);
		
		driver.quit();
		
	}
}
