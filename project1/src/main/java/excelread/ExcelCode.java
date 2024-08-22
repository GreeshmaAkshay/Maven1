package excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	public static FileInputStream f;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static String getStringData(int i, int j) throws IOException 
	{
		f=new FileInputStream("C:\\Users\\GREESHMA GB\\git\\Maven1\\project1\\src\\main\\resources\\TestData.xlsx");
		wb= new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		Row r= sh.getRow(i);
		Cell c= r.getCell(j);
		return c.getStringCellValue();
	}
	public static String getIntegerData(int i, int j) throws IOException 
	{
		f=new FileInputStream("C:\\Users\\GREESHMA GB\\git\\Maven1\\project1\\src\\main\\resources\\TestData.xlsx");
		wb= new XSSFWorkbook(f);
		sh = wb.getSheet("Sheet1");
		Row r= sh.getRow(i);
		Cell c= r.getCell(j);
		int x= (int) c.getNumericCellValue();
		return String.valueOf(x);
	}
}