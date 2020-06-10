package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static String  filePath=System.getProperty("user.dir")+"/testdata/fileTest.xlsx";
     public static Workbook book;
	public static void main(String[] args)   {
		
		try {
			FileInputStream file = new FileInputStream(filePath);
			book=new XSSFWorkbook(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Sheet sheet=book.getSheet("Sheet1");
        String row1Cell1=sheet.getRow(1).getCell(1).toString();
        System.out.println(row1Cell1);
        
       
	}

}
