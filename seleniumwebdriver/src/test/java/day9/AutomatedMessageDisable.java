package day9;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class AutomatedMessageDisable {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});

		WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
				
	}

}
