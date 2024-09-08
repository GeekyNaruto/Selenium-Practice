package day4;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// specific chekboxes
      /*    driver.findElement(By.xpath("//input[@id='sunday']")).click();
          driver.findElement(By.xpath("//input[@id='wednesday']")).click(); */
        
        //all checkboxes
        List<WebElement> check=driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
        
      /*  for(WebElement checks:check)
        {
        	checks.click();
        }   */
		
		//select last three checkboxes
		
	/*	for(int i=4; i<check.size();i++)
		{
			check.get(i).click();
		}   */
		
		//select first three checkboxes
	/*	for(int i=0; i<3; i++)
		{
			check.get(i).click();
		}
        */
        
      //unselect checkboxes if they are selected
        for(int i=4; i<check.size();i++)
		{
			check.get(i).click();
		} 
        
        for(int i=0;i<check.size();i++)
        {
        	if(check.get(i).isSelected())
        	{
        		check.get(i).click();
        	}
        }
                
	}
}
