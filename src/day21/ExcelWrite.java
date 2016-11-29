package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("c:\\users\\sai\\desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Row r=null;
		//to write into an existing cell
		r=ws.getRow(0);
		r.getCell(2).setCellValue("ABC");
		
		//to create a cell in an existing row and write into it
		r=ws.getRow(1);
		r.createCell(2).setCellValue("XYZ");
		
		//create a row and a cell and write into it
		r=ws.createRow(3);
		r.createCell(0).setCellValue("DEF");
		
		FileOutputStream f=new FileOutputStream("c:\\users\\sai\\desktop\\Book1.xlsx");
		wb.write(f);
		
		

	}

}
