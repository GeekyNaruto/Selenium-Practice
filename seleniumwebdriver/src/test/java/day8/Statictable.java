package day8;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Statictable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollBy(0,1200)");
        
       // total no of rows in table
        int r = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("no of rows are: "+r);
        
       // find total no of columns in table
        int c = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
        System.out.println("no of columns are: "+c);
        
        //read data from specific row and column(ex: 5th row and 1st column)
		for(int i=2; i<=r; i++)
		{
			for(int j=1; j<=c; j++)
			{
				driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
			}
		}

	
	
	}

}
