package com.adivaclm.Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {

	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
		
	}
	
	public String getExcelData(String sheetName,int row,int cell) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/data/testscript.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	public void setExcelData(String sheetName,int row,int cell,String data) throws IOException
	{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
		 FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
		 wb.write(fos);
		 
	}
}
