package com.cjc.mavenDemo.MavenEx;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {
	 XSSFWorkbook wb;
	   XSSFSheet sheet;
		public void exceldata(String file) throws IOException
		{
			FileInputStream fis= new FileInputStream(file);
			wb= new XSSFWorkbook(fis);
			
			
		}
		 public int getrowcount(String sheetname)
		 {
			 sheet=wb.getSheet(sheetname);
			 int rows=sheet.getLastRowNum();
			 int rowscount=rows+1;
			 
			 return rowscount;
		 }
		 public int getcolumncount(String sheetname)
		 {
			 sheet=wb.getSheet(sheetname);
			 int rows1=sheet.getLastRowNum();
			 int columns=sheet.getRow(rows1).getLastCellNum();
			 return columns;
		 }
		 public String getdata(String sheetname, int rows, int columns)
		 {
			 DataFormatter format=new DataFormatter();
			 sheet=wb.getSheet(sheetname);
		//	String x= format.formatCellValue(sheet.getRow(rows).getLastCellNum());
			 String val=sheet.getRow(rows).getCell(columns).getStringCellValue();
			 
			 return val;
		 }

	}


