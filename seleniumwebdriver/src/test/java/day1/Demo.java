package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/java/java_constructors.asp");
		
		String s = driver.getTitle();
		
		if(s.equals("Java Constructor"))
		{
			System.out.println("Test pass");
		}
		else
			System.out.println("Test Failed");
		  driver.close();
		//driver.quit();
	}

}
