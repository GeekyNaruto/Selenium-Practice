package day5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropd = driver.findElement(By.xpath("//select[@id='country']"));
		Select drop = new Select(dropd);
		
		//Selecting valu from the dropdown.
		//drop.selectByIndex(3);
        //drop.selectByVisibleText("France"); 
		//drop.selectByValue("india");
		
		//Printing all values of dropdown
		
		List<WebElement> dropdown_data = drop.getOptions();
		
	/*	for(int i=0; i<dropdown_data.size(); i++)
		{
			String s=dropdown_data.get(i).getText();
			System.out.println(s);
		}  */
		
		for(WebElement dp:dropdown_data)
		{
			System.out.println(dp.getText());
		}
		
	}

}
