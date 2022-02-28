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

public class DataDrivenFrameProgram {
	public void allData() throws IOException   {
		 File f = new File ("C:\\Users\\lenovo\\eclipse-workspace\\MavenProject\\Excel\\dish.xlsx");
	       FileInputStream fis = new FileInputStream(f);
	  	      Workbook we=new XSSFWorkbook(fis);
	  	      Sheet sheetAt = we.getSheetAt(0);
	  	      Row row = sheetAt.getRow(0);
	  	      Cell cell = row.getCell(1);
	  	      CellType celltype = cell.getCellType();
	  	        if (celltype.equals(CellType.NUMERIC)) {
					double ncv = cell.getNumericCellValue();
					System.out.println(ncv);
				}
	  	        else if (celltype.equals(CellType.STRING)) {
	  	        	String scv = cell.getStringCellValue();
					System.out.println(scv);
				}
}
	public static void main(String[] args) throws IOException {
		DataDrivenFrameProgram dd=new DataDrivenFrameProgram();
		dd.allData();
	}

}
