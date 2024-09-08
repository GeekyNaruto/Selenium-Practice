package day9;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtension {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		
		File file = new File("C:\\Users\\Arvind singh\\OneDrive\\Desktop\\Software TEsting\\SelectorsHub-Chrome-Web-Store.crx");
		option.addExtensions(file); 
		
	    WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com");

	}

}
