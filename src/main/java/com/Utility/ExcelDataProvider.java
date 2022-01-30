package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() throws Exception {
		String path=System.getProperty("user.dir")+"\\TestData\\DataFile.xlsx";
		File data=new File(path);
		FileInputStream excel=new FileInputStream(data);
		wb=new XSSFWorkbook(excel);
	}
	
	public String getStringData(String Sheet, int row, int cell) {
		return wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
	}
	
	public String getNumericData(String Sheet, int row, int cell) {
		double cellvalue=wb.getSheet(Sheet).getRow(row).getCell(cell).getNumericCellValue();
		String dataString=String.format("%.0f", cellvalue);
		return dataString;
	}

}
