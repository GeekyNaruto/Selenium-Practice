package day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Getmeth {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.automationtesting.in/Register.html");
		
        driver.manage().window().maximize();
        
        System.out.println(driver.getTitle());
        
        System.out.println(driver.getCurrentUrl());
        
   //     System.out.println(driver.getPageSource());
        
        driver.get("https://demo.automationtesting.in/Register.html");
        
        

	}

}
