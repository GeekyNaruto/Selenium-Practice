package day10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reision {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Info1");
		
		int total_rows = sheet.getLastRowNum();
		int total_cells = sheet.getRow(0).getLastCellNum();
		
		for(int r=0; r<=total_rows; r++)
		{
			 XSSFRow row = sheet.getRow(r);
			
			for(int c=0; c<total_cells; c++)
			{
				XSSFCell cell = row.getCell(c);
				System.out.print(cell+"\t" );	
			}
			System.out.println();
		}
		workbook.close();
		file.close();
			
	}
	
}
