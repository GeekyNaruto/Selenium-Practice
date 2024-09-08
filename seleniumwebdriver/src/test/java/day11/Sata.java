package day11;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sata {

	public static Object[][] exceltestdata(String sheetname)
	{
		XSSFWorkbook workbook=null;
		File file = new File(System.getProperty("user.dir"+"\\src\\test\\java\\day11\\data1.xlsx"));
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
				   
				    case STRING: data[i][j]= cell.getStringCellValue();
				    case NUMERIC: data[i][j] = Integer.toString((int)cell.getNumericCellValue());
				    case BOOLEAN: data[i][j] = cell.getBooleanCellValue();
				}
				
			}
		}
		return data;
		
	}
}
