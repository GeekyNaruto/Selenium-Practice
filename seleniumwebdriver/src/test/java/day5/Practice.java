package day5;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Practice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://in.indeed.com/?r=us");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='css-ng3gx5 e19afand0']")).click();
		driver.findElement(By.xpath("//input[@id='ifl-InputFormField-ihl-useId-passport-webapp-1']")).sendKeys("avadrock.singh@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	driver.findElement(By.xpath("//span[@class='css-1mr6abr e1wnkr790']")).click();
		
		
		

	}

}
