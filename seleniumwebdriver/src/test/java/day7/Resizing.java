package day7;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Resizing {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
   //set dimension
		Dimension dim =new Dimension(300, 400);
		driver.manage().window().setSize(dim);
		
	//set positon	
		Point p = new Point(300,50);
		driver.manage().window().setPosition(p);    
		
	//scrolling	
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	//	js.executeScript("window.scrollBy(200,100)");
		js.executeScript("window.scrollBy(0,100)");
		
		//screenshot
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File(("C:\\Users\\Arvind singh\\OneDrive\\Desktop\\ss\\firstimg.png")));
	}

}
