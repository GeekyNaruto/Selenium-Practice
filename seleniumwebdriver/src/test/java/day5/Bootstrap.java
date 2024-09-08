package day5;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//selecting the dropbox
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		
		//printing all options
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	/*	for(WebElement op:options)
		{
			System.out.println(op.getText());
		}  */

		//selecting option
	/*	driver.findElement(By.xpath("//input[@value='Java']")).click();
		driver.findElement(By.xpath("//input[@value='MySQL']")).click();
		driver.findElement(By.xpath("//input[@value='HTML']")).click();
		driver.findElement(By.xpath("//input[@value='CSS']")).click();  */
		
		//selecting multiple options
	
		for(WebElement op:options)
		{
			if(op.getText().equals("Java") || op.getText().equals("MySQL"))
			{
				op.click();
			}
		}
	}

}
