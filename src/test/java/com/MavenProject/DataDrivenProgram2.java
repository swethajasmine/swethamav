package com.MavenProject;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDrivenProgram2 {
	private static void all_Data() throws IOException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\MavenProject\\Excel\\dish.xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook b =new XSSFWorkbook(fis);
	Sheet sheetAt = b.getSheetAt(0);
	int psh = sheetAt.getPhysicalNumberOfRows();
	for (int i = 0; i < psh; i++) {
		Row row = sheetAt.getRow(i);
		int pnc = row.getPhysicalNumberOfCells();
		for (int j = 0; j < pnc; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			if(cellType.equals(CellType.STRING)) {
			 String mn = cell.getStringCellValue();
			
				System.out.println(mn);
				
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int va=(int) numericCellValue;
				System.out.println(va);
			}
			
		}
		
	}
		

	}
		
public static void main(String[] args) throws IOException {
	all_Data();
}

}
