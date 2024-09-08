package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
// OrangeHRM  -- title


public class Demo1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String s = driver.getTitle(); 
				
		if(s.equals("OrangeHRM"))
		{
			System.out.println("Test Pass");
		}
		else
			System.out.println("Test Fail");
		driver.close();
	}
	

}
