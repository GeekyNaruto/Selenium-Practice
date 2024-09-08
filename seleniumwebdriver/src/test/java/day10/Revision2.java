package day10;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Revision2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile2.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("demodata");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("101");
		row1.createCell(1).setCellValue("Rishi");
		row1.createCell(2).setCellValue("HR");
		row1.createCell(3).setCellValue("25000");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("102");
		row2.createCell(1).setCellValue("Kishor");
		row2.createCell(2).setCellValue("HR");
		row2.createCell(3).setCellValue("28000");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("103");
		row3.createCell(1).setCellValue("Kashish");
		row3.createCell(2).setCellValue("HR");
		row3.createCell(3).setCellValue("22000");
		
		XSSFRow row4 = sheet.createRow(3);
		row4.createCell(0).setCellValue("104");
		row4.createCell(1).setCellValue("Harsh");
		row4.createCell(2).setCellValue("HR");
		row4.createCell(3).setCellValue("29000");
		
		System.out.println("File created succesfully");
		
		workbook.write(file);
		workbook.close();
		file.close();
			
	}

}
