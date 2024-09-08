package day11;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@AfterMethod
	public void tearoff()
	{
		driver.quit();
	}
	
	@Test(dataProvider="dp")
	public void login(String email,String password)
	{
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Edit your account information']")).isDisplayed());
	}
	
	//without excel file
	/*@DataProvider(name="dp")
	public Object[][] testdata()
	{
		Object[][] data = {
				{"amotooricap9@gmail.com","12345"},
				{"amotooricap1@gmail.com","12345"},
				{"amotooricap3@gmail.com","12345"}
				
		};
		return data;
	}*/
	@DataProvider(name="dp")
	public Object[][] testdata()
	{
		Object[][] data = exceltestdata("Login");
		return data;
	}
	
	public Object[][] exceltestdata(String sheetname)
	{
		XSSFWorkbook workbook=null;
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\java\\day11\\data1.xlsx");
		try {
		FileInputStream fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		
		XSSFSheet sheet = workbook.getSheet(sheetname);
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		Object data[][] = new Object[rows][cols];
		
		for(int i=0; i<rows;i++)
		{
			XSSFRow row = sheet.getRow(i+1);
			
			for(int j=0; j<cols;j++)
			{
				XSSFCell cell = row.getCell(j);
				CellType celltype = cell.getCellType();
				
				switch(celltype) {
				   
				    case STRING: data[i][j]= cell.getStringCellValue();break;
				    case NUMERIC: data[i][j] = Integer.toString((int)cell.getNumericCellValue());break;
				    case BOOLEAN: data[i][j] = cell.getBooleanCellValue();break;
				}
				
			}
		}
		return data;
		
	}
	
}
