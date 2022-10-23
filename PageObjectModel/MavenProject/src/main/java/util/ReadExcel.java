package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readData(String fileName) throws IOException {
	      //Set  the path
			XSSFWorkbook wbook=new XSSFWorkbook("Data/"+fileName+".xlsx");
			//Open the sheet
			XSSFSheet sheet=wbook.getSheetAt(0);//read the first sheet
			//Row count
			int rowCount = sheet.getLastRowNum(); //ctrl+2+l
			//column count
			short columnCount = sheet.getRow(0).getLastCellNum();  //ctrl+2+l
			//data[][]
			String[][] data=new String[rowCount][columnCount];
			
			//get row value outer loop
			for (int i = 1; i <=rowCount ; i++) {
			XSSFRow row = sheet.getRow(i);//ctrl+2+l
			//column count inner loop
			for (int j = 0; j <columnCount ; j++) {
			XSSFCell cell = row.getCell(j);//1 0
			//System.out.println(cell.getStringCellValue());
			data[i-1][j]=cell.getStringCellValue();
				}
				
			}
			//to close the workbook
			wbook.close();
			return data;
}
}