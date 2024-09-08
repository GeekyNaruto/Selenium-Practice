package day6;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practicedropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select obj = new Select(drop);
		
		//obj.selectByVisibleText("India");
		//obj.selectByIndex(5);
		
		for(WebElement dropd:obj.getOptions())   // for printing all options of dropdown
		{
			System.out.println(dropd.getText());
		}

	}

}
