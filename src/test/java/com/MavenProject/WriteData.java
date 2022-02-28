package com.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	private static void writeProgram()  throws IOException {
File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\MavenProject\\Excel\\datadriven.xlsx");
FileInputStream fis=new FileInputStream(f);
Workbook wb=new XSSFWorkbook(fis);
wb.createSheet("datadriven").createRow(0).createCell(0).setCellValue("java");
wb.getSheet("datadriven").getRow(0).createCell(1).setCellValue("sql");
wb.getSheet("datadriven").createRow(1).createCell(0).setCellValue("rdbms");
FileOutputStream fos=new FileOutputStream(f);
wb.write(fos);

	}
	public static void main(String[] args) throws IOException {
		writeProgram();
	}

}
