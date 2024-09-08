package day7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class MOuseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        WebElement ele = driver.findElement(By.xpath("//button[@id='products-dd-toggle']"));
        Actions ac = new Actions(driver);
        ac.moveToElement(ele).build().perform();
        
        WebElement ele1 = driver.findElement(By.xpath("//div[normalize-space()='Real device automation cloud']"));
        ac.moveToElement(ele1);
        ac.click().build().perform();
	}

}
