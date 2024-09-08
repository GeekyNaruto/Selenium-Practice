package day10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int total_row = sheet.getLastRowNum();
		
		int total_cell = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total row no is: "+total_row+"\t"+"Total no of Cells are: "+total_cell);
		
		for(int r=0; r<=total_row; r++)
		{
			XSSFRow row = sheet.getRow(r);
			System.out.println();
			
			for(int c=0; c<total_cell; c++)
			{
				System.out.print(row.getCell(c)+"\t");
			}
			System.out.println();
		}

		workbook.close();
		file.close();
	}
 
	
}
