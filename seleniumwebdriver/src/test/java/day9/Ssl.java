package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Ssl {
		ChromeOptions option;
	    WebDriver driver;
	    
	    @Test
		void ssl() throws InterruptedException
		{
	    	option = new ChromeOptions();
	    	option.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(option);
			driver.get("https://expired.badssl.com/");
			Thread.sleep(2000);
		}
	
	}


