package com.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.BaseClass.BaseClass;

public class Excelutils extends BaseClass {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet ;
	
	
	public Excelutils(String excelpath,String sheetname) {

		try {
		workbook = new XSSFWorkbook(excelpath);
		sheet =workbook.getSheet(sheetname);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}
	
	
	public static int getRowCount() {
		int rowCount=0;
		try {
		
			rowCount = sheet.getPhysicalNumberOfRows();
			//System.out.println(rowCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowCount;


	}


	public static int getcolCount() {
		int colCount=0;
		try {
		
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println(rowCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colCount;


	}
	public static String getstringCellData(int rownum, int cellnum) {
		String cellData =null;
		try {
			
		 cellData =sheet.getRow(rownum).getCell(cellnum).getStringCellValue();

		//	System.out.println(cellData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cellData;
	}

	public static void getnumericCellData(int rownum, int cellnum) {
		try {
			String cellData =sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
			System.out.println(cellData);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
	
		
	}
	


