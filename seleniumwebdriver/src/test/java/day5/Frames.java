package day5;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
		// switching to frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Java");
		driver.switchTo().defaultContent();
		
		// switching to frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Python");
		driver.switchTo().defaultContent();
		
		// switching to frame 3   
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Selenium");
		
		//switching to inner frame
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();
		
		//switching to frame 5
		
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@type='text' and @name='mytext5']")).sendKeys("Ruby");
		driver.findElement(By.xpath("//a[@href='https://a9t9.com']")).click();
		
		// //img[@alt='UI Vision by a9t9 software - Image-Driven Automation']
		//img[@src='/Content/Images/ui.vision.logo2.webp']
	//	driver.switchTo().frame(0);
		boolean logo = driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
		System.out.println(logo);
		
	}

}
