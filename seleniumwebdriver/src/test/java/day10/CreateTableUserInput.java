package day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateTableUserInput {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile3.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("demodata");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int total_rows = sc.nextInt();
		System.out.println("Enter no fo cells: ");
		int total_cells = sc.nextInt();
		
		for(int r=0; r<=total_rows; r++)
		{
			XSSFRow row = sheet.createRow(r);
			
			for(int c=0; c<total_cells; c++)
			{
				
				XSSFCell cell = row.createCell(c);
				System.out.print("Enter values for each cell: ");
				cell.setCellValue(sc.next());
			}
			System.out.println();
		}
		workbook.write(file);
		System.out.println("file created");
		sc.close();
       workbook.close();
       file.close();
	}

}
