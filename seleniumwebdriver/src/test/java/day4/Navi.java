package day4;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navi {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
	    Set<String> windowIDs = driver.getWindowHandles();
		
	    //approach 1
	    
	    List<String> windows = new ArrayList(windowIDs);
	    
	    String parentID = windows.get(0);
	    String childID = windows.get(1);
	    
	    System.out.println("parent id is: "+parentID);
	    System.out.println("child id is: "+childID);
	    Thread.sleep(5000);
	    driver.switchTo().window(parentID);

	}

}
