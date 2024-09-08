package day6;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(@class,'multiselect-selected-text')]")).click();
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//label"));
		
	/*	for(WebElement op:options)
		{
			System.out.println("All options are: "+op.getText());
		}   */
		
		for(WebElement op:options)
		{
			if((op.getText().equals("Java"))||op.getText().equals("HTML") || op.getText().equals("CSS")|| op.getText().equals("MySQL"))
               {
            	   op.click();
	           }
		}
		

	}

}
