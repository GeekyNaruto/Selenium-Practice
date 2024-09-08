package day8;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//single ss
/*		TakesScreenshot ts = (TakesScreenshot)driver;
        File source_file =ts.getScreenshotAs(OutputType.FILE);
		File target_file = new File("C:\\Users\\Arvind singh\\eclipse-workspace\\seleniumwebdriver\\SS\\first.png");
		source_file.renameTo(target_file);
	*/
		
		// specific webelement
		File source_file = driver.findElement(By.xpath("//h2[normalize-space()='Web Table']")).getScreenshotAs(OutputType.FILE);
		File target_file = new File(System.getProperty("user.dir")+"\\SS\\second.png");
		source_file.renameTo(target_file);
		
		
	}

}
